package j60;

import f50.i;
import org.bouncycastle.asn1.k;

/* loaded from: classes5.dex */
public class a {
    public static l60.c a(String str) {
        i d11 = i40.b.d(str);
        if (d11 == null) {
            try {
                d11 = i40.b.f(new k(str));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        if (d11 == null) {
            return null;
        }
        return new l60.c(str, d11.e(), d11.f(), d11.j(), d11.h(), d11.k());
    }
}