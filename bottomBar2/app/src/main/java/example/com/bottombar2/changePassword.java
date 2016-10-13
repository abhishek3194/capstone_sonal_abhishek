package example.com.bottombar2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class changePassword extends AppCompatActivity {

    private EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        final Button button = (Button) findViewById(R.id.change_password);
        assert button != null;
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                edittext = (EditText) findViewById(R.id.old_password);
                Toast.makeText(changePassword.this,
                        edittext.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }

}

