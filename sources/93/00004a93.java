package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import android.os.Build;
import com.squareup.picasso.r;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.e0;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes2.dex */
public class c implements Runnable {

    /* renamed from: a */
    final int f20666a = f20665z.incrementAndGet();

    /* renamed from: b */
    final t f20667b;

    /* renamed from: c */
    final i f20668c;

    /* renamed from: d */
    final com.squareup.picasso.d f20669d;

    /* renamed from: e */
    final a0 f20670e;

    /* renamed from: f */
    final String f20671f;

    /* renamed from: g */
    final w f20672g;

    /* renamed from: h */
    final int f20673h;

    /* renamed from: i */
    int f20674i;

    /* renamed from: j */
    final y f20675j;

    /* renamed from: k */
    com.squareup.picasso.a f20676k;

    /* renamed from: l */
    List<com.squareup.picasso.a> f20677l;

    /* renamed from: m */
    Bitmap f20678m;

    /* renamed from: n */
    Future<?> f20679n;

    /* renamed from: o */
    t.e f20680o;

    /* renamed from: p */
    Exception f20681p;

    /* renamed from: q */
    int f20682q;

    /* renamed from: t */
    int f20683t;

    /* renamed from: w */
    t.f f20684w;

    /* renamed from: x */
    private static final Object f20663x = new Object();

    /* renamed from: y */
    private static final ThreadLocal<StringBuilder> f20664y = new a();

    /* renamed from: z */
    private static final AtomicInteger f20665z = new AtomicInteger();
    private static final y A = new b();

    /* loaded from: classes2.dex */
    static class a extends ThreadLocal<StringBuilder> {
        a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* loaded from: classes2.dex */
    static class b extends y {
        b() {
        }

        @Override // com.squareup.picasso.y
        public boolean c(w wVar) {
            return true;
        }

        @Override // com.squareup.picasso.y
        public y.a f(w wVar, int i11) {
            throw new IllegalStateException("Unrecognized type of request: " + wVar);
        }
    }

    /* renamed from: com.squareup.picasso.c$c */
    /* loaded from: classes2.dex */
    public static class RunnableC0363c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ c0 f20685a;

        /* renamed from: b */
        final /* synthetic */ RuntimeException f20686b;

        RunnableC0363c(c0 c0Var, RuntimeException runtimeException) {
            this.f20685a = c0Var;
            this.f20686b = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f20685a.key() + " crashed with exception.", this.f20686b);
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StringBuilder f20687a;

        d(StringBuilder sb2) {
            this.f20687a = sb2;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f20687a.toString());
        }
    }

    /* loaded from: classes2.dex */
    public static class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ c0 f20688a;

        e(c0 c0Var) {
            this.f20688a = c0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f20688a.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* loaded from: classes2.dex */
    public static class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ c0 f20689a;

        f(c0 c0Var) {
            this.f20689a = c0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f20689a.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    c(t tVar, i iVar, com.squareup.picasso.d dVar, a0 a0Var, com.squareup.picasso.a aVar, y yVar) {
        this.f20667b = tVar;
        this.f20668c = iVar;
        this.f20669d = dVar;
        this.f20670e = a0Var;
        this.f20676k = aVar;
        this.f20671f = aVar.d();
        this.f20672g = aVar.i();
        this.f20684w = aVar.h();
        this.f20673h = aVar.e();
        this.f20674i = aVar.f();
        this.f20675j = yVar;
        this.f20683t = yVar.e();
    }

    static Bitmap a(List<c0> list, Bitmap bitmap) {
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            c0 c0Var = list.get(i11);
            try {
                Bitmap a11 = c0Var.a(bitmap);
                if (a11 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Transformation ");
                    sb2.append(c0Var.key());
                    sb2.append(" returned null after ");
                    sb2.append(i11);
                    sb2.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (c0 c0Var2 : list) {
                        sb2.append(c0Var2.key());
                        sb2.append('\n');
                    }
                    t.f20735p.post(new d(sb2));
                    return null;
                } else if (a11 == bitmap && bitmap.isRecycled()) {
                    t.f20735p.post(new e(c0Var));
                    return null;
                } else if (a11 != bitmap && !bitmap.isRecycled()) {
                    t.f20735p.post(new f(c0Var));
                    return null;
                } else {
                    i11++;
                    bitmap = a11;
                }
            } catch (RuntimeException e11) {
                t.f20735p.post(new RunnableC0363c(c0Var, e11));
                return null;
            }
        }
        return bitmap;
    }

    private t.f d() {
        t.f fVar = t.f.LOW;
        List<com.squareup.picasso.a> list = this.f20677l;
        boolean z11 = true;
        boolean z12 = (list == null || list.isEmpty()) ? false : true;
        com.squareup.picasso.a aVar = this.f20676k;
        if (aVar == null && !z12) {
            z11 = false;
        }
        if (z11) {
            if (aVar != null) {
                fVar = aVar.h();
            }
            if (z12) {
                int size = this.f20677l.size();
                for (int i11 = 0; i11 < size; i11++) {
                    t.f h11 = this.f20677l.get(i11).h();
                    if (h11.ordinal() > fVar.ordinal()) {
                        fVar = h11;
                    }
                }
            }
            return fVar;
        }
        return fVar;
    }

    static Bitmap e(e0 e0Var, w wVar) {
        okio.h d11 = okio.r.d(e0Var);
        boolean r11 = d0.r(d11);
        boolean z11 = wVar.f20793r && Build.VERSION.SDK_INT < 21;
        BitmapFactory.Options d12 = y.d(wVar);
        boolean g11 = y.g(d12);
        if (!r11 && !z11) {
            InputStream I1 = d11.I1();
            if (g11) {
                n nVar = new n(I1);
                nVar.a(false);
                long j11 = nVar.j(1024);
                BitmapFactory.decodeStream(nVar, null, d12);
                y.b(wVar.f20783h, wVar.f20784i, d12, wVar);
                nVar.g(j11);
                nVar.a(true);
                I1 = nVar;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(I1, null, d12);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] K0 = d11.K0();
        if (g11) {
            BitmapFactory.decodeByteArray(K0, 0, K0.length, d12);
            y.b(wVar.f20783h, wVar.f20784i, d12, wVar);
        }
        return BitmapFactory.decodeByteArray(K0, 0, K0.length, d12);
    }

    public static c g(t tVar, i iVar, com.squareup.picasso.d dVar, a0 a0Var, com.squareup.picasso.a aVar) {
        w i11 = aVar.i();
        List<y> h11 = tVar.h();
        int size = h11.size();
        for (int i12 = 0; i12 < size; i12++) {
            y yVar = h11.get(i12);
            if (yVar.c(i11)) {
                return new c(tVar, iVar, dVar, a0Var, aVar, yVar);
            }
        }
        return new c(tVar, iVar, dVar, a0Var, aVar, A);
    }

    static int l(int i11) {
        switch (i11) {
            case 3:
            case 4:
                return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int m(int i11) {
        return (i11 == 2 || i11 == 7 || i11 == 4 || i11 == 5) ? -1 : 1;
    }

    private static boolean v(boolean z11, int i11, int i12, int i13, int i14) {
        return !z11 || (i13 != 0 && i11 > i13) || (i14 != 0 && i12 > i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static android.graphics.Bitmap y(com.squareup.picasso.w r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.y(com.squareup.picasso.w, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static void z(w wVar) {
        String a11 = wVar.a();
        StringBuilder sb2 = f20664y.get();
        sb2.ensureCapacity(a11.length() + 8);
        sb2.replace(8, sb2.length(), a11);
        Thread.currentThread().setName(sb2.toString());
    }

    public void b(com.squareup.picasso.a aVar) {
        boolean z11 = this.f20667b.f20750n;
        w wVar = aVar.f20617b;
        if (this.f20676k == null) {
            this.f20676k = aVar;
            if (z11) {
                List<com.squareup.picasso.a> list = this.f20677l;
                if (list != null && !list.isEmpty()) {
                    d0.t("Hunter", "joined", wVar.d(), d0.k(this, "to "));
                    return;
                } else {
                    d0.t("Hunter", "joined", wVar.d(), "to empty hunter");
                    return;
                }
            }
            return;
        }
        if (this.f20677l == null) {
            this.f20677l = new ArrayList(3);
        }
        this.f20677l.add(aVar);
        if (z11) {
            d0.t("Hunter", "joined", wVar.d(), d0.k(this, "to "));
        }
        t.f h11 = aVar.h();
        if (h11.ordinal() > this.f20684w.ordinal()) {
            this.f20684w = h11;
        }
    }

    public boolean c() {
        Future<?> future;
        if (this.f20676k == null) {
            List<com.squareup.picasso.a> list = this.f20677l;
            return (list == null || list.isEmpty()) && (future = this.f20679n) != null && future.cancel(false);
        }
        return false;
    }

    public void f(com.squareup.picasso.a aVar) {
        boolean remove;
        if (this.f20676k == aVar) {
            this.f20676k = null;
            remove = true;
        } else {
            List<com.squareup.picasso.a> list = this.f20677l;
            remove = list != null ? list.remove(aVar) : false;
        }
        if (remove && aVar.h() == this.f20684w) {
            this.f20684w = d();
        }
        if (this.f20667b.f20750n) {
            d0.t("Hunter", "removed", aVar.f20617b.d(), d0.k(this, "from "));
        }
    }

    public com.squareup.picasso.a h() {
        return this.f20676k;
    }

    public List<com.squareup.picasso.a> i() {
        return this.f20677l;
    }

    public w j() {
        return this.f20672g;
    }

    public Exception k() {
        return this.f20681p;
    }

    public String n() {
        return this.f20671f;
    }

    public t.e o() {
        return this.f20680o;
    }

    public int p() {
        return this.f20673h;
    }

    public t q() {
        return this.f20667b;
    }

    public t.f r() {
        return this.f20684w;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    z(this.f20672g);
                    if (this.f20667b.f20750n) {
                        d0.s("Hunter", "executing", d0.j(this));
                    }
                    Bitmap t11 = t();
                    this.f20678m = t11;
                    if (t11 == null) {
                        this.f20668c.e(this);
                    } else {
                        this.f20668c.d(this);
                    }
                } catch (IOException e11) {
                    this.f20681p = e11;
                    this.f20668c.g(this);
                } catch (OutOfMemoryError e12) {
                    StringWriter stringWriter = new StringWriter();
                    this.f20670e.a().a(new PrintWriter(stringWriter));
                    this.f20681p = new RuntimeException(stringWriter.toString(), e12);
                    this.f20668c.e(this);
                }
            } catch (r.b e13) {
                if (!q.isOfflineOnly(e13.f20733b) || e13.f20732a != 504) {
                    this.f20681p = e13;
                }
                this.f20668c.e(this);
            } catch (Exception e14) {
                this.f20681p = e14;
                this.f20668c.e(this);
            }
        } finally {
            Thread.currentThread().setName("Picasso-Idle");
        }
    }

    public Bitmap s() {
        return this.f20678m;
    }

    Bitmap t() {
        Bitmap bitmap;
        if (p.shouldReadFromMemoryCache(this.f20673h)) {
            bitmap = this.f20669d.get(this.f20671f);
            if (bitmap != null) {
                this.f20670e.d();
                this.f20680o = t.e.MEMORY;
                if (this.f20667b.f20750n) {
                    d0.t("Hunter", "decoded", this.f20672g.d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        int i11 = this.f20683t == 0 ? q.OFFLINE.index : this.f20674i;
        this.f20674i = i11;
        y.a f11 = this.f20675j.f(this.f20672g, i11);
        if (f11 != null) {
            this.f20680o = f11.c();
            this.f20682q = f11.b();
            bitmap = f11.a();
            if (bitmap == null) {
                e0 d11 = f11.d();
                try {
                    bitmap = e(d11, this.f20672g);
                } finally {
                    try {
                        d11.close();
                    } catch (IOException unused) {
                    }
                }
            }
        }
        if (bitmap != null) {
            if (this.f20667b.f20750n) {
                d0.s("Hunter", "decoded", this.f20672g.d());
            }
            this.f20670e.b(bitmap);
            if (this.f20672g.f() || this.f20682q != 0) {
                synchronized (f20663x) {
                    if (this.f20672g.e() || this.f20682q != 0) {
                        bitmap = y(this.f20672g, bitmap, this.f20682q);
                        if (this.f20667b.f20750n) {
                            d0.s("Hunter", "transformed", this.f20672g.d());
                        }
                    }
                    if (this.f20672g.b()) {
                        bitmap = a(this.f20672g.f20782g, bitmap);
                        if (this.f20667b.f20750n) {
                            d0.t("Hunter", "transformed", this.f20672g.d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f20670e.c(bitmap);
                }
            }
        }
        return bitmap;
    }

    public boolean u() {
        Future<?> future = this.f20679n;
        return future != null && future.isCancelled();
    }

    public boolean w(boolean z11, NetworkInfo networkInfo) {
        int i11 = this.f20683t;
        if (i11 > 0) {
            this.f20683t = i11 - 1;
            return this.f20675j.h(z11, networkInfo);
        }
        return false;
    }

    public boolean x() {
        return this.f20675j.i();
    }
}