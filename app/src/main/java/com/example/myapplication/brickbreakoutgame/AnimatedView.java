package com.example.myapplication.brickbreakoutgame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimatedView extends ImageView {
    private Context mContext;
    int m = 100;
    int e = 390;
    int x = -1;
    int y = -1;
    public int score = 0;
    private int xVelocity = 10;
    private int yVelocity = 5;
    private Handler h;
    private final int FRAME_RATE = 30;

    public AnimatedView(Context context, AttributeSet attrs)  {
        super(context, attrs);
        mContext = context;
        h = new Handler();
    }
    private Runnable r = new Runnable() {
        @Override
        public void run() {
            invalidate();
        }
    };

    protected void onDraw(Canvas c) {

        BitmapDrawable ball = (BitmapDrawable) mContext.getResources().getDrawable(R.drawable.beachball);
        BitmapDrawable lifesaver = (BitmapDrawable) mContext.getResources().getDrawable(R.drawable.lifesaver);
        BitmapDrawable scored = (BitmapDrawable) mContext.getResources().getDrawable(R.drawable.score);


        if (x < 0 && y < 0) {
                x = this.getWidth() / 2;
                y = this.getHeight() / 2;
            } else {
                x += xVelocity;
                y += yVelocity;
                if ((x > this.getWidth() - ball.getBitmap().getWidth()) || (x < 0)) {
                    xVelocity = xVelocity * -1;
                }
                if ((y > this.getHeight() - ball.getBitmap().getHeight()) || (y < 0)) {
                    yVelocity = yVelocity * -1;
                }
                if((380>x) && (x<392) || (100<y) && (y<102)) {
                    score = score + 1;
                }
            }
            c.drawBitmap(ball.getBitmap(), x, y, null);
            c.drawBitmap(lifesaver.getBitmap(), e, m, null);
            h.postDelayed(r, FRAME_RATE);
        }
    }
