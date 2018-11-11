package washbro.android.com.washbros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreateRoomActivity extends AppCompatActivity {
    private EditText editDryerNumber, editRoomLocation, editWasherNumber;
    private Button btnCreateRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_room);

        
    }
}
