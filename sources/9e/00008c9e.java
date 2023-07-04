package nq;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class j {
    public static c a(Map<String, Object> map, String str) {
        String h11 = h(map, str);
        if (h11 == null) {
            return null;
        }
        return new c(h11);
    }

    public static boolean b(Map<String, Object> map, String str) {
        Boolean bool = (Boolean) c(map, str, Boolean.class);
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new ParseException("JSON object member with key " + str + " is missing or null", 0);
    }

    private static <T> T c(Map<String, Object> map, String str, Class<T> cls) {
        if (map.get(str) == null) {
            return null;
        }
        T t11 = (T) map.get(str);
        if (cls.isAssignableFrom(t11.getClass())) {
            return t11;
        }
        throw new ParseException("Unexpected type of JSON object member with key " + str + "", 0);
    }

    public static int d(Map<String, Object> map, String str) {
        Number number = (Number) c(map, str, Number.class);
        if (number != null) {
            return number.intValue();
        }
        throw new ParseException("JSON object member with key " + str + " is missing or null", 0);
    }

    public static List<Object> e(Map<String, Object> map, String str) {
        return (List) c(map, str, List.class);
    }

    public static Map<String, Object> f(Map<String, Object> map, String str) {
        Map<String, Object> map2 = (Map) c(map, str, Map.class);
        if (map2 == null) {
            return null;
        }
        for (String str2 : map2.keySet()) {
            if (!(str2 instanceof String)) {
                throw new ParseException("JSON object member with key " + str + " not a JSON object", 0);
            }
        }
        return map2;
    }

    public static long g(Map<String, Object> map, String str) {
        Number number = (Number) c(map, str, Number.class);
        if (number != null) {
            return number.longValue();
        }
        throw new ParseException("JSON object member with key " + str + " is missing or null", 0);
    }

    public static String h(Map<String, Object> map, String str) {
        return (String) c(map, str, String.class);
    }

    public static String[] i(Map<String, Object> map, String str) {
        List<Object> e11 = e(map, str);
        if (e11 == null) {
            return null;
        }
        try {
            return (String[]) e11.toArray(new String[0]);
        } catch (ArrayStoreException unused) {
            throw new ParseException("JSON object member with key \"" + str + "\" is not an array of strings", 0);
        }
    }

    public static List<String> j(Map<String, Object> map, String str) {
        String[] i11 = i(map, str);
        if (i11 == null) {
            return null;
        }
        return Arrays.asList(i11);
    }

    public static URI k(Map<String, Object> map, String str) {
        String h11 = h(map, str);
        if (h11 == null) {
            return null;
        }
        try {
            return new URI(h11);
        } catch (URISyntaxException e11) {
            throw new ParseException(e11.getMessage(), 0);
        }
    }

    public static Map<String, Object> l() {
        return new HashMap();
    }

    public static Map<String, Object> m(String str) {
        return n(str, -1);
    }

    public static Map<String, Object> n(String str, int i11) {
        if (i11 >= 0 && str.length() > i11) {
            throw new ParseException("The parsed string is longer than the max accepted size of " + i11 + " characters", 0);
        }
        try {
            Object b11 = new jq.a(640).b(str);
            if (b11 instanceof hq.d) {
                return (hq.d) b11;
            }
            throw new ParseException("JSON entity is not an object", 0);
        } catch (com.nimbusds.jose.shaded.json.parser.ParseException e11) {
            throw new ParseException("Invalid JSON: " + e11.getMessage(), 0);
        } catch (Exception e12) {
            throw new ParseException("Unexpected exception: " + e12.getMessage(), 0);
        } catch (StackOverflowError unused) {
            throw new ParseException("Excessive JSON object and / or array nesting", 0);
        }
    }

    public static String o(Map<String, ?> map) {
        return hq.d.a(map);
    }
}