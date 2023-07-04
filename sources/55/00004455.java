package com.plaid.internal;

import android.widget.TextView;

/* loaded from: classes2.dex */
public final class jc {
    public static final void a(TextView textView, String str) {
        vz.b0 b0Var;
        kotlin.jvm.internal.s.g(textView, "<this>");
        if (str == null) {
            b0Var = null;
        } else {
            textView.setVisibility(0);
            textView.setText(str);
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            textView.setVisibility(8);
        }
    }
}