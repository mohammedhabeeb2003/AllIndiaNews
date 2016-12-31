package pingala.com.allindianews.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pingala.com.allindianews.R;



public class PhotosFragment2 extends Fragment {

    TextView tv;
    String mParam1="";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_photo_fragment2, container, false);
        tv = (TextView)v.findViewById(R.id.frag_photo2);
        mParam1 = getArguments().getString("Text3");
        Log.e("mpharms",""+mParam1);
            tv.setText(mParam1);

        return v;
    }


}
