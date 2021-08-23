package com.trian.domain.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tb_users")
data class Users(
    @PrimaryKey(autoGenerate = true)
    var id_use:Int
)
