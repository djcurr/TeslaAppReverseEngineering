package com.stripe.android.core;

import android.util.Log;
import com.reactnativestripesdk.StripeSdkModule;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public interface Logger {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private static final String TAG = "StripeSdk";
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Logger$Companion$REAL_LOGGER$1 REAL_LOGGER = new Logger() { // from class: com.stripe.android.core.Logger$Companion$REAL_LOGGER$1
            @Override // com.stripe.android.core.Logger
            public void debug(String msg) {
                s.g(msg, "msg");
                Log.d(StripeSdkModule.NAME, msg);
            }

            @Override // com.stripe.android.core.Logger
            public void error(String msg, Throwable th2) {
                s.g(msg, "msg");
                Log.e(StripeSdkModule.NAME, msg, th2);
            }

            @Override // com.stripe.android.core.Logger
            public void info(String msg) {
                s.g(msg, "msg");
                Log.i(StripeSdkModule.NAME, msg);
            }

            @Override // com.stripe.android.core.Logger
            public void warning(String msg) {
                s.g(msg, "msg");
                Log.w(StripeSdkModule.NAME, msg);
            }
        };
        private static final Logger$Companion$NOOP_LOGGER$1 NOOP_LOGGER = new Logger() { // from class: com.stripe.android.core.Logger$Companion$NOOP_LOGGER$1
            @Override // com.stripe.android.core.Logger
            public void debug(String msg) {
                s.g(msg, "msg");
            }

            @Override // com.stripe.android.core.Logger
            public void error(String msg, Throwable th2) {
                s.g(msg, "msg");
            }

            @Override // com.stripe.android.core.Logger
            public void info(String msg) {
                s.g(msg, "msg");
            }

            @Override // com.stripe.android.core.Logger
            public void warning(String msg) {
                s.g(msg, "msg");
            }
        };

        private Companion() {
        }

        public final Logger getInstance(boolean z11) {
            if (z11) {
                return real();
            }
            return noop();
        }

        public final Logger noop() {
            return NOOP_LOGGER;
        }

        public final Logger real() {
            return REAL_LOGGER;
        }
    }

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void error$default(Logger logger, String str, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
            }
            if ((i11 & 2) != 0) {
                th2 = null;
            }
            logger.error(str, th2);
        }
    }

    void debug(String str);

    void error(String str, Throwable th2);

    void info(String str);

    void warning(String str);
}