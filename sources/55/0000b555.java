package ti;

import ci.i;
import ei.s;
import ti.i0;

/* loaded from: classes3.dex */
public final class t implements m {

    /* renamed from: a  reason: collision with root package name */
    private final ak.v f52272a;

    /* renamed from: b  reason: collision with root package name */
    private final s.a f52273b;

    /* renamed from: c  reason: collision with root package name */
    private final String f52274c;

    /* renamed from: d  reason: collision with root package name */
    private ji.x f52275d;

    /* renamed from: e  reason: collision with root package name */
    private String f52276e;

    /* renamed from: f  reason: collision with root package name */
    private int f52277f;

    /* renamed from: g  reason: collision with root package name */
    private int f52278g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f52279h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f52280i;

    /* renamed from: j  reason: collision with root package name */
    private long f52281j;

    /* renamed from: k  reason: collision with root package name */
    private int f52282k;

    /* renamed from: l  reason: collision with root package name */
    private long f52283l;

    public t() {
        this(null);
    }

    private void b(ak.v vVar) {
        byte[] d11 = vVar.d();
        int f11 = vVar.f();
        for (int e11 = vVar.e(); e11 < f11; e11++) {
            boolean z11 = (d11[e11] & 255) == 255;
            boolean z12 = this.f52280i && (d11[e11] & 224) == 224;
            this.f52280i = z11;
            if (z12) {
                vVar.O(e11 + 1);
                this.f52280i = false;
                this.f52272a.d()[1] = d11[e11];
                this.f52278g = 2;
                this.f52277f = 1;
                return;
            }
        }
        vVar.O(f11);
    }

    private void g(ak.v vVar) {
        int min = Math.min(vVar.a(), this.f52282k - this.f52278g);
        this.f52275d.e(vVar, min);
        int i11 = this.f52278g + min;
        this.f52278g = i11;
        int i12 = this.f52282k;
        if (i11 < i12) {
            return;
        }
        this.f52275d.f(this.f52283l, 1, i12, 0, null);
        this.f52283l += this.f52281j;
        this.f52278g = 0;
        this.f52277f = 0;
    }

    private void h(ak.v vVar) {
        int min = Math.min(vVar.a(), 4 - this.f52278g);
        vVar.j(this.f52272a.d(), this.f52278g, min);
        int i11 = this.f52278g + min;
        this.f52278g = i11;
        if (i11 < 4) {
            return;
        }
        this.f52272a.O(0);
        if (!this.f52273b.a(this.f52272a.m())) {
            this.f52278g = 0;
            this.f52277f = 1;
            return;
        }
        s.a aVar = this.f52273b;
        this.f52282k = aVar.f25180c;
        if (!this.f52279h) {
            this.f52281j = (aVar.f25184g * 1000000) / aVar.f25181d;
            this.f52275d.d(new i.b().S(this.f52276e).e0(this.f52273b.f25179b).W(4096).H(this.f52273b.f25182e).f0(this.f52273b.f25181d).V(this.f52274c).E());
            this.f52279h = true;
        }
        this.f52272a.O(0);
        this.f52275d.e(this.f52272a, 4);
        this.f52277f = 2;
    }

    @Override // ti.m
    public void a() {
        this.f52277f = 0;
        this.f52278g = 0;
        this.f52280i = false;
    }

    @Override // ti.m
    public void c(ak.v vVar) {
        ak.a.h(this.f52275d);
        while (vVar.a() > 0) {
            int i11 = this.f52277f;
            if (i11 == 0) {
                b(vVar);
            } else if (i11 == 1) {
                h(vVar);
            } else if (i11 == 2) {
                g(vVar);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // ti.m
    public void d() {
    }

    @Override // ti.m
    public void e(ji.j jVar, i0.d dVar) {
        dVar.a();
        this.f52276e = dVar.b();
        this.f52275d = jVar.f(dVar.c(), 1);
    }

    @Override // ti.m
    public void f(long j11, int i11) {
        this.f52283l = j11;
    }

    public t(String str) {
        this.f52277f = 0;
        ak.v vVar = new ak.v(4);
        this.f52272a = vVar;
        vVar.d()[0] = -1;
        this.f52273b = new s.a();
        this.f52274c = str;
    }
}