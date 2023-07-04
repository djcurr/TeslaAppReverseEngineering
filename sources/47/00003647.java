package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public int f15492a;

    /* renamed from: b  reason: collision with root package name */
    public int f15493b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f15494c = new int[0];

    /* renamed from: d  reason: collision with root package name */
    public int f15495d;

    /* renamed from: e  reason: collision with root package name */
    public int f15496e;

    /* renamed from: f  reason: collision with root package name */
    public int f15497f;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Context context, AttributeSet attributeSet, int i11, int i12) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(fk.d.Q);
        TypedArray h11 = com.google.android.material.internal.j.h(context, attributeSet, fk.k.f26596n, i11, i12, new int[0]);
        this.f15492a = tk.c.c(context, h11, fk.k.f26644v, dimensionPixelSize);
        this.f15493b = Math.min(tk.c.c(context, h11, fk.k.f26638u, 0), this.f15492a / 2);
        this.f15496e = h11.getInt(fk.k.f26620r, 0);
        this.f15497f = h11.getInt(fk.k.f26602o, 0);
        c(context, h11);
        d(context, h11);
        h11.recycle();
    }

    private void c(Context context, TypedArray typedArray) {
        int i11 = fk.k.f26608p;
        if (!typedArray.hasValue(i11)) {
            this.f15494c = new int[]{kk.a.b(context, fk.b.f26376l, -1)};
        } else if (typedArray.peekValue(i11).type != 1) {
            this.f15494c = new int[]{typedArray.getColor(i11, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i11, -1));
            this.f15494c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
    }

    private void d(Context context, TypedArray typedArray) {
        int i11 = fk.k.f26632t;
        if (typedArray.hasValue(i11)) {
            this.f15495d = typedArray.getColor(i11, -1);
            return;
        }
        this.f15495d = this.f15494c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f11 = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f15495d = kk.a.a(this.f15495d, (int) (f11 * 255.0f));
    }

    public boolean a() {
        return this.f15497f != 0;
    }

    public boolean b() {
        return this.f15496e != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();
}