package w0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f54928a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static h00.q<h00.p<? super c1.i, ? super Integer, vz.b0>, c1.i, Integer, vz.b0> f54929b = j1.c.c(-985540735, false, a.f54930a);

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.q<h00.p<? super c1.i, ? super Integer, ? extends vz.b0>, c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f54930a = new a();

        a() {
            super(3);
        }

        public final void a(h00.p<? super c1.i, ? super Integer, vz.b0> innerTextField, c1.i iVar, int i11) {
            kotlin.jvm.internal.s.g(innerTextField, "innerTextField");
            if ((i11 & 14) == 0) {
                i11 |= iVar.O(innerTextField) ? 4 : 2;
            }
            if (((i11 & 91) ^ 18) == 0 && iVar.i()) {
                iVar.G();
            } else {
                innerTextField.invoke(iVar, Integer.valueOf(i11 & 14));
            }
        }

        @Override // h00.q
        public /* bridge */ /* synthetic */ vz.b0 invoke(h00.p<? super c1.i, ? super Integer, ? extends vz.b0> pVar, c1.i iVar, Integer num) {
            a(pVar, iVar, num.intValue());
            return vz.b0.f54756a;
        }
    }

    public final h00.q<h00.p<? super c1.i, ? super Integer, vz.b0>, c1.i, Integer, vz.b0> a() {
        return f54929b;
    }
}