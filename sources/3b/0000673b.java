package e50;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.x509.NameConstraintValidatorException;

/* loaded from: classes5.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    private Set f24701a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private Set f24702b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private Set f24703c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private Set f24704d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private Set f24705e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private Set f24706f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private Set f24707g;

    /* renamed from: h  reason: collision with root package name */
    private Set f24708h;

    /* renamed from: i  reason: collision with root package name */
    private Set f24709i;

    /* renamed from: j  reason: collision with root package name */
    private Set f24710j;

    /* renamed from: k  reason: collision with root package name */
    private Set f24711k;

    /* renamed from: l  reason: collision with root package name */
    private Set f24712l;

    private Set A(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            org.bouncycastle.asn1.p p11 = org.bouncycastle.asn1.p.p(((y) it2.next()).e().i().toASN1Primitive());
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    org.bouncycastle.asn1.p pVar = (org.bouncycastle.asn1.p) it3.next();
                    if (h0(p11, pVar)) {
                        hashSet.add(p11);
                    } else if (h0(pVar, p11)) {
                        hashSet.add(pVar);
                    }
                }
            } else if (p11 != null) {
                hashSet.add(p11);
            }
        }
        return hashSet;
    }

    private Set B(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String y11 = y(((y) it2.next()).e());
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (i0(str, y11)) {
                        hashSet.add(str);
                    } else if (i0(y11, str)) {
                        hashSet.add(y11);
                    }
                }
            } else if (y11 != null) {
                hashSet.add(y11);
            }
        }
        return hashSet;
    }

    private Set C(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String y11 = y(((y) it2.next()).e());
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    D(y11, (String) it3.next(), hashSet);
                }
            } else if (y11 != null) {
                hashSet.add(y11);
            }
        }
        return hashSet;
    }

    private void D(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (!str.equalsIgnoreCase(str2)) {
                    return;
                }
            } else if (str2.startsWith(".")) {
                if (!i0(substring, str2)) {
                    return;
                }
            } else if (!substring.equalsIgnoreCase(str2)) {
                return;
            }
        } else if (str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (!i0(str2.substring(str.indexOf(64) + 1), str)) {
                    return;
                }
            } else if (str2.startsWith(".")) {
                if (!i0(str, str2) && !str.equalsIgnoreCase(str2)) {
                    if (!i0(str2, str)) {
                        return;
                    }
                }
            } else if (!i0(str2, str)) {
                return;
            }
            set.add(str2);
            return;
        } else if (str2.indexOf(64) != -1) {
            if (!str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                return;
            }
            set.add(str2);
            return;
        } else if (str2.startsWith(".")) {
            if (!i0(str, str2)) {
                return;
            }
        } else if (!str.equalsIgnoreCase(str2)) {
            return;
        }
        set.add(str);
    }

    private Set F(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            byte[] r11 = org.bouncycastle.asn1.l.p(((y) it2.next()).e().i()).r();
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    hashSet.addAll(G((byte[]) it3.next(), r11));
                }
            } else if (r11 != null) {
                hashSet.add(r11);
            }
        }
        return hashSet;
    }

    private Set G(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return Collections.EMPTY_SET;
        }
        byte[][] x11 = x(bArr, bArr2);
        byte[] bArr3 = x11[0];
        byte[] bArr4 = x11[1];
        byte[] bArr5 = x11[2];
        byte[] bArr6 = x11[3];
        byte[][] S = S(bArr3, bArr4, bArr5, bArr6);
        return t(Q(S[0], S[2]), R(S[1], S[3])) == 1 ? Collections.EMPTY_SET : Collections.singleton(N(T(S[0], S[2]), T(bArr4, bArr6)));
    }

    private Set H(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            g0 e11 = g0.e(((y) it2.next()).e().i());
            if (set != null) {
                for (Object obj : set) {
                    I(e11, g0.e(obj), hashSet);
                }
            } else if (e11 != null) {
                hashSet.add(e11);
            }
        }
        return hashSet;
    }

    private void I(g0 g0Var, g0 g0Var2, Set set) {
        if (g0Var.equals(g0Var2)) {
            set.add(g0Var);
        }
    }

    private Set L(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String y11 = y(((y) it2.next()).e());
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    M((String) it3.next(), y11, hashSet);
                }
            } else if (y11 != null) {
                hashSet.add(y11);
            }
        }
        return hashSet;
    }

    private void M(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (!str.equalsIgnoreCase(str2)) {
                    return;
                }
            } else if (str2.startsWith(".")) {
                if (!i0(substring, str2)) {
                    return;
                }
            } else if (!substring.equalsIgnoreCase(str2)) {
                return;
            }
        } else if (str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (!i0(str2.substring(str.indexOf(64) + 1), str)) {
                    return;
                }
            } else if (str2.startsWith(".")) {
                if (!i0(str, str2) && !str.equalsIgnoreCase(str2)) {
                    if (!i0(str2, str)) {
                        return;
                    }
                }
            } else if (!i0(str2, str)) {
                return;
            }
            set.add(str2);
            return;
        } else if (str2.indexOf(64) != -1) {
            if (!str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                return;
            }
            set.add(str2);
            return;
        } else if (str2.startsWith(".")) {
            if (!i0(str, str2)) {
                return;
            }
        } else if (!str.equalsIgnoreCase(str2)) {
            return;
        }
        set.add(str);
    }

    private byte[] N(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length * 2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length);
        return bArr3;
    }

    private boolean O(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr4[i11] = (byte) (bArr2[i11] & bArr3[i11]);
            bArr5[i11] = (byte) (bArr[i11] & bArr3[i11]);
        }
        return org.bouncycastle.util.a.c(bArr4, bArr5);
    }

    private boolean P(String str, String str2) {
        String w11 = w(str);
        return !str2.startsWith(".") ? w11.equalsIgnoreCase(str2) : i0(w11, str2);
    }

    private static byte[] Q(byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if ((bArr[i11] & 65535) > (65535 & bArr2[i11])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private static byte[] R(byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if ((bArr[i11] & 65535) < (65535 & bArr2[i11])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private byte[][] S(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        byte[] bArr7 = new byte[length];
        byte[] bArr8 = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr5[i11] = (byte) (bArr[i11] & bArr2[i11]);
            bArr6[i11] = (byte) ((bArr[i11] & bArr2[i11]) | (~bArr2[i11]));
            bArr7[i11] = (byte) (bArr3[i11] & bArr4[i11]);
            bArr8[i11] = (byte) ((bArr3[i11] & bArr4[i11]) | (~bArr4[i11]));
        }
        return new byte[][]{bArr5, bArr6, bArr7, bArr8};
    }

    private static byte[] T(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr3[i11] = (byte) (bArr[i11] | bArr2[i11]);
        }
        return bArr3;
    }

    private boolean U(g0 g0Var, g0 g0Var2) {
        return g0Var2.equals(g0Var);
    }

    private String V(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < bArr.length / 2; i11++) {
            if (sb2.length() > 0) {
                sb2.append(".");
            }
            sb2.append(Integer.toString(bArr[i11] & 255));
        }
        sb2.append("/");
        boolean z11 = true;
        for (int length = bArr.length / 2; length < bArr.length; length++) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(".");
            }
            sb2.append(Integer.toString(bArr[length] & 255));
        }
        return sb2.toString();
    }

    private String W(Set set) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (sb2.length() > 1) {
                sb2.append(",");
            }
            sb2.append(V((byte[]) it2.next()));
        }
        sb2.append("]");
        return sb2.toString();
    }

    private String X(Set set) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Object obj : set) {
            if (sb2.length() > 1) {
                sb2.append(",");
            }
            g0 e11 = g0.e(obj);
            sb2.append(e11.f().t());
            sb2.append(":");
            try {
                sb2.append(org.bouncycastle.util.encoders.b.f(e11.h().toASN1Primitive().getEncoded()));
            } catch (IOException e12) {
                sb2.append(e12.toString());
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    private Set Y(Set set, org.bouncycastle.asn1.p pVar) {
        if (set.isEmpty()) {
            if (pVar == null) {
                return set;
            }
            set.add(pVar);
            return set;
        }
        HashSet hashSet = new HashSet();
        for (Object obj : set) {
            org.bouncycastle.asn1.p p11 = org.bouncycastle.asn1.p.p(obj);
            if (h0(pVar, p11)) {
                hashSet.add(p11);
            } else {
                if (!h0(p11, pVar)) {
                    hashSet.add(p11);
                }
                hashSet.add(pVar);
            }
        }
        return hashSet;
    }

    private Set Z(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (!i0(str2, str)) {
                boolean i02 = i0(str, str2);
                hashSet.add(str2);
                if (i02) {
                }
            }
            hashSet.add(str);
        }
        return hashSet;
    }

    private Set a0(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            b0((String) it2.next(), str, hashSet);
        }
        return hashSet;
    }

    private final void b(StringBuilder sb2, String str) {
        sb2.append(str);
        sb2.append(r70.m.d());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (i0(r6.substring(r5.indexOf(64) + 1), r5) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
        if (i0(r6, r5) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
        if (i0(r6, r5) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
        if (r6.substring(r5.indexOf(64) + 1).equalsIgnoreCase(r5) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
        if (i0(r5, r6) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
        if (r5.equalsIgnoreCase(r6) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
        r7.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r5.equalsIgnoreCase(r6) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b0(java.lang.String r5, java.lang.String r6, java.util.Set r7) {
        /*
            r4 = this;
            r0 = 64
            int r1 = r5.indexOf(r0)
            java.lang.String r2 = "."
            r3 = -1
            if (r1 == r3) goto L38
            int r1 = r5.indexOf(r0)
            int r1 = r1 + 1
            java.lang.String r1 = r5.substring(r1)
            int r0 = r6.indexOf(r0)
            if (r0 == r3) goto L23
            boolean r0 = r5.equalsIgnoreCase(r6)
            if (r0 == 0) goto La4
            goto La0
        L23:
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L31
            boolean r0 = r4.i0(r1, r6)
            if (r0 == 0) goto La4
            goto L99
        L31:
            boolean r0 = r1.equalsIgnoreCase(r6)
            if (r0 == 0) goto La4
            goto L99
        L38:
            boolean r1 = r5.startsWith(r2)
            if (r1 == 0) goto L76
            int r1 = r6.indexOf(r0)
            if (r1 == r3) goto L55
            int r0 = r5.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r6.substring(r0)
            boolean r0 = r4.i0(r0, r5)
            if (r0 == 0) goto La4
            goto La0
        L55:
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L6f
            boolean r0 = r4.i0(r5, r6)
            if (r0 != 0) goto La7
            boolean r0 = r5.equalsIgnoreCase(r6)
            if (r0 == 0) goto L68
            goto La7
        L68:
            boolean r0 = r4.i0(r6, r5)
            if (r0 == 0) goto La4
            goto La0
        L6f:
            boolean r0 = r4.i0(r6, r5)
            if (r0 == 0) goto La4
            goto La0
        L76:
            int r1 = r6.indexOf(r0)
            if (r1 == r3) goto L8d
            int r0 = r5.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r6.substring(r0)
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto La4
            goto La0
        L8d:
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L9a
            boolean r0 = r4.i0(r5, r6)
            if (r0 == 0) goto La4
        L99:
            goto La7
        L9a:
            boolean r0 = r5.equalsIgnoreCase(r6)
            if (r0 == 0) goto La4
        La0:
            r7.add(r5)
            goto Laa
        La4:
            r7.add(r5)
        La7:
            r7.add(r6)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e50.h0.b0(java.lang.String, java.lang.String, java.util.Set):void");
    }

    private Set c0(Set set, byte[] bArr) {
        if (set.isEmpty()) {
            if (bArr == null) {
                return set;
            }
            set.add(bArr);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(d0((byte[]) it2.next(), bArr));
        }
        return hashSet;
    }

    private Set d0(byte[] bArr, byte[] bArr2) {
        HashSet hashSet = new HashSet();
        boolean c11 = org.bouncycastle.util.a.c(bArr, bArr2);
        hashSet.add(bArr);
        if (!c11) {
            hashSet.add(bArr2);
        }
        return hashSet;
    }

    private void e(Set set, org.bouncycastle.asn1.p pVar) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (h0(pVar, (org.bouncycastle.asn1.p) it2.next())) {
                throw new NameConstraintValidatorException("Subject distinguished name is from an excluded subtree");
            }
        }
    }

    private Set e0(Set set, g0 g0Var) {
        HashSet hashSet = set != null ? new HashSet(set) : new HashSet();
        hashSet.add(g0Var);
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f(java.util.Set r3, java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r2.i0(r4, r0)
            if (r1 != 0) goto L24
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L24
            goto Lb
        L24:
            org.bouncycastle.asn1.x509.NameConstraintValidatorException r3 = new org.bouncycastle.asn1.x509.NameConstraintValidatorException
            java.lang.String r4 = "DNS is from an excluded subtree."
            r3.<init>(r4)
            throw r3
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e50.h0.f(java.util.Set, java.lang.String):void");
    }

    private Set f0(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            g0((String) it2.next(), str, hashSet);
        }
        return hashSet;
    }

    private void g(Set set, String str) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (u(str, (String) it2.next())) {
                throw new NameConstraintValidatorException("Email address is from an excluded subtree.");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (i0(r6.substring(r5.indexOf(64) + 1), r5) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
        if (i0(r6, r5) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
        if (i0(r6, r5) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008a, code lost:
        if (r6.substring(r5.indexOf(64) + 1).equalsIgnoreCase(r5) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
        if (i0(r5, r6) != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
        if (r5.equalsIgnoreCase(r6) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
        r7.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r5.equalsIgnoreCase(r6) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g0(java.lang.String r5, java.lang.String r6, java.util.Set r7) {
        /*
            r4 = this;
            r0 = 64
            int r1 = r5.indexOf(r0)
            java.lang.String r2 = "."
            r3 = -1
            if (r1 == r3) goto L38
            int r1 = r5.indexOf(r0)
            int r1 = r1 + 1
            java.lang.String r1 = r5.substring(r1)
            int r0 = r6.indexOf(r0)
            if (r0 == r3) goto L23
            boolean r0 = r5.equalsIgnoreCase(r6)
            if (r0 == 0) goto La4
            goto La0
        L23:
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L31
            boolean r0 = r4.i0(r1, r6)
            if (r0 == 0) goto La4
            goto L99
        L31:
            boolean r0 = r1.equalsIgnoreCase(r6)
            if (r0 == 0) goto La4
            goto L99
        L38:
            boolean r1 = r5.startsWith(r2)
            if (r1 == 0) goto L76
            int r1 = r6.indexOf(r0)
            if (r1 == r3) goto L55
            int r0 = r5.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r6.substring(r0)
            boolean r0 = r4.i0(r0, r5)
            if (r0 == 0) goto La4
            goto La0
        L55:
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L6f
            boolean r0 = r4.i0(r5, r6)
            if (r0 != 0) goto La7
            boolean r0 = r5.equalsIgnoreCase(r6)
            if (r0 == 0) goto L68
            goto La7
        L68:
            boolean r0 = r4.i0(r6, r5)
            if (r0 == 0) goto La4
            goto La0
        L6f:
            boolean r0 = r4.i0(r6, r5)
            if (r0 == 0) goto La4
            goto La0
        L76:
            int r1 = r6.indexOf(r0)
            if (r1 == r3) goto L8d
            int r0 = r5.indexOf(r0)
            int r0 = r0 + 1
            java.lang.String r0 = r6.substring(r0)
            boolean r0 = r0.equalsIgnoreCase(r5)
            if (r0 == 0) goto La4
            goto La0
        L8d:
            boolean r0 = r6.startsWith(r2)
            if (r0 == 0) goto L9a
            boolean r0 = r4.i0(r5, r6)
            if (r0 == 0) goto La4
        L99:
            goto La7
        L9a:
            boolean r0 = r5.equalsIgnoreCase(r6)
            if (r0 == 0) goto La4
        La0:
            r7.add(r5)
            goto Laa
        La4:
            r7.add(r5)
        La7:
            r7.add(r6)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e50.h0.g0(java.lang.String, java.lang.String, java.util.Set):void");
    }

    private void h(Set set, byte[] bArr) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (O(bArr, (byte[]) it2.next())) {
                throw new NameConstraintValidatorException("IP is from an excluded subtree.");
            }
        }
    }

    private static boolean h0(org.bouncycastle.asn1.p pVar, org.bouncycastle.asn1.p pVar2) {
        if (pVar2.size() >= 1 && pVar2.size() <= pVar.size()) {
            c50.b h11 = c50.b.h(pVar2.r(0));
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= pVar.size()) {
                    i11 = i12;
                    break;
                } else if (d50.d.j(h11, c50.b.h(pVar.r(i11)))) {
                    break;
                } else {
                    i12 = i11;
                    i11++;
                }
            }
            if (pVar2.size() > pVar.size() - i11) {
                return false;
            }
            for (int i13 = 0; i13 < pVar2.size(); i13++) {
                c50.b h12 = c50.b.h(pVar2.r(i13));
                c50.b h13 = c50.b.h(pVar.r(i11 + i13));
                if (h12.size() != h13.size() || !h12.f().f().j(h13.f().f())) {
                    return false;
                }
                if (h12.size() == 1 && h12.f().f().j(d50.e.G)) {
                    if (!h13.f().h().toString().startsWith(h12.f().h().toString())) {
                        return false;
                    }
                } else if (!d50.d.j(h12, h13)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private void i(Set set, g0 g0Var) {
        if (set.isEmpty()) {
            return;
        }
        for (Object obj : set) {
            if (U(g0Var, g0.e(obj))) {
                throw new NameConstraintValidatorException("OtherName is from an excluded subtree.");
            }
        }
    }

    private boolean i0(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] e11 = r70.m.e(str2, CoreConstants.DOT);
        String[] e12 = r70.m.e(str, CoreConstants.DOT);
        if (e12.length <= e11.length) {
            return false;
        }
        int length = e12.length - e11.length;
        for (int i11 = -1; i11 < e11.length; i11++) {
            if (i11 == -1) {
                if (e12[i11 + length].equals("")) {
                    return false;
                }
            } else if (!e11[i11].equalsIgnoreCase(e12[i11 + length])) {
                return false;
            }
        }
        return true;
    }

    private void j(Set set, String str) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (P(str, (String) it2.next())) {
                throw new NameConstraintValidatorException("URI is from an excluded subtree.");
            }
        }
    }

    private void m(Set set, org.bouncycastle.asn1.p pVar) {
        if (set == null) {
            return;
        }
        if (set.isEmpty() && pVar.size() == 0) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (h0(pVar, (org.bouncycastle.asn1.p) it2.next())) {
                return;
            }
        }
        throw new NameConstraintValidatorException("Subject distinguished name is not from a permitted subtree");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n(java.util.Set r4, java.lang.String r5) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.util.Iterator r0 = r4.iterator()
        L7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r3.i0(r5, r1)
            if (r2 != 0) goto L1f
            boolean r1 = r5.equalsIgnoreCase(r1)
            if (r1 == 0) goto L7
        L1f:
            return
        L20:
            int r5 = r5.length()
            if (r5 != 0) goto L2d
            int r4 = r4.size()
            if (r4 != 0) goto L2d
            return
        L2d:
            org.bouncycastle.asn1.x509.NameConstraintValidatorException r4 = new org.bouncycastle.asn1.x509.NameConstraintValidatorException
            java.lang.String r5 = "DNS is not from a permitted subtree."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e50.h0.n(java.util.Set, java.lang.String):void");
    }

    private void o(Set set, String str) {
        if (set == null) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (u(str, (String) it2.next())) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new NameConstraintValidatorException("Subject email address is not from a permitted subtree.");
        }
    }

    private void p(Set set, byte[] bArr) {
        if (set == null) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (O(bArr, (byte[]) it2.next())) {
                return;
            }
        }
        if (bArr.length != 0 || set.size() != 0) {
            throw new NameConstraintValidatorException("IP is not from a permitted subtree.");
        }
    }

    private void q(Set set, g0 g0Var) {
        if (set == null) {
            return;
        }
        for (Object obj : set) {
            if (U(g0Var, g0.e(obj))) {
                return;
            }
        }
        throw new NameConstraintValidatorException("Subject OtherName is not from a permitted subtree.");
    }

    private void r(Set set, String str) {
        if (set == null) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (P(str, (String) it2.next())) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new NameConstraintValidatorException("URI is not from a permitted subtree.");
        }
    }

    private boolean s(Collection collection, Collection collection2) {
        boolean z11;
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (Object obj : collection) {
            Iterator it2 = collection2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (v(obj, it2.next())) {
                        z11 = true;
                        continue;
                        break;
                    }
                } else {
                    z11 = false;
                    continue;
                    break;
                }
            }
            if (!z11) {
                return false;
            }
        }
        return true;
    }

    private static int t(byte[] bArr, byte[] bArr2) {
        if (org.bouncycastle.util.a.c(bArr, bArr2)) {
            return 0;
        }
        return org.bouncycastle.util.a.c(Q(bArr, bArr2), bArr) ? 1 : -1;
    }

    private boolean u(String str, String str2) {
        String substring = str.substring(str.indexOf(64) + 1);
        if (str2.indexOf(64) != -1) {
            if (str.equalsIgnoreCase(str2) || substring.equalsIgnoreCase(str2.substring(1))) {
                return true;
            }
        } else if (str2.charAt(0) != '.') {
            if (substring.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (i0(substring, str2)) {
            return true;
        }
        return false;
    }

    private boolean v(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? org.bouncycastle.util.a.c((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    private static String w(String str) {
        String substring = str.substring(str.indexOf(58) + 1);
        if (substring.indexOf("//") != -1) {
            substring = substring.substring(substring.indexOf("//") + 2);
        }
        if (substring.lastIndexOf(58) != -1) {
            substring = substring.substring(0, substring.lastIndexOf(58));
        }
        String substring2 = substring.substring(substring.indexOf(58) + 1);
        String substring3 = substring2.substring(substring2.indexOf(64) + 1);
        return substring3.indexOf(47) != -1 ? substring3.substring(0, substring3.indexOf(47)) : substring3;
    }

    private byte[][] x(byte[] bArr, byte[] bArr2) {
        int length = bArr.length / 2;
        byte[] bArr3 = new byte[length];
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr, length, bArr4, 0, length);
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, length);
        System.arraycopy(bArr2, length, bArr6, 0, length);
        return new byte[][]{bArr3, bArr4, bArr5, bArr6};
    }

    private String y(w wVar) {
        return org.bouncycastle.asn1.p0.p(wVar.i()).getString();
    }

    private int z(Collection collection) {
        int i11 = 0;
        if (collection == null) {
            return 0;
        }
        for (Object obj : collection) {
            i11 += obj instanceof byte[] ? org.bouncycastle.util.a.F((byte[]) obj) : obj.hashCode();
        }
        return i11;
    }

    public void E(int i11) {
        if (i11 == 0) {
            this.f24712l = new HashSet();
        } else if (i11 == 1) {
            this.f24709i = new HashSet();
        } else if (i11 == 2) {
            this.f24708h = new HashSet();
        } else if (i11 == 4) {
            this.f24707g = new HashSet();
        } else if (i11 == 6) {
            this.f24710j = new HashSet();
        } else if (i11 == 7) {
            this.f24711k = new HashSet();
        } else {
            throw new IllegalStateException("Unknown tag encountered: " + i11);
        }
    }

    public void J(y yVar) {
        K(new y[]{yVar});
    }

    public void K(y[] yVarArr) {
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 != yVarArr.length; i11++) {
            y yVar = yVarArr[i11];
            Integer d11 = r70.f.d(yVar.e().j());
            if (hashMap.get(d11) == null) {
                hashMap.put(d11, new HashSet());
            }
            ((Set) hashMap.get(d11)).add(yVar);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 0) {
                this.f24712l = H(this.f24712l, (Set) entry.getValue());
            } else if (intValue == 1) {
                this.f24709i = C(this.f24709i, (Set) entry.getValue());
            } else if (intValue == 2) {
                this.f24708h = B(this.f24708h, (Set) entry.getValue());
            } else if (intValue == 4) {
                this.f24707g = A(this.f24707g, (Set) entry.getValue());
            } else if (intValue == 6) {
                this.f24710j = L(this.f24710j, (Set) entry.getValue());
            } else if (intValue != 7) {
                throw new IllegalStateException("Unknown tag encountered: " + intValue);
            } else {
                this.f24711k = F(this.f24711k, (Set) entry.getValue());
            }
        }
    }

    public void a(y yVar) {
        w e11 = yVar.e();
        int j11 = e11.j();
        if (j11 == 0) {
            this.f24706f = e0(this.f24706f, g0.e(e11.i()));
        } else if (j11 == 1) {
            this.f24703c = a0(this.f24703c, y(e11));
        } else if (j11 == 2) {
            this.f24702b = Z(this.f24702b, y(e11));
        } else if (j11 == 4) {
            this.f24701a = Y(this.f24701a, (org.bouncycastle.asn1.p) e11.i().toASN1Primitive());
        } else if (j11 == 6) {
            this.f24704d = f0(this.f24704d, y(e11));
        } else if (j11 == 7) {
            this.f24705e = c0(this.f24705e, org.bouncycastle.asn1.l.p(e11.i()).r());
        } else {
            throw new IllegalStateException("Unknown tag encountered: " + e11.j());
        }
    }

    public void c(w wVar) {
        int j11 = wVar.j();
        if (j11 == 0) {
            i(this.f24706f, g0.e(wVar.i()));
        } else if (j11 == 1) {
            g(this.f24703c, y(wVar));
        } else if (j11 == 2) {
            f(this.f24702b, y(wVar));
        } else if (j11 == 4) {
            d(c50.c.f(wVar.i()));
        } else if (j11 == 6) {
            j(this.f24704d, y(wVar));
        } else if (j11 != 7) {
        } else {
            h(this.f24705e, org.bouncycastle.asn1.l.p(wVar.i()).r());
        }
    }

    public void d(c50.c cVar) {
        e(this.f24701a, org.bouncycastle.asn1.p.p(cVar));
    }

    public boolean equals(Object obj) {
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return s(h0Var.f24701a, this.f24701a) && s(h0Var.f24702b, this.f24702b) && s(h0Var.f24703c, this.f24703c) && s(h0Var.f24705e, this.f24705e) && s(h0Var.f24704d, this.f24704d) && s(h0Var.f24706f, this.f24706f) && s(h0Var.f24707g, this.f24707g) && s(h0Var.f24708h, this.f24708h) && s(h0Var.f24709i, this.f24709i) && s(h0Var.f24711k, this.f24711k) && s(h0Var.f24710j, this.f24710j) && s(h0Var.f24712l, this.f24712l);
        }
        return false;
    }

    public int hashCode() {
        return z(this.f24701a) + z(this.f24702b) + z(this.f24703c) + z(this.f24705e) + z(this.f24704d) + z(this.f24706f) + z(this.f24707g) + z(this.f24708h) + z(this.f24709i) + z(this.f24711k) + z(this.f24710j) + z(this.f24712l);
    }

    public void k(w wVar) {
        int j11 = wVar.j();
        if (j11 == 0) {
            q(this.f24712l, g0.e(wVar.i()));
        } else if (j11 == 1) {
            o(this.f24709i, y(wVar));
        } else if (j11 == 2) {
            n(this.f24708h, y(wVar));
        } else if (j11 == 4) {
            l(c50.c.f(wVar.i()));
        } else if (j11 == 6) {
            r(this.f24710j, y(wVar));
        } else if (j11 != 7) {
        } else {
            p(this.f24711k, org.bouncycastle.asn1.l.p(wVar.i()).r());
        }
    }

    public void l(c50.c cVar) {
        m(this.f24707g, org.bouncycastle.asn1.p.p(cVar.toASN1Primitive()));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        b(sb2, "permitted:");
        if (this.f24707g != null) {
            b(sb2, "DN:");
            b(sb2, this.f24707g.toString());
        }
        if (this.f24708h != null) {
            b(sb2, "DNS:");
            b(sb2, this.f24708h.toString());
        }
        if (this.f24709i != null) {
            b(sb2, "Email:");
            b(sb2, this.f24709i.toString());
        }
        if (this.f24710j != null) {
            b(sb2, "URI:");
            b(sb2, this.f24710j.toString());
        }
        if (this.f24711k != null) {
            b(sb2, "IP:");
            b(sb2, W(this.f24711k));
        }
        if (this.f24712l != null) {
            b(sb2, "OtherName:");
            b(sb2, X(this.f24712l));
        }
        b(sb2, "excluded:");
        if (!this.f24701a.isEmpty()) {
            b(sb2, "DN:");
            b(sb2, this.f24701a.toString());
        }
        if (!this.f24702b.isEmpty()) {
            b(sb2, "DNS:");
            b(sb2, this.f24702b.toString());
        }
        if (!this.f24703c.isEmpty()) {
            b(sb2, "Email:");
            b(sb2, this.f24703c.toString());
        }
        if (!this.f24704d.isEmpty()) {
            b(sb2, "URI:");
            b(sb2, this.f24704d.toString());
        }
        if (!this.f24705e.isEmpty()) {
            b(sb2, "IP:");
            b(sb2, W(this.f24705e));
        }
        if (!this.f24706f.isEmpty()) {
            b(sb2, "OtherName:");
            b(sb2, X(this.f24706f));
        }
        return sb2.toString();
    }
}