package io.grpc.internal;

import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class a1 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f30645a = TimeUnit.SECONDS.toNanos(1);

    public static List<Map<String, ?>> a(List<?> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!(list.get(i11) instanceof Map)) {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not object", list.get(i11), Integer.valueOf(i11), list));
            }
        }
        return list;
    }

    public static List<String> b(List<?> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!(list.get(i11) instanceof String)) {
                throw new ClassCastException(String.format("value '%s' for idx %d in '%s' is not string", list.get(i11), Integer.valueOf(i11), list));
            }
        }
        return list;
    }

    private static boolean c(long j11, int i11) {
        if (j11 >= -315576000000L && j11 <= 315576000000L) {
            long j12 = i11;
            if (j12 >= -999999999 && j12 < f30645a) {
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i12 >= 0 && i11 >= 0) {
                    return true;
                }
                if (i12 <= 0 && i11 <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Boolean d(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Boolean) {
                return (Boolean) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
        }
        return null;
    }

    public static List<?> e(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof List) {
                return (List) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
        }
        return null;
    }

    public static List<Map<String, ?>> f(Map<String, ?> map, String str) {
        List<?> e11 = e(map, str);
        if (e11 == null) {
            return null;
        }
        return a(e11);
    }

    public static List<String> g(Map<String, ?> map, String str) {
        List<?> e11 = e(map, str);
        if (e11 == null) {
            return null;
        }
        return b(e11);
    }

    public static Double h(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Double) {
                return (Double) obj;
            }
            if (obj instanceof String) {
                try {
                    return Double.valueOf(Double.parseDouble((String) obj));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
                }
            }
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        return null;
    }

    public static Integer i(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Double) {
                Double d11 = (Double) obj;
                int intValue = d11.intValue();
                if (intValue == d11.doubleValue()) {
                    return Integer.valueOf(intValue);
                }
                throw new ClassCastException("Number expected to be integer: " + d11);
            } else if (obj instanceof String) {
                try {
                    return Integer.valueOf(Integer.parseInt((String) obj));
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
                }
            } else {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        return null;
    }

    public static Map<String, ?> j(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof Map) {
                return (Map) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
        }
        return null;
    }

    public static String k(Map<String, ?> map, String str) {
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
        }
        return null;
    }

    public static Long l(Map<String, ?> map, String str) {
        String k11 = k(map, str);
        if (k11 == null) {
            return null;
        }
        try {
            return Long.valueOf(n(k11));
        } catch (ParseException e11) {
            throw new RuntimeException(e11);
        }
    }

    private static long m(long j11, int i11) {
        long j12 = i11;
        long j13 = f30645a;
        if (j12 <= (-j13) || j12 >= j13) {
            j11 = el.b.a(j11, j12 / j13);
            i11 = (int) (j12 % j13);
        }
        if (j11 > 0 && i11 < 0) {
            i11 = (int) (i11 + j13);
            j11--;
        }
        if (j11 < 0 && i11 > 0) {
            i11 = (int) (i11 - j13);
            j11++;
        }
        if (c(j11, i11)) {
            return p(TimeUnit.SECONDS.toNanos(j11), i11);
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j11), Integer.valueOf(i11)));
    }

    private static long n(String str) {
        boolean z11;
        String str2;
        if (!str.isEmpty() && str.charAt(str.length() - 1) == 's') {
            if (str.charAt(0) == '-') {
                str = str.substring(1);
                z11 = true;
            } else {
                z11 = false;
            }
            String substring = str.substring(0, str.length() - 1);
            int indexOf = substring.indexOf(46);
            if (indexOf != -1) {
                str2 = substring.substring(indexOf + 1);
                substring = substring.substring(0, indexOf);
            } else {
                str2 = "";
            }
            long parseLong = Long.parseLong(substring);
            int o11 = str2.isEmpty() ? 0 : o(str2);
            if (parseLong >= 0) {
                if (z11) {
                    parseLong = -parseLong;
                    o11 = -o11;
                }
                try {
                    return m(parseLong, o11);
                } catch (IllegalArgumentException unused) {
                    throw new ParseException("Duration value is out of range.", 0);
                }
            }
            throw new ParseException("Invalid duration string: " + str, 0);
        }
        throw new ParseException("Invalid duration string: " + str, 0);
    }

    private static int o(String str) {
        int i11 = 0;
        for (int i12 = 0; i12 < 9; i12++) {
            i11 *= 10;
            if (i12 < str.length()) {
                if (str.charAt(i12) >= '0' && str.charAt(i12) <= '9') {
                    i11 += str.charAt(i12) - '0';
                } else {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
            }
        }
        return i11;
    }

    private static long p(long j11, long j12) {
        long j13 = j11 + j12;
        return (((j12 ^ j11) > 0L ? 1 : ((j12 ^ j11) == 0L ? 0 : -1)) < 0) | ((j11 ^ j13) >= 0) ? j13 : ((j13 >>> 63) ^ 1) + Long.MAX_VALUE;
    }
}