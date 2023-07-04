package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k extends h<n> {

    /* renamed from: c  reason: collision with root package name */
    private float f15550c;

    /* renamed from: d  reason: collision with root package name */
    private float f15551d;

    /* renamed from: e  reason: collision with root package name */
    private float f15552e;

    public k(n nVar) {
        super(nVar);
        this.f15550c = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.h
    public void a(Canvas canvas, float f11) {
        Rect clipBounds = canvas.getClipBounds();
        this.f15550c = clipBounds.width();
        float f12 = ((n) this.f15543a).f15492a;
        canvas.translate(clipBounds.left + (clipBounds.width() / 2.0f), clipBounds.top + (clipBounds.height() / 2.0f) + Math.max((float) BitmapDescriptorFactory.HUE_RED, (clipBounds.height() - ((n) this.f15543a).f15492a) / 2.0f));
        if (((n) this.f15543a).f15576i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f15544b.j() && ((n) this.f15543a).f15496e == 1) || (this.f15544b.i() && ((n) this.f15543a).f15497f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f15544b.j() || this.f15544b.i()) {
            canvas.translate(BitmapDescriptorFactory.HUE_RED, (((n) this.f15543a).f15492a * (f11 - 1.0f)) / 2.0f);
        }
        float f13 = this.f15550c;
        canvas.clipRect((-f13) / 2.0f, (-f12) / 2.0f, f13 / 2.0f, f12 / 2.0f);
        S s11 = this.f15543a;
        this.f15551d = ((n) s11).f15492a * f11;
        this.f15552e = ((n) s11).f15493b * f11;
    }

    @Override // com.google.android.material.progressindicator.h
    public void b(Canvas canvas, Paint paint, float f11, float f12, int i11) {
        if (f11 == f12) {
            return;
        }
        float f13 = this.f15550c;
        float f14 = this.f15552e;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i11);
        float f15 = this.f15551d;
        RectF rectF = new RectF(((-f13) / 2.0f) + (f11 * (f13 - (f14 * 2.0f))), (-f15) / 2.0f, ((-f13) / 2.0f) + (f12 * (f13 - (f14 * 2.0f))) + (f14 * 2.0f), f15 / 2.0f);
        float f16 = this.f15552e;
        canvas.drawRoundRect(rectF, f16, f16, paint);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.h
    public void c(Canvas canvas, Paint paint) {
        int a11 = kk.a.a(((n) this.f15543a).f15495d, this.f15544b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a11);
        float f11 = this.f15550c;
        float f12 = this.f15551d;
        RectF rectF = new RectF((-f11) / 2.0f, (-f12) / 2.0f, f11 / 2.0f, f12 / 2.0f);
        float f13 = this.f15552e;
        canvas.drawRoundRect(rectF, f13, f13, paint);
    }

    @Override // com.google.android.material.progressindicator.h
    public int d() {
        return ((n) this.f15543a).f15492a;
    }

    @Override // com.google.android.material.progressindicator.h
    public int e() {
        return -1;
    }
}