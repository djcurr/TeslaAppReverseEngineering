package la;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final int f37139a;

    /* renamed from: b  reason: collision with root package name */
    private final int f37140b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f37141c;

    /* renamed from: d  reason: collision with root package name */
    private final int f37142d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        static final int f37143i;

        /* renamed from: a  reason: collision with root package name */
        final Context f37144a;

        /* renamed from: b  reason: collision with root package name */
        ActivityManager f37145b;

        /* renamed from: c  reason: collision with root package name */
        c f37146c;

        /* renamed from: e  reason: collision with root package name */
        float f37148e;

        /* renamed from: d  reason: collision with root package name */
        float f37147d = 2.0f;

        /* renamed from: f  reason: collision with root package name */
        float f37149f = 0.4f;

        /* renamed from: g  reason: collision with root package name */
        float f37150g = 0.33f;

        /* renamed from: h  reason: collision with root package name */
        int f37151h = 4194304;

        static {
            f37143i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f37148e = f37143i;
            this.f37144a = context;
            this.f37145b = (ActivityManager) context.getSystemService("activity");
            this.f37146c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f37145b)) {
                return;
            }
            this.f37148e = BitmapDescriptorFactory.HUE_RED;
        }

        public i a() {
            return new i(this);
        }
    }

    /* loaded from: classes.dex */
    private static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        private final DisplayMetrics f37152a;

        b(DisplayMetrics displayMetrics) {
            this.f37152a = displayMetrics;
        }

        @Override // la.i.c
        public int a() {
            return this.f37152a.heightPixels;
        }

        @Override // la.i.c
        public int b() {
            return this.f37152a.widthPixels;
        }
    }

    /* loaded from: classes.dex */
    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        int i11;
        this.f37141c = aVar.f37144a;
        if (e(aVar.f37145b)) {
            i11 = aVar.f37151h / 2;
        } else {
            i11 = aVar.f37151h;
        }
        this.f37142d = i11;
        int c11 = c(aVar.f37145b, aVar.f37149f, aVar.f37150g);
        float b11 = aVar.f37146c.b() * aVar.f37146c.a() * 4;
        int round = Math.round(aVar.f37148e * b11);
        int round2 = Math.round(b11 * aVar.f37147d);
        int i12 = c11 - i11;
        int i13 = round2 + round;
        if (i13 <= i12) {
            this.f37140b = round2;
            this.f37139a = round;
        } else {
            float f11 = i12;
            float f12 = aVar.f37148e;
            float f13 = aVar.f37147d;
            float f14 = f11 / (f12 + f13);
            this.f37140b = Math.round(f13 * f14);
            this.f37139a = Math.round(f14 * aVar.f37148e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f37140b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f37139a));
            sb2.append(", byte array size: ");
            sb2.append(f(i11));
            sb2.append(", memory class limited? ");
            sb2.append(i13 > c11);
            sb2.append(", max size: ");
            sb2.append(f(c11));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f37145b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f37145b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f11, float f12) {
        boolean e11 = e(activityManager);
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (e11) {
            f11 = f12;
        }
        return Math.round(memoryClass * f11);
    }

    static boolean e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    private String f(int i11) {
        return Formatter.formatFileSize(this.f37141c, i11);
    }

    public int a() {
        return this.f37142d;
    }

    public int b() {
        return this.f37139a;
    }

    public int d() {
        return this.f37140b;
    }
}