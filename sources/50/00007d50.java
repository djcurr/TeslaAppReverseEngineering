package k40;

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
    static j f34356a = new C0639a();

    /* renamed from: b  reason: collision with root package name */
    static j f34357b = new b();

    /* renamed from: c  reason: collision with root package name */
    static final Hashtable f34358c = new Hashtable();

    /* renamed from: d  reason: collision with root package name */
    static final Hashtable f34359d = new Hashtable();

    /* renamed from: e  reason: collision with root package name */
    static final Hashtable f34360e = new Hashtable();

    /* renamed from: k40.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C0639a extends j {
        C0639a() {
        }

        @Override // f50.j
        protected i a() {
            BigInteger g11 = a.g("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger g12 = a.g("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger g13 = a.g("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger g14 = a.g("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger valueOf = BigInteger.valueOf(1L);
            e e11 = a.e(new e.f(g11, g12, g13, g14, valueOf));
            return new i(e11, a.d(e11, "0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0"), g14, valueOf, null);
        }
    }

    /* loaded from: classes5.dex */
    static class b extends j {
        b() {
        }

        @Override // f50.j
        protected i a() {
            BigInteger g11 = a.g("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger g12 = a.g("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger g13 = a.g("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger g14 = a.g("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger valueOf = BigInteger.valueOf(1L);
            e e11 = a.e(new e.f(g11, g12, g13, g14, valueOf));
            return new i(e11, a.d(e11, "044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2"), g14, valueOf, null);
        }
    }

    static {
        f("wapip192v1", k40.b.f34364d, f34357b);
        f("sm2p256v1", k40.b.f34362b, f34356a);
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
        f34358c.put(m.g(str), kVar);
        f34360e.put(kVar, str);
        f34359d.put(kVar, jVar);
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
        j jVar = (j) f34359d.get(kVar);
        if (jVar == null) {
            return null;
        }
        return jVar.b();
    }

    public static String j(org.bouncycastle.asn1.k kVar) {
        return (String) f34360e.get(kVar);
    }

    public static Enumeration k() {
        return f34360e.elements();
    }

    public static org.bouncycastle.asn1.k l(String str) {
        return (org.bouncycastle.asn1.k) f34358c.get(m.g(str));
    }
}