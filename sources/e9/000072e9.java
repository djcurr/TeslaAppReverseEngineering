package hb;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class f {
    public static String a(byte[] bArr) {
        if (bArr != null) {
            try {
                return new String(bArr, "UTF-8");
            } catch (UnsupportedEncodingException e11) {
                throw new Error(e11);
            }
        }
        return null;
    }

    public static byte[] b(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e11) {
                throw new Error(e11);
            }
        }
        return null;
    }

    public static int c(String str) {
        if (str != null) {
            try {
                return str.getBytes("UTF-8").length;
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException();
            }
        }
        return 0;
    }
}