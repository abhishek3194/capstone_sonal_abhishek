package example.com.bottombar2;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity {

    BottomBar mBottomBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomBar = BottomBar.attach(this,savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.menu, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                if(menuItemId==R.id.Bottombaritemone)
                {
                    homeFragment abc = new homeFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame ,abc).commit();
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
        mBottomBar.mapColorForTab(0,"#1f6389");
        mBottomBar.mapColorForTab(1,"#49E9BD");
        mBottomBar.mapColorForTab(2,"#000000");
        mBottomBar.mapColorForTab(3,"#0d5b59");
        mBottomBar.mapColorForTab(4,"#ab0f2a");

        BottomBarBadge unread;
        unread = mBottomBar.makeBadgeForTabAt(3,"#FF0000" , 13);
        unread.show();

    }


}
