package example.com.bottombar2;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity {

    BottomBar mBottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Click For Change");
        mBottomBar = BottomBar.attach(this,savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                if(menuItemId==R.id.Bottombaritemone)
                {
                        homeFragment f = new homeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame ,f).commit();
                }
                else
                {
                    if(menuItemId==R.id.Bottombaritemtwo)
                    {
                        uploadFragment f = new uploadFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.frame ,f).commit();
                    }
                    else
                    {
                        if(menuItemId==R.id.Bottombaritemthree)
                        {

                            cameraFragment f = new cameraFragment();
                            getSupportFragmentManager().beginTransaction().replace(R.id.frame ,f).commit();
                        }
                        else
                        {
                            if(menuItemId==R.id.Bottombaritemfour)
                            {
                                notificationFragment f = new notificationFragment();
                                getSupportFragmentManager().beginTransaction().replace(R.id.frame ,f).commit();
                            }
                            else
                            {
                                if(menuItemId==R.id.Bottombaritemfive)
                                {
                                    profileFragment f = new profileFragment();
                                    getSupportFragmentManager().beginTransaction().replace(R.id.frame ,f).commit();
                                }

                            }
                        }
                    }
                }






            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {
            }
        });
        mBottomBar.mapColorForTab(0,"#616161");
        mBottomBar.mapColorForTab(1,"#616161");
        mBottomBar.mapColorForTab(2,"#616161");
        mBottomBar.mapColorForTab(3,"#616161");
        mBottomBar.mapColorForTab(4,"#616161");

        BottomBarBadge unread;
        unread = mBottomBar.makeBadgeForTabAt(3,"#2196F3" , 13);
        unread.show();

    }


    public void openEditProfile(View view)
    {
        Intent intent = new Intent(this, editProfile.class);
        startActivity(intent);
    }
}
