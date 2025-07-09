package com.moviediscovery.app.data.local.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import android.content.Context
import com.moviediscovery.app.data.local.dao.MovieDao
import com.moviediscovery.app.data.local.entities.Converters
import com.moviediscovery.app.data.local.entities.MovieEntity

@Database(
    entities = [MovieEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract class MovieDatabase : RoomDatabase() {
    
    abstract fun movieDao(): MovieDao
    
    companion object {
        const val DATABASE_NAME = "movie_database"
        
        @Volatile
        private var INSTANCE: MovieDatabase? = null
        
        fun getDatabase(context: Context): MovieDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MovieDatabase::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}