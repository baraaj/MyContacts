package issat.baraa.mes_contacts;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class ContactHelper extends SQLiteOpenHelper {

    public static final String table_contacts="Contacts";
    public static final String col_id="ID";
    public static final String col_name="Name";
    public static final String col_lastname="Surname";
    public static final String col_phone="Phone";
    String req="create table "+table_contacts+" ("+col_id+" Integer Primary key Autoincrement,"
            +col_name+ "Text not null,"+col_lastname+ "Text not null,"+col_phone+ "Text not null)";

    public ContactHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //Lors d'ouverture  de la base
        db.execSQL(req);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        //modification de la version
        db.execSQL(" drop table "+table_contacts);
        onCreate(db);

    }
}
