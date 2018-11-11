package washbro.android.com.washbros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private Button btnToRoom, btnToCreate;
    private EditText editTextRoomId;
    private FirebaseAuth mAuth;
    DatabaseReference mRooms;
    DatabaseReference mUsers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnToRoom = findViewById(R.id.btnGoToRoom);
        btnToCreate = findViewById(R.id.btnGoToCreate);
        editTextRoomId = findViewById(R.id.editTextRoomId);
        mRooms = FirebaseDatabase.getInstance().getReference("Rooms");
        mUsers = FirebaseDatabase.getInstance().getReference("Users");
        final String roomID =editTextRoomId.getText().toString();
        btnToRoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(roomID.equals("")){
                    Toast.makeText(MainActivity.this, "Enter a Room ID", Toast.LENGTH_SHORT).show();
                    return;
                }
                mRooms.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        for(DataSnapshot roomsnapshot: dataSnapshot.getChildren()){
                            if(roomID == roomsnapshot.toString()){
                                mUsers.addValueEventListener(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(DataSnapshot allSnapshot) {
                                        for(DataSnapshot usersnapshot: allSnapshot.getChildren()){
                                            if(usersnapshot.toString().equals(mAuth.getCurrentUser().getUid())){
                                            }
                                        }
                                    }

                                    @Override
                                    public void onCancelled(DatabaseError databaseError) {

                                    }
                                });
                            }
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            }
        });
        btnToCreate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CreateRoomActivity.class);
                startActivity(intent);
                finish();
            }
        });




    }
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();


    }
}
