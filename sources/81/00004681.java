package com.plaid.internal;

import androidx.lifecycle.s0;

/* loaded from: classes2.dex */
public final class zd implements s0.b {

    /* renamed from: a  reason: collision with root package name */
    public final h00.l<y7, xd> f19990a;

    /* renamed from: b  reason: collision with root package name */
    public final y7 f19991b;

    /* JADX WARN: Multi-variable type inference failed */
    public zd(h00.l<? super y7, ? extends xd> createFunction, y7 paneHostComponent) {
        kotlin.jvm.internal.s.g(createFunction, "createFunction");
        kotlin.jvm.internal.s.g(paneHostComponent, "paneHostComponent");
        this.f19990a = createFunction;
        this.f19991b = paneHostComponent;
    }

    @Override // androidx.lifecycle.s0.b
    public <T extends androidx.lifecycle.p0> T create(Class<T> modelClass) {
        kotlin.jvm.internal.s.g(modelClass, "modelClass");
        return this.f19990a.invoke(this.f19991b);
    }
}