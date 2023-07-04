package d50;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Stripe3ds2AuthResult;
import e50.y0;
import ezvcard.property.Gender;
import java.util.Hashtable;
import org.bouncycastle.asn1.g;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p0;
import org.bouncycastle.asn1.v0;
import w40.n;

/* loaded from: classes5.dex */
public class c extends a {
    public static final k A;
    public static final k B;
    public static final k C;
    public static final k D;
    public static final k E;
    public static final k F;
    public static final k G;
    public static final k H;
    public static final k I;
    public static final k J;
    public static final k K;
    public static final k L;
    public static final k M;
    private static final Hashtable N;
    private static final Hashtable O;
    public static final c50.e P;

    /* renamed from: c  reason: collision with root package name */
    public static final k f23687c;

    /* renamed from: d  reason: collision with root package name */
    public static final k f23688d;

    /* renamed from: e  reason: collision with root package name */
    public static final k f23689e;

    /* renamed from: f  reason: collision with root package name */
    public static final k f23690f;

    /* renamed from: g  reason: collision with root package name */
    public static final k f23691g;

    /* renamed from: h  reason: collision with root package name */
    public static final k f23692h;

    /* renamed from: i  reason: collision with root package name */
    public static final k f23693i;

    /* renamed from: j  reason: collision with root package name */
    public static final k f23694j;

    /* renamed from: k  reason: collision with root package name */
    public static final k f23695k;

    /* renamed from: l  reason: collision with root package name */
    public static final k f23696l;

    /* renamed from: m  reason: collision with root package name */
    public static final k f23697m;

    /* renamed from: n  reason: collision with root package name */
    public static final k f23698n;

    /* renamed from: o  reason: collision with root package name */
    public static final k f23699o;

    /* renamed from: p  reason: collision with root package name */
    public static final k f23700p;

    /* renamed from: q  reason: collision with root package name */
    public static final k f23701q;

    /* renamed from: r  reason: collision with root package name */
    public static final k f23702r;

    /* renamed from: s  reason: collision with root package name */
    public static final k f23703s;

    /* renamed from: t  reason: collision with root package name */
    public static final k f23704t;

    /* renamed from: u  reason: collision with root package name */
    public static final k f23705u;

    /* renamed from: v  reason: collision with root package name */
    public static final k f23706v;

    /* renamed from: w  reason: collision with root package name */
    public static final k f23707w;

    /* renamed from: x  reason: collision with root package name */
    public static final k f23708x;

    /* renamed from: y  reason: collision with root package name */
    public static final k f23709y;

    /* renamed from: z  reason: collision with root package name */
    public static final k f23710z;

    /* renamed from: b  reason: collision with root package name */
    protected final Hashtable f23712b = a.f(N);

    /* renamed from: a  reason: collision with root package name */
    protected final Hashtable f23711a = a.f(O);

    static {
        k w11 = new k("2.5.4.6").w();
        f23687c = w11;
        k w12 = new k("2.5.4.10").w();
        f23688d = w12;
        k w13 = new k("2.5.4.11").w();
        f23689e = w13;
        k w14 = new k("2.5.4.12").w();
        f23690f = w14;
        k w15 = new k("2.5.4.3").w();
        f23691g = w15;
        f23692h = new k("2.5.4.5").w();
        k w16 = new k("2.5.4.9").w();
        f23693i = w16;
        k w17 = new k("2.5.4.5").w();
        f23694j = w17;
        k w18 = new k("2.5.4.7").w();
        f23695k = w18;
        k w19 = new k("2.5.4.8").w();
        f23696l = w19;
        k w21 = new k("2.5.4.4").w();
        f23697m = w21;
        k w22 = new k("2.5.4.42").w();
        f23698n = w22;
        k w23 = new k("2.5.4.43").w();
        f23699o = w23;
        k w24 = new k("2.5.4.44").w();
        f23700p = w24;
        k w25 = new k("2.5.4.45").w();
        f23701q = w25;
        k w26 = new k("2.5.4.13").w();
        f23702r = w26;
        k w27 = new k("2.5.4.15").w();
        f23703s = w27;
        k w28 = new k("2.5.4.17").w();
        f23704t = w28;
        k w29 = new k("2.5.4.46").w();
        f23705u = w29;
        k w31 = new k("2.5.4.65").w();
        f23706v = w31;
        k w32 = new k("2.5.4.72").w();
        f23707w = w32;
        k w33 = new k("1.3.6.1.5.5.7.9.1").w();
        f23708x = w33;
        k w34 = new k("1.3.6.1.5.5.7.9.2").w();
        f23709y = w34;
        k w35 = new k("1.3.6.1.5.5.7.9.3").w();
        f23710z = w35;
        k w36 = new k("1.3.6.1.5.5.7.9.4").w();
        A = w36;
        k w37 = new k("1.3.6.1.5.5.7.9.5").w();
        B = w37;
        k w38 = new k("1.3.36.8.3.14").w();
        C = w38;
        k w39 = new k("2.5.4.16").w();
        D = w39;
        new k("2.5.4.54").w();
        k kVar = y0.I;
        E = kVar;
        k kVar2 = y0.J;
        F = kVar2;
        k kVar3 = y0.M;
        G = kVar3;
        k kVar4 = n.f55544o2;
        H = kVar4;
        k kVar5 = n.f55546q2;
        I = kVar5;
        k kVar6 = n.f55548r2;
        J = kVar6;
        K = kVar4;
        k kVar7 = new k("0.9.2342.19200300.100.1.25");
        L = kVar7;
        k kVar8 = new k("0.9.2342.19200300.100.1.1");
        M = kVar8;
        Hashtable hashtable = new Hashtable();
        N = hashtable;
        Hashtable hashtable2 = new Hashtable();
        O = hashtable2;
        hashtable.put(w11, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE);
        hashtable.put(w12, Gender.OTHER);
        hashtable.put(w14, "T");
        hashtable.put(w13, "OU");
        hashtable.put(w15, "CN");
        hashtable.put(w18, "L");
        hashtable.put(w19, "ST");
        hashtable.put(w17, "SERIALNUMBER");
        hashtable.put(kVar4, "E");
        hashtable.put(kVar7, "DC");
        hashtable.put(kVar8, "UID");
        hashtable.put(w16, "STREET");
        hashtable.put(w21, "SURNAME");
        hashtable.put(w22, "GIVENNAME");
        hashtable.put(w23, "INITIALS");
        hashtable.put(w24, "GENERATION");
        hashtable.put(w26, "DESCRIPTION");
        hashtable.put(w32, "ROLE");
        hashtable.put(kVar6, "unstructuredAddress");
        hashtable.put(kVar5, "unstructuredName");
        hashtable.put(w25, "UniqueIdentifier");
        hashtable.put(w29, "DN");
        hashtable.put(w31, "Pseudonym");
        hashtable.put(w39, "PostalAddress");
        hashtable.put(w38, "NameAtBirth");
        hashtable.put(w36, "CountryOfCitizenship");
        hashtable.put(w37, "CountryOfResidence");
        hashtable.put(w35, "Gender");
        hashtable.put(w34, "PlaceOfBirth");
        hashtable.put(w33, "DateOfBirth");
        hashtable.put(w28, "PostalCode");
        hashtable.put(w27, "BusinessCategory");
        hashtable.put(kVar, "TelephoneNumber");
        hashtable.put(kVar2, "Name");
        hashtable.put(kVar3, "organizationIdentifier");
        hashtable2.put(cg.c.f9084i, w11);
        hashtable2.put("o", w12);
        hashtable2.put("t", w14);
        hashtable2.put("ou", w13);
        hashtable2.put("cn", w15);
        hashtable2.put("l", w18);
        hashtable2.put("st", w19);
        hashtable2.put("sn", w21);
        hashtable2.put("serialnumber", w17);
        hashtable2.put("street", w16);
        hashtable2.put("emailaddress", kVar4);
        hashtable2.put("dc", kVar7);
        hashtable2.put("e", kVar4);
        hashtable2.put("uid", kVar8);
        hashtable2.put("surname", w21);
        hashtable2.put("givenname", w22);
        hashtable2.put("initials", w23);
        hashtable2.put("generation", w24);
        hashtable2.put("description", w26);
        hashtable2.put("role", w32);
        hashtable2.put("unstructuredaddress", kVar6);
        hashtable2.put("unstructuredname", kVar5);
        hashtable2.put("uniqueidentifier", w25);
        hashtable2.put("dn", w29);
        hashtable2.put("pseudonym", w31);
        hashtable2.put("postaladdress", w39);
        hashtable2.put("nameatbirth", w38);
        hashtable2.put("countryofcitizenship", w36);
        hashtable2.put("countryofresidence", w37);
        hashtable2.put("gender", w35);
        hashtable2.put("placeofbirth", w34);
        hashtable2.put("dateofbirth", w33);
        hashtable2.put("postalcode", w28);
        hashtable2.put("businesscategory", w27);
        hashtable2.put("telephonenumber", kVar);
        hashtable2.put("name", kVar2);
        hashtable2.put("organizationidentifier", kVar3);
        P = new c();
    }

    @Override // c50.e
    public k attrNameToOID(String str) {
        return d.g(str, this.f23711a);
    }

    @Override // c50.e
    public String c(c50.c cVar) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z11 = true;
        for (c50.b bVar : cVar.i()) {
            if (z11) {
                z11 = false;
            } else {
                stringBuffer.append(CoreConstants.COMMA_CHAR);
            }
            d.a(stringBuffer, bVar, this.f23712b);
        }
        return stringBuffer.toString();
    }

    @Override // c50.e
    public c50.b[] fromString(String str) {
        return d.k(str, this);
    }

    @Override // d50.a
    protected e40.b g(k kVar, String str) {
        return (kVar.j(H) || kVar.j(L)) ? new p0(str) : kVar.j(f23708x) ? new g(str) : (kVar.j(f23687c) || kVar.j(f23692h) || kVar.j(f23705u) || kVar.j(E)) ? new v0(str) : super.g(kVar, str);
    }
}