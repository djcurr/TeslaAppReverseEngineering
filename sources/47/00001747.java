package com.facebook.imagepipeline.request;

import android.net.Uri;
import com.facebook.imagepipeline.request.a;
import jf.i;
import md.k;
import p001if.b;
import p001if.d;
import pf.e;

/* loaded from: classes3.dex */
public class ImageRequestBuilder {

    /* renamed from: n  reason: collision with root package name */
    private e f11622n;

    /* renamed from: q  reason: collision with root package name */
    private int f11625q;

    /* renamed from: a  reason: collision with root package name */
    private Uri f11609a = null;

    /* renamed from: b  reason: collision with root package name */
    private a.c f11610b = a.c.FULL_FETCH;

    /* renamed from: c  reason: collision with root package name */
    private d f11611c = null;

    /* renamed from: d  reason: collision with root package name */
    private p001if.e f11612d = null;

    /* renamed from: e  reason: collision with root package name */
    private b f11613e = b.a();

    /* renamed from: f  reason: collision with root package name */
    private a.b f11614f = a.b.DEFAULT;

    /* renamed from: g  reason: collision with root package name */
    private boolean f11615g = i.F().a();

    /* renamed from: h  reason: collision with root package name */
    private boolean f11616h = false;

    /* renamed from: i  reason: collision with root package name */
    private com.facebook.imagepipeline.common.a f11617i = com.facebook.imagepipeline.common.a.HIGH;

    /* renamed from: j  reason: collision with root package name */
    private sf.b f11618j = null;

    /* renamed from: k  reason: collision with root package name */
    private boolean f11619k = true;

    /* renamed from: l  reason: collision with root package name */
    private boolean f11620l = true;

    /* renamed from: m  reason: collision with root package name */
    private Boolean f11621m = null;

    /* renamed from: o  reason: collision with root package name */
    private p001if.a f11623o = null;

    /* renamed from: p  reason: collision with root package name */
    private Boolean f11624p = null;

    /* loaded from: classes3.dex */
    public static class BuilderException extends RuntimeException {
        public BuilderException(String str) {
            super("Invalid request builder: " + str);
        }
    }

    private ImageRequestBuilder() {
    }

    public static ImageRequestBuilder b(a aVar) {
        return s(aVar.s()).x(aVar.f()).u(aVar.c()).v(aVar.d()).y(aVar.g()).z(aVar.h()).A(aVar.i()).B(aVar.m()).D(aVar.l()).E(aVar.o()).C(aVar.n()).F(aVar.q()).G(aVar.x()).w(aVar.e());
    }

    public static ImageRequestBuilder s(Uri uri) {
        return new ImageRequestBuilder().H(uri);
    }

    public ImageRequestBuilder A(sf.b bVar) {
        this.f11618j = bVar;
        return this;
    }

    public ImageRequestBuilder B(boolean z11) {
        this.f11615g = z11;
        return this;
    }

    public ImageRequestBuilder C(e eVar) {
        this.f11622n = eVar;
        return this;
    }

    public ImageRequestBuilder D(com.facebook.imagepipeline.common.a aVar) {
        this.f11617i = aVar;
        return this;
    }

    public ImageRequestBuilder E(d dVar) {
        this.f11611c = dVar;
        return this;
    }

    public ImageRequestBuilder F(p001if.e eVar) {
        this.f11612d = eVar;
        return this;
    }

    public ImageRequestBuilder G(Boolean bool) {
        this.f11621m = bool;
        return this;
    }

    public ImageRequestBuilder H(Uri uri) {
        k.g(uri);
        this.f11609a = uri;
        return this;
    }

    public Boolean I() {
        return this.f11621m;
    }

    protected void J() {
        Uri uri = this.f11609a;
        if (uri != null) {
            if (ud.d.k(uri)) {
                if (this.f11609a.isAbsolute()) {
                    if (!this.f11609a.getPath().isEmpty()) {
                        try {
                            Integer.parseInt(this.f11609a.getPath().substring(1));
                        } catch (NumberFormatException unused) {
                            throw new BuilderException("Resource URI path must be a resource id.");
                        }
                    } else {
                        throw new BuilderException("Resource URI must not be empty");
                    }
                } else {
                    throw new BuilderException("Resource URI path must be absolute.");
                }
            }
            if (ud.d.f(this.f11609a) && !this.f11609a.isAbsolute()) {
                throw new BuilderException("Asset URI path must be absolute.");
            }
            return;
        }
        throw new BuilderException("Source must be set!");
    }

    public a a() {
        J();
        return new a(this);
    }

    public p001if.a c() {
        return this.f11623o;
    }

    public a.b d() {
        return this.f11614f;
    }

    public int e() {
        return this.f11625q;
    }

    public b f() {
        return this.f11613e;
    }

    public a.c g() {
        return this.f11610b;
    }

    public sf.b h() {
        return this.f11618j;
    }

    public e i() {
        return this.f11622n;
    }

    public com.facebook.imagepipeline.common.a j() {
        return this.f11617i;
    }

    public d k() {
        return this.f11611c;
    }

    public Boolean l() {
        return this.f11624p;
    }

    public p001if.e m() {
        return this.f11612d;
    }

    public Uri n() {
        return this.f11609a;
    }

    public boolean o() {
        return this.f11619k && ud.d.l(this.f11609a);
    }

    public boolean p() {
        return this.f11616h;
    }

    public boolean q() {
        return this.f11620l;
    }

    public boolean r() {
        return this.f11615g;
    }

    @Deprecated
    public ImageRequestBuilder t(boolean z11) {
        if (z11) {
            return F(p001if.e.a());
        }
        return F(p001if.e.d());
    }

    public ImageRequestBuilder u(p001if.a aVar) {
        this.f11623o = aVar;
        return this;
    }

    public ImageRequestBuilder v(a.b bVar) {
        this.f11614f = bVar;
        return this;
    }

    public ImageRequestBuilder w(int i11) {
        this.f11625q = i11;
        return this;
    }

    public ImageRequestBuilder x(b bVar) {
        this.f11613e = bVar;
        return this;
    }

    public ImageRequestBuilder y(boolean z11) {
        this.f11616h = z11;
        return this;
    }

    public ImageRequestBuilder z(a.c cVar) {
        this.f11610b = cVar;
        return this;
    }
}