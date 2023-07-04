package ke;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import java.util.List;
import je.q;
import md.k;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: r  reason: collision with root package name */
    public static final q.c f34579r = q.c.f33452d;

    /* renamed from: s  reason: collision with root package name */
    public static final q.c f34580s = q.c.f33453e;

    /* renamed from: a  reason: collision with root package name */
    private Resources f34581a;

    /* renamed from: b  reason: collision with root package name */
    private int f34582b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f34583c;

    /* renamed from: d  reason: collision with root package name */
    private q.c f34584d;

    /* renamed from: e  reason: collision with root package name */
    private Drawable f34585e;

    /* renamed from: f  reason: collision with root package name */
    private q.c f34586f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f34587g;

    /* renamed from: h  reason: collision with root package name */
    private q.c f34588h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f34589i;

    /* renamed from: j  reason: collision with root package name */
    private q.c f34590j;

    /* renamed from: k  reason: collision with root package name */
    private q.c f34591k;

    /* renamed from: l  reason: collision with root package name */
    private PointF f34592l;

    /* renamed from: m  reason: collision with root package name */
    private ColorFilter f34593m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f34594n;

    /* renamed from: o  reason: collision with root package name */
    private List<Drawable> f34595o;

    /* renamed from: p  reason: collision with root package name */
    private Drawable f34596p;

    /* renamed from: q  reason: collision with root package name */
    private d f34597q;

    public b(Resources resources) {
        this.f34581a = resources;
        s();
    }

    private void s() {
        this.f34582b = 300;
        this.f34583c = null;
        q.c cVar = f34579r;
        this.f34584d = cVar;
        this.f34585e = null;
        this.f34586f = cVar;
        this.f34587g = null;
        this.f34588h = cVar;
        this.f34589i = null;
        this.f34590j = cVar;
        this.f34591k = f34580s;
        this.f34592l = null;
        this.f34593m = null;
        this.f34594n = null;
        this.f34595o = null;
        this.f34596p = null;
        this.f34597q = null;
    }

    public static b t(Resources resources) {
        return new b(resources);
    }

    private void x() {
        List<Drawable> list = this.f34595o;
        if (list != null) {
            for (Drawable drawable : list) {
                k.g(drawable);
            }
        }
    }

    public a a() {
        x();
        return new a(this);
    }

    public ColorFilter b() {
        return this.f34593m;
    }

    public PointF c() {
        return this.f34592l;
    }

    public q.c d() {
        return this.f34591k;
    }

    public Drawable e() {
        return this.f34594n;
    }

    public int f() {
        return this.f34582b;
    }

    public Drawable g() {
        return this.f34587g;
    }

    public q.c h() {
        return this.f34588h;
    }

    public List<Drawable> i() {
        return this.f34595o;
    }

    public Drawable j() {
        return this.f34583c;
    }

    public q.c k() {
        return this.f34584d;
    }

    public Drawable l() {
        return this.f34596p;
    }

    public Drawable m() {
        return this.f34589i;
    }

    public q.c n() {
        return this.f34590j;
    }

    public Resources o() {
        return this.f34581a;
    }

    public Drawable p() {
        return this.f34585e;
    }

    public q.c q() {
        return this.f34586f;
    }

    public d r() {
        return this.f34597q;
    }

    public b u(q.c cVar) {
        this.f34591k = cVar;
        return this;
    }

    public b v(int i11) {
        this.f34582b = i11;
        return this;
    }

    public b w(d dVar) {
        this.f34597q = dVar;
        return this;
    }
}