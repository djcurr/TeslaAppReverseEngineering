package okio;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes5.dex */
public class i implements Serializable, Comparable<i> {

    /* renamed from: a */
    private transient int f42658a;

    /* renamed from: b */
    private transient String f42659b;

    /* renamed from: c */
    private final byte[] f42660c;

    /* renamed from: e */
    public static final a f42657e = new a(null);

    /* renamed from: d */
    public static final i f42656d = new i(new byte[0]);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ i d(a aVar, String str, Charset charset, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                charset = kotlin.text.d.f35187b;
            }
            return aVar.c(str, charset);
        }

        public static /* synthetic */ i h(a aVar, byte[] bArr, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = 0;
            }
            if ((i13 & 2) != 0) {
                i12 = bArr.length;
            }
            return aVar.g(bArr, i11, i12);
        }

        public final i a(String decodeBase64) {
            kotlin.jvm.internal.s.g(decodeBase64, "$this$decodeBase64");
            byte[] a11 = okio.a.a(decodeBase64);
            if (a11 != null) {
                return new i(a11);
            }
            return null;
        }

        public final i b(String decodeHex) {
            int e11;
            int e12;
            kotlin.jvm.internal.s.g(decodeHex, "$this$decodeHex");
            if (decodeHex.length() % 2 == 0) {
                int length = decodeHex.length() / 2;
                byte[] bArr = new byte[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int i12 = i11 * 2;
                    e11 = q30.b.e(decodeHex.charAt(i12));
                    e12 = q30.b.e(decodeHex.charAt(i12 + 1));
                    bArr[i11] = (byte) ((e11 << 4) + e12);
                }
                return new i(bArr);
            }
            throw new IllegalArgumentException(("Unexpected hex string: " + decodeHex).toString());
        }

        public final i c(String encode, Charset charset) {
            kotlin.jvm.internal.s.g(encode, "$this$encode");
            kotlin.jvm.internal.s.g(charset, "charset");
            byte[] bytes = encode.getBytes(charset);
            kotlin.jvm.internal.s.f(bytes, "(this as java.lang.String).getBytes(charset)");
            return new i(bytes);
        }

        public final i e(String encodeUtf8) {
            kotlin.jvm.internal.s.g(encodeUtf8, "$this$encodeUtf8");
            i iVar = new i(b.a(encodeUtf8));
            iVar.w(encodeUtf8);
            return iVar;
        }

        public final i f(byte... data) {
            kotlin.jvm.internal.s.g(data, "data");
            byte[] copyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.s.f(copyOf, "java.util.Arrays.copyOf(this, size)");
            return new i(copyOf);
        }

        public final i g(byte[] toByteString, int i11, int i12) {
            byte[] p11;
            kotlin.jvm.internal.s.g(toByteString, "$this$toByteString");
            c.b(toByteString.length, i11, i12);
            p11 = wz.o.p(toByteString, i11, i12 + i11);
            return new i(p11);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public i(byte[] data) {
        kotlin.jvm.internal.s.g(data, "data");
        this.f42660c = data;
    }

    public static final i c(String str) {
        return f42657e.a(str);
    }

    public static final i d(String str) {
        return f42657e.b(str);
    }

    public static final i f(String str) {
        return f42657e.e(str);
    }

    public static final i s(byte... bArr) {
        return f42657e.f(bArr);
    }

    public final boolean A(i prefix) {
        kotlin.jvm.internal.s.g(prefix, "prefix");
        return t(0, prefix, 0, prefix.z());
    }

    public String B(Charset charset) {
        kotlin.jvm.internal.s.g(charset, "charset");
        return new String(this.f42660c, charset);
    }

    public i D() {
        byte b11;
        for (int i11 = 0; i11 < h().length; i11++) {
            byte b12 = h()[i11];
            byte b13 = (byte) 65;
            if (b12 >= b13 && b12 <= (b11 = (byte) 90)) {
                byte[] h11 = h();
                byte[] copyOf = Arrays.copyOf(h11, h11.length);
                kotlin.jvm.internal.s.f(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i11] = (byte) (b12 + 32);
                for (int i12 = i11 + 1; i12 < copyOf.length; i12++) {
                    byte b14 = copyOf[i12];
                    if (b14 >= b13 && b14 <= b11) {
                        copyOf[i12] = (byte) (b14 + 32);
                    }
                }
                return new i(copyOf);
            }
        }
        return this;
    }

    public byte[] E() {
        byte[] h11 = h();
        byte[] copyOf = Arrays.copyOf(h11, h11.length);
        kotlin.jvm.internal.s.f(copyOf, "java.util.Arrays.copyOf(this, size)");
        return copyOf;
    }

    public String F() {
        String l11 = l();
        if (l11 == null) {
            String b11 = b.b(o());
            w(b11);
            return b11;
        }
        return l11;
    }

    public void G(f buffer, int i11, int i12) {
        kotlin.jvm.internal.s.g(buffer, "buffer");
        q30.b.d(this, buffer, i11, i12);
    }

    public String a() {
        return okio.a.c(h(), null, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0028, code lost:
        if (r7 < r8) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
        if (r0 < r1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return -1;
     */
    @Override // java.lang.Comparable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(okio.i r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.s.g(r10, r0)
            int r0 = r9.z()
            int r1 = r10.z()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2b
            byte r7 = r9.g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.i.compareTo(okio.i):int");
    }

    public i e(String algorithm) {
        kotlin.jvm.internal.s.g(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f42660c, 0, z());
        byte[] digestBytes = messageDigest.digest();
        kotlin.jvm.internal.s.f(digestBytes, "digestBytes");
        return new i(digestBytes);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.z() == h().length && iVar.u(0, h(), 0, h().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte g(int i11) {
        return q(i11);
    }

    public final byte[] h() {
        return this.f42660c;
    }

    public int hashCode() {
        int i11 = i();
        if (i11 != 0) {
            return i11;
        }
        int hashCode = Arrays.hashCode(h());
        v(hashCode);
        return hashCode;
    }

    public final int i() {
        return this.f42658a;
    }

    public int k() {
        return h().length;
    }

    public final String l() {
        return this.f42659b;
    }

    public String n() {
        byte[] h11;
        char[] cArr = new char[h().length * 2];
        int i11 = 0;
        for (byte b11 : h()) {
            int i12 = i11 + 1;
            cArr[i11] = q30.b.f()[(b11 >> 4) & 15];
            i11 = i12 + 1;
            cArr[i12] = q30.b.f()[b11 & 15];
        }
        return new String(cArr);
    }

    public byte[] o() {
        return h();
    }

    public byte q(int i11) {
        return h()[i11];
    }

    public final i r() {
        return e("MD5");
    }

    public boolean t(int i11, i other, int i12, int i13) {
        kotlin.jvm.internal.s.g(other, "other");
        return other.u(i12, h(), i11, i13);
    }

    public String toString() {
        int c11;
        String D;
        String D2;
        String D3;
        i iVar;
        byte[] p11;
        if (h().length == 0) {
            return "[size=0]";
        }
        c11 = q30.b.c(h(), 64);
        if (c11 == -1) {
            if (h().length <= 64) {
                return "[hex=" + n() + ']';
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[size=");
            sb2.append(h().length);
            sb2.append(" hex=");
            if (64 <= h().length) {
                if (64 == h().length) {
                    iVar = this;
                } else {
                    p11 = wz.o.p(h(), 0, 64);
                    iVar = new i(p11);
                }
                sb2.append(iVar.n());
                sb2.append("…]");
                return sb2.toString();
            }
            throw new IllegalArgumentException(("endIndex > length(" + h().length + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        String F = F();
        Objects.requireNonNull(F, "null cannot be cast to non-null type java.lang.String");
        String substring = F.substring(0, c11);
        kotlin.jvm.internal.s.f(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        D = kotlin.text.v.D(substring, "\\", "\\\\", false, 4, null);
        D2 = kotlin.text.v.D(D, "\n", "\\n", false, 4, null);
        D3 = kotlin.text.v.D(D2, "\r", "\\r", false, 4, null);
        if (c11 < F.length()) {
            return "[size=" + h().length + " text=" + D3 + "…]";
        }
        return "[text=" + D3 + ']';
    }

    public boolean u(int i11, byte[] other, int i12, int i13) {
        kotlin.jvm.internal.s.g(other, "other");
        return i11 >= 0 && i11 <= h().length - i13 && i12 >= 0 && i12 <= other.length - i13 && c.a(h(), i11, other, i12, i13);
    }

    public final void v(int i11) {
        this.f42658a = i11;
    }

    public final void w(String str) {
        this.f42659b = str;
    }

    public final i x() {
        return e(McElieceCCA2KeyGenParameterSpec.SHA1);
    }

    public final i y() {
        return e(McElieceCCA2KeyGenParameterSpec.SHA256);
    }

    public final int z() {
        return k();
    }
}