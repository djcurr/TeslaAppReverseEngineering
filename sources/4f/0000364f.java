package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.b;

/* loaded from: classes3.dex */
public final class f<S extends b> extends g {

    /* renamed from: y  reason: collision with root package name */
    private static final f4.c<f> f15520y = new a("indicatorLevel");

    /* renamed from: p  reason: collision with root package name */
    private h<S> f15521p;

    /* renamed from: q  reason: collision with root package name */
    private final f4.e f15522q;

    /* renamed from: t  reason: collision with root package name */
    private final f4.d f15523t;

    /* renamed from: w  reason: collision with root package name */
    private float f15524w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f15525x;

    /* loaded from: classes3.dex */
    static class a extends f4.c<f> {
        a(String str) {
            super(str);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(f fVar) {
            return fVar.x() * 10000.0f;
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(f fVar, float f11) {
            fVar.z(f11 / 10000.0f);
        }
    }

    f(Context context, b bVar, h<S> hVar) {
        super(context, bVar);
        this.f15525x = false;
        y(hVar);
        f4.e eVar = new f4.e();
        this.f15522q = eVar;
        eVar.d(1.0f);
        eVar.f(50.0f);
        f4.d dVar = new f4.d(this, f15520y);
        this.f15523t = dVar;
        dVar.p(eVar);
        m(1.0f);
    }

    public static f<e> u(Context context, e eVar) {
        return new f<>(context, eVar, new c(eVar));
    }

    public static f<n> v(Context context, n nVar) {
        return new f<>(context, nVar, new k(nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float x() {
        return this.f15524w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(float f11) {
        this.f15524w = f11;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(float f11) {
        setLevel((int) (f11 * 10000.0f));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f15521p.g(canvas, g());
            this.f15521p.c(canvas, this.f15539m);
            this.f15521p.b(canvas, this.f15539m, BitmapDescriptorFactory.HUE_RED, x(), kk.a.a(this.f15528b.f15494c[0], getAlpha()));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f15521p.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f15521p.e();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f15523t.q();
        z(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        if (this.f15525x) {
            this.f15523t.q();
            z(i11 / 10000.0f);
            return true;
        }
        this.f15523t.h(x() * 10000.0f);
        this.f15523t.l(i11);
        return true;
    }

    @Override // com.google.android.material.progressindicator.g
    boolean q(boolean z11, boolean z12, boolean z13) {
        boolean q11 = super.q(z11, z12, z13);
        float a11 = this.f15529c.a(this.f15527a.getContentResolver());
        if (a11 == BitmapDescriptorFactory.HUE_RED) {
            this.f15525x = true;
        } else {
            this.f15525x = false;
            this.f15522q.f(50.0f / a11);
        }
        return q11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h<S> w() {
        return this.f15521p;
    }

    void y(h<S> hVar) {
        this.f15521p = hVar;
        hVar.f(this);
    }
}