package jf;

import android.content.ContentResolver;
import android.net.Uri;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.d1;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.q;
import com.facebook.imagepipeline.producers.r;
import com.facebook.imagepipeline.producers.t;
import com.facebook.imagepipeline.producers.z0;
import com.facebook.imagepipeline.request.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class p {
    o0<qd.a<nf.c>> A;
    o0<qd.a<nf.c>> B;
    Map<o0<qd.a<nf.c>>, o0<qd.a<nf.c>>> C = new HashMap();
    Map<o0<qd.a<nf.c>>, o0<qd.a<nf.c>>> D;

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f33651a;

    /* renamed from: b  reason: collision with root package name */
    private final o f33652b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f33653c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f33654d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f33655e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f33656f;

    /* renamed from: g  reason: collision with root package name */
    private final z0 f33657g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f33658h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f33659i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f33660j;

    /* renamed from: k  reason: collision with root package name */
    private final uf.d f33661k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f33662l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f33663m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f33664n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f33665o;

    /* renamed from: p  reason: collision with root package name */
    o0<qd.a<nf.c>> f33666p;

    /* renamed from: q  reason: collision with root package name */
    o0<nf.e> f33667q;

    /* renamed from: r  reason: collision with root package name */
    o0<nf.e> f33668r;

    /* renamed from: s  reason: collision with root package name */
    o0<Void> f33669s;

    /* renamed from: t  reason: collision with root package name */
    o0<Void> f33670t;

    /* renamed from: u  reason: collision with root package name */
    private o0<nf.e> f33671u;

    /* renamed from: v  reason: collision with root package name */
    o0<qd.a<nf.c>> f33672v;

    /* renamed from: w  reason: collision with root package name */
    o0<qd.a<nf.c>> f33673w;

    /* renamed from: x  reason: collision with root package name */
    o0<qd.a<nf.c>> f33674x;

    /* renamed from: y  reason: collision with root package name */
    o0<qd.a<nf.c>> f33675y;

    /* renamed from: z  reason: collision with root package name */
    o0<qd.a<nf.c>> f33676z;

    public p(ContentResolver contentResolver, o oVar, k0 k0Var, boolean z11, boolean z12, z0 z0Var, boolean z13, boolean z14, boolean z15, boolean z16, uf.d dVar, boolean z17, boolean z18, boolean z19, boolean z21) {
        this.f33651a = contentResolver;
        this.f33652b = oVar;
        this.f33653c = k0Var;
        this.f33654d = z11;
        this.f33655e = z12;
        this.f33664n = z19;
        new HashMap();
        this.D = new HashMap();
        this.f33657g = z0Var;
        this.f33658h = z13;
        this.f33659i = z14;
        this.f33656f = z15;
        this.f33660j = z16;
        this.f33661k = dVar;
        this.f33662l = z17;
        this.f33663m = z18;
        this.f33665o = z21;
    }

    private o0<nf.e> A(d1<EncodedImage>[] d1VarArr) {
        return this.f33652b.D(this.f33652b.G(d1VarArr), true, this.f33661k);
    }

    private o0<nf.e> B(o0<nf.e> o0Var, d1<EncodedImage>[] d1VarArr) {
        return o.h(A(d1VarArr), this.f33652b.F(this.f33652b.D(o.a(o0Var), true, this.f33661k)));
    }

    private static void C(com.facebook.imagepipeline.request.a aVar) {
        md.k.g(aVar);
        md.k.b(Boolean.valueOf(aVar.h().getValue() <= a.c.ENCODED_MEMORY_CACHE.getValue()));
    }

    private synchronized o0<nf.e> a() {
        if (tf.b.d()) {
            tf.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        }
        if (this.f33667q == null) {
            if (tf.b.d()) {
                tf.b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence:init");
            }
            this.f33667q = this.f33652b.b(z(this.f33652b.v()), this.f33657g);
            if (tf.b.d()) {
                tf.b.b();
            }
        }
        if (tf.b.d()) {
            tf.b.b();
        }
        return this.f33667q;
    }

    private synchronized o0<nf.e> b() {
        if (tf.b.d()) {
            tf.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence");
        }
        if (this.f33668r == null) {
            if (tf.b.d()) {
                tf.b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
            }
            this.f33668r = this.f33652b.b(e(), this.f33657g);
            if (tf.b.d()) {
                tf.b.b();
            }
        }
        if (tf.b.d()) {
            tf.b.b();
        }
        return this.f33668r;
    }

    private o0<qd.a<nf.c>> c(com.facebook.imagepipeline.request.a aVar) {
        try {
            if (tf.b.d()) {
                tf.b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
            }
            md.k.g(aVar);
            Uri s11 = aVar.s();
            md.k.h(s11, "Uri is null.");
            int t11 = aVar.t();
            if (t11 != 0) {
                switch (t11) {
                    case 2:
                        o0<qd.a<nf.c>> o11 = o();
                        if (tf.b.d()) {
                            tf.b.b();
                        }
                        return o11;
                    case 3:
                        o0<qd.a<nf.c>> m11 = m();
                        if (tf.b.d()) {
                            tf.b.b();
                        }
                        return m11;
                    case 4:
                        if (od.a.c(this.f33651a.getType(s11))) {
                            o0<qd.a<nf.c>> o12 = o();
                            if (tf.b.d()) {
                                tf.b.b();
                            }
                            return o12;
                        }
                        o0<qd.a<nf.c>> k11 = k();
                        if (tf.b.d()) {
                            tf.b.b();
                        }
                        return k11;
                    case 5:
                        o0<qd.a<nf.c>> j11 = j();
                        if (tf.b.d()) {
                            tf.b.b();
                        }
                        return j11;
                    case 6:
                        o0<qd.a<nf.c>> n11 = n();
                        if (tf.b.d()) {
                            tf.b.b();
                        }
                        return n11;
                    case 7:
                        o0<qd.a<nf.c>> f11 = f();
                        if (tf.b.d()) {
                            tf.b.b();
                        }
                        return f11;
                    case 8:
                        return s();
                    default:
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + t(s11));
                }
            }
            o0<qd.a<nf.c>> p11 = p();
            if (tf.b.d()) {
                tf.b.b();
            }
            return p11;
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    private synchronized o0<qd.a<nf.c>> d(o0<qd.a<nf.c>> o0Var) {
        o0<qd.a<nf.c>> o0Var2;
        o0Var2 = this.D.get(o0Var);
        if (o0Var2 == null) {
            o0Var2 = this.f33652b.f(o0Var);
            this.D.put(o0Var, o0Var2);
        }
        return o0Var2;
    }

    private synchronized o0<nf.e> e() {
        o0<nf.e> z11;
        if (tf.b.d()) {
            tf.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        }
        if (this.f33671u == null) {
            if (tf.b.d()) {
                tf.b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence:init");
            }
            if (this.f33664n) {
                z11 = this.f33652b.i(this.f33653c);
            } else {
                z11 = z(this.f33652b.y(this.f33653c));
            }
            com.facebook.imagepipeline.producers.a a11 = o.a((o0) md.k.g(z11));
            this.f33671u = a11;
            this.f33671u = this.f33652b.D(a11, this.f33654d && !this.f33658h, this.f33661k);
            if (tf.b.d()) {
                tf.b.b();
            }
        }
        if (tf.b.d()) {
            tf.b.b();
        }
        return this.f33671u;
    }

    private synchronized o0<qd.a<nf.c>> f() {
        if (this.A == null) {
            o0<nf.e> j11 = this.f33652b.j();
            if (vd.c.f54476a && (!this.f33655e || vd.c.f54477b == null)) {
                j11 = this.f33652b.H(j11);
            }
            this.A = v(this.f33652b.D(o.a(j11), true, this.f33661k));
        }
        return this.A;
    }

    private synchronized o0<qd.a<nf.c>> h(o0<qd.a<nf.c>> o0Var) {
        return this.f33652b.l(o0Var);
    }

    private synchronized o0<qd.a<nf.c>> j() {
        if (this.f33676z == null) {
            this.f33676z = w(this.f33652b.r());
        }
        return this.f33676z;
    }

    private synchronized o0<qd.a<nf.c>> k() {
        if (this.f33674x == null) {
            this.f33674x = x(this.f33652b.s(), new d1[]{this.f33652b.t(), this.f33652b.u()});
        }
        return this.f33674x;
    }

    private synchronized o0<Void> l() {
        if (tf.b.d()) {
            tf.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f33669s == null) {
            if (tf.b.d()) {
                tf.b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f33669s = this.f33652b.E(a());
            if (tf.b.d()) {
                tf.b.b();
            }
        }
        if (tf.b.d()) {
            tf.b.b();
        }
        return this.f33669s;
    }

    private synchronized o0<qd.a<nf.c>> m() {
        if (this.f33672v == null) {
            this.f33672v = w(this.f33652b.v());
        }
        return this.f33672v;
    }

    private synchronized o0<qd.a<nf.c>> n() {
        if (this.f33675y == null) {
            this.f33675y = w(this.f33652b.w());
        }
        return this.f33675y;
    }

    private synchronized o0<qd.a<nf.c>> o() {
        if (this.f33673w == null) {
            this.f33673w = u(this.f33652b.x());
        }
        return this.f33673w;
    }

    private synchronized o0<qd.a<nf.c>> p() {
        if (tf.b.d()) {
            tf.b.a("ProducerSequenceFactory#getNetworkFetchSequence");
        }
        if (this.f33666p == null) {
            if (tf.b.d()) {
                tf.b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
            }
            this.f33666p = v(e());
            if (tf.b.d()) {
                tf.b.b();
            }
        }
        if (tf.b.d()) {
            tf.b.b();
        }
        return this.f33666p;
    }

    private synchronized o0<Void> q() {
        if (tf.b.d()) {
            tf.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        }
        if (this.f33670t == null) {
            if (tf.b.d()) {
                tf.b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence:init");
            }
            this.f33670t = this.f33652b.E(b());
            if (tf.b.d()) {
                tf.b.b();
            }
        }
        if (tf.b.d()) {
            tf.b.b();
        }
        return this.f33670t;
    }

    private synchronized o0<qd.a<nf.c>> r(o0<qd.a<nf.c>> o0Var) {
        o0<qd.a<nf.c>> o0Var2;
        o0Var2 = this.C.get(o0Var);
        if (o0Var2 == null) {
            o0Var2 = this.f33652b.A(this.f33652b.B(o0Var));
            this.C.put(o0Var, o0Var2);
        }
        return o0Var2;
    }

    private synchronized o0<qd.a<nf.c>> s() {
        if (this.B == null) {
            this.B = w(this.f33652b.C());
        }
        return this.B;
    }

    private static String t(Uri uri) {
        String valueOf = String.valueOf(uri);
        if (valueOf.length() > 30) {
            return valueOf.substring(0, 30) + "...";
        }
        return valueOf;
    }

    private o0<qd.a<nf.c>> u(o0<qd.a<nf.c>> o0Var) {
        o0<qd.a<nf.c>> b11 = this.f33652b.b(this.f33652b.d(this.f33652b.e(o0Var)), this.f33657g);
        if (!this.f33662l && !this.f33663m) {
            return this.f33652b.c(b11);
        }
        return this.f33652b.g(this.f33652b.c(b11));
    }

    private o0<qd.a<nf.c>> v(o0<nf.e> o0Var) {
        if (tf.b.d()) {
            tf.b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        }
        o0<qd.a<nf.c>> u11 = u(this.f33652b.k(o0Var));
        if (tf.b.d()) {
            tf.b.b();
        }
        return u11;
    }

    private o0<qd.a<nf.c>> w(o0<nf.e> o0Var) {
        return x(o0Var, new d1[]{this.f33652b.u()});
    }

    private o0<qd.a<nf.c>> x(o0<nf.e> o0Var, d1<EncodedImage>[] d1VarArr) {
        return v(B(z(o0Var), d1VarArr));
    }

    private o0<nf.e> y(o0<nf.e> o0Var) {
        r n11;
        if (tf.b.d()) {
            tf.b.a("ProducerSequenceFactory#newDiskCacheSequence");
        }
        if (this.f33656f) {
            n11 = this.f33652b.n(this.f33652b.z(o0Var));
        } else {
            n11 = this.f33652b.n(o0Var);
        }
        q m11 = this.f33652b.m(n11);
        if (tf.b.d()) {
            tf.b.b();
        }
        return m11;
    }

    private o0<nf.e> z(o0<nf.e> o0Var) {
        if (vd.c.f54476a && (!this.f33655e || vd.c.f54477b == null)) {
            o0Var = this.f33652b.H(o0Var);
        }
        if (this.f33660j) {
            o0Var = y(o0Var);
        }
        t p11 = this.f33652b.p(o0Var);
        if (this.f33663m) {
            return this.f33652b.o(this.f33652b.q(p11));
        }
        return this.f33652b.o(p11);
    }

    public o0<qd.a<nf.c>> g(com.facebook.imagepipeline.request.a aVar) {
        if (tf.b.d()) {
            tf.b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        }
        o0<qd.a<nf.c>> c11 = c(aVar);
        if (aVar.i() != null) {
            c11 = r(c11);
        }
        if (this.f33659i) {
            c11 = d(c11);
        }
        if (this.f33665o && aVar.e() > 0) {
            c11 = h(c11);
        }
        if (tf.b.d()) {
            tf.b.b();
        }
        return c11;
    }

    public o0<Void> i(com.facebook.imagepipeline.request.a aVar) {
        C(aVar);
        int t11 = aVar.t();
        if (t11 != 0) {
            if (t11 != 2 && t11 != 3) {
                Uri s11 = aVar.s();
                throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + t(s11));
            }
            return l();
        }
        return q();
    }
}