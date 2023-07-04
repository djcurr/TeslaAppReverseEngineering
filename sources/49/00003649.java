package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class d extends i<ObjectAnimator> {

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f15502l = {0, 1350, 2700, 4050};

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f15503m = {667, 2017, 3367, 4717};

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f15504n = {1000, 2350, 3700, 5050};

    /* renamed from: o  reason: collision with root package name */
    private static final Property<d, Float> f15505o = new c(Float.class, "animationFraction");

    /* renamed from: p  reason: collision with root package name */
    private static final Property<d, Float> f15506p = new C0278d(Float.class, "completeEndFraction");

    /* renamed from: d  reason: collision with root package name */
    private ObjectAnimator f15507d;

    /* renamed from: e  reason: collision with root package name */
    private ObjectAnimator f15508e;

    /* renamed from: f  reason: collision with root package name */
    private final i4.b f15509f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f15510g;

    /* renamed from: h  reason: collision with root package name */
    private int f15511h;

    /* renamed from: i  reason: collision with root package name */
    private float f15512i;

    /* renamed from: j  reason: collision with root package name */
    private float f15513j;

    /* renamed from: k  reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b f15514k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            d dVar = d.this;
            dVar.f15511h = (dVar.f15511h + 4) % d.this.f15510g.f15494c.length;
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
            d.this.a();
            d dVar = d.this;
            androidx.vectordrawable.graphics.drawable.b bVar = dVar.f15514k;
            if (bVar != null) {
                bVar.a(dVar.f15545a);
            }
        }
    }

    /* loaded from: classes3.dex */
    static class c extends Property<d, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(d dVar) {
            return Float.valueOf(dVar.o());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(d dVar, Float f11) {
            dVar.t(f11.floatValue());
        }
    }

    /* renamed from: com.google.android.material.progressindicator.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0278d extends Property<d, Float> {
        C0278d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(d dVar) {
            return Float.valueOf(dVar.p());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(d dVar, Float f11) {
            dVar.u(f11.floatValue());
        }
    }

    public d(e eVar) {
        super(1);
        this.f15511h = 0;
        this.f15514k = null;
        this.f15510g = eVar;
        this.f15509f = new i4.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float o() {
        return this.f15512i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f15513j;
    }

    private void q() {
        if (this.f15507d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f15505o, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f15507d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f15507d.setInterpolator(null);
            this.f15507d.setRepeatCount(-1);
            this.f15507d.addListener(new a());
        }
        if (this.f15508e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f15506p, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f15508e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f15508e.setInterpolator(this.f15509f);
            this.f15508e.addListener(new b());
        }
    }

    private void r(int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            float b11 = b(i11, f15504n[i12], 333);
            if (b11 >= BitmapDescriptorFactory.HUE_RED && b11 <= 1.0f) {
                int i13 = i12 + this.f15511h;
                int[] iArr = this.f15510g.f15494c;
                int length = i13 % iArr.length;
                this.f15547c[0] = gk.c.b().evaluate(this.f15509f.getInterpolation(b11), Integer.valueOf(kk.a.a(iArr[length], this.f15545a.getAlpha())), Integer.valueOf(kk.a.a(this.f15510g.f15494c[(length + 1) % iArr.length], this.f15545a.getAlpha()))).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(float f11) {
        this.f15513j = f11;
    }

    private void v(int i11) {
        float[] fArr = this.f15546b;
        float f11 = this.f15512i;
        fArr[0] = (f11 * 1520.0f) - 20.0f;
        fArr[1] = f11 * 1520.0f;
        for (int i12 = 0; i12 < 4; i12++) {
            float b11 = b(i11, f15502l[i12], 667);
            float[] fArr2 = this.f15546b;
            fArr2[1] = fArr2[1] + (this.f15509f.getInterpolation(b11) * 250.0f);
            float b12 = b(i11, f15503m[i12], 667);
            float[] fArr3 = this.f15546b;
            fArr3[0] = fArr3[0] + (this.f15509f.getInterpolation(b12) * 250.0f);
        }
        float[] fArr4 = this.f15546b;
        fArr4[0] = fArr4[0] + ((fArr4[1] - fArr4[0]) * this.f15513j);
        fArr4[0] = fArr4[0] / 360.0f;
        fArr4[1] = fArr4[1] / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    void a() {
        ObjectAnimator objectAnimator = this.f15507d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        s();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f15514k = bVar;
    }

    @Override // com.google.android.material.progressindicator.i
    void f() {
        ObjectAnimator objectAnimator = this.f15508e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f15545a.isVisible()) {
            this.f15508e.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    void g() {
        q();
        s();
        this.f15507d.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f15514k = null;
    }

    void s() {
        this.f15511h = 0;
        this.f15547c[0] = kk.a.a(this.f15510g.f15494c[0], this.f15545a.getAlpha());
        this.f15513j = BitmapDescriptorFactory.HUE_RED;
    }

    void t(float f11) {
        this.f15512i = f11;
        int i11 = (int) (f11 * 5400.0f);
        v(i11);
        r(i11);
        this.f15545a.invalidateSelf();
    }
}