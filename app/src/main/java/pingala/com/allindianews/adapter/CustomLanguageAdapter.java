package pingala.com.allindianews.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import pingala.com.allindianews.R;
import pingala.com.allindianews.custom_view.ListOfLanguage;

/**
 * Created by Habeeb on 12/29/2016.
 */


public class CustomLanguageAdapter extends ArrayAdapter {

    List<ListOfLanguage> languageList;
    Context context;
    int resource;
    LayoutInflater layoutInflater;
    ViewHolder holder;
    public CustomLanguageAdapter(Context context, int resource,List<ListOfLanguage> languageList) {
        super(context, resource,languageList);
        this.context=context;
        this.languageList = languageList;
        this.resource = resource;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        holder = new ViewHolder();
       if(v==null){
          v = layoutInflater.inflate(resource,null);
           holder.tv_language = (TextView)v.findViewById(R.id.tv_language);
           holder.img_langauge = (ImageView)v.findViewById(R.id.img_language);
           v.setTag(holder);
       }
        else{

           holder = (ViewHolder)v.getTag();

       }
        holder.tv_language.setText(languageList.get(position).getName());
        Picasso.with(context).load(languageList.get(position).getImage()).into(holder.img_langauge);
        return v;
    }

    static class ViewHolder{

        ImageView img_langauge;
        TextView tv_language;

    }
}
