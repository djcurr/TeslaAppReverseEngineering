package nr;

import nr.q;

/* loaded from: classes2.dex */
final /* synthetic */ class a0 {
    public static final <PropsT, StateT, OutputT> vz.p<StateT, u<OutputT>> a(q<? super PropsT, StateT, ? extends OutputT> qVar, PropsT propst, StateT statet) {
        kotlin.jvm.internal.s.g(qVar, "<this>");
        q<? super Object, StateT, ? extends Object>.c cVar = new q.c(qVar, propst, statet);
        qVar.a(cVar);
        return new vz.p<>(cVar.c(), cVar.a());
    }
}