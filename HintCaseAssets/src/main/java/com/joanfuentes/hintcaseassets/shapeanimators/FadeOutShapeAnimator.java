package com.joanfuentes.hintcaseassets.shapeanimators;

import android.view.View;

import com.joanfuentes.hintcase.Shape;
import com.joanfuentes.hintcase.ShapeAnimator;
import com.nineoldandroids.animation.ValueAnimator;

public class FadeOutShapeAnimator extends ShapeAnimator {

    public FadeOutShapeAnimator() {
        super();
    }

    public FadeOutShapeAnimator(int durationInMilliseconds) {
        super(durationInMilliseconds);
    }

//    @Override
//    public ValueAnimator getAnimator(View view, Shape shape,
//                                     final OnFinishListener onFinishListener) {
//        shape.setMinimumValue();
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
    public ValueAnimator getAnimator(View view, Shape shape,
                                     final OnFinishListener onFinishListener) {
        shape.setMinimumValue();
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
