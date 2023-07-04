package d50;

import ch.qos.logback.core.CoreConstants;
import e40.g;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.b1;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.spongycastle.asn1.ASN1Encoding;
import r70.m;

/* loaded from: classes5.dex */
public class d {
    public static void a(StringBuffer stringBuffer, c50.b bVar, Hashtable hashtable) {
        if (!bVar.j()) {
            if (bVar.f() != null) {
                b(stringBuffer, bVar.f(), hashtable);
                return;
            }
            return;
        }
        c50.a[] i11 = bVar.i();
        boolean z11 = true;
        for (int i12 = 0; i12 != i11.length; i12++) {
            if (z11) {
                z11 = false;
            } else {
                stringBuffer.append('+');
            }
            b(stringBuffer, i11[i12], hashtable);
        }
    }

    public static void b(StringBuffer stringBuffer, c50.a aVar, Hashtable hashtable) {
        String str = (String) hashtable.get(aVar.f());
        if (str == null) {
            str = aVar.f().t();
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(q(aVar.h()));
    }

    private static boolean c(c50.a aVar, c50.a aVar2) {
        if (aVar == aVar2) {
            return true;
        }
        return aVar != null && aVar2 != null && aVar.f().j(aVar2.f()) && d(aVar.h()).equals(d(aVar2.h()));
    }

    public static String d(e40.b bVar) {
        return e(q(bVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        if (r5 >= r0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String e(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 0
            if (r0 <= 0) goto L1d
            char r0 = r7.charAt(r1)
            r2 = 35
            if (r0 != r2) goto L1d
            org.bouncycastle.asn1.n r0 = h(r7)
            boolean r2 = r0 instanceof e40.g
            if (r2 == 0) goto L1d
            e40.g r0 = (e40.g) r0
            java.lang.String r7 = r0.getString()
        L1d:
            java.lang.String r7 = r70.m.g(r7)
            int r0 = r7.length()
            r2 = 2
            if (r0 >= r2) goto L29
            return r7
        L29:
            int r0 = r0 + (-1)
        L2b:
            r2 = 32
            r3 = 92
            if (r1 >= r0) goto L42
            char r4 = r7.charAt(r1)
            if (r4 != r3) goto L42
            int r4 = r1 + 1
            char r4 = r7.charAt(r4)
            if (r4 != r2) goto L42
            int r1 = r1 + 2
            goto L2b
        L42:
            int r4 = r1 + 1
            r5 = r0
        L45:
            if (r5 <= r4) goto L58
            int r6 = r5 + (-1)
            char r6 = r7.charAt(r6)
            if (r6 != r3) goto L58
            char r6 = r7.charAt(r5)
            if (r6 != r2) goto L58
            int r5 = r5 + (-2)
            goto L45
        L58:
            if (r1 > 0) goto L5c
            if (r5 >= r0) goto L62
        L5c:
            int r5 = r5 + 1
            java.lang.String r7 = r7.substring(r1, r5)
        L62:
            java.lang.String r7 = l(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d50.d.e(java.lang.String):java.lang.String");
    }

    private static int f(char c11) {
        if ('0' > c11 || c11 > '9') {
            return (('a' > c11 || c11 > 'f') ? c11 - 'A' : c11 - 'a') + 10;
        }
        return c11 - '0';
    }

    public static k g(String str, Hashtable hashtable) {
        if (m.k(str).startsWith("OID.")) {
            return new k(str.substring(4));
        }
        if (str.charAt(0) < '0' || str.charAt(0) > '9') {
            k kVar = (k) hashtable.get(m.g(str));
            if (kVar != null) {
                return kVar;
            }
            throw new IllegalArgumentException("Unknown object id - " + str + " - passed to distinguished name");
        }
        return new k(str);
    }

    private static n h(String str) {
        try {
            return n.k(org.bouncycastle.util.encoders.b.c(str, 1, str.length() - 1));
        } catch (IOException e11) {
            throw new IllegalStateException("unknown encoding in name: " + e11);
        }
    }

    private static boolean i(char c11) {
        return ('0' <= c11 && c11 <= '9') || ('a' <= c11 && c11 <= 'f') || ('A' <= c11 && c11 <= 'F');
    }

    public static boolean j(c50.b bVar, c50.b bVar2) {
        if (bVar.size() != bVar2.size()) {
            return false;
        }
        c50.a[] i11 = bVar.i();
        c50.a[] i12 = bVar2.i();
        if (i11.length != i12.length) {
            return false;
        }
        for (int i13 = 0; i13 != i11.length; i13++) {
            if (!c(i11[i13], i12[i13])) {
                return false;
            }
        }
        return true;
    }

    public static c50.b[] k(String str, c50.e eVar) {
        f fVar = new f(str);
        c50.d dVar = new c50.d(eVar);
        while (fVar.a()) {
            String b11 = fVar.b();
            if (b11.indexOf(43) > 0) {
                f fVar2 = new f(b11, '+');
                f fVar3 = new f(fVar2.b(), '=');
                String b12 = fVar3.b();
                if (!fVar3.a()) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                String b13 = fVar3.b();
                k attrNameToOID = eVar.attrNameToOID(b12.trim());
                if (fVar2.a()) {
                    Vector vector = new Vector();
                    Vector vector2 = new Vector();
                    while (true) {
                        vector.addElement(attrNameToOID);
                        vector2.addElement(o(b13));
                        if (!fVar2.a()) {
                            dVar.c(m(vector), n(vector2));
                            break;
                        }
                        f fVar4 = new f(fVar2.b(), '=');
                        String b14 = fVar4.b();
                        if (!fVar4.a()) {
                            throw new IllegalArgumentException("badly formatted directory string");
                        }
                        b13 = fVar4.b();
                        attrNameToOID = eVar.attrNameToOID(b14.trim());
                    }
                } else {
                    dVar.e(attrNameToOID, o(b13));
                }
            } else {
                f fVar5 = new f(b11, '=');
                String b15 = fVar5.b();
                if (!fVar5.a()) {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
                dVar.e(eVar.attrNameToOID(b15.trim()), o(fVar5.b()));
            }
        }
        return dVar.f().i();
    }

    public static String l(String str) {
        if (str.indexOf("  ") < 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        char charAt = str.charAt(0);
        stringBuffer.append(charAt);
        for (int i11 = 1; i11 < str.length(); i11++) {
            char charAt2 = str.charAt(i11);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    private static k[] m(Vector vector) {
        int size = vector.size();
        k[] kVarArr = new k[size];
        for (int i11 = 0; i11 != size; i11++) {
            kVarArr[i11] = (k) vector.elementAt(i11);
        }
        return kVarArr;
    }

    private static String[] n(Vector vector) {
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i11 = 0; i11 != size; i11++) {
            strArr[i11] = (String) vector.elementAt(i11);
        }
        return strArr;
    }

    private static String o(String str) {
        int i11;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            i11 = 2;
            stringBuffer.append("\\#");
        } else {
            i11 = 0;
        }
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = false;
        boolean z13 = false;
        char c11 = 0;
        while (i11 != charArray.length) {
            char c12 = charArray[i11];
            if (c12 != ' ') {
                z13 = true;
            }
            if (c12 != '\"') {
                if (c12 == '\\' && !z11 && !z12) {
                    i12 = stringBuffer.length();
                    z11 = true;
                } else if (c12 != ' ' || z11 || z13) {
                    if (z11 && i(c12)) {
                        if (c11 != 0) {
                            stringBuffer.append((char) ((f(c11) * 16) + f(c12)));
                            z11 = false;
                            c11 = 0;
                        } else {
                            c11 = c12;
                        }
                    }
                }
                i11++;
            } else if (!z11) {
                z12 = !z12;
                z11 = false;
                i11++;
            }
            stringBuffer.append(c12);
            z11 = false;
            i11++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i12 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static e40.b p(String str, int i11) {
        int length = (str.length() - i11) / 2;
        byte[] bArr = new byte[length];
        for (int i12 = 0; i12 != length; i12++) {
            int i13 = (i12 * 2) + i11;
            char charAt = str.charAt(i13);
            bArr[i12] = (byte) (f(str.charAt(i13 + 1)) | (f(charAt) << 4));
        }
        return n.k(bArr);
    }

    public static String q(e40.b bVar) {
        StringBuffer stringBuffer = new StringBuffer();
        if (!(bVar instanceof g) || (bVar instanceof b1)) {
            try {
                stringBuffer.append('#');
                stringBuffer.append(org.bouncycastle.util.encoders.b.f(bVar.toASN1Primitive().d(ASN1Encoding.DER)));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String string = ((g) bVar).getString();
            if (string.length() > 0 && string.charAt(0) == '#') {
                stringBuffer.append(CoreConstants.ESCAPE_CHAR);
            }
            stringBuffer.append(string);
        }
        int length = stringBuffer.length();
        int i11 = 2;
        i11 = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 0 : 0;
        while (i11 != length) {
            char charAt = stringBuffer.charAt(i11);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i11++;
                        continue;
                }
            }
            stringBuffer.insert(i11, "\\");
            i11 += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            for (int i12 = 0; stringBuffer.length() > i12 && stringBuffer.charAt(i12) == ' '; i12 += 2) {
                stringBuffer.insert(i12, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, CoreConstants.ESCAPE_CHAR);
        }
        return stringBuffer.toString();
    }
}