package jf;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.producers.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.b1;
import com.facebook.imagepipeline.producers.c0;
import com.facebook.imagepipeline.producers.c1;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.d1;
import com.facebook.imagepipeline.producers.f0;
import com.facebook.imagepipeline.producers.f1;
import com.facebook.imagepipeline.producers.g0;
import com.facebook.imagepipeline.producers.h0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.m0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.q;
import com.facebook.imagepipeline.producers.r;
import com.facebook.imagepipeline.producers.t;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u;
import com.facebook.imagepipeline.producers.u0;
import com.facebook.imagepipeline.producers.x0;
import com.facebook.imagepipeline.producers.y0;
import com.facebook.imagepipeline.producers.z0;
import hf.s;

/* loaded from: classes3.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    protected ContentResolver f33626a;

    /* renamed from: b  reason: collision with root package name */
    protected Resources f33627b;

    /* renamed from: c  reason: collision with root package name */
    protected AssetManager f33628c;

    /* renamed from: d  reason: collision with root package name */
    protected final pd.a f33629d;

    /* renamed from: e  reason: collision with root package name */
    protected final lf.b f33630e;

    /* renamed from: f  reason: collision with root package name */
    protected final lf.d f33631f;

    /* renamed from: g  reason: collision with root package name */
    protected final boolean f33632g;

    /* renamed from: h  reason: collision with root package name */
    protected final boolean f33633h;

    /* renamed from: i  reason: collision with root package name */
    protected final boolean f33634i;

    /* renamed from: j  reason: collision with root package name */
    protected final f f33635j;

    /* renamed from: k  reason: collision with root package name */
    protected final pd.g f33636k;

    /* renamed from: l  reason: collision with root package name */
    protected final hf.e f33637l;

    /* renamed from: m  reason: collision with root package name */
    protected final hf.e f33638m;

    /* renamed from: n  reason: collision with root package name */
    protected final s<gd.d, PooledByteBuffer> f33639n;

    /* renamed from: o  reason: collision with root package name */
    protected final s<gd.d, nf.c> f33640o;

    /* renamed from: p  reason: collision with root package name */
    protected final hf.f f33641p;

    /* renamed from: q  reason: collision with root package name */
    protected final hf.d<gd.d> f33642q;

    /* renamed from: r  reason: collision with root package name */
    protected final hf.d<gd.d> f33643r;

    /* renamed from: s  reason: collision with root package name */
    protected final gf.f f33644s;

    /* renamed from: t  reason: collision with root package name */
    protected final int f33645t;

    /* renamed from: u  reason: collision with root package name */
    protected final int f33646u;

    /* renamed from: v  reason: collision with root package name */
    protected boolean f33647v;

    /* renamed from: w  reason: collision with root package name */
    protected final a f33648w;

    /* renamed from: x  reason: collision with root package name */
    protected final int f33649x;

    /* renamed from: y  reason: collision with root package name */
    protected final boolean f33650y;

    public o(Context context, pd.a aVar, lf.b bVar, lf.d dVar, boolean z11, boolean z12, boolean z13, f fVar, pd.g gVar, s<gd.d, nf.c> sVar, s<gd.d, PooledByteBuffer> sVar2, hf.e eVar, hf.e eVar2, hf.f fVar2, gf.f fVar3, int i11, int i12, boolean z14, int i13, a aVar2, boolean z15, int i14) {
        this.f33626a = context.getApplicationContext().getContentResolver();
        this.f33627b = context.getApplicationContext().getResources();
        this.f33628c = context.getApplicationContext().getAssets();
        this.f33629d = aVar;
        this.f33630e = bVar;
        this.f33631f = dVar;
        this.f33632g = z11;
        this.f33633h = z12;
        this.f33634i = z13;
        this.f33635j = fVar;
        this.f33636k = gVar;
        this.f33640o = sVar;
        this.f33639n = sVar2;
        this.f33637l = eVar;
        this.f33638m = eVar2;
        this.f33641p = fVar2;
        this.f33644s = fVar3;
        this.f33642q = new hf.d<>(i14);
        this.f33643r = new hf.d<>(i14);
        this.f33645t = i11;
        this.f33646u = i12;
        this.f33647v = z14;
        this.f33649x = i13;
        this.f33648w = aVar2;
        this.f33650y = z15;
    }

    public static com.facebook.imagepipeline.producers.a a(o0<nf.e> o0Var) {
        return new com.facebook.imagepipeline.producers.a(o0Var);
    }

    public static com.facebook.imagepipeline.producers.k h(o0<nf.e> o0Var, o0<nf.e> o0Var2) {
        return new com.facebook.imagepipeline.producers.k(o0Var, o0Var2);
    }

    public m0 A(o0<qd.a<nf.c>> o0Var) {
        return new m0(this.f33640o, this.f33641p, o0Var);
    }

    public n0 B(o0<qd.a<nf.c>> o0Var) {
        return new n0(o0Var, this.f33644s, this.f33635j.e());
    }

    public t0 C() {
        return new t0(this.f33635j.f(), this.f33636k, this.f33626a);
    }

    public u0 D(o0<nf.e> o0Var, boolean z11, uf.d dVar) {
        return new u0(this.f33635j.e(), this.f33636k, o0Var, z11, dVar);
    }

    public <T> x0<T> E(o0<T> o0Var) {
        return new x0<>(o0Var);
    }

    public <T> b1<T> F(o0<T> o0Var) {
        return new b1<>(5, this.f33635j.a(), o0Var);
    }

    public c1 G(d1<EncodedImage>[] d1VarArr) {
        return new c1(d1VarArr);
    }

    public f1 H(o0<nf.e> o0Var) {
        return new f1(this.f33635j.e(), this.f33636k, o0Var);
    }

    public <T> o0<T> b(o0<T> o0Var, z0 z0Var) {
        return new y0(o0Var, z0Var);
    }

    public com.facebook.imagepipeline.producers.f c(o0<qd.a<nf.c>> o0Var) {
        return new com.facebook.imagepipeline.producers.f(this.f33640o, this.f33641p, o0Var);
    }

    public com.facebook.imagepipeline.producers.g d(o0<qd.a<nf.c>> o0Var) {
        return new com.facebook.imagepipeline.producers.g(this.f33641p, o0Var);
    }

    public com.facebook.imagepipeline.producers.h e(o0<qd.a<nf.c>> o0Var) {
        return new com.facebook.imagepipeline.producers.h(this.f33640o, this.f33641p, o0Var);
    }

    public com.facebook.imagepipeline.producers.i f(o0<qd.a<nf.c>> o0Var) {
        return new com.facebook.imagepipeline.producers.i(o0Var, this.f33645t, this.f33646u, this.f33647v);
    }

    public com.facebook.imagepipeline.producers.j g(o0<qd.a<nf.c>> o0Var) {
        return new com.facebook.imagepipeline.producers.j(this.f33639n, this.f33637l, this.f33638m, this.f33641p, this.f33642q, this.f33643r, o0Var);
    }

    public o0<nf.e> i(k0 k0Var) {
        return null;
    }

    public com.facebook.imagepipeline.producers.m j() {
        return new com.facebook.imagepipeline.producers.m(this.f33636k);
    }

    public com.facebook.imagepipeline.producers.n k(o0<nf.e> o0Var) {
        return new com.facebook.imagepipeline.producers.n(this.f33629d, this.f33635j.d(), this.f33630e, this.f33631f, this.f33632g, this.f33633h, this.f33634i, o0Var, this.f33649x, this.f33648w, null, md.o.f38489a);
    }

    public com.facebook.imagepipeline.producers.o l(o0<qd.a<nf.c>> o0Var) {
        return new com.facebook.imagepipeline.producers.o(o0Var, this.f33635j.c());
    }

    public q m(o0<nf.e> o0Var) {
        return new q(this.f33637l, this.f33638m, this.f33641p, o0Var);
    }

    public r n(o0<nf.e> o0Var) {
        return new r(this.f33637l, this.f33638m, this.f33641p, o0Var);
    }

    public com.facebook.imagepipeline.producers.s o(o0<nf.e> o0Var) {
        return new com.facebook.imagepipeline.producers.s(this.f33641p, this.f33650y, o0Var);
    }

    public t p(o0<nf.e> o0Var) {
        return new t(this.f33639n, this.f33641p, o0Var);
    }

    public u q(o0<nf.e> o0Var) {
        return new u(this.f33637l, this.f33638m, this.f33641p, this.f33642q, this.f33643r, o0Var);
    }

    public b0 r() {
        return new b0(this.f33635j.f(), this.f33636k, this.f33628c);
    }

    public c0 s() {
        return new c0(this.f33635j.f(), this.f33636k, this.f33626a);
    }

    public d0 t() {
        return new d0(this.f33635j.f(), this.f33636k, this.f33626a);
    }

    public LocalExifThumbnailProducer u() {
        return new LocalExifThumbnailProducer(this.f33635j.g(), this.f33636k, this.f33626a);
    }

    public f0 v() {
        return new f0(this.f33635j.f(), this.f33636k);
    }

    public g0 w() {
        return new g0(this.f33635j.f(), this.f33636k, this.f33627b);
    }

    public h0 x() {
        return new h0(this.f33635j.f(), this.f33626a);
    }

    public o0<nf.e> y(k0 k0Var) {
        return new j0(this.f33636k, this.f33629d, k0Var);
    }

    public l0 z(o0<nf.e> o0Var) {
        return new l0(this.f33637l, this.f33641p, this.f33636k, this.f33629d, o0Var);
    }
}