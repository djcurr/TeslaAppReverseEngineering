package nr;

import ch.qos.logback.core.CoreConstants;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class x {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes2.dex */
    public static final class a<T> implements kotlinx.coroutines.flow.f<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f41848a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l f41849b;

        public a(h hVar, h00.l lVar) {
            this.f41848a = hVar;
            this.f41849b = lVar;
        }

        @Override // kotlinx.coroutines.flow.f
        public Object emit(T t11, zz.d<? super vz.b0> dVar) {
            Object d11;
            Object j11 = v.j(this.f41848a, (q) this.f41849b.invoke(t11), dVar);
            d11 = a00.d.d();
            return j11 == d11 ? j11 : vz.b0.f54756a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [StateT, OutputT, PropsT] */
    /* loaded from: classes2.dex */
    public static final class b<OutputT, PropsT, StateT> extends q<PropsT, StateT, OutputT> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q<PropsT, StateT, OutputT> f41850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v20.o<vz.b0> f41851b;

        /* JADX WARN: Multi-variable type inference failed */
        b(q<? super PropsT, StateT, ? extends OutputT> qVar, v20.o<? super vz.b0> oVar) {
            this.f41850a = qVar;
            this.f41851b = oVar;
        }

        @Override // nr.q
        public void a(q<? super PropsT, StateT, ? extends OutputT>.c cVar) {
            kotlin.jvm.internal.s.g(cVar, "<this>");
            if (this.f41851b.a()) {
                this.f41850a.a(cVar);
                v20.o<vz.b0> oVar = this.f41851b;
                vz.b0 b0Var = vz.b0.f54756a;
                q.a aVar = vz.q.f54772b;
                oVar.resumeWith(vz.q.b(b0Var));
            }
        }

        public String toString() {
            return "sendAndAwaitApplication(" + this.f41850a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public static final <T, PropsT, StateT, OutputT> Object a(kotlinx.coroutines.flow.e<? extends T> eVar, h<? super q<? super PropsT, StateT, ? extends OutputT>> hVar, h00.l<? super T, ? extends q<? super PropsT, StateT, ? extends OutputT>> lVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object collect = eVar.collect(new a(hVar, lVar), dVar);
        d11 = a00.d.d();
        return collect == d11 ? collect : vz.b0.f54756a;
    }

    public static final <PropsT, StateT, OutputT> Object b(h<? super q<? super PropsT, StateT, ? extends OutputT>> hVar, q<? super PropsT, StateT, ? extends OutputT> qVar, zz.d<? super vz.b0> dVar) {
        zz.d c11;
        Object d11;
        Object d12;
        c11 = a00.c.c(dVar);
        v20.p pVar = new v20.p(c11, 1);
        pVar.y();
        hVar.d(new b(qVar, pVar));
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        d12 = a00.d.d();
        return s11 == d12 ? s11 : vz.b0.f54756a;
    }
}