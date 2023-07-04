package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.i;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class b extends i implements m {

    /* renamed from: z  reason: collision with root package name */
    private String f12578z = "Normal";
    private final SparseIntArray A = new SparseIntArray();
    private final SparseIntArray B = new SparseIntArray();
    private final Set<Integer> C = new HashSet();

    public b() {
        q1();
    }

    private void q1() {
        S0(this);
    }

    @Override // com.facebook.yoga.m
    public long B(p pVar, float f11, n nVar, float f12, n nVar2) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(p1());
        if (!this.C.contains(Integer.valueOf(styleFromString))) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(R(), styleFromString);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.A.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.B.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.C.add(Integer.valueOf(styleFromString));
        }
        return o.b(this.B.get(styleFromString), this.A.get(styleFromString));
    }

    public String p1() {
        return this.f12578z;
    }

    @ng.a(name = "styleAttr")
    public void setStyle(String str) {
        if (str == null) {
            str = "Normal";
        }
        this.f12578z = str;
    }
}