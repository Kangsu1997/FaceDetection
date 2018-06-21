package com.example.pc.facedetection;

import android.content.ContentProviderOperation;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.hardware.camera2.params.Face;
import android.media.FaceDetector;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;

import java.util.concurrent.atomic.AtomicReference;

import static android.media.FaceDetector.*;

/**
 * Created by PC on 12/1/2017.
 */

public class FaceOverlayView extends View {

    private Bitmap mBitmap;
    private SparseArray<Face> mFaces;

    public FaceOverlayView(Context context) {
        this(context, null);
    }

    public FaceOverlayView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public FaceOverlayView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public void setBitmap( Bitmap bitmap ) {
        mBitmap = bitmap;
        FaceDetector detector = new AtomicReference<>(new FaceDetector.Builder(getContext())
                .setTrackingEnabled(false)
                .setLandmarkType(FaceDetector.ALL_LANDMARKS)
                .setMode(FaceDetector.FAST_MODE)
                .build());
    }
    if (!detector.isOperational()) {
        Handle contingency;
    }
     else {
        Frame frame = new Frame.Builder().setBitmap(mBitmap).build();
        Object detector;
        mFaces = detector.detect(frame);
        return detector;();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if ((mBitmap != null) && (mFaces != null)) {
            double scale = drawBitmap(canvas);
            drawFaceBox(canvas, scale);
        }
    }


private void drawFaceBox(Canvas canvas, double scale) {
    }

}private double drawBitmap(Canvas canvas) {
    }