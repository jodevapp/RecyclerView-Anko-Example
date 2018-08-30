package com.jodevapp.anko.recylerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
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
                Glide.with(this@SecondActivity).load(club.image).into(this)
            }.lparams {
                height = dip(60)
                width = dip(60)
                gravity = Gravity.CENTER
            }
            textView {
                textSize = 16f
                text = club.name
            }.lparams {
                gravity = Gravity.CENTER
                setMargins(0, dip(5), 0, dip(10))
            }
            textView {
                textSize = 16f
                text = club.desc
            }.lparams {
                gravity = Gravity.CENTER
            }
        }
    }
}
