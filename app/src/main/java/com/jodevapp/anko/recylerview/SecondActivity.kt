package com.jodevapp.anko.recylerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.LinearLayout
import com.bumptech.glide.Glide
import org.jetbrains.anko.*

/**
 * Created by jodevapp on 8/29/18.
 */
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val club: Club = intent.getParcelableExtra("clubBundle")

        verticalLayout {
            lparams(matchParent, wrapContent)
            padding = dip(16)

            imageView {
                layoutParams = LinearLayout.LayoutParams(wrapContent, wrapContent)
                layoutParams.height = dip(60)
                layoutParams.width = dip(60)
                (layoutParams as LinearLayout.LayoutParams).gravity = Gravity.CENTER
                Glide.with(this@SecondActivity).load(club.image).into(this)
            }
            textView {
                layoutParams = LinearLayout.LayoutParams(wrapContent, wrapContent)
                textSize = 16f
                text = club.name
                (layoutParams as LinearLayout.LayoutParams).gravity = Gravity.CENTER
                (layoutParams as LinearLayout.LayoutParams).setMargins(0, dip(5), 0, dip(10))
            }
            textView {
                layoutParams = LinearLayout.LayoutParams(wrapContent, wrapContent)
                textSize = 16f
                text = club.desc
                (layoutParams as LinearLayout.LayoutParams).gravity = Gravity.CENTER
            }
        }
    }
}
