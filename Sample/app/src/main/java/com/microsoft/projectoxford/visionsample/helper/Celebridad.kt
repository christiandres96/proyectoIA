package com.microsoft.projectoxford.visionsample.helper

import android.os.Parcel
import android.os.Parcelable


class Celebridad(var nombre:String, var genero:String,var edad:Int,var clothe:String,var lugarFoto:String,var usuarioId:Int) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readInt(),
            parcel.readString(),
            parcel.readString(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nombre)
        parcel.writeString(genero)
        parcel.writeInt(edad)
        parcel.writeString(clothe)
        parcel.writeString(lugarFoto)
        parcel.writeInt(usuarioId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Celebridad> {
        override fun createFromParcel(parcel: Parcel): Celebridad {
            return Celebridad(parcel)
        }

        override fun newArray(size: Int): Array<Celebridad?> {
            return arrayOfNulls(size)
        }
    }
}