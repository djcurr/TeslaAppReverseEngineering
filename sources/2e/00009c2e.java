package org.spongycastle.crypto.generators;

import ch.qos.logback.core.CoreConstants;
import java.io.ByteArrayOutputStream;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Strings;

/* loaded from: classes4.dex */
public class OpenBSDBCrypt {
    private static final String version = "2a";
    private static final byte[] encodingTable = {46, 47, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    private static final byte[] decodingTable = new byte[128];

    static {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = decodingTable;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = -1;
            i12++;
        }
        while (true) {
            byte[] bArr2 = encodingTable;
            if (i11 >= bArr2.length) {
                return;
            }
            decodingTable[bArr2[i11]] = (byte) i11;
            i11++;
        }
    }

    public static boolean checkPassword(String str, char[] cArr) {
        if (str.length() == 60) {
            if (str.charAt(0) == '$' && str.charAt(3) == '$' && str.charAt(6) == '$') {
                if (str.substring(1, 3).equals(version)) {
                    try {
                        int parseInt = Integer.parseInt(str.substring(4, 6));
                        if (parseInt >= 4 && parseInt <= 31) {
                            if (cArr != null) {
                                return str.equals(generate(cArr, decodeSaltString(str.substring(str.lastIndexOf(36) + 1, str.length() - 31)), parseInt));
                            }
                            throw new IllegalArgumentException("Missing password.");
                        }
                        throw new IllegalArgumentException("Invalid cost factor: " + parseInt + ", 4 < cost < 31 expected.");
                    } catch (NumberFormatException unused) {
                        throw new IllegalArgumentException("Invalid cost factor: " + str.substring(4, 6));
                    }
                }
                throw new IllegalArgumentException("Wrong Bcrypt version, 2a expected.");
            }
            throw new IllegalArgumentException("Invalid Bcrypt String format.");
        }
        throw new DataLengthException("Bcrypt String length: " + str.length() + ", 60 required.");
    }

    private static String createBcryptString(byte[] bArr, byte[] bArr2, int i11) {
        String num;
        StringBuffer stringBuffer = new StringBuffer(60);
        stringBuffer.append(CoreConstants.DOLLAR);
        stringBuffer.append(version);
        stringBuffer.append(CoreConstants.DOLLAR);
        if (i11 < 10) {
            num = "0" + i11;
        } else {
            num = Integer.toString(i11);
        }
        stringBuffer.append(num);
        stringBuffer.append(CoreConstants.DOLLAR);
        stringBuffer.append(encodeData(bArr2));
        stringBuffer.append(encodeData(BCrypt.generate(bArr, bArr2, i11)));
        return stringBuffer.toString();
    }

    private static byte[] decodeSaltString(String str) {
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
        if (charArray.length == 22) {
            for (char c11 : charArray) {
                if (c11 > 'z' || c11 < '.' || (c11 > '9' && c11 < 'A')) {
                    throw new IllegalArgumentException("Salt string contains invalid character: " + ((int) c11));
                }
            }
            char[] cArr = new char[24];
            System.arraycopy(charArray, 0, cArr, 0, charArray.length);
            for (int i11 = 0; i11 < 24; i11 += 4) {
                byte[] bArr = decodingTable;
                byte b11 = bArr[cArr[i11]];
                byte b12 = bArr[cArr[i11 + 1]];
                byte b13 = bArr[cArr[i11 + 2]];
                byte b14 = bArr[cArr[i11 + 3]];
                byteArrayOutputStream.write((b11 << 2) | (b12 >> 4));
                byteArrayOutputStream.write((b12 << 4) | (b13 >> 2));
                byteArrayOutputStream.write(b14 | (b13 << 6));
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byte[] bArr2 = new byte[16];
            System.arraycopy(byteArray, 0, bArr2, 0, 16);
            return bArr2;
        }
        throw new DataLengthException("Invalid base64 salt length: " + charArray.length + " , 22 required.");
    }

    private static String encodeData(byte[] bArr) {
        boolean z11;
        if (bArr.length != 24 && bArr.length != 16) {
            throw new DataLengthException("Invalid length: " + bArr.length + ", 24 for key or 16 for salt expected");
        }
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[18];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
            z11 = true;
        } else {
            bArr[bArr.length - 1] = 0;
            z11 = false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11 += 3) {
            int i12 = bArr[i11] & 255;
            int i13 = bArr[i11 + 1] & 255;
            int i14 = bArr[i11 + 2] & 255;
            byte[] bArr3 = encodingTable;
            byteArrayOutputStream.write(bArr3[(i12 >>> 2) & 63]);
            byteArrayOutputStream.write(bArr3[((i12 << 4) | (i13 >>> 4)) & 63]);
            byteArrayOutputStream.write(bArr3[((i13 << 2) | (i14 >>> 6)) & 63]);
            byteArrayOutputStream.write(bArr3[i14 & 63]);
        }
        String fromByteArray = Strings.fromByteArray(byteArrayOutputStream.toByteArray());
        if (z11) {
            return fromByteArray.substring(0, 22);
        }
        return fromByteArray.substring(0, fromByteArray.length() - 1);
    }

    public static String generate(char[] cArr, byte[] bArr, int i11) {
        if (cArr != null) {
            if (bArr != null) {
                if (bArr.length != 16) {
                    throw new DataLengthException("16 byte salt required: " + bArr.length);
                } else if (i11 >= 4 && i11 <= 31) {
                    byte[] uTF8ByteArray = Strings.toUTF8ByteArray(cArr);
                    int length = uTF8ByteArray.length < 72 ? uTF8ByteArray.length + 1 : 72;
                    byte[] bArr2 = new byte[length];
                    if (length > uTF8ByteArray.length) {
                        System.arraycopy(uTF8ByteArray, 0, bArr2, 0, uTF8ByteArray.length);
                    } else {
                        System.arraycopy(uTF8ByteArray, 0, bArr2, 0, length);
                    }
                    Arrays.fill(uTF8ByteArray, (byte) 0);
                    String createBcryptString = createBcryptString(bArr2, bArr, i11);
                    Arrays.fill(bArr2, (byte) 0);
                    return createBcryptString;
                } else {
                    throw new IllegalArgumentException("Invalid cost factor.");
                }
            }
            throw new IllegalArgumentException("Salt required.");
        }
        throw new IllegalArgumentException("Password required.");
    }
}