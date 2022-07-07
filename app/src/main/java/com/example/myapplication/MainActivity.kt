package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.lang.StringBuilder //Import StringBuilder to print String Line By Line

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.btnView)
        val resultTV: TextView = findViewById(R.id.Info_Res)
        var flag : String = "Android 13"
        val spinnerVal : Spinner = findViewById(R.id.selectSP)
        var options = arrayOf("Android 13","Android 12","Android 11","Android 10","Android Pie")

        spinnerVal.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options )
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        button.setOnClickListener{ view ->
            if(flag =="Android 13"){
                resultTV.text = Android13().toString();
            }
            else if(flag=="Android 12"){
                resultTV.text = Android12().toString();
            }
            else if(flag=="Android 11"){
                resultTV.text = Android11().toString();
            }
            else if(flag=="Android 10"){
                resultTV.text = Android10().toString();
            }
            else{
                resultTV.text = AndroidPie().toString();
            }
        }

    }
}

fun Android13(): String {

    val Name: String = "Name: Android 13"
    val InternalCodeName: String = "Internal Code Name: Tiramisu"
    val VersionNumber: String ="Version Number(s): 13"
    val API_Level: String = "API Level: 33"
    val Stabel_ReleaseDate: String ="Stabel Release Date: Q3 2022"

    // Obtaining StringBuilder Object
    val sb = StringBuilder()

    //joining strings
    sb.append(Name).append('\n').append(InternalCodeName).append('\n').append(VersionNumber).append('\n').append(API_Level).append('\n').append(Stabel_ReleaseDate)

    // StringBuilder to String
    val str4 = sb.toString()

    return str4
}

fun Android12(): String {

    val Name: String = "Name: Android 12"
    val InternalCodeName: String = "Internal Code Name: Snow Cone"
    val VersionNumber: String ="Version Number(s): 12"
    val API_Level: String = "API Level: 31"
    val Stabel_ReleaseDate: String ="Stabel Release Date: October 4, 2021"

    // Obtaining StringBuilder Object
    val sb = StringBuilder()

    //joining strings
    sb.append(Name).append('\n').append(InternalCodeName).append('\n').append(VersionNumber).append('\n').append(API_Level).append('\n').append(Stabel_ReleaseDate)

    // StringBuilder to String
    val str4 = sb.toString()

    return str4
}

fun Android11(): String {

    val Name: String = "Name: Android 11"
    val InternalCodeName: String = "Internal Code Name: Red Velvet Cake"
    val VersionNumber: String ="Version Number(s): 11"
    val API_Level: String = "API Level: 30"
    val Stabel_ReleaseDate: String ="Stabel Release Date: September 8, 2020"

    // Obtaining StringBuilder Object
    val sb = StringBuilder()

    //joining strings
    sb.append(Name).append('\n').append(InternalCodeName).append('\n').append(VersionNumber).append('\n').append(API_Level).append('\n').append(Stabel_ReleaseDate)

    // StringBuilder to String
    val str4 = sb.toString()

    return str4
}

fun Android10(): String {

    val Name: String = "Name: Android 10"
    val InternalCodeName: String = "Internal Code Name: Quince Tart"
    val VersionNumber: String ="Version Number(s): 10"
    val API_Level: String = "API Level: 29"
    val Stabel_ReleaseDate: String ="Stabel Release Date: September 3, 2019"

    // Obtaining StringBuilder Object
    val sb = StringBuilder()

    //joining strings
    sb.append(Name).append('\n').append(InternalCodeName).append('\n').append(VersionNumber).append('\n').append(API_Level).append('\n').append(Stabel_ReleaseDate)

    // StringBuilder to String
    val str4 = sb.toString()

    return str4
}

fun AndroidPie(): String {
    val Name: String = "Name: Android Pie"
    val InternalCodeName: String = "Internal Code Name: Pistachio Ice Cream"
    val VersionNumber: String ="Version Number(s): 9"
    val API_Level: String = "API Level: 28"
    val Stabel_ReleaseDate: String ="Stabel Release Date: August 6, 2018"

    // Obtaining StringBuilder Object
    val sb = StringBuilder()

    //joining strings
    sb.append(Name).append('\n').append(InternalCodeName).append('\n').append(VersionNumber).append('\n').append(API_Level).append('\n').append(Stabel_ReleaseDate)

    // StringBuilder to String
    val str4 = sb.toString()

    return str4
}
