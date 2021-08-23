package com.trian.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.trian.domain.entities.Users

@Database(
    entities = [Users::class],
    version = 1,
    exportSchema = false
)
abstract class CexupDatabase :RoomDatabase(){
    abstract fun userDao():UserDao
    companion object{
        const val DATABASE_NAME = "cexup_db"
    }
}