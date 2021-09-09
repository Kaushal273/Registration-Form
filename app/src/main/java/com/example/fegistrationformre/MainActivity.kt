package com.example.fegistrationformre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Name = findViewById<EditText>(R.id.nameText)
        val Button = findViewById<Button>(R.id.setButton)
        val check = findViewById<CheckBox>(R.id.checkBox)
        var dept=" "
        var deptlist = arrayListOf("Computer Science","INformation technology","Others")
        val dep = findViewById<Spinner>(R.id.dSpinner)
        dep.adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                deptlist
        )
        dep.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                dept=deptlist[position]
            }
        }
        Button.setOnClickListener{
            check.setText("You Have Successfully Registered "+ Name.text)
        }
    }
}