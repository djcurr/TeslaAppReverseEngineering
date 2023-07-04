package com.plaid.internal;

import android.app.Application;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class oa implements tw.e<na> {

    /* renamed from: a  reason: collision with root package name */
    public final Provider<Application> f19179a;

    public oa(Provider<Application> provider) {
        this.f19179a = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new na(this.f19179a.get());
    }
}