package w0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f54925a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static h00.p<c1.i, Integer, vz.b0> f54926b = j1.c.c(-985540127, false, a.f54927a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f54927a = new a();

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
        return f54926b;
    }
}