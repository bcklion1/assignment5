package database

import androidx.room.TypeConverter
import java.util.Date

class CrimeTypeConverters {
    @TypeConverter
    fun fromDate(date : Date): Long{
        return date.time
    }

    @TypeConverter
    fun toDate(milliSinceEpoch : Long): Date{
        return Date(milliSinceEpoch)
    }
}