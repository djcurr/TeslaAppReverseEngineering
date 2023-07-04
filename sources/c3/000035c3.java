package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.f;
import androidx.core.widget.c;
import fk.b;
import fk.j;
import kk.a;

/* loaded from: classes3.dex */
public class MaterialCheckBox extends f {

    /* renamed from: f  reason: collision with root package name */
    private static final int f15089f = j.f26510n;

    /* renamed from: g  reason: collision with root package name */
    private static final int[][] f15090g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f15091d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15092e;

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15091d == null) {
            int[][] iArr = f15090g;
            int[] iArr2 = new int[iArr.length];
            int d11 = a.d(this, b.f26373i);
            int d12 = a.d(this, b.f26378n);
            int d13 = a.d(this, b.f26375k);
            iArr2[0] = a.h(d12, d11, 1.0f);
            iArr2[1] = a.h(d12, d13, 0.54f);
            iArr2[2] = a.h(d12, d13, 0.38f);
            iArr2[3] = a.h(d12, d13, 0.38f);
            this.f15091d = new ColorStateList(iArr, iArr2);
        }
        return this.f15091d;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15092e && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.f15092e = z11;
        if (z11) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, null);
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f26369e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.f15089f
            android.content.Context r8 = yk.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = fk.k.f26635t2
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.j.h(r0, r1, r2, r3, r4, r5)
            int r10 = fk.k.f26641u2
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = tk.c.a(r8, r9, r10)
            androidx.core.widget.c.c(r7, r8)
        L28:
            int r8 = fk.k.f26647v2
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f15092e = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}