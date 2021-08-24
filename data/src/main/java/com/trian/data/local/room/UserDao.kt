package com.trian.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.trian.domain.entities.User

@Dao
interface UserDao {
    @Query("SELECT * FROM tb_users")
    suspend fun getAll():List<User>

    @Insert
    suspend fun insert(users:List<User>)
}