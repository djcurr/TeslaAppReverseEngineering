package v00;

import h00.l;
import j20.m;
import j20.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import t00.k;
import w00.a0;
import w00.n0;
import w00.x;
import wz.v;
import wz.w0;
import wz.x0;

/* loaded from: classes5.dex */
public final class e implements x00.b {

    /* renamed from: g  reason: collision with root package name */
    private static final u10.f f53807g;

    /* renamed from: h  reason: collision with root package name */
    private static final u10.b f53808h;

    /* renamed from: a  reason: collision with root package name */
    private final x f53809a;

    /* renamed from: b  reason: collision with root package name */
    private final l<x, w00.i> f53810b;

    /* renamed from: c  reason: collision with root package name */
    private final j20.i f53811c;

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f53805e = {m0.j(new f0(m0.b(e.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};

    /* renamed from: d  reason: collision with root package name */
    public static final b f53804d = new b(null);

    /* renamed from: f  reason: collision with root package name */
    private static final u10.c f53806f = k.f51317l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends u implements l<x, t00.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f53812a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final t00.b mo12invoke(x module) {
            s.g(module, "module");
            List<a0> e02 = module.R(e.f53806f).e0();
            ArrayList arrayList = new ArrayList();
            for (Object obj : e02) {
                if (obj instanceof t00.b) {
                    arrayList.add(obj);
                }
            }
            return (t00.b) wz.u.b0(arrayList);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u10.b a() {
            return e.f53808h;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends u implements h00.a<y00.h> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f53814b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n nVar) {
            super(0);
            this.f53814b = nVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final y00.h mo11invoke() {
            List d11;
            Set<w00.b> d12;
            w00.i iVar = (w00.i) e.this.f53810b.mo12invoke(e.this.f53809a);
            u10.f fVar = e.f53807g;
            kotlin.reflect.jvm.internal.impl.descriptors.f fVar2 = kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT;
            kotlin.reflect.jvm.internal.impl.descriptors.c cVar = kotlin.reflect.jvm.internal.impl.descriptors.c.INTERFACE;
            d11 = v.d(e.this.f53809a.l().i());
            y00.h hVar = new y00.h(iVar, fVar, fVar2, cVar, d11, n0.f55303a, false, this.f53814b);
            v00.a aVar = new v00.a(this.f53814b, hVar);
            d12 = x0.d();
            hVar.G0(aVar, d12, null);
            return hVar;
        }
    }

    static {
        u10.d dVar = k.a.f51328d;
        u10.f i11 = dVar.i();
        s.f(i11, "cloneable.shortName()");
        f53807g = i11;
        u10.b m11 = u10.b.m(dVar.l());
        s.f(m11, "topLevel(StandardNames.FqNames.cloneable.toSafe())");
        f53808h = m11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(n storageManager, x moduleDescriptor, l<? super x, ? extends w00.i> computeContainingDeclaration) {
        s.g(storageManager, "storageManager");
        s.g(moduleDescriptor, "moduleDescriptor");
        s.g(computeContainingDeclaration, "computeContainingDeclaration");
        this.f53809a = moduleDescriptor;
        this.f53810b = computeContainingDeclaration;
        this.f53811c = storageManager.b(new c(storageManager));
    }

    private final y00.h i() {
        return (y00.h) m.a(this.f53811c, this, f53805e[0]);
    }

    @Override // x00.b
    public Collection<w00.c> a(u10.c packageFqName) {
        Set d11;
        Set c11;
        s.g(packageFqName, "packageFqName");
        if (s.c(packageFqName, f53806f)) {
            c11 = w0.c(i());
            return c11;
        }
        d11 = x0.d();
        return d11;
    }

    @Override // x00.b
    public w00.c b(u10.b classId) {
        s.g(classId, "classId");
        if (s.c(classId, f53808h)) {
            return i();
        }
        return null;
    }

    @Override // x00.b
    public boolean c(u10.c packageFqName, u10.f name) {
        s.g(packageFqName, "packageFqName");
        s.g(name, "name");
        return s.c(name, f53807g) && s.c(packageFqName, f53806f);
    }

    public /* synthetic */ e(n nVar, x xVar, l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, xVar, (i11 & 4) != 0 ? a.f53812a : lVar);
    }
}