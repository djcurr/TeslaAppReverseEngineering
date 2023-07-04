package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.progressindicator.b;

/* loaded from: classes3.dex */
public final class j<S extends b> extends g {

    /* renamed from: p  reason: collision with root package name */
    private h<S> f15548p;

    /* renamed from: q  reason: collision with root package name */
    private i<ObjectAnimator> f15549q;

    j(Context context, b bVar, h<S> hVar, i<ObjectAnimator> iVar) {
        super(context, bVar);
        x(hVar);
        w(iVar);
    }

    public static j<e> s(Context context, e eVar) {
        return new j<>(context, eVar, new c(eVar), new d(eVar));
    }

    public static j<n> t(Context context, n nVar) {
        return new j<>(context, nVar, new k(nVar), nVar.f15574g == 0 ? new l(nVar) : new m(context, nVar));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.f15548p.g(canvas, g());
        this.f15548p.c(canvas, this.f15539m);
        int i11 = 0;
        while (true) {
            i<ObjectAnimator> iVar = this.f15549q;
            int[] iArr = iVar.f15547c;
            if (i11 < iArr.length) {
                h<S> hVar = this.f15548p;
                Paint paint = this.f15539m;
                float[] fArr = iVar.f15546b;
                int i12 = i11 * 2;
                hVar.b(canvas, paint, fArr[i12], fArr[i12 + 1], iArr[i11]);
                i11++;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f15548p.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f15548p.e();
    }

    @Override // com.google.android.material.progressindicator.g
    boolean q(boolean z11, boolean z12, boolean z13) {
        boolean q11 = super.q(z11, z12, z13);
        if (!isRunning()) {
            this.f15549q.a();
        }
        float a11 = this.f15529c.a(this.f15527a.getContentResolver());
        if (z11 && (z13 || (Build.VERSION.SDK_INT <= 21 && a11 > BitmapDescriptorFactory.HUE_RED))) {
            this.f15549q.g();
        }
        return q11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i<ObjectAnimator> u() {
        return this.f15549q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h<S> v() {
        return this.f15548p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void w(i<ObjectAnimator> iVar) {
        this.f15549q = iVar;
        iVar.e(this);
    }

    void x(h<S> hVar) {
        this.f15548p = hVar;
        hVar.f(this);
    }
}