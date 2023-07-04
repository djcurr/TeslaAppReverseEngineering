package vg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static volatile c f54488b;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f54489a = new HashMap();

    private c() {
    }

    public static c b() {
        if (f54488b == null) {
            synchronized (c.class) {
                if (f54488b == null) {
                    f54488b = new c();
                }
            }
        }
        return f54488b;
    }

    public synchronized void a() {
        this.f54489a.clear();
    }

    public Drawable c(Context context, String str) {
        int d11 = d(context, str);
        if (d11 > 0) {
            return context.getResources().getDrawable(d11);
        }
        return null;
    }

    public int d(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase().replace("-", "_");
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                if (this.f54489a.containsKey(replace)) {
                    return this.f54489a.get(replace).intValue();
                }
                int identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                this.f54489a.put(replace, Integer.valueOf(identifier));
                return identifier;
            }
        }
    }

    public Uri e(Context context, String str) {
        int d11 = d(context, str);
        if (d11 > 0) {
            return new Uri.Builder().scheme("res").path(String.valueOf(d11)).build();
        }
        return Uri.EMPTY;
    }
}