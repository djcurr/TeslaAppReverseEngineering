package od;

import java.util.Locale;
import java.util.Map;
import md.g;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String> f42350a = g.of("mkv", "video/x-matroska", "glb", "model/gltf-binary");

    private static String a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static String b(String str) {
        String a11 = a(str);
        if (a11 == null) {
            return null;
        }
        String lowerCase = a11.toLowerCase(Locale.US);
        String a12 = b.a(lowerCase);
        return a12 == null ? f42350a.get(lowerCase) : a12;
    }

    public static boolean c(String str) {
        return str != null && str.startsWith("video/");
    }
}