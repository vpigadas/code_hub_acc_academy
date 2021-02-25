package com.codehub.academy.shared_preference;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {

    @Insert
    void insert(UserEntity entity);

//    void insert(UserEntity... entities);

    @Insert
    void insert(UserEntity[] entities);

    @Delete
    void delete(UserEntity entity);

    @Query("SELECT * FROM userentity")
    List<UserEntity> getEntity();

    @Query("SELECT * FROM userentity")
    LiveData<List<UserEntity>> getEntityAsync();

    @Query("SELECT * FROM userentity LIMIT 1")
    UserEntity getFirstEntity();

    @Query("SELECT * FROM userentity WHERE user_id=:id")
    UserEntity getFirstEntity(int id);
}
