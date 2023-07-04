package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.material.progressindicator.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class h<S extends b> {

    /* renamed from: a  reason: collision with root package name */
    S f15543a;

    /* renamed from: b  reason: collision with root package name */
    protected g f15544b;

    public h(S s11) {
        this.f15543a = s11;
    }

    abstract void a(Canvas canvas, float f11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(Canvas canvas, Paint paint, float f11, float f12, int i11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int e();

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(g gVar) {
        this.f15544b = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas, float f11) {
        this.f15543a.e();
        a(canvas, f11);
    }
}