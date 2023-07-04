package e10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final v f24430a;

    /* renamed from: b  reason: collision with root package name */
    private final j20.h<w00.c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f24431b;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c f24432a;

        /* renamed from: b  reason: collision with root package name */
        private final int f24433b;

        public a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c typeQualifier, int i11) {
            kotlin.jvm.internal.s.g(typeQualifier, "typeQualifier");
            this.f24432a = typeQualifier;
            this.f24433b = i11;
        }

        private final boolean c(e10.a aVar) {
            return ((1 << aVar.ordinal()) & this.f24433b) != 0;
        }

        private final boolean d(e10.a aVar) {
            if (c(aVar)) {
                return true;
            }
            return c(e10.a.TYPE_USE) && aVar != e10.a.TYPE_PARAMETER_BOUNDS;
        }

        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a() {
            return this.f24432a;
        }

        public final List<e10.a> b() {
            e10.a[] values = e10.a.values();
            ArrayList arrayList = new ArrayList();
            for (e10.a aVar : values) {
                if (d(aVar)) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<y10.j, e10.a, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f24434a = new b();

        b() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Boolean mo160invoke(y10.j mapConstantToQualifierApplicabilityTypes, e10.a it2) {
            kotlin.jvm.internal.s.g(mapConstantToQualifierApplicabilityTypes, "$this$mapConstantToQualifierApplicabilityTypes");
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(kotlin.jvm.internal.s.c(mapConstantToQualifierApplicabilityTypes.c().d(), it2.getJavaTarget()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e10.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0473c extends kotlin.jvm.internal.u implements h00.p<y10.j, e10.a, Boolean> {
        C0473c() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Boolean mo160invoke(y10.j mapConstantToQualifierApplicabilityTypes, e10.a it2) {
            kotlin.jvm.internal.s.g(mapConstantToQualifierApplicabilityTypes, "$this$mapConstantToQualifierApplicabilityTypes");
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(c.this.p(it2.getJavaTarget()).contains(mapConstantToQualifierApplicabilityTypes.c().d()));
        }
    }

    /* loaded from: classes5.dex */
    /* synthetic */ class d extends kotlin.jvm.internal.o implements h00.l<w00.c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {
        d(Object obj) {
            super(1, obj);
        }

        @Override // h00.l
        /* renamed from: d */
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c mo12invoke(w00.c p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return ((c) this.receiver).c(p02);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "computeTypeQualifierNickname";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.b(c.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
        }
    }

    public c(j20.n storageManager, v javaTypeEnhancementState) {
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f24430a = javaTypeEnhancementState;
        this.f24431b = storageManager.h(new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c c(w00.c cVar) {
        if (cVar.mo140getAnnotations().b1(e10.b.g())) {
            for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar2 : cVar.mo140getAnnotations()) {
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.c m11 = m(cVar2);
                if (m11 != null) {
                    return m11;
                }
            }
            return null;
        }
        return null;
    }

    private final List<e10.a> d(y10.g<?> gVar, h00.p<? super y10.j, ? super e10.a, Boolean> pVar) {
        List<e10.a> i11;
        e10.a aVar;
        List<e10.a> m11;
        if (gVar instanceof y10.b) {
            ArrayList arrayList = new ArrayList();
            for (y10.g<?> gVar2 : ((y10.b) gVar).b()) {
                wz.b0.z(arrayList, d(gVar2, pVar));
            }
            return arrayList;
        } else if (!(gVar instanceof y10.j)) {
            i11 = wz.w.i();
            return i11;
        } else {
            e10.a[] values = e10.a.values();
            int length = values.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i12];
                if (pVar.mo160invoke(gVar, aVar).booleanValue()) {
                    break;
                }
                i12++;
            }
            m11 = wz.w.m(aVar);
            return m11;
        }
    }

    private final List<e10.a> e(y10.g<?> gVar) {
        return d(gVar, b.f24434a);
    }

    private final List<e10.a> f(y10.g<?> gVar) {
        return d(gVar, new C0473c());
    }

    private final e0 g(w00.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c mo169l = cVar.mo140getAnnotations().mo169l(e10.b.d());
        y10.g<?> b11 = mo169l == null ? null : a20.a.b(mo169l);
        y10.j jVar = b11 instanceof y10.j ? (y10.j) b11 : null;
        if (jVar == null) {
            return null;
        }
        e0 b12 = this.f24430a.d().b();
        if (b12 == null) {
            String b13 = jVar.c().b();
            int hashCode = b13.hashCode();
            if (hashCode == -2137067054) {
                if (b13.equals("IGNORE")) {
                    return e0.IGNORE;
                }
                return null;
            } else if (hashCode == -1838656823) {
                if (b13.equals("STRICT")) {
                    return e0.STRICT;
                }
                return null;
            } else if (hashCode == 2656902 && b13.equals("WARN")) {
                return e0.WARN;
            } else {
                return null;
            }
        }
        return b12;
    }

    private final e0 i(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        u10.c e11 = cVar.e();
        if (e11 != null && e10.b.c().containsKey(e11)) {
            return this.f24430a.c().mo12invoke(e11);
        }
        return j(cVar);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c o(w00.c cVar) {
        if (cVar.getKind() != kotlin.reflect.jvm.internal.impl.descriptors.c.ANNOTATION_CLASS) {
            return null;
        }
        return this.f24431b.mo12invoke(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> p(String str) {
        int t11;
        Set<kotlin.reflect.jvm.internal.impl.descriptors.annotations.n> b11 = f10.d.f25527a.b(str);
        t11 = wz.x.t(b11, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (kotlin.reflect.jvm.internal.impl.descriptors.annotations.n nVar : b11) {
            arrayList.add(nVar.name());
        }
        return arrayList;
    }

    public final a h(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotationDescriptor) {
        kotlin.jvm.internal.s.g(annotationDescriptor, "annotationDescriptor");
        w00.c f11 = a20.a.f(annotationDescriptor);
        if (f11 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations = f11.mo140getAnnotations();
        u10.c TARGET_ANNOTATION = z.f24513c;
        kotlin.jvm.internal.s.f(TARGET_ANNOTATION, "TARGET_ANNOTATION");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c mo169l = mo140getAnnotations.mo169l(TARGET_ANNOTATION);
        if (mo169l == null) {
            return null;
        }
        Map<u10.f, y10.g<?>> g11 = mo169l.g();
        ArrayList<e10.a> arrayList = new ArrayList();
        for (Map.Entry<u10.f, y10.g<?>> entry : g11.entrySet()) {
            wz.b0.z(arrayList, f(entry.getValue()));
        }
        int i11 = 0;
        for (e10.a aVar : arrayList) {
            i11 |= 1 << aVar.ordinal();
        }
        return new a(annotationDescriptor, i11);
    }

    public final e0 j(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotationDescriptor) {
        kotlin.jvm.internal.s.g(annotationDescriptor, "annotationDescriptor");
        e0 k11 = k(annotationDescriptor);
        return k11 == null ? this.f24430a.d().a() : k11;
    }

    public final e0 k(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotationDescriptor) {
        kotlin.jvm.internal.s.g(annotationDescriptor, "annotationDescriptor");
        e0 e0Var = this.f24430a.d().c().get(annotationDescriptor.e());
        if (e0Var == null) {
            w00.c f11 = a20.a.f(annotationDescriptor);
            if (f11 == null) {
                return null;
            }
            return g(f11);
        }
        return e0Var;
    }

    public final q l(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotationDescriptor) {
        q qVar;
        kotlin.jvm.internal.s.g(annotationDescriptor, "annotationDescriptor");
        if (this.f24430a.b() || (qVar = e10.b.a().get(annotationDescriptor.e())) == null) {
            return null;
        }
        e0 i11 = i(annotationDescriptor);
        if (!(i11 != e0.IGNORE)) {
            i11 = null;
        }
        if (i11 == null) {
            return null;
        }
        return q.b(qVar, m10.i.b(qVar.f(), null, i11.isWarning(), 1, null), null, false, false, 14, null);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c m(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotationDescriptor) {
        w00.c f11;
        boolean b11;
        kotlin.jvm.internal.s.g(annotationDescriptor, "annotationDescriptor");
        if (this.f24430a.d().d() || (f11 = a20.a.f(annotationDescriptor)) == null) {
            return null;
        }
        b11 = e10.d.b(f11);
        return b11 ? annotationDescriptor : o(f11);
    }

    public final a n(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c annotationDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar;
        boolean z11;
        List<e10.a> i11;
        kotlin.jvm.internal.s.g(annotationDescriptor, "annotationDescriptor");
        if (this.f24430a.d().d()) {
            return null;
        }
        w00.c f11 = a20.a.f(annotationDescriptor);
        if (f11 == null || !f11.mo140getAnnotations().b1(e10.b.e())) {
            f11 = null;
        }
        if (f11 == null) {
            return null;
        }
        w00.c f12 = a20.a.f(annotationDescriptor);
        kotlin.jvm.internal.s.e(f12);
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c mo169l = f12.mo140getAnnotations().mo169l(e10.b.e());
        kotlin.jvm.internal.s.e(mo169l);
        Map<u10.f, y10.g<?>> g11 = mo169l.g();
        ArrayList<e10.a> arrayList = new ArrayList();
        for (Map.Entry<u10.f, y10.g<?>> entry : g11.entrySet()) {
            y10.g<?> value = entry.getValue();
            if (kotlin.jvm.internal.s.c(entry.getKey(), z.f24512b)) {
                i11 = e(value);
            } else {
                i11 = wz.w.i();
            }
            wz.b0.z(arrayList, i11);
        }
        int i12 = 0;
        for (e10.a aVar : arrayList) {
            i12 |= 1 << aVar.ordinal();
        }
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it2 = f11.mo140getAnnotations().iterator();
        while (true) {
            if (!it2.hasNext()) {
                cVar = null;
                break;
            }
            cVar = it2.next();
            if (m(cVar) != null) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (z11) {
                break;
            }
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar2 = cVar;
        if (cVar2 == null) {
            return null;
        }
        return new a(cVar2, i12);
    }
}