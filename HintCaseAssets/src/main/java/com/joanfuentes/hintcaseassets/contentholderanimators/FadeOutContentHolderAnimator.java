package com.joanfuentes.hintcaseassets.contentholderanimators;

import android.view.View;

import com.joanfuentes.hintcase.ContentHolderAnimator;
import com.nineoldandroids.animation.ValueAnimator;

public class FadeOutContentHolderAnimator extends ContentHolderAnimator {

    public FadeOutContentHolderAnimator() {
        super();
    }

    public FadeOutContentHolderAnimator(int durationInMilliseconds) {
        super(durationInMilliseconds);
    }

//    @Override
//    public ValueAnimator getAnimator(View view, final OnFinishListener onFinishListener) {
//        ObjectAnimator animator = ObjectAnimator.ofFloat(view, View.ALPHA, 1, 0);
//        animator.setDuration(durationInMilliseconds);
//        if (onFinishListener != NO_CALLBACK) {
//            animator.addListener(new Animator.AnimatorListener() {
//                @Override
//                public void onAnimationStart(Animator animation) { }
//
//                @Override
//                public void onAnimationEnd(Animator animation) {
//                    onFinishListener.onFinish();
//                }
//
//                @Override
//                public void onAnimationCancel(Animator animation) { }
//
//                @Override
//                public void onAnimationRepeat(Animator animation) { }
//            });
//        }
//        return animator;
//    }

    @Override
    public ValueAnimator getAnimator(View view, final OnFinishListener onFinishListener) {
        com.nineoldandroids.animation.ObjectAnimator animator = com.nineoldandroids.animation.ObjectAnimator.ofFloat(view, "alpha", 0, 1);
        animator.setDuration(durationInMilliseconds);
        if (onFinishListener != NO_CALLBACK) {
            animator.addListener(new com.nineoldandroids.animation.Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(com.nineoldandroids.animation.Animator animation) {

                }

                @Override
                public void onAnimationEnd(com.nineoldandroids.animation.Animator animation) {
                    onFinishListener.onFinish();
                }

                @Override
                public void onAnimationCancel(com.nineoldandroids.animation.Animator animation) {

                }

                @Override
                public void onAnimationRepeat(com.nineoldandroids.animation.Animator animation) {

                }
            });
        }
        return animator;
    }
}
