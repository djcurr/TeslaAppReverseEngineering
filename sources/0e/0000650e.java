package d20;

import d20.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k20.d0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import w00.i0;
import wz.b0;
import wz.e0;
import wz.w;

/* loaded from: classes5.dex */
public abstract class e extends i {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f23469d = {m0.j(new f0(m0.b(e.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b  reason: collision with root package name */
    private final w00.c f23470b;

    /* renamed from: c  reason: collision with root package name */
    private final j20.i f23471c;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<List<? extends w00.i>> {
        a() {
            super(0);
        }

        @Override // h00.a
        public final List<? extends w00.i> invoke() {
            List<? extends w00.i> y02;
            List<kotlin.reflect.jvm.internal.impl.descriptors.e> i11 = e.this.i();
            y02 = e0.y0(i11, e.this.j(i11));
            return y02;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends w10.h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList<w00.i> f23473a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f23474b;

        b(ArrayList<w00.i> arrayList, e eVar) {
            this.f23473a = arrayList;
            this.f23474b = eVar;
        }

        @Override // w10.i
        public void a(kotlin.reflect.jvm.internal.impl.descriptors.b fakeOverride) {
            s.g(fakeOverride, "fakeOverride");
            w10.j.L(fakeOverride, null);
            this.f23473a.add(fakeOverride);
        }

        @Override // w10.h
        protected void e(kotlin.reflect.jvm.internal.impl.descriptors.b fromSuper, kotlin.reflect.jvm.internal.impl.descriptors.b fromCurrent) {
            s.g(fromSuper, "fromSuper");
            s.g(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f23474b.l() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public e(j20.n storageManager, w00.c containingClass) {
        s.g(storageManager, "storageManager");
        s.g(containingClass, "containingClass");
        this.f23470b = containingClass;
        this.f23471c = storageManager.b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<w00.i> j(List<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> list) {
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> i11;
        ArrayList arrayList = new ArrayList(3);
        Collection<d0> a11 = this.f23470b.i().a();
        s.f(a11, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        for (d0 d0Var : a11) {
            b0.z(arrayList2, k.a.a(d0Var.m(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            u10.f name = ((kotlin.reflect.jvm.internal.impl.descriptors.b) obj2).getName();
            Object obj3 = linkedHashMap.get(name);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(name, obj3);
            }
            ((List) obj3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            u10.f fVar = (u10.f) entry.getKey();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : (List) entry.getValue()) {
                Boolean valueOf = Boolean.valueOf(((kotlin.reflect.jvm.internal.impl.descriptors.b) obj4) instanceof kotlin.reflect.jvm.internal.impl.descriptors.e);
                Object obj5 = linkedHashMap2.get(valueOf);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj5);
                }
                ((List) obj5).add(obj4);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list2 = (List) entry2.getValue();
                w10.j jVar = w10.j.f55379d;
                if (booleanValue) {
                    i11 = new ArrayList<>();
                    for (Object obj6 : list) {
                        if (s.c(((kotlin.reflect.jvm.internal.impl.descriptors.e) obj6).getName(), fVar)) {
                            i11.add(obj6);
                        }
                    }
                } else {
                    i11 = w.i();
                }
                jVar.w(fVar, list2, i11, this.f23470b, new b(arrayList, this));
            }
        }
        return s20.a.c(arrayList);
    }

    private final List<w00.i> k() {
        return (List) j20.m.a(this.f23471c, this, f23469d[0]);
    }

    @Override // d20.i, d20.h
    public Collection<i0> a(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        List<w00.i> k11 = k();
        s20.e eVar = new s20.e();
        for (Object obj : k11) {
            if ((obj instanceof i0) && s.c(((i0) obj).getName(), name)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // d20.i, d20.h
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        List<w00.i> k11 = k();
        s20.e eVar = new s20.e();
        for (Object obj : k11) {
            if ((obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) && s.c(((kotlin.reflect.jvm.internal.impl.descriptors.h) obj).getName(), name)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }

    @Override // d20.i, d20.k
    public Collection<w00.i> g(d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        List i11;
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        if (kindFilter.a(d.f23459p.m())) {
            return k();
        }
        i11 = w.i();
        return i11;
    }

    protected abstract List<kotlin.reflect.jvm.internal.impl.descriptors.e> i();

    /* JADX INFO: Access modifiers changed from: protected */
    public final w00.c l() {
        return this.f23470b;
    }
}