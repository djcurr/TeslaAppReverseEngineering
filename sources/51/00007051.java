package ge;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fe.a;
import fe.c;
import java.util.Map;
import java.util.concurrent.Executor;
import je.f;
import le.a;
import md.g;
import md.j;
import md.k;
import xe.b;

/* loaded from: classes3.dex */
public abstract class a<T, INFO> implements me.a, a.InterfaceC0515a, a.InterfaceC0701a {

    /* renamed from: v  reason: collision with root package name */
    private static final Map<String, Object> f27908v = g.of("component_tag", "drawee");

    /* renamed from: w  reason: collision with root package name */
    private static final Map<String, Object> f27909w = g.of(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "memory_bitmap", "origin_sub", "shortcut");

    /* renamed from: x  reason: collision with root package name */
    private static final Class<?> f27910x = a.class;

    /* renamed from: b  reason: collision with root package name */
    private final fe.a f27912b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f27913c;

    /* renamed from: d  reason: collision with root package name */
    private fe.d f27914d;

    /* renamed from: e  reason: collision with root package name */
    private le.a f27915e;

    /* renamed from: f  reason: collision with root package name */
    protected d<INFO> f27916f;

    /* renamed from: h  reason: collision with root package name */
    protected xe.e f27918h;

    /* renamed from: i  reason: collision with root package name */
    private me.c f27919i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f27920j;

    /* renamed from: k  reason: collision with root package name */
    private String f27921k;

    /* renamed from: l  reason: collision with root package name */
    private Object f27922l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f27923m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f27924n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f27925o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f27926p;

    /* renamed from: q  reason: collision with root package name */
    private String f27927q;

    /* renamed from: r  reason: collision with root package name */
    private com.facebook.datasource.c<T> f27928r;

    /* renamed from: s  reason: collision with root package name */
    private T f27929s;

    /* renamed from: u  reason: collision with root package name */
    protected Drawable f27931u;

    /* renamed from: a  reason: collision with root package name */
    private final fe.c f27911a = fe.c.a();

    /* renamed from: g  reason: collision with root package name */
    protected xe.d<INFO> f27917g = new xe.d<>();

    /* renamed from: t  reason: collision with root package name */
    private boolean f27930t = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ge.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0529a implements f.a {
        C0529a() {
        }

        @Override // je.f.a
        public void a() {
            a aVar = a.this;
            xe.e eVar = aVar.f27918h;
            if (eVar != null) {
                eVar.b(aVar.f27921k);
            }
        }

        @Override // je.f.a
        public void b() {
        }

        @Override // je.f.a
        public void c() {
            a aVar = a.this;
            xe.e eVar = aVar.f27918h;
            if (eVar != null) {
                eVar.a(aVar.f27921k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends com.facebook.datasource.b<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27933a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f27934b;

        b(String str, boolean z11) {
            this.f27933a = str;
            this.f27934b = z11;
        }

        @Override // com.facebook.datasource.b
        public void onFailureImpl(com.facebook.datasource.c<T> cVar) {
            a.this.K(this.f27933a, cVar, cVar.c(), true);
        }

        @Override // com.facebook.datasource.b
        public void onNewResultImpl(com.facebook.datasource.c<T> cVar) {
            boolean a11 = cVar.a();
            boolean f11 = cVar.f();
            float e11 = cVar.e();
            T g11 = cVar.g();
            if (g11 != null) {
                a.this.M(this.f27933a, cVar, g11, e11, a11, this.f27934b, f11);
            } else if (a11) {
                a.this.K(this.f27933a, cVar, new NullPointerException(), true);
            }
        }

        @Override // com.facebook.datasource.b, com.facebook.datasource.e
        public void onProgressUpdate(com.facebook.datasource.c<T> cVar) {
            boolean a11 = cVar.a();
            a.this.N(this.f27933a, cVar, cVar.e(), a11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class c<INFO> extends f<INFO> {
        private c() {
        }

        public static <INFO> c<INFO> h(d<? super INFO> dVar, d<? super INFO> dVar2) {
            if (tf.b.d()) {
                tf.b.a("AbstractDraweeController#createInternal");
            }
            c<INFO> cVar = new c<>();
            cVar.b(dVar);
            cVar.b(dVar2);
            if (tf.b.d()) {
                tf.b.b();
            }
            return cVar;
        }
    }

    public a(fe.a aVar, Executor executor, String str, Object obj) {
        this.f27912b = aVar;
        this.f27913c = executor;
        C(str, obj);
    }

    private synchronized void C(String str, Object obj) {
        fe.a aVar;
        if (tf.b.d()) {
            tf.b.a("AbstractDraweeController#init");
        }
        this.f27911a.b(c.a.ON_INIT_CONTROLLER);
        if (!this.f27930t && (aVar = this.f27912b) != null) {
            aVar.a(this);
        }
        this.f27923m = false;
        P();
        this.f27926p = false;
        fe.d dVar = this.f27914d;
        if (dVar != null) {
            dVar.a();
        }
        le.a aVar2 = this.f27915e;
        if (aVar2 != null) {
            aVar2.a();
            this.f27915e.f(this);
        }
        d<INFO> dVar2 = this.f27916f;
        if (dVar2 instanceof c) {
            ((c) dVar2).c();
        } else {
            this.f27916f = null;
        }
        me.c cVar = this.f27919i;
        if (cVar != null) {
            cVar.reset();
            this.f27919i.f(null);
            this.f27919i = null;
        }
        this.f27920j = null;
        if (nd.a.u(2)) {
            nd.a.y(f27910x, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f27921k, str);
        }
        this.f27921k = str;
        this.f27922l = obj;
        if (tf.b.d()) {
            tf.b.b();
        }
        if (this.f27918h != null) {
            e0();
        }
    }

    private boolean E(String str, com.facebook.datasource.c<T> cVar) {
        if (cVar == null && this.f27928r == null) {
            return true;
        }
        return str.equals(this.f27921k) && cVar == this.f27928r && this.f27924n;
    }

    private void F(String str, Throwable th2) {
        if (nd.a.u(2)) {
            nd.a.z(f27910x, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f27921k, str, th2);
        }
    }

    private void G(String str, T t11) {
        if (nd.a.u(2)) {
            nd.a.A(f27910x, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f27921k, str, x(t11), Integer.valueOf(y(t11)));
        }
    }

    private b.a H(com.facebook.datasource.c<T> cVar, INFO info, Uri uri) {
        return I(cVar == null ? null : cVar.getExtras(), J(info), uri);
    }

    private b.a I(Map<String, Object> map, Map<String, Object> map2, Uri uri) {
        String str;
        PointF pointF;
        me.c cVar = this.f27919i;
        if (cVar instanceof ke.a) {
            String valueOf = String.valueOf(((ke.a) cVar).n());
            pointF = ((ke.a) this.f27919i).m();
            str = valueOf;
        } else {
            str = null;
            pointF = null;
        }
        return we.a.a(f27908v, f27909w, map, u(), str, pointF, map2, p(), uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(String str, com.facebook.datasource.c<T> cVar, Throwable th2, boolean z11) {
        Drawable drawable;
        if (tf.b.d()) {
            tf.b.a("AbstractDraweeController#onFailureInternal");
        }
        if (!E(str, cVar)) {
            F("ignore_old_datasource @ onFailure", th2);
            cVar.close();
            if (tf.b.d()) {
                tf.b.b();
                return;
            }
            return;
        }
        this.f27911a.b(z11 ? c.a.ON_DATASOURCE_FAILURE : c.a.ON_DATASOURCE_FAILURE_INT);
        if (z11) {
            F("final_failed @ onFailure", th2);
            this.f27928r = null;
            this.f27925o = true;
            if (this.f27926p && (drawable = this.f27931u) != null) {
                this.f27919i.e(drawable, 1.0f, true);
            } else if (g0()) {
                this.f27919i.a(th2);
            } else {
                this.f27919i.b(th2);
            }
            T(th2, cVar);
        } else {
            F("intermediate_failed @ onFailure", th2);
            U(th2);
        }
        if (tf.b.d()) {
            tf.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(String str, com.facebook.datasource.c<T> cVar, T t11, float f11, boolean z11, boolean z12, boolean z13) {
        try {
            if (tf.b.d()) {
                tf.b.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!E(str, cVar)) {
                G("ignore_old_datasource @ onNewResult", t11);
                Q(t11);
                cVar.close();
                if (tf.b.d()) {
                    tf.b.b();
                    return;
                }
                return;
            }
            this.f27911a.b(z11 ? c.a.ON_DATASOURCE_RESULT : c.a.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable m11 = m(t11);
                T t12 = this.f27929s;
                Drawable drawable = this.f27931u;
                this.f27929s = t11;
                this.f27931u = m11;
                if (z11) {
                    G("set_final_result @ onNewResult", t11);
                    this.f27928r = null;
                    this.f27919i.e(m11, 1.0f, z12);
                    Y(str, t11, cVar);
                } else if (z13) {
                    G("set_temporary_result @ onNewResult", t11);
                    this.f27919i.e(m11, 1.0f, z12);
                    Y(str, t11, cVar);
                } else {
                    G("set_intermediate_result @ onNewResult", t11);
                    this.f27919i.e(m11, f11, z12);
                    V(str, t11);
                }
                if (drawable != null && drawable != m11) {
                    O(drawable);
                }
                if (t12 != null && t12 != t11) {
                    G("release_previous_result @ onNewResult", t12);
                    Q(t12);
                }
                if (tf.b.d()) {
                    tf.b.b();
                }
            } catch (Exception e11) {
                G("drawable_failed @ onNewResult", t11);
                Q(t11);
                K(str, cVar, e11, z11);
                if (tf.b.d()) {
                    tf.b.b();
                }
            }
        } catch (Throwable th2) {
            if (tf.b.d()) {
                tf.b.b();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(String str, com.facebook.datasource.c<T> cVar, float f11, boolean z11) {
        if (!E(str, cVar)) {
            F("ignore_old_datasource @ onProgress", null);
            cVar.close();
        } else if (z11) {
        } else {
            this.f27919i.c(f11, false);
        }
    }

    private void P() {
        Map<String, Object> map;
        boolean z11 = this.f27924n;
        this.f27924n = false;
        this.f27925o = false;
        com.facebook.datasource.c<T> cVar = this.f27928r;
        Map<String, Object> map2 = null;
        if (cVar != null) {
            map = cVar.getExtras();
            this.f27928r.close();
            this.f27928r = null;
        } else {
            map = null;
        }
        Drawable drawable = this.f27931u;
        if (drawable != null) {
            O(drawable);
        }
        if (this.f27927q != null) {
            this.f27927q = null;
        }
        this.f27931u = null;
        T t11 = this.f27929s;
        if (t11 != null) {
            Map<String, Object> J = J(z(t11));
            G("release", this.f27929s);
            Q(this.f27929s);
            this.f27929s = null;
            map2 = J;
        }
        if (z11) {
            W(map, map2);
        }
    }

    private void T(Throwable th2, com.facebook.datasource.c<T> cVar) {
        b.a H = H(cVar, null, null);
        q().e(this.f27921k, th2);
        r().j(this.f27921k, th2, H);
    }

    private void U(Throwable th2) {
        q().q(this.f27921k, th2);
        r().p(this.f27921k);
    }

    private void V(String str, T t11) {
        INFO z11 = z(t11);
        q().a(str, z11);
        r().a(str, z11);
    }

    private void W(Map<String, Object> map, Map<String, Object> map2) {
        q().f(this.f27921k);
        r().l(this.f27921k, I(map, map2, null));
    }

    private void Y(String str, T t11, com.facebook.datasource.c<T> cVar) {
        INFO z11 = z(t11);
        q().l(str, z11, n());
        r().m(str, z11, H(cVar, z11, null));
    }

    private void e0() {
        me.c cVar = this.f27919i;
        if (cVar instanceof ke.a) {
            ((ke.a) cVar).z(new C0529a());
        }
    }

    private boolean g0() {
        fe.d dVar;
        return this.f27925o && (dVar = this.f27914d) != null && dVar.e();
    }

    private Rect u() {
        me.c cVar = this.f27919i;
        if (cVar == null) {
            return null;
        }
        return cVar.getBounds();
    }

    protected Uri A() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public fe.d B() {
        if (this.f27914d == null) {
            this.f27914d = new fe.d();
        }
        return this.f27914d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D(String str, Object obj) {
        C(str, obj);
        this.f27930t = false;
    }

    public abstract Map<String, Object> J(INFO info);

    /* JADX INFO: Access modifiers changed from: protected */
    public void L(String str, T t11) {
    }

    protected abstract void O(Drawable drawable);

    protected abstract void Q(T t11);

    public void R(d<? super INFO> dVar) {
        k.g(dVar);
        d<INFO> dVar2 = this.f27916f;
        if (dVar2 instanceof c) {
            ((c) dVar2).g(dVar);
        } else if (dVar2 == dVar) {
            this.f27916f = null;
        }
    }

    public void S(xe.b<INFO> bVar) {
        this.f27917g.J(bVar);
    }

    protected void X(com.facebook.datasource.c<T> cVar, INFO info) {
        q().p(this.f27921k, this.f27922l);
        r().g(this.f27921k, this.f27922l, H(cVar, info, A()));
    }

    public void Z(String str) {
        this.f27927q = str;
    }

    @Override // me.a
    public void a() {
        if (tf.b.d()) {
            tf.b.a("AbstractDraweeController#onDetach");
        }
        if (nd.a.u(2)) {
            nd.a.x(f27910x, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f27921k);
        }
        this.f27911a.b(c.a.ON_DETACH_CONTROLLER);
        this.f27923m = false;
        this.f27912b.d(this);
        if (tf.b.d()) {
            tf.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a0(Drawable drawable) {
        this.f27920j = drawable;
        me.c cVar = this.f27919i;
        if (cVar != null) {
            cVar.f(drawable);
        }
    }

    @Override // me.a
    public boolean b(MotionEvent motionEvent) {
        if (nd.a.u(2)) {
            nd.a.y(f27910x, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f27921k, motionEvent);
        }
        le.a aVar = this.f27915e;
        if (aVar == null) {
            return false;
        }
        if (aVar.b() || f0()) {
            this.f27915e.d(motionEvent);
            return true;
        }
        return false;
    }

    public void b0(e eVar) {
    }

    @Override // le.a.InterfaceC0701a
    public boolean c() {
        if (nd.a.u(2)) {
            nd.a.x(f27910x, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f27921k);
        }
        if (g0()) {
            this.f27914d.b();
            this.f27919i.reset();
            h0();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c0(le.a aVar) {
        this.f27915e = aVar;
        if (aVar != null) {
            aVar.f(this);
        }
    }

    @Override // me.a
    public void d() {
        if (tf.b.d()) {
            tf.b.a("AbstractDraweeController#onAttach");
        }
        if (nd.a.u(2)) {
            nd.a.y(f27910x, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.f27921k, this.f27924n ? "request already submitted" : "request needs submit");
        }
        this.f27911a.b(c.a.ON_ATTACH_CONTROLLER);
        k.g(this.f27919i);
        this.f27912b.a(this);
        this.f27923m = true;
        if (!this.f27924n) {
            h0();
        }
        if (tf.b.d()) {
            tf.b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d0(boolean z11) {
        this.f27926p = z11;
    }

    @Override // me.a
    public me.b e() {
        return this.f27919i;
    }

    @Override // me.a
    public void f(me.b bVar) {
        if (nd.a.u(2)) {
            nd.a.y(f27910x, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f27921k, bVar);
        }
        this.f27911a.b(bVar != null ? c.a.ON_SET_HIERARCHY : c.a.ON_CLEAR_HIERARCHY);
        if (this.f27924n) {
            this.f27912b.a(this);
            release();
        }
        me.c cVar = this.f27919i;
        if (cVar != null) {
            cVar.f(null);
            this.f27919i = null;
        }
        if (bVar != null) {
            k.b(Boolean.valueOf(bVar instanceof me.c));
            me.c cVar2 = (me.c) bVar;
            this.f27919i = cVar2;
            cVar2.f(this.f27920j);
        }
        if (this.f27918h != null) {
            e0();
        }
    }

    protected boolean f0() {
        return g0();
    }

    protected void h0() {
        if (tf.b.d()) {
            tf.b.a("AbstractDraweeController#submitRequest");
        }
        T o11 = o();
        if (o11 != null) {
            if (tf.b.d()) {
                tf.b.a("AbstractDraweeController#submitRequest->cache");
            }
            this.f27928r = null;
            this.f27924n = true;
            this.f27925o = false;
            this.f27911a.b(c.a.ON_SUBMIT_CACHE_HIT);
            X(this.f27928r, z(o11));
            L(this.f27921k, o11);
            M(this.f27921k, this.f27928r, o11, 1.0f, true, true, true);
            if (tf.b.d()) {
                tf.b.b();
            }
            if (tf.b.d()) {
                tf.b.b();
                return;
            }
            return;
        }
        this.f27911a.b(c.a.ON_DATASOURCE_SUBMIT);
        this.f27919i.c(BitmapDescriptorFactory.HUE_RED, true);
        this.f27924n = true;
        this.f27925o = false;
        com.facebook.datasource.c<T> t11 = t();
        this.f27928r = t11;
        X(t11, null);
        if (nd.a.u(2)) {
            nd.a.y(f27910x, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f27921k, Integer.valueOf(System.identityHashCode(this.f27928r)));
        }
        this.f27928r.d(new b(this.f27921k, this.f27928r.b()), this.f27913c);
        if (tf.b.d()) {
            tf.b.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(d<? super INFO> dVar) {
        k.g(dVar);
        d<INFO> dVar2 = this.f27916f;
        if (dVar2 instanceof c) {
            ((c) dVar2).b(dVar);
        } else if (dVar2 != null) {
            this.f27916f = c.h(dVar2, dVar);
        } else {
            this.f27916f = dVar;
        }
    }

    public void l(xe.b<INFO> bVar) {
        this.f27917g.C(bVar);
    }

    protected abstract Drawable m(T t11);

    public Animatable n() {
        Drawable drawable = this.f27931u;
        if (drawable instanceof Animatable) {
            return (Animatable) drawable;
        }
        return null;
    }

    protected T o() {
        return null;
    }

    public Object p() {
        return this.f27922l;
    }

    protected d<INFO> q() {
        d<INFO> dVar = this.f27916f;
        return dVar == null ? ge.c.b() : dVar;
    }

    protected xe.b<INFO> r() {
        return this.f27917g;
    }

    @Override // fe.a.InterfaceC0515a
    public void release() {
        this.f27911a.b(c.a.ON_RELEASE_CONTROLLER);
        fe.d dVar = this.f27914d;
        if (dVar != null) {
            dVar.c();
        }
        le.a aVar = this.f27915e;
        if (aVar != null) {
            aVar.e();
        }
        me.c cVar = this.f27919i;
        if (cVar != null) {
            cVar.reset();
        }
        P();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Drawable s() {
        return this.f27920j;
    }

    protected abstract com.facebook.datasource.c<T> t();

    public String toString() {
        return j.c(this).c("isAttached", this.f27923m).c("isRequestSubmitted", this.f27924n).c("hasFetchFailed", this.f27925o).a("fetchedImage", y(this.f27929s)).b("events", this.f27911a.toString()).toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public le.a v() {
        return this.f27915e;
    }

    public String w() {
        return this.f27921k;
    }

    protected String x(T t11) {
        return t11 != null ? t11.getClass().getSimpleName() : "<null>";
    }

    protected int y(T t11) {
        return System.identityHashCode(t11);
    }

    protected abstract INFO z(T t11);
}