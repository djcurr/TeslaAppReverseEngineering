package com.facebook.imagepipeline.request;

import android.net.Uri;
import java.io.File;
import md.e;
import md.j;
import p001if.d;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: u */
    private static boolean f11626u;

    /* renamed from: v */
    private static boolean f11627v;

    /* renamed from: w */
    public static final e<a, Uri> f11628w = new C0219a();

    /* renamed from: a */
    private int f11629a;

    /* renamed from: b */
    private final b f11630b;

    /* renamed from: c */
    private final Uri f11631c;

    /* renamed from: d */
    private final int f11632d;

    /* renamed from: e */
    private File f11633e;

    /* renamed from: f */
    private final boolean f11634f;

    /* renamed from: g */
    private final boolean f11635g;

    /* renamed from: h */
    private final p001if.b f11636h;

    /* renamed from: i */
    private final d f11637i;

    /* renamed from: j */
    private final p001if.e f11638j;

    /* renamed from: k */
    private final p001if.a f11639k;

    /* renamed from: l */
    private final com.facebook.imagepipeline.common.a f11640l;

    /* renamed from: m */
    private final c f11641m;

    /* renamed from: n */
    private final boolean f11642n;

    /* renamed from: o */
    private final boolean f11643o;

    /* renamed from: p */
    private final Boolean f11644p;

    /* renamed from: q */
    private final sf.b f11645q;

    /* renamed from: r */
    private final pf.e f11646r;

    /* renamed from: s */
    private final Boolean f11647s;

    /* renamed from: t */
    private final int f11648t;

    /* renamed from: com.facebook.imagepipeline.request.a$a */
    /* loaded from: classes3.dex */
    static class C0219a implements e<a, Uri> {
        C0219a() {
        }

        @Override // md.e
        /* renamed from: a */
        public Uri apply(a aVar) {
            if (aVar != null) {
                return aVar.s();
            }
            return null;
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        SMALL,
        DEFAULT
    }

    /* loaded from: classes3.dex */
    public enum c {
        FULL_FETCH(1),
        DISK_CACHE(2),
        ENCODED_MEMORY_CACHE(3),
        BITMAP_MEMORY_CACHE(4);
        
        private int mValue;

        c(int i11) {
            this.mValue = i11;
        }

        public static c getMax(c cVar, c cVar2) {
            return cVar.getValue() > cVar2.getValue() ? cVar : cVar2;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    public a(ImageRequestBuilder imageRequestBuilder) {
        p001if.e m11;
        this.f11630b = imageRequestBuilder.d();
        Uri n11 = imageRequestBuilder.n();
        this.f11631c = n11;
        this.f11632d = u(n11);
        this.f11634f = imageRequestBuilder.r();
        this.f11635g = imageRequestBuilder.p();
        this.f11636h = imageRequestBuilder.f();
        this.f11637i = imageRequestBuilder.k();
        if (imageRequestBuilder.m() == null) {
            m11 = p001if.e.a();
        } else {
            m11 = imageRequestBuilder.m();
        }
        this.f11638j = m11;
        this.f11639k = imageRequestBuilder.c();
        this.f11640l = imageRequestBuilder.j();
        this.f11641m = imageRequestBuilder.g();
        this.f11642n = imageRequestBuilder.o();
        this.f11643o = imageRequestBuilder.q();
        this.f11644p = imageRequestBuilder.I();
        this.f11645q = imageRequestBuilder.h();
        this.f11646r = imageRequestBuilder.i();
        this.f11647s = imageRequestBuilder.l();
        this.f11648t = imageRequestBuilder.e();
    }

    public static a a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return ImageRequestBuilder.s(uri).a();
    }

    public static a b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return a(Uri.parse(str));
    }

    private static int u(Uri uri) {
        if (uri == null) {
            return -1;
        }
        if (ud.d.l(uri)) {
            return 0;
        }
        if (ud.d.j(uri)) {
            return od.a.c(od.a.b(uri.getPath())) ? 2 : 3;
        } else if (ud.d.i(uri)) {
            return 4;
        } else {
            if (ud.d.f(uri)) {
                return 5;
            }
            if (ud.d.k(uri)) {
                return 6;
            }
            if (ud.d.e(uri)) {
                return 7;
            }
            return ud.d.m(uri) ? 8 : -1;
        }
    }

    public p001if.a c() {
        return this.f11639k;
    }

    public b d() {
        return this.f11630b;
    }

    public int e() {
        return this.f11648t;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (f11626u) {
                int i11 = this.f11629a;
                int i12 = aVar.f11629a;
                if (i11 != 0 && i12 != 0 && i11 != i12) {
                    return false;
                }
            }
            if (this.f11635g == aVar.f11635g && this.f11642n == aVar.f11642n && this.f11643o == aVar.f11643o && j.a(this.f11631c, aVar.f11631c) && j.a(this.f11630b, aVar.f11630b) && j.a(this.f11633e, aVar.f11633e) && j.a(this.f11639k, aVar.f11639k) && j.a(this.f11636h, aVar.f11636h) && j.a(this.f11637i, aVar.f11637i) && j.a(this.f11640l, aVar.f11640l) && j.a(this.f11641m, aVar.f11641m) && j.a(this.f11644p, aVar.f11644p) && j.a(this.f11647s, aVar.f11647s) && j.a(this.f11638j, aVar.f11638j)) {
                sf.b bVar = this.f11645q;
                gd.d a11 = bVar != null ? bVar.a() : null;
                sf.b bVar2 = aVar.f11645q;
                return j.a(a11, bVar2 != null ? bVar2.a() : null) && this.f11648t == aVar.f11648t;
            }
            return false;
        }
        return false;
    }

    public p001if.b f() {
        return this.f11636h;
    }

    public boolean g() {
        return this.f11635g;
    }

    public c h() {
        return this.f11641m;
    }

    public int hashCode() {
        boolean z11 = f11627v;
        int i11 = z11 ? this.f11629a : 0;
        if (i11 == 0) {
            sf.b bVar = this.f11645q;
            i11 = j.b(this.f11630b, this.f11631c, Boolean.valueOf(this.f11635g), this.f11639k, this.f11640l, this.f11641m, Boolean.valueOf(this.f11642n), Boolean.valueOf(this.f11643o), this.f11636h, this.f11644p, this.f11637i, this.f11638j, bVar != null ? bVar.a() : null, this.f11647s, Integer.valueOf(this.f11648t));
            if (z11) {
                this.f11629a = i11;
            }
        }
        return i11;
    }

    public sf.b i() {
        return this.f11645q;
    }

    public int j() {
        d dVar = this.f11637i;
        if (dVar != null) {
            return dVar.f30386b;
        }
        return 2048;
    }

    public int k() {
        d dVar = this.f11637i;
        if (dVar != null) {
            return dVar.f30385a;
        }
        return 2048;
    }

    public com.facebook.imagepipeline.common.a l() {
        return this.f11640l;
    }

    public boolean m() {
        return this.f11634f;
    }

    public pf.e n() {
        return this.f11646r;
    }

    public d o() {
        return this.f11637i;
    }

    public Boolean p() {
        return this.f11647s;
    }

    public p001if.e q() {
        return this.f11638j;
    }

    public synchronized File r() {
        if (this.f11633e == null) {
            this.f11633e = new File(this.f11631c.getPath());
        }
        return this.f11633e;
    }

    public Uri s() {
        return this.f11631c;
    }

    public int t() {
        return this.f11632d;
    }

    public String toString() {
        return j.c(this).b("uri", this.f11631c).b("cacheChoice", this.f11630b).b("decodeOptions", this.f11636h).b("postprocessor", this.f11645q).b("priority", this.f11640l).b("resizeOptions", this.f11637i).b("rotationOptions", this.f11638j).b("bytesRange", this.f11639k).b("resizingAllowedOverride", this.f11647s).c("progressiveRenderingEnabled", this.f11634f).c("localThumbnailPreviewsEnabled", this.f11635g).b("lowestPermittedRequestLevel", this.f11641m).c("isDiskCacheEnabled", this.f11642n).c("isMemoryCacheEnabled", this.f11643o).b("decodePrefetches", this.f11644p).a("delayMs", this.f11648t).toString();
    }

    public boolean v() {
        return this.f11642n;
    }

    public boolean w() {
        return this.f11643o;
    }

    public Boolean x() {
        return this.f11644p;
    }
}