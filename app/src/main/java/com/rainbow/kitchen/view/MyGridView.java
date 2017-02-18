package com.rainbow.kitchen.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * Created by tsngtso on 2017/1/5.
 */

public class MyGridView extends GridView{
    public MyGridView(Context context) {
        super(context);
    }

    public MyGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandHeightMeasureSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandHeightMeasureSpec);
    }


}
