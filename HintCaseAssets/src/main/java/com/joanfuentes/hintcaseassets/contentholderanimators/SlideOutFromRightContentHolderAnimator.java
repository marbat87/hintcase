package com.joanfuentes.hintcaseassets.contentholderanimators;

import android.view.View;

import com.joanfuentes.hintcase.ContentHolderAnimator;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.ObjectAnimator;
import com.nineoldandroids.animation.ValueAnimator;
import com.nineoldandroids.view.ViewHelper;

public class SlideOutFromRightContentHolderAnimator extends ContentHolderAnimator {

    public SlideOutFromRightContentHolderAnimator() {
        super();
    }

    public SlideOutFromRightContentHolderAnimator(int durationInMilliseconds) {
        super(durationInMilliseconds);
    }

    @Override
    public ValueAnimator getAnimator(final View view, final OnFinishListener onFinishListener) {
//        view.setAlpha(1);
        ViewHelper.setAlpha(view, 1);
        float spaceUntilRightSide = view.getRootView().getWidth() - view.getLeft();
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationX", 0,
                spaceUntilRightSide);
        animator.setDuration(durationInMilliseconds);
        if (onFinishListener != NO_CALLBACK) {
            animator.addListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) { }

                @Override
                public void onAnimationEnd(Animator animation) {
                    onFinishListener.onFinish();
                }

                @Override
                public void onAnimationCancel(Animator animation) { }

                @Override
                public void onAnimationRepeat(Animator animation) { }
            });
        }
        return animator;
    }
}
