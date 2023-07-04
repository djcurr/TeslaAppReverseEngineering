package zl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class b {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f60490a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final int f60491b;

    /* renamed from: c  reason: collision with root package name */
    private final int f60492c;

    public b(int i11, int i12) {
        this.f60491b = i11;
        this.f60492c = i12;
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f60492c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i11) {
        if (str != null) {
            String trim = str.trim();
            return trim.length() > i11 ? trim.substring(0, i11) : trim;
        }
        return str;
    }

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f60490a));
    }

    public synchronized boolean d(String str, String str2) {
        String b11 = b(str);
        if (this.f60490a.size() >= this.f60491b && !this.f60490a.containsKey(b11)) {
            wl.f f11 = wl.f.f();
            f11.k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f60491b);
            return false;
        }
        String c11 = c(str2, this.f60492c);
        if (com.google.firebase.crashlytics.internal.common.g.A(this.f60490a.get(b11), c11)) {
            return false;
        }
        Map<String, String> map = this.f60490a;
        if (str2 == null) {
            c11 = "";
        }
        map.put(b11, c11);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        int i11 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String b11 = b(entry.getKey());
            if (this.f60490a.size() >= this.f60491b && !this.f60490a.containsKey(b11)) {
                i11++;
            }
            String value = entry.getValue();
            this.f60490a.put(b11, value == null ? "" : c(value, this.f60492c));
        }
        if (i11 > 0) {
            wl.f f11 = wl.f.f();
            f11.k("Ignored " + i11 + " entries when adding custom keys. Maximum allowable: " + this.f60491b);
        }
    }
}