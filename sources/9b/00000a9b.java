package atd.h0;

import atd.i0.h;
import com.adyen.threeds2.exception.SDKRuntimeException;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final a f6875a;

    /* renamed from: b  reason: collision with root package name */
    private final b f6876b;

    /* renamed from: c  reason: collision with root package name */
    private final c f6877c;

    static {
        atd.s0.a.a(-797380817250880L);
    }

    private d(a aVar, b bVar, c cVar) {
        this.f6875a = aVar;
        this.f6876b = bVar;
        this.f6877c = cVar;
    }

    public static d a(String str) {
        String[] split = str.split(atd.s0.a.a(-797367932348992L));
        if (split.length == 3) {
            return new d(new a(split[0]), new b(split[1]), new c(split[2]));
        }
        throw atd.y.c.CRYPTO_FAILURE.a();
    }

    public b a() {
        return this.f6876b;
    }

    public void a(List<X509Certificate> list) {
        for (X509Certificate x509Certificate : list) {
            try {
                a(x509Certificate);
                return;
            } catch (SDKRuntimeException unused) {
            }
        }
        throw atd.y.c.CRYPTO_FAILURE.a();
    }

    public void a(X509Certificate x509Certificate) {
        h.a(x509Certificate, this.f6875a.e());
        byte[] a11 = a(this.f6875a.c(), this.f6876b.c());
        try {
            if (this.f6875a.f().a(this.f6877c.b(), a11, this.f6875a.e().get(0).getPublicKey())) {
                return;
            }
            throw atd.y.c.CRYPTO_FAILURE.a();
        } catch (GeneralSecurityException e11) {
            throw atd.y.c.CRYPTO_FAILURE.a(e11);
        }
    }

    private static byte[] a(String str, String str2) {
        return (str + atd.s0.a.a(-797355047447104L) + str2).getBytes(com.adyen.threeds2.internal.b.f9630a);
    }
}