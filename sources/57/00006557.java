package d7;

import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.LruCache;
import d7.g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import vz.b0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f23755e;

    /* renamed from: f  reason: collision with root package name */
    private static final String f23756f;

    /* renamed from: g  reason: collision with root package name */
    private static final EnumC0455b f23757g;

    /* renamed from: h  reason: collision with root package name */
    private static final int f23758h;

    /* renamed from: i  reason: collision with root package name */
    private static b f23759i;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, g> f23760a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23761b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23762c;

    /* renamed from: d  reason: collision with root package name */
    private final LruCache<String, BitmapDrawable> f23763d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c() {
            return ((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8;
        }

        public final b b(com.adyen.checkout.core.api.d environment, DisplayMetrics displayMetrics) {
            s.g(environment, "environment");
            s.g(displayMetrics, "displayMetrics");
            String a11 = environment.a();
            s.f(a11, "environment.baseUrl");
            synchronized (b.class) {
                b bVar = b.f23759i;
                if (bVar == null || bVar.j(a11)) {
                    if (bVar != null) {
                        bVar.f();
                    }
                    b bVar2 = new b(a11, displayMetrics);
                    a aVar = b.f23755e;
                    b.f23759i = bVar2;
                    return bVar2;
                }
                return bVar;
            }
        }
    }

    /* renamed from: d7.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0455b {
        SMALL,
        MEDIUM,
        LARGE;

        @Override // java.lang.Enum
        public String toString() {
            String name = name();
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase(Locale.ROOT);
            s.f(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
            return lowerCase;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends LruCache<String, BitmapDrawable> {
        c(int i11) {
            super(i11);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: a */
        public int sizeOf(String key, BitmapDrawable drawable) {
            s.g(key, "key");
            s.g(drawable, "drawable");
            return drawable.getBitmap().getByteCount() / 1024;
        }
    }

    static {
        a aVar = new a(null);
        f23755e = aVar;
        String c11 = o7.a.c();
        s.f(c11, "getTag()");
        f23756f = c11;
        f23757g = EnumC0455b.SMALL;
        f23758h = aVar.c();
    }

    public b(String host, DisplayMetrics displayMetrics) {
        s.g(host, "host");
        s.g(displayMetrics, "displayMetrics");
        this.f23760a = new HashMap();
        this.f23761b = s.p(host, "images/logos/%1$s/%2$s.png");
        this.f23762c = g(displayMetrics.densityDpi);
        this.f23763d = new c(f23758h);
    }

    private final String e(String str, String str2, EnumC0455b enumC0455b) {
        if (!(str2 == null || str2.length() == 0)) {
            str = str + '/' + ((Object) str2);
        }
        q0 q0Var = q0.f34921a;
        String format = String.format(this.f23761b, Arrays.copyOf(new Object[]{i(enumC0455b), s.p(str, this.f23762c)}, 2));
        s.f(format, "java.lang.String.format(format, *args)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.f23763d.evictAll();
    }

    private final String g(int i11) {
        return i11 <= 120 ? "-ldpi" : i11 <= 160 ? "" : i11 <= 240 ? "-hdpi" : i11 <= 320 ? "-xhdpi" : i11 <= 480 ? "-xxhdpi" : "-xxxhdpi";
    }

    private final String i(EnumC0455b enumC0455b) {
        if (enumC0455b == null) {
            enumC0455b = f23757g;
        }
        return enumC0455b.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(String str) {
        boolean H;
        H = v.H(this.f23761b, str, false, 2, null);
        return !H;
    }

    public final void h(String txVariant, String str, EnumC0455b enumC0455b, g.b callback) {
        s.g(txVariant, "txVariant");
        s.g(callback, "callback");
        String str2 = f23756f;
        o7.b.f(str2, "getLogo - " + txVariant + ", " + ((Object) str) + ", " + enumC0455b);
        String e11 = e(txVariant, str, enumC0455b);
        synchronized (this) {
            BitmapDrawable bitmapDrawable = this.f23763d.get(e11);
            if (bitmapDrawable != null) {
                o7.b.f(str2, "returning cached logo");
                callback.b(bitmapDrawable);
                b0 b0Var = b0.f54756a;
            } else if (!this.f23760a.containsKey(e11)) {
                g gVar = new g(this, e11, callback);
                this.f23760a.put(e11, gVar);
                com.adyen.checkout.core.api.g.f9591b.submit(gVar);
            } else {
                g gVar2 = this.f23760a.get(e11);
                if (gVar2 != null) {
                    gVar2.d(callback);
                    b0 b0Var2 = b0.f54756a;
                }
            }
        }
    }

    public final void k(String logoUrl, BitmapDrawable bitmapDrawable) {
        s.g(logoUrl, "logoUrl");
        synchronized (this) {
            this.f23760a.remove(logoUrl);
            if (bitmapDrawable != null) {
                this.f23763d.put(logoUrl, bitmapDrawable);
            }
            b0 b0Var = b0.f54756a;
        }
    }
}