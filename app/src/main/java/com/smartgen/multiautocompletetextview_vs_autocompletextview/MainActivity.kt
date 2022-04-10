package com.smartgen.multiautocompletetextview_vs_autocompletextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.MultiAutoCompleteTextView

class MainActivity : AppCompatActivity() {

    lateinit var multiAutoCompleteTextView: MultiAutoCompleteTextView
    lateinit var autoCompleteTextView: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        multiAutoCompleteTextView=findViewById(R.id.multiAutoComplete)
        autoCompleteTextView=findViewById(R.id.autoComple)

        val list= listOf<String>("ACSE","ACHE","APHY","AENG","ASSL")
        multiAutoCompleteTextView.setAdapter(ArrayAdapter(this,R.layout.drop_down_item,R.id.itemId,list))
        multiAutoCompleteTextView.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())


        autoCompleteTextView.setAdapter(ArrayAdapter(this,R.layout.drop_down_item,R.id.itemId,list))


    }
}