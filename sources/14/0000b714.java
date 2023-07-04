package u30;

import ch.qos.logback.core.CoreConstants;
import java.io.File;

/* loaded from: classes5.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final char f53105a;

    static {
        Character.toString(CoreConstants.DOT);
        f53105a = File.separatorChar;
        d();
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        int b11 = b(str);
        return b11 == -1 ? "" : str.substring(b11 + 1);
    }

    public static int b(String str) {
        int lastIndexOf;
        if (str != null && c(str) <= (lastIndexOf = str.lastIndexOf(46))) {
            return lastIndexOf;
        }
        return -1;
    }

    public static int c(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    static boolean d() {
        return f53105a == '\\';
    }
}