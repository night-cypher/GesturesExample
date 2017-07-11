package com.questdot.gesturesexample;

import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,
        GestureDetector.OnDoubleTapListener{

    private TextView txt_gesture;
    private GestureDetectorCompat gestureDetectorCompat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_gesture = (TextView)findViewById(R.id.txt_gesture);

       gestureDetectorCompat = new GestureDetectorCompat(getApplicationContext(),this);

        gestureDetectorCompat.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {

        txt_gesture.setText("On Single tap");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        txt_gesture.setText("On Double tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        txt_gesture.setText("On Double tap event tap");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        txt_gesture.setText("On Down ");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        txt_gesture.setText("On Show ");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        txt_gesture.setText("On Single tap up");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        txt_gesture.setText("On Scroll ");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        txt_gesture.setText("On Long Press");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
        txt_gesture.setText("On Fling");
        return true;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gestureDetectorCompat.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
