package com.eltropy.extendedscrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

/**
 * Created by adheeshbhatia on 25/09/15.
 */
public class ExtendedScrollView extends ScrollView {

    OnBottomReachedListener mBottomReached;

    public ExtendedScrollView(Context context, AttributeSet attrs,
                              int defStyle) {
        super(context, attrs, defStyle);
    }

    public ExtendedScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ExtendedScrollView(Context context) {
        super(context);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        View view = getChildAt(getChildCount() - 1);

        int dif = (view.getBottom() - (getHeight() + getScrollY()));

        if (dif == 0 && mBottomReached != null) {
            mBottomReached.onBottomReached();
        }

        super.onScrollChanged(l, t, oldl, oldt);
    }

    public OnBottomReachedListener getOnBottomReachedListener() {
        return mBottomReached;
    }

    public void setOnBottomReachedListener(
            OnBottomReachedListener onBottomReachedListener) {
        mBottomReached = onBottomReachedListener;
    }

    public interface OnBottomReachedListener {
        public void onBottomReached();
    }
}
