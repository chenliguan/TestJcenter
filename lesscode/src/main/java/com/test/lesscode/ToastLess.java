package com.test.lesscode;

/**
 * @author Guan
 * @file com.test.lesscode
 * @date 2017/8/16
 * @Version 1.0
 */

import android.content.Context;
import android.widget.Toast;

/**
 * 简化Toast的工具类
 */
public final class ToastLess {

    public static void showToast(Context context, String message) {
        Toast.makeText(context.getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public static void showToast(Context context, int stringId) {
        Toast.makeText(context.getApplicationContext(), stringId, Toast.LENGTH_SHORT).show();
    }
}