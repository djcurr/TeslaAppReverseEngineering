package c1;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f8467a = new g();

    /* renamed from: b  reason: collision with root package name */
    public static h00.p<i, Integer, vz.b0> f8468b = j1.c.c(-985543095, false, a.f8470a);

    /* renamed from: c  reason: collision with root package name */
    public static h00.p<i, Integer, vz.b0> f8469c = j1.c.c(-985548681, false, b.f8471a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8470a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            }
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.p<i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8471a = new b();

        b() {
            super(2);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            }
        }
    }

    public final h00.p<i, Integer, vz.b0> a() {
        return f8468b;
    }

    public final h00.p<i, Integer, vz.b0> b() {
        return f8469c;
    }
}