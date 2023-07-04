package i9;

import android.text.TextUtils;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public class c {
    public static byte[] a(Cipher cipher, String str) {
        SecureRandom secureRandom = new SecureRandom();
        int blockSize = cipher.getBlockSize();
        if (TextUtils.isEmpty(str)) {
            str = String.valueOf(secureRandom.nextDouble());
        }
        int i11 = blockSize * 2;
        byte[] bArr = new byte[i11];
        byte[] bArr2 = new byte[blockSize];
        secureRandom.nextBytes(bArr2);
        for (int i12 = 1; i12 < i11; i12++) {
            bArr[i12] = (byte) (str.codePointAt(i12 % str.length()) & 127);
            if (i12 >= blockSize) {
                bArr[i12] = (byte) (bArr[0] & bArr[i12]);
            }
        }
        System.arraycopy(bArr, blockSize, bArr2, 0, blockSize);
        return bArr2;
    }
}