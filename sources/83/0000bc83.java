package w9;

import java.security.MessageDigest;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes.dex */
public final class b {
    public static String a(String str) {
        try {
            if (x9.a.c(str)) {
                return null;
            }
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            messageDigest.update(str.getBytes("UTF-8"));
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < digest.length; i11++) {
                sb2.append(String.format("%02x", Byte.valueOf(digest[i11])));
            }
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}