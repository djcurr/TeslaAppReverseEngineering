package com.stripe.android.stripe3ds2.transaction;

import android.util.Log;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class Logger {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger get(boolean z11) {
            if (z11) {
                return Real.INSTANCE;
            }
            return Noop.INSTANCE;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Noop extends Logger {
        public static final Noop INSTANCE = new Noop();

        private Noop() {
            super(null);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public void error(String msg, Throwable th2) {
            s.g(msg, "msg");
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public void info(String msg) {
            s.g(msg, "msg");
        }
    }

    /* loaded from: classes6.dex */
    public static final class Real extends Logger {
        public static final Real INSTANCE = new Real();
        private static final String TAG = "StripeSdk";

        private Real() {
            super(null);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public void error(String msg, Throwable th2) {
            s.g(msg, "msg");
            Log.e("StripeSdk", msg, th2);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.Logger
        public void info(String msg) {
            s.g(msg, "msg");
            Log.i("StripeSdk", msg);
        }
    }

    private Logger() {
    }

    public /* synthetic */ Logger(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void error$default(Logger logger, String str, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i11 & 2) != 0) {
            th2 = null;
        }
        logger.error(str, th2);
    }

    public abstract void error(String str, Throwable th2);

    public abstract void info(String str);
}