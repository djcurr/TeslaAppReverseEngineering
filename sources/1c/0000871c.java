package mq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class v extends u {

    /* renamed from: a  reason: collision with root package name */
    private final a0 f38861a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38862b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38863c;

    /* renamed from: d  reason: collision with root package name */
    private final int f38864d;

    /* renamed from: e  reason: collision with root package name */
    private int f38865e;

    /* renamed from: f  reason: collision with root package name */
    private final d f38866f;

    /* renamed from: g  reason: collision with root package name */
    private int f38867g;

    /* renamed from: h  reason: collision with root package name */
    private final d f38868h;

    /* renamed from: i  reason: collision with root package name */
    private int f38869i;

    /* renamed from: j  reason: collision with root package name */
    private final d f38870j;

    /* renamed from: k  reason: collision with root package name */
    private int f38871k;

    /* renamed from: l  reason: collision with root package name */
    private final d f38872l;

    /* renamed from: m  reason: collision with root package name */
    private int f38873m;

    /* renamed from: n  reason: collision with root package name */
    private final d f38874n;

    /* renamed from: o  reason: collision with root package name */
    private int f38875o;

    /* renamed from: p  reason: collision with root package name */
    private final d f38876p;

    /* renamed from: q  reason: collision with root package name */
    private int f38877q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(a0 a0Var, int i11, int i12, int i13) {
        super(589824);
        this.f38861a = a0Var;
        this.f38862b = i11;
        this.f38863c = i12;
        this.f38864d = i13;
        this.f38866f = new d();
        this.f38868h = new d();
        this.f38870j = new d();
        this.f38872l = new d();
        this.f38874n = new d();
        this.f38876p = new d();
    }

    @Override // mq.u
    public void a() {
    }

    @Override // mq.u
    public void b(String str, int i11, String... strArr) {
        this.f38868h.k(this.f38861a.B(str).f38895a).k(i11);
        if (strArr == null) {
            this.f38868h.k(0);
        } else {
            this.f38868h.k(strArr.length);
            for (String str2 : strArr) {
                this.f38868h.k(this.f38861a.y(str2).f38895a);
            }
        }
        this.f38867g++;
    }

    @Override // mq.u
    public void c(String str) {
        this.f38877q = this.f38861a.e(str).f38895a;
    }

    @Override // mq.u
    public void d(String str, int i11, String... strArr) {
        this.f38870j.k(this.f38861a.B(str).f38895a).k(i11);
        if (strArr == null) {
            this.f38870j.k(0);
        } else {
            this.f38870j.k(strArr.length);
            for (String str2 : strArr) {
                this.f38870j.k(this.f38861a.y(str2).f38895a);
            }
        }
        this.f38869i++;
    }

    @Override // mq.u
    public void e(String str) {
        this.f38876p.k(this.f38861a.B(str).f38895a);
        this.f38875o++;
    }

    @Override // mq.u
    public void f(String str, String... strArr) {
        this.f38874n.k(this.f38861a.e(str).f38895a);
        this.f38874n.k(strArr.length);
        for (String str2 : strArr) {
            this.f38874n.k(this.f38861a.e(str2).f38895a);
        }
        this.f38873m++;
    }

    @Override // mq.u
    public void g(String str, int i11, String str2) {
        this.f38866f.k(this.f38861a.y(str).f38895a).k(i11).k(str2 == null ? 0 : this.f38861a.D(str2));
        this.f38865e++;
    }

    @Override // mq.u
    public void h(String str) {
        this.f38872l.k(this.f38861a.e(str).f38895a);
        this.f38871k++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        this.f38861a.D("Module");
        int i11 = this.f38866f.f38727b + 22 + this.f38868h.f38727b + this.f38870j.f38727b + this.f38872l.f38727b + this.f38874n.f38727b;
        if (this.f38875o > 0) {
            this.f38861a.D("ModulePackages");
            i11 += this.f38876p.f38727b + 8;
        }
        if (this.f38877q > 0) {
            this.f38861a.D("ModuleMainClass");
            return i11 + 8;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return (this.f38875o > 0 ? 1 : 0) + 1 + (this.f38877q > 0 ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k(d dVar) {
        d k11 = dVar.k(this.f38861a.D("Module")).i(this.f38866f.f38727b + 16 + this.f38868h.f38727b + this.f38870j.f38727b + this.f38872l.f38727b + this.f38874n.f38727b).k(this.f38862b).k(this.f38863c).k(this.f38864d).k(this.f38865e);
        d dVar2 = this.f38866f;
        d k12 = k11.h(dVar2.f38726a, 0, dVar2.f38727b).k(this.f38867g);
        d dVar3 = this.f38868h;
        d k13 = k12.h(dVar3.f38726a, 0, dVar3.f38727b).k(this.f38869i);
        d dVar4 = this.f38870j;
        d k14 = k13.h(dVar4.f38726a, 0, dVar4.f38727b).k(this.f38871k);
        d dVar5 = this.f38872l;
        d k15 = k14.h(dVar5.f38726a, 0, dVar5.f38727b).k(this.f38873m);
        d dVar6 = this.f38874n;
        k15.h(dVar6.f38726a, 0, dVar6.f38727b);
        if (this.f38875o > 0) {
            d k16 = dVar.k(this.f38861a.D("ModulePackages")).i(this.f38876p.f38727b + 2).k(this.f38875o);
            d dVar7 = this.f38876p;
            k16.h(dVar7.f38726a, 0, dVar7.f38727b);
        }
        if (this.f38877q > 0) {
            dVar.k(this.f38861a.D("ModuleMainClass")).i(2).k(this.f38877q);
        }
    }
}