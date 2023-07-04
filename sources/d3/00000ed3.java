package c1;

/* loaded from: classes.dex */
public final class a2<T> {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<T, vz.b0, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<T, vz.b0> f8435a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.l<? super T, vz.b0> lVar) {
            super(2);
            this.f8435a = lVar;
        }

        public final void a(T t11, vz.b0 it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            this.f8435a.invoke(t11);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj, vz.b0 b0Var) {
            a(obj, b0Var);
            return vz.b0.f54756a;
        }
    }

    public static <T> i a(i composer) {
        kotlin.jvm.internal.s.g(composer, "composer");
        return composer;
    }

    public static final void b(i arg0, h00.l<? super T, vz.b0> block) {
        kotlin.jvm.internal.s.g(arg0, "arg0");
        kotlin.jvm.internal.s.g(block, "block");
        if (arg0.f()) {
            arg0.t(vz.b0.f54756a, new a(block));
        }
    }

    public static final <V> void c(i arg0, V v11, h00.p<? super T, ? super V, vz.b0> block) {
        kotlin.jvm.internal.s.g(arg0, "arg0");
        kotlin.jvm.internal.s.g(block, "block");
        if (arg0.f() || !kotlin.jvm.internal.s.c(arg0.y(), v11)) {
            arg0.p(v11);
            arg0.t(v11, block);
        }
    }
}