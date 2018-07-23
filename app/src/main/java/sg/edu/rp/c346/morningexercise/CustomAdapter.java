package sg.edu.rp.c346.morningexercise;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16043971 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter{

    Context parent_context;
    int layout_id;
    ArrayList<ContactList> contactLists;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ContactList> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactLists = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
            convertView = inflater.inflate(layout_id,parent,false);
        }

        TextView tvName = convertView.findViewById(R.id.textViewName);
        TextView tvCode = convertView.findViewById(R.id.textViewCode);
        TextView tvNumber = convertView.findViewById(R.id.textViewNumber);
        ContactList currentItem = contactLists.get(position);
        tvName.setText(currentItem.getName());
        tvCode.setText(currentItem.getCode());
        tvNumber.setText(currentItem.getNumber()+"");
        return convertView;
    }
}
