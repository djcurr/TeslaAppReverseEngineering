package ezvcard.util;

import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class GeoUri {

    /* renamed from: g  reason: collision with root package name */
    private static final boolean[] f25411g = new boolean[128];

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f25412h;

    /* renamed from: a  reason: collision with root package name */
    private final Double f25413a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f25414b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f25415c;

    /* renamed from: d  reason: collision with root package name */
    private final String f25416d;

    /* renamed from: e  reason: collision with root package name */
    private final Double f25417e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f25418f;

    static {
        for (int i11 = 48; i11 <= 57; i11++) {
            f25411g[i11] = true;
        }
        for (int i12 = 65; i12 <= 90; i12++) {
            f25411g[i12] = true;
        }
        for (int i13 = 97; i13 <= 122; i13++) {
            f25411g[i13] = true;
        }
        for (int i14 = 0; i14 < 15; i14++) {
            f25411g["!$&'()*+-.:[]_~".charAt(i14)] = true;
        }
        f25412h = Pattern.compile("(?i)%([0-9a-f]{2})");
    }

    private static void g(String str, String str2, b bVar) {
        String h11 = h(str2);
        if ("crs".equalsIgnoreCase(str)) {
            bVar.f25422d = h11;
            return;
        }
        if ("u".equalsIgnoreCase(str)) {
            try {
                bVar.f25423e = Double.valueOf(h11);
                return;
            } catch (NumberFormatException unused) {
            }
        }
        bVar.f25424f.put(str, h11);
    }

    private static String h(String str) {
        Matcher matcher = f25412h.matcher(str);
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

    private static String i(String str) {
        StringBuilder sb2 = null;
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            boolean[] zArr = f25411g;
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

    private static void l(c cVar, b bVar) {
        String d11 = cVar.d();
        if (bVar.f25419a == null) {
            try {
                bVar.f25419a = Double.valueOf(Double.parseDouble(d11));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException(ezvcard.a.INSTANCE.getExceptionMessage(22, "A"), e11);
            }
        } else if (bVar.f25420b == null) {
            try {
                bVar.f25420b = Double.valueOf(Double.parseDouble(d11));
            } catch (NumberFormatException e12) {
                throw new IllegalArgumentException(ezvcard.a.INSTANCE.getExceptionMessage(22, "B"), e12);
            }
        } else if (bVar.f25421c == null) {
            try {
                bVar.f25421c = Double.valueOf(Double.parseDouble(d11));
            } catch (NumberFormatException e13) {
                throw new IllegalArgumentException(ezvcard.a.INSTANCE.getExceptionMessage(22, Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE), e13);
            }
        }
    }

    private static void m(c cVar, String str, b bVar) {
        String d11 = cVar.d();
        if (str == null) {
            if (d11.length() > 0) {
                g(d11, "", bVar);
                return;
            }
            return;
        }
        g(str, d11, bVar);
    }

    public static GeoUri n(String str) {
        if (str.length() < 4 || !str.substring(0, 4).equalsIgnoreCase("geo:")) {
            throw ezvcard.a.INSTANCE.getIllegalArgumentException(18, "geo:");
        }
        b bVar = new b(null, null);
        c cVar = new c();
        boolean z11 = false;
        String str2 = null;
        for (int i11 = 4; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (charAt == ',' && !z11) {
                l(cVar, bVar);
            } else if (charAt == ';') {
                if (z11) {
                    m(cVar, str2, bVar);
                    str2 = null;
                } else {
                    l(cVar, bVar);
                    if (bVar.f25420b == null) {
                        throw ezvcard.a.INSTANCE.getIllegalArgumentException(21, new Object[0]);
                    }
                    z11 = true;
                }
            } else if (charAt == '=' && z11 && str2 == null) {
                str2 = cVar.d();
            } else {
                cVar.a(charAt);
            }
        }
        if (z11) {
            m(cVar, str2, bVar);
        } else {
            l(cVar, bVar);
            if (bVar.f25420b == null) {
                throw ezvcard.a.INSTANCE.getIllegalArgumentException(21, new Object[0]);
            }
        }
        return bVar.l();
    }

    private void p(String str, String str2, StringBuilder sb2) {
        sb2.append(';');
        sb2.append(str);
        sb2.append('=');
        sb2.append(i(str2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GeoUri.class == obj.getClass()) {
            GeoUri geoUri = (GeoUri) obj;
            Double d11 = this.f25413a;
            if (d11 == null) {
                if (geoUri.f25413a != null) {
                    return false;
                }
            } else if (!d11.equals(geoUri.f25413a)) {
                return false;
            }
            Double d12 = this.f25414b;
            if (d12 == null) {
                if (geoUri.f25414b != null) {
                    return false;
                }
            } else if (!d12.equals(geoUri.f25414b)) {
                return false;
            }
            Double d13 = this.f25415c;
            if (d13 == null) {
                if (geoUri.f25415c != null) {
                    return false;
                }
            } else if (!d13.equals(geoUri.f25415c)) {
                return false;
            }
            String str = this.f25416d;
            if (str == null) {
                if (geoUri.f25416d != null) {
                    return false;
                }
            } else if (!str.equalsIgnoreCase(geoUri.f25416d)) {
                return false;
            }
            Double d14 = this.f25417e;
            if (d14 == null) {
                if (geoUri.f25417e != null) {
                    return false;
                }
            } else if (!d14.equals(geoUri.f25417e)) {
                return false;
            }
            Map<String, String> map = this.f25418f;
            if (map == null) {
                if (geoUri.f25418f != null) {
                    return false;
                }
            } else if (geoUri.f25418f == null || map.size() != geoUri.f25418f.size() || !h.b(this.f25418f).equals(h.b(geoUri.f25418f))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Double d11 = this.f25413a;
        int hashCode = ((d11 == null ? 0 : d11.hashCode()) + 31) * 31;
        Double d12 = this.f25414b;
        int hashCode2 = (hashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.f25415c;
        int hashCode3 = (hashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str = this.f25416d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.toLowerCase().hashCode())) * 31;
        Map<String, String> map = this.f25418f;
        int hashCode5 = (hashCode4 + (map == null ? 0 : h.b(map).hashCode())) * 31;
        Double d14 = this.f25417e;
        return hashCode5 + (d14 != null ? d14.hashCode() : 0);
    }

    public Double j() {
        return this.f25413a;
    }

    public Double k() {
        return this.f25414b;
    }

    public String o(int i11) {
        j jVar = new j(i11);
        StringBuilder sb2 = new StringBuilder("geo:");
        sb2.append(jVar.format(this.f25413a));
        sb2.append(CoreConstants.COMMA_CHAR);
        sb2.append(jVar.format(this.f25414b));
        if (this.f25415c != null) {
            sb2.append(CoreConstants.COMMA_CHAR);
            sb2.append(this.f25415c);
        }
        String str = this.f25416d;
        if (str != null && !str.equalsIgnoreCase("wgs84")) {
            p("crs", this.f25416d, sb2);
        }
        Double d11 = this.f25417e;
        if (d11 != null) {
            p("u", jVar.format(d11), sb2);
        }
        for (Map.Entry<String, String> entry : this.f25418f.entrySet()) {
            p(entry.getKey(), entry.getValue(), sb2);
        }
        return sb2.toString();
    }

    public String toString() {
        return o(6);
    }

    private GeoUri(b bVar) {
        Double d11 = bVar.f25419a;
        Double valueOf = Double.valueOf(0.0d);
        this.f25413a = d11 == null ? valueOf : bVar.f25419a;
        this.f25414b = bVar.f25420b != null ? bVar.f25420b : valueOf;
        this.f25415c = bVar.f25421c;
        this.f25416d = bVar.f25422d;
        this.f25417e = bVar.f25423e;
        this.f25418f = Collections.unmodifiableMap(bVar.f25424f);
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private Double f25419a;

        /* renamed from: b  reason: collision with root package name */
        private Double f25420b;

        /* renamed from: c  reason: collision with root package name */
        private Double f25421c;

        /* renamed from: d  reason: collision with root package name */
        private String f25422d;

        /* renamed from: e  reason: collision with root package name */
        private Double f25423e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f25424f;

        public b(Double d11, Double d12) {
            new ezvcard.util.b("a-zA-Z0-9-");
            this.f25424f = new LinkedHashMap(0);
            m(d11);
            n(d12);
        }

        public GeoUri l() {
            return new GeoUri(this);
        }

        public b m(Double d11) {
            this.f25419a = d11;
            return this;
        }

        public b n(Double d11) {
            this.f25420b = d11;
            return this;
        }

        public b(GeoUri geoUri) {
            new ezvcard.util.b("a-zA-Z0-9-");
            m(geoUri.f25413a);
            n(geoUri.f25414b);
            this.f25421c = geoUri.f25415c;
            this.f25422d = geoUri.f25416d;
            this.f25423e = geoUri.f25417e;
            this.f25424f = new LinkedHashMap(geoUri.f25418f);
        }
    }
}