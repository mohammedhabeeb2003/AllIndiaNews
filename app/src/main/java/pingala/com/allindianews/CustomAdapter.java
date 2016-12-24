package pingala.com.allindianews;

/**
 * Created by Habeeb on 12/23/2016.
 */

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Habeeb on 12/6/2016.
 */

public class CustomAdapter extends ArrayAdapter {

    Context context;
    int resource;
    ArrayList<LangaugeList> countrylist;
    LayoutInflater li;
    ViewHolder holder;
    public CustomAdapter(Context context, int resource,ArrayList<LangaugeList> object) {
        super(context, resource,object);

        this.context =context;
        this.resource=resource;
        countrylist = object;
        li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);




    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if(v==null){
            holder = new ViewHolder();
            v = li.inflate(resource,null);

            holder.tv = (TextView)v.findViewById(R.id.textView3);


            v.setTag(holder);
        }
        else{

            holder = (ViewHolder)v.getTag();

        }


        holder.tv.setText(countrylist.get(position).getLanguage());



        return v;

    }

    public class ViewHolder{


        TextView tv;


    }


}
