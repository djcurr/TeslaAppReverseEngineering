package org.bouncycastle.asn1;

import ch.qos.logback.core.CoreConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public class k extends n {

    /* renamed from: c */
    private static final ConcurrentMap<a, k> f43057c = new ConcurrentHashMap();

    /* renamed from: a */
    private final String f43058a;

    /* renamed from: b */
    private byte[] f43059b;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        private final int f43060a;

        /* renamed from: b */
        private final byte[] f43061b;

        a(byte[] bArr) {
            this.f43060a = org.bouncycastle.util.a.F(bArr);
            this.f43061b = bArr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return org.bouncycastle.util.a.c(this.f43061b, ((a) obj).f43061b);
            }
            return false;
        }

        public int hashCode() {
            return this.f43060a;
        }
    }

    public k(String str) {
        Objects.requireNonNull(str, "'identifier' cannot be null");
        if (y(str)) {
            this.f43058a = str;
            return;
        }
        throw new IllegalArgumentException("string " + str + " not an OID");
    }

    k(k kVar, String str) {
        if (!x(str, 0)) {
            throw new IllegalArgumentException("string " + str + " not a valid OID branch");
        }
        this.f43058a = kVar.t() + "." + str;
    }

    k(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z11 = true;
        long j11 = 0;
        BigInteger bigInteger = null;
        for (int i11 = 0; i11 != bArr.length; i11++) {
            int i12 = bArr[i11] & 255;
            if (j11 <= 72057594037927808L) {
                long j12 = j11 + (i12 & 127);
                if ((i12 & 128) == 0) {
                    if (z11) {
                        if (j12 < 40) {
                            stringBuffer.append('0');
                        } else if (j12 < 80) {
                            stringBuffer.append('1');
                            j12 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j12 -= 80;
                        }
                        z11 = false;
                    }
                    stringBuffer.append(CoreConstants.DOT);
                    stringBuffer.append(j12);
                    j11 = 0;
                } else {
                    j11 = j12 << 7;
                }
            } else {
                BigInteger or2 = (bigInteger == null ? BigInteger.valueOf(j11) : bigInteger).or(BigInteger.valueOf(i12 & 127));
                if ((i12 & 128) == 0) {
                    if (z11) {
                        stringBuffer.append('2');
                        or2 = or2.subtract(BigInteger.valueOf(80L));
                        z11 = false;
                    }
                    stringBuffer.append(CoreConstants.DOT);
                    stringBuffer.append(or2);
                    j11 = 0;
                    bigInteger = null;
                } else {
                    bigInteger = or2.shiftLeft(7);
                }
            }
        }
        this.f43058a = stringBuffer.toString();
        this.f43059b = org.bouncycastle.util.a.h(bArr);
    }

    private void A(ByteArrayOutputStream byteArrayOutputStream, long j11) {
        byte[] bArr = new byte[9];
        int i11 = 8;
        bArr[8] = (byte) (((int) j11) & 127);
        while (j11 >= 128) {
            j11 >>= 7;
            i11--;
            bArr[i11] = (byte) ((((int) j11) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i11, 9 - i11);
    }

    private void B(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i11 = bitLength - 1;
        for (int i12 = i11; i12 >= 0; i12--) {
            bArr[i12] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i11] = (byte) (bArr[i11] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    private void q(ByteArrayOutputStream byteArrayOutputStream) {
        e40.i iVar = new e40.i(this.f43058a);
        int parseInt = Integer.parseInt(iVar.b()) * 40;
        String b11 = iVar.b();
        if (b11.length() <= 18) {
            A(byteArrayOutputStream, parseInt + Long.parseLong(b11));
        } else {
            B(byteArrayOutputStream, new BigInteger(b11).add(BigInteger.valueOf(parseInt)));
        }
        while (iVar.a()) {
            String b12 = iVar.b();
            if (b12.length() <= 18) {
                A(byteArrayOutputStream, Long.parseLong(b12));
            } else {
                B(byteArrayOutputStream, new BigInteger(b12));
            }
        }
    }

    public static k r(byte[] bArr) {
        k kVar = f43057c.get(new a(bArr));
        return kVar == null ? new k(bArr) : kVar;
    }

    private synchronized byte[] s() {
        if (this.f43059b == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            q(byteArrayOutputStream);
            this.f43059b = byteArrayOutputStream.toByteArray();
        }
        return this.f43059b;
    }

    public static k u(Object obj) {
        if (obj == null || (obj instanceof k)) {
            return (k) obj;
        }
        if (obj instanceof e40.b) {
            n aSN1Primitive = ((e40.b) obj).toASN1Primitive();
            if (aSN1Primitive instanceof k) {
                return (k) aSN1Primitive;
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (k) n.k((byte[]) obj);
        } catch (IOException e11) {
            throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e11.getMessage());
        }
    }

    public static k v(s sVar, boolean z11) {
        n r11 = sVar.r();
        return (z11 || (r11 instanceof k)) ? u(r11) : r(l.p(r11).r());
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0015, code lost:
        if (r2 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0017, code lost:
        if (r2 <= 1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x001f, code lost:
        if (r7.charAt(r0 + 1) != '0') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x002b, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean x(java.lang.String r7, int r8) {
        /*
            int r0 = r7.length()
            r1 = 0
        L5:
            r2 = r1
        L6:
            int r0 = r0 + (-1)
            r3 = 48
            r4 = 1
            if (r0 < r8) goto L2c
            char r5 = r7.charAt(r0)
            r6 = 46
            if (r5 != r6) goto L22
            if (r2 == 0) goto L21
            if (r2 <= r4) goto L5
            int r2 = r0 + 1
            char r2 = r7.charAt(r2)
            if (r2 != r3) goto L5
        L21:
            return r1
        L22:
            if (r3 > r5) goto L2b
            r3 = 57
            if (r5 > r3) goto L2b
            int r2 = r2 + 1
            goto L6
        L2b:
            return r1
        L2c:
            if (r2 == 0) goto L39
            if (r2 <= r4) goto L38
            int r0 = r0 + r4
            char r7 = r7.charAt(r0)
            if (r7 != r3) goto L38
            goto L39
        L38:
            return r4
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.k.x(java.lang.String, int):boolean");
    }

    private static boolean y(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        return x(str, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean e(n nVar) {
        if (nVar == this) {
            return true;
        }
        if (nVar instanceof k) {
            return this.f43058a.equals(((k) nVar).f43058a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public void f(m mVar, boolean z11) {
        mVar.n(z11, 6, s());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public int h() {
        int length = s().length;
        return v1.a(length) + 1 + length;
    }

    @Override // e40.c
    public int hashCode() {
        return this.f43058a.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.bouncycastle.asn1.n
    public boolean m() {
        return false;
    }

    public k p(String str) {
        return new k(this, str);
    }

    public String t() {
        return this.f43058a;
    }

    public String toString() {
        return t();
    }

    public k w() {
        a aVar = new a(s());
        ConcurrentMap<a, k> concurrentMap = f43057c;
        k kVar = concurrentMap.get(aVar);
        if (kVar == null) {
            k putIfAbsent = concurrentMap.putIfAbsent(aVar, this);
            return putIfAbsent == null ? this : putIfAbsent;
        }
        return kVar;
    }

    public boolean z(k kVar) {
        String t11 = t();
        String t12 = kVar.t();
        return t11.length() > t12.length() && t11.charAt(t12.length()) == '.' && t11.startsWith(t12);
    }
}