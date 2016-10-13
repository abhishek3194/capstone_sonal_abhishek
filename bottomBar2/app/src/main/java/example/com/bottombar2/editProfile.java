package example.com.bottombar2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class editProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("i am  inEdit Profile","Hi");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);
    }
}
