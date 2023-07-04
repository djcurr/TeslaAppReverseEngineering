package zu;

import com.adyen.checkout.components.model.payments.request.Address;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import okhttp3.HttpUrl;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes6.dex */
public class f0 {

    /* renamed from: a */
    static HashMap<String, String> f60770a = new HashMap<>();

    public static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i11 = 0; i11 < length; i11 += 2) {
            bArr[i11 / 2] = (byte) ((Character.digit(str.charAt(i11), 16) << 4) + Character.digit(str.charAt(i11 + 1), 16));
        }
        return bArr;
    }

    public static String b(byte[] bArr) {
        return c(bArr, bArr == null ? 0 : bArr.length);
    }

    public static String c(byte[] bArr, int i11) {
        if (bArr == null || i11 < 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(i11 * 2);
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(String.format("%02x", Byte.valueOf(bArr[i12])));
        }
        return sb2.toString();
    }

    public static String d(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1);
            messageDigest.update(str.getBytes());
            return b(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String e(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("email:");
        sb2.append(str == null ? Address.ADDRESS_NULL_PLACEHOLDER : d(str));
        return sb2.toString();
    }

    public static String f(String str) {
        if (str == null || str.length() <= 11) {
            return str;
        }
        if (f60770a.containsKey(str)) {
            return f60770a.get(str);
        }
        String d11 = d(str);
        f60770a.put(str, d11);
        return d11 == null ? "???" : d11;
    }

    public static String g(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? String.format("Unknown error: %d", Integer.valueOf(i11)) : "SCAN_FAILED_FEATURE_UNSUPPORTED" : "SCAN_FAILED_INTERNAL_ERROR" : "SCAN_FAILED_APPLICATION_REGISTRATION_FAILED" : "SCAN_FAILED_ALREADY_STARTED";
    }
}