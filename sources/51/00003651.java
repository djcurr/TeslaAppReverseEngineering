package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class g extends Drawable implements Animatable {

    /* renamed from: o  reason: collision with root package name */
    private static final Property<g, Float> f15526o = new c(Float.class, "growFraction");

    /* renamed from: a  reason: collision with root package name */
    final Context f15527a;

    /* renamed from: b  reason: collision with root package name */
    final com.google.android.material.progressindicator.b f15528b;

    /* renamed from: d  reason: collision with root package name */
    private ValueAnimator f15530d;

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f15531e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f15532f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f15533g;

    /* renamed from: h  reason: collision with root package name */
    private float f15534h;

    /* renamed from: i  reason: collision with root package name */
    private List<androidx.vectordrawable.graphics.drawable.b> f15535i;

    /* renamed from: j  reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.b f15536j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15537k;

    /* renamed from: l  reason: collision with root package name */
    private float f15538l;

    /* renamed from: n  reason: collision with root package name */
    private int f15540n;

    /* renamed from: m  reason: collision with root package name */
    final Paint f15539m = new Paint();

    /* renamed from: c  reason: collision with root package name */
    rk.a f15529c = new rk.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            g.this.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            g.super.setVisible(false, false);
            g.this.d();
        }
    }

    /* loaded from: classes3.dex */
    static class c extends Property<g, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(g gVar) {
            return Float.valueOf(gVar.g());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(g gVar, Float f11) {
            gVar.m(f11.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Context context, com.google.android.material.progressindicator.b bVar) {
        this.f15527a = context;
        this.f15528b = bVar;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f15536j;
        if (bVar != null) {
            bVar.a(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f15535i;
        if (list == null || this.f15537k) {
            return;
        }
        for (androidx.vectordrawable.graphics.drawable.b bVar2 : list) {
            bVar2.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f15536j;
        if (bVar != null) {
            bVar.b(this);
        }
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f15535i;
        if (list == null || this.f15537k) {
            return;
        }
        for (androidx.vectordrawable.graphics.drawable.b bVar2 : list) {
            bVar2.b(this);
        }
    }

    private void f(ValueAnimator... valueAnimatorArr) {
        boolean z11 = this.f15537k;
        this.f15537k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f15537k = z11;
    }

    private void k() {
        if (this.f15530d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f15526o, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f15530d = ofFloat;
            ofFloat.setDuration(500L);
            this.f15530d.setInterpolator(gk.a.f27994b);
            o(this.f15530d);
        }
        if (this.f15531e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f15526o, 1.0f, BitmapDescriptorFactory.HUE_RED);
            this.f15531e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f15531e.setInterpolator(gk.a.f27994b);
            n(this.f15531e);
        }
    }

    private void n(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f15531e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f15531e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void o(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f15530d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f15530d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float g() {
        if (this.f15528b.b() || this.f15528b.a()) {
            if (!this.f15533g && !this.f15532f) {
                return this.f15538l;
            }
            return this.f15534h;
        }
        return 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f15540n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h() {
        return p(false, false, false);
    }

    public boolean i() {
        ValueAnimator valueAnimator = this.f15531e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f15533g;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return j() || i();
    }

    public boolean j() {
        ValueAnimator valueAnimator = this.f15530d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f15532f;
    }

    public void l(androidx.vectordrawable.graphics.drawable.b bVar) {
        if (this.f15535i == null) {
            this.f15535i = new ArrayList();
        }
        if (this.f15535i.contains(bVar)) {
            return;
        }
        this.f15535i.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(float f11) {
        if (this.f15538l != f11) {
            this.f15538l = f11;
            invalidateSelf();
        }
    }

    public boolean p(boolean z11, boolean z12, boolean z13) {
        return q(z11, z12, z13 && this.f15529c.a(this.f15527a.getContentResolver()) > BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q(boolean z11, boolean z12, boolean z13) {
        k();
        if (isVisible() || z11) {
            ValueAnimator valueAnimator = z11 ? this.f15530d : this.f15531e;
            if (!z13) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.end();
                } else {
                    f(valueAnimator);
                }
                return super.setVisible(z11, false);
            } else if (z13 && valueAnimator.isRunning()) {
                return false;
            } else {
                boolean z14 = !z11 || super.setVisible(z11, false);
                if (!(z11 ? this.f15528b.b() : this.f15528b.a())) {
                    f(valueAnimator);
                    return z14;
                }
                if (!z12 && Build.VERSION.SDK_INT >= 19 && valueAnimator.isPaused()) {
                    valueAnimator.resume();
                } else {
                    valueAnimator.start();
                }
                return z14;
            }
        }
        return false;
    }

    public boolean r(androidx.vectordrawable.graphics.drawable.b bVar) {
        List<androidx.vectordrawable.graphics.drawable.b> list = this.f15535i;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f15535i.remove(bVar);
        if (this.f15535i.isEmpty()) {
            this.f15535i = null;
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f15540n = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f15539m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        return p(z11, z12, true);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        q(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        q(false, true, false);
    }
}