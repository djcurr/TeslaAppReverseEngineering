package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes3.dex */
public final class n extends b {

    /* renamed from: g  reason: collision with root package name */
    public int f15574g;

    /* renamed from: h  reason: collision with root package name */
    public int f15575h;

    /* renamed from: i  reason: collision with root package name */
    boolean f15576i;

    public n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.f26385u);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.b
    public void e() {
        if (this.f15574g == 0) {
            if (this.f15493b <= 0) {
                if (this.f15494c.length < 3) {
                    throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                }
                return;
            }
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        }
    }

    public n(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, LinearProgressIndicator.f15473o);
    }

    public n(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray h11 = com.google.android.material.internal.j.h(context, attributeSet, fk.k.f26592m1, fk.b.f26385u, LinearProgressIndicator.f15473o, new int[0]);
        this.f15574g = h11.getInt(fk.k.f26598n1, 1);
        this.f15575h = h11.getInt(fk.k.f26604o1, 0);
        h11.recycle();
        e();
        this.f15576i = this.f15575h == 1;
    }
}