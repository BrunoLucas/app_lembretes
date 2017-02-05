package lembretes.rukaso.com.br.lembretes.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

import lembretes.rukaso.com.br.lembretes.model.Lembrete;
import lembretes.rukaso.com.br.lembretes.util.Constants;

/**
 * Created by lucas on 05/02/17.
 */

public class LembreteDao extends SQLiteOpenHelper {



    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "lembretes.db";

    public LembreteDao(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE LEMBRETE       ");
        sql.append(" ( _ID INTEGER PRIMARY KEY, ");
        sql.append("    TITULO TEXT,            ");
        sql.append("    DESCRICAO TEXT          ");
        sql.append(" )                          ");

        db.execSQL(sql.toString());
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public boolean inserirLembrete(Lembrete lembrete){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(Constants.COLUNA_TITULO, lembrete.getTitulo());
        contentValues.put(Constants.COLUNA_DESCRICAO, lembrete.getDescricao());

        return (db.insert(Constants.TABELA_LEMBRETE, null, contentValues) > 0);

    }

//    public Cursor query(String table, String[] columns, String selection,
//                        String[] selectionArgs, String groupBy, String having,
//                        String orderBy) {

        public Cursor listarLembretes(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query( Constants.TABELA_LEMBRETE,
                new String[]{Constants.COLUNA_ID, Constants.COLUNA_TITULO, Constants.COLUNA_DESCRICAO},
                null,
                null,
                null,
                null,
                null);

        return cursor;
    }

}
