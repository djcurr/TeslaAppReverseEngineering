package e50;

import java.io.IOException;
import java.util.StringTokenizer;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class w extends e40.c implements e40.a {

    /* renamed from: a */
    private e40.b f24812a;

    /* renamed from: b */
    private int f24813b;

    public w(int i11, e40.b bVar) {
        this.f24812a = bVar;
        this.f24813b = i11;
    }

    public w(int i11, String str) {
        e40.b p0Var;
        this.f24813b = i11;
        if (i11 == 1 || i11 == 2 || i11 == 6) {
            p0Var = new org.bouncycastle.asn1.p0(str);
        } else if (i11 == 8) {
            p0Var = new org.bouncycastle.asn1.k(str);
        } else if (i11 != 4) {
            if (i11 != 7) {
                throw new IllegalArgumentException("can't process String for tag: " + i11);
            }
            byte[] p11 = p(str);
            if (p11 == null) {
                throw new IllegalArgumentException("IP Address is invalid");
            }
            this.f24812a = new org.bouncycastle.asn1.s0(p11);
            return;
        } else {
            p0Var = new c50.c(str);
        }
        this.f24812a = p0Var;
    }

    public w(c50.c cVar) {
        this.f24812a = cVar;
        this.f24813b = 4;
    }

    private void e(int[] iArr, byte[] bArr, int i11) {
        for (int i12 = 0; i12 != iArr.length; i12++) {
            int i13 = i12 * 2;
            bArr[i13 + i11] = (byte) (iArr[i12] >> 8);
            bArr[i13 + 1 + i11] = (byte) iArr[i12];
        }
    }

    public static w f(Object obj) {
        if (obj == null || (obj instanceof w)) {
            return (w) obj;
        }
        if (!(obj instanceof org.bouncycastle.asn1.s)) {
            if (obj instanceof byte[]) {
                try {
                    return f(org.bouncycastle.asn1.n.k((byte[]) obj));
                } catch (IOException unused) {
                    throw new IllegalArgumentException("unable to parse encoded general name");
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        org.bouncycastle.asn1.s sVar = (org.bouncycastle.asn1.s) obj;
        int s11 = sVar.s();
        switch (s11) {
            case 0:
            case 3:
            case 5:
                return new w(s11, org.bouncycastle.asn1.p.q(sVar, false));
            case 1:
            case 2:
            case 6:
                return new w(s11, org.bouncycastle.asn1.p0.q(sVar, false));
            case 4:
                return new w(s11, c50.c.h(sVar, true));
            case 7:
                return new w(s11, org.bouncycastle.asn1.l.q(sVar, false));
            case 8:
                return new w(s11, org.bouncycastle.asn1.k.v(sVar, false));
            default:
                throw new IllegalArgumentException("unknown tag: " + s11);
        }
    }

    public static w h(org.bouncycastle.asn1.s sVar, boolean z11) {
        return f(org.bouncycastle.asn1.s.q(sVar, true));
    }

    private void k(String str, byte[] bArr, int i11) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "./");
        int i12 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i12 + i11] = (byte) Integer.parseInt(stringTokenizer.nextToken());
            i12++;
        }
    }

    private void m(String str, byte[] bArr, int i11) {
        int parseInt = Integer.parseInt(str);
        for (int i12 = 0; i12 != parseInt; i12++) {
            int i13 = (i12 / 8) + i11;
            bArr[i13] = (byte) (bArr[i13] | (1 << (7 - (i12 % 8))));
        }
    }

    private int[] n(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ":", true);
        int[] iArr = new int[8];
        if (str.charAt(0) == ':' && str.charAt(1) == ':') {
            stringTokenizer.nextToken();
        }
        int i11 = -1;
        int i12 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals(":")) {
                iArr[i12] = 0;
                int i13 = i12;
                i12++;
                i11 = i13;
            } else if (nextToken.indexOf(46) < 0) {
                int i14 = i12 + 1;
                iArr[i12] = Integer.parseInt(nextToken, 16);
                if (stringTokenizer.hasMoreTokens()) {
                    stringTokenizer.nextToken();
                }
                i12 = i14;
            } else {
                StringTokenizer stringTokenizer2 = new StringTokenizer(nextToken, ".");
                int i15 = i12 + 1;
                iArr[i12] = (Integer.parseInt(stringTokenizer2.nextToken()) << 8) | Integer.parseInt(stringTokenizer2.nextToken());
                i12 = i15 + 1;
                iArr[i15] = Integer.parseInt(stringTokenizer2.nextToken()) | (Integer.parseInt(stringTokenizer2.nextToken()) << 8);
            }
        }
        if (i12 != 8) {
            int i16 = i12 - i11;
            int i17 = 8 - i16;
            System.arraycopy(iArr, i11, iArr, i17, i16);
            while (i11 != i17) {
                iArr[i11] = 0;
                i11++;
            }
        }
        return iArr;
    }

    private int[] o(String str) {
        int[] iArr = new int[8];
        int parseInt = Integer.parseInt(str);
        for (int i11 = 0; i11 != parseInt; i11++) {
            int i12 = i11 / 16;
            iArr[i12] = iArr[i12] | (1 << (15 - (i11 % 16)));
        }
        return iArr;
    }

    private byte[] p(String str) {
        if (r70.e.e(str) || r70.e.d(str)) {
            int indexOf = str.indexOf(47);
            if (indexOf < 0) {
                byte[] bArr = new byte[16];
                e(n(str), bArr, 0);
                return bArr;
            }
            byte[] bArr2 = new byte[32];
            e(n(str.substring(0, indexOf)), bArr2, 0);
            String substring = str.substring(indexOf + 1);
            e(substring.indexOf(58) > 0 ? n(substring) : o(substring), bArr2, 16);
            return bArr2;
        } else if (r70.e.c(str) || r70.e.b(str)) {
            int indexOf2 = str.indexOf(47);
            if (indexOf2 < 0) {
                byte[] bArr3 = new byte[4];
                k(str, bArr3, 0);
                return bArr3;
            }
            byte[] bArr4 = new byte[8];
            k(str.substring(0, indexOf2), bArr4, 0);
            String substring2 = str.substring(indexOf2 + 1);
            if (substring2.indexOf(46) > 0) {
                k(substring2, bArr4, 4);
            } else {
                m(substring2, bArr4, 4);
            }
            return bArr4;
        } else {
            return null;
        }
    }

    public e40.b i() {
        return this.f24812a;
    }

    public int j() {
        return this.f24813b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        int i11 = this.f24813b;
        return new z0(i11 == 4, i11, this.f24812a);
    }

    public String toString() {
        String string;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f24813b);
        stringBuffer.append(": ");
        int i11 = this.f24813b;
        if (i11 != 1 && i11 != 2) {
            if (i11 == 4) {
                string = c50.c.f(this.f24812a).toString();
            } else if (i11 != 6) {
                string = this.f24812a.toString();
            }
            stringBuffer.append(string);
            return stringBuffer.toString();
        }
        string = org.bouncycastle.asn1.p0.p(this.f24812a).getString();
        stringBuffer.append(string);
        return stringBuffer.toString();
    }
}