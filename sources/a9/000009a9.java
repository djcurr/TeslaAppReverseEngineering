package androidx.work;

import android.net.Uri;
import android.os.Build;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final c f6513i = new a().b();

    /* renamed from: a  reason: collision with root package name */
    private r f6514a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6515b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6516c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6517d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6518e;

    /* renamed from: f  reason: collision with root package name */
    private long f6519f;

    /* renamed from: g  reason: collision with root package name */
    private long f6520g;

    /* renamed from: h  reason: collision with root package name */
    private d f6521h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f6522a = false;

        /* renamed from: b  reason: collision with root package name */
        boolean f6523b = false;

        /* renamed from: c  reason: collision with root package name */
        r f6524c = r.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        boolean f6525d = false;

        /* renamed from: e  reason: collision with root package name */
        boolean f6526e = false;

        /* renamed from: f  reason: collision with root package name */
        long f6527f = -1;

        /* renamed from: g  reason: collision with root package name */
        long f6528g = -1;

        /* renamed from: h  reason: collision with root package name */
        d f6529h = new d();

        public a a(Uri uri, boolean z11) {
            this.f6529h.a(uri, z11);
            return this;
        }

        public c b() {
            return new c(this);
        }

        public a c(r rVar) {
            this.f6524c = rVar;
            return this;
        }

        public a d(boolean z11) {
            this.f6525d = z11;
            return this;
        }

        public a e(boolean z11) {
            this.f6523b = z11;
            return this;
        }

        public a f(long j11, TimeUnit timeUnit) {
            this.f6528g = timeUnit.toMillis(j11);
            return this;
        }
    }

    public c() {
        this.f6514a = r.NOT_REQUIRED;
        this.f6519f = -1L;
        this.f6520g = -1L;
        this.f6521h = new d();
    }

    public d a() {
        return this.f6521h;
    }

    public r b() {
        return this.f6514a;
    }

    public long c() {
        return this.f6519f;
    }

    public long d() {
        return this.f6520g;
    }

    public boolean e() {
        return this.f6521h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f6515b == cVar.f6515b && this.f6516c == cVar.f6516c && this.f6517d == cVar.f6517d && this.f6518e == cVar.f6518e && this.f6519f == cVar.f6519f && this.f6520g == cVar.f6520g && this.f6514a == cVar.f6514a) {
            return this.f6521h.equals(cVar.f6521h);
        }
        return false;
    }

    public boolean f() {
        return this.f6517d;
    }

    public boolean g() {
        return this.f6515b;
    }

    public boolean h() {
        return this.f6516c;
    }

    public int hashCode() {
        long j11 = this.f6519f;
        long j12 = this.f6520g;
        return (((((((((((((this.f6514a.hashCode() * 31) + (this.f6515b ? 1 : 0)) * 31) + (this.f6516c ? 1 : 0)) * 31) + (this.f6517d ? 1 : 0)) * 31) + (this.f6518e ? 1 : 0)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f6521h.hashCode();
    }

    public boolean i() {
        return this.f6518e;
    }

    public void j(d dVar) {
        this.f6521h = dVar;
    }

    public void k(r rVar) {
        this.f6514a = rVar;
    }

    public void l(boolean z11) {
        this.f6517d = z11;
    }

    public void m(boolean z11) {
        this.f6515b = z11;
    }

    public void n(boolean z11) {
        this.f6516c = z11;
    }

    public void o(boolean z11) {
        this.f6518e = z11;
    }

    public void p(long j11) {
        this.f6519f = j11;
    }

    public void q(long j11) {
        this.f6520g = j11;
    }

    c(a aVar) {
        this.f6514a = r.NOT_REQUIRED;
        this.f6519f = -1L;
        this.f6520g = -1L;
        this.f6521h = new d();
        this.f6515b = aVar.f6522a;
        int i11 = Build.VERSION.SDK_INT;
        this.f6516c = i11 >= 23 && aVar.f6523b;
        this.f6514a = aVar.f6524c;
        this.f6517d = aVar.f6525d;
        this.f6518e = aVar.f6526e;
        if (i11 >= 24) {
            this.f6521h = aVar.f6529h;
            this.f6519f = aVar.f6527f;
            this.f6520g = aVar.f6528g;
        }
    }

    public c(c cVar) {
        this.f6514a = r.NOT_REQUIRED;
        this.f6519f = -1L;
        this.f6520g = -1L;
        this.f6521h = new d();
        this.f6515b = cVar.f6515b;
        this.f6516c = cVar.f6516c;
        this.f6514a = cVar.f6514a;
        this.f6517d = cVar.f6517d;
        this.f6518e = cVar.f6518e;
        this.f6521h = cVar.f6521h;
    }
}