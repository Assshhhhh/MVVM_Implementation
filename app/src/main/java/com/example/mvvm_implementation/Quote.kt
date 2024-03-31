package com.example.mvvm_implementation

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Quotes")
data class Quote(

    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val text: String,
    val author: String

)
