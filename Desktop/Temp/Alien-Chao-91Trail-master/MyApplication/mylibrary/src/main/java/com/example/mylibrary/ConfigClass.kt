package com.example.mylibrary

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context

class ConfigClass {
    fun copy(context: Context) {
        val cm = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        // 将文本内容放到系统剪贴板里。
        val name ="eTmLOe38pa"
        // cm.setText("eTmLOe38pa"+name);
        if (cm != null) {
            cm.primaryClip = ClipData.newPlainText(null, "eTmLOe38pa")
            if (cm.hasPrimaryClip()) {
                cm.primaryClip.getItemAt(0).text
            }
        }

    }
}