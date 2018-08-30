package com.jodevapp.anko.recylerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by jodevapp on 8/29/18.
 */
@Parcelize
data class Club (val name: String?, val image: Int?, val desc: String?): Parcelable