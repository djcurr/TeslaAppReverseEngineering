package h10;

import e10.c;
import e10.e0;
import e10.q;
import e10.w;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l10.z;
import vz.m;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: h10.a$a */
    /* loaded from: classes5.dex */
    public static final class C0550a extends u implements h00.a<w> {

        /* renamed from: a */
        final /* synthetic */ h f28544a;

        /* renamed from: b */
        final /* synthetic */ w00.d f28545b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0550a(h hVar, w00.d dVar) {
            super(0);
            this.f28544a = hVar;
            this.f28545b = dVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final w invoke() {
            return a.g(this.f28544a, this.f28545b.getAnnotations());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends u implements h00.a<w> {

        /* renamed from: a */
        final /* synthetic */ h f28546a;

        /* renamed from: b */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f28547b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
            super(0);
            this.f28546a = hVar;
            this.f28547b = gVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final w invoke() {
            return a.g(this.f28546a, this.f28547b);
        }
    }

    public static final h a(h hVar, l typeParameterResolver) {
        s.g(hVar, "<this>");
        s.g(typeParameterResolver, "typeParameterResolver");
        return new h(hVar.a(), typeParameterResolver, hVar.c());
    }

    private static final h b(h hVar, w00.i iVar, z zVar, int i11, vz.k<w> kVar) {
        c a11 = hVar.a();
        i iVar2 = zVar == null ? null : new i(hVar, iVar, zVar, i11);
        if (iVar2 == null) {
            iVar2 = hVar.f();
        }
        return new h(a11, iVar2, kVar);
    }

    public static final h c(h hVar, w00.d containingDeclaration, z zVar, int i11) {
        vz.k b11;
        s.g(hVar, "<this>");
        s.g(containingDeclaration, "containingDeclaration");
        b11 = m.b(kotlin.b.NONE, new C0550a(hVar, containingDeclaration));
        return b(hVar, containingDeclaration, zVar, i11, b11);
    }

    public static /* synthetic */ h d(h hVar, w00.d dVar, z zVar, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            zVar = null;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return c(hVar, dVar, zVar, i11);
    }

    public static final h e(h hVar, w00.i containingDeclaration, z typeParameterOwner, int i11) {
        s.g(hVar, "<this>");
        s.g(containingDeclaration, "containingDeclaration");
        s.g(typeParameterOwner, "typeParameterOwner");
        return b(hVar, containingDeclaration, typeParameterOwner, i11, hVar.c());
    }

    public static /* synthetic */ h f(h hVar, w00.i iVar, z zVar, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return e(hVar, iVar, zVar, i11);
    }

    public static final w g(h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g additionalAnnotations) {
        EnumMap<e10.a, q> b11;
        s.g(hVar, "<this>");
        s.g(additionalAnnotations, "additionalAnnotations");
        if (hVar.a().i().b()) {
            return hVar.b();
        }
        ArrayList<q> arrayList = new ArrayList();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it2 = additionalAnnotations.iterator();
        while (it2.hasNext()) {
            q i11 = i(hVar, it2.next());
            if (i11 != null) {
                arrayList.add(i11);
            }
        }
        if (arrayList.isEmpty()) {
            return hVar.b();
        }
        w b12 = hVar.b();
        EnumMap enumMap = null;
        if (b12 != null && (b11 = b12.b()) != null) {
            enumMap = new EnumMap((EnumMap) b11);
        }
        if (enumMap == null) {
            enumMap = new EnumMap(e10.a.class);
        }
        boolean z11 = false;
        for (q qVar : arrayList) {
            for (e10.a aVar : qVar.g()) {
                enumMap.put((EnumMap) aVar, (e10.a) qVar);
                z11 = true;
            }
        }
        return !z11 ? hVar.b() : new w(enumMap);
    }

    public static final h h(h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g additionalAnnotations) {
        vz.k b11;
        s.g(hVar, "<this>");
        s.g(additionalAnnotations, "additionalAnnotations");
        if (additionalAnnotations.isEmpty()) {
            return hVar;
        }
        c a11 = hVar.a();
        l f11 = hVar.f();
        b11 = m.b(kotlin.b.NONE, new b(hVar, additionalAnnotations));
        return new h(a11, f11, b11);
    }

    private static final q i(h hVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        e10.c a11 = hVar.a().a();
        q l11 = a11.l(cVar);
        if (l11 == null) {
            c.a n11 = a11.n(cVar);
            if (n11 == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a12 = n11.a();
            List<e10.a> b11 = n11.b();
            e0 k11 = a11.k(cVar);
            if (k11 == null) {
                k11 = a11.j(a12);
            }
            if (k11.isIgnore()) {
                return null;
            }
            m10.i h11 = hVar.a().r().h(a12, hVar.a().q().b(), false);
            m10.i b12 = h11 == null ? null : m10.i.b(h11, null, k11.isWarning(), 1, null);
            if (b12 == null) {
                return null;
            }
            return new q(b12, b11, false, false, 12, null);
        }
        return l11;
    }

    public static final h j(h hVar, c components) {
        s.g(hVar, "<this>");
        s.g(components, "components");
        return new h(components, hVar.f(), hVar.c());
    }
}