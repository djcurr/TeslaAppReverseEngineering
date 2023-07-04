package m6;

import ch.qos.logback.classic.spi.CallerData;
import com.adobe.xmp.XMPException;
import l6.h;

/* loaded from: classes.dex */
public final class c {
    public static b a(String str, String str2) {
        if (str == null || str2 == null) {
            throw new XMPException("Parameter must not be null", 4);
        }
        b bVar = new b();
        a aVar = new a();
        aVar.f38422a = str2;
        c(str, aVar, bVar);
        while (aVar.f38426e < str2.length()) {
            aVar.f38425d = aVar.f38426e;
            e(str2, aVar);
            int i11 = aVar.f38425d;
            aVar.f38426e = i11;
            d d11 = str2.charAt(i11) != '[' ? d(aVar) : b(aVar);
            if (d11.b() == 1) {
                if (d11.c().charAt(0) == '@') {
                    d11.h(CallerData.NA + d11.c().substring(1));
                    if (!"?xml:lang".equals(d11.c())) {
                        throw new XMPException("Only xml:lang allowed with '@'", 102);
                    }
                }
                if (d11.c().charAt(0) == '?') {
                    aVar.f38423b++;
                    d11.g(2);
                }
            } else {
                if (d11.b() != 6) {
                    continue;
                } else {
                    if (d11.c().charAt(1) == '@') {
                        d11.h("[?" + d11.c().substring(2));
                        if (!d11.c().startsWith("[?xml:lang=")) {
                            throw new XMPException("Only xml:lang allowed with '@'", 102);
                        }
                    }
                    if (d11.c().charAt(1) == '?') {
                        aVar.f38423b++;
                        d11.g(5);
                    }
                }
                bVar.a(d11);
            }
            f(aVar.f38422a.substring(aVar.f38423b, aVar.f38424c));
            bVar.a(d11);
        }
        return bVar;
    }

    private static d b(a aVar) {
        d dVar;
        int i11 = aVar.f38426e + 1;
        aVar.f38426e = i11;
        if ('0' > aVar.f38422a.charAt(i11) || aVar.f38422a.charAt(aVar.f38426e) > '9') {
            while (aVar.f38426e < aVar.f38422a.length() && aVar.f38422a.charAt(aVar.f38426e) != ']' && aVar.f38422a.charAt(aVar.f38426e) != '=') {
                aVar.f38426e++;
            }
            if (aVar.f38426e >= aVar.f38422a.length()) {
                throw new XMPException("Missing ']' or '=' for array index", 102);
            }
            if (aVar.f38422a.charAt(aVar.f38426e) != ']') {
                aVar.f38423b = aVar.f38425d + 1;
                int i12 = aVar.f38426e;
                aVar.f38424c = i12;
                int i13 = i12 + 1;
                aVar.f38426e = i13;
                char charAt = aVar.f38422a.charAt(i13);
                if (charAt != '\'' && charAt != '\"') {
                    throw new XMPException("Invalid quote in array selector", 102);
                }
                while (true) {
                    aVar.f38426e++;
                    if (aVar.f38426e < aVar.f38422a.length()) {
                        if (aVar.f38422a.charAt(aVar.f38426e) == charAt) {
                            if (aVar.f38426e + 1 >= aVar.f38422a.length() || aVar.f38422a.charAt(aVar.f38426e + 1) != charAt) {
                                break;
                            }
                            aVar.f38426e++;
                        }
                    } else {
                        break;
                    }
                }
                if (aVar.f38426e >= aVar.f38422a.length()) {
                    throw new XMPException("No terminating quote for array selector", 102);
                }
                aVar.f38426e++;
                dVar = new d(null, 6);
            } else if (!"[last()".equals(aVar.f38422a.substring(aVar.f38425d, aVar.f38426e))) {
                throw new XMPException("Invalid non-numeric array index", 102);
            } else {
                dVar = new d(null, 4);
            }
        } else {
            while (aVar.f38426e < aVar.f38422a.length() && '0' <= aVar.f38422a.charAt(aVar.f38426e) && aVar.f38422a.charAt(aVar.f38426e) <= '9') {
                aVar.f38426e++;
            }
            dVar = new d(null, 3);
        }
        if (aVar.f38426e >= aVar.f38422a.length() || aVar.f38422a.charAt(aVar.f38426e) != ']') {
            throw new XMPException("Missing ']' for array index", 102);
        }
        int i14 = aVar.f38426e + 1;
        aVar.f38426e = i14;
        dVar.h(aVar.f38422a.substring(aVar.f38425d, i14));
        return dVar;
    }

    private static void c(String str, a aVar, b bVar) {
        d dVar;
        while (aVar.f38426e < aVar.f38422a.length() && "/[*".indexOf(aVar.f38422a.charAt(aVar.f38426e)) < 0) {
            aVar.f38426e++;
        }
        int i11 = aVar.f38426e;
        int i12 = aVar.f38425d;
        if (i11 == i12) {
            throw new XMPException("Empty initial XMPPath step", 102);
        }
        String h11 = h(str, aVar.f38422a.substring(i12, i11));
        o6.a d11 = k6.d.a().d(h11);
        if (d11 == null) {
            bVar.a(new d(str, Integer.MIN_VALUE));
            dVar = new d(h11, 1);
        } else {
            bVar.a(new d(d11.a(), Integer.MIN_VALUE));
            d dVar2 = new d(h(d11.a(), d11.c()), 1);
            dVar2.e(true);
            dVar2.f(d11.d().d());
            bVar.a(dVar2);
            if (d11.d().i()) {
                dVar = new d("[?xml:lang='x-default']", 5);
            } else if (!d11.d().h()) {
                return;
            } else {
                dVar = new d("[1]", 3);
            }
            dVar.e(true);
            dVar.f(d11.d().d());
        }
        bVar.a(dVar);
    }

    private static d d(a aVar) {
        aVar.f38423b = aVar.f38425d;
        while (aVar.f38426e < aVar.f38422a.length() && "/[*".indexOf(aVar.f38422a.charAt(aVar.f38426e)) < 0) {
            aVar.f38426e++;
        }
        int i11 = aVar.f38426e;
        aVar.f38424c = i11;
        int i12 = aVar.f38425d;
        if (i11 != i12) {
            return new d(aVar.f38422a.substring(i12, i11), 1);
        }
        throw new XMPException("Empty XMPPath segment", 102);
    }

    private static void e(String str, a aVar) {
        if (str.charAt(aVar.f38425d) == '/') {
            int i11 = aVar.f38425d + 1;
            aVar.f38425d = i11;
            if (i11 >= str.length()) {
                throw new XMPException("Empty XMPPath segment", 102);
            }
        }
        if (str.charAt(aVar.f38425d) == '*') {
            int i12 = aVar.f38425d + 1;
            aVar.f38425d = i12;
            if (i12 >= str.length() || str.charAt(aVar.f38425d) != '[') {
                throw new XMPException("Missing '[' after '*'", 102);
            }
        }
    }

    private static void f(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf > 0) {
            String substring = str.substring(0, indexOf);
            if (h.g(substring)) {
                if (k6.d.a().c(substring) == null) {
                    throw new XMPException("Unknown namespace prefix for qualified name", 102);
                }
                return;
            }
        }
        throw new XMPException("Ill-formed qualified name", 102);
    }

    private static void g(String str) {
        if (!h.f(str)) {
            throw new XMPException("Bad XML name", 102);
        }
    }

    private static String h(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Schema namespace URI is required", 101);
        }
        if (str2.charAt(0) == '?' || str2.charAt(0) == '@') {
            throw new XMPException("Top level name must not be a qualifier", 102);
        }
        if (str2.indexOf(47) >= 0 || str2.indexOf(91) >= 0) {
            throw new XMPException("Top level name must be simple", 102);
        }
        String a11 = k6.d.a().a(str);
        if (a11 != null) {
            int indexOf = str2.indexOf(58);
            if (indexOf < 0) {
                g(str2);
                return a11 + str2;
            }
            g(str2.substring(0, indexOf));
            g(str2.substring(indexOf));
            String substring = str2.substring(0, indexOf + 1);
            String a12 = k6.d.a().a(str);
            if (a12 != null) {
                if (substring.equals(a12)) {
                    return str2;
                }
                throw new XMPException("Schema namespace URI and prefix mismatch", 101);
            }
            throw new XMPException("Unknown schema namespace prefix", 101);
        }
        throw new XMPException("Unregistered schema namespace URI", 101);
    }
}