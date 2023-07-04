package w10;

import d20.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.s;
import w00.a0;
import w00.r0;
import wz.w;

/* loaded from: classes5.dex */
public final class a extends o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f55368a = new a();

    private a() {
    }

    private static final void b(w00.c cVar, LinkedHashSet<w00.c> linkedHashSet, d20.h hVar, boolean z11) {
        for (w00.i iVar : k.a.a(hVar, d20.d.f23460q, null, 2, null)) {
            if (iVar instanceof w00.c) {
                w00.c cVar2 = (w00.c) iVar;
                if (cVar2.g0()) {
                    u10.f name = cVar2.getName();
                    s.f(name, "descriptor.name");
                    w00.e e11 = hVar.e(name, d10.d.WHEN_GET_ALL_DESCRIPTORS);
                    if (e11 instanceof w00.c) {
                        cVar2 = (w00.c) e11;
                    } else {
                        cVar2 = e11 instanceof r0 ? ((r0) e11).q() : null;
                    }
                }
                if (cVar2 != null) {
                    if (d.z(cVar2, cVar)) {
                        linkedHashSet.add(cVar2);
                    }
                    if (z11) {
                        d20.h S = cVar2.S();
                        s.f(S, "refinedDescriptor.unsubstitutedInnerClassesScope");
                        b(cVar, linkedHashSet, S, z11);
                    }
                }
            }
        }
    }

    public Collection<w00.c> a(w00.c sealedClass, boolean z11) {
        w00.i iVar;
        w00.i iVar2;
        List i11;
        s.g(sealedClass, "sealedClass");
        if (sealedClass.p() != kotlin.reflect.jvm.internal.impl.descriptors.f.SEALED) {
            i11 = w.i();
            return i11;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!z11) {
            iVar2 = sealedClass.b();
        } else {
            Iterator<w00.i> it2 = a20.a.m(sealedClass).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    iVar = null;
                    break;
                }
                iVar = it2.next();
                if (iVar instanceof a0) {
                    break;
                }
            }
            iVar2 = iVar;
        }
        if (iVar2 instanceof a0) {
            b(sealedClass, linkedHashSet, ((a0) iVar2).m(), z11);
        }
        d20.h S = sealedClass.S();
        s.f(S, "sealedClass.unsubstitutedInnerClassesScope");
        b(sealedClass, linkedHashSet, S, true);
        return linkedHashSet;
    }
}