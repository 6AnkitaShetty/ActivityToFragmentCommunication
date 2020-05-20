package com.example.fragmenttoactivitycomunication


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_a.*


/**
 * A simple [Fragment] subclass.
 */
class FragmentA : Fragment() {


    private var firstNumber = 0
    private var secondNumber = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        val btnAdd = view.findViewById(R.id.btnAdd) as Button
        btnAdd.setOnClickListener {
            addTwoNumbers(firstNumber, secondNumber)
        }

        return view
    }

    private fun addTwoNumbers(firstNumber: Int, secondNumber: Int) {
        val result = firstNumber + secondNumber
        txvResult.text = "Result : $result"
    }

    fun setData(firstNumber: Int, secondNumber: Int) {
        this.firstNumber = firstNumber
        this.secondNumber = secondNumber
    }

}
