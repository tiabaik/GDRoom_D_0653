package com.tia_0653.gdroom_d_0653.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity

data class Note (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val note: String
)