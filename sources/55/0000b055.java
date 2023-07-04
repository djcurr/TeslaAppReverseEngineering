package r70;

import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.Map;

/* loaded from: classes5.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal f49302a = new ThreadLocal();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class a implements PrivilegedAction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f49303a;

        a(String str) {
            this.f49303a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return Security.getProperty(this.f49303a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static class b implements PrivilegedAction {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f49304a;

        b(String str) {
            this.f49304a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(this.f49304a);
        }
    }

    public static BigInteger a(String str) {
        String b11 = b(str);
        if (b11 != null) {
            return new BigInteger(b11);
        }
        return null;
    }

    public static String b(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new a(str));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) f49302a.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new b(str)) : str2;
    }

    public static boolean c(String str) {
        try {
            return f(b(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    public static boolean d(String str, boolean z11) {
        try {
            String b11 = b(str);
            return z11 ? f(b11) : e(b11);
        } catch (AccessControlException unused) {
            return false;
        }
    }

    private static boolean e(String str) {
        if (str == null || str.length() != 5) {
            return false;
        }
        if (str.charAt(0) == 'f' || str.charAt(0) == 'F') {
            if (str.charAt(1) == 'a' || str.charAt(1) == 'A') {
                if (str.charAt(2) == 'l' || str.charAt(2) == 'L') {
                    if (str.charAt(3) == 's' || str.charAt(3) == 'S') {
                        return str.charAt(4) == 'e' || str.charAt(4) == 'E';
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    private static boolean f(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        if (str.charAt(0) == 't' || str.charAt(0) == 'T') {
            if (str.charAt(1) == 'r' || str.charAt(1) == 'R') {
                if (str.charAt(2) == 'u' || str.charAt(2) == 'U') {
                    return str.charAt(3) == 'e' || str.charAt(3) == 'E';
                }
                return false;
            }
            return false;
        }
        return false;
    }
}