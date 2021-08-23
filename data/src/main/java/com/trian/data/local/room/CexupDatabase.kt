package com.trian.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [],version = 1,exportSchema = false)
abstract class CexupDatabase :RoomDatabase(){
    companion object{
        const val DATABASE_NAME = "cexup_db"
    }
}