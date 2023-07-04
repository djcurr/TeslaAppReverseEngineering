package com.stripe.android.stripe3ds2.init;

import com.stripe.android.stripe3ds2.init.SecurityCheck;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.w;
import wz.x;

/* loaded from: classes6.dex */
public final class DefaultSecurityChecker implements SecurityChecker {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final List<SecurityCheck> DEFAULT_CHECKS;
    private final List<SecurityCheck> securityChecks;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<SecurityCheck> getDEFAULT_CHECKS() {
            return DefaultSecurityChecker.DEFAULT_CHECKS;
        }
    }

    static {
        List<SecurityCheck> l11;
        l11 = w.l(new SecurityCheck.RootedCheck(), new SecurityCheck.Tampered(), new SecurityCheck.Emulator(), new SecurityCheck.DebuggerAttached(false, 1, null), new SecurityCheck.UnsupportedOS());
        DEFAULT_CHECKS = l11;
    }

    public DefaultSecurityChecker() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSecurityChecker(List<? extends SecurityCheck> securityChecks) {
        s.g(securityChecks, "securityChecks");
        this.securityChecks = securityChecks;
    }

    @Override // com.stripe.android.stripe3ds2.init.SecurityChecker
    public List<Warning> getWarnings() {
        int t11;
        List<SecurityCheck> list = this.securityChecks;
        ArrayList<SecurityCheck> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((SecurityCheck) obj).check()) {
                arrayList.add(obj);
            }
        }
        t11 = x.t(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(t11);
        for (SecurityCheck securityCheck : arrayList) {
            arrayList2.add(securityCheck.getWarning());
        }
        return arrayList2;
    }

    public /* synthetic */ DefaultSecurityChecker(List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? DEFAULT_CHECKS : list);
    }
}