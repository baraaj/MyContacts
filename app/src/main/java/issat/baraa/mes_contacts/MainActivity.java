package issat.baraa.mes_contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //declaration des composantes
      Button btn_qte,btn_val;
      EditText edemail,edmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mettre un fichier sur l'ecran
        setContentView(R.layout.activity_main);
        //recuperation des composantes
        btn_qte=findViewById(R.id.btn_qte_auth);
        btn_val=findViewById(R.id.btn_val_auth);
        edemail=findViewById(R.id.ed_email_auth);
        edmp=findViewById(R.id.ed_mp_auth);
        btn_qte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        btn_val.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=edemail.getText().toString();
                String mp=edmp.getText().toString();
                if(email.equalsIgnoreCase("qwer")&& mp.equals("000")){
                   /*
                    Internet i=new Internet (Intent.ACTION_DIAL);
                    i.setData(Uri.parse(("tel:2222222")));
                    startActivity(i);
                    */
                    Intent i=new Intent(MainActivity.this,Home.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}