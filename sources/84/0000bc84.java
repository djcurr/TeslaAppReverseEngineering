package w9;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static String f55742a = "idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#";

    public static String a() {
        String str = new String();
        for (int i11 = 0; i11 < f55742a.length() - 1; i11 += 4) {
            str = str + f55742a.charAt(i11);
        }
        return str;
    }

    public static String b(String str, String str2) {
        try {
            PBEKeySpec d11 = d(str);
            byte[] bytes = str2.getBytes();
            byte[] f11 = f();
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(d11).getEncoded(), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(1, secretKeySpec, new IvParameterSpec(f11));
            byte[] salt = d11.getSalt();
            ByteBuffer allocate = ByteBuffer.allocate(salt.length + cipher.getOutputSize(bytes.length));
            allocate.put(salt);
            cipher.doFinal(ByteBuffer.wrap(bytes), allocate);
            return c(allocate.array());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b11 : bArr) {
            stringBuffer.append("0123456789ABCDEF".charAt((b11 >> 4) & 15));
            stringBuffer.append("0123456789ABCDEF".charAt(b11 & 15));
        }
        return stringBuffer.toString();
    }

    public static PBEKeySpec d(String str) {
        Class<?> cls = Class.forName(new String(a.a("amF2YS5zZWN1cml0eS5TZWN1cmVSYW5kb20=")));
        Object newInstance = cls.newInstance();
        byte[] bArr = new byte[16];
        Method method = cls.getMethod("nextBytes", bArr.getClass());
        method.setAccessible(true);
        method.invoke(newInstance, bArr);
        return new PBEKeySpec(str.toCharArray(), bArr, 10, 128);
    }

    public static String e(String str, String str2) {
        byte[] doFinal;
        try {
            PBEKeySpec d11 = d(str);
            int length = str2.length() / 2;
            byte[] bArr = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = i11 * 2;
                bArr[i11] = Integer.valueOf(str2.substring(i12, i12 + 2), 16).byteValue();
            }
            byte[] f11 = f();
            if (length <= 16) {
                doFinal = null;
            } else {
                SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(d11.getPassword(), Arrays.copyOf(bArr, 16), 10, 128)).getEncoded(), "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, secretKeySpec, new IvParameterSpec(f11));
                doFinal = cipher.doFinal(bArr, 16, length - 16);
            }
        } catch (Exception unused) {
        }
        if (doFinal != null) {
            String str3 = new String(doFinal);
            if (x9.a.g(str3)) {
                return str3;
            }
            return null;
        }
        throw new Exception();
    }

    public static byte[] f() {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < 48; i11 += 2) {
                sb2.append("AsAgAtA5A6AdAgABABACADAfAsAdAfAsAgAaAgA3A5A6=8=0".charAt(i11));
            }
            return a.a(sb2.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }
}