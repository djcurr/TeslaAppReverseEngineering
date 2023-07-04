package com.google.common.io;

import com.google.common.base.q;
import com.google.common.base.u;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class BaseEncoding {

    /* renamed from: a  reason: collision with root package name */
    private static final BaseEncoding f16164a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b  reason: collision with root package name */
    private static final BaseEncoding f16165b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* loaded from: classes3.dex */
    public static final class DecodingException extends IOException {
        DecodingException(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f16166a;

        /* renamed from: b  reason: collision with root package name */
        private final char[] f16167b;

        /* renamed from: c  reason: collision with root package name */
        final int f16168c;

        /* renamed from: d  reason: collision with root package name */
        final int f16169d;

        /* renamed from: e  reason: collision with root package name */
        final int f16170e;

        /* renamed from: f  reason: collision with root package name */
        final int f16171f;

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f16172g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean[] f16173h;

        a(String str, char[] cArr) {
            this.f16166a = (String) u.o(str);
            this.f16167b = (char[]) u.o(cArr);
            try {
                int f11 = el.a.f(cArr.length, RoundingMode.UNNECESSARY);
                this.f16169d = f11;
                int min = Math.min(8, Integer.lowestOneBit(f11));
                try {
                    this.f16170e = 8 / min;
                    this.f16171f = f11 / min;
                    this.f16168c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i11 = 0; i11 < cArr.length; i11++) {
                        char c11 = cArr[i11];
                        u.f(c11 < 128, "Non-ASCII character: %s", c11);
                        u.f(bArr[c11] == -1, "Duplicate character: %s", c11);
                        bArr[c11] = (byte) i11;
                    }
                    this.f16172g = bArr;
                    boolean[] zArr = new boolean[this.f16170e];
                    for (int i12 = 0; i12 < this.f16171f; i12++) {
                        zArr[el.a.c(i12 * 8, this.f16169d, RoundingMode.CEILING)] = true;
                    }
                    this.f16173h = zArr;
                } catch (ArithmeticException e11) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e11);
                }
            } catch (ArithmeticException e12) {
                int length = cArr.length;
                StringBuilder sb2 = new StringBuilder(35);
                sb2.append("Illegal alphabet length ");
                sb2.append(length);
                throw new IllegalArgumentException(sb2.toString(), e12);
            }
        }

        int b(char c11) {
            if (c11 > 127) {
                String valueOf = String.valueOf(Integer.toHexString(c11));
                throw new DecodingException(valueOf.length() != 0 ? "Unrecognized character: 0x".concat(valueOf) : new String("Unrecognized character: 0x"));
            }
            byte b11 = this.f16172g[c11];
            if (b11 == -1) {
                if (c11 > ' ' && c11 != 127) {
                    StringBuilder sb2 = new StringBuilder(25);
                    sb2.append("Unrecognized character: ");
                    sb2.append(c11);
                    throw new DecodingException(sb2.toString());
                }
                String valueOf2 = String.valueOf(Integer.toHexString(c11));
                throw new DecodingException(valueOf2.length() != 0 ? "Unrecognized character: 0x".concat(valueOf2) : new String("Unrecognized character: 0x"));
            }
            return b11;
        }

        char c(int i11) {
            return this.f16167b[i11];
        }

        boolean d(int i11) {
            return this.f16173h[i11 % this.f16170e];
        }

        public boolean e(char c11) {
            byte[] bArr = this.f16172g;
            return c11 < bArr.length && bArr[c11] != -1;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.f16167b, ((a) obj).f16167b);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f16167b);
        }

        public String toString() {
            return this.f16166a;
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends d {

        /* renamed from: e  reason: collision with root package name */
        final char[] f16174e;

        b(String str, String str2) {
            this(new a(str, str2.toCharArray()));
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        int e(byte[] bArr, CharSequence charSequence) {
            u.o(bArr);
            if (charSequence.length() % 2 != 1) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < charSequence.length()) {
                    bArr[i12] = (byte) ((this.f16175c.b(charSequence.charAt(i11)) << 4) | this.f16175c.b(charSequence.charAt(i11 + 1)));
                    i11 += 2;
                    i12++;
                }
                return i12;
            }
            int length = charSequence.length();
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Invalid input length ");
            sb2.append(length);
            throw new DecodingException(sb2.toString());
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        void h(Appendable appendable, byte[] bArr, int i11, int i12) {
            u.o(appendable);
            u.t(i11, i11 + i12, bArr.length);
            for (int i13 = 0; i13 < i12; i13++) {
                int i14 = bArr[i11 + i13] & 255;
                appendable.append(this.f16174e[i14]);
                appendable.append(this.f16174e[i14 | 256]);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        BaseEncoding o(a aVar, Character ch2) {
            return new b(aVar);
        }

        private b(a aVar) {
            super(aVar, null);
            this.f16174e = new char[512];
            u.d(aVar.f16167b.length == 16);
            for (int i11 = 0; i11 < 256; i11++) {
                this.f16174e[i11] = aVar.c(i11 >>> 4);
                this.f16174e[i11 | 256] = aVar.c(i11 & 15);
            }
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends d {
        c(String str, String str2, Character ch2) {
            this(new a(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        int e(byte[] bArr, CharSequence charSequence) {
            u.o(bArr);
            CharSequence m11 = m(charSequence);
            if (this.f16175c.d(m11.length())) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < m11.length()) {
                    int i13 = i11 + 1;
                    int i14 = i13 + 1;
                    int b11 = (this.f16175c.b(m11.charAt(i11)) << 18) | (this.f16175c.b(m11.charAt(i13)) << 12);
                    int i15 = i12 + 1;
                    bArr[i12] = (byte) (b11 >>> 16);
                    if (i14 < m11.length()) {
                        int i16 = i14 + 1;
                        int b12 = b11 | (this.f16175c.b(m11.charAt(i14)) << 6);
                        i12 = i15 + 1;
                        bArr[i15] = (byte) ((b12 >>> 8) & 255);
                        if (i16 < m11.length()) {
                            i14 = i16 + 1;
                            i15 = i12 + 1;
                            bArr[i12] = (byte) ((b12 | this.f16175c.b(m11.charAt(i16))) & 255);
                        } else {
                            i11 = i16;
                        }
                    }
                    i12 = i15;
                    i11 = i14;
                }
                return i12;
            }
            int length = m11.length();
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Invalid input length ");
            sb2.append(length);
            throw new DecodingException(sb2.toString());
        }

        @Override // com.google.common.io.BaseEncoding.d, com.google.common.io.BaseEncoding
        void h(Appendable appendable, byte[] bArr, int i11, int i12) {
            u.o(appendable);
            int i13 = i11 + i12;
            u.t(i11, i13, bArr.length);
            while (i12 >= 3) {
                int i14 = i11 + 1;
                int i15 = i14 + 1;
                int i16 = ((bArr[i11] & 255) << 16) | ((bArr[i14] & 255) << 8) | (bArr[i15] & 255);
                appendable.append(this.f16175c.c(i16 >>> 18));
                appendable.append(this.f16175c.c((i16 >>> 12) & 63));
                appendable.append(this.f16175c.c((i16 >>> 6) & 63));
                appendable.append(this.f16175c.c(i16 & 63));
                i12 -= 3;
                i11 = i15 + 1;
            }
            if (i11 < i13) {
                n(appendable, bArr, i11, i13 - i11);
            }
        }

        @Override // com.google.common.io.BaseEncoding.d
        BaseEncoding o(a aVar, Character ch2) {
            return new c(aVar, ch2);
        }

        private c(a aVar, Character ch2) {
            super(aVar, ch2);
            u.d(aVar.f16167b.length == 64);
        }
    }

    /* loaded from: classes3.dex */
    static class d extends BaseEncoding {

        /* renamed from: c  reason: collision with root package name */
        final a f16175c;

        /* renamed from: d  reason: collision with root package name */
        final Character f16176d;

        d(String str, String str2, Character ch2) {
            this(new a(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.BaseEncoding
        int e(byte[] bArr, CharSequence charSequence) {
            a aVar;
            u.o(bArr);
            CharSequence m11 = m(charSequence);
            if (this.f16175c.d(m11.length())) {
                int i11 = 0;
                int i12 = 0;
                while (i11 < m11.length()) {
                    long j11 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        aVar = this.f16175c;
                        if (i13 >= aVar.f16170e) {
                            break;
                        }
                        j11 <<= aVar.f16169d;
                        if (i11 + i13 < m11.length()) {
                            j11 |= this.f16175c.b(m11.charAt(i14 + i11));
                            i14++;
                        }
                        i13++;
                    }
                    int i15 = aVar.f16171f;
                    int i16 = (i15 * 8) - (i14 * aVar.f16169d);
                    int i17 = (i15 - 1) * 8;
                    while (i17 >= i16) {
                        bArr[i12] = (byte) ((j11 >>> i17) & 255);
                        i17 -= 8;
                        i12++;
                    }
                    i11 += this.f16175c.f16170e;
                }
                return i12;
            }
            int length = m11.length();
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Invalid input length ");
            sb2.append(length);
            throw new DecodingException(sb2.toString());
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                return this.f16175c.equals(dVar.f16175c) && q.a(this.f16176d, dVar.f16176d);
            }
            return false;
        }

        @Override // com.google.common.io.BaseEncoding
        void h(Appendable appendable, byte[] bArr, int i11, int i12) {
            u.o(appendable);
            u.t(i11, i11 + i12, bArr.length);
            int i13 = 0;
            while (i13 < i12) {
                n(appendable, bArr, i11 + i13, Math.min(this.f16175c.f16171f, i12 - i13));
                i13 += this.f16175c.f16171f;
            }
        }

        public int hashCode() {
            return this.f16175c.hashCode() ^ q.b(this.f16176d);
        }

        @Override // com.google.common.io.BaseEncoding
        int j(int i11) {
            return (int) (((this.f16175c.f16169d * i11) + 7) / 8);
        }

        @Override // com.google.common.io.BaseEncoding
        int k(int i11) {
            a aVar = this.f16175c;
            return aVar.f16170e * el.a.c(i11, aVar.f16171f, RoundingMode.CEILING);
        }

        @Override // com.google.common.io.BaseEncoding
        public BaseEncoding l() {
            return this.f16176d == null ? this : o(this.f16175c, null);
        }

        @Override // com.google.common.io.BaseEncoding
        CharSequence m(CharSequence charSequence) {
            u.o(charSequence);
            Character ch2 = this.f16176d;
            if (ch2 == null) {
                return charSequence;
            }
            char charValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == charValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        void n(Appendable appendable, byte[] bArr, int i11, int i12) {
            u.o(appendable);
            u.t(i11, i11 + i12, bArr.length);
            int i13 = 0;
            u.d(i12 <= this.f16175c.f16171f);
            long j11 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                j11 = (j11 | (bArr[i11 + i14] & 255)) << 8;
            }
            int i15 = ((i12 + 1) * 8) - this.f16175c.f16169d;
            while (i13 < i12 * 8) {
                a aVar = this.f16175c;
                appendable.append(aVar.c(((int) (j11 >>> (i15 - i13))) & aVar.f16168c));
                i13 += this.f16175c.f16169d;
            }
            if (this.f16176d != null) {
                while (i13 < this.f16175c.f16171f * 8) {
                    appendable.append(this.f16176d.charValue());
                    i13 += this.f16175c.f16169d;
                }
            }
        }

        BaseEncoding o(a aVar, Character ch2) {
            return new d(aVar, ch2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f16175c.toString());
            if (8 % this.f16175c.f16169d != 0) {
                if (this.f16176d == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f16176d);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        d(a aVar, Character ch2) {
            this.f16175c = (a) u.o(aVar);
            u.k(ch2 == null || !aVar.e(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f16176d = ch2;
        }
    }

    static {
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        new b("base16()", "0123456789ABCDEF");
    }

    BaseEncoding() {
    }

    public static BaseEncoding a() {
        return f16164a;
    }

    public static BaseEncoding b() {
        return f16165b;
    }

    private static byte[] i(byte[] bArr, int i11) {
        if (i11 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }

    public final byte[] c(CharSequence charSequence) {
        try {
            return d(charSequence);
        } catch (DecodingException e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    final byte[] d(CharSequence charSequence) {
        CharSequence m11 = m(charSequence);
        byte[] bArr = new byte[j(m11.length())];
        return i(bArr, e(bArr, m11));
    }

    abstract int e(byte[] bArr, CharSequence charSequence);

    public String f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public final String g(byte[] bArr, int i11, int i12) {
        u.t(i11, i11 + i12, bArr.length);
        StringBuilder sb2 = new StringBuilder(k(i12));
        try {
            h(sb2, bArr, i11, i12);
            return sb2.toString();
        } catch (IOException e11) {
            throw new AssertionError(e11);
        }
    }

    abstract void h(Appendable appendable, byte[] bArr, int i11, int i12);

    abstract int j(int i11);

    abstract int k(int i11);

    public abstract BaseEncoding l();

    abstract CharSequence m(CharSequence charSequence);
}