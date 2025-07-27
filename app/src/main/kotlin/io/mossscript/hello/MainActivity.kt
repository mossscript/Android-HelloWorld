package io.mossscript.hello

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.LinearLayout

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.parseColor("#DDDDDD"))
        }

        val textView = TextView(this).apply {
            text = getString(R.string.message_1)
            textSize = 20f
            setTextColor(Color.parseColor("#222222")) 
            gravity = Gravity.CENTER
        }

        layout.addView(textView)
        setContentView(layout)
    }
}
