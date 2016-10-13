package example.com.bottombar2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by abhishek on 29-09-2016.
 */
public class cameraFragment extends Fragment{

   // @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("Camera","Hi");
       View v = inflater.inflate(R.layout.camera , container , false);
        return v;
    }
}
