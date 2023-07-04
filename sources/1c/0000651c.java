package d20;

import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import wz.w;

/* loaded from: classes5.dex */
public final class l extends i {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f23483d = {m0.j(new f0(m0.b(l.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: b  reason: collision with root package name */
    private final w00.c f23484b;

    /* renamed from: c  reason: collision with root package name */
    private final j20.i f23485c;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {
        a() {
            super(0);
        }

        @Override // h00.a
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> invoke() {
            List<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> l11;
            l11 = w.l(w10.c.d(l.this.f23484b), w10.c.e(l.this.f23484b));
            return l11;
        }
    }

    public l(j20.n storageManager, w00.c containingClass) {
        s.g(storageManager, "storageManager");
        s.g(containingClass, "containingClass");
        this.f23484b = containingClass;
        containingClass.getKind();
        kotlin.reflect.jvm.internal.impl.descriptors.c cVar = kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_CLASS;
        this.f23485c = storageManager.b(new a());
    }

    private final List<kotlin.reflect.jvm.internal.impl.descriptors.h> l() {
        return (List) j20.m.a(this.f23485c, this, f23483d[0]);
    }

    @Override // d20.i, d20.k
    public /* bridge */ /* synthetic */ w00.e e(u10.f fVar, d10.b bVar) {
        return (w00.e) i(fVar, bVar);
    }

    public Void i(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        return null;
    }

    @Override // d20.i, d20.k
    /* renamed from: j */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.h> g(d kindFilter, h00.l<? super u10.f, Boolean> nameFilter) {
        s.g(kindFilter, "kindFilter");
        s.g(nameFilter, "nameFilter");
        return l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d20.i, d20.h
    /* renamed from: k */
    public s20.e<kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f name, d10.b location) {
        s.g(name, "name");
        s.g(location, "location");
        List<kotlin.reflect.jvm.internal.impl.descriptors.h> l11 = l();
        s20.e<kotlin.reflect.jvm.internal.impl.descriptors.h> eVar = new s20.e<>();
        for (Object obj : l11) {
            if (s.c(((kotlin.reflect.jvm.internal.impl.descriptors.h) obj).getName(), name)) {
                eVar.add(obj);
            }
        }
        return eVar;
    }
}