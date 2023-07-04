package w10;

import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public abstract class h extends i {
    @Override // w10.i
    public void b(kotlin.reflect.jvm.internal.impl.descriptors.b first, kotlin.reflect.jvm.internal.impl.descriptors.b second) {
        s.g(first, "first");
        s.g(second, "second");
        e(first, second);
    }

    @Override // w10.i
    public void c(kotlin.reflect.jvm.internal.impl.descriptors.b fromSuper, kotlin.reflect.jvm.internal.impl.descriptors.b fromCurrent) {
        s.g(fromSuper, "fromSuper");
        s.g(fromCurrent, "fromCurrent");
        e(fromSuper, fromCurrent);
    }

    protected abstract void e(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar2);
}