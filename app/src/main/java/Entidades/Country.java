package Entidades;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Country {
    @NonNull
    @PrimaryKey
    private int idCountry;

    @NonNull
    @ColumnInfo(name = "country")
    private String country;

    @NonNull
    @ColumnInfo(name = "lastUpdate")
    private String last_update;

    public Country(int idCountry, @NonNull String country, @NonNull String last_update) {
        this.idCountry = idCountry;
        this.country = country;
        this.last_update = last_update;
    }

    public int getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(int idCountry) {
        this.idCountry = idCountry;
    }

    @NonNull
    public String getCountry() {
        return country;
    }

    public void setCountry(@NonNull String country) {
        this.country = country;
    }

    @NonNull
    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(@NonNull String last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "Country{" +
                "idCountry=" + idCountry +
                ", country='" + country + '\'' +
                ", last_update='" + last_update + '\'' +
                '}';
    }
}
