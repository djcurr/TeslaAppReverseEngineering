package f50;

import java.util.Enumeration;
import java.util.Vector;

/* loaded from: classes5.dex */
public class d {
    private static void a(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }

    public static i b(String str) {
        i h11 = f.h(str);
        if (h11 == null) {
            h11 = y40.c.j(str);
        }
        if (h11 == null) {
            h11 = r40.a.b(str);
        }
        if (h11 == null) {
            h11 = z40.a.h(str);
        }
        if (h11 == null) {
            h11 = f40.a.h(str);
        }
        if (h11 == null) {
            h11 = i40.b.d(str);
        }
        return h11 == null ? k40.a.h(str) : h11;
    }

    public static i c(org.bouncycastle.asn1.k kVar) {
        i i11 = f.i(kVar);
        if (i11 == null) {
            i11 = y40.c.k(kVar);
        }
        if (i11 == null) {
            i11 = z40.a.i(kVar);
        }
        if (i11 == null) {
            i11 = f40.a.i(kVar);
        }
        if (i11 == null) {
            i11 = i40.b.f(kVar);
        }
        return i11 == null ? k40.a.i(kVar) : i11;
    }

    public static String d(org.bouncycastle.asn1.k kVar) {
        String j11 = f.j(kVar);
        if (j11 == null) {
            j11 = y40.c.l(kVar);
        }
        if (j11 == null) {
            j11 = r40.a.d(kVar);
        }
        if (j11 == null) {
            j11 = z40.a.j(kVar);
        }
        if (j11 == null) {
            j11 = f40.a.j(kVar);
        }
        if (j11 == null) {
            j11 = i40.b.g(kVar);
        }
        if (j11 == null) {
            j11 = k40.a.j(kVar);
        }
        return j11 == null ? j50.a.k(kVar) : j11;
    }

    public static Enumeration e() {
        Vector vector = new Vector();
        a(vector, f.k());
        a(vector, y40.c.m());
        a(vector, r40.a.e());
        a(vector, z40.a.k());
        a(vector, f40.a.k());
        a(vector, i40.b.h());
        a(vector, k40.a.k());
        return vector.elements();
    }

    public static org.bouncycastle.asn1.k f(String str) {
        org.bouncycastle.asn1.k l11 = f.l(str);
        if (l11 == null) {
            l11 = y40.c.n(str);
        }
        if (l11 == null) {
            l11 = r40.a.f(str);
        }
        if (l11 == null) {
            l11 = z40.a.l(str);
        }
        if (l11 == null) {
            l11 = f40.a.l(str);
        }
        if (l11 == null) {
            l11 = i40.b.i(str);
        }
        if (l11 == null) {
            l11 = k40.a.l(str);
        }
        return (l11 == null && str.equals("curve25519")) ? h40.a.f28887c : l11;
    }
}