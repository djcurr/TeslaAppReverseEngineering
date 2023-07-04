package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m extends i<ObjectAnimator> {

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f15561l = {533, 567, 850, 750};

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f15562m = {1267, 1000, 333, 0};

    /* renamed from: n  reason: collision with root package name */
    private static final Property<m, Float> f15563n = new c(Float.class, "animationFraction");

    /* renamed from: d  reason: collision with root package name */
    private ObjectAnimator f15564d;

    /* renamed from: e  reason: collision with root package name */
    private ObjectAnimator f15565e;

    /* renamed from: f  reason: collision with root package name */
    private final Interpolator[] f15566f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f15567g;

    /* renamed from: h  reason: collision with root package name */
    private int f15568h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15569i;

    /* renamed from: j  reason: collision with root package name */
    private float f15570j;

    /* renamed from: k  reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b f15571k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            m mVar = m.this;
            mVar.f15568h = (mVar.f15568h + 1) % m.this.f15567g.f15494c.length;
            m.this.f15569i = true;
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
            m.this.a();
            m mVar = m.this;
            androidx.vectordrawable.graphics.drawable.b bVar = mVar.f15571k;
            if (bVar != null) {
                bVar.a(mVar.f15545a);
            }
        }
    }

    /* loaded from: classes3.dex */
    static class c extends Property<m, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(m mVar) {
            return Float.valueOf(mVar.n());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(m mVar, Float f11) {
            mVar.r(f11.floatValue());
        }
    }

    public m(Context context, n nVar) {
        super(2);
        this.f15568h = 0;
        this.f15571k = null;
        this.f15567g = nVar;
        this.f15566f = new Interpolator[]{androidx.vectordrawable.graphics.drawable.d.b(context, fk.a.f26357a), androidx.vectordrawable.graphics.drawable.d.b(context, fk.a.f26358b), androidx.vectordrawable.graphics.drawable.d.b(context, fk.a.f26359c), androidx.vectordrawable.graphics.drawable.d.b(context, fk.a.f26360d)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f15570j;
    }

    private void o() {
        if (this.f15564d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f15563n, BitmapDescriptorFactory.HUE_RED, 1.0f);
            this.f15564d = ofFloat;
            ofFloat.setDuration(1800L);
            this.f15564d.setInterpolator(null);
            this.f15564d.setRepeatCount(-1);
            this.f15564d.addListener(new a());
        }
        if (this.f15565e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f15563n, 1.0f);
            this.f15565e = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f15565e.setInterpolator(null);
            this.f15565e.addListener(new b());
        }
    }

    private void p() {
        if (this.f15569i) {
            Arrays.fill(this.f15547c, kk.a.a(this.f15567g.f15494c[this.f15568h], this.f15545a.getAlpha()));
            this.f15569i = false;
        }
    }

    private void s(int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            this.f15546b[i12] = Math.max((float) BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, this.f15566f[i12].getInterpolation(b(i11, f15562m[i12], f15561l[i12]))));
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void a() {
        ObjectAnimator objectAnimator = this.f15564d;
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
        this.f15571k = bVar;
    }

    @Override // com.google.android.material.progressindicator.i
    public void f() {
        ObjectAnimator objectAnimator = this.f15565e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f15545a.isVisible()) {
            this.f15565e.setFloatValues(this.f15570j, 1.0f);
            this.f15565e.setDuration((1.0f - this.f15570j) * 1800.0f);
            this.f15565e.start();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void g() {
        o();
        q();
        this.f15564d.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f15571k = null;
    }

    void q() {
        this.f15568h = 0;
        int a11 = kk.a.a(this.f15567g.f15494c[0], this.f15545a.getAlpha());
        int[] iArr = this.f15547c;
        iArr[0] = a11;
        iArr[1] = a11;
    }

    void r(float f11) {
        this.f15570j = f11;
        s((int) (f11 * 1800.0f));
        p();
        this.f15545a.invalidateSelf();
    }
}