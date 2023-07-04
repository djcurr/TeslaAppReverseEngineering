package com.facebook.react.views.slider;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.t;

/* loaded from: classes3.dex */
public class a extends t {

    /* renamed from: g  reason: collision with root package name */
    private static int f12585g = 128;

    /* renamed from: b  reason: collision with root package name */
    private double f12586b;

    /* renamed from: c  reason: collision with root package name */
    private double f12587c;

    /* renamed from: d  reason: collision with root package name */
    private double f12588d;

    /* renamed from: e  reason: collision with root package name */
    private double f12589e;

    /* renamed from: f  reason: collision with root package name */
    private double f12590f;

    public a(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f12586b = 0.0d;
        this.f12587c = 0.0d;
        this.f12588d = 0.0d;
        this.f12589e = 0.0d;
        this.f12590f = 0.0d;
        a();
    }

    private void c() {
        if (this.f12589e == 0.0d) {
            this.f12590f = (this.f12587c - this.f12586b) / f12585g;
        }
        setMax(getTotalSteps());
        d();
    }

    private void d() {
        double d11 = this.f12588d;
        double d12 = this.f12586b;
        setProgress((int) Math.round(((d11 - d12) / (this.f12587c - d12)) * getTotalSteps()));
    }

    private double getStepValue() {
        double d11 = this.f12589e;
        return d11 > 0.0d ? d11 : this.f12590f;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f12587c - this.f12586b) / getStepValue());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 || i11 >= 26) {
            return;
        }
        super.setStateListAnimator(null);
    }

    public double b(int i11) {
        if (i11 == getMax()) {
            return this.f12587c;
        }
        return (i11 * getStepValue()) + this.f12586b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxValue(double d11) {
        this.f12587c = d11;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMinValue(double d11) {
        this.f12586b = d11;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStep(double d11) {
        this.f12589e = d11;
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setValue(double d11) {
        this.f12588d = d11;
        d();
    }
}