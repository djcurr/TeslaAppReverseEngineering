package y20;

import kotlin.jvm.internal.r0;
import vz.b0;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private static final h00.q<kotlinx.coroutines.flow.f<Object>, Object, zz.d<? super b0>, Object> f59062a = (h00.q) r0.f(a.f59063a, 3);

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.q<kotlinx.coroutines.flow.f<? super Object>, Object, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f59063a = new a();

        a() {
            super(3, kotlinx.coroutines.flow.f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // h00.q
        /* renamed from: d */
        public final Object invoke(kotlinx.coroutines.flow.f<Object> fVar, Object obj, zz.d<? super b0> dVar) {
            return fVar.emit(obj, dVar);
        }
    }

    public static final /* synthetic */ h00.q a() {
        return f59062a;
    }
}