package t5;

import android.graphics.Bitmap;
import android.os.Build;
import g6.k;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.w0;

/* loaded from: classes.dex */
public final class f implements b {

    /* renamed from: k  reason: collision with root package name */
    private static final Set<Bitmap.Config> f51641k;

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<Bitmap> f51642a;

    /* renamed from: b  reason: collision with root package name */
    private int f51643b;

    /* renamed from: c  reason: collision with root package name */
    private int f51644c;

    /* renamed from: d  reason: collision with root package name */
    private int f51645d;

    /* renamed from: e  reason: collision with root package name */
    private int f51646e;

    /* renamed from: f  reason: collision with root package name */
    private int f51647f;

    /* renamed from: g  reason: collision with root package name */
    private final int f51648g;

    /* renamed from: h  reason: collision with root package name */
    private final Set<Bitmap.Config> f51649h;

    /* renamed from: i  reason: collision with root package name */
    private final c f51650i;

    /* renamed from: j  reason: collision with root package name */
    private final k f51651j;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Set b11;
        Set<Bitmap.Config> a11;
        new a(null);
        b11 = w0.b();
        b11.add(Bitmap.Config.ALPHA_8);
        b11.add(Bitmap.Config.RGB_565);
        b11.add(Bitmap.Config.ARGB_4444);
        b11.add(Bitmap.Config.ARGB_8888);
        if (Build.VERSION.SDK_INT >= 26) {
            b11.add(Bitmap.Config.RGBA_F16);
        }
        a11 = w0.a(b11);
        f51641k = a11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(int i11, Set<? extends Bitmap.Config> allowedConfigs, c strategy, k kVar) {
        s.g(allowedConfigs, "allowedConfigs");
        s.g(strategy, "strategy");
        this.f51648g = i11;
        this.f51649h = allowedConfigs;
        this.f51650i = strategy;
        this.f51651j = kVar;
        this.f51642a = new HashSet<>();
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("maxSize must be >= 0.".toString());
        }
    }

    private final String h() {
        return "Hits=" + this.f51644c + ", misses=" + this.f51645d + ", puts=" + this.f51646e + ", evictions=" + this.f51647f + ", currentSize=" + this.f51643b + ", maxSize=" + this.f51648g + ", strategy=" + this.f51650i;
    }

    private final void i(Bitmap bitmap) {
        bitmap.setDensity(0);
        bitmap.setHasAlpha(true);
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    private final synchronized void j(int i11) {
        while (this.f51643b > i11) {
            Bitmap removeLast = this.f51650i.removeLast();
            if (removeLast == null) {
                k kVar = this.f51651j;
                if (kVar != null && kVar.getLevel() <= 5) {
                    kVar.a("RealBitmapPool", 5, "Size mismatch, resetting.\n" + h(), null);
                }
                this.f51643b = 0;
                return;
            }
            this.f51642a.remove(removeLast);
            this.f51643b -= g6.a.a(removeLast);
            this.f51647f++;
            k kVar2 = this.f51651j;
            if (kVar2 != null && kVar2.getLevel() <= 2) {
                kVar2.a("RealBitmapPool", 2, "Evicting bitmap=" + this.f51650i.d(removeLast) + '\n' + h(), null);
            }
            removeLast.recycle();
        }
    }

    @Override // t5.b
    public synchronized void a(int i11) {
        k kVar = this.f51651j;
        if (kVar != null && kVar.getLevel() <= 2) {
            kVar.a("RealBitmapPool", 2, "trimMemory, level=" + i11, null);
        }
        if (i11 >= 40) {
            d();
        } else if (10 <= i11 && 20 > i11) {
            j(this.f51643b / 2);
        }
    }

    @Override // t5.b
    public synchronized void b(Bitmap bitmap) {
        s.g(bitmap, "bitmap");
        if (bitmap.isRecycled()) {
            k kVar = this.f51651j;
            if (kVar != null && kVar.getLevel() <= 6) {
                kVar.a("RealBitmapPool", 6, "Rejecting recycled bitmap from pool; bitmap: " + bitmap, null);
            }
            return;
        }
        int a11 = g6.a.a(bitmap);
        boolean z11 = true;
        if (bitmap.isMutable() && a11 <= this.f51648g && this.f51649h.contains(bitmap.getConfig())) {
            if (this.f51642a.contains(bitmap)) {
                k kVar2 = this.f51651j;
                if (kVar2 != null && kVar2.getLevel() <= 6) {
                    kVar2.a("RealBitmapPool", 6, "Rejecting duplicate bitmap from pool; bitmap: " + this.f51650i.d(bitmap), null);
                }
                return;
            }
            this.f51650i.b(bitmap);
            this.f51642a.add(bitmap);
            this.f51643b += a11;
            this.f51646e++;
            k kVar3 = this.f51651j;
            if (kVar3 != null && kVar3.getLevel() <= 2) {
                kVar3.a("RealBitmapPool", 2, "Put bitmap=" + this.f51650i.d(bitmap) + '\n' + h(), null);
            }
            j(this.f51648g);
            return;
        }
        k kVar4 = this.f51651j;
        if (kVar4 != null && kVar4.getLevel() <= 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Rejecting bitmap from pool; bitmap: ");
            sb2.append(this.f51650i.d(bitmap));
            sb2.append(", ");
            sb2.append("is mutable: ");
            sb2.append(bitmap.isMutable());
            sb2.append(", ");
            sb2.append("is greater than max size: ");
            if (a11 <= this.f51648g) {
                z11 = false;
            }
            sb2.append(z11);
            sb2.append(", ");
            sb2.append("is allowed config: ");
            sb2.append(this.f51649h.contains(bitmap.getConfig()));
            kVar4.a("RealBitmapPool", 2, sb2.toString(), null);
        }
        bitmap.recycle();
    }

    @Override // t5.b
    public Bitmap c(int i11, int i12, Bitmap.Config config) {
        s.g(config, "config");
        Bitmap g11 = g(i11, i12, config);
        if (g11 != null) {
            return g11;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, config);
        s.d(createBitmap, "Bitmap.createBitmap(width, height, config)");
        return createBitmap;
    }

    public final void d() {
        k kVar = this.f51651j;
        if (kVar != null && kVar.getLevel() <= 2) {
            kVar.a("RealBitmapPool", 2, "clearMemory", null);
        }
        j(-1);
    }

    @Override // t5.b
    public Bitmap e(int i11, int i12, Bitmap.Config config) {
        s.g(config, "config");
        Bitmap f11 = f(i11, i12, config);
        if (f11 != null) {
            return f11;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i11, i12, config);
        s.d(createBitmap, "Bitmap.createBitmap(width, height, config)");
        return createBitmap;
    }

    public synchronized Bitmap f(int i11, int i12, Bitmap.Config config) {
        Bitmap c11;
        s.g(config, "config");
        if (!g6.a.d(config)) {
            c11 = this.f51650i.c(i11, i12, config);
            if (c11 == null) {
                k kVar = this.f51651j;
                if (kVar != null && kVar.getLevel() <= 2) {
                    kVar.a("RealBitmapPool", 2, "Missing bitmap=" + this.f51650i.a(i11, i12, config), null);
                }
                this.f51645d++;
            } else {
                this.f51642a.remove(c11);
                this.f51643b -= g6.a.a(c11);
                this.f51644c++;
                i(c11);
            }
            k kVar2 = this.f51651j;
            if (kVar2 != null && kVar2.getLevel() <= 2) {
                kVar2.a("RealBitmapPool", 2, "Get bitmap=" + this.f51650i.a(i11, i12, config) + '\n' + h(), null);
            }
        } else {
            throw new IllegalArgumentException("Cannot create a mutable hardware bitmap.".toString());
        }
        return c11;
    }

    public Bitmap g(int i11, int i12, Bitmap.Config config) {
        s.g(config, "config");
        Bitmap f11 = f(i11, i12, config);
        if (f11 != null) {
            f11.eraseColor(0);
            return f11;
        }
        return null;
    }

    public /* synthetic */ f(int i11, Set set, c cVar, k kVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? f51641k : set, (i12 & 4) != 0 ? c.f51638a.a() : cVar, (i12 & 8) != 0 ? null : kVar);
    }
}