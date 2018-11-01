package com.example.nero.purse.database

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "purse")
data class PurseDB(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var purseId: Int = 0,
    @ColumnInfo(name = "image")
val purseImage: Int,
@ColumnInfo(name = "value")
val purseValue: Double,
@ColumnInfo(name = "type")
val purseType: String
)