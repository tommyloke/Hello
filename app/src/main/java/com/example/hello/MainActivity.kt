package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

// : = extends
class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //
        //Java int x; vs Kotlin var x : Int
        //val = value and var = variable
        val buttonDontClickMe : Button = findViewById(R.id.ButtonDontClickMe)
        buttonDontClickMe.setOnClickListener{ showMessage() }

        val buttonReset : Button = findViewById(R.id.ButtonReset)
        buttonReset.setOnClickListener{textViewMessage.setText(getString(R.string.app_name))}
    }

    private fun showMessage() {
        textViewMessage.setText(getString(R.string.warning_message))
    }
}
