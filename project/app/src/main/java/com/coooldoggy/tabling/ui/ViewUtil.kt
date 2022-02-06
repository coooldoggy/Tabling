package com.coooldoggy.tabling.ui

import android.graphics.Typeface
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.forEachIndexed
import com.google.android.material.tabs.TabLayout

fun TabLayout.changeTabsFont(selectPosition: Int) {
    val vg = this.getChildAt(0) as ViewGroup
    val tabsCount = vg.childCount
    for (j in 0 until tabsCount) {
        val vgTab = vg.getChildAt(j) as ViewGroup
        vgTab.forEachIndexed { index, _ ->
            val tabViewChild = vgTab.getChildAt(index)
            if (tabViewChild is TextView) {
                tabViewChild.setTextBold(j == selectPosition)
            }
        }
    }
}

fun TextView.setTextBold(isBold: Boolean) {
    if (isBold){
        this.setTypeface(this.typeface, Typeface.BOLD)
    }else{
        this.setTypeface(null, Typeface.NORMAL)
    }
}
