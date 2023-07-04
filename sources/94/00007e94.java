package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* loaded from: classes5.dex */
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f34946a;

    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends c> annotations) {
        s.g(annotations, "annotations");
        this.f34946a = annotations;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean b1(u10.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return this.f34946a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return this.f34946a.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public c l(u10.c cVar) {
        return g.b.a(this, cVar);
    }

    public String toString() {
        return this.f34946a.toString();
    }
}