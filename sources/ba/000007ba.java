package androidx.profileinstaller;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    static final byte[] f5282a = {112, 114, 111, 0};

    /* renamed from: b  reason: collision with root package name */
    static final byte[] f5283b = {112, 114, 109, 0};

    private static void A(OutputStream outputStream, b[] bVarArr) {
        byte[] a11 = a(bVarArr, g.f5284a);
        c.q(outputStream, bVarArr.length);
        c.l(outputStream, a11);
    }

    private static byte[] a(b[] bVarArr, byte[] bArr) {
        int i11 = 0;
        int i12 = 0;
        for (b bVar : bVarArr) {
            i12 += c.j(b(bVar.f5271a, bVar.f5272b, bArr)) + 16 + (bVar.f5274d * 2) + bVar.f5275e + c(bVar.f5276f);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i12);
        if (Arrays.equals(bArr, g.f5285b)) {
            int length = bVarArr.length;
            while (i11 < length) {
                b bVar2 = bVarArr[i11];
                u(byteArrayOutputStream, bVar2, b(bVar2.f5271a, bVar2.f5272b, bArr));
                t(byteArrayOutputStream, bVar2);
                i11++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                u(byteArrayOutputStream, bVar3, b(bVar3.f5271a, bVar3.f5272b, bArr));
            }
            int length2 = bVarArr.length;
            while (i11 < length2) {
                t(byteArrayOutputStream, bVarArr[i11]);
                i11++;
            }
        }
        if (byteArrayOutputStream.size() == i12) {
            return byteArrayOutputStream.toByteArray();
        }
        throw c.b("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i12);
    }

    private static String b(String str, String str2, byte[] bArr) {
        if (str2.equals("classes.dex")) {
            return str;
        }
        return str + g.a(bArr) + str2;
    }

    private static int c(int i11) {
        return n(i11 * 2) / 8;
    }

    private static int d(int i11, int i12, int i13) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 4) {
                    return i12 + i13;
                }
                throw c.b("Unexpected flag: " + i11);
            }
            return i12;
        }
        throw c.b("HOT methods are not stored in the bitmap");
    }

    private static void e(InputStream inputStream, b bVar) {
        int i11 = 0;
        for (int i12 = 0; i12 < bVar.f5274d; i12++) {
            i11 += c.g(inputStream);
            bVar.f5277g[i12] = i11;
        }
    }

    private static int f(BitSet bitSet, int i11, int i12) {
        int i13 = bitSet.get(d(2, i11, i12)) ? 2 : 0;
        return bitSet.get(d(4, i11, i12)) ? i13 | 4 : i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] g(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, c.c(inputStream, bArr.length))) {
            return c.c(inputStream, g.f5284a.length);
        }
        throw c.b("Invalid magic");
    }

    private static void h(InputStream inputStream, b bVar) {
        int available = inputStream.available() - bVar.f5275e;
        int i11 = 0;
        while (inputStream.available() > available) {
            i11 += c.g(inputStream);
            bVar.f5278h.put(Integer.valueOf(i11), 1);
            for (int g11 = c.g(inputStream); g11 > 0; g11--) {
                p(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw c.b("Read too much data during profile line parse");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b[] i(InputStream inputStream, byte[] bArr, b[] bVarArr) {
        if (Arrays.equals(bArr, g.f5288e)) {
            int i11 = c.i(inputStream);
            byte[] d11 = c.d(inputStream, (int) c.h(inputStream), (int) c.h(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(d11);
                try {
                    b[] j11 = j(byteArrayInputStream, i11, bVarArr);
                    byteArrayInputStream.close();
                    return j11;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw c.b("Content found after the end of file");
        }
        throw c.b("Unsupported meta version");
    }

    private static b[] j(InputStream inputStream, int i11, b[] bVarArr) {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i11 == bVarArr.length) {
            String[] strArr = new String[i11];
            int[] iArr = new int[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                int g11 = c.g(inputStream);
                iArr[i12] = c.g(inputStream);
                strArr[i12] = c.e(inputStream, g11);
            }
            for (int i13 = 0; i13 < i11; i13++) {
                b bVar = bVarArr[i13];
                if (bVar.f5272b.equals(strArr[i13])) {
                    int i14 = iArr[i13];
                    bVar.f5274d = i14;
                    bVar.f5277g = new int[i14];
                    e(inputStream, bVar);
                } else {
                    throw c.b("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw c.b("Mismatched number of dex files found in metadata");
    }

    private static void k(InputStream inputStream, b bVar) {
        BitSet valueOf = BitSet.valueOf(c.c(inputStream, c.a(bVar.f5276f * 2)));
        int i11 = 0;
        while (true) {
            int i12 = bVar.f5276f;
            if (i11 >= i12) {
                return;
            }
            int f11 = f(valueOf, i11, i12);
            if (f11 != 0) {
                Integer num = bVar.f5278h.get(Integer.valueOf(i11));
                if (num == null) {
                    num = 0;
                }
                bVar.f5278h.put(Integer.valueOf(i11), Integer.valueOf(f11 | num.intValue()));
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b[] l(InputStream inputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, g.f5284a)) {
            int i11 = c.i(inputStream);
            byte[] d11 = c.d(inputStream, (int) c.h(inputStream), (int) c.h(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(d11);
                try {
                    b[] m11 = m(byteArrayInputStream, str, i11);
                    byteArrayInputStream.close();
                    return m11;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            throw c.b("Content found after the end of file");
        }
        throw c.b("Unsupported version");
    }

    private static b[] m(InputStream inputStream, String str, int i11) {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int g11 = c.g(inputStream);
            int g12 = c.g(inputStream);
            bVarArr[i12] = new b(str, c.e(inputStream, g11), c.h(inputStream), g12, (int) c.h(inputStream), (int) c.h(inputStream), new int[g12], new TreeMap());
        }
        for (int i13 = 0; i13 < i11; i13++) {
            b bVar = bVarArr[i13];
            h(inputStream, bVar);
            e(inputStream, bVar);
            k(inputStream, bVar);
        }
        return bVarArr;
    }

    private static int n(int i11) {
        return ((i11 + 8) - 1) & (-8);
    }

    private static void o(byte[] bArr, int i11, int i12, b bVar) {
        int d11 = d(i11, i12, bVar.f5276f);
        int i13 = d11 / 8;
        bArr[i13] = (byte) ((1 << (d11 % 8)) | bArr[i13]);
    }

    private static void p(InputStream inputStream) {
        c.g(inputStream);
        int i11 = c.i(inputStream);
        if (i11 == 6 || i11 == 7) {
            return;
        }
        while (i11 > 0) {
            c.i(inputStream);
            for (int i12 = c.i(inputStream); i12 > 0; i12--) {
                c.g(inputStream);
            }
            i11--;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean q(OutputStream outputStream, byte[] bArr, b[] bVarArr) {
        if (Arrays.equals(bArr, g.f5284a)) {
            A(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, g.f5286c)) {
            y(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, g.f5285b)) {
            z(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, g.f5287d)) {
            x(outputStream, bVarArr);
            return true;
        } else {
            return false;
        }
    }

    private static void r(OutputStream outputStream, b bVar) {
        int i11 = 0;
        for (int i12 : bVar.f5277g) {
            Integer valueOf = Integer.valueOf(i12);
            c.o(outputStream, valueOf.intValue() - i11);
            i11 = valueOf.intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s(OutputStream outputStream, byte[] bArr) {
        outputStream.write(f5282a);
        outputStream.write(bArr);
    }

    private static void t(OutputStream outputStream, b bVar) {
        w(outputStream, bVar);
        r(outputStream, bVar);
        v(outputStream, bVar);
    }

    private static void u(OutputStream outputStream, b bVar, String str) {
        c.o(outputStream, c.j(str));
        c.o(outputStream, bVar.f5274d);
        c.p(outputStream, bVar.f5275e);
        c.p(outputStream, bVar.f5273c);
        c.p(outputStream, bVar.f5276f);
        c.m(outputStream, str);
    }

    private static void v(OutputStream outputStream, b bVar) {
        byte[] bArr = new byte[c(bVar.f5276f)];
        for (Map.Entry<Integer, Integer> entry : bVar.f5278h.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                o(bArr, 2, intValue, bVar);
            }
            if ((intValue2 & 4) != 0) {
                o(bArr, 4, intValue, bVar);
            }
        }
        outputStream.write(bArr);
    }

    private static void w(OutputStream outputStream, b bVar) {
        int i11 = 0;
        for (Map.Entry<Integer, Integer> entry : bVar.f5278h.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                c.o(outputStream, intValue - i11);
                c.o(outputStream, 0);
                i11 = intValue;
            }
        }
    }

    private static void x(OutputStream outputStream, b[] bVarArr) {
        c.o(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            String b11 = b(bVar.f5271a, bVar.f5272b, g.f5287d);
            c.o(outputStream, c.j(b11));
            c.o(outputStream, bVar.f5278h.size());
            c.o(outputStream, bVar.f5277g.length);
            c.p(outputStream, bVar.f5273c);
            c.m(outputStream, b11);
            for (Integer num : bVar.f5278h.keySet()) {
                c.o(outputStream, num.intValue());
            }
            for (int i11 : bVar.f5277g) {
                c.o(outputStream, i11);
            }
        }
    }

    private static void y(OutputStream outputStream, b[] bVarArr) {
        c.q(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            String b11 = b(bVar.f5271a, bVar.f5272b, g.f5286c);
            c.o(outputStream, c.j(b11));
            c.o(outputStream, bVar.f5277g.length);
            c.p(outputStream, bVar.f5278h.size() * 4);
            c.p(outputStream, bVar.f5273c);
            c.m(outputStream, b11);
            for (Integer num : bVar.f5278h.keySet()) {
                c.o(outputStream, num.intValue());
                c.o(outputStream, 0);
            }
            for (int i11 : bVar.f5277g) {
                c.o(outputStream, i11);
            }
        }
    }

    private static void z(OutputStream outputStream, b[] bVarArr) {
        byte[] a11 = a(bVarArr, g.f5285b);
        c.q(outputStream, bVarArr.length);
        c.l(outputStream, a11);
    }
}