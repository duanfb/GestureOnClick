package com.example.gestureonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private View button;

    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        gestureDetector = new GestureDetector(this, new MyGestureListener());

        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.i(TAG,"on touch button");
                return gestureDetector.onTouchEvent(motionEvent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"on click button");
            }
        });
    }

    class MyGestureListener implements GestureDetector.OnGestureListener {

        @Override
        public boolean onDown(MotionEvent motionEvent) {
            Log.i(TAG,"GestureDetector onDown");
            return false;
        }

        @Override
        public void onShowPress(MotionEvent motionEvent) {
            Log.i(TAG,"GestureDetector onShowPress");
        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            Log.i(TAG,"GestureDetector onSingleTapUp");
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            Log.i(TAG,"GestureDetector onScroll v==" + v + "   v1==" + v1);
            return false;
        }

        @Override
        public void onLongPress(MotionEvent motionEvent) {
            Log.i(TAG,"GestureDetector onLongPress");
        }

        @Override
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            Log.i(TAG,"GestureDetector onFling v==" + v + "   v1==" + v1);
            return false;
        }
    }
}
