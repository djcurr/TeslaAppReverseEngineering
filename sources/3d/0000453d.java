package com.plaid.internal;

import android.text.style.ClickableSpan;
import android.view.View;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;

/* loaded from: classes2.dex */
public final class r6 extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final h00.l<Common$LocalAction, vz.b0> f19350a;

    /* renamed from: b  reason: collision with root package name */
    public final Common$LocalAction f19351b;

    /* JADX WARN: Multi-variable type inference failed */
    public r6(h00.l<? super Common$LocalAction, vz.b0> listener, Common$LocalAction action) {
        kotlin.jvm.internal.s.g(listener, "listener");
        kotlin.jvm.internal.s.g(action, "action");
        this.f19350a = listener;
        this.f19351b = action;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View widget) {
        kotlin.jvm.internal.s.g(widget, "widget");
        this.f19350a.invoke(this.f19351b);
    }
}