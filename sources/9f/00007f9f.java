package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final /* synthetic */ class h {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes5.dex */
    public static final class a<T> implements e<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f35266a;

        public a(Object obj) {
            this.f35266a = obj;
        }

        @Override // kotlinx.coroutines.flow.e
        public Object collect(f<? super T> fVar, zz.d<? super vz.b0> dVar) {
            Object d11;
            Object emit = fVar.emit((Object) this.f35266a, dVar);
            d11 = a00.d.d();
            return emit == d11 ? emit : vz.b0.f54756a;
        }
    }

    public static final <T> e<T> a(h00.p<? super x20.r<? super T>, ? super zz.d<? super vz.b0>, ? extends Object> pVar) {
        return new b(pVar, null, 0, null, 14, null);
    }

    public static final <T> e<T> b(h00.p<? super f<? super T>, ? super zz.d<? super vz.b0>, ? extends Object> pVar) {
        return new x(pVar);
    }

    public static final <T> e<T> c(T t11) {
        return new a(t11);
    }
}