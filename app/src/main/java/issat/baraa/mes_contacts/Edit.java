package issat.baraa.mes_contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class Edit extends AppCompatActivity {
    EditText edsearch;
    ListView lvedit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        edsearch=findViewById(R.id.ed_edit_search);
        lvedit=findViewById(R.id.lv_edit);
        //adapter creer view dans list view
      /*  ArrayAdapter ad=new ArrayAdapter(Edit.this, android.R.layout.simple_list_item_1,Home.data);
        lvedit.setAdapter(ad);
        edsearch.addTextChangedListener(
                new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                    }

                    @Override
                    public void afterTextChanged(Editable editable) {

                    }
                }
        );  */
        MyListViewAdapter ad=new MyListViewAdapter(Edit.this,Home.data);
        lvedit.setAdapter(ad);
    }
}