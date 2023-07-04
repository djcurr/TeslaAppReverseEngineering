package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class l {

    /* renamed from: a  reason: collision with root package name */
    private static final h00.l<Object, Object> f35287a = b.f35290a;

    /* renamed from: b  reason: collision with root package name */
    private static final h00.p<Object, Object, Boolean> f35288b = a.f35289a;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<Object, Object, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35289a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(kotlin.jvm.internal.s.c(obj, obj2));
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<Object, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f35290a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> e<T> a(e<? extends T> eVar) {
        return eVar instanceof h0 ? eVar : b(eVar, f35287a, f35288b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> e<T> b(e<? extends T> eVar, h00.l<? super T, ? extends Object> lVar, h00.p<Object, Object, Boolean> pVar) {
        if (eVar instanceof d) {
            d dVar = (d) eVar;
            if (dVar.f35244b == lVar && dVar.f35245c == pVar) {
                return eVar;
            }
        }
        return new d(eVar, lVar, pVar);
    }
}