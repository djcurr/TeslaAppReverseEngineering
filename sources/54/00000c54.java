package bb;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;
import na.l;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f7586a = "0123456789abcdef".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f7587b = new char[64];

    /* renamed from: c  reason: collision with root package name */
    private static volatile Handler f7588c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7589a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f7589a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7589a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7589a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7589a[Bitmap.Config.RGBA_F16.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7589a[Bitmap.Config.ARGB_8888.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private k() {
    }

    public static void a() {
        if (!q()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void b() {
        if (!r()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        } else if (obj instanceof l) {
            return ((l) obj).a(obj2);
        } else {
            return obj.equals(obj2);
        }
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static String e(byte[] bArr, char[] cArr) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int i12 = bArr[i11] & 255;
            int i13 = i11 * 2;
            char[] cArr2 = f7586a;
            cArr[i13] = cArr2[i12 >>> 4];
            cArr[i13 + 1] = cArr2[i12 & 15];
        }
        return new String(cArr);
    }

    public static <T> Queue<T> f(int i11) {
        return new ArrayDeque(i11);
    }

    public static int g(int i11, int i12, Bitmap.Config config) {
        return i11 * i12 * i(config);
    }

    public static int h(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (Build.VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + bitmap + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig());
    }

    private static int i(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i11 = a.f7589a[config.ordinal()];
        if (i11 != 1) {
            if (i11 == 2 || i11 == 3) {
                return 2;
            }
            return i11 != 4 ? 4 : 8;
        }
        return 1;
    }

    public static <T> List<T> j(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t11 : collection) {
            if (t11 != null) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    private static Handler k() {
        if (f7588c == null) {
            synchronized (k.class) {
                if (f7588c == null) {
                    f7588c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f7588c;
    }

    public static int l(float f11) {
        return m(f11, 17);
    }

    public static int m(float f11, int i11) {
        return n(Float.floatToIntBits(f11), i11);
    }

    public static int n(int i11, int i12) {
        return (i12 * 31) + i11;
    }

    public static int o(Object obj, int i11) {
        return n(obj == null ? 0 : obj.hashCode(), i11);
    }

    public static int p(boolean z11, int i11) {
        return n(z11 ? 1 : 0, i11);
    }

    public static boolean q() {
        return !r();
    }

    public static boolean r() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private static boolean s(int i11) {
        return i11 > 0 || i11 == Integer.MIN_VALUE;
    }

    public static boolean t(int i11, int i12) {
        return s(i11) && s(i12);
    }

    public static void u(Runnable runnable) {
        k().post(runnable);
    }

    public static void v(Runnable runnable) {
        k().removeCallbacks(runnable);
    }

    public static String w(byte[] bArr) {
        String e11;
        char[] cArr = f7587b;
        synchronized (cArr) {
            e11 = e(bArr, cArr);
        }
        return e11;
    }
}