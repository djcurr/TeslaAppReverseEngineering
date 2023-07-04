package v7;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f54232a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f54233b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String[] f54234c;

    /* renamed from: d  reason: collision with root package name */
    private static long[] f54235d;

    /* renamed from: e  reason: collision with root package name */
    private static int f54236e;

    /* renamed from: f  reason: collision with root package name */
    private static int f54237f;

    /* renamed from: g  reason: collision with root package name */
    private static e8.f f54238g;

    /* renamed from: h  reason: collision with root package name */
    private static e8.e f54239h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile e8.h f54240i;

    /* renamed from: j  reason: collision with root package name */
    private static volatile e8.g f54241j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements e8.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f54242a;

        a(Context context) {
            this.f54242a = context;
        }

        @Override // e8.e
        public File a() {
            return new File(this.f54242a.getCacheDir(), "lottie_network_cache");
        }
    }

    public static void a(String str) {
        if (f54233b) {
            int i11 = f54236e;
            if (i11 == 20) {
                f54237f++;
                return;
            }
            f54234c[i11] = str;
            f54235d[i11] = System.nanoTime();
            r3.m.a(str);
            f54236e++;
        }
    }

    public static float b(String str) {
        int i11 = f54237f;
        if (i11 > 0) {
            f54237f = i11 - 1;
            return BitmapDescriptorFactory.HUE_RED;
        } else if (f54233b) {
            int i12 = f54236e - 1;
            f54236e = i12;
            if (i12 != -1) {
                if (str.equals(f54234c[i12])) {
                    r3.m.b();
                    return ((float) (System.nanoTime() - f54235d[f54236e])) / 1000000.0f;
                }
                throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + f54234c[f54236e] + ".");
            }
            throw new IllegalStateException("Can't end trace section. There are none.");
        } else {
            return BitmapDescriptorFactory.HUE_RED;
        }
    }

    public static e8.g c(Context context) {
        Context applicationContext = context.getApplicationContext();
        e8.g gVar = f54241j;
        if (gVar == null) {
            synchronized (e8.g.class) {
                gVar = f54241j;
                if (gVar == null) {
                    e8.e eVar = f54239h;
                    if (eVar == null) {
                        eVar = new a(applicationContext);
                    }
                    gVar = new e8.g(eVar);
                    f54241j = gVar;
                }
            }
        }
        return gVar;
    }

    public static e8.h d(Context context) {
        e8.h hVar = f54240i;
        if (hVar == null) {
            synchronized (e8.h.class) {
                hVar = f54240i;
                if (hVar == null) {
                    e8.g c11 = c(context);
                    e8.f fVar = f54238g;
                    if (fVar == null) {
                        fVar = new e8.b();
                    }
                    hVar = new e8.h(c11, fVar);
                    f54240i = hVar;
                }
            }
        }
        return hVar;
    }
}