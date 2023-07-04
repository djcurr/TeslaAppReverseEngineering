package eq;

import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: c  reason: collision with root package name */
    private Provider f25242c;

    /* renamed from: d  reason: collision with root package name */
    private Provider f25243d;

    /* renamed from: e  reason: collision with root package name */
    private Provider f25244e;

    public c() {
        this(null, null, null, null, null);
    }

    public Provider d() {
        Provider provider = this.f25243d;
        return provider != null ? provider : a();
    }

    public Provider e() {
        Provider provider = this.f25242c;
        return provider != null ? provider : a();
    }

    public Provider f() {
        Provider provider = this.f25244e;
        return provider != null ? provider : a();
    }

    public c(Provider provider, Provider provider2, Provider provider3, Provider provider4, SecureRandom secureRandom) {
        super(provider, secureRandom);
        this.f25242c = provider2;
        this.f25243d = provider3;
        this.f25244e = provider4;
    }
}