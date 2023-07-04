package com.plaid.internal;

import androidx.lifecycle.s0;

/* loaded from: classes2.dex */
public final class d6 implements s0.b {

    /* renamed from: a  reason: collision with root package name */
    public final a6 f18492a;

    public d6(a6 linkRedirectActivityParentComponent) {
        kotlin.jvm.internal.s.g(linkRedirectActivityParentComponent, "linkRedirectActivityParentComponent");
        this.f18492a = linkRedirectActivityParentComponent;
    }

    @Override // androidx.lifecycle.s0.b
    public <T extends androidx.lifecycle.p0> T create(Class<T> modelClass) {
        kotlin.jvm.internal.s.g(modelClass, "modelClass");
        return new c6(this.f18492a);
    }
}