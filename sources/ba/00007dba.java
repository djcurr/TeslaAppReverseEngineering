package ka;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class k implements e {

    /* renamed from: j  reason: collision with root package name */
    private static final Bitmap.Config f34527j = Bitmap.Config.ARGB_8888;

    /* renamed from: a  reason: collision with root package name */
    private final l f34528a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Bitmap.Config> f34529b;

    /* renamed from: c  reason: collision with root package name */
    private final a f34530c;

    /* renamed from: d  reason: collision with root package name */
    private long f34531d;

    /* renamed from: e  reason: collision with root package name */
    private long f34532e;

    /* renamed from: f  reason: collision with root package name */
    private int f34533f;

    /* renamed from: g  reason: collision with root package name */
    private int f34534g;

    /* renamed from: h  reason: collision with root package name */
    private int f34535h;

    /* renamed from: i  reason: collision with root package name */
    private int f34536i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface a {
        void c(Bitmap bitmap);

        void d(Bitmap bitmap);
    }

    /* loaded from: classes.dex */
    private static final class b implements a {
        b() {
        }

        @Override // ka.k.a
        public void c(Bitmap bitmap) {
        }

        @Override // ka.k.a
        public void d(Bitmap bitmap) {
        }
    }

    k(long j11, l lVar, Set<Bitmap.Config> set) {
        this.f34531d = j11;
        this.f34528a = lVar;
        this.f34529b = set;
        this.f34530c = new b();
    }

    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i11, int i12, Bitmap.Config config) {
        if (config == null) {
            config = f34527j;
        }
        return Bitmap.createBitmap(i11, i12, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f34533f + ", misses=" + this.f34534g + ", puts=" + this.f34535h + ", evictions=" + this.f34536i + ", currentSize=" + this.f34532e + ", maxSize=" + this.f34531d + "\nStrategy=" + this.f34528a);
    }

    private void j() {
        q(this.f34531d);
    }

    private static Set<Bitmap.Config> k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 19) {
            hashSet.add(null);
        }
        if (i11 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    private static l l() {
        if (Build.VERSION.SDK_INT >= 19) {
            return new n();
        }
        return new c();
    }

    private synchronized Bitmap m(int i11, int i12, Bitmap.Config config) {
        Bitmap c11;
        f(config);
        c11 = this.f34528a.c(i11, i12, config != null ? config : f34527j);
        if (c11 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.f34528a.d(i11, i12, config));
            }
            this.f34534g++;
        } else {
            this.f34533f++;
            this.f34532e -= this.f34528a.e(c11);
            this.f34530c.c(c11);
            p(c11);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.f34528a.d(i11, i12, config));
        }
        h();
        return c11;
    }

    private static void o(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j11) {
        while (this.f34532e > j11) {
            Bitmap removeLast = this.f34528a.removeLast();
            if (removeLast == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    i();
                }
                this.f34532e = 0L;
                return;
            }
            this.f34530c.c(removeLast);
            this.f34532e -= this.f34528a.e(removeLast);
            this.f34536i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Evicting bitmap=" + this.f34528a.a(removeLast));
            }
            h();
            removeLast.recycle();
        }
    }

    @Override // ka.e
    public void a(int i11) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i11);
        }
        if (i11 >= 40 || (Build.VERSION.SDK_INT >= 23 && i11 >= 20)) {
            d();
        } else if (i11 >= 20 || i11 == 15) {
            q(n() / 2);
        }
    }

    @Override // ka.e
    public synchronized void b(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && this.f34528a.e(bitmap) <= this.f34531d && this.f34529b.contains(bitmap.getConfig())) {
                        int e11 = this.f34528a.e(bitmap);
                        this.f34528a.b(bitmap);
                        this.f34530c.d(bitmap);
                        this.f34535h++;
                        this.f34532e += e11;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f34528a.a(bitmap));
                        }
                        h();
                        j();
                        return;
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f34528a.a(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f34529b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ka.e
    public Bitmap c(int i11, int i12, Bitmap.Config config) {
        Bitmap m11 = m(i11, i12, config);
        if (m11 != null) {
            m11.eraseColor(0);
            return m11;
        }
        return g(i11, i12, config);
    }

    @Override // ka.e
    public void d() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // ka.e
    public Bitmap e(int i11, int i12, Bitmap.Config config) {
        Bitmap m11 = m(i11, i12, config);
        return m11 == null ? g(i11, i12, config) : m11;
    }

    public long n() {
        return this.f34531d;
    }

    public k(long j11) {
        this(j11, l(), k());
    }
}