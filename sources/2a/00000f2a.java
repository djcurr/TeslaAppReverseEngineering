package c1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class o1 {

    /* renamed from: a  reason: collision with root package name */
    private static final t1<e1.e<vz.p<h00.l<w<?>, vz.b0>, h00.l<w<?>, vz.b0>>>> f8640a = new t1<>();

    /* renamed from: b  reason: collision with root package name */
    private static final t1<Boolean> f8641b = new t1<>();

    public static final <T> v1<T> c(h00.a<? extends T> calculation) {
        kotlin.jvm.internal.s.g(calculation, "calculation");
        return new v(calculation);
    }

    public static final <R> void d(h00.l<? super v1<?>, vz.b0> start, h00.l<? super v1<?>, vz.b0> done, h00.a<? extends R> block) {
        kotlin.jvm.internal.s.g(start, "start");
        kotlin.jvm.internal.s.g(done, "done");
        kotlin.jvm.internal.s.g(block, "block");
        t1<e1.e<vz.p<h00.l<w<?>, vz.b0>, h00.l<w<?>, vz.b0>>>> t1Var = f8640a;
        e1.e<vz.p<h00.l<w<?>, vz.b0>, h00.l<w<?>, vz.b0>>> a11 = t1Var.a();
        try {
            e1.e<vz.p<h00.l<w<?>, vz.b0>, h00.l<w<?>, vz.b0>>> a12 = t1Var.a();
            if (a12 == null) {
                a12 = e1.a.b();
            }
            t1Var.b(a12.add((e1.e<vz.p<h00.l<w<?>, vz.b0>, h00.l<w<?>, vz.b0>>>) vz.v.a(start, done)));
            block.invoke();
            t1Var.b(a11);
        } catch (Throwable th2) {
            f8640a.b(a11);
            throw th2;
        }
    }
}