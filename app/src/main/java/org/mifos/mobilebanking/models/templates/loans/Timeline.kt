package org.mifos.mobilebanking.models.templates.loans

import android.os.Parcelable

import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

/**
 * Created by Rajan Maurya on 16/07/16.
 */

@Parcelize
data class Timeline(
        @SerializedName("expectedDisbursementDate")
        var expectedDisbursementDate: List<Int>
) : Parcelable