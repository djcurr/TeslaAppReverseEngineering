package ka;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class n implements l {

    /* renamed from: d  reason: collision with root package name */
    private static final Bitmap.Config[] f34537d;

    /* renamed from: e  reason: collision with root package name */
    private static final Bitmap.Config[] f34538e;

    /* renamed from: f  reason: collision with root package name */
    private static final Bitmap.Config[] f34539f;

    /* renamed from: g  reason: collision with root package name */
    private static final Bitmap.Config[] f34540g;

    /* renamed from: h  reason: collision with root package name */
    private static final Bitmap.Config[] f34541h;

    /* renamed from: a  reason: collision with root package name */
    private final c f34542a = new c();

    /* renamed from: b  reason: collision with root package name */
    private final h<b, Bitmap> f34543b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f34544c = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34545a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f34545a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34545a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34545a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34545a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b implements m {

        /* renamed from: a  reason: collision with root package name */
        private final c f34546a;

        /* renamed from: b  reason: collision with root package name */
        int f34547b;

        /* renamed from: c  reason: collision with root package name */
        private Bitmap.Config f34548c;

        public b(c cVar) {
            this.f34546a = cVar;
        }

        @Override // ka.m
        public void a() {
            this.f34546a.c(this);
        }

        public void b(int i11, Bitmap.Config config) {
            this.f34547b = i11;
            this.f34548c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f34547b == bVar.f34547b && bb.k.d(this.f34548c, bVar.f34548c);
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.f34547b * 31;
            Bitmap.Config config = this.f34548c;
            return i11 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return n.h(this.f34547b, this.f34548c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends d<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ka.d
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int i11, Bitmap.Config config) {
            b b11 = b();
            b11.b(i11, config);
            return b11;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f34537d = configArr;
        f34538e = configArr;
        f34539f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f34540g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f34541h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j11 = j(bitmap.getConfig());
        Integer num2 = (Integer) j11.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                j11.remove(num);
                return;
            } else {
                j11.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + this);
    }

    private b g(int i11, Bitmap.Config config) {
        Bitmap.Config[] i12;
        b e11 = this.f34542a.e(i11, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer ceilingKey = j(config2).ceilingKey(Integer.valueOf(i11));
            if (ceilingKey != null && ceilingKey.intValue() <= i11 * 8) {
                if (ceilingKey.intValue() == i11) {
                    if (config2 == null) {
                        if (config == null) {
                            return e11;
                        }
                    } else if (config2.equals(config)) {
                        return e11;
                    }
                }
                this.f34542a.c(e11);
                return this.f34542a.e(ceilingKey.intValue(), config2);
            }
        }
        return e11;
    }

    static String h(int i11, Bitmap.Config config) {
        return "[" + i11 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f34538e;
        }
        int i11 = a.f34545a[config.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return i11 != 4 ? new Bitmap.Config[]{config} : f34541h;
                }
                return f34540g;
            }
            return f34539f;
        }
        return f34537d;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f34544c.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            this.f34544c.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    @Override // ka.l
    public String a(Bitmap bitmap) {
        return h(bb.k.h(bitmap), bitmap.getConfig());
    }

    @Override // ka.l
    public void b(Bitmap bitmap) {
        b e11 = this.f34542a.e(bb.k.h(bitmap), bitmap.getConfig());
        this.f34543b.d(e11, bitmap);
        NavigableMap<Integer, Integer> j11 = j(bitmap.getConfig());
        Integer num = (Integer) j11.get(Integer.valueOf(e11.f34547b));
        j11.put(Integer.valueOf(e11.f34547b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // ka.l
    public Bitmap c(int i11, int i12, Bitmap.Config config) {
        b g11 = g(bb.k.g(i11, i12, config), config);
        Bitmap a11 = this.f34543b.a(g11);
        if (a11 != null) {
            f(Integer.valueOf(g11.f34547b), a11);
            a11.reconfigure(i11, i12, config);
        }
        return a11;
    }

    @Override // ka.l
    public String d(int i11, int i12, Bitmap.Config config) {
        return h(bb.k.g(i11, i12, config), config);
    }

    @Override // ka.l
    public int e(Bitmap bitmap) {
        return bb.k.h(bitmap);
    }

    @Override // ka.l
    public Bitmap removeLast() {
        Bitmap f11 = this.f34543b.f();
        if (f11 != null) {
            f(Integer.valueOf(bb.k.h(f11)), f11);
        }
        return f11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f34543b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f34544c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f34544c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}