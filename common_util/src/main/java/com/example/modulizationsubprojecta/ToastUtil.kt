package com.example.modulizationsubprojecta

import android.content.Context
import android.widget.Toast

object ToastUtil {

    @JvmStatic
    fun showToast(
        context: Context?,
        content: String?
    ) {
        context ?: return
        content ?: return
        Toast.makeText(context, content, Toast.LENGTH_SHORT).show()
    }
}