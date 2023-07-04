package com.stripe.android.payments.core.authentication.threeds2;

import android.app.Application;
import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import androidx.savedstate.c;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.InjectableKtxKt;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.payments.core.injection.DaggerStripe3ds2TransactionViewModelFactoryComponent;
import com.stripe.android.payments.core.injection.Stripe3ds2TransactionViewModelSubcomponent;
import java.util.Set;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class Stripe3ds2TransactionViewModelFactory extends androidx.lifecycle.a implements Injectable<FallbackInitializeParam> {
    private final h00.a<Application> applicationSupplier;
    private final h00.a<Stripe3ds2TransactionContract.Args> argsSupplier;
    public Stripe3ds2TransactionViewModelSubcomponent.Builder subComponentBuilder;

    /* loaded from: classes6.dex */
    public static final class FallbackInitializeParam {
        private final Application application;
        private final boolean enableLogging;
        private final Set<String> productUsage;
        private final String publishableKey;

        public FallbackInitializeParam(Application application, boolean z11, String publishableKey, Set<String> productUsage) {
            s.g(application, "application");
            s.g(publishableKey, "publishableKey");
            s.g(productUsage, "productUsage");
            this.application = application;
            this.enableLogging = z11;
            this.publishableKey = publishableKey;
            this.productUsage = productUsage;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, boolean z11, String str, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                application = fallbackInitializeParam.application;
            }
            if ((i11 & 2) != 0) {
                z11 = fallbackInitializeParam.enableLogging;
            }
            if ((i11 & 4) != 0) {
                str = fallbackInitializeParam.publishableKey;
            }
            if ((i11 & 8) != 0) {
                set = fallbackInitializeParam.productUsage;
            }
            return fallbackInitializeParam.copy(application, z11, str, set);
        }

        public final Application component1() {
            return this.application;
        }

        public final boolean component2() {
            return this.enableLogging;
        }

        public final String component3() {
            return this.publishableKey;
        }

        public final Set<String> component4() {
            return this.productUsage;
        }

        public final FallbackInitializeParam copy(Application application, boolean z11, String publishableKey, Set<String> productUsage) {
            s.g(application, "application");
            s.g(publishableKey, "publishableKey");
            s.g(productUsage, "productUsage");
            return new FallbackInitializeParam(application, z11, publishableKey, productUsage);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FallbackInitializeParam) {
                FallbackInitializeParam fallbackInitializeParam = (FallbackInitializeParam) obj;
                return s.c(this.application, fallbackInitializeParam.application) && this.enableLogging == fallbackInitializeParam.enableLogging && s.c(this.publishableKey, fallbackInitializeParam.publishableKey) && s.c(this.productUsage, fallbackInitializeParam.productUsage);
            }
            return false;
        }

        public final Application getApplication() {
            return this.application;
        }

        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        public final Set<String> getProductUsage() {
            return this.productUsage;
        }

        public final String getPublishableKey() {
            return this.publishableKey;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.application.hashCode() * 31;
            boolean z11 = this.enableLogging;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return ((((hashCode + i11) * 31) + this.publishableKey.hashCode()) * 31) + this.productUsage.hashCode();
        }

        public String toString() {
            return "FallbackInitializeParam(application=" + this.application + ", enableLogging=" + this.enableLogging + ", publishableKey=" + this.publishableKey + ", productUsage=" + this.productUsage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Stripe3ds2TransactionViewModelFactory(h00.a<? extends Application> applicationSupplier, c owner, h00.a<Stripe3ds2TransactionContract.Args> argsSupplier) {
        super(owner, null);
        s.g(applicationSupplier, "applicationSupplier");
        s.g(owner, "owner");
        s.g(argsSupplier, "argsSupplier");
        this.applicationSupplier = applicationSupplier;
        this.argsSupplier = argsSupplier;
    }

    @Override // androidx.lifecycle.a
    protected <T extends p0> T create(String key, Class<T> modelClass, l0 handle) {
        s.g(key, "key");
        s.g(modelClass, "modelClass");
        s.g(handle, "handle");
        Stripe3ds2TransactionContract.Args invoke = this.argsSupplier.invoke();
        Application invoke2 = this.applicationSupplier.invoke();
        InjectableKtxKt.injectWithFallback(this, invoke.getInjectorKey(), new FallbackInitializeParam(invoke2, invoke.getEnableLogging(), invoke.getPublishableKey(), invoke.getProductUsage()));
        return getSubComponentBuilder().args(invoke).savedStateHandle(handle).application(invoke2).build().getViewModel();
    }

    public final Stripe3ds2TransactionViewModelSubcomponent.Builder getSubComponentBuilder() {
        Stripe3ds2TransactionViewModelSubcomponent.Builder builder = this.subComponentBuilder;
        if (builder != null) {
            return builder;
        }
        s.x("subComponentBuilder");
        return null;
    }

    public final void setSubComponentBuilder(Stripe3ds2TransactionViewModelSubcomponent.Builder builder) {
        s.g(builder, "<set-?>");
        this.subComponentBuilder = builder;
    }

    @Override // com.stripe.android.core.injection.Injectable
    public void fallbackInitialize(FallbackInitializeParam arg) {
        s.g(arg, "arg");
        DaggerStripe3ds2TransactionViewModelFactoryComponent.builder().context(arg.getApplication()).enableLogging(arg.getEnableLogging()).publishableKeyProvider(new Stripe3ds2TransactionViewModelFactory$fallbackInitialize$1(arg)).productUsage(arg.getProductUsage()).isInstantApp(ek.a.c(arg.getApplication())).build().inject(this);
    }
}