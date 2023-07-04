package jx;

import java.security.AccessControlException;
import java.security.AccessController;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final hx.b f34014a = hx.b.i("freemarker.security");

    public static String a(String str, String str2) {
        try {
            return (String) AccessController.doPrivileged(new c(str, str2));
        } catch (AccessControlException unused) {
            hx.b bVar = f34014a;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Insufficient permissions to read system property ");
            stringBuffer.append(e.h(str));
            stringBuffer.append(", using default value ");
            stringBuffer.append(e.h(str2));
            bVar.u(stringBuffer.toString());
            return str2;
        }
    }
}