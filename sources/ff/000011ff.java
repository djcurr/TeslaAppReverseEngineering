package ci;

import android.os.Build;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final HashSet<String> f9192a;

    /* renamed from: b  reason: collision with root package name */
    private static String f9193b;

    static {
        String str = Build.VERSION.RELEASE;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 57);
        sb2.append("ExoPlayerLib/2.13.2 (Linux; Android ");
        sb2.append(str);
        sb2.append(") ");
        sb2.append("ExoPlayerLib/2.13.2");
        f9192a = new HashSet<>();
        f9193b = "goog.exo.core";
    }

    public static synchronized void a(String str) {
        synchronized (h.class) {
            if (f9192a.add(str)) {
                String str2 = f9193b;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 2 + String.valueOf(str).length());
                sb2.append(str2);
                sb2.append(", ");
                sb2.append(str);
                f9193b = sb2.toString();
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (h.class) {
            str = f9193b;
        }
        return str;
    }
}