package com.example.assignment_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val butn:Button=findViewById(R.id.ResultBT)
        val txtv2:TextView=findViewById(R.id.txtresult)
        val edutxt1:EditText=findViewById(R.id.edNum1)
        val edutxt2:EditText=findViewById(R.id.edNum2)
        val spin:Spinner=findViewById(R.id.spinnerID)
        var flag:String="sum"
        var options= arrayOf("sum","multiply","minus","divide")
       spin.adapter=
           ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)
        spin.onItemSelectedListener= object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag=options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
        butn.setOnClickListener(View.OnClickListener {
            val a:Int=edutxt1.text.toString().toInt()
            val b:Int=edutxt2.text.toString().toInt()
            when(flag){
             "sum"->txtv2.text=sum(a,b).toString()
                "minus"->txtv2.text= minus(a,b).toString()
                "multiply"->txtv2.text= multiply(a,b).toString()
                "divide"->txtv2.text= divide(a,b).toString()

            }
        })
    }
}
           public fun sum(a:Int,b:Int):Int{
          return a+b;
            }
            public fun multiply(a:Int,b:Int):Int{
              return a*b;
            }
            public fun minus(a:Int,b:Int):Int{
                 return a-b;
            }
            public fun divide(a:Int,b:Int):Int{
               return a/b;
                }