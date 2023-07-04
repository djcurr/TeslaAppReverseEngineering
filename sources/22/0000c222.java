package y7;

import java.util.List;

/* loaded from: classes.dex */
public class l extends g<i8.d> {

    /* renamed from: i  reason: collision with root package name */
    private final i8.d f59291i;

    public l(List<i8.a<i8.d>> list) {
        super(list);
        this.f59291i = new i8.d();
    }

    @Override // y7.a
    /* renamed from: p */
    public i8.d i(i8.a<i8.d> aVar, float f11) {
        i8.d dVar;
        i8.d dVar2;
        i8.d dVar3 = aVar.f30188b;
        if (dVar3 != null && (dVar = aVar.f30189c) != null) {
            i8.d dVar4 = dVar3;
            i8.d dVar5 = dVar;
            i8.c<A> cVar = this.f59262e;
            if (cVar == 0 || (dVar2 = (i8.d) cVar.b(aVar.f30193g, aVar.f30194h.floatValue(), dVar4, dVar5, f11, e(), f())) == null) {
                this.f59291i.d(h8.g.k(dVar4.b(), dVar5.b(), f11), h8.g.k(dVar4.c(), dVar5.c(), f11));
                return this.f59291i;
            }
            return dVar2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}