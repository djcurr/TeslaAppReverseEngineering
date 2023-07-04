package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.c;
import com.bumptech.glide.f;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import la.a;
import la.i;
import va.p;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c */
    private com.bumptech.glide.load.engine.j f10457c;

    /* renamed from: d */
    private ka.e f10458d;

    /* renamed from: e */
    private ka.b f10459e;

    /* renamed from: f */
    private la.h f10460f;

    /* renamed from: g */
    private ma.a f10461g;

    /* renamed from: h */
    private ma.a f10462h;

    /* renamed from: i */
    private a.InterfaceC0700a f10463i;

    /* renamed from: j */
    private la.i f10464j;

    /* renamed from: k */
    private va.d f10465k;

    /* renamed from: n */
    private p.b f10468n;

    /* renamed from: o */
    private ma.a f10469o;

    /* renamed from: p */
    private boolean f10470p;

    /* renamed from: q */
    private List<com.bumptech.glide.request.g<Object>> f10471q;

    /* renamed from: a */
    private final Map<Class<?>, l<?, ?>> f10455a = new androidx.collection.a();

    /* renamed from: b */
    private final f.a f10456b = new f.a();

    /* renamed from: l */
    private int f10466l = 4;

    /* renamed from: m */
    private c.a f10467m = new a(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements c.a {
        a(d dVar) {
        }

        @Override // com.bumptech.glide.c.a
        public com.bumptech.glide.request.h build() {
            return new com.bumptech.glide.request.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {
        b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
    }

    /* renamed from: com.bumptech.glide.d$d */
    /* loaded from: classes.dex */
    public static final class C0199d {
        private C0199d() {
        }
    }

    public com.bumptech.glide.c a(Context context) {
        if (this.f10461g == null) {
            this.f10461g = ma.a.g();
        }
        if (this.f10462h == null) {
            this.f10462h = ma.a.e();
        }
        if (this.f10469o == null) {
            this.f10469o = ma.a.c();
        }
        if (this.f10464j == null) {
            this.f10464j = new i.a(context).a();
        }
        if (this.f10465k == null) {
            this.f10465k = new va.f();
        }
        if (this.f10458d == null) {
            int b11 = this.f10464j.b();
            if (b11 > 0) {
                this.f10458d = new ka.k(b11);
            } else {
                this.f10458d = new ka.f();
            }
        }
        if (this.f10459e == null) {
            this.f10459e = new ka.j(this.f10464j.a());
        }
        if (this.f10460f == null) {
            this.f10460f = new la.g(this.f10464j.d());
        }
        if (this.f10463i == null) {
            this.f10463i = new la.f(context);
        }
        if (this.f10457c == null) {
            this.f10457c = new com.bumptech.glide.load.engine.j(this.f10460f, this.f10463i, this.f10462h, this.f10461g, ma.a.h(), this.f10469o, this.f10470p);
        }
        List<com.bumptech.glide.request.g<Object>> list = this.f10471q;
        if (list == null) {
            this.f10471q = Collections.emptyList();
        } else {
            this.f10471q = Collections.unmodifiableList(list);
        }
        f b12 = this.f10456b.b();
        return new com.bumptech.glide.c(context, this.f10457c, this.f10460f, this.f10458d, this.f10459e, new p(this.f10468n, b12), this.f10465k, this.f10466l, this.f10467m, this.f10455a, this.f10471q, b12);
    }

    public void b(p.b bVar) {
        this.f10468n = bVar;
    }
}