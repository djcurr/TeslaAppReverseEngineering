package com.stripe.android.financialconnections.launcher;

import androidx.activity.result.d;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetForDataLauncher implements FinancialConnectionsSheetLauncher {
    private final d<FinancialConnectionsSheetActivityArgs.ForData> activityResultLauncher;

    public FinancialConnectionsSheetForDataLauncher(d<FinancialConnectionsSheetActivityArgs.ForData> activityResultLauncher) {
        s.g(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
    }

    /* renamed from: _init_$lambda-0 */
    public static final void m130_init_$lambda0(FinancialConnectionsSheetResultCallback callback, FinancialConnectionsSheetResult it2) {
        s.g(callback, "$callback");
        s.f(it2, "it");
        callback.onFinancialConnectionsSheetResult(it2);
    }

    /* renamed from: _init_$lambda-1 */
    public static final void m131_init_$lambda1(FinancialConnectionsSheetResultCallback callback, FinancialConnectionsSheetResult it2) {
        s.g(callback, "$callback");
        s.f(it2, "it");
        callback.onFinancialConnectionsSheetResult(it2);
    }

    /* renamed from: _init_$lambda-2 */
    public static final void m132_init_$lambda2(FinancialConnectionsSheetResultCallback callback, FinancialConnectionsSheetResult it2) {
        s.g(callback, "$callback");
        s.f(it2, "it");
        callback.onFinancialConnectionsSheetResult(it2);
    }

    public static /* synthetic */ void a(FinancialConnectionsSheetResultCallback financialConnectionsSheetResultCallback, FinancialConnectionsSheetResult financialConnectionsSheetResult) {
        m132_init_$lambda2(financialConnectionsSheetResultCallback, financialConnectionsSheetResult);
    }

    public static /* synthetic */ void b(FinancialConnectionsSheetResultCallback financialConnectionsSheetResultCallback, FinancialConnectionsSheetResult financialConnectionsSheetResult) {
        m130_init_$lambda0(financialConnectionsSheetResultCallback, financialConnectionsSheetResult);
    }

    public static /* synthetic */ void c(FinancialConnectionsSheetResultCallback financialConnectionsSheetResultCallback, FinancialConnectionsSheetResult financialConnectionsSheetResult) {
        m131_init_$lambda1(financialConnectionsSheetResultCallback, financialConnectionsSheetResult);
    }

    @Override // com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetLauncher
    public void present(FinancialConnectionsSheet.Configuration configuration) {
        s.g(configuration, "configuration");
        this.activityResultLauncher.b(new FinancialConnectionsSheetActivityArgs.ForData(configuration));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FinancialConnectionsSheetForDataLauncher(androidx.activity.ComponentActivity r3, final com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback r4) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.s.g(r4, r0)
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataContract r0 = new com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataContract
            r0.<init>()
            tr.b r1 = new tr.b
            r1.<init>()
            androidx.activity.result.d r3 = r3.registerForActivityResult(r0, r1)
            java.lang.String r4 = "activity.registerForActi…SheetResult(it)\n        }"
            kotlin.jvm.internal.s.f(r3, r4)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher.<init>(androidx.activity.ComponentActivity, com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FinancialConnectionsSheetForDataLauncher(androidx.fragment.app.Fragment r3, final com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback r4) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.s.g(r4, r0)
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataContract r0 = new com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataContract
            r0.<init>()
            tr.c r1 = new tr.c
            r1.<init>()
            androidx.activity.result.d r3 = r3.registerForActivityResult(r0, r1)
            java.lang.String r4 = "fragment.registerForActi…SheetResult(it)\n        }"
            kotlin.jvm.internal.s.f(r3, r4)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher.<init>(androidx.fragment.app.Fragment, com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FinancialConnectionsSheetForDataLauncher(androidx.fragment.app.Fragment r3, androidx.activity.result.ActivityResultRegistry r4, final com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback r5) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.s.g(r4, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.s.g(r5, r0)
            com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataContract r0 = new com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataContract
            r0.<init>()
            tr.a r1 = new tr.a
            r1.<init>()
            androidx.activity.result.d r3 = r3.registerForActivityResult(r0, r4, r1)
            java.lang.String r4 = "fragment.registerForActi…SheetResult(it)\n        }"
            kotlin.jvm.internal.s.f(r3, r4)
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher.<init>(androidx.fragment.app.Fragment, androidx.activity.result.ActivityResultRegistry, com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback):void");
    }
}