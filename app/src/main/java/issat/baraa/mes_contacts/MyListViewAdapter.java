package issat.baraa.mes_contacts;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyListViewAdapter extends BaseAdapter {
    Context con;
    ArrayList<Contact> data;

    public MyListViewAdapter(Context con, ArrayList<Contact> data) {
        this.con = con;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //creation d'un view
        LayoutInflater inf=LayoutInflater.from(con);
        View v=inf.inflate(R.layout.view_contact,null);

        //recuperer les holders
        TextView tvnom=v.findViewById(R.id.tvnom_contact);
        TextView tvprenom=v.findViewById(R.id.tvprenom_contact);
        TextView tvnum=v.findViewById(R.id.tvnum_contact);
        ImageView img_del=v.findViewById(R.id.imageView_delete_contact);
        ImageView img_edit=v.findViewById(R.id.imageView_edit_contact);
        ImageView img_call=v.findViewById(R.id.imageView_call_contact);

        //Affectation des holders
        Contact c= data.get(i);
        tvnom.setText(c.name);
        tvprenom.setText(c.lastname);
        tvnum.setText(c.phone);
      img_del.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              data.remove(i);
              notifyDataSetChanged();
          }
      });
      img_call.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent i=new Intent(Intent.ACTION_DIAL);
              i.setData(Uri.parse(("tel:"+c.phone)));
              con.startActivity(i);
          }
      });
      img_edit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

          }
      });
        return v;
    }
}
