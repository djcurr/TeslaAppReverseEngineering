package nr;

import v20.o0;

/* loaded from: classes2.dex */
public interface s {

    /* loaded from: classes2.dex */
    public static final class a {
        public static <P, S> S a(s sVar, P p11, i iVar, h00.p<? super P, ? super i, ? extends S> proceed, c session) {
            kotlin.jvm.internal.s.g(sVar, "this");
            kotlin.jvm.internal.s.g(proceed, "proceed");
            kotlin.jvm.internal.s.g(session, "session");
            return proceed.invoke(p11, iVar);
        }

        public static <P, S> S b(s sVar, P p11, P p12, S s11, h00.q<? super P, ? super P, ? super S, ? extends S> proceed, c session) {
            kotlin.jvm.internal.s.g(sVar, "this");
            kotlin.jvm.internal.s.g(proceed, "proceed");
            kotlin.jvm.internal.s.g(session, "session");
            return proceed.invoke(p11, p12, s11);
        }

        public static <P, S, O, R> R c(s sVar, P p11, S s11, nr.a<? extends P, S, ? super O> context, h00.q<? super P, ? super S, ? super b<P, S, O>, ? extends R> proceed, c session) {
            kotlin.jvm.internal.s.g(sVar, "this");
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(proceed, "proceed");
            kotlin.jvm.internal.s.g(session, "session");
            return proceed.invoke(p11, s11, null);
        }

        public static void d(s sVar, o0 workflowScope, c session) {
            kotlin.jvm.internal.s.g(sVar, "this");
            kotlin.jvm.internal.s.g(workflowScope, "workflowScope");
            kotlin.jvm.internal.s.g(session, "session");
        }

        public static <S> i e(s sVar, S s11, h00.l<? super S, i> proceed, c session) {
            kotlin.jvm.internal.s.g(sVar, "this");
            kotlin.jvm.internal.s.g(proceed, "proceed");
            kotlin.jvm.internal.s.g(session, "session");
            return proceed.invoke(s11);
        }
    }

    /* loaded from: classes2.dex */
    public interface b<P, S, O> {
        void a(q<? super P, S, ? extends O> qVar, h00.l<? super q<? super P, S, ? extends O>, vz.b0> lVar);

        void b(String str, h00.l<? super zz.d<? super vz.b0>, ? extends Object> lVar, h00.p<? super String, ? super h00.l<? super zz.d<? super vz.b0>, ? extends Object>, vz.b0> pVar);

        <CP, CO, CR> CR c(p<? super CP, ? extends CO, ? extends CR> pVar, CP cp2, String str, h00.l<? super CO, ? extends q<? super P, S, ? extends O>> lVar, h00.r<? super p<? super CP, ? extends CO, ? extends CR>, ? super CP, ? super String, ? super h00.l<? super CO, ? extends q<? super P, S, ? extends O>>, ? extends CR> rVar);
    }

    /* loaded from: classes2.dex */
    public interface c {
    }

    void a(o0 o0Var, c cVar);

    <P, S, O, R> R b(P p11, S s11, nr.a<? extends P, S, ? super O> aVar, h00.q<? super P, ? super S, ? super b<P, S, O>, ? extends R> qVar, c cVar);

    <P, S> S c(P p11, P p12, S s11, h00.q<? super P, ? super P, ? super S, ? extends S> qVar, c cVar);

    <S> i d(S s11, h00.l<? super S, i> lVar, c cVar);

    <P, S> S e(P p11, i iVar, h00.p<? super P, ? super i, ? extends S> pVar, c cVar);
}