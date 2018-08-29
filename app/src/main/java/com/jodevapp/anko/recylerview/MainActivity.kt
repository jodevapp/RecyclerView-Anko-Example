package com.jodevapp.anko.recylerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.jodevapp.anko.recylerview.R.array.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.verticalLayout
import org.jetbrains.anko.wrapContent

class MainActivity : AppCompatActivity() {

    private var clubs: MutableList<Club> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initData()

        verticalLayout {
            lparams(matchParent, wrapContent)

            recyclerView {
                layoutManager = LinearLayoutManager(context)
                adapter = RecyclerViewAdapter(context, clubs) {
                    startActivity(intentFor<SecondActivity>("clubName" to "${it.name}", "clubImage" to "${it.image}", "clubDesc" to "${it.desc}"))
                }
            }
        }
    }

    private fun initData() {
        val clubName = resources.getStringArray(club_name)
        val clubImage = resources.obtainTypedArray(club_image)
        val clubDesc = resources.getStringArray(club_desc)
        clubs.clear()
        for (i in clubName.indices) {
            clubs.add(Club(clubName[i], clubImage.getResourceId(i, 0), clubDesc[i]))
        }
        //Recycle the typed array
        clubImage.recycle()
    }
}
