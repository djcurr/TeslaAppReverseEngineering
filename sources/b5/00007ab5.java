package j$.time;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.slf4j.Marker;

/* loaded from: classes7.dex */
public abstract class k implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f32947a;

    static {
        HashMap hashMap = new HashMap(64);
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        f32947a = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k() {
        if (getClass() != ZoneOffset.class && getClass() != l.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public static k k(String str, Map map) {
        int i11;
        Objects.requireNonNull(str, "zoneId");
        Objects.requireNonNull(map, "aliasMap");
        String str2 = (String) map.get(str);
        if (str2 != null) {
            str = str2;
        }
        if (str.length() <= 1 || str.startsWith(Marker.ANY_NON_NULL_MARKER) || str.startsWith("-")) {
            return ZoneOffset.o(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i11 = 3;
        } else if (!str.startsWith("UT")) {
            return l.n(str, true);
        } else {
            i11 = 2;
        }
        return m(str, i11, true);
    }

    public static k l(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.length() == 0) {
            return zoneOffset;
        }
        if (str.equals("GMT") || str.equals("UTC") || str.equals("UT")) {
            if (zoneOffset.n() != 0) {
                str = str.concat(zoneOffset.h());
            }
            return new l(str, j$.time.zone.c.e(zoneOffset));
        }
        throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: " + str);
    }

    private static k m(String str, int i11, boolean z11) {
        String substring = str.substring(0, i11);
        if (str.length() == i11) {
            return l(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i11) == '+' || str.charAt(i11) == '-') {
            try {
                ZoneOffset o11 = ZoneOffset.o(str.substring(i11));
                return o11 == ZoneOffset.UTC ? l(substring, o11) : l(substring, o11);
            } catch (c e11) {
                throw new c("Invalid ID for offset-based ZoneId: " + str, e11);
            }
        }
        return l.n(str, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return h().equals(((k) obj).h());
        }
        return false;
    }

    public abstract String h();

    public int hashCode() {
        return h().hashCode();
    }

    public abstract j$.time.zone.c i();

    public String toString() {
        return h();
    }
}