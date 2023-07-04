package com.stripe.android.core.injection;

/* loaded from: classes2.dex */
public interface InjectorRegistry {
    @InjectorKey
    String nextKey(String str);

    void register(Injector injector, @InjectorKey String str);

    Injector retrieve(@InjectorKey String str);
}