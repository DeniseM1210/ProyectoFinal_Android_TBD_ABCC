package BaseDatos;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import DAO.CountryDAO;
import Entidades.Country;

@Database(entities = {Country.class}, version = 1, exportSchema = false)
public abstract class SakilaBD extends RoomDatabase{
    public abstract CountryDAO countryDAO();

    private static SakilaBD INSTANCE;

    public static SakilaBD getAppDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    SakilaBD.class, "@sakila").build();
        }
        return INSTANCE;
    }

    public static void destroyInstance(){ INSTANCE = null; }

}
