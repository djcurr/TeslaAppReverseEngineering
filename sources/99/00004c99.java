package com.stripe.android.core.injection;

import com.stripe.android.core.Logger;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes2.dex */
public final class InjectableKtxKt {
    public static final <FallbackInitializeParam> void injectWithFallback(Injectable<FallbackInitializeParam> injectable, @InjectorKey String str, FallbackInitializeParam fallbackinitializeparam) {
        Injector retrieve;
        s.g(injectable, "<this>");
        Logger companion = Logger.Companion.getInstance(false);
        b0 b0Var = null;
        if (str != null && (retrieve = WeakMapInjectorRegistry.INSTANCE.retrieve(str)) != null) {
            companion.info(s.p("Injector available, injecting dependencies into ", injectable.getClass().getCanonicalName()));
            retrieve.inject(injectable);
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            companion.info(s.p("Injector unavailable, initializing dependencies of ", injectable.getClass().getCanonicalName()));
            injectable.fallbackInitialize(fallbackinitializeparam);
        }
    }
}