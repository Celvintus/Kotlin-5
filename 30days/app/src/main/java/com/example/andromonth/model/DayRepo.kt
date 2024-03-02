package com.example.andromonth.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.andromonth.R

data class Day(
    @DrawableRes val imageRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descRes: Int
)

object DayRepo {
    val days = listOf(
        Day(R.drawable.one, R.string.title0, R.string.desc0),
        Day(R.drawable.two, R.string.title1, R.string.desc1),
        Day(R.drawable.three, R.string.title2, R.string.desc2),
        Day(R.drawable.four, R.string.title3, R.string.desc3),
        Day(R.drawable.five, R.string.title4, R.string.desc4),
        Day(R.drawable.six, R.string.title5, R.string.desc5),
        Day(R.drawable.seven, R.string.title6, R.string.desc6)
    )
}