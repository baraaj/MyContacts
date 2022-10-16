package issat.baraa.mes_contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Ajout extends AppCompatActivity {
    Button btn_confirm,btn_cancel;
    EditText edname,edlastn,edphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout);
        btn_confirm=findViewById(R.id.btn_confirm_add);
        btn_cancel=findViewById(R.id.btn_cancel_add);
        edname=findViewById(R.id.ed_name_add);
        edlastn=findViewById(R.id.ed_ln_add);
        edphone=findViewById(R.id.ed_tel_add);
        btn_confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=edname.getText().toString();
                String lastname=edlastn.getText().toString();
                String phone=edphone.getText().toString();

                Home.data.add(new Contact(name,lastname,phone));
               // Toast
                Toast.makeText(Ajout.this, "Added successfully", Toast.LENGTH_SHORT).show();

            }
        });
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}