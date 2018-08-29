package com.jodevapp.anko.recylerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {

    private var clubName: String = ""
    private var clubImage: String = ""
    private var clubDesc: String = ""
    private lateinit var tvClubName: TextView
    private lateinit var ivClub: ImageView
    private lateinit var tvClubDesc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = intent
        clubName = intent.getStringExtra("clubName")
        clubImage = intent.getStringExtra("clubImage")
        clubDesc = intent.getStringExtra("clubDesc")

        verticalLayout {
            lparams(matchParent, wrapContent)
            padding = dip(16)

            ivClub = imageView {
                layoutParams = LinearLayout.LayoutParams(wrapContent, wrapContent)
                layoutParams.height = dip(60)
                layoutParams.width = dip(60)
                (layoutParams as LinearLayout.LayoutParams).gravity = Gravity.CENTER
                setBackgroundResource(clubImage.toInt())
            }
            tvClubName = textView {
                layoutParams = LinearLayout.LayoutParams(wrapContent, wrapContent)
                textSize = 16f
                text = clubName
                (layoutParams as LinearLayout.LayoutParams).gravity = Gravity.CENTER
                (layoutParams as LinearLayout.LayoutParams).setMargins(0, dip(5), 0, dip(10))
            }
            tvClubDesc = textView {
                layoutParams = LinearLayout.LayoutParams(wrapContent, wrapContent)
                textSize = 16f
                text = clubDesc
                (layoutParams as LinearLayout.LayoutParams).gravity = Gravity.CENTER
            }
        }
    }
}
