package com.KingKitty.randomizer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button=findViewById<Button>(R.id.Button)
        var Text=findViewById<TextView>(R.id.ResultText)
        var bar=findViewById<SeekBar>(R.id.seekBar)

        button.setOnClickListener {
            val rand= Random.nextInt(bar.progress)
            Text.text=rand.toString()
        }
    }
}
