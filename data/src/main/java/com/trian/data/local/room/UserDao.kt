package com.trian.data.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.trian.domain.entities.Users

@Dao
interface UserDao {
    @Query("SELECT * FROM tb_users")
    suspend fun getAll():List<Users>

    @Insert
    suspend fun insert(users:List<Users>)
}