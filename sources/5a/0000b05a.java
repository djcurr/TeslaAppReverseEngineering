package r70;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Vector;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static String f49305a;

    /* loaded from: classes5.dex */
    static class a implements PrivilegedAction<String> {
        a() {
        }

        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                f49305a = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                f49305a = "\n";
            }
        } catch (Exception unused2) {
            f49305a = String.format("%n", new Object[0]);
        }
    }

    public static char[] a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i11 = 0; i11 != length; i11++) {
            cArr[i11] = (char) (bArr[i11] & 255);
        }
        return cArr;
    }

    public static String b(byte[] bArr) {
        return new String(a(bArr));
    }

    public static String c(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int b11 = s70.c.b(bArr, cArr);
        if (b11 >= 0) {
            return new String(cArr, 0, b11);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static String d() {
        return f49305a;
    }

    public static String[] e(String str, char c11) {
        int i11;
        Vector vector = new Vector();
        boolean z11 = true;
        while (true) {
            if (!z11) {
                break;
            }
            int indexOf = str.indexOf(c11);
            if (indexOf > 0) {
                vector.addElement(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
            } else {
                vector.addElement(str);
                z11 = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i11 = 0; i11 != size; i11++) {
            strArr[i11] = (String) vector.elementAt(i11);
        }
        return strArr;
    }

    public static byte[] f(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 != length; i11++) {
            bArr[i11] = (byte) str.charAt(i11);
        }
        return bArr;
    }

    public static String g(String str) {
        char[] charArray = str.toCharArray();
        boolean z11 = false;
        for (int i11 = 0; i11 != charArray.length; i11++) {
            char c11 = charArray[i11];
            if ('A' <= c11 && 'Z' >= c11) {
                charArray[i11] = (char) ((c11 - 'A') + 97);
                z11 = true;
            }
        }
        return z11 ? new String(charArray) : str;
    }

    public static void h(char[] cArr, OutputStream outputStream) {
        int i11;
        char c11;
        int i12 = 0;
        while (i12 < cArr.length) {
            char c12 = cArr[i12];
            char c13 = c12;
            if (c12 >= 128) {
                if (c12 < 2048) {
                    i11 = (c12 >> 6) | 192;
                } else if (c12 < 55296 || c12 > 57343) {
                    outputStream.write((c12 >> '\f') | 224);
                    i11 = ((c12 >> 6) & 63) | 128;
                } else {
                    i12++;
                    if (i12 >= cArr.length) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    char c14 = cArr[i12];
                    if (c12 > 56319) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    int i13 = (((c12 & 1023) << 10) | (c14 & 1023)) + 65536;
                    outputStream.write((i13 >> 18) | 240);
                    outputStream.write(((i13 >> 12) & 63) | 128);
                    outputStream.write(((i13 >> 6) & 63) | 128);
                    c11 = i13;
                    c13 = (c11 & 63) | 128;
                }
                outputStream.write(i11);
                c11 = c12;
                c13 = (c11 & 63) | 128;
            }
            outputStream.write(c13);
            i12++;
        }
    }

    public static byte[] i(String str) {
        return j(str.toCharArray());
    }

    public static byte[] j(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            h(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String k(String str) {
        char[] charArray = str.toCharArray();
        boolean z11 = false;
        for (int i11 = 0; i11 != charArray.length; i11++) {
            char c11 = charArray[i11];
            if ('a' <= c11 && 'z' >= c11) {
                charArray[i11] = (char) ((c11 - 'a') + 65);
                z11 = true;
            }
        }
        return z11 ? new String(charArray) : str;
    }
}