package com.plaid.internal;

import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes2.dex */
public final class b1 extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final h00.l<Object, vz.b0> f18186a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f18187b;

    public b1(h00.l<Object, vz.b0> listener, Object action) {
        kotlin.jvm.internal.s.g(listener, "listener");
        kotlin.jvm.internal.s.g(action, "action");
        this.f18186a = listener;
        this.f18187b = action;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        kotlin.jvm.internal.s.g(widget, "widget");
        this.f18186a.invoke(this.f18187b);
    }
}