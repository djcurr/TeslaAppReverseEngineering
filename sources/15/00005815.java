package com.stripe.android.stripe3ds2.init;

import android.os.Debug;
import android.os.Environment;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.service.StripeThreeDs2ServiceImpl;
import java.io.File;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes6.dex */
public abstract class SecurityCheck {
    private final Warning warning;

    /* loaded from: classes6.dex */
    public static final class Emulator extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW02", "An emulator is being used to run the App.", Warning.Severity.HIGH);

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Emulator() {
            super(WARNING, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
            if (r0 == false) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean isEmulator() {
            /*
                r7 = this;
                java.lang.String r0 = android.os.Build.FINGERPRINT
                java.lang.String r1 = "FINGERPRINT"
                kotlin.jvm.internal.s.f(r0, r1)
                java.lang.String r2 = "generic"
                r3 = 0
                r4 = 2
                r5 = 0
                boolean r6 = kotlin.text.m.H(r0, r2, r3, r4, r5)
                if (r6 != 0) goto L73
                kotlin.jvm.internal.s.f(r0, r1)
                java.lang.String r1 = "unknown"
                boolean r0 = kotlin.text.m.H(r0, r1, r3, r4, r5)
                if (r0 != 0) goto L73
                java.lang.String r0 = android.os.Build.MODEL
                java.lang.String r1 = "MODEL"
                kotlin.jvm.internal.s.f(r0, r1)
                java.lang.String r6 = "Emulator"
                boolean r6 = kotlin.text.m.M(r0, r6, r3, r4, r5)
                if (r6 != 0) goto L73
                kotlin.jvm.internal.s.f(r0, r1)
                java.lang.String r6 = "Android SDK built for x86"
                boolean r6 = kotlin.text.m.M(r0, r6, r3, r4, r5)
                if (r6 != 0) goto L73
                kotlin.jvm.internal.s.f(r0, r1)
                java.lang.String r1 = "google_sdk"
                boolean r0 = kotlin.text.m.M(r0, r1, r3, r4, r5)
                if (r0 != 0) goto L73
                java.lang.String r0 = android.os.Build.MANUFACTURER
                java.lang.String r6 = "MANUFACTURER"
                kotlin.jvm.internal.s.f(r0, r6)
                java.lang.String r6 = "Genymotion"
                boolean r0 = kotlin.text.m.M(r0, r6, r3, r4, r5)
                if (r0 != 0) goto L73
                java.lang.String r0 = android.os.Build.BRAND
                java.lang.String r6 = "BRAND"
                kotlin.jvm.internal.s.f(r0, r6)
                boolean r0 = kotlin.text.m.H(r0, r2, r3, r4, r5)
                if (r0 == 0) goto L6b
                java.lang.String r0 = android.os.Build.DEVICE
                java.lang.String r6 = "DEVICE"
                kotlin.jvm.internal.s.f(r0, r6)
                boolean r0 = kotlin.text.m.H(r0, r2, r3, r4, r5)
                if (r0 != 0) goto L73
            L6b:
                java.lang.String r0 = android.os.Build.PRODUCT
                boolean r0 = kotlin.jvm.internal.s.c(r1, r0)
                if (r0 == 0) goto L74
            L73:
                r3 = 1
            L74:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.init.SecurityCheck.Emulator.isEmulator():boolean");
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public boolean check() {
            return isEmulator();
        }
    }

    /* loaded from: classes6.dex */
    public static final class RootedCheck extends SecurityCheck {
        @Deprecated
        private static final List<String> BINARY_PATHS;
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final Warning WARNING;

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            List<String> l11;
            l11 = w.l("/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/");
            BINARY_PATHS = l11;
            WARNING = new Warning("SW01", "The device is jailbroken.", Warning.Severity.HIGH);
        }

        public RootedCheck() {
            super(WARNING, null);
        }

        private final boolean findSuBinary() {
            List<String> list = BINARY_PATHS;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (String str : list) {
                if (new File(s.p(str, "su")).exists()) {
                    return true;
                }
            }
            return false;
        }

        private final boolean findSuperuserApk() {
            return new File(s.p(Environment.getRootDirectory().toString(), "/Superuser")).isDirectory();
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public boolean check() {
            return findSuBinary() || findSuperuserApk();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Tampered extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW02", "The integrity of the SDK has been tampered.", Warning.Severity.HIGH);

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public Tampered() {
            super(WARNING, null);
        }

        private final boolean hasValidFields() {
            return StripeThreeDs2ServiceImpl.class.getDeclaredFields().length == 8;
        }

        private final boolean hasValidMethods() {
            return StripeThreeDs2ServiceImpl.class.getDeclaredMethods().length == 5;
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public boolean check() {
            return (hasValidFields() && hasValidMethods()) ? false : true;
        }
    }

    /* loaded from: classes6.dex */
    public static final class UnsupportedOS extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW05", "The OS or the OS version is not supported.", Warning.Severity.HIGH);

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public UnsupportedOS() {
            super(WARNING, null);
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public boolean check() {
            return false;
        }
    }

    private SecurityCheck(Warning warning) {
        this.warning = warning;
    }

    public /* synthetic */ SecurityCheck(Warning warning, DefaultConstructorMarker defaultConstructorMarker) {
        this(warning);
    }

    public abstract boolean check();

    public final Warning getWarning() {
        return this.warning;
    }

    /* loaded from: classes6.dex */
    public static final class DebuggerAttached extends SecurityCheck {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        private static final Warning WARNING = new Warning("SW04", "A debugger is attached to the App.", Warning.Severity.MEDIUM);
        private final boolean isDebuggerConnected;

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public DebuggerAttached() {
            this(false, 1, null);
        }

        public /* synthetic */ DebuggerAttached(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Debug.isDebuggerConnected() : z11);
        }

        @Override // com.stripe.android.stripe3ds2.init.SecurityCheck
        public boolean check() {
            return this.isDebuggerConnected;
        }

        public final boolean isDebuggerConnected() {
            return this.isDebuggerConnected;
        }

        public DebuggerAttached(boolean z11) {
            super(WARNING, null);
            this.isDebuggerConnected = z11;
        }
    }
}