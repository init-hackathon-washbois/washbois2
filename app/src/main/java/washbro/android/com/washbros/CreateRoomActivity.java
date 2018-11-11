package washbro.android.com.washbros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateRoomActivity extends AppCompatActivity {
    private EditText editDryerNumber, editRoomLocation, editWasherNumber;
    private Button btnCreateRoom;
    DatabaseReference mRoom;
    Washer washer1,washer2,washer3,washer4,washer5,washer6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_room);




        editDryerNumber = findViewById(R.id.text_dryer_number);
        editWasherNumber = findViewById(R.id.text_washer_number);
        editRoomLocation = findViewById(R.id.text_room_location);
        btnCreateRoom = findViewById(R.id.btnCreateRoom);
        mRoom = FirebaseDatabase.getInstance().getReference("Rooms");
        String dryers = editDryerNumber.getText().toString();
        String washers = editDryerNumber.getText().toString();
        String location = editDryerNumber.getText().toString();



    }
}
