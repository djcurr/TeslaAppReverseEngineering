package k6;

import com.adobe.xmp.XMPException;

/* loaded from: classes.dex */
public class f {
    public static String a(a aVar) {
        return l6.c.c(aVar);
    }

    public static a b(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty convert-string", 5);
        }
        return l6.c.a(str);
    }
}