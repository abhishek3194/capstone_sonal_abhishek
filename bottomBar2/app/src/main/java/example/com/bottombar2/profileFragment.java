package example.com.bottombar2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by abhishek on 29-09-2016.
 */


public class profileFragment extends Fragment {
    //@Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.profile , container , false);
        TextView post =(TextView) v.findViewById(R.id.posts);
        TextView noOfPosts =(TextView) v.findViewById(R.id.noOfPosts);
        post.setText("18");
        noOfPosts.setText("posts");
        setHasOptionsMenu(true);
        return v;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        // TODO Add your menu entries here

        inflater.inflate(R.menu.profilemenu, menu);
        super.onCreateOptionsMenu(menu, inflater);
//        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()) {
            case R.id.editProfile:
//                Intent intent = new Intent(Intent.ACTION_SEND);
                Intent intent = new Intent(getContext(), editProfile.class);
                startActivity(intent);
                return true;
            case R.id.changePassword:
                Intent intent2 = new Intent(getContext(), changePassword.class);
//                Intent intent2 = new Intent(Intent.ACTION_SEND);
                Log.e(intent2.toString(),"hi i am in changePassword waiting for intent");
                startActivity(intent2);
                return true;
            case R.id.faqs:
                Intent intent3 = new Intent(getContext(), faqs.class);
//                Intent intent3 = new Intent(Intent.ACTION_SEND);
                startActivity(intent3);
                return true;
            case R.id.termsOfService:
                Intent intent4 = new Intent(getContext(), termsOfService.class);
//                Intent intent4 = new Intent(Intent.ACTION_SEND);
                startActivity(intent4);
                return true;
            case R.id.logout:
                Intent intent5 = new Intent(getContext(), logout.class);
//                Intent intent5 = new Intent(Intent.ACTION_SEND);
                startActivity(intent5);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }


    }
