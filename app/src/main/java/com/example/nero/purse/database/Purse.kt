package com.example.nero.purse.database

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity

@Entity(tableName = "purse")
class Purse {
    @ColumnInfo(name = "id")
    val purseId: Int? = null
    @ColumnInfo(name = "image")
    val purseImage: Int? = null
    @ColumnInfo(name = "value")
    val purseValue: Double? = null
    @ColumnInfo(name = "type")
    val purseTyple: String? = null
}