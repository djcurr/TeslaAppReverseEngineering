package e50;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Stripe3ds2AuthResult;
import ezvcard.property.Gender;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.b1;
import org.spongycastle.asn1.ASN1Encoding;

/* loaded from: classes5.dex */
public class x0 extends e40.c {
    public static final org.bouncycastle.asn1.k A;
    public static final org.bouncycastle.asn1.k B;
    public static final org.bouncycastle.asn1.k C;
    public static final org.bouncycastle.asn1.k E;
    public static final org.bouncycastle.asn1.k F;
    public static final org.bouncycastle.asn1.k G;
    public static final org.bouncycastle.asn1.k H;
    public static final org.bouncycastle.asn1.k K;
    public static final org.bouncycastle.asn1.k L;
    public static final org.bouncycastle.asn1.k O;
    public static final org.bouncycastle.asn1.k P;
    public static final org.bouncycastle.asn1.k Q;
    public static final Hashtable Q1;
    public static final org.bouncycastle.asn1.k R;
    public static final org.bouncycastle.asn1.k T;
    public static final Hashtable V1;
    public static final org.bouncycastle.asn1.k Y;

    /* renamed from: b1  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24818b1;

    /* renamed from: b2  reason: collision with root package name */
    private static final Boolean f24819b2;

    /* renamed from: g  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24820g;

    /* renamed from: g1  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24821g1;

    /* renamed from: g2  reason: collision with root package name */
    private static final Boolean f24822g2;

    /* renamed from: h  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24823h;

    /* renamed from: i  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24824i;

    /* renamed from: j  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24825j;

    /* renamed from: k  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24826k;

    /* renamed from: l  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24827l;

    /* renamed from: m  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24828m;

    /* renamed from: n  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24829n;

    /* renamed from: o  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24830o;

    /* renamed from: p  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24831p;

    /* renamed from: p1  reason: collision with root package name */
    public static boolean f24832p1;

    /* renamed from: q  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24833q;

    /* renamed from: t  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24834t;

    /* renamed from: w  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24835w;

    /* renamed from: x  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24836x;

    /* renamed from: x1  reason: collision with root package name */
    public static final Hashtable f24837x1;

    /* renamed from: y  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24838y;

    /* renamed from: y1  reason: collision with root package name */
    public static final Hashtable f24839y1;

    /* renamed from: z  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24840z;

    /* renamed from: a  reason: collision with root package name */
    private Vector f24841a = new Vector();

    /* renamed from: b  reason: collision with root package name */
    private Vector f24842b = new Vector();

    /* renamed from: c  reason: collision with root package name */
    private Vector f24843c = new Vector();

    /* renamed from: d  reason: collision with root package name */
    private org.bouncycastle.asn1.p f24844d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f24845e;

    /* renamed from: f  reason: collision with root package name */
    private int f24846f;

    static {
        org.bouncycastle.asn1.k kVar = new org.bouncycastle.asn1.k("2.5.4.6");
        f24820g = kVar;
        org.bouncycastle.asn1.k kVar2 = new org.bouncycastle.asn1.k("2.5.4.10");
        f24823h = kVar2;
        org.bouncycastle.asn1.k kVar3 = new org.bouncycastle.asn1.k("2.5.4.11");
        f24824i = kVar3;
        org.bouncycastle.asn1.k kVar4 = new org.bouncycastle.asn1.k("2.5.4.12");
        f24825j = kVar4;
        org.bouncycastle.asn1.k kVar5 = new org.bouncycastle.asn1.k("2.5.4.3");
        f24826k = kVar5;
        org.bouncycastle.asn1.k kVar6 = new org.bouncycastle.asn1.k("2.5.4.5");
        f24827l = kVar6;
        org.bouncycastle.asn1.k kVar7 = new org.bouncycastle.asn1.k("2.5.4.9");
        f24828m = kVar7;
        org.bouncycastle.asn1.k kVar8 = new org.bouncycastle.asn1.k("2.5.4.7");
        f24829n = kVar8;
        org.bouncycastle.asn1.k kVar9 = new org.bouncycastle.asn1.k("2.5.4.8");
        f24830o = kVar9;
        org.bouncycastle.asn1.k kVar10 = new org.bouncycastle.asn1.k("2.5.4.4");
        f24831p = kVar10;
        org.bouncycastle.asn1.k kVar11 = new org.bouncycastle.asn1.k("2.5.4.42");
        f24833q = kVar11;
        org.bouncycastle.asn1.k kVar12 = new org.bouncycastle.asn1.k("2.5.4.43");
        f24834t = kVar12;
        org.bouncycastle.asn1.k kVar13 = new org.bouncycastle.asn1.k("2.5.4.44");
        f24835w = kVar13;
        org.bouncycastle.asn1.k kVar14 = new org.bouncycastle.asn1.k("2.5.4.45");
        f24836x = kVar14;
        org.bouncycastle.asn1.k kVar15 = new org.bouncycastle.asn1.k("2.5.4.15");
        f24838y = kVar15;
        org.bouncycastle.asn1.k kVar16 = new org.bouncycastle.asn1.k("2.5.4.17");
        f24840z = kVar16;
        org.bouncycastle.asn1.k kVar17 = new org.bouncycastle.asn1.k("2.5.4.46");
        A = kVar17;
        org.bouncycastle.asn1.k kVar18 = new org.bouncycastle.asn1.k("2.5.4.65");
        B = kVar18;
        org.bouncycastle.asn1.k kVar19 = new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.9.1");
        C = kVar19;
        org.bouncycastle.asn1.k kVar20 = new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.9.2");
        E = kVar20;
        org.bouncycastle.asn1.k kVar21 = new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.9.3");
        F = kVar21;
        org.bouncycastle.asn1.k kVar22 = new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.9.4");
        G = kVar22;
        org.bouncycastle.asn1.k kVar23 = new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.9.5");
        H = kVar23;
        org.bouncycastle.asn1.k kVar24 = new org.bouncycastle.asn1.k("1.3.36.8.3.14");
        K = kVar24;
        org.bouncycastle.asn1.k kVar25 = new org.bouncycastle.asn1.k("2.5.4.16");
        L = kVar25;
        new org.bouncycastle.asn1.k("2.5.4.54");
        org.bouncycastle.asn1.k kVar26 = y0.I;
        O = kVar26;
        org.bouncycastle.asn1.k kVar27 = y0.J;
        P = kVar27;
        org.bouncycastle.asn1.k kVar28 = w40.n.f55544o2;
        Q = kVar28;
        org.bouncycastle.asn1.k kVar29 = w40.n.f55546q2;
        R = kVar29;
        org.bouncycastle.asn1.k kVar30 = w40.n.f55548r2;
        T = kVar30;
        Y = kVar28;
        org.bouncycastle.asn1.k kVar31 = new org.bouncycastle.asn1.k("0.9.2342.19200300.100.1.25");
        f24818b1 = kVar31;
        org.bouncycastle.asn1.k kVar32 = new org.bouncycastle.asn1.k("0.9.2342.19200300.100.1.1");
        f24821g1 = kVar32;
        f24832p1 = false;
        Hashtable hashtable = new Hashtable();
        f24837x1 = hashtable;
        Hashtable hashtable2 = new Hashtable();
        f24839y1 = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        Q1 = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        V1 = hashtable4;
        f24819b2 = new Boolean(true);
        f24822g2 = new Boolean(false);
        hashtable.put(kVar, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE);
        hashtable.put(kVar2, Gender.OTHER);
        hashtable.put(kVar4, "T");
        hashtable.put(kVar3, "OU");
        hashtable.put(kVar5, "CN");
        hashtable.put(kVar8, "L");
        hashtable.put(kVar9, "ST");
        hashtable.put(kVar6, "SERIALNUMBER");
        hashtable.put(kVar28, "E");
        hashtable.put(kVar31, "DC");
        hashtable.put(kVar32, "UID");
        hashtable.put(kVar7, "STREET");
        hashtable.put(kVar10, "SURNAME");
        hashtable.put(kVar11, "GIVENNAME");
        hashtable.put(kVar12, "INITIALS");
        hashtable.put(kVar13, "GENERATION");
        hashtable.put(kVar30, "unstructuredAddress");
        hashtable.put(kVar29, "unstructuredName");
        hashtable.put(kVar14, "UniqueIdentifier");
        hashtable.put(kVar17, "DN");
        hashtable.put(kVar18, "Pseudonym");
        hashtable.put(kVar25, "PostalAddress");
        hashtable.put(kVar24, "NameAtBirth");
        hashtable.put(kVar22, "CountryOfCitizenship");
        hashtable.put(kVar23, "CountryOfResidence");
        hashtable.put(kVar21, "Gender");
        hashtable.put(kVar20, "PlaceOfBirth");
        hashtable.put(kVar19, "DateOfBirth");
        hashtable.put(kVar16, "PostalCode");
        hashtable.put(kVar15, "BusinessCategory");
        hashtable.put(kVar26, "TelephoneNumber");
        hashtable.put(kVar27, "Name");
        hashtable2.put(kVar, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE);
        hashtable2.put(kVar2, Gender.OTHER);
        hashtable2.put(kVar3, "OU");
        hashtable2.put(kVar5, "CN");
        hashtable2.put(kVar8, "L");
        hashtable2.put(kVar9, "ST");
        hashtable2.put(kVar7, "STREET");
        hashtable2.put(kVar31, "DC");
        hashtable2.put(kVar32, "UID");
        hashtable3.put(kVar, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE);
        hashtable3.put(kVar2, Gender.OTHER);
        hashtable3.put(kVar3, "OU");
        hashtable3.put(kVar5, "CN");
        hashtable3.put(kVar8, "L");
        hashtable3.put(kVar9, "ST");
        hashtable3.put(kVar7, "STREET");
        hashtable4.put(cg.c.f9084i, kVar);
        hashtable4.put("o", kVar2);
        hashtable4.put("t", kVar4);
        hashtable4.put("ou", kVar3);
        hashtable4.put("cn", kVar5);
        hashtable4.put("l", kVar8);
        hashtable4.put("st", kVar9);
        hashtable4.put("sn", kVar6);
        hashtable4.put("serialnumber", kVar6);
        hashtable4.put("street", kVar7);
        hashtable4.put("emailaddress", kVar28);
        hashtable4.put("dc", kVar31);
        hashtable4.put("e", kVar28);
        hashtable4.put("uid", kVar32);
        hashtable4.put("surname", kVar10);
        hashtable4.put("givenname", kVar11);
        hashtable4.put("initials", kVar12);
        hashtable4.put("generation", kVar13);
        hashtable4.put("unstructuredaddress", kVar30);
        hashtable4.put("unstructuredname", kVar29);
        hashtable4.put("uniqueidentifier", kVar14);
        hashtable4.put("dn", kVar17);
        hashtable4.put("pseudonym", kVar18);
        hashtable4.put("postaladdress", kVar25);
        hashtable4.put("nameofbirth", kVar24);
        hashtable4.put("countryofcitizenship", kVar22);
        hashtable4.put("countryofresidence", kVar23);
        hashtable4.put("gender", kVar21);
        hashtable4.put("placeofbirth", kVar20);
        hashtable4.put("dateofbirth", kVar19);
        hashtable4.put("postalcode", kVar16);
        hashtable4.put("businesscategory", kVar15);
        hashtable4.put("telephonenumber", kVar26);
        hashtable4.put("name", kVar27);
    }

    protected x0() {
    }

    public x0(org.bouncycastle.asn1.p pVar) {
        Vector vector;
        this.f24844d = pVar;
        Enumeration s11 = pVar.s();
        while (s11.hasMoreElements()) {
            org.bouncycastle.asn1.q q11 = org.bouncycastle.asn1.q.q(((e40.b) s11.nextElement()).toASN1Primitive());
            int i11 = 0;
            while (i11 < q11.size()) {
                org.bouncycastle.asn1.p p11 = org.bouncycastle.asn1.p.p(q11.s(i11).toASN1Primitive());
                if (p11.size() != 2) {
                    throw new IllegalArgumentException("badly sized pair");
                }
                this.f24841a.addElement(org.bouncycastle.asn1.k.u(p11.r(0)));
                e40.b r11 = p11.r(1);
                if (!(r11 instanceof e40.g) || (r11 instanceof b1)) {
                    try {
                        this.f24842b.addElement("#" + f(org.bouncycastle.util.encoders.b.d(r11.toASN1Primitive().d(ASN1Encoding.DER))));
                    } catch (IOException unused) {
                        throw new IllegalArgumentException("cannot encode value");
                    }
                } else {
                    String string = ((e40.g) r11).getString();
                    if (string.length() <= 0 || string.charAt(0) != '#') {
                        vector = this.f24842b;
                    } else {
                        vector = this.f24842b;
                        string = "\\" + string;
                    }
                    vector.addElement(string);
                }
                this.f24843c.addElement(i11 != 0 ? f24819b2 : f24822g2);
                i11++;
            }
        }
    }

    private void e(StringBuffer stringBuffer, Hashtable hashtable, org.bouncycastle.asn1.k kVar, String str) {
        String str2 = (String) hashtable.get(kVar);
        if (str2 == null) {
            str2 = kVar.t();
        }
        stringBuffer.append(str2);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (length < length2 && stringBuffer.charAt(length) == ' ') {
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            }
            stringBuffer.insert(length2, CoreConstants.ESCAPE_CHAR);
        }
        while (length <= length2) {
            char charAt = stringBuffer.charAt(length);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                        continue;
                }
            }
            stringBuffer.insert(length, "\\");
            length += 2;
            length2++;
        }
    }

    private String f(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i11 = 0; i11 != length; i11++) {
            cArr[i11] = (char) (bArr[i11] & 255);
        }
        return new String(cArr);
    }

    private String h(String str) {
        String g11 = r70.m.g(str.trim());
        if (g11.length() <= 0 || g11.charAt(0) != '#') {
            return g11;
        }
        org.bouncycastle.asn1.n i11 = i(g11);
        return i11 instanceof e40.g ? r70.m.g(((e40.g) i11).getString().trim()) : g11;
    }

    private org.bouncycastle.asn1.n i(String str) {
        try {
            return org.bouncycastle.asn1.n.k(org.bouncycastle.util.encoders.b.c(str, 1, str.length() - 1));
        } catch (IOException e11) {
            throw new IllegalStateException("unknown encoding in name: " + e11);
        }
    }

    private boolean j(String str, String str2) {
        String h11 = h(str);
        String h12 = h(str2);
        return h11.equals(h12) || m(h11).equals(m(h12));
    }

    public static x0 k(Object obj) {
        if (obj instanceof x0) {
            return (x0) obj;
        }
        if (obj instanceof c50.c) {
            return new x0(org.bouncycastle.asn1.p.p(((c50.c) obj).toASN1Primitive()));
        }
        if (obj != null) {
            return new x0(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    private String m(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i11 = 1;
            while (i11 < str.length()) {
                char charAt2 = str.charAt(i11);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i11++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    @Override // e40.c
    public boolean equals(Object obj) {
        int i11;
        int i12;
        boolean z11;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x0) || (obj instanceof org.bouncycastle.asn1.p)) {
            if (toASN1Primitive().j(((e40.b) obj).toASN1Primitive())) {
                return true;
            }
            try {
                x0 k11 = k(obj);
                int size = this.f24841a.size();
                if (size != k11.f24841a.size()) {
                    return false;
                }
                boolean[] zArr = new boolean[size];
                int i13 = -1;
                if (this.f24841a.elementAt(0).equals(k11.f24841a.elementAt(0))) {
                    i12 = 1;
                    i13 = size;
                    i11 = 0;
                } else {
                    i11 = size - 1;
                    i12 = -1;
                }
                while (i11 != i13) {
                    org.bouncycastle.asn1.k kVar = (org.bouncycastle.asn1.k) this.f24841a.elementAt(i11);
                    String str = (String) this.f24842b.elementAt(i11);
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            z11 = false;
                            break;
                        } else if (!zArr[i14] && kVar.j((org.bouncycastle.asn1.k) k11.f24841a.elementAt(i14)) && j(str, (String) k11.f24842b.elementAt(i14))) {
                            zArr[i14] = true;
                            z11 = true;
                            break;
                        } else {
                            i14++;
                        }
                    }
                    if (!z11) {
                        return false;
                    }
                    i11 += i12;
                }
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // e40.c
    public int hashCode() {
        if (this.f24845e) {
            return this.f24846f;
        }
        this.f24845e = true;
        for (int i11 = 0; i11 != this.f24841a.size(); i11++) {
            String m11 = m(h((String) this.f24842b.elementAt(i11)));
            int hashCode = this.f24846f ^ this.f24841a.elementAt(i11).hashCode();
            this.f24846f = hashCode;
            this.f24846f = m11.hashCode() ^ hashCode;
        }
        return this.f24846f;
    }

    public String n(boolean z11, Hashtable hashtable) {
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        for (int i11 = 0; i11 < this.f24841a.size(); i11++) {
            if (((Boolean) this.f24843c.elementAt(i11)).booleanValue()) {
                stringBuffer2.append('+');
                e(stringBuffer2, hashtable, (org.bouncycastle.asn1.k) this.f24841a.elementAt(i11), (String) this.f24842b.elementAt(i11));
            } else {
                stringBuffer2 = new StringBuffer();
                e(stringBuffer2, hashtable, (org.bouncycastle.asn1.k) this.f24841a.elementAt(i11), (String) this.f24842b.elementAt(i11));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z12 = true;
        if (z11) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (z12) {
                    z12 = false;
                } else {
                    stringBuffer.append(CoreConstants.COMMA_CHAR);
                }
                stringBuffer.append(vector.elementAt(size).toString());
            }
        } else {
            for (int i12 = 0; i12 < vector.size(); i12++) {
                if (z12) {
                    z12 = false;
                } else {
                    stringBuffer.append(CoreConstants.COMMA_CHAR);
                }
                stringBuffer.append(vector.elementAt(i12).toString());
            }
        }
        return stringBuffer.toString();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        if (this.f24844d == null) {
            org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
            org.bouncycastle.asn1.d dVar2 = new org.bouncycastle.asn1.d();
            if (this.f24841a.size() != 0) {
                new org.bouncycastle.asn1.d(2).a((org.bouncycastle.asn1.k) this.f24841a.elementAt(0));
                String str = (String) this.f24842b.elementAt(0);
                throw null;
            }
            dVar.a(new org.bouncycastle.asn1.x0(dVar2));
            this.f24844d = new org.bouncycastle.asn1.w0(dVar);
        }
        return this.f24844d;
    }

    public String toString() {
        return n(f24832p1, f24837x1);
    }
}