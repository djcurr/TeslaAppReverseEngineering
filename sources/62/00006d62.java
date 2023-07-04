package f40;

import f50.i;
import f50.j;
import f50.k;
import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import n60.e;
import n60.x;
import r70.m;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    static j f25812a = new C0509a();

    /* renamed from: b  reason: collision with root package name */
    static final Hashtable f25813b = new Hashtable();

    /* renamed from: c  reason: collision with root package name */
    static final Hashtable f25814c = new Hashtable();

    /* renamed from: d  reason: collision with root package name */
    static final Hashtable f25815d = new Hashtable();

    /* renamed from: f40.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0509a extends j {
        C0509a() {
        }

        @Override // f50.j
        protected i a() {
            BigInteger g11 = a.g("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger g12 = a.g("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger g13 = a.g("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger g14 = a.g("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger valueOf = BigInteger.valueOf(1L);
            e e11 = a.e(new e.f(g11, g12, g13, g14, valueOf));
            return new i(e11, a.d(e11, "04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB"), g14, valueOf, null);
        }
    }

    static {
        f("FRP256v1", b.f25816a, f25812a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static k d(e eVar, String str) {
        k kVar = new k(eVar, org.bouncycastle.util.encoders.b.b(str));
        x.c(kVar.e());
        return kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e e(e eVar) {
        return eVar;
    }

    static void f(String str, org.bouncycastle.asn1.k kVar, j jVar) {
        f25813b.put(m.g(str), kVar);
        f25815d.put(kVar, str);
        f25814c.put(kVar, jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger g(String str) {
        return new BigInteger(1, org.bouncycastle.util.encoders.b.b(str));
    }

    public static i h(String str) {
        org.bouncycastle.asn1.k l11 = l(str);
        if (l11 == null) {
            return null;
        }
        return i(l11);
    }

    public static i i(org.bouncycastle.asn1.k kVar) {
        j jVar = (j) f25814c.get(kVar);
        if (jVar == null) {
            return null;
        }
        return jVar.b();
    }

    public static String j(org.bouncycastle.asn1.k kVar) {
        return (String) f25815d.get(kVar);
    }

    public static Enumeration k() {
        return f25815d.elements();
    }

    public static org.bouncycastle.asn1.k l(String str) {
        return (org.bouncycastle.asn1.k) f25813b.get(m.g(str));
    }
}