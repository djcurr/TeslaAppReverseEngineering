package com.stripe.android.link.injection;

import com.stripe.android.core.injection.Injectable;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
public interface NonFallbackInjectable extends Injectable<b0> {

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static Void fallbackInitialize(NonFallbackInjectable nonFallbackInjectable, b0 arg) {
            s.g(nonFallbackInjectable, "this");
            s.g(arg, "arg");
            throw new IllegalStateException(s.p(nonFallbackInjectable.getClass().getCanonicalName(), " does not support injection fallback"));
        }
    }

    Void fallbackInitialize(b0 b0Var);
}