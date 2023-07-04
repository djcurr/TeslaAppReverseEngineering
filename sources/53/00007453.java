package i20;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* loaded from: classes5.dex */
public class a implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f29693b = {m0.j(new f0(m0.b(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: a  reason: collision with root package name */
    private final j20.i f29694a;

    public a(j20.n storageManager, h00.a<? extends List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> compute) {
        s.g(storageManager, "storageManager");
        s.g(compute, "compute");
        this.f29694a = storageManager.b(compute);
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> b() {
        return (List) j20.m.a(this.f29694a, this, f29693b[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean b1(u10.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return b().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        return b().iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.c l(u10.c cVar) {
        return g.b.a(this, cVar);
    }
}