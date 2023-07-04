package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

/* loaded from: classes3.dex */
class a extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private Integer f12573a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f12574b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12575c;

    /* renamed from: d  reason: collision with root package name */
    private double f12576d;

    /* renamed from: e  reason: collision with root package name */
    private ProgressBar f12577e;

    public a(Context context) {
        super(context);
        this.f12574b = true;
        this.f12575c = true;
    }

    private void c(ProgressBar progressBar) {
        Drawable progressDrawable;
        if (progressBar.isIndeterminate()) {
            progressDrawable = progressBar.getIndeterminateDrawable();
        } else {
            progressDrawable = progressBar.getProgressDrawable();
        }
        if (progressDrawable == null) {
            return;
        }
        Integer num = this.f12573a;
        if (num != null) {
            progressDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            progressDrawable.clearColorFilter();
        }
    }

    public void a() {
        ProgressBar progressBar = this.f12577e;
        if (progressBar != null) {
            progressBar.setIndeterminate(this.f12574b);
            c(this.f12577e);
            this.f12577e.setProgress((int) (this.f12576d * 1000.0d));
            if (this.f12575c) {
                this.f12577e.setVisibility(0);
                return;
            } else {
                this.f12577e.setVisibility(4);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("setStyle() not called");
    }

    public void b(boolean z11) {
        this.f12575c = z11;
    }

    public void d(Integer num) {
        this.f12573a = num;
    }

    public void e(boolean z11) {
        this.f12574b = z11;
    }

    public void f(double d11) {
        this.f12576d = d11;
    }

    public void g(String str) {
        ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.f12577e = createProgressBar;
        createProgressBar.setMax(1000);
        removeAllViews();
        addView(this.f12577e, new ViewGroup.LayoutParams(-1, -1));
    }
}