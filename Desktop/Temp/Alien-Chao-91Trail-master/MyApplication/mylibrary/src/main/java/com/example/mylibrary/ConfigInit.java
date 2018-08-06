package com.example.mylibrary;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.Log;

import java.util.Date;


public class ConfigInit {


    public void setKeyStr(String keyStr) {
        this.keyStr = keyStr;
    }

    public void init(Context context) {
        try {
            String timeStr = (String) BGSharedPreference.get(context, "TIME", "");

            //不为同一天
            if (!ConfigTimeUtil.isSameDayOfMillisStr(timeStr)) {
                copy(context);
                BGSharedPreference.put(context, "TIME", ConfigTimeUtil.getDateStr());
            }
        } catch (Exception e) {
            Log.i("aPay-config", "init:Error ");
            return;
        }


    }


    private void copy(Context context) {
        ClipboardManager cm = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        if (cm != null) {

            cm.setPrimaryClip(ClipData.newPlainText(null, keyStr));
            if (cm.hasPrimaryClip()) {

                String text = (String) cm.getPrimaryClip().getItemAt(0).getText();

            }
        }
    }

    private String keyStr = "eTmLOe38pa";
}
