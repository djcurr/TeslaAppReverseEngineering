package eq;

import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private Provider f25240a;

    /* renamed from: b  reason: collision with root package name */
    private SecureRandom f25241b;

    public b() {
        this(null, null);
    }

    public Provider a() {
        return this.f25240a;
    }

    public SecureRandom b() {
        SecureRandom secureRandom = this.f25241b;
        return secureRandom != null ? secureRandom : new SecureRandom();
    }

    public void c(Provider provider) {
        this.f25240a = provider;
    }

    public b(Provider provider, SecureRandom secureRandom) {
        this.f25240a = provider;
        this.f25241b = secureRandom;
    }
}