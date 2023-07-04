package atd.r0;

import java.security.InvalidParameterException;
import java.util.UUID;

/* loaded from: classes.dex */
public final class f {
    public static void a(Object obj, atd.y.a aVar) {
        if (obj == null) {
            throw aVar.a(new InvalidParameterException("Object is null"));
        }
    }

    public static void b(String str, atd.y.a aVar) {
        a((Object) str, aVar);
        try {
            if (!UUID.fromString(str).toString().equalsIgnoreCase(str)) {
                throw aVar.a(new InvalidParameterException("Value and UUID do not match"));
            }
        } catch (IllegalArgumentException unused) {
            throw aVar.a(new InvalidParameterException("Value not a UUID"));
        }
    }

    public static void a(String str, atd.y.a aVar) {
        if (str == null || str.length() == 0) {
            throw aVar.a(new InvalidParameterException("Value is empty"));
        }
    }

    public static void a(int i11, int i12, atd.y.a aVar) {
        if (i11 < i12) {
            throw aVar.a();
        }
    }
}