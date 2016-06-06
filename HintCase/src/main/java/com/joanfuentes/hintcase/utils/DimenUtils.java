package com.joanfuentes.hintcase.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class DimenUtils {
    public static int getStatusBarHeight(Context context) {
        int statusBarHeight = 0;
        Resources resources = context.getResources();
        int id = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (id > 0) {
            statusBarHeight = resources.getDimensionPixelSize(id);
        }
        return statusBarHeight;
    }

    public static int getActionBarHeight(Context context) {
        int actionBarHeight = 0;
        TypedValue tv = new TypedValue();
        if (context.getTheme().resolveAttribute(android.R.attr.actionBarSize, tv, true)) {
            actionBarHeight = TypedValue.complexToDimensionPixelSize(tv.data,
                    context.getResources().getDisplayMetrics());
        }
        return actionBarHeight;
    }

    public static int dipToPixels(Context context, float valueInDP) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, valueInDP, displayMetrics);
    }

    public static Point getNavigationBarSizeIfExistAtTheBottom(Context context) {
//        Point appUsableSize = getAppUsableScreenSize(context);
        DisplayMetrics display = context.getResources().getDisplayMetrics();
        Point realScreenSize = getRealScreenSize(context);
        Point navigationPoint;
//        boolean navigationBarIsPresent = appUsableSize.y < realScreenSize.y;
        boolean navigationBarIsPresent = display.heightPixels < realScreenSize.y;
        if (navigationBarIsPresent) {
//            navigationPoint = new Point(appUsableSize.x, realScreenSize.y - appUsableSize.y);
            navigationPoint = new Point(display.widthPixels, realScreenSize.y - display.heightPixels);
        } else {
            navigationPoint = new Point();
        }
        return navigationPoint;
    }

    public static Point getNavigationBarSizeIfExistOnTheRight(Context context) {
//        Point appUsableSize = getAppUsableScreenSize(context);
        DisplayMetrics display = context.getResources().getDisplayMetrics();
        Point realScreenSize = getRealScreenSize(context);
        Point navigationPoint;
//        boolean navigationBarIsPresent = appUsableSize.x < realScreenSize.x;
        boolean navigationBarIsPresent = display.widthPixels < realScreenSize.x;
        if (navigationBarIsPresent) {
//            navigationPoint =  new Point(realScreenSize.x - appUsableSize.x, appUsableSize.y);
            navigationPoint =  new Point(realScreenSize.x - display.widthPixels, display.heightPixels);
        } else {
            navigationPoint =  new Point();
        }
        return navigationPoint;
    }

//    public static Point getAppUsableScreenSize(Context context) {
//        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
//        Display display = windowManager.getDefaultDisplay();
//        Point size = new Point();
//        display.getSize(size);
//        return size;
//    }

    public static Point getRealScreenSize(Context context) {
        View decorView = ((Activity)context).getWindow().getDecorView();
        Point size = new Point();
        size.x = decorView.getWidth();
        size.y = decorView.getHeight();
        return size;
    }
}
