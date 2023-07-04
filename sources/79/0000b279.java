package sk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.q;
import androidx.core.widget.c;
import fk.b;
import fk.j;

/* loaded from: classes3.dex */
public class a extends q {

    /* renamed from: f  reason: collision with root package name */
    private static final int f50442f = j.f26511o;

    /* renamed from: g  reason: collision with root package name */
    private static final int[][] f50443g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f50444d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f50445e;

    public a(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f50444d == null) {
            int d11 = kk.a.d(this, b.f26373i);
            int d12 = kk.a.d(this, b.f26375k);
            int d13 = kk.a.d(this, b.f26378n);
            int[][] iArr = f50443g;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = kk.a.h(d13, d11, 1.0f);
            iArr2[1] = kk.a.h(d13, d12, 0.54f);
            iArr2[2] = kk.a.h(d13, d12, 0.38f);
            iArr2[3] = kk.a.h(d13, d12, 0.38f);
            this.f50444d = new ColorStateList(iArr, iArr2);
        }
        return this.f50444d;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f50445e && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.f50445e = z11;
        if (z11) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, null);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.E);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = sk.a.f50442f
            android.content.Context r8 = yk.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = fk.k.f26653w2
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.j.h(r0, r1, r2, r3, r4, r5)
            int r10 = fk.k.f26659x2
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = tk.c.a(r8, r9, r10)
            androidx.core.widget.c.c(r7, r8)
        L28:
            int r8 = fk.k.f26665y2
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f50445e = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}