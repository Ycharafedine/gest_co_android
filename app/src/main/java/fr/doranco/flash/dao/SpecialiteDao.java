package fr.doranco.flash.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RoomDatabase;
import androidx.room.Update;

import java.util.List;

import fr.doranco.flash.entity.Specialite;

@Dao
public interface SpecialiteDao {
    /**
     * enregistrer une nouvelle specialite en bd
     * @param specialite  le nouvel objet a enregistrer
     */
    @Insert
     void create(Specialite specialite);

    /**
     * Chercher une Specialite
     * @param id
     * @return
     */
    @Query("SELECT * FROM specialites WHERE id = :id")
    Specialite findById (int id);

    /**
     * lister toutes les specialites
     * @return
     */
    @Query("SELECT * FROM specialites")
    List<Specialite> readAll();

    /**
     * Update une ancienne specialite
     * @param specialite
     */
    @Update
    void update(Specialite specialite);

    /**
     * Supprimer une Specialite
     * @param specialite
     */
    @Delete
    void delete (Specialite specialite);
}
