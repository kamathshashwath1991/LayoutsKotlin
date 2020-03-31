package com.example.aboutme

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        /*

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickName(it)
         */

        binding.doneButton.setOnClickListener {
            addNickName(it)
        }

        }

    private fun addNickName(view : View){
        binding.apply {

            nicknameText.text = binding.editNickName.text
            invalidateAll()
            editNickName.visibility = View.GONE
            view.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE

        }



        //hide the button

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }
}




