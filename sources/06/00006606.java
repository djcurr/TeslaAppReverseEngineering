package dn;

import com.google.firebase.d;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.remoteconfig.c;
import en.f;
import javax.inject.Provider;
import nh.g;
import tm.e;
import tw.h;

/* loaded from: classes2.dex */
public final class a implements dn.b {

    /* renamed from: a  reason: collision with root package name */
    private Provider<d> f24203a;

    /* renamed from: b  reason: collision with root package name */
    private Provider<sm.b<c>> f24204b;

    /* renamed from: c  reason: collision with root package name */
    private Provider<e> f24205c;

    /* renamed from: d  reason: collision with root package name */
    private Provider<sm.b<g>> f24206d;

    /* renamed from: e  reason: collision with root package name */
    private Provider<RemoteConfigManager> f24207e;

    /* renamed from: f  reason: collision with root package name */
    private Provider<com.google.firebase.perf.config.a> f24208f;

    /* renamed from: g  reason: collision with root package name */
    private Provider<SessionManager> f24209g;

    /* renamed from: h  reason: collision with root package name */
    private Provider<cn.c> f24210h;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private en.a f24211a;

        public dn.b a() {
            h.a(this.f24211a, en.a.class);
            return new a(this.f24211a);
        }

        public b b(en.a aVar) {
            this.f24211a = (en.a) h.b(aVar);
            return this;
        }

        private b() {
        }
    }

    public static b b() {
        return new b();
    }

    private void c(en.a aVar) {
        this.f24203a = en.c.a(aVar);
        this.f24204b = en.e.a(aVar);
        this.f24205c = en.d.a(aVar);
        this.f24206d = en.h.a(aVar);
        this.f24207e = f.a(aVar);
        this.f24208f = en.b.a(aVar);
        en.g a11 = en.g.a(aVar);
        this.f24209g = a11;
        this.f24210h = tw.d.b(cn.e.a(this.f24203a, this.f24204b, this.f24205c, this.f24206d, this.f24207e, this.f24208f, a11));
    }

    @Override // dn.b
    public cn.c a() {
        return this.f24210h.get();
    }

    private a(en.a aVar) {
        c(aVar);
    }
}