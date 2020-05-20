package com.example.fragmenttoactivitycomunication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendDataToFragment(view: View?) {
        val firstNumber = Integer.valueOf(etFirstNumber.text.toString())
        val secondNumber = Integer.valueOf(etSecondNumber.text.toString())
        val fragmentA = FragmentA()
        fragmentA.setData(firstNumber, secondNumber) // Passing primitive data type
        val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.containerFragmentA, fragmentA, "fragA")
        transaction.commit()
    }
}
