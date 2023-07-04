package qi;

import ak.v;

/* loaded from: classes3.dex */
final class q {

    /* renamed from: a  reason: collision with root package name */
    public c f48307a;

    /* renamed from: b  reason: collision with root package name */
    public long f48308b;

    /* renamed from: c  reason: collision with root package name */
    public long f48309c;

    /* renamed from: d  reason: collision with root package name */
    public long f48310d;

    /* renamed from: e  reason: collision with root package name */
    public int f48311e;

    /* renamed from: f  reason: collision with root package name */
    public int f48312f;

    /* renamed from: m  reason: collision with root package name */
    public boolean f48319m;

    /* renamed from: o  reason: collision with root package name */
    public p f48321o;

    /* renamed from: q  reason: collision with root package name */
    public boolean f48323q;

    /* renamed from: r  reason: collision with root package name */
    public long f48324r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f48325s;

    /* renamed from: g  reason: collision with root package name */
    public long[] f48313g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public int[] f48314h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public int[] f48315i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public int[] f48316j = new int[0];

    /* renamed from: k  reason: collision with root package name */
    public long[] f48317k = new long[0];

    /* renamed from: l  reason: collision with root package name */
    public boolean[] f48318l = new boolean[0];

    /* renamed from: n  reason: collision with root package name */
    public boolean[] f48320n = new boolean[0];

    /* renamed from: p  reason: collision with root package name */
    public final v f48322p = new v();

    public void a(v vVar) {
        vVar.j(this.f48322p.d(), 0, this.f48322p.f());
        this.f48322p.O(0);
        this.f48323q = false;
    }

    public void b(ji.i iVar) {
        iVar.readFully(this.f48322p.d(), 0, this.f48322p.f());
        this.f48322p.O(0);
        this.f48323q = false;
    }

    public long c(int i11) {
        return this.f48317k[i11] + this.f48316j[i11];
    }

    public void d(int i11) {
        this.f48322p.K(i11);
        this.f48319m = true;
        this.f48323q = true;
    }

    public void e(int i11, int i12) {
        this.f48311e = i11;
        this.f48312f = i12;
        if (this.f48314h.length < i11) {
            this.f48313g = new long[i11];
            this.f48314h = new int[i11];
        }
        if (this.f48315i.length < i12) {
            int i13 = (i12 * 125) / 100;
            this.f48315i = new int[i13];
            this.f48316j = new int[i13];
            this.f48317k = new long[i13];
            this.f48318l = new boolean[i13];
            this.f48320n = new boolean[i13];
        }
    }

    public void f() {
        this.f48311e = 0;
        this.f48324r = 0L;
        this.f48325s = false;
        this.f48319m = false;
        this.f48323q = false;
        this.f48321o = null;
    }

    public boolean g(int i11) {
        return this.f48319m && this.f48320n[i11];
    }
}