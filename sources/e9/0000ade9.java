package qf;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final u f48104a;

    /* renamed from: b  reason: collision with root package name */
    private final v f48105b;

    /* renamed from: c  reason: collision with root package name */
    private final u f48106c;

    /* renamed from: d  reason: collision with root package name */
    private final pd.c f48107d;

    /* renamed from: e  reason: collision with root package name */
    private final u f48108e;

    /* renamed from: f  reason: collision with root package name */
    private final v f48109f;

    /* renamed from: g  reason: collision with root package name */
    private final u f48110g;

    /* renamed from: h  reason: collision with root package name */
    private final v f48111h;

    /* renamed from: i  reason: collision with root package name */
    private final String f48112i;

    /* renamed from: j  reason: collision with root package name */
    private final int f48113j;

    /* renamed from: k  reason: collision with root package name */
    private final int f48114k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f48115l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f48116m;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private u f48117a;

        /* renamed from: b  reason: collision with root package name */
        private v f48118b;

        /* renamed from: c  reason: collision with root package name */
        private u f48119c;

        /* renamed from: d  reason: collision with root package name */
        private pd.c f48120d;

        /* renamed from: e  reason: collision with root package name */
        private u f48121e;

        /* renamed from: f  reason: collision with root package name */
        private v f48122f;

        /* renamed from: g  reason: collision with root package name */
        private u f48123g;

        /* renamed from: h  reason: collision with root package name */
        private v f48124h;

        /* renamed from: i  reason: collision with root package name */
        private String f48125i;

        /* renamed from: j  reason: collision with root package name */
        private int f48126j;

        /* renamed from: k  reason: collision with root package name */
        private int f48127k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f48128l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f48129m;

        public s m() {
            return new s(this);
        }

        private b() {
        }
    }

    public static b n() {
        return new b();
    }

    public int a() {
        return this.f48114k;
    }

    public int b() {
        return this.f48113j;
    }

    public u c() {
        return this.f48104a;
    }

    public v d() {
        return this.f48105b;
    }

    public String e() {
        return this.f48112i;
    }

    public u f() {
        return this.f48106c;
    }

    public u g() {
        return this.f48108e;
    }

    public v h() {
        return this.f48109f;
    }

    public pd.c i() {
        return this.f48107d;
    }

    public u j() {
        return this.f48110g;
    }

    public v k() {
        return this.f48111h;
    }

    public boolean l() {
        return this.f48116m;
    }

    public boolean m() {
        return this.f48115l;
    }

    private s(b bVar) {
        u uVar;
        v vVar;
        u uVar2;
        pd.c cVar;
        u uVar3;
        v vVar2;
        u uVar4;
        v vVar3;
        if (tf.b.d()) {
            tf.b.a("PoolConfig()");
        }
        if (bVar.f48117a != null) {
            uVar = bVar.f48117a;
        } else {
            uVar = f.a();
        }
        this.f48104a = uVar;
        if (bVar.f48118b != null) {
            vVar = bVar.f48118b;
        } else {
            vVar = q.h();
        }
        this.f48105b = vVar;
        if (bVar.f48119c != null) {
            uVar2 = bVar.f48119c;
        } else {
            uVar2 = h.b();
        }
        this.f48106c = uVar2;
        if (bVar.f48120d != null) {
            cVar = bVar.f48120d;
        } else {
            cVar = pd.d.b();
        }
        this.f48107d = cVar;
        if (bVar.f48121e != null) {
            uVar3 = bVar.f48121e;
        } else {
            uVar3 = i.a();
        }
        this.f48108e = uVar3;
        if (bVar.f48122f != null) {
            vVar2 = bVar.f48122f;
        } else {
            vVar2 = q.h();
        }
        this.f48109f = vVar2;
        if (bVar.f48123g != null) {
            uVar4 = bVar.f48123g;
        } else {
            uVar4 = g.a();
        }
        this.f48110g = uVar4;
        if (bVar.f48124h != null) {
            vVar3 = bVar.f48124h;
        } else {
            vVar3 = q.h();
        }
        this.f48111h = vVar3;
        this.f48112i = bVar.f48125i == null ? "legacy" : bVar.f48125i;
        this.f48113j = bVar.f48126j;
        this.f48114k = bVar.f48127k > 0 ? bVar.f48127k : 4194304;
        this.f48115l = bVar.f48128l;
        if (tf.b.d()) {
            tf.b.b();
        }
        this.f48116m = bVar.f48129m;
    }
}