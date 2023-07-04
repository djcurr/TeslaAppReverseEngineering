package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;

/* loaded from: classes6.dex */
public final class p extends com.facebook.react.views.view.g {

    /* renamed from: a  reason: collision with root package name */
    private int f21305a;

    /* renamed from: b  reason: collision with root package name */
    private int f21306b;

    /* renamed from: c  reason: collision with root package name */
    private a f21307c;

    /* loaded from: classes6.dex */
    public enum a {
        LEFT,
        CENTER,
        RIGHT,
        BACK
    }

    public p(ReactContext reactContext) {
        super(reactContext);
        this.f21307c = a.RIGHT;
    }

    public final a getType() {
        return this.f21307c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    @Override // com.facebook.react.views.view.g, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (View.MeasureSpec.getMode(i11) == 1073741824 && View.MeasureSpec.getMode(i12) == 1073741824) {
            this.f21305a = View.MeasureSpec.getSize(i11);
            this.f21306b = View.MeasureSpec.getSize(i12);
            ViewParent parent = getParent();
            if (parent != null) {
                forceLayout();
                ((View) parent).requestLayout();
            }
        }
        setMeasuredDimension(this.f21305a, this.f21306b);
    }

    public final void setType(a aVar) {
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        this.f21307c = aVar;
    }
}