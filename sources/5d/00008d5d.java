package o00;

import h00.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import n00.h;
import n00.n;
import n00.o;
import n00.p;
import q00.f;
import q00.h;
import s20.b;
import wz.s0;
import wz.v;

/* loaded from: classes5.dex */
public final class b {

    /* loaded from: classes5.dex */
    static final class a extends u implements l<n00.d<?>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n00.d f42036a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n00.d dVar) {
            super(1);
            this.f42036a = dVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(n00.d<?> dVar) {
            return Boolean.valueOf(s.c(dVar, this.f42036a));
        }
    }

    public static final <T> T a(n00.d<T> createInstance) {
        Map<n00.l, ? extends Object> i11;
        boolean z11;
        s.g(createInstance, "$this$createInstance");
        Iterator<T> it2 = createInstance.g().iterator();
        h hVar = null;
        boolean z12 = false;
        h hVar2 = null;
        while (true) {
            if (it2.hasNext()) {
                T next = it2.next();
                List<n00.l> parameters = ((h) next).getParameters();
                if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                    for (n00.l lVar : parameters) {
                        if (!lVar.q()) {
                            z11 = false;
                            break;
                        }
                    }
                }
                z11 = true;
                if (z11) {
                    if (z12) {
                        break;
                    }
                    hVar2 = next;
                    z12 = true;
                }
            } else if (z12) {
                hVar = hVar2;
            }
        }
        h hVar3 = hVar;
        if (hVar3 != null) {
            i11 = s0.i();
            return (T) hVar3.callBy(i11);
        }
        throw new IllegalArgumentException("Class should have a single no-arg constructor: " + createInstance);
    }

    public static final <T> Collection<o<T, ?>> b(n00.d<T> declaredMemberProperties) {
        s.g(declaredMemberProperties, "$this$declaredMemberProperties");
        Collection<f<?>> k11 = ((q00.h) declaredMemberProperties).P().invoke().k();
        ArrayList arrayList = new ArrayList();
        for (T t11 : k11) {
            f fVar = (f) t11;
            if (h(fVar) && (fVar instanceof o)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static final <T> Collection<o<T, ?>> c(n00.d<T> memberProperties) {
        s.g(memberProperties, "$this$memberProperties");
        Collection<f<?>> g11 = ((q00.h) memberProperties).P().invoke().g();
        ArrayList arrayList = new ArrayList();
        for (T t11 : g11) {
            f fVar = (f) t11;
            if (h(fVar) && (fVar instanceof o)) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static final <T> h<T> d(n00.d<T> primaryConstructor) {
        T t11;
        s.g(primaryConstructor, "$this$primaryConstructor");
        Iterator<T> it2 = ((q00.h) primaryConstructor).g().iterator();
        while (true) {
            if (!it2.hasNext()) {
                t11 = null;
                break;
            }
            t11 = it2.next();
            h hVar = (h) t11;
            Objects.requireNonNull(hVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            e y11 = ((q00.l) hVar).y();
            Objects.requireNonNull(y11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((kotlin.reflect.jvm.internal.impl.descriptors.d) y11).Y()) {
                break;
            }
        }
        return (h) t11;
    }

    public static final Collection<n<?>> e(n00.d<?> staticProperties) {
        s.g(staticProperties, "$this$staticProperties");
        Collection<f<?>> h11 = ((h.a) ((q00.h) staticProperties).P().invoke()).h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : h11) {
            f fVar = (f) obj;
            if (h(fVar) && (fVar instanceof n)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List<n00.d<?>> f(n00.d<?> superclasses) {
        s.g(superclasses, "$this$superclasses");
        List<p> a11 = superclasses.a();
        ArrayList arrayList = new ArrayList();
        for (p pVar : a11) {
            n00.f c11 = pVar.c();
            if (!(c11 instanceof n00.d)) {
                c11 = null;
            }
            n00.d dVar = (n00.d) c11;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    private static final boolean g(f<?> fVar) {
        return fVar.y().N() != null;
    }

    private static final boolean h(f<?> fVar) {
        return !g(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [o00.b$b] */
    public static final boolean i(n00.d<?> isSubclassOf, n00.d<?> base) {
        List d11;
        s.g(isSubclassOf, "$this$isSubclassOf");
        s.g(base, "base");
        if (!s.c(isSubclassOf, base)) {
            d11 = v.d(isSubclassOf);
            final o oVar = o00.a.f42035a;
            if (oVar != null) {
                oVar = new b.c() { // from class: o00.b.b
                    @Override // s20.b.c
                    public final /* synthetic */ Iterable a(Object obj) {
                        return (Iterable) l.this.invoke(obj);
                    }
                };
            }
            Boolean e11 = s20.b.e(d11, (b.c) oVar, new a(base));
            s.f(e11, "DFS.ifAny(listOf(this), …erclasses) { it == base }");
            if (!e11.booleanValue()) {
                return false;
            }
        }
        return true;
    }
}