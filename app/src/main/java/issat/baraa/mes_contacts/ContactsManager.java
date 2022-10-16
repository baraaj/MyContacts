package issat.baraa.mes_contacts;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ContactsManager {
    SQLiteDatabase db=null;
    Context con;
    ContactsManager(Context con){
        this.con=con;
    }
    public void ouvrir(){
       ContactHelper helper=new  ContactHelper(con,"mabase.db",null,1);
       db=helper.getWritableDatabase();
    }
    public void ajout(){
        db.insert()
    }
    public void supprimer(){

    }
    public void fermer(){

    }

}
