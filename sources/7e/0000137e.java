package com.adyen.threeds2.internal.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;

/* loaded from: classes.dex */
final class NonScrollableListView extends ListView {
    public NonScrollableListView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    public NonScrollableListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NonScrollableListView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}