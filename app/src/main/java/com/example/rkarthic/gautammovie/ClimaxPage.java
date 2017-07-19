package com.example.rkarthic.gautammovie;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by rkarthic on 03-07-2017.
 */

public class ClimaxPage extends Activity{

    ImageView ivBgMatrix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.climaxpage);

        ivBgMatrix = (ImageView) findViewById(R.id.ivBgMatrixClimax);
        AnimationDrawable bgAnimation = (AnimationDrawable) ivBgMatrix.getBackground();
        bgAnimation.start();
    }
}
