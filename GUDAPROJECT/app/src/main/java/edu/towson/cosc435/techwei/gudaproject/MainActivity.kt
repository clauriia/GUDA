package edu.towson.cosc435.techwei.gudaproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**On Click listener for the button on the main page**/
    fun exploreOnClickListener(view : View){
        val intent = Intent(this, HomePage::class.java)
        startActivity(intent)
    }
}