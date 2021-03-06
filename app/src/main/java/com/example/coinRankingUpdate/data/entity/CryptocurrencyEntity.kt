package com.example.coinRankingUpdate.data.entity

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(
    tableName = "tbl_cryptocurrency"
)
data class CryptocurrencyEntity(
    @ColumnInfo(name = "id")
    @PrimaryKey
    val uuid: String,
    val name: String?,
    val symbol: String?,
    val description: String?,
    val iconUrl: String?,
    val marketCap: String?,
    val price: String?,
    val change: String?,
    val rank: Int?,
    @field:SerializedName("24hVolume")
    val Volume24H: String?,
    val btcPrice: String?,
    @Embedded
    val allTimeHigh: AllTimeHigh?,
    var isBookmarked: Boolean
):Parcelable

@Parcelize
data class AllTimeHigh(
    @field:SerializedName("price")
    val allTimeHighPrice: String,
    val timestamp: Long
):Parcelable