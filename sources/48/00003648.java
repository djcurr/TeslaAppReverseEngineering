package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c extends h<e> {

    /* renamed from: c  reason: collision with root package name */
    private int f15498c;

    /* renamed from: d  reason: collision with root package name */
    private float f15499d;

    /* renamed from: e  reason: collision with root package name */
    private float f15500e;

    /* renamed from: f  reason: collision with root package name */
    private float f15501f;

    public c(e eVar) {
        super(eVar);
        this.f15498c = 1;
    }

    private void h(Canvas canvas, Paint paint, float f11, float f12, float f13) {
        canvas.save();
        canvas.rotate(f13);
        float f14 = this.f15501f;
        float f15 = f11 / 2.0f;
        canvas.drawRoundRect(new RectF(f14 - f15, f12, f14 + f15, -f12), f12, f12, paint);
        canvas.restore();
    }

    private int i() {
        S s11 = this.f15543a;
        return ((e) s11).f15517g + (((e) s11).f15518h * 2);
    }

    @Override // com.google.android.material.progressindicator.h
    public void a(Canvas canvas, float f11) {
        S s11;
        S s12 = this.f15543a;
        float f12 = (((e) s12).f15517g / 2.0f) + ((e) s12).f15518h;
        canvas.translate(f12, f12);
        canvas.rotate(-90.0f);
        float f13 = -f12;
        canvas.clipRect(f13, f13, f12, f12);
        this.f15498c = ((e) this.f15543a).f15519i == 0 ? 1 : -1;
        this.f15499d = ((e) s11).f15492a * f11;
        this.f15500e = ((e) s11).f15493b * f11;
        this.f15501f = (((e) s11).f15517g - ((e) s11).f15492a) / 2.0f;
        if ((this.f15544b.j() && ((e) this.f15543a).f15496e == 2) || (this.f15544b.i() && ((e) this.f15543a).f15497f == 1)) {
            this.f15501f += ((1.0f - f11) * ((e) this.f15543a).f15492a) / 2.0f;
        } else if ((this.f15544b.j() && ((e) this.f15543a).f15496e == 1) || (this.f15544b.i() && ((e) this.f15543a).f15497f == 2)) {
            this.f15501f -= ((1.0f - f11) * ((e) this.f15543a).f15492a) / 2.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.h
    public void b(Canvas canvas, Paint paint, float f11, float f12, int i11) {
        if (f11 == f12) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i11);
        paint.setStrokeWidth(this.f15499d);
        int i12 = this.f15498c;
        float f13 = f11 * 360.0f * i12;
        float f14 = (f12 >= f11 ? f12 - f11 : (1.0f + f12) - f11) * 360.0f * i12;
        float f15 = this.f15501f;
        canvas.drawArc(new RectF(-f15, -f15, f15, f15), f13, f14, false, paint);
        if (this.f15500e <= BitmapDescriptorFactory.HUE_RED || Math.abs(f14) >= 360.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        h(canvas, paint, this.f15499d, this.f15500e, f13);
        h(canvas, paint, this.f15499d, this.f15500e, f13 + f14);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.h
    public void c(Canvas canvas, Paint paint) {
        int a11 = kk.a.a(((e) this.f15543a).f15495d, this.f15544b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a11);
        paint.setStrokeWidth(this.f15499d);
        float f11 = this.f15501f;
        canvas.drawArc(new RectF(-f11, -f11, f11, f11), BitmapDescriptorFactory.HUE_RED, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.h
    public int d() {
        return i();
    }

    @Override // com.google.android.material.progressindicator.h
    public int e() {
        return i();
    }
}