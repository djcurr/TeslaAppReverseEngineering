package androidx.compose.ui.platform;

/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public static final d1 f2888a = new d1();

    /* renamed from: b  reason: collision with root package name */
    private static final c1.w0<n1> f2889b = c1.r.c(null, a.f2890a, 1, null);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<n1> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2890a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final n1 invoke() {
            return null;
        }
    }

    private d1() {
    }

    private final n1 a(c1.i iVar, int i11) {
        iVar.x(1255403937);
        s2.c0 c0Var = (s2.c0) iVar.A(l0.k());
        if (c0Var == null) {
            iVar.N();
            return null;
        }
        iVar.x(-3686930);
        boolean O = iVar.O(c0Var);
        Object y11 = iVar.y();
        if (O || y11 == c1.i.f8486a.a()) {
            y11 = new n0(c0Var);
            iVar.p(y11);
        }
        iVar.N();
        n0 n0Var = (n0) y11;
        iVar.N();
        return n0Var;
    }

    public final n1 b(c1.i iVar, int i11) {
        iVar.x(1850767929);
        n1 n1Var = (n1) iVar.A(f2889b);
        if (n1Var == null) {
            n1Var = a(iVar, i11 & 14);
        }
        iVar.N();
        return n1Var;
    }
}