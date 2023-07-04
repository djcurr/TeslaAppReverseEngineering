package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class l extends i<ObjectAnimator> {

    /* renamed from: j  reason: collision with root package name */
    private static final Property<l, Float> f15553j = new b(Float.class, "animationFraction");

    /* renamed from: d  reason: collision with root package name */
    private ObjectAnimator f15554d;

    /* renamed from: e  reason: collision with root package name */
    private i4.b f15555e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f15556f;

    /* renamed from: g  reason: collision with root package name */
    private int f15557g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15558h;

    /* renamed from: i  reason: collision with root package name */
    private float f15559i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            l lVar = l.this;
            lVar.f15557g = (lVar.f15557g + 1) % l.this.f15556f.f15494c.length;
            l.this.f15558h = true;
        }
    }

    /* loaded from: classes3.dex */
    static class b extends Property<l, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(l lVar) {
            return Float.valueOf(lVar.n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(l lVar, Float f11) {
            lVar.r(f11.floatValue());
        }
    }

    public l(n nVar) {
        super(3);
        this.f15557g = 1;
        this.f15556f = nVar;
        this.f15555e = new i4.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f15559i;
    }

    private void o() {
        if (this.f15554d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f15553j, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f15554d = ofFloat;
            ofFloat.setDuration(333L);
            this.f15554d.setInterpolator(null);
            this.f15554d.setRepeatCount(-1);
            this.f15554d.addListener(new a());
        }
    }

    private void p() {
        if (!this.f15558h || this.f15546b[3] >= 1.0f) {
            return;
        }
        int[] iArr = this.f15547c;
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = kk.a.a(this.f15556f.f15494c[this.f15557g], this.f15545a.getAlpha());
        this.f15558h = false;
    }

    private void s(int i11) {
        this.f15546b[0] = 0.0f;
        float b11 = b(i11, 0, 667);
        float[] fArr = this.f15546b;
        float interpolation = this.f15555e.getInterpolation(b11);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f15546b;
        float interpolation2 = this.f15555e.getInterpolation(b11 + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f15546b[5] = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    public void a() {
        ObjectAnimator objectAnimator = this.f15554d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        q();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
    }

    @Override // com.google.android.material.progressindicator.i
    public void f() {
    }

    @Override // com.google.android.material.progressindicator.i
    public void g() {
        o();
        q();
        this.f15554d.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
    }

    void q() {
        this.f15558h = true;
        this.f15557g = 1;
        Arrays.fill(this.f15547c, kk.a.a(this.f15556f.f15494c[0], this.f15545a.getAlpha()));
    }

    void r(float f11) {
        this.f15559i = f11;
        s((int) (f11 * 333.0f));
        p();
        this.f15545a.invalidateSelf();
    }
}