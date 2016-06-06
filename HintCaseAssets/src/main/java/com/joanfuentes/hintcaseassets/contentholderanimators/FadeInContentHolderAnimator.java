package com.joanfuentes.hintcaseassets.contentholderanimators;

import android.view.View;

import com.joanfuentes.hintcase.ContentHolderAnimator;
import com.nineoldandroids.animation.Animator;

public class FadeInContentHolderAnimator extends ContentHolderAnimator {

    public FadeInContentHolderAnimator() {
        super();
    }

    public FadeInContentHolderAnimator(int durationInMilliseconds) {
        super(durationInMilliseconds);
    }

    @Override
    public com.nineoldandroids.animation.ValueAnimator getAnimator(View view, final OnFinishListener onFinishListener) {
//        ObjectAnimator animator = ObjectAnimator.ofFloat(view, View.ALPHA, 0, 1);
        com.nineoldandroids.animation.ObjectAnimator animator = com.nineoldandroids.animation.ObjectAnimator.ofFloat(view, "alpha", 0, 1);
        animator.setDuration(durationInMilliseconds);
        if (onFinishListener != NO_CALLBACK) {
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
            animator.addListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {

                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    onFinishListener.onFinish();
                }

                @Override
                public void onAnimationCancel(Animator animation) {

                }

                @Override
                public void onAnimationRepeat(Animator animation) {

                }
            });
        }
        return animator;
    }
}
