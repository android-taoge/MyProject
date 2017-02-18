package com.rainbow.kitchen.activity.reciperecommenditemclick;

import android.content.Context;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

import com.rainbow.kitchen.R;
import com.rainbow.kitchen.constants.MyURL;
import com.rainbow.kitchen.fragment.recipefragment.recommenditems.BannerItemfragment;

public class Banner1 extends AppCompatActivity {


    BannerItemfragment bannerItemfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner1);
        bannerItemfragment=new BannerItemfragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.add(R.id.framelayout01, bannerItemfragment);
        transaction.show(bannerItemfragment);
        transaction.commit();
    }
}
