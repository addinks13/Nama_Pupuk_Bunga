package com.addin.namapupukbunga

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ClassPupuk (
    var namePupuk: String="",
    var descPupuk: String ="",
    var imgPupuk: Int =0
):Parcelable