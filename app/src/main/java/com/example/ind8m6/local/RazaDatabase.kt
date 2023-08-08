package com.example.ind8m6.local

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

abstract class RazaDatabase: RoomDatabase() {

   abstract fun getRazaDao():RazaDao
     companion object {
         @Volatile
         private var INSTANCE: RazaDatabase? = null


         fun getDatabase(context: Context): RazaDatabase {
             val tempInstance = INSTANCE
             if (tempInstance != null) {
                 return tempInstance
             }
             synchronized(this) {
                 val instance = Room.databaseBuilder(
                     context.applicationContext,
                     RazaDatabase::class.java,
                     "razas_database"
                 ).build()

                 INSTANCE = instance
                 return instance
             }
         }
     }}