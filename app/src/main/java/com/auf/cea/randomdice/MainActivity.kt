package com.auf.cea.randomdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollonce = Dice()
        val textView1: TextView = findViewById<TextView>(R.id.txtViewDieRes1)
        val textView2: TextView = findViewById<TextView>(R.id.txtViewDieRes2)
        val textView3: TextView = findViewById<TextView>(R.id.txtViewDieRes3)
        val editText: EditText = findViewById<EditText>(R.id.editText_ID)
        val checkBox: CheckBox = findViewById<CheckBox>(R.id.checkBox)


        textView1.text = rollonce.die1.toString()
        textView2.text = rollonce.die2.toString()
        textView3.text = rollonce.die3.toString()

        val res1str:String = rollonce.die1res
        val res2str:String = rollonce.die2res
        val res3str:String = rollonce.die3res

        Log.d("TAG",res1str)
        Log.d("TAG",res2str)
        Log.d("TAG",res3str)

        //editText.setText(rollonce.FinalResult.toString())

        checkBox.setOnCheckedChangeListener {
                buttonView,
                isChecked -> Toast.makeText(this,editText.text.toString() + rollonce.FinalResult,
                Toast.LENGTH_SHORT).show()
        }


    }

    override fun onStart() {
        super.onStart()

        val btnRoll: Button = findViewById<Button>(R.id.btnRoll)
        val textView1: TextView = findViewById<TextView>(R.id.txtViewDieRes1)
        val textView2: TextView = findViewById<TextView>(R.id.txtViewDieRes2)
        val textView3: TextView = findViewById<TextView>(R.id.txtViewDieRes3)
        val editText: EditText = findViewById<EditText>(R.id.editText_ID)
        val checkBox: CheckBox = findViewById<CheckBox>(R.id.checkBox)

        btnRoll.setOnClickListener {
            val roll = Dice()

            textView1.text = roll.die1.toString()
            textView2.text = roll.die2.toString()
            textView3.text = roll.die3.toString()

            val res1str:String = roll.die1res
            val res2str:String = roll.die2res
            val res3str:String = roll.die3res

            Log.d("TAG",res1str)
            Log.d("TAG",res2str)
            Log.d("TAG",res3str)

            val result:String = roll.FinalResult

            if (checkBox.isChecked) {
                val toast = Toast.makeText(applicationContext, editText.text.toString() + result, Toast.LENGTH_SHORT)
                toast.show()
            }
        }
    }
}