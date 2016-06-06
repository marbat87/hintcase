package com.joanfuentes.hintcaseassets.shapeanimators;

import android.view.View;

import com.joanfuentes.hintcase.Shape;
import com.joanfuentes.hintcase.ShapeAnimator;
import com.joanfuentes.hintcaseassets.shapes.CircularShape;
import com.nineoldandroids.animation.ValueAnimator;

public class RevealCircleShapeAnimator extends ShapeAnimator {

    public RevealCircleShapeAnimator() {
        super();
    }

    public RevealCircleShapeAnimator(int durationInMilliseconds) {
        super(durationInMilliseconds);
    }

//    @Override
//    public ValueAnimator getAnimator(final View view, Shape shape,
//                                     final OnFinishListener onFinishListener) {
//        final CircularShape circularShape = (CircularShape) shape;
//        ValueAnimator valueAnimator = ValueAnimator.ofFloat(circularShape.getMaxRadius(),
//                circularShape.getMinRadius());
//        valueAnimator.setDuration(durationInMilliseconds)
//                .addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
//                    @Override
//                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
//                        circularShape.setCurrentRadius((Float) valueAnimator.getAnimatedValue());
//                        if (circularShape.getCurrentRadius() == circularShape.getMinRadius()) {
//                            if (onFinishListener != null) {
//                                onFinishListener.onFinish();
//                            }
//                        }
//                        view.invalidate();
//                    }
//                });
//        return valueAnimator;
//    }

    @Override
    public com.nineoldandroids.animation.ValueAnimator getAnimator(final View view, Shape shape,
                                                                   final OnFinishListener onFinishListener) {
        final CircularShape circularShape = (CircularShape) shape;
        ValueAnimator valueAnimator = ValueAnimator.ofFloat(circularShape.getMaxRadius(),
                circularShape.getMinRadius());
        valueAnimator.setDuration(durationInMilliseconds)
                .addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        circularShape.setCurrentRadius((Float) valueAnimator.getAnimatedValue());
                        if (circularShape.getCurrentRadius() == circularShape.getMinRadius()) {
                            if (onFinishListener != null) {
                                onFinishListener.onFinish();
                            }
                        }
                        view.invalidate();
                    }
                });
        return valueAnimator;
    }


}
