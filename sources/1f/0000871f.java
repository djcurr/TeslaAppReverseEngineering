package mq;

import mq.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class y extends x {

    /* renamed from: b  reason: collision with root package name */
    private final a0 f38886b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38887c;

    /* renamed from: d  reason: collision with root package name */
    private final int f38888d;

    /* renamed from: e  reason: collision with root package name */
    private int f38889e;

    /* renamed from: f  reason: collision with root package name */
    private b f38890f;

    /* renamed from: g  reason: collision with root package name */
    private b f38891g;

    /* renamed from: h  reason: collision with root package name */
    private b f38892h;

    /* renamed from: i  reason: collision with root package name */
    private b f38893i;

    /* renamed from: j  reason: collision with root package name */
    private c f38894j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(a0 a0Var, String str, String str2, String str3) {
        super(589824);
        this.f38886b = a0Var;
        this.f38887c = a0Var.D(str);
        this.f38888d = a0Var.D(str2);
        if (str3 != null) {
            this.f38889e = a0Var.D(str3);
        }
    }

    @Override // mq.x
    public a a(String str, boolean z11) {
        if (z11) {
            b j11 = b.j(this.f38886b, str, this.f38890f);
            this.f38890f = j11;
            return j11;
        }
        b j12 = b.j(this.f38886b, str, this.f38891g);
        this.f38891g = j12;
        return j12;
    }

    @Override // mq.x
    public void b(c cVar) {
        cVar.f38721c = this.f38894j;
        this.f38894j = cVar;
    }

    @Override // mq.x
    public void c() {
    }

    @Override // mq.x
    public a d(int i11, c0 c0Var, String str, boolean z11) {
        if (z11) {
            b i12 = b.i(this.f38886b, i11, c0Var, str, this.f38892h);
            this.f38892h = i12;
            return i12;
        }
        b i13 = b.i(this.f38886b, i11, c0Var, str, this.f38893i);
        this.f38893i = i13;
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(c.a aVar) {
        aVar.b(this.f38894j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        int b11 = c.b(this.f38886b, 0, this.f38889e) + 6 + b.g(this.f38890f, this.f38891g, this.f38892h, this.f38893i);
        c cVar = this.f38894j;
        return cVar != null ? b11 + cVar.a(this.f38886b) : b11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(d dVar) {
        dVar.k(this.f38887c).k(this.f38888d);
        int i11 = this.f38889e != 0 ? 1 : 0;
        if (this.f38890f != null) {
            i11++;
        }
        if (this.f38891g != null) {
            i11++;
        }
        if (this.f38892h != null) {
            i11++;
        }
        if (this.f38893i != null) {
            i11++;
        }
        c cVar = this.f38894j;
        if (cVar != null) {
            i11 += cVar.d();
        }
        dVar.k(i11);
        c.f(this.f38886b, 0, this.f38889e, dVar);
        b.l(this.f38886b, this.f38890f, this.f38891g, this.f38892h, this.f38893i, dVar);
        c cVar2 = this.f38894j;
        if (cVar2 != null) {
            cVar2.g(this.f38886b, dVar);
        }
    }
}