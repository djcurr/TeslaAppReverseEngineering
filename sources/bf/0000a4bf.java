package org.spongycastle.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Vector;

/* loaded from: classes4.dex */
public final class Strings {
    private static String LINE_SEPARATOR;

    /* loaded from: classes4.dex */
    private static class StringListImpl extends ArrayList<String> implements StringList {
        private StringListImpl() {
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List, org.spongycastle.util.StringList
        public /* bridge */ /* synthetic */ String get(int i11) {
            return (String) super.get(i11);
        }

        @Override // org.spongycastle.util.StringList
        public String[] toStringArray() {
            int size = size();
            String[] strArr = new String[size];
            for (int i11 = 0; i11 != size; i11++) {
                strArr[i11] = get(i11);
            }
            return strArr;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public String set(int i11, String str) {
            return (String) super.set(i11, (int) str);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(String str) {
            return super.add((StringListImpl) str);
        }

        @Override // org.spongycastle.util.StringList
        public String[] toStringArray(int i11, int i12) {
            String[] strArr = new String[i12 - i11];
            for (int i13 = i11; i13 != size() && i13 != i12; i13++) {
                strArr[i13 - i11] = get(i13);
            }
            return strArr;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public void add(int i11, String str) {
            super.add(i11, (int) str);
        }
    }

    static {
        try {
            try {
                LINE_SEPARATOR = (String) AccessController.doPrivileged(new PrivilegedAction<String>() { // from class: org.spongycastle.util.Strings.1
                    @Override // java.security.PrivilegedAction
                    public String run() {
                        return System.getProperty("line.separator");
                    }
                });
            } catch (Exception unused) {
                LINE_SEPARATOR = "\n";
            }
        } catch (Exception unused2) {
            LINE_SEPARATOR = String.format("%n", new Object[0]);
        }
    }

    public static char[] asCharArray(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i11 = 0; i11 != length; i11++) {
            cArr[i11] = (char) (bArr[i11] & 255);
        }
        return cArr;
    }

    public static String fromByteArray(byte[] bArr) {
        return new String(asCharArray(bArr));
    }

    public static String fromUTF8ByteArray(byte[] bArr) {
        char c11;
        int i11;
        byte b11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i13 < bArr.length) {
            i14++;
            if ((bArr[i13] & 240) == 240) {
                i14++;
                i13 += 4;
            } else if ((bArr[i13] & 224) == 224) {
                i13 += 3;
            } else {
                i13 = (bArr[i13] & 192) == 192 ? i13 + 2 : i13 + 1;
            }
        }
        char[] cArr = new char[i14];
        int i15 = 0;
        while (i12 < bArr.length) {
            if ((bArr[i12] & 240) == 240) {
                int i16 = (((((bArr[i12] & 3) << 18) | ((bArr[i12 + 1] & 63) << 12)) | ((bArr[i12 + 2] & 63) << 6)) | (bArr[i12 + 3] & 63)) - 65536;
                c11 = (char) ((i16 & 1023) | 56320);
                cArr[i15] = (char) (55296 | (i16 >> 10));
                i12 += 4;
                i15++;
            } else if ((bArr[i12] & 224) == 224) {
                c11 = (char) (((bArr[i12] & 15) << 12) | ((bArr[i12 + 1] & 63) << 6) | (bArr[i12 + 2] & 63));
                i12 += 3;
            } else {
                if ((bArr[i12] & 208) == 208) {
                    i11 = (bArr[i12] & 31) << 6;
                    b11 = bArr[i12 + 1];
                } else if ((bArr[i12] & 192) == 192) {
                    i11 = (bArr[i12] & 31) << 6;
                    b11 = bArr[i12 + 1];
                } else {
                    c11 = (char) (bArr[i12] & 255);
                    i12++;
                }
                c11 = (char) (i11 | (b11 & 63));
                i12 += 2;
            }
            cArr[i15] = c11;
            i15++;
        }
        return new String(cArr);
    }

    public static String lineSeparator() {
        return LINE_SEPARATOR;
    }

    public static StringList newList() {
        return new StringListImpl();
    }

    public static String[] split(String str, char c11) {
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

    public static byte[] toByteArray(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 != length; i11++) {
            bArr[i11] = (byte) cArr[i11];
        }
        return bArr;
    }

    public static String toLowerCase(String str) {
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

    public static byte[] toUTF8ByteArray(String str) {
        return toUTF8ByteArray(str.toCharArray());
    }

    public static String toUpperCase(String str) {
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

    public static byte[] toUTF8ByteArray(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static byte[] toByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 != length; i11++) {
            bArr[i11] = (byte) str.charAt(i11);
        }
        return bArr;
    }

    public static int toByteArray(String str, byte[] bArr, int i11) {
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            bArr[i11 + i12] = (byte) str.charAt(i12);
        }
        return length;
    }

    public static void toUTF8ByteArray(char[] cArr, OutputStream outputStream) {
        int i11 = 0;
        while (i11 < cArr.length) {
            char c11 = cArr[i11];
            if (c11 < 128) {
                outputStream.write(c11);
            } else if (c11 < 2048) {
                outputStream.write((c11 >> 6) | 192);
                outputStream.write((c11 & '?') | 128);
            } else if (c11 >= 55296 && c11 <= 57343) {
                i11++;
                if (i11 < cArr.length) {
                    char c12 = cArr[i11];
                    if (c11 <= 56319) {
                        int i12 = (((c11 & 1023) << 10) | (c12 & 1023)) + 65536;
                        outputStream.write((i12 >> 18) | 240);
                        outputStream.write(((i12 >> 12) & 63) | 128);
                        outputStream.write(((i12 >> 6) & 63) | 128);
                        outputStream.write((i12 & 63) | 128);
                    } else {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                } else {
                    throw new IllegalStateException("invalid UTF-16 codepoint");
                }
            } else {
                outputStream.write((c11 >> '\f') | 224);
                outputStream.write(((c11 >> 6) & 63) | 128);
                outputStream.write((c11 & '?') | 128);
            }
            i11++;
        }
    }
}