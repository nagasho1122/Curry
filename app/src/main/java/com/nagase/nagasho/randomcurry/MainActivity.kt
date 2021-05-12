package com.nagase.nagasho.randomcurry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val people = arrayOf<String>("ビックマム","カイドウ","黒ヒゲ","シャンクス")
    val food = arrayOf<String>("かれー","みそしる","ちゃーはん","えびちり","ステーキ","親子丼","わたあめ")
    val result = arrayOf<String>("よそえました^^","よそえませんでした")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun serveFood(view: View?){
        val randomName = Random()
        val index = randomName.nextInt(4)
        val name = people[index]
        val resultnum = Random().nextInt(2)
        nameText.text = name + "に"

        foodText.text = food[Random().nextInt(7)] + "を"

        verbText.text = result[resultnum]
        if (resultnum==1){
            verbText.setTextSize(24.0f)
        }else{
            verbText.setTextSize(18.0f)
        }

    }
}