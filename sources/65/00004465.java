package com.plaid.internal;

import androidx.lifecycle.s0;

/* loaded from: classes2.dex */
public final class k5 implements s0.b {

    /* renamed from: a  reason: collision with root package name */
    public final g5 f18922a;

    public k5(g5 linkActivityParentComponent) {
        kotlin.jvm.internal.s.g(linkActivityParentComponent, "linkActivityParentComponent");
        this.f18922a = linkActivityParentComponent;
    }

    @Override // androidx.lifecycle.s0.b
    public <T extends androidx.lifecycle.p0> T create(Class<T> modelClass) {
        kotlin.jvm.internal.s.g(modelClass, "modelClass");
        return new i5(this.f18922a);
    }
}