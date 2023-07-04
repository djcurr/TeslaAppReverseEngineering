package nr;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final /* synthetic */ class w {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, PropsT, StateT, OutputT> void a(a<? extends PropsT, StateT, ? super OutputT> aVar, n<? extends T> worker, n00.p workerType, String key, h00.l<? super T, ? extends q<? super PropsT, StateT, ? extends OutputT>> handler) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        kotlin.jvm.internal.s.g(worker, "worker");
        kotlin.jvm.internal.s.g(workerType, "workerType");
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(handler, "handler");
        aVar.c(new o(workerType, key), worker, key, handler);
    }
}