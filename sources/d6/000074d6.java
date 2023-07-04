package i60;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* loaded from: classes5.dex */
public class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private static volatile Provider f30170b;

    public a() {
        super(b());
    }

    private static synchronized Provider b() {
        synchronized (a.class) {
            Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
            if (provider instanceof BouncyCastleProvider) {
                return provider;
            }
            if (f30170b != null) {
                return f30170b;
            }
            f30170b = new BouncyCastleProvider();
            return f30170b;
        }
    }
}