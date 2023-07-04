package r40;

import f50.i;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.asn1.k;
import r70.m;
import y40.c;
import y40.d;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    static final Hashtable f49135a = new Hashtable();

    /* renamed from: b  reason: collision with root package name */
    static final Hashtable f49136b = new Hashtable();

    static {
        a("B-571", d.F);
        a("B-409", d.D);
        a("B-283", d.f59126n);
        a("B-233", d.f59132t);
        a("B-163", d.f59124l);
        a("K-571", d.E);
        a("K-409", d.C);
        a("K-283", d.f59125m);
        a("K-233", d.f59131s);
        a("K-163", d.f59114b);
        a("P-521", d.B);
        a("P-384", d.A);
        a("P-256", d.H);
        a("P-224", d.f59138z);
        a("P-192", d.G);
    }

    static void a(String str, k kVar) {
        f49135a.put(str, kVar);
        f49136b.put(kVar, str);
    }

    public static i b(String str) {
        k kVar = (k) f49135a.get(m.k(str));
        if (kVar != null) {
            return c(kVar);
        }
        return null;
    }

    public static i c(k kVar) {
        return c.k(kVar);
    }

    public static String d(k kVar) {
        return (String) f49136b.get(kVar);
    }

    public static Enumeration e() {
        return f49135a.keys();
    }

    public static k f(String str) {
        return (k) f49135a.get(m.k(str));
    }
}