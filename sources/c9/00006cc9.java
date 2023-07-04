package f2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f25562a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static h00.p<c1.i, Integer, vz.b0> f25563b = j1.c.c(-985540856, false, a.f25564a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25564a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            }
        }
    }

    public final h00.p<c1.i, Integer, vz.b0> a() {
        return f25563b;
    }
}