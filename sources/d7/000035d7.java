package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    final b f15176a;

    /* renamed from: b  reason: collision with root package name */
    final b f15177b;

    /* renamed from: c  reason: collision with root package name */
    final b f15178c;

    /* renamed from: d  reason: collision with root package name */
    final b f15179d;

    /* renamed from: e  reason: collision with root package name */
    final b f15180e;

    /* renamed from: f  reason: collision with root package name */
    final b f15181f;

    /* renamed from: g  reason: collision with root package name */
    final b f15182g;

    /* renamed from: h  reason: collision with root package name */
    final Paint f15183h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(tk.b.d(context, fk.b.f26388x, h.class.getCanonicalName()), fk.k.P1);
        this.f15176a = b.a(context, obtainStyledAttributes.getResourceId(fk.k.S1, 0));
        this.f15182g = b.a(context, obtainStyledAttributes.getResourceId(fk.k.Q1, 0));
        this.f15177b = b.a(context, obtainStyledAttributes.getResourceId(fk.k.R1, 0));
        this.f15178c = b.a(context, obtainStyledAttributes.getResourceId(fk.k.T1, 0));
        ColorStateList a11 = tk.c.a(context, obtainStyledAttributes, fk.k.U1);
        this.f15179d = b.a(context, obtainStyledAttributes.getResourceId(fk.k.W1, 0));
        this.f15180e = b.a(context, obtainStyledAttributes.getResourceId(fk.k.V1, 0));
        this.f15181f = b.a(context, obtainStyledAttributes.getResourceId(fk.k.X1, 0));
        Paint paint = new Paint();
        this.f15183h = paint;
        paint.setColor(a11.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}