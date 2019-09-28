package com.example.myapplication.brickbreakoutgame;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.IOException;
import java.util.Random;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

private Thread thread = null;
private Context context;

public class SnakeEngine extends SurfaceView implements Runnable {

    public SnakeEngine(Context context, Point size) {
        super(context);
    }

    @Override
    public void run() {

    }
}
