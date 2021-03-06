package com.github.florent37.singledateandtimepicker.dialog;

import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;

/**
 * Created by nor on 1/2/2017.
 */

public abstract class BaseDialog {
    public static final int DEFAULT_ITEM_COUNT_MODE_CURVED = 7;
    public static final int DEFAULT_ITEM_COUNT_MODE_NORMAL = 5;

    private boolean isDisplaying;
    @ColorInt
    protected Integer backgroundColor = null;
    @ColorInt
    protected Integer mainColor = null;
    @ColorInt
    protected Integer titleTextColor = null;

    public void display() {
        this.isDisplaying = true;
    }

    public void close() {
        this.isDisplaying = false;
    }

    public boolean isDisplaying() {
        return isDisplaying;
    }

    public void setBackgroundColor(@ColorInt Integer backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setMainColor(@ColorInt Integer mainColor) {
        this.mainColor = mainColor;
    }

    public void setTitleTextColor(@NonNull @ColorInt int titleTextColor) {
        this.titleTextColor = titleTextColor;
    }

    protected void onClose() {
        this.isDisplaying = false;
    }
}
