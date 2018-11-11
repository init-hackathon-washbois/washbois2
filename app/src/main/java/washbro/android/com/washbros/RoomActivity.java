package washbro.android.com.washbros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RoomActivity extends AppCompatActivity {

    Button washer1,washer2,washer3,dryer1,dryer2,dryer3;
    DatabaseReference mRoom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        washer1 = findViewById(R.id.washer1);
        washer2 = findViewById(R.id.washer2);
        washer3 = findViewById(R.id.washer3);
        dryer1 = findViewById(R.id.dryer1);
        dryer2 = findViewById(R.id.dryer2);
        dryer3 = findViewById(R.id.dryer3);


        mRoom = FirebaseDatabase.getInstance().getReference("Room");



       washer1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });

    }
}
