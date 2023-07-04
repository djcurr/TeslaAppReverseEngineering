package e7;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.CheckoutException;
import e7.f;
import java.util.Locale;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class c<ConfigurationT extends f> {

    /* renamed from: a  reason: collision with root package name */
    private Locale f24933a;

    /* renamed from: b  reason: collision with root package name */
    private com.adyen.checkout.core.api.d f24934b;

    /* renamed from: c  reason: collision with root package name */
    private String f24935c;

    public c(Locale builderShopperLocale, com.adyen.checkout.core.api.d builderEnvironment, String builderClientKey) {
        s.g(builderShopperLocale, "builderShopperLocale");
        s.g(builderEnvironment, "builderEnvironment");
        s.g(builderClientKey, "builderClientKey");
        this.f24933a = builderShopperLocale;
        this.f24934b = builderEnvironment;
        this.f24935c = builderClientKey;
        if (!m7.d.f38435a.b(builderClientKey)) {
            throw new CheckoutException("Client key is not valid.");
        }
    }

    public final ConfigurationT a() {
        if (m7.d.f38435a.a(this.f24935c, this.f24934b)) {
            if (q7.b.b(this.f24933a)) {
                return b();
            }
            throw new CheckoutException("Invalid shopper locale: " + this.f24933a + CoreConstants.DOT);
        }
        throw new CheckoutException("Client key does not match the environment.");
    }

    protected abstract ConfigurationT b();

    public final String c() {
        return this.f24935c;
    }

    public final com.adyen.checkout.core.api.d d() {
        return this.f24934b;
    }

    public final Locale e() {
        return this.f24933a;
    }

    public c<ConfigurationT> f(com.adyen.checkout.core.api.d builderEnvironment) {
        s.g(builderEnvironment, "builderEnvironment");
        this.f24934b = builderEnvironment;
        return this;
    }

    public c<ConfigurationT> g(Locale builderShopperLocale) {
        s.g(builderShopperLocale, "builderShopperLocale");
        this.f24933a = builderShopperLocale;
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r3, r0)
            java.lang.String r0 = "clientKey"
            kotlin.jvm.internal.s.g(r4, r0)
            java.util.Locale r3 = q7.b.a(r3)
            com.adyen.checkout.core.api.d r0 = com.adyen.checkout.core.api.d.f9579b
            java.lang.String r1 = "TEST"
            kotlin.jvm.internal.s.f(r0, r1)
            r2.<init>(r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.c.<init>(android.content.Context, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(ConfigurationT configuration) {
        this(configuration.c(), configuration.b(), configuration.a());
        s.g(configuration, "configuration");
    }
}