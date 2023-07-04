package com.stripe.android.payments.bankaccount.di;

import android.app.Application;
import android.content.Context;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import h00.a;
import java.util.Set;
import kotlin.jvm.internal.s;
import wz.x0;

/* loaded from: classes6.dex */
public final class CollectBankAccountModule {
    public static final CollectBankAccountModule INSTANCE = new CollectBankAccountModule();

    private CollectBankAccountModule() {
    }

    public final a<String> providePublishableKey(CollectBankAccountContract.Args args) {
        s.g(args, "args");
        return new CollectBankAccountModule$providePublishableKey$1(args);
    }

    public final Context providesAppContext(Application application) {
        s.g(application, "application");
        return application;
    }

    public final boolean providesEnableLogging() {
        return false;
    }

    public final Set<String> providesProductUsage() {
        Set<String> d11;
        d11 = x0.d();
        return d11;
    }
}