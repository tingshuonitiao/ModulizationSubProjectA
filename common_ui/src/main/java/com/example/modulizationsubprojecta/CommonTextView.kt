package com.example.modulizationsubprojecta;

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class CommonTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null

) : AppCompatTextView(context, attrs) {

    private fun test() {
        println("test")
    }
}