package ge;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.datasource.g;
import ge.b;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import md.j;
import md.k;
import md.n;

/* loaded from: classes3.dex */
public abstract class b<BUILDER extends b<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements me.d {

    /* renamed from: q  reason: collision with root package name */
    private static final d<Object> f27936q = new a();

    /* renamed from: r  reason: collision with root package name */
    private static final NullPointerException f27937r = new NullPointerException("No image request was specified!");

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicLong f27938s = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    private final Context f27939a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<d> f27940b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<xe.b> f27941c;

    /* renamed from: d  reason: collision with root package name */
    private Object f27942d;

    /* renamed from: e  reason: collision with root package name */
    private REQUEST f27943e;

    /* renamed from: f  reason: collision with root package name */
    private REQUEST f27944f;

    /* renamed from: g  reason: collision with root package name */
    private REQUEST[] f27945g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f27946h;

    /* renamed from: i  reason: collision with root package name */
    private n<com.facebook.datasource.c<IMAGE>> f27947i;

    /* renamed from: j  reason: collision with root package name */
    private d<? super INFO> f27948j;

    /* renamed from: k  reason: collision with root package name */
    private e f27949k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f27950l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f27951m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f27952n;

    /* renamed from: o  reason: collision with root package name */
    private String f27953o;

    /* renamed from: p  reason: collision with root package name */
    private me.a f27954p;

    /* loaded from: classes3.dex */
    static class a extends ge.c<Object> {
        a() {
        }

        @Override // ge.c, ge.d
        public void l(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ge.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0530b implements n<com.facebook.datasource.c<IMAGE>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ me.a f27955a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f27956b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f27957c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f27958d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ c f27959e;

        C0530b(me.a aVar, String str, Object obj, Object obj2, c cVar) {
            this.f27955a = aVar;
            this.f27956b = str;
            this.f27957c = obj;
            this.f27958d = obj2;
            this.f27959e = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // md.n
        /* renamed from: a */
        public com.facebook.datasource.c<IMAGE> get() {
            return b.this.i(this.f27955a, this.f27956b, this.f27957c, this.f27958d, this.f27959e);
        }

        public String toString() {
            return j.c(this).b("request", this.f27957c.toString()).toString();
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Context context, Set<d> set, Set<xe.b> set2) {
        this.f27939a = context;
        this.f27940b = set;
        this.f27941c = set2;
        s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String e() {
        return String.valueOf(f27938s.getAndIncrement());
    }

    private void s() {
        this.f27942d = null;
        this.f27943e = null;
        this.f27944f = null;
        this.f27945g = null;
        this.f27946h = true;
        this.f27948j = null;
        this.f27949k = null;
        this.f27950l = false;
        this.f27951m = false;
        this.f27954p = null;
        this.f27953o = null;
    }

    public BUILDER A(Object obj) {
        this.f27942d = obj;
        return r();
    }

    public BUILDER B(d<? super INFO> dVar) {
        this.f27948j = dVar;
        return r();
    }

    public BUILDER C(REQUEST request) {
        this.f27943e = request;
        return r();
    }

    public BUILDER D(REQUEST request) {
        this.f27944f = request;
        return r();
    }

    @Override // me.d
    /* renamed from: E */
    public BUILDER b(me.a aVar) {
        this.f27954p = aVar;
        return r();
    }

    protected void F() {
        boolean z11 = false;
        k.j(this.f27945g == null || this.f27943e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f27947i == null || (this.f27945g == null && this.f27943e == null && this.f27944f == null)) {
            z11 = true;
        }
        k.j(z11, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    @Override // me.d
    /* renamed from: c */
    public ge.a build() {
        REQUEST request;
        F();
        if (this.f27943e == null && this.f27945g == null && (request = this.f27944f) != null) {
            this.f27943e = request;
            this.f27944f = null;
        }
        return d();
    }

    protected ge.a d() {
        if (tf.b.d()) {
            tf.b.a("AbstractDraweeControllerBuilder#buildController");
        }
        ge.a w11 = w();
        w11.d0(q());
        w11.Z(g());
        w11.b0(h());
        v(w11);
        t(w11);
        if (tf.b.d()) {
            tf.b.b();
        }
        return w11;
    }

    public Object f() {
        return this.f27942d;
    }

    public String g() {
        return this.f27953o;
    }

    public e h() {
        return this.f27949k;
    }

    protected abstract com.facebook.datasource.c<IMAGE> i(me.a aVar, String str, REQUEST request, Object obj, c cVar);

    protected n<com.facebook.datasource.c<IMAGE>> j(me.a aVar, String str, REQUEST request) {
        return k(aVar, str, request, c.FULL_FETCH);
    }

    protected n<com.facebook.datasource.c<IMAGE>> k(me.a aVar, String str, REQUEST request, c cVar) {
        return new C0530b(aVar, str, request, f(), cVar);
    }

    protected n<com.facebook.datasource.c<IMAGE>> l(me.a aVar, String str, REQUEST[] requestArr, boolean z11) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z11) {
            for (REQUEST request : requestArr) {
                arrayList.add(k(aVar, str, request, c.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(j(aVar, str, request2));
        }
        return com.facebook.datasource.f.b(arrayList);
    }

    public REQUEST[] m() {
        return this.f27945g;
    }

    public REQUEST n() {
        return this.f27943e;
    }

    public REQUEST o() {
        return this.f27944f;
    }

    public me.a p() {
        return this.f27954p;
    }

    public boolean q() {
        return this.f27952n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final BUILDER r() {
        return this;
    }

    protected void t(ge.a aVar) {
        Set<d> set = this.f27940b;
        if (set != null) {
            for (d dVar : set) {
                aVar.k(dVar);
            }
        }
        Set<xe.b> set2 = this.f27941c;
        if (set2 != null) {
            for (xe.b bVar : set2) {
                aVar.l(bVar);
            }
        }
        d<? super INFO> dVar2 = this.f27948j;
        if (dVar2 != null) {
            aVar.k(dVar2);
        }
        if (this.f27951m) {
            aVar.k(f27936q);
        }
    }

    protected void u(ge.a aVar) {
        if (aVar.v() == null) {
            aVar.c0(le.a.c(this.f27939a));
        }
    }

    protected void v(ge.a aVar) {
        if (this.f27950l) {
            aVar.B().d(this.f27950l);
            u(aVar);
        }
    }

    protected abstract ge.a w();

    /* JADX INFO: Access modifiers changed from: protected */
    public n<com.facebook.datasource.c<IMAGE>> x(me.a aVar, String str) {
        n<com.facebook.datasource.c<IMAGE>> nVar = this.f27947i;
        if (nVar != null) {
            return nVar;
        }
        n<com.facebook.datasource.c<IMAGE>> nVar2 = null;
        REQUEST request = this.f27943e;
        if (request != null) {
            nVar2 = j(aVar, str, request);
        } else {
            REQUEST[] requestArr = this.f27945g;
            if (requestArr != null) {
                nVar2 = l(aVar, str, requestArr, this.f27946h);
            }
        }
        if (nVar2 != null && this.f27944f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(nVar2);
            arrayList.add(j(aVar, str, this.f27944f));
            nVar2 = g.c(arrayList, false);
        }
        return nVar2 == null ? com.facebook.datasource.d.a(f27937r) : nVar2;
    }

    public BUILDER y() {
        s();
        return r();
    }

    public BUILDER z(boolean z11) {
        this.f27951m = z11;
        return r();
    }
}