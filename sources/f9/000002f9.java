package androidx.camera.core;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.c0;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.m;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.q1;
import androidx.camera.core.impl.r0;
import androidx.camera.core.internal.utils.ImageUtil;
import androidx.camera.core.l0;
import androidx.camera.core.m;
import androidx.concurrent.futures.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes.dex */
public final class c0 extends f1 {
    public static final m H = new m();
    g1.b A;
    a1 B;
    t0 C;
    private androidx.camera.core.impl.e D;
    private DeferrableSurface E;
    private o F;
    final Executor G;

    /* renamed from: l */
    private final k f2105l;

    /* renamed from: m */
    private final r0.a f2106m;

    /* renamed from: n */
    final Executor f2107n;

    /* renamed from: o */
    private final int f2108o;

    /* renamed from: p */
    private final boolean f2109p;

    /* renamed from: q */
    private final AtomicReference<Integer> f2110q;

    /* renamed from: r */
    private int f2111r;

    /* renamed from: s */
    private Rational f2112s;

    /* renamed from: t */
    private ExecutorService f2113t;

    /* renamed from: u */
    private androidx.camera.core.impl.a0 f2114u;

    /* renamed from: v */
    private androidx.camera.core.impl.z f2115v;

    /* renamed from: w */
    private int f2116w;

    /* renamed from: x */
    private androidx.camera.core.impl.b0 f2117x;

    /* renamed from: y */
    private boolean f2118y;

    /* renamed from: z */
    private boolean f2119z;

    /* loaded from: classes.dex */
    public class a extends androidx.camera.core.impl.e {
        a(c0 c0Var) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements l0.b {

        /* renamed from: a */
        final /* synthetic */ r f2120a;

        b(c0 c0Var, r rVar) {
            this.f2120a = rVar;
        }

        @Override // androidx.camera.core.l0.b
        public void a(t tVar) {
            this.f2120a.a(tVar);
        }

        @Override // androidx.camera.core.l0.b
        public void b(l0.c cVar, String str, Throwable th2) {
            this.f2120a.b(new ImageCaptureException(i.f2132a[cVar.ordinal()] != 1 ? 0 : 1, str, th2));
        }
    }

    /* loaded from: classes.dex */
    public class c extends q {

        /* renamed from: a */
        final /* synthetic */ s f2121a;

        /* renamed from: b */
        final /* synthetic */ Executor f2122b;

        /* renamed from: c */
        final /* synthetic */ l0.b f2123c;

        /* renamed from: d */
        final /* synthetic */ r f2124d;

        c(s sVar, Executor executor, l0.b bVar, r rVar) {
            c0.this = r1;
            this.f2121a = sVar;
            this.f2122b = executor;
            this.f2123c = bVar;
            this.f2124d = rVar;
        }

        @Override // androidx.camera.core.c0.q
        public void a(g0 g0Var) {
            c0.this.f2107n.execute(new l0(g0Var, this.f2121a, g0Var.l1().c(), this.f2122b, c0.this.G, this.f2123c));
        }

        @Override // androidx.camera.core.c0.q
        public void b(ImageCaptureException imageCaptureException) {
            this.f2124d.b(imageCaptureException);
        }
    }

    /* loaded from: classes.dex */
    public class d implements c0.c<Void> {

        /* renamed from: a */
        final /* synthetic */ u f2126a;

        /* renamed from: b */
        final /* synthetic */ b.a f2127b;

        d(u uVar, b.a aVar) {
            c0.this = r1;
            this.f2126a = uVar;
            this.f2127b = aVar;
        }

        @Override // c0.c
        /* renamed from: a */
        public void onSuccess(Void r22) {
            c0.this.N0(this.f2126a);
        }

        @Override // c0.c
        public void onFailure(Throwable th2) {
            c0.this.N0(this.f2126a);
            this.f2127b.f(th2);
        }
    }

    /* loaded from: classes.dex */
    class e implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f2129a = new AtomicInteger(0);

        e(c0 c0Var) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "CameraX-image_capture_" + this.f2129a.getAndIncrement());
        }
    }

    /* loaded from: classes.dex */
    public class f implements k.b<androidx.camera.core.impl.m> {
        f(c0 c0Var) {
        }

        @Override // androidx.camera.core.c0.k.b
        /* renamed from: b */
        public androidx.camera.core.impl.m a(androidx.camera.core.impl.m mVar) {
            if (n0.g("ImageCapture")) {
                n0.a("ImageCapture", "preCaptureState, AE=" + mVar.g() + " AF =" + mVar.d() + " AWB=" + mVar.e());
            }
            return mVar;
        }
    }

    /* loaded from: classes.dex */
    public class g implements k.b<Boolean> {
        g() {
            c0.this = r1;
        }

        @Override // androidx.camera.core.c0.k.b
        /* renamed from: b */
        public Boolean a(androidx.camera.core.impl.m mVar) {
            if (n0.g("ImageCapture")) {
                n0.a("ImageCapture", "checkCaptureResult, AE=" + mVar.g() + " AF =" + mVar.d() + " AWB=" + mVar.e());
            }
            if (c0.this.o0(mVar)) {
                return Boolean.TRUE;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class h extends androidx.camera.core.impl.e {

        /* renamed from: a */
        final /* synthetic */ b.a f2131a;

        h(c0 c0Var, b.a aVar) {
            this.f2131a = aVar;
        }

        @Override // androidx.camera.core.impl.e
        public void a() {
            this.f2131a.f(new androidx.camera.core.h("Capture request is cancelled because camera is closed"));
        }

        @Override // androidx.camera.core.impl.e
        public void b(androidx.camera.core.impl.m mVar) {
            this.f2131a.c(null);
        }

        @Override // androidx.camera.core.impl.e
        public void c(androidx.camera.core.impl.g gVar) {
            this.f2131a.f(new l("Capture request failed with reason " + gVar.a()));
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class i {

        /* renamed from: a */
        static final /* synthetic */ int[] f2132a;

        static {
            int[] iArr = new int[l0.c.values().length];
            f2132a = iArr;
            try {
                iArr[l0.c.FILE_IO_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements p1.a<c0, androidx.camera.core.impl.m0, j> {

        /* renamed from: a */
        private final androidx.camera.core.impl.x0 f2133a;

        public j() {
            this(androidx.camera.core.impl.x0.I());
        }

        public static j d(androidx.camera.core.impl.d0 d0Var) {
            return new j(androidx.camera.core.impl.x0.J(d0Var));
        }

        @Override // z.q
        public androidx.camera.core.impl.w0 a() {
            return this.f2133a;
        }

        public c0 c() {
            int intValue;
            if (a().g(androidx.camera.core.impl.p0.f2348b, null) != null && a().g(androidx.camera.core.impl.p0.f2350d, null) != null) {
                throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
            }
            Integer num = (Integer) a().g(androidx.camera.core.impl.m0.f2334x, null);
            if (num != null) {
                v3.h.b(a().g(androidx.camera.core.impl.m0.f2333w, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
                a().p(androidx.camera.core.impl.o0.f2342a, num);
            } else if (a().g(androidx.camera.core.impl.m0.f2333w, null) != null) {
                a().p(androidx.camera.core.impl.o0.f2342a, 35);
            } else {
                a().p(androidx.camera.core.impl.o0.f2342a, 256);
            }
            c0 c0Var = new c0(b());
            Size size = (Size) a().g(androidx.camera.core.impl.p0.f2350d, null);
            if (size != null) {
                c0Var.Q0(new Rational(size.getWidth(), size.getHeight()));
            }
            v3.h.b(((Integer) a().g(androidx.camera.core.impl.m0.f2335y, 2)).intValue() >= 1, "Maximum outstanding image count must be at least 1");
            v3.h.g((Executor) a().g(d0.d.f23251n, b0.a.c()), "The IO executor can't be null");
            androidx.camera.core.impl.w0 a11 = a();
            d0.a<Integer> aVar = androidx.camera.core.impl.m0.f2331u;
            if (!a11.b(aVar) || (intValue = ((Integer) a().a(aVar)).intValue()) == 0 || intValue == 1 || intValue == 2) {
                return c0Var;
            }
            throw new IllegalArgumentException("The flash mode is not allowed to set: " + intValue);
        }

        @Override // androidx.camera.core.impl.p1.a
        /* renamed from: e */
        public androidx.camera.core.impl.m0 b() {
            return new androidx.camera.core.impl.m0(androidx.camera.core.impl.b1.G(this.f2133a));
        }

        public j f(int i11) {
            a().p(androidx.camera.core.impl.m0.f2330t, Integer.valueOf(i11));
            return this;
        }

        public j g(int i11) {
            a().p(p1.f2358l, Integer.valueOf(i11));
            return this;
        }

        public j h(int i11) {
            a().p(androidx.camera.core.impl.p0.f2348b, Integer.valueOf(i11));
            return this;
        }

        public j i(Class<c0> cls) {
            a().p(d0.e.f23253p, cls);
            if (a().g(d0.e.f23252o, null) == null) {
                j(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public j j(String str) {
            a().p(d0.e.f23252o, str);
            return this;
        }

        public j k(int i11) {
            a().p(androidx.camera.core.impl.p0.f2349c, Integer.valueOf(i11));
            return this;
        }

        private j(androidx.camera.core.impl.x0 x0Var) {
            this.f2133a = x0Var;
            Class cls = (Class) x0Var.g(d0.e.f23253p, null);
            if (cls != null && !cls.equals(c0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            i(c0.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends androidx.camera.core.impl.e {

        /* renamed from: a */
        private final Set<c> f2134a = new HashSet();

        /* loaded from: classes.dex */
        public class a implements c {

            /* renamed from: a */
            final /* synthetic */ b f2135a;

            /* renamed from: b */
            final /* synthetic */ b.a f2136b;

            /* renamed from: c */
            final /* synthetic */ long f2137c;

            /* renamed from: d */
            final /* synthetic */ long f2138d;

            /* renamed from: e */
            final /* synthetic */ Object f2139e;

            a(k kVar, b bVar, b.a aVar, long j11, long j12, Object obj) {
                this.f2135a = bVar;
                this.f2136b = aVar;
                this.f2137c = j11;
                this.f2138d = j12;
                this.f2139e = obj;
            }

            @Override // androidx.camera.core.c0.k.c
            public boolean a(androidx.camera.core.impl.m mVar) {
                Object a11 = this.f2135a.a(mVar);
                if (a11 != null) {
                    this.f2136b.c(a11);
                    return true;
                } else if (this.f2137c <= 0 || SystemClock.elapsedRealtime() - this.f2137c <= this.f2138d) {
                    return false;
                } else {
                    this.f2136b.c(this.f2139e);
                    return true;
                }
            }
        }

        /* loaded from: classes.dex */
        public interface b<T> {
            T a(androidx.camera.core.impl.m mVar);
        }

        /* loaded from: classes.dex */
        public interface c {
            boolean a(androidx.camera.core.impl.m mVar);
        }

        k() {
        }

        public static /* synthetic */ Object d(k kVar, b bVar, long j11, long j12, Object obj, b.a aVar) {
            return kVar.i(bVar, j11, j12, obj, aVar);
        }

        private void h(androidx.camera.core.impl.m mVar) {
            synchronized (this.f2134a) {
                HashSet hashSet = null;
                Iterator it2 = new HashSet(this.f2134a).iterator();
                while (it2.hasNext()) {
                    c cVar = (c) it2.next();
                    if (cVar.a(mVar)) {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(cVar);
                    }
                }
                if (hashSet != null) {
                    this.f2134a.removeAll(hashSet);
                }
            }
        }

        public /* synthetic */ Object i(b bVar, long j11, long j12, Object obj, b.a aVar) {
            e(new a(this, bVar, aVar, j11, j12, obj));
            return "checkCaptureResult";
        }

        @Override // androidx.camera.core.impl.e
        public void b(androidx.camera.core.impl.m mVar) {
            h(mVar);
        }

        void e(c cVar) {
            synchronized (this.f2134a) {
                this.f2134a.add(cVar);
            }
        }

        <T> com.google.common.util.concurrent.c<T> f(b<T> bVar) {
            return g(bVar, 0L, null);
        }

        <T> com.google.common.util.concurrent.c<T> g(final b<T> bVar, final long j11, final T t11) {
            int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i11 >= 0) {
                final long elapsedRealtime = i11 != 0 ? SystemClock.elapsedRealtime() : 0L;
                return androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.core.d0
                    {
                        c0.k.this = this;
                    }

                    @Override // androidx.concurrent.futures.b.c
                    public final Object a(b.a aVar) {
                        return c0.k.d(c0.k.this, bVar, elapsedRealtime, j11, t11, aVar);
                    }
                });
            }
            throw new IllegalArgumentException("Invalid timeout value: " + j11);
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends RuntimeException {
        l(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class m {

        /* renamed from: a */
        private static final androidx.camera.core.impl.m0 f2140a = new j().g(4).h(0).b();

        public androidx.camera.core.impl.m0 a() {
            return f2140a;
        }
    }

    /* loaded from: classes.dex */
    public static class n {

        /* renamed from: a */
        final int f2141a;

        /* renamed from: b */
        final int f2142b;

        /* renamed from: c */
        private final Rational f2143c;

        /* renamed from: d */
        private final Executor f2144d;

        /* renamed from: e */
        private final q f2145e;

        /* renamed from: f */
        AtomicBoolean f2146f = new AtomicBoolean(false);

        /* renamed from: g */
        private final Rect f2147g;

        n(int i11, int i12, Rational rational, Rect rect, Executor executor, q qVar) {
            this.f2141a = i11;
            this.f2142b = i12;
            if (rational != null) {
                v3.h.b(!rational.isZero(), "Target ratio cannot be zero");
                v3.h.b(rational.floatValue() > BitmapDescriptorFactory.HUE_RED, "Target ratio must be positive");
            }
            this.f2143c = rational;
            this.f2147g = rect;
            this.f2144d = executor;
            this.f2145e = qVar;
        }

        public static /* synthetic */ void a(n nVar, int i11, String str, Throwable th2) {
            nVar.f(i11, str, th2);
        }

        public static /* synthetic */ void b(n nVar, g0 g0Var) {
            nVar.e(g0Var);
        }

        static Rect d(Rect rect, int i11, Size size, int i12) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i12 - i11);
            float[] m11 = ImageUtil.m(size);
            matrix.mapPoints(m11);
            matrix.postTranslate(-ImageUtil.j(m11[0], m11[2], m11[4], m11[6]), -ImageUtil.j(m11[1], m11[3], m11[5], m11[7]));
            matrix.invert(matrix);
            RectF rectF = new RectF();
            matrix.mapRect(rectF, new RectF(rect));
            rectF.sort();
            Rect rect2 = new Rect();
            rectF.round(rect2);
            return rect2;
        }

        public /* synthetic */ void e(g0 g0Var) {
            this.f2145e.a(g0Var);
        }

        public /* synthetic */ void f(int i11, String str, Throwable th2) {
            this.f2145e.b(new ImageCaptureException(i11, str, th2));
        }

        void c(g0 g0Var) {
            Size size;
            int q11;
            if (!this.f2146f.compareAndSet(false, true)) {
                g0Var.close();
                return;
            }
            if (new g0.a().b(g0Var)) {
                try {
                    ByteBuffer b11 = g0Var.x0()[0].b();
                    b11.rewind();
                    byte[] bArr = new byte[b11.capacity()];
                    b11.get(bArr);
                    a0.c j11 = a0.c.j(new ByteArrayInputStream(bArr));
                    b11.rewind();
                    size = new Size(j11.s(), j11.n());
                    q11 = j11.q();
                } catch (IOException e11) {
                    g(1, "Unable to parse JPEG exif", e11);
                    g0Var.close();
                    return;
                }
            } else {
                size = new Size(g0Var.getWidth(), g0Var.getHeight());
                q11 = this.f2141a;
            }
            final b1 b1Var = new b1(g0Var, size, m0.d(g0Var.l1().a(), g0Var.l1().getTimestamp(), q11));
            Rect rect = this.f2147g;
            if (rect != null) {
                b1Var.c0(d(rect, this.f2141a, size, q11));
            } else {
                Rational rational = this.f2143c;
                if (rational != null) {
                    if (q11 % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 != 0) {
                        rational = new Rational(this.f2143c.getDenominator(), this.f2143c.getNumerator());
                    }
                    Size size2 = new Size(b1Var.getWidth(), b1Var.getHeight());
                    if (ImageUtil.g(size2, rational)) {
                        b1Var.c0(ImageUtil.a(size2, rational));
                    }
                }
            }
            try {
                this.f2144d.execute(new Runnable() { // from class: androidx.camera.core.f0
                    {
                        c0.n.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        c0.n.b(c0.n.this, b1Var);
                    }
                });
            } catch (RejectedExecutionException unused) {
                n0.c("ImageCapture", "Unable to post to the supplied executor.");
                g0Var.close();
            }
        }

        void g(final int i11, final String str, final Throwable th2) {
            if (this.f2146f.compareAndSet(false, true)) {
                try {
                    this.f2144d.execute(new Runnable() { // from class: androidx.camera.core.e0
                        {
                            c0.n.this = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            c0.n.a(c0.n.this, i11, str, th2);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                    n0.c("ImageCapture", "Unable to post to the supplied executor.");
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class o implements m.a {

        /* renamed from: e */
        private final b f2152e;

        /* renamed from: f */
        private final int f2153f;

        /* renamed from: a */
        private final Deque<n> f2148a = new ArrayDeque();

        /* renamed from: b */
        n f2149b = null;

        /* renamed from: c */
        com.google.common.util.concurrent.c<g0> f2150c = null;

        /* renamed from: d */
        int f2151d = 0;

        /* renamed from: g */
        final Object f2154g = new Object();

        /* loaded from: classes.dex */
        public class a implements c0.c<g0> {

            /* renamed from: a */
            final /* synthetic */ n f2155a;

            a(n nVar) {
                o.this = r1;
                this.f2155a = nVar;
            }

            @Override // c0.c
            /* renamed from: a */
            public void onSuccess(g0 g0Var) {
                synchronized (o.this.f2154g) {
                    v3.h.f(g0Var);
                    d1 d1Var = new d1(g0Var);
                    d1Var.a(o.this);
                    o.this.f2151d++;
                    this.f2155a.c(d1Var);
                    o oVar = o.this;
                    oVar.f2149b = null;
                    oVar.f2150c = null;
                    oVar.c();
                }
            }

            @Override // c0.c
            public void onFailure(Throwable th2) {
                synchronized (o.this.f2154g) {
                    if (!(th2 instanceof CancellationException)) {
                        this.f2155a.g(c0.k0(th2), th2 != null ? th2.getMessage() : "Unknown error", th2);
                    }
                    o oVar = o.this;
                    oVar.f2149b = null;
                    oVar.f2150c = null;
                    oVar.c();
                }
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            com.google.common.util.concurrent.c<g0> a(n nVar);
        }

        o(int i11, b bVar) {
            this.f2153f = i11;
            this.f2152e = bVar;
        }

        @Override // androidx.camera.core.m.a
        public void a(g0 g0Var) {
            synchronized (this.f2154g) {
                this.f2151d--;
                c();
            }
        }

        public void b(Throwable th2) {
            n nVar;
            com.google.common.util.concurrent.c<g0> cVar;
            ArrayList<n> arrayList;
            synchronized (this.f2154g) {
                nVar = this.f2149b;
                this.f2149b = null;
                cVar = this.f2150c;
                this.f2150c = null;
                arrayList = new ArrayList(this.f2148a);
                this.f2148a.clear();
            }
            if (nVar != null && cVar != null) {
                nVar.g(c0.k0(th2), th2.getMessage(), th2);
                cVar.cancel(true);
            }
            for (n nVar2 : arrayList) {
                nVar2.g(c0.k0(th2), th2.getMessage(), th2);
            }
        }

        void c() {
            synchronized (this.f2154g) {
                if (this.f2149b != null) {
                    return;
                }
                if (this.f2151d >= this.f2153f) {
                    n0.m("ImageCapture", "Too many acquire images. Close image to be able to process next.");
                    return;
                }
                n poll = this.f2148a.poll();
                if (poll == null) {
                    return;
                }
                this.f2149b = poll;
                com.google.common.util.concurrent.c<g0> a11 = this.f2152e.a(poll);
                this.f2150c = a11;
                c0.f.b(a11, new a(poll), b0.a.a());
            }
        }

        public void d(n nVar) {
            synchronized (this.f2154g) {
                this.f2148a.offer(nVar);
                Locale locale = Locale.US;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(this.f2149b != null ? 1 : 0);
                objArr[1] = Integer.valueOf(this.f2148a.size());
                n0.a("ImageCapture", String.format(locale, "Send image capture request [current, pending] = [%d, %d]", objArr));
                c();
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class p {

        /* renamed from: a */
        private boolean f2157a;

        /* renamed from: b */
        private boolean f2158b;

        /* renamed from: c */
        private Location f2159c;

        public Location a() {
            return this.f2159c;
        }

        public boolean b() {
            return this.f2157a;
        }

        public boolean c() {
            return this.f2158b;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class q {
        public abstract void a(g0 g0Var);

        public abstract void b(ImageCaptureException imageCaptureException);
    }

    /* loaded from: classes.dex */
    public interface r {
        void a(t tVar);

        void b(ImageCaptureException imageCaptureException);
    }

    /* loaded from: classes.dex */
    public static final class s {

        /* renamed from: a */
        private final File f2160a;

        /* renamed from: b */
        private final ContentResolver f2161b;

        /* renamed from: c */
        private final Uri f2162c;

        /* renamed from: d */
        private final ContentValues f2163d;

        /* renamed from: e */
        private final OutputStream f2164e;

        /* renamed from: f */
        private final p f2165f;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            private File f2166a;

            /* renamed from: b */
            private ContentResolver f2167b;

            /* renamed from: c */
            private Uri f2168c;

            /* renamed from: d */
            private ContentValues f2169d;

            /* renamed from: e */
            private OutputStream f2170e;

            /* renamed from: f */
            private p f2171f;

            public a(File file) {
                this.f2166a = file;
            }

            public s a() {
                return new s(this.f2166a, this.f2167b, this.f2168c, this.f2169d, this.f2170e, this.f2171f);
            }
        }

        s(File file, ContentResolver contentResolver, Uri uri, ContentValues contentValues, OutputStream outputStream, p pVar) {
            this.f2160a = file;
            this.f2161b = contentResolver;
            this.f2162c = uri;
            this.f2163d = contentValues;
            this.f2164e = outputStream;
            this.f2165f = pVar == null ? new p() : pVar;
        }

        public ContentResolver a() {
            return this.f2161b;
        }

        public ContentValues b() {
            return this.f2163d;
        }

        public File c() {
            return this.f2160a;
        }

        public p d() {
            return this.f2165f;
        }

        public OutputStream e() {
            return this.f2164e;
        }

        public Uri f() {
            return this.f2162c;
        }
    }

    /* loaded from: classes.dex */
    public static class t {
        public t(Uri uri) {
        }
    }

    /* loaded from: classes.dex */
    public static final class u {

        /* renamed from: a */
        androidx.camera.core.impl.m f2172a = m.a.h();

        /* renamed from: b */
        boolean f2173b = false;

        /* renamed from: c */
        boolean f2174c = false;

        /* renamed from: d */
        boolean f2175d = false;

        u() {
        }
    }

    c0(androidx.camera.core.impl.m0 m0Var) {
        super(m0Var);
        this.f2105l = new k();
        this.f2106m = new r0.a() { // from class: z.a0
            @Override // androidx.camera.core.impl.r0.a
            public final void a(androidx.camera.core.impl.r0 r0Var) {
                androidx.camera.core.c0.X(r0Var);
            }
        };
        this.f2110q = new AtomicReference<>(null);
        this.f2111r = -1;
        this.f2112s = null;
        this.f2118y = false;
        this.f2119z = false;
        androidx.camera.core.impl.m0 m0Var2 = (androidx.camera.core.impl.m0) f();
        if (m0Var2.b(androidx.camera.core.impl.m0.f2330t)) {
            this.f2108o = m0Var2.F();
        } else {
            this.f2108o = 1;
        }
        Executor executor = (Executor) v3.h.f(m0Var2.J(b0.a.c()));
        this.f2107n = executor;
        this.G = b0.a.f(executor);
        if (this.f2108o == 0) {
            this.f2109p = true;
        } else {
            this.f2109p = false;
        }
    }

    public /* synthetic */ com.google.common.util.concurrent.c A0(u uVar, androidx.camera.core.impl.m mVar) {
        uVar.f2172a = mVar;
        V0(uVar);
        if (p0(uVar)) {
            if (this.f2119z) {
                return M0(uVar);
            }
            return T0(uVar);
        }
        return c0.f.h(null);
    }

    public /* synthetic */ com.google.common.util.concurrent.c B0(u uVar, Void r22) {
        return e0(uVar);
    }

    public static /* synthetic */ Void C0(Boolean bool) {
        return null;
    }

    public /* synthetic */ void D0(q qVar) {
        qVar.b(new ImageCaptureException(4, "Not bound to a valid Camera [" + this + "]", null));
    }

    public /* synthetic */ Object F0(final n nVar, final b.a aVar) {
        this.B.e(new r0.a() { // from class: z.v
            @Override // androidx.camera.core.impl.r0.a
            public final void a(androidx.camera.core.impl.r0 r0Var) {
                androidx.camera.core.c0.U(aVar, r0Var);
            }
        }, b0.a.d());
        u uVar = new u();
        final c0.d f11 = c0.d.b(O0(uVar)).f(new c0.a() { // from class: androidx.camera.core.z
            {
                c0.this = this;
            }

            @Override // c0.a
            public final com.google.common.util.concurrent.c apply(Object obj) {
                return c0.M(c0.this, nVar, (Void) obj);
            }
        }, this.f2113t);
        c0.f.b(f11, new d(uVar, aVar), this.f2113t);
        aVar.a(new Runnable() { // from class: z.g0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.c0.O(f11);
            }
        }, b0.a.a());
        return "takePictureInternal";
    }

    public static /* synthetic */ void G0(b.a aVar, androidx.camera.core.impl.r0 r0Var) {
        try {
            g0 b11 = r0Var.b();
            if (b11 != null) {
                if (!aVar.c(b11)) {
                    b11.close();
                }
            } else {
                aVar.f(new IllegalStateException("Unable to acquire image"));
            }
        } catch (IllegalStateException e11) {
            aVar.f(e11);
        }
    }

    public /* synthetic */ com.google.common.util.concurrent.c H0(n nVar, Void r22) {
        return q0(nVar);
    }

    public static /* synthetic */ Object I(c0 c0Var, u uVar, b.a aVar) {
        return c0Var.z0(uVar, aVar);
    }

    public static /* synthetic */ com.google.common.util.concurrent.c J(c0 c0Var, n nVar) {
        return c0Var.t0(nVar);
    }

    public static /* synthetic */ Void J0(androidx.camera.core.impl.m mVar) {
        return null;
    }

    public static /* synthetic */ void K(d0.i iVar) {
        s0(iVar);
    }

    public static /* synthetic */ void K0() {
    }

    public static /* synthetic */ void L() {
        r0();
    }

    private void L0() {
        synchronized (this.f2110q) {
            if (this.f2110q.get() != null) {
                return;
            }
            this.f2110q.set(Integer.valueOf(l0()));
        }
    }

    public static /* synthetic */ com.google.common.util.concurrent.c M(c0 c0Var, n nVar, Void r22) {
        return c0Var.H0(nVar, r22);
    }

    private com.google.common.util.concurrent.c<Void> M0(final u uVar) {
        androidx.camera.core.impl.s c11 = c();
        if (c11 != null && c11.b().f().getValue().intValue() == 1) {
            return c0.f.h(null);
        }
        n0.a("ImageCapture", "openTorch");
        return androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.core.y
            {
                c0.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return c0.I(c0.this, uVar, aVar);
            }
        });
    }

    public static /* synthetic */ void N(c0 c0Var, q qVar) {
        c0Var.D0(qVar);
    }

    public static /* synthetic */ void O(com.google.common.util.concurrent.c cVar) {
        cVar.cancel(true);
    }

    private com.google.common.util.concurrent.c<Void> O0(final u uVar) {
        L0();
        return c0.d.b(n0()).f(new c0.a() { // from class: androidx.camera.core.a0
            @Override // c0.a
            public final com.google.common.util.concurrent.c apply(Object obj) {
                return c0.W(c0.this, uVar, (androidx.camera.core.impl.m) obj);
            }
        }, this.f2113t).f(new c0.a() { // from class: androidx.camera.core.b0
            {
                c0.this = this;
            }

            @Override // c0.a
            public final com.google.common.util.concurrent.c apply(Object obj) {
                return c0.a0(c0.this, uVar, (Void) obj);
            }
        }, this.f2113t).e(new p.a() { // from class: z.y
            @Override // p.a
            public final Object apply(Object obj) {
                return androidx.camera.core.c0.T((Boolean) obj);
            }
        }, this.f2113t);
    }

    private void P0(Executor executor, final q qVar) {
        androidx.camera.core.impl.s c11 = c();
        if (c11 == null) {
            executor.execute(new Runnable() { // from class: z.d0
                {
                    androidx.camera.core.c0.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.c0.N(androidx.camera.core.c0.this, qVar);
                }
            });
        } else {
            this.F.d(new n(j(c11), m0(), this.f2112s, n(), executor, qVar));
        }
    }

    public static /* synthetic */ void Q(b.a aVar) {
        aVar.c(null);
    }

    public static /* synthetic */ void R(c0 c0Var, s sVar, Executor executor, r rVar) {
        c0Var.E0(sVar, executor, rVar);
    }

    public static /* synthetic */ Object S(c0 c0Var, a0.a aVar, List list, androidx.camera.core.impl.c0 c0Var2, b.a aVar2) {
        return c0Var.v0(aVar, list, c0Var2, aVar2);
    }

    /* renamed from: S0 */
    public com.google.common.util.concurrent.c<g0> t0(final n nVar) {
        return androidx.concurrent.futures.b.a(new b.c() { // from class: androidx.camera.core.x
            {
                c0.this = this;
            }

            @Override // androidx.concurrent.futures.b.c
            public final Object a(b.a aVar) {
                return c0.V(c0.this, nVar, aVar);
            }
        });
    }

    public static /* synthetic */ Void T(Boolean bool) {
        return C0(bool);
    }

    public static /* synthetic */ void U(b.a aVar, androidx.camera.core.impl.r0 r0Var) {
        G0(aVar, r0Var);
    }

    private void U0(u uVar) {
        n0.a("ImageCapture", "triggerAf");
        uVar.f2174c = true;
        d().g().a(new Runnable() { // from class: z.w
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.c0.Y();
            }
        }, b0.a.a());
    }

    public static /* synthetic */ Object V(c0 c0Var, n nVar, b.a aVar) {
        return c0Var.F0(nVar, aVar);
    }

    public static /* synthetic */ com.google.common.util.concurrent.c W(c0 c0Var, u uVar, androidx.camera.core.impl.m mVar) {
        return c0Var.A0(uVar, mVar);
    }

    private void W0() {
        synchronized (this.f2110q) {
            if (this.f2110q.get() != null) {
                return;
            }
            d().c(l0());
        }
    }

    public static /* synthetic */ void X(androidx.camera.core.impl.r0 r0Var) {
        x0(r0Var);
    }

    private void X0() {
        synchronized (this.f2110q) {
            Integer andSet = this.f2110q.getAndSet(null);
            if (andSet == null) {
                return;
            }
            if (andSet.intValue() != l0()) {
                W0();
            }
        }
    }

    public static /* synthetic */ void Y() {
        K0();
    }

    public static /* synthetic */ Void Z(List list) {
        return w0(list);
    }

    public static /* synthetic */ com.google.common.util.concurrent.c a0(c0 c0Var, u uVar, Void r22) {
        return c0Var.B0(uVar, r22);
    }

    public static /* synthetic */ Void b0(androidx.camera.core.impl.m mVar) {
        return J0(mVar);
    }

    private void c0() {
        this.F.b(new androidx.camera.core.h("Camera is closed."));
    }

    private void g0(u uVar) {
        if (uVar.f2173b) {
            CameraControlInternal d11 = d();
            uVar.f2173b = false;
            d11.d(false).a(new Runnable() { // from class: z.i0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.c0.L();
                }
            }, b0.a.a());
        }
    }

    static boolean i0(androidx.camera.core.impl.w0 w0Var) {
        d0.a<Boolean> aVar = androidx.camera.core.impl.m0.A;
        Boolean bool = Boolean.FALSE;
        boolean z11 = false;
        if (((Boolean) w0Var.g(aVar, bool)).booleanValue()) {
            boolean z12 = true;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 26) {
                n0.m("ImageCapture", "Software JPEG only supported on API 26+, but current API level is " + i11);
                z12 = false;
            }
            Integer num = (Integer) w0Var.g(androidx.camera.core.impl.m0.f2334x, null);
            if (num != null && num.intValue() != 256) {
                n0.m("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                z12 = false;
            }
            if (w0Var.g(androidx.camera.core.impl.m0.f2333w, null) != null) {
                n0.m("ImageCapture", "CaptureProcessor is set, unable to use software JPEG.");
            } else {
                z11 = z12;
            }
            if (!z11) {
                n0.m("ImageCapture", "Unable to support software JPEG. Disabling.");
                w0Var.p(aVar, bool);
            }
        }
        return z11;
    }

    private androidx.camera.core.impl.z j0(androidx.camera.core.impl.z zVar) {
        List<androidx.camera.core.impl.c0> a11 = this.f2115v.a();
        return (a11 == null || a11.isEmpty()) ? zVar : androidx.camera.core.l.a(a11);
    }

    static int k0(Throwable th2) {
        if (th2 instanceof androidx.camera.core.h) {
            return 3;
        }
        return th2 instanceof l ? 2 : 0;
    }

    private int m0() {
        int i11 = this.f2108o;
        if (i11 != 0) {
            if (i11 == 1) {
                return 95;
            }
            throw new IllegalStateException("CaptureMode " + this.f2108o + " is invalid");
        }
        return 100;
    }

    private com.google.common.util.concurrent.c<androidx.camera.core.impl.m> n0() {
        if (!this.f2109p && l0() != 0) {
            return c0.f.h(null);
        }
        return this.f2105l.f(new f(this));
    }

    public static /* synthetic */ void r0() {
    }

    public static /* synthetic */ void s0(d0.i iVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            iVar.d();
        }
    }

    public /* synthetic */ void u0(String str, androidx.camera.core.impl.m0 m0Var, Size size, g1 g1Var, g1.e eVar) {
        f0();
        if (o(str)) {
            g1.b h02 = h0(str, m0Var, size);
            this.A = h02;
            G(h02.m());
            s();
        }
    }

    public /* synthetic */ Object v0(a0.a aVar, List list, androidx.camera.core.impl.c0 c0Var, b.a aVar2) {
        aVar.c(new h(this, aVar2));
        list.add(aVar.h());
        return "issueTakePicture[stage=" + c0Var.getId() + "]";
    }

    public static /* synthetic */ Void w0(List list) {
        return null;
    }

    public static /* synthetic */ void x0(androidx.camera.core.impl.r0 r0Var) {
        try {
            g0 b11 = r0Var.b();
            Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + b11);
            if (b11 != null) {
                b11.close();
            }
        } catch (IllegalStateException e11) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e11);
        }
    }

    public /* synthetic */ Object z0(u uVar, final b.a aVar) {
        CameraControlInternal d11 = d();
        uVar.f2173b = true;
        d11.d(true).a(new Runnable() { // from class: z.f0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.c0.Q(aVar);
            }
        }, b0.a.a());
        return "openTorch";
    }

    /* JADX WARN: Type inference failed for: r8v12, types: [androidx.camera.core.impl.p1<?>, androidx.camera.core.impl.p1] */
    @Override // androidx.camera.core.f1
    p1<?> A(androidx.camera.core.impl.r rVar, p1.a<?, ?, ?> aVar) {
        if (rVar.d().a(f0.e.class)) {
            androidx.camera.core.impl.w0 a11 = aVar.a();
            d0.a<Boolean> aVar2 = androidx.camera.core.impl.m0.A;
            Boolean bool = Boolean.TRUE;
            if (!((Boolean) a11.g(aVar2, bool)).booleanValue()) {
                n0.m("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                n0.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                aVar.a().p(aVar2, bool);
            }
        }
        boolean i02 = i0(aVar.a());
        Integer num = (Integer) aVar.a().g(androidx.camera.core.impl.m0.f2334x, null);
        if (num != null) {
            v3.h.b(aVar.a().g(androidx.camera.core.impl.m0.f2333w, null) == null, "Cannot set buffer format with CaptureProcessor defined.");
            aVar.a().p(androidx.camera.core.impl.o0.f2342a, Integer.valueOf(i02 ? 35 : num.intValue()));
        } else if (aVar.a().g(androidx.camera.core.impl.m0.f2333w, null) == null && !i02) {
            aVar.a().p(androidx.camera.core.impl.o0.f2342a, 256);
        } else {
            aVar.a().p(androidx.camera.core.impl.o0.f2342a, 35);
        }
        v3.h.b(((Integer) aVar.a().g(androidx.camera.core.impl.m0.f2335y, 2)).intValue() >= 1, "Maximum outstanding image count must be at least 1");
        return aVar.b();
    }

    @Override // androidx.camera.core.f1
    public void C() {
        c0();
    }

    @Override // androidx.camera.core.f1
    protected Size D(Size size) {
        g1.b h02 = h0(e(), (androidx.camera.core.impl.m0) f(), size);
        this.A = h02;
        G(h02.m());
        q();
        return size;
    }

    void N0(u uVar) {
        g0(uVar);
        d0(uVar);
        X0();
    }

    public void Q0(Rational rational) {
        this.f2112s = rational;
    }

    /* renamed from: R0 */
    public void E0(final s sVar, final Executor executor, final r rVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            b0.a.d().execute(new Runnable() { // from class: z.e0
                {
                    androidx.camera.core.c0.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.c0.R(androidx.camera.core.c0.this, sVar, executor, rVar);
                }
            });
            return;
        }
        P0(b0.a.d(), new c(sVar, executor, new b(this, rVar), rVar));
    }

    com.google.common.util.concurrent.c<Void> T0(u uVar) {
        n0.a("ImageCapture", "triggerAePrecapture");
        uVar.f2175d = true;
        return c0.f.o(d().a(), new p.a() { // from class: z.x
            @Override // p.a
            public final Object apply(Object obj) {
                return androidx.camera.core.c0.b0((androidx.camera.core.impl.m) obj);
            }
        }, b0.a.a());
    }

    void V0(u uVar) {
        if (this.f2109p && uVar.f2172a.f() == androidx.camera.core.impl.i.ON_MANUAL_AUTO && uVar.f2172a.d() == androidx.camera.core.impl.j.INACTIVE) {
            U0(uVar);
        }
    }

    void d0(u uVar) {
        if (uVar.f2174c || uVar.f2175d) {
            d().h(uVar.f2174c, uVar.f2175d);
            uVar.f2174c = false;
            uVar.f2175d = false;
        }
    }

    com.google.common.util.concurrent.c<Boolean> e0(u uVar) {
        if (!this.f2109p && !uVar.f2175d && !uVar.f2173b) {
            return c0.f.h(Boolean.FALSE);
        }
        long j11 = 1000;
        return this.f2105l.g(new g(), (uVar.f2175d || uVar.f2173b) ? 5000L : 5000L, Boolean.FALSE);
    }

    void f0() {
        a0.j.a();
        DeferrableSurface deferrableSurface = this.E;
        this.E = null;
        this.B = null;
        this.C = null;
        if (deferrableSurface != null) {
            deferrableSurface.c();
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.camera.core.impl.p1<?>, androidx.camera.core.impl.p1] */
    @Override // androidx.camera.core.f1
    public p1<?> g(boolean z11, q1 q1Var) {
        androidx.camera.core.impl.d0 a11 = q1Var.a(q1.a.IMAGE_CAPTURE);
        if (z11) {
            a11 = androidx.camera.core.impl.d0.A(a11, H.a());
        }
        if (a11 == null) {
            return null;
        }
        return m(a11).b();
    }

    g1.b h0(final String str, final androidx.camera.core.impl.m0 m0Var, final Size size) {
        d0.i iVar;
        int i11;
        a0.j.a();
        g1.b n11 = g1.b.n(m0Var);
        n11.i(this.f2105l);
        if (m0Var.I() != null) {
            this.B = new a1(m0Var.I().a(size.getWidth(), size.getHeight(), h(), 2, 0L));
            this.D = new a(this);
        } else {
            androidx.camera.core.impl.b0 b0Var = this.f2117x;
            if (b0Var == null && !this.f2118y) {
                q0 q0Var = new q0(size.getWidth(), size.getHeight(), h(), 2);
                this.D = q0Var.l();
                this.B = new a1(q0Var);
            } else {
                final d0.i iVar2 = null;
                int h11 = h();
                int h12 = h();
                if (this.f2118y) {
                    v3.h.i(this.f2117x == null, "CaptureProcessor should not be set if software JPEG is to be used.");
                    if (Build.VERSION.SDK_INT >= 26) {
                        n0.e("ImageCapture", "Using software JPEG encoder.");
                        iVar = new d0.i(m0(), this.f2116w);
                        i11 = 256;
                        iVar2 = iVar;
                    } else {
                        throw new IllegalStateException("Software JPEG only supported on API 26+");
                    }
                } else {
                    iVar = b0Var;
                    i11 = h12;
                }
                t0 t0Var = new t0(size.getWidth(), size.getHeight(), h11, this.f2116w, this.f2113t, j0(androidx.camera.core.l.c()), iVar, i11);
                this.C = t0Var;
                this.D = t0Var.g();
                this.B = new a1(this.C);
                if (iVar2 != null) {
                    this.C.h().a(new Runnable() { // from class: z.h0
                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.c0.K(d0.i.this);
                        }
                    }, b0.a.a());
                }
            }
        }
        this.F = new o(2, new o.b() { // from class: androidx.camera.core.w
            {
                c0.this = this;
            }

            @Override // androidx.camera.core.c0.o.b
            public final com.google.common.util.concurrent.c a(c0.n nVar) {
                return c0.J(c0.this, nVar);
            }
        });
        this.B.e(this.f2106m, b0.a.d());
        a1 a1Var = this.B;
        DeferrableSurface deferrableSurface = this.E;
        if (deferrableSurface != null) {
            deferrableSurface.c();
        }
        androidx.camera.core.impl.s0 s0Var = new androidx.camera.core.impl.s0(this.B.getSurface());
        this.E = s0Var;
        com.google.common.util.concurrent.c<Void> f11 = s0Var.f();
        Objects.requireNonNull(a1Var);
        f11.a(new androidx.camera.core.n(a1Var), b0.a.d());
        n11.h(this.E);
        n11.f(new g1.c() { // from class: z.b0
            @Override // androidx.camera.core.impl.g1.c
            public final void a(g1 g1Var, g1.e eVar) {
                androidx.camera.core.c0.this.u0(str, m0Var, size, g1Var, eVar);
            }
        });
        return n11;
    }

    public int l0() {
        int i11;
        synchronized (this.f2110q) {
            i11 = this.f2111r;
            if (i11 == -1) {
                i11 = ((androidx.camera.core.impl.m0) f()).H(2);
            }
        }
        return i11;
    }

    @Override // androidx.camera.core.f1
    public p1.a<?, ?, ?> m(androidx.camera.core.impl.d0 d0Var) {
        return j.d(d0Var);
    }

    boolean o0(androidx.camera.core.impl.m mVar) {
        if (mVar == null) {
            return false;
        }
        return (mVar.f() == androidx.camera.core.impl.i.OFF || mVar.f() == androidx.camera.core.impl.i.UNKNOWN || mVar.d() == androidx.camera.core.impl.j.PASSIVE_FOCUSED || mVar.d() == androidx.camera.core.impl.j.PASSIVE_NOT_FOCUSED || mVar.d() == androidx.camera.core.impl.j.LOCKED_FOCUSED || mVar.d() == androidx.camera.core.impl.j.LOCKED_NOT_FOCUSED) && (mVar.g() == androidx.camera.core.impl.h.CONVERGED || mVar.g() == androidx.camera.core.impl.h.FLASH_REQUIRED || mVar.g() == androidx.camera.core.impl.h.UNKNOWN) && (mVar.e() == androidx.camera.core.impl.k.CONVERGED || mVar.e() == androidx.camera.core.impl.k.UNKNOWN);
    }

    boolean p0(u uVar) {
        int l02 = l0();
        if (l02 == 0) {
            return uVar.f2172a.g() == androidx.camera.core.impl.h.FLASH_REQUIRED;
        } else if (l02 != 1) {
            if (l02 == 2) {
                return false;
            }
            throw new AssertionError(l0());
        } else {
            return true;
        }
    }

    com.google.common.util.concurrent.c<Void> q0(n nVar) {
        androidx.camera.core.impl.z j02;
        n0.a("ImageCapture", "issueTakePicture");
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        String str = null;
        if (this.C != null) {
            if (this.f2118y) {
                j02 = j0(androidx.camera.core.l.c());
                if (j02.a().size() > 1) {
                    return c0.f.f(new IllegalArgumentException("Software JPEG not supported with CaptureBundle size > 1."));
                }
            } else {
                j02 = j0(null);
            }
            if (j02 == null) {
                return c0.f.f(new IllegalArgumentException("ImageCapture cannot set empty CaptureBundle."));
            }
            if (j02.a().size() > this.f2116w) {
                return c0.f.f(new IllegalArgumentException("ImageCapture has CaptureStages > Max CaptureStage size"));
            }
            this.C.l(j02);
            str = this.C.i();
        } else {
            j02 = j0(androidx.camera.core.l.c());
            if (j02.a().size() > 1) {
                return c0.f.f(new IllegalArgumentException("ImageCapture have no CaptureProcess set with CaptureBundle size > 1."));
            }
        }
        for (final androidx.camera.core.impl.c0 c0Var : j02.a()) {
            final a0.a aVar = new a0.a();
            aVar.n(this.f2114u.f());
            aVar.e(this.f2114u.c());
            aVar.a(this.A.o());
            aVar.f(this.E);
            if (new g0.a().a()) {
                aVar.d(androidx.camera.core.impl.a0.f2255g, Integer.valueOf(nVar.f2141a));
            }
            aVar.d(androidx.camera.core.impl.a0.f2256h, Integer.valueOf(nVar.f2142b));
            aVar.e(c0Var.a().c());
            if (str != null) {
                aVar.g(str, Integer.valueOf(c0Var.getId()));
            }
            aVar.c(this.D);
            arrayList.add(androidx.concurrent.futures.b.a(new b.c() { // from class: z.c0
                @Override // androidx.concurrent.futures.b.c
                public final Object a(b.a aVar2) {
                    return androidx.camera.core.c0.S(androidx.camera.core.c0.this, aVar, arrayList2, c0Var, aVar2);
                }
            }));
        }
        d().k(arrayList2);
        return c0.f.o(c0.f.c(arrayList), new p.a() { // from class: z.z
            @Override // p.a
            public final Object apply(Object obj) {
                return androidx.camera.core.c0.Z((List) obj);
            }
        }, b0.a.a());
    }

    public String toString() {
        return "ImageCapture:" + i();
    }

    @Override // androidx.camera.core.f1
    public void w() {
        androidx.camera.core.impl.m0 m0Var = (androidx.camera.core.impl.m0) f();
        this.f2114u = a0.a.i(m0Var).h();
        this.f2117x = m0Var.G(null);
        this.f2116w = m0Var.K(2);
        this.f2115v = m0Var.E(androidx.camera.core.l.c());
        this.f2118y = m0Var.M();
        androidx.camera.core.impl.s c11 = c();
        v3.h.g(c11, "Attached camera cannot be null");
        boolean a11 = c11.i().d().a(f0.f.class);
        this.f2119z = a11;
        if (a11) {
            n0.a("ImageCapture", "Open and close torch to replace the flash fired by flash mode.");
        }
        this.f2113t = Executors.newFixedThreadPool(1, new e(this));
    }

    @Override // androidx.camera.core.f1
    protected void x() {
        W0();
    }

    @Override // androidx.camera.core.f1
    public void z() {
        c0();
        f0();
        this.f2118y = false;
        this.f2113t.shutdown();
    }
}