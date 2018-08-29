package com.jodevapp.anko.recylerview

import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

/**
 * Created by WORKnPLAYDev on 8/29/2018.
 */
class ClubUi : AnkoComponent<ViewGroup> {

    companion object {
        val tvName = 1
        val ivImage = 2
    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui) {

        verticalLayout {
            this.orientation = LinearLayout.HORIZONTAL
            lparams(matchParent, wrapContent)
            padding = dip(16)

            imageView {
                id = ivImage
                layoutParams = LinearLayout.LayoutParams(wrapContent, wrapContent)
                layoutParams.height = dip(40)
                layoutParams.width = dip(40)
            }

            textView {
                id = tvName
                layoutParams = LinearLayout.LayoutParams(wrapContent, wrapContent)
                textSize = 16f
                (layoutParams as LinearLayout.LayoutParams).gravity = Gravity.CENTER
                (layoutParams as LinearLayout.LayoutParams).margin = dip(10)
            }
        }
    }
}