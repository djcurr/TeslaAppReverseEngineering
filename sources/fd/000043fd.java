package com.plaid.internal;

import androidx.lifecycle.s0;

/* loaded from: classes2.dex */
public final class gd implements s0.b {

    /* renamed from: a  reason: collision with root package name */
    public final cd f18680a;

    public gd(cd webviewComponent) {
        kotlin.jvm.internal.s.g(webviewComponent, "webviewComponent");
        this.f18680a = webviewComponent;
    }

    @Override // androidx.lifecycle.s0.b
    public <T extends androidx.lifecycle.p0> T create(Class<T> modelClass) {
        kotlin.jvm.internal.s.g(modelClass, "modelClass");
        if (modelClass.isAssignableFrom(fd.class)) {
            return new fd(this.f18680a);
        }
        throw new r5("Unsupported ViewModel");
    }
}