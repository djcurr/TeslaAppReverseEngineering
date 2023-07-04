package com.google.android.material.progressindicator;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class i<T extends Animator> {

    /* renamed from: a  reason: collision with root package name */
    protected j f15545a;

    /* renamed from: b  reason: collision with root package name */
    protected final float[] f15546b;

    /* renamed from: c  reason: collision with root package name */
    protected final int[] f15547c;

    /* JADX INFO: Access modifiers changed from: protected */
    public i(int i11) {
        this.f15546b = new float[i11 * 2];
        this.f15547c = new int[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public float b(int i11, int i12, int i13) {
        return (i11 - i12) / i13;
    }

    public abstract void c();

    public abstract void d(androidx.vectordrawable.graphics.drawable.b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(j jVar) {
        this.f15545a = jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void g();

    public abstract void h();
}