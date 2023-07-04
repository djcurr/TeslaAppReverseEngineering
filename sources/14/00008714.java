package mq;

import mq.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n extends m {

    /* renamed from: b  reason: collision with root package name */
    private final a0 f38788b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38789c;

    /* renamed from: d  reason: collision with root package name */
    private final int f38790d;

    /* renamed from: e  reason: collision with root package name */
    private final int f38791e;

    /* renamed from: f  reason: collision with root package name */
    private int f38792f;

    /* renamed from: g  reason: collision with root package name */
    private int f38793g;

    /* renamed from: h  reason: collision with root package name */
    private b f38794h;

    /* renamed from: i  reason: collision with root package name */
    private b f38795i;

    /* renamed from: j  reason: collision with root package name */
    private b f38796j;

    /* renamed from: k  reason: collision with root package name */
    private b f38797k;

    /* renamed from: l  reason: collision with root package name */
    private c f38798l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(a0 a0Var, int i11, String str, String str2, String str3, Object obj) {
        super(589824);
        this.f38788b = a0Var;
        this.f38789c = i11;
        this.f38790d = a0Var.D(str);
        this.f38791e = a0Var.D(str2);
        if (str3 != null) {
            this.f38792f = a0Var.D(str3);
        }
        if (obj != null) {
            this.f38793g = a0Var.d(obj).f38895a;
        }
    }

    @Override // mq.m
    public a a(String str, boolean z11) {
        if (z11) {
            b j11 = b.j(this.f38788b, str, this.f38794h);
            this.f38794h = j11;
            return j11;
        }
        b j12 = b.j(this.f38788b, str, this.f38795i);
        this.f38795i = j12;
        return j12;
    }

    @Override // mq.m
    public void b(c cVar) {
        cVar.f38721c = this.f38798l;
        this.f38798l = cVar;
    }

    @Override // mq.m
    public void c() {
    }

    @Override // mq.m
    public a d(int i11, c0 c0Var, String str, boolean z11) {
        if (z11) {
            b i12 = b.i(this.f38788b, i11, c0Var, str, this.f38796j);
            this.f38796j = i12;
            return i12;
        }
        b i13 = b.i(this.f38788b, i11, c0Var, str, this.f38797k);
        this.f38797k = i13;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(c.a aVar) {
        aVar.b(this.f38798l);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        int i11;
        if (this.f38793g != 0) {
            this.f38788b.D("ConstantValue");
            i11 = 16;
        } else {
            i11 = 8;
        }
        int b11 = i11 + c.b(this.f38788b, this.f38789c, this.f38792f) + b.g(this.f38794h, this.f38795i, this.f38796j, this.f38797k);
        c cVar = this.f38798l;
        return cVar != null ? b11 + cVar.a(this.f38788b) : b11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(d dVar) {
        boolean z11 = this.f38788b.R() < 49;
        dVar.k((~(z11 ? 4096 : 0)) & this.f38789c).k(this.f38790d).k(this.f38791e);
        int i11 = this.f38793g != 0 ? 1 : 0;
        int i12 = this.f38789c;
        if ((i12 & 4096) != 0 && z11) {
            i11++;
        }
        if (this.f38792f != 0) {
            i11++;
        }
        if ((131072 & i12) != 0) {
            i11++;
        }
        if (this.f38794h != null) {
            i11++;
        }
        if (this.f38795i != null) {
            i11++;
        }
        if (this.f38796j != null) {
            i11++;
        }
        if (this.f38797k != null) {
            i11++;
        }
        c cVar = this.f38798l;
        if (cVar != null) {
            i11 += cVar.d();
        }
        dVar.k(i11);
        if (this.f38793g != 0) {
            dVar.k(this.f38788b.D("ConstantValue")).i(2).k(this.f38793g);
        }
        c.f(this.f38788b, this.f38789c, this.f38792f, dVar);
        b.l(this.f38788b, this.f38794h, this.f38795i, this.f38796j, this.f38797k, dVar);
        c cVar2 = this.f38798l;
        if (cVar2 != null) {
            cVar2.g(this.f38788b, dVar);
        }
    }
}