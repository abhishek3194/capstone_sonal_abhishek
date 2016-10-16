package example.com.bottombar2;


import android.app.FragmentManager;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class changePassword extends AppCompatActivity {

    private EditText oldPassword;
    private EditText newPassword;
    private EditText confirmPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);

        final Button button = (Button) findViewById(R.id.change_password);
        assert button != null;
        oldPassword      =  (EditText) findViewById(R.id.old_password);
        newPassword      =  (EditText) findViewById(R.id.new_password);
        confirmPassword  =  (EditText) findViewById(R.id.confirm_password);


        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                String oldPassString =  oldPassword.getText().toString();
                String newPassString =  newPassword.getText().toString();
                String conPassString =  confirmPassword.getText().toString();

                //code to check all edit texts are not NULL

                if(oldPassString.matches("") || newPassString.matches("") || conPassString.matches(""))
                {
                    Log.e("changePasssword","Empty fileds");
                    Toast.makeText(changePassword.this , "All fileds mandatory" ,Toast.LENGTH_SHORT ).show();
                }
                // Add code to check that old password is same from the dabatabse
                else
                {
                    Log.e("changePasssword","fields filled");
                    if(newPassString.matches(conPassString))
                    {
                        Log.e("changePasssword","password changed");
                        Toast.makeText(changePassword.this , "Password Changed" ,Toast.LENGTH_SHORT ).show();

//                        profileFragment fragmentS1 = new profileFragment();
//                        getSupportFragmentManager().beginTransaction().replace(R.id.changePassword, fragmentS1).commit();


//                        Intent i = new Intent(changePassword.this,profileFragment.class);
//                        startActivity(i);
                    }
                    else
                    {
                        Log.e("changePasssword","password mismatch");
                        Toast.makeText(changePassword.this , "New Password Fields Mismatch" ,Toast.LENGTH_SHORT ).show();
                    }
                }

            }
        });
    }

}

