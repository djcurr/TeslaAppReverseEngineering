package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class TelUri {

    /* renamed from: f  reason: collision with root package name */
    private static final boolean[] f25433f = new boolean[128];

    /* renamed from: g  reason: collision with root package name */
    private static final Pattern f25434g;

    /* renamed from: a  reason: collision with root package name */
    private final String f25435a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25436b;

    /* renamed from: c  reason: collision with root package name */
    private final String f25437c;

    /* renamed from: d  reason: collision with root package name */
    private final String f25438d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f25439e;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private String f25440a;

        /* renamed from: b  reason: collision with root package name */
        private String f25441b;

        /* renamed from: c  reason: collision with root package name */
        private String f25442c;

        /* renamed from: d  reason: collision with root package name */
        private String f25443d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f25444e;

        public TelUri j() {
            return new TelUri(this);
        }

        private b() {
            new ezvcard.util.b("a-zA-Z0-9-");
            this.f25444e = new TreeMap();
        }
    }

    static {
        for (int i11 = 48; i11 <= 57; i11++) {
            f25433f[i11] = true;
        }
        for (int i12 = 65; i12 <= 90; i12++) {
            f25433f[i12] = true;
        }
        for (int i13 = 97; i13 <= 122; i13++) {
            f25433f[i13] = true;
        }
        for (int i14 = 0; i14 < 16; i14++) {
            f25433f["!$&'()*+-.:[]_~/".charAt(i14)] = true;
        }
        f25434g = Pattern.compile("(?i)%([0-9a-f]{2})");
    }

    private static void a(String str, String str2, b bVar) {
        String b11 = b(str2);
        if ("ext".equalsIgnoreCase(str)) {
            bVar.f25441b = b11;
        } else if ("isub".equalsIgnoreCase(str)) {
            bVar.f25442c = b11;
        } else if ("phone-context".equalsIgnoreCase(str)) {
            bVar.f25443d = b11;
        } else {
            bVar.f25444e.put(str, b11);
        }
    }

    private static String b(String str) {
        Matcher matcher = f25434g.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer(str.length());
            }
            matcher.appendReplacement(stringBuffer, Character.toString((char) Integer.parseInt(matcher.group(1), 16)));
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static String c(String str) {
        StringBuilder sb2 = null;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            boolean[] zArr = f25433f;
            if (charAt >= zArr.length || !zArr[charAt]) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(str.length() * 2);
                    sb2.append(str.substring(0, i11));
                }
                String num = Integer.toString(charAt, 16);
                sb2.append(CoreConstants.PERCENT_CHAR);
                sb2.append(num);
            } else if (sb2 != null) {
                sb2.append(charAt);
            }
        }
        return sb2 == null ? str : sb2.toString();
    }

    private static void d(c cVar, String str, b bVar) {
        String d11 = cVar.d();
        if (bVar.f25440a == null) {
            bVar.f25440a = d11;
        } else if (str == null) {
            if (d11.length() > 0) {
                a(d11, "", bVar);
            }
        } else {
            a(str, d11, bVar);
        }
    }

    public static TelUri e(String str) {
        if (str.length() < 4 || !str.substring(0, 4).equalsIgnoreCase("tel:")) {
            throw ezvcard.a.INSTANCE.getIllegalArgumentException(18, "tel:");
        }
        b bVar = new b();
        c cVar = new c();
        String str2 = null;
        for (int i11 = 4; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '=' && bVar.f25440a != null && str2 == null) {
                str2 = cVar.d();
            } else if (charAt == ';') {
                d(cVar, str2, bVar);
                str2 = null;
            } else {
                cVar.a(charAt);
            }
        }
        d(cVar, str2, bVar);
        return bVar.j();
    }

    private static void f(String str, String str2, StringBuilder sb2) {
        sb2.append(';');
        sb2.append(str);
        sb2.append('=');
        sb2.append(c(str2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TelUri.class == obj.getClass()) {
            TelUri telUri = (TelUri) obj;
            String str = this.f25436b;
            if (str == null) {
                if (telUri.f25436b != null) {
                    return false;
                }
            } else if (!str.equalsIgnoreCase(telUri.f25436b)) {
                return false;
            }
            String str2 = this.f25437c;
            if (str2 == null) {
                if (telUri.f25437c != null) {
                    return false;
                }
            } else if (!str2.equalsIgnoreCase(telUri.f25437c)) {
                return false;
            }
            String str3 = this.f25435a;
            if (str3 == null) {
                if (telUri.f25435a != null) {
                    return false;
                }
            } else if (!str3.equalsIgnoreCase(telUri.f25435a)) {
                return false;
            }
            Map<String, String> map = this.f25439e;
            if (map == null) {
                if (telUri.f25439e != null) {
                    return false;
                }
            } else if (telUri.f25439e == null || map.size() != telUri.f25439e.size() || !h.b(this.f25439e).equals(h.b(telUri.f25439e))) {
                return false;
            }
            String str4 = this.f25438d;
            if (str4 == null) {
                if (telUri.f25438d != null) {
                    return false;
                }
            } else if (!str4.equalsIgnoreCase(telUri.f25438d)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f25436b;
        int hashCode = ((str == null ? 0 : str.toLowerCase().hashCode()) + 31) * 31;
        String str2 = this.f25437c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.toLowerCase().hashCode())) * 31;
        String str3 = this.f25435a;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.toLowerCase().hashCode())) * 31;
        Map<String, String> map = this.f25439e;
        int hashCode4 = (hashCode3 + (map == null ? 0 : h.b(map).hashCode())) * 31;
        String str4 = this.f25438d;
        return hashCode4 + (str4 != null ? str4.toLowerCase().hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("tel:");
        sb2.append(this.f25435a);
        String str = this.f25436b;
        if (str != null) {
            f("ext", str, sb2);
        }
        String str2 = this.f25437c;
        if (str2 != null) {
            f("isub", str2, sb2);
        }
        String str3 = this.f25438d;
        if (str3 != null) {
            f("phone-context", str3, sb2);
        }
        for (Map.Entry<String, String> entry : this.f25439e.entrySet()) {
            f(entry.getKey(), entry.getValue(), sb2);
        }
        return sb2.toString();
    }

    private TelUri(b bVar) {
        this.f25435a = bVar.f25440a;
        this.f25436b = bVar.f25441b;
        this.f25437c = bVar.f25442c;
        this.f25438d = bVar.f25443d;
        this.f25439e = Collections.unmodifiableMap(bVar.f25444e);
    }
}