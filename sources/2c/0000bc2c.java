package w30;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class a {
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    private static boolean a(String str) {
        return b.b(str) && str.length() == 2;
    }

    private static boolean b(String str) {
        return b.a(str) && (str.length() == 2 || str.length() == 3);
    }

    private static boolean c(String str) {
        return b.d(str) && str.length() == 3;
    }

    private static Locale d(String str) {
        if (b(str)) {
            return new Locale(str);
        }
        String[] split = str.split("_", -1);
        String str2 = split[0];
        if (split.length == 2) {
            String str3 = split[1];
            if ((b(str2) && a(str3)) || c(str3)) {
                return new Locale(str2, str3);
            }
        } else if (split.length == 3) {
            String str4 = split[1];
            String str5 = split[2];
            if (b(str2) && ((str4.isEmpty() || a(str4) || c(str4)) && !str5.isEmpty())) {
                return new Locale(str2, str4, str5);
            }
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }

    public static Locale e(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new Locale("", "");
        }
        if (!str.contains("#")) {
            int length = str.length();
            if (length >= 2) {
                if (str.charAt(0) == '_') {
                    if (length >= 3) {
                        char charAt = str.charAt(1);
                        char charAt2 = str.charAt(2);
                        if (!Character.isUpperCase(charAt) || !Character.isUpperCase(charAt2)) {
                            throw new IllegalArgumentException("Invalid locale format: " + str);
                        } else if (length == 3) {
                            return new Locale("", str.substring(1, 3));
                        } else {
                            if (length >= 5) {
                                if (str.charAt(3) == '_') {
                                    return new Locale("", str.substring(1, 3), str.substring(4));
                                }
                                throw new IllegalArgumentException("Invalid locale format: " + str);
                            }
                            throw new IllegalArgumentException("Invalid locale format: " + str);
                        }
                    }
                    throw new IllegalArgumentException("Invalid locale format: " + str);
                }
                return d(str);
            }
            throw new IllegalArgumentException("Invalid locale format: " + str);
        }
        throw new IllegalArgumentException("Invalid locale format: " + str);
    }
}