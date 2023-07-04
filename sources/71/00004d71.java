package com.stripe.android.financialconnections.di;

import android.app.Application;
import com.stripe.android.financialconnections.FinancialConnectionsSheet;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSheetConfigurationModule {
    public static final FinancialConnectionsSheetConfigurationModule INSTANCE = new FinancialConnectionsSheetConfigurationModule();

    private FinancialConnectionsSheetConfigurationModule() {
    }

    public final String providesApplicationId(Application application) {
        s.g(application, "application");
        String packageName = application.getPackageName();
        s.f(packageName, "application.packageName");
        return packageName;
    }

    public final FinancialConnectionsSheet.Configuration providesConfiguration(FinancialConnectionsSheetActivityArgs args) {
        s.g(args, "args");
        return args.getConfiguration();
    }

    public final boolean providesEnableLogging() {
        return false;
    }

    public final String providesPublishableKey(FinancialConnectionsSheet.Configuration configuration) {
        s.g(configuration, "configuration");
        return configuration.getPublishableKey();
    }
}