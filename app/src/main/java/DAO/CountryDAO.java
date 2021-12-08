package DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import Entidades.Country;

@Dao
public interface CountryDAO {

    //Altas
    @Insert
    public void añadirCountry(Country c);

    //Bajas
    @Query("DELETE FROM Country WHERE idCountry = :id")
    public void eliminarCountry(String id);

    //Cambios
    @Query("UPDATE Country SET country= :co, lastUpdate= :lu")
    public void actualizarCountry(String co, String lu);

    //Consultas

}
