package com.jodevapp.anko.recylerview

import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

/**
 * Created by jodevapp on 8/29/18.
 */
class ClubUi : AnkoComponent<ViewGroup> {

    companion object {
        const val tvName = 1
        const val ivImage = 2
    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui) {

        verticalLayout {
            this.orientation = LinearLayout.HORIZONTAL
            lparams(matchParent, wrapContent)
            padding = dip(16)

            imageView {
                id = ivImage
            }.lparams {
                height = dip(40)
                width = dip(40)
                gravity = Gravity.CENTER
            }

            textView {
                id = tvName
                textSize = 16f
            }.lparams {
                gravity = Gravity.CENTER
                margin = dip(10)
            }
        }
    }
}