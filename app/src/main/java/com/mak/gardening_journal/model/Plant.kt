package com.mak.gardening_journal.model

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Entity(tableName = "plants_table")
@Parcelize
data class Plant(
    @SerializedName("PlantName")
    val name: String?,

    @SerializedName("PlantingDate")
    val plantingDate: String?,

    @PrimaryKey(autoGenerate = true)
    val id: Int,

    @SerializedName("Type")
    val type: String?,

    @SerializedName("WateringFrequency")
    val wateringFrequency: String?,

    @SerializedName("ImageUrl")
    val imageUrl: String?
) : Parcelable {
    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        TODO("Not yet implemented")
    }
}