package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public final class e extends b {

    /* renamed from: g  reason: collision with root package name */
    public int f15517g;

    /* renamed from: h  reason: collision with root package name */
    public int f15518h;

    /* renamed from: i  reason: collision with root package name */
    public int f15519i;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.f26372h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.b
    public void e() {
    }

    public e(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, CircularProgressIndicator.f15472o);
    }

    public e(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(fk.d.P);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(fk.d.O);
        TypedArray h11 = com.google.android.material.internal.j.h(context, attributeSet, fk.k.P0, i11, i12, new int[0]);
        this.f15517g = Math.max(tk.c.c(context, h11, fk.k.S0, dimensionPixelSize), this.f15492a * 2);
        this.f15518h = tk.c.c(context, h11, fk.k.R0, dimensionPixelSize2);
        this.f15519i = h11.getInt(fk.k.Q0, 0);
        h11.recycle();
        e();
    }
}