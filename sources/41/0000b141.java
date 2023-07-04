package rz;

import io.sentry.d0;
import io.sentry.f3;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f49763a = Charset.forName("UTF-8");

    public static String a(String str, d0 d0Var) {
        if (str != null && !str.isEmpty()) {
            try {
                return new StringBuilder(new BigInteger(1, MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(str.getBytes(f49763a))).toString(16)).toString();
            } catch (NoSuchAlgorithmException e11) {
                d0Var.b(f3.INFO, "SHA-1 isn't available to calculate the hash.", e11);
            } catch (Throwable th2) {
                d0Var.c(f3.INFO, "string: %s could not calculate its hash", th2, str);
            }
        }
        return null;
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb2.append(substring.toUpperCase(locale));
        sb2.append(str.substring(1).toLowerCase(locale));
        return sb2.toString();
    }

    public static String c(String str) {
        int i11;
        if (str != null) {
            int lastIndexOf = str.lastIndexOf(".");
            return (lastIndexOf < 0 || str.length() <= (i11 = lastIndexOf + 1)) ? str : str.substring(i11);
        }
        return null;
    }

    public static String d(String str, String str2) {
        return (str == null || str2 == null || !str.startsWith(str2) || !str.endsWith(str2)) ? str : str.substring(str2.length(), str.length() - str2.length());
    }
}