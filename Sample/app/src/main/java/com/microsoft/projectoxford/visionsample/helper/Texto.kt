package com.microsoft.projectoxford.visionsample.helper

import android.os.Parcel
import android.os.Parcelable

class Texto(var textoFoto:String, var usuarioId:Int) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readInt()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(textoFoto)
        parcel.writeInt(usuarioId)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Texto> {
        override fun createFromParcel(parcel: Parcel): Texto {
            return Texto(parcel)
        }

        override fun newArray(size: Int): Array<Texto?> {
            return arrayOfNulls(size)
        }
    }
}