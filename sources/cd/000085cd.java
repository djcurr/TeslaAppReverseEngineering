package m10;

import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import wz.w;

/* loaded from: classes5.dex */
final class b implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: a  reason: collision with root package name */
    private final u10.c f38263a;

    public b(u10.c fqNameToMatch) {
        kotlin.jvm.internal.s.g(fqNameToMatch, "fqNameToMatch");
        this.f38263a = fqNameToMatch;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    /* renamed from: b */
    public a l(u10.c fqName) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        if (kotlin.jvm.internal.s.c(fqName, this.f38263a)) {
            return a.f38262a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean b1(u10.c cVar) {
        return g.b.b(this, cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        List i11;
        i11 = w.i();
        return i11.iterator();
    }
}