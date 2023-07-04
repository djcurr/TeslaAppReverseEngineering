package t5;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import g6.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import z5.w;

/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: f  reason: collision with root package name */
    private static final Handler f51652f;

    /* renamed from: a  reason: collision with root package name */
    private final androidx.collection.h<b> f51653a;

    /* renamed from: b  reason: collision with root package name */
    private int f51654b;

    /* renamed from: c  reason: collision with root package name */
    private final w f51655c;

    /* renamed from: d  reason: collision with root package name */
    private final t5.b f51656d;

    /* renamed from: e  reason: collision with root package name */
    private final k f51657e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<Bitmap> f51658a;

        /* renamed from: b  reason: collision with root package name */
        private int f51659b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f51660c;

        public b(WeakReference<Bitmap> bitmap, int i11, boolean z11) {
            s.g(bitmap, "bitmap");
            this.f51658a = bitmap;
            this.f51659b = i11;
            this.f51660c = z11;
        }

        public final WeakReference<Bitmap> a() {
            return this.f51658a;
        }

        public final int b() {
            return this.f51659b;
        }

        public final boolean c() {
            return this.f51660c;
        }

        public final void d(int i11) {
            this.f51659b = i11;
        }

        public final void e(boolean z11) {
            this.f51660c = z11;
        }
    }

    /* loaded from: classes.dex */
    static final class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Bitmap f51662b;

        c(Bitmap bitmap) {
            this.f51662b = bitmap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.f51656d.b(this.f51662b);
        }
    }

    static {
        new a(null);
        f51652f = new Handler(Looper.getMainLooper());
    }

    public g(w weakMemoryCache, t5.b bitmapPool, k kVar) {
        s.g(weakMemoryCache, "weakMemoryCache");
        s.g(bitmapPool, "bitmapPool");
        this.f51655c = weakMemoryCache;
        this.f51656d = bitmapPool;
        this.f51657e = kVar;
        this.f51653a = new androidx.collection.h<>();
    }

    private final void f() {
        int i11 = this.f51654b;
        this.f51654b = i11 + 1;
        if (i11 >= 50) {
            e();
        }
    }

    private final b g(int i11, Bitmap bitmap) {
        b h11 = h(i11, bitmap);
        if (h11 == null) {
            b bVar = new b(new WeakReference(bitmap), 0, false);
            this.f51653a.l(i11, bVar);
            return bVar;
        }
        return h11;
    }

    private final b h(int i11, Bitmap bitmap) {
        b g11 = this.f51653a.g(i11);
        if (g11 != null) {
            if (g11.a().get() == bitmap) {
                return g11;
            }
        }
        return null;
    }

    @Override // t5.d
    public synchronized void a(Bitmap bitmap, boolean z11) {
        s.g(bitmap, "bitmap");
        int identityHashCode = System.identityHashCode(bitmap);
        if (z11) {
            if (h(identityHashCode, bitmap) == null) {
                this.f51653a.l(identityHashCode, new b(new WeakReference(bitmap), 0, true));
            }
        } else {
            g(identityHashCode, bitmap).e(false);
        }
        f();
    }

    @Override // t5.d
    public synchronized boolean b(Bitmap bitmap) {
        s.g(bitmap, "bitmap");
        int identityHashCode = System.identityHashCode(bitmap);
        b h11 = h(identityHashCode, bitmap);
        boolean z11 = false;
        if (h11 != null) {
            h11.d(h11.b() - 1);
            k kVar = this.f51657e;
            if (kVar != null && kVar.getLevel() <= 2) {
                kVar.a("RealBitmapReferenceCounter", 2, "DECREMENT: [" + identityHashCode + ", " + h11.b() + ", " + h11.c() + ']', null);
            }
            if (h11.b() <= 0 && h11.c()) {
                z11 = true;
            }
            if (z11) {
                this.f51653a.m(identityHashCode);
                this.f51655c.c(bitmap);
                f51652f.post(new c(bitmap));
            }
            f();
            return z11;
        }
        k kVar2 = this.f51657e;
        if (kVar2 != null && kVar2.getLevel() <= 2) {
            kVar2.a("RealBitmapReferenceCounter", 2, "DECREMENT: [" + identityHashCode + ", UNKNOWN, UNKNOWN]", null);
        }
        return false;
    }

    @Override // t5.d
    public synchronized void c(Bitmap bitmap) {
        s.g(bitmap, "bitmap");
        int identityHashCode = System.identityHashCode(bitmap);
        b g11 = g(identityHashCode, bitmap);
        g11.d(g11.b() + 1);
        k kVar = this.f51657e;
        if (kVar != null && kVar.getLevel() <= 2) {
            kVar.a("RealBitmapReferenceCounter", 2, "INCREMENT: [" + identityHashCode + ", " + g11.b() + ", " + g11.c() + ']', null);
        }
        f();
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        int p11 = this.f51653a.p();
        for (int i11 = 0; i11 < p11; i11++) {
            if (this.f51653a.q(i11).a().get() == null) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        androidx.collection.h<b> hVar = this.f51653a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            hVar.n(((Number) arrayList.get(i12)).intValue());
        }
    }
}