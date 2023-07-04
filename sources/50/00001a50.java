package com.facebook.react.views.text;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;

/* loaded from: classes3.dex */
public abstract class a0 extends ReplacementSpan implements m {
    public static void g(Spannable spannable, TextView textView) {
        a0[] a0VarArr;
        for (a0 a0Var : (a0[]) spannable.getSpans(0, spannable.length(), a0.class)) {
            a0Var.c();
            a0Var.h(textView);
        }
    }

    public abstract Drawable a();

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void h(TextView textView);
}