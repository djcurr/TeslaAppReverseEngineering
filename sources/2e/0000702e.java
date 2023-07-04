package g7;

import android.util.Base64;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f27814a;

    static {
        f27814a = Charset.isSupported("UTF-8") ? Charset.forName("UTF-8") : Charset.defaultCharset();
    }

    public static String a(String str) {
        return b(str, 0);
    }

    public static String b(String str, int i11) {
        return new String(Base64.decode(str, i11), f27814a);
    }

    public static String c(String str) {
        return d(str, 0);
    }

    public static String d(String str, int i11) {
        return Base64.encodeToString(str.getBytes(f27814a), i11);
    }
}