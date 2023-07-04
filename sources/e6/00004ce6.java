package com.stripe.android.core.networking;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m00.l;

/* loaded from: classes2.dex */
public final class RetryDelaySupplier {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final long DEFAULT_INCREMENT_SECONDS = 2;
    private final long incrementSeconds;

    /* loaded from: classes2.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RetryDelaySupplier(long j11) {
        this.incrementSeconds = j11;
    }

    public final long getDelayMillis(int i11, int i12) {
        int m11;
        m11 = l.m(i12, 1, i11);
        return TimeUnit.SECONDS.toMillis((long) Math.pow(this.incrementSeconds, (i11 - m11) + 1));
    }

    public RetryDelaySupplier() {
        this(2L);
    }
}