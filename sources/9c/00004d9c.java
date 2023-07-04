package com.stripe.android.financialconnections.launcher;

import androidx.activity.result.d;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.FinancialConnectionsSheetForTokenResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import h00.l;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetForTokenLauncher implements FinancialConnectionsSheetLauncher {
    private final d<FinancialConnectionsSheetActivityArgs.ForToken> activityResultLauncher;

    public FinancialConnectionsSheetForTokenLauncher(d<FinancialConnectionsSheetActivityArgs.ForToken> activityResultLauncher) {
        s.g(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
    }

    /* renamed from: _init_$lambda-0 */
    public static final void m133_init_$lambda0(l callback, FinancialConnectionsSheetForTokenResult it2) {
        s.g(callback, "$callback");
        s.f(it2, "it");
        callback.invoke(it2);
    }

    /* renamed from: _init_$lambda-1 */
    public static final void m134_init_$lambda1(l callback, FinancialConnectionsSheetForTokenResult it2) {
        s.g(callback, "$callback");
        s.f(it2, "it");
        callback.invoke(it2);
    }

    /* renamed from: _init_$lambda-2 */
    public static final void m135_init_$lambda2(l callback, FinancialConnectionsSheetForTokenResult it2) {
        s.g(callback, "$callback");
        s.f(it2, "it");
        callback.invoke(it2);
    }

    public static /* synthetic */ void a(l lVar, FinancialConnectionsSheetForTokenResult financialConnectionsSheetForTokenResult) {
        m135_init_$lambda2(lVar, financialConnectionsSheetForTokenResult);
    }

    public static /* synthetic */ void b(l lVar, FinancialConnectionsSheetForTokenResult financialConnectionsSheetForTokenResult) {
        m134_init_$lambda1(lVar, financialConnectionsSheetForTokenResult);
    }

    public static /* synthetic */ void c(l lVar, FinancialConnectionsSheetForTokenResult financialConnectionsSheetForTokenResult) {
        m133_init_$lambda0(lVar, financialConnectionsSheetForTokenResult);
    }

    @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher
    public void present(FinancialConnectionsSheet.Configuration configuration) {
        s.g(configuration, "configuration");
        this.activityResultLauncher.b(new FinancialConnectionsSheetActivityArgs.ForToken(configuration));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FinancialConnectionsSheetForTokenLauncher(androidx.activity.ComponentActivity r3, final h00.l<? super com.stripe.android.financialconnections.FinancialConnectionsSheetForTokenResult, vz.b0> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.s.g(r4, r0)
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenContract r0 = new com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenContract
            r0.<init>()
            tr.f r1 = new tr.f
            r1.<init>()
            androidx.activity.result.d r3 = r3.registerForActivityResult(r0, r1)
            java.lang.String r4 = "activity.registerForActi…   callback(it)\n        }"
            kotlin.jvm.internal.s.f(r3, r4)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenLauncher.<init>(androidx.activity.ComponentActivity, h00.l):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FinancialConnectionsSheetForTokenLauncher(androidx.fragment.app.Fragment r3, final h00.l<? super com.stripe.android.financialconnections.FinancialConnectionsSheetForTokenResult, vz.b0> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.s.g(r4, r0)
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenContract r0 = new com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenContract
            r0.<init>()
            tr.e r1 = new tr.e
            r1.<init>()
            androidx.activity.result.d r3 = r3.registerForActivityResult(r0, r1)
            java.lang.String r4 = "fragment.registerForActi…   callback(it)\n        }"
            kotlin.jvm.internal.s.f(r3, r4)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenLauncher.<init>(androidx.fragment.app.Fragment, h00.l):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FinancialConnectionsSheetForTokenLauncher(androidx.fragment.app.Fragment r3, androidx.activity.result.ActivityResultRegistry r4, final h00.l<? super com.stripe.android.financialconnections.FinancialConnectionsSheetForTokenResult, vz.b0> r5) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.s.g(r4, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.s.g(r5, r0)
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenContract r0 = new com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenContract
            r0.<init>()
            tr.d r1 = new tr.d
            r1.<init>()
            androidx.activity.result.d r3 = r3.registerForActivityResult(r0, r4, r1)
            java.lang.String r4 = "fragment.registerForActi…   callback(it)\n        }"
            kotlin.jvm.internal.s.f(r3, r4)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForTokenLauncher.<init>(androidx.fragment.app.Fragment, androidx.activity.result.ActivityResultRegistry, h00.l):void");
    }
}