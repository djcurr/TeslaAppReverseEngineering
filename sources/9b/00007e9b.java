package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class l implements g {

    /* renamed from: a  reason: collision with root package name */
    private final g f34955a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f34956b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.l<u10.c, Boolean> f34957c;

    /* JADX WARN: Multi-variable type inference failed */
    public l(g delegate, boolean z11, h00.l<? super u10.c, Boolean> fqNameFilter) {
        s.g(delegate, "delegate");
        s.g(fqNameFilter, "fqNameFilter");
        this.f34955a = delegate;
        this.f34956b = z11;
        this.f34957c = fqNameFilter;
    }

    private final boolean b(c cVar) {
        u10.c e11 = cVar.e();
        return e11 != null && this.f34957c.invoke(e11).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean b1(u10.c fqName) {
        s.g(fqName, "fqName");
        if (this.f34957c.invoke(fqName).booleanValue()) {
            return this.f34955a.b1(fqName);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        boolean z11;
        g<c> gVar = this.f34955a;
        if (!(gVar instanceof Collection) || !((Collection) gVar).isEmpty()) {
            for (c cVar : gVar) {
                if (b(cVar)) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        return this.f34956b ? !z11 : z11;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        g gVar = this.f34955a;
        ArrayList arrayList = new ArrayList();
        for (c cVar : gVar) {
            if (b(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public c l(u10.c fqName) {
        s.g(fqName, "fqName");
        if (this.f34957c.invoke(fqName).booleanValue()) {
            return this.f34955a.l(fqName);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(g delegate, h00.l<? super u10.c, Boolean> fqNameFilter) {
        this(delegate, false, fqNameFilter);
        s.g(delegate, "delegate");
        s.g(fqNameFilter, "fqNameFilter");
    }
}