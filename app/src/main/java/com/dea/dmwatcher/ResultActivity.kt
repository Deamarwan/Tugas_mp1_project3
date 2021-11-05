package com.dea.dmwatcher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    companion object {
        const val RESULT_CODE =200
        const val EXTRA_COLOR = "extra_color"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val btn_result = findViewById<Button>(R.id.btn_result)
        val rd_colors = findViewById<RadioGroup>(R.id.rd_colors)

        btn_result.setOnClickListener {
            if (rd_colors.checkedRadioButtonId != 0) {
                var value = "#FFFFC107"
                when (rd_colors.checkedRadioButtonId) {
                    R.id.rad_merah -> value = "#ff0000"
                    R.id.rad_hijau -> value = "#00ff00"
                    R.id.rad_biru -> value = "#0000ff"
                    R.id.rad_hitam -> value = "#000000"
                }
                Log.d("selected Color", value.toString())
                val result = Intent()
                result.putExtra(EXTRA_COLOR, value)
                setResult(500, result)
                finish()

            }

        }
    }
}