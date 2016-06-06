package com.joanfuentes.hintcase;

import android.view.View;

import com.nineoldandroids.animation.ValueAnimator;

public abstract class ContentHolderAnimator {
    public static final int DEFAULT_ANIMATION_DURATION_IN_MILLISECONDS = 300;
    public static final ContentHolderAnimator NO_ANIMATOR = null;
    public static final OnFinishListener NO_CALLBACK = null;
    protected int durationInMilliseconds;

    public ContentHolderAnimator() {
        durationInMilliseconds = DEFAULT_ANIMATION_DURATION_IN_MILLISECONDS;
    }

    public ContentHolderAnimator(int durationInMilliseconds) {
        this.durationInMilliseconds = durationInMilliseconds;
    }

    public ValueAnimator getAnimator(View view) {
        return getAnimator(view, NO_CALLBACK);
    }

    abstract public ValueAnimator getAnimator(View view, OnFinishListener onFinishListener);

    public interface OnFinishListener {
        void onFinish();
    }
}
