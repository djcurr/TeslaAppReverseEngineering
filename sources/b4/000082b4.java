package l6;

import com.adobe.xmp.XMPException;

/* loaded from: classes.dex */
class e {
    public static void a(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty array name", 4);
        }
    }

    public static void b(Object obj) {
        if (obj == null) {
            throw new XMPException("Parameter must not be null", 4);
        }
        if ((obj instanceof String) && ((String) obj).length() == 0) {
            throw new XMPException("Parameter must not be null or empty", 4);
        }
    }

    public static void c(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty prefix", 4);
        }
    }

    public static void d(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty property name", 4);
        }
    }

    public static void e(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty schema namespace URI", 4);
        }
    }

    public static void f(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty specific language", 4);
        }
    }
}