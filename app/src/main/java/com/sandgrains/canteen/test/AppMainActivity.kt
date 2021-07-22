package com.sandgrains.canteen.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AppMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_skip).setOnClickListener {
            startActivity(Intent(this,com.sandgrains.canteen.modela.ModelMainActivity::class.java))
        }
    }
}