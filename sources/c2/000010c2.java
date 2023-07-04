package ch.qos.logback.core.encoder;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class ByteArrayUtil {
    public static byte[] hexStringToByteArray(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            bArr[i11] = (byte) (Integer.parseInt(str.substring(i12, i12 + 2), 16) & 255);
        }
        return bArr;
    }

    static int readInt(byte[] bArr, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            i12 += (bArr[i11 + i13] & 255) << (24 - (i13 * 8));
        }
        return i12;
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArr) {
            String hexString = Integer.toHexString(b11 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    static void writeInt(ByteArrayOutputStream byteArrayOutputStream, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            byteArrayOutputStream.write((byte) (i11 >>> (24 - (i12 * 8))));
        }
    }

    static void writeInt(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < 4; i13++) {
            bArr[i11 + i13] = (byte) (i12 >>> (24 - (i13 * 8)));
        }
    }
}