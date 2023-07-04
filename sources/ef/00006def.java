package f9;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class a {
    public static String a(String str) {
        byte[] bArr;
        try {
            bArr = f(d(), str.getBytes());
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr != null) {
            return b(bArr);
        }
        return null;
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b11 : bArr) {
            c(stringBuffer, b11);
        }
        return stringBuffer.toString();
    }

    public static void c(StringBuffer stringBuffer, byte b11) {
        stringBuffer.append("0123456789ABCDEF".charAt((b11 >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b11 & 15));
    }

    public static byte[] d() {
        return e.b(new byte[]{33, 83, -50, -89, -84, -114, 80, 99, 10, 63, 22, -65, -11, 30, 101, -118});
    }

    public static byte[] e(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = Integer.valueOf(str.substring(i12, i12 + 2), 16).byteValue();
        }
        return bArr;
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(h()));
        return cipher.doFinal(bArr2);
    }

    public static String g(String str) {
        try {
            return new String(i(d(), e(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] h() {
        try {
            byte[] a11 = b.a("IUQSvE6r1TfFPdPEjfklLw==".getBytes("UTF-8"), 2);
            if (a11 != null) {
                return e.b(a11);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }

    public static byte[] i(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(h()));
        return cipher.doFinal(bArr2);
    }
}