package com.example.enlargeactivity;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Fragment_Start extends Fragment {
    private Button btnStart;
    private ImageView imageView;
    private Handler handler = new Handler();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_start, container, false);
        imageView = (ImageView) view.findViewById(R.id.imageViewUniverse);
        btnStart = (Button) view.findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //开始按钮的点击事件
                Animation animation = AnimationUtils.loadAnimation(view.getContext(), R.anim.enlarge);
                animation.setFillAfter(false); //最后停留的页面是否为放大后的页面
                handler.postDelayed(runnable, 1500);//让按钮延迟一秒后消失
                imageView.startAnimation(animation);
            }
        });
        return view;
    }
    Runnable runnable =new Runnable() {
        @Override
        public void run() {
            btnStart.setVisibility(View.GONE);
        }
    };
}


