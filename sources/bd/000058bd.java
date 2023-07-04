package com.stripe.android.stripe3ds2.transaction;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.e0;
import wz.x0;

/* loaded from: classes6.dex */
public final class MessageVersionRegistry {
    @Deprecated
    private static final String CURRENT = "2.2.0";
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final Set<String> SUPPORTED;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Set<String> i11;
        i11 = x0.i(CURRENT, "2.1.0");
        SUPPORTED = i11;
    }

    public final String getCurrent() {
        return CURRENT;
    }

    public final boolean isSupported(String str) {
        boolean T;
        T = e0.T(SUPPORTED, str);
        return T;
    }
}