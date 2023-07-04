package y00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.InvalidModuleException;
import w00.x;
import wz.s0;
import wz.x0;
import y00.a0;

/* loaded from: classes5.dex */
public final class x extends j implements w00.x {

    /* renamed from: c  reason: collision with root package name */
    private final j20.n f58915c;

    /* renamed from: d  reason: collision with root package name */
    private final t00.h f58916d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<w00.w<?>, Object> f58917e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f58918f;

    /* renamed from: g  reason: collision with root package name */
    private v f58919g;

    /* renamed from: h  reason: collision with root package name */
    private w00.b0 f58920h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f58921i;

    /* renamed from: j  reason: collision with root package name */
    private final j20.g<u10.c, w00.f0> f58922j;

    /* renamed from: k  reason: collision with root package name */
    private final vz.k f58923k;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<i> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final i invoke() {
            int t11;
            v vVar = x.this.f58919g;
            x xVar = x.this;
            if (vVar != null) {
                List<x> a11 = vVar.a();
                a11.contains(x.this);
                for (x xVar2 : a11) {
                    xVar2.P0();
                }
                t11 = wz.x.t(a11, 10);
                ArrayList arrayList = new ArrayList(t11);
                for (x xVar3 : a11) {
                    w00.b0 b0Var = xVar3.f58920h;
                    kotlin.jvm.internal.s.e(b0Var);
                    arrayList.add(b0Var);
                }
                return new i(arrayList, kotlin.jvm.internal.s.p("CompositeProvider@ModuleDescriptor for ", x.this.getName()));
            }
            throw new AssertionError("Dependencies of module " + xVar.L0() + " were not set before querying module content");
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<u10.c, w00.f0> {
        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final w00.f0 invoke(u10.c fqName) {
            kotlin.jvm.internal.s.g(fqName, "fqName");
            a0 a0Var = x.this.f58918f;
            x xVar = x.this;
            return a0Var.a(xVar, fqName, xVar.f58915c);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(u10.f moduleName, j20.n storageManager, t00.h builtIns, v10.a aVar) {
        this(moduleName, storageManager, builtIns, aVar, null, null, 48, null);
        kotlin.jvm.internal.s.g(moduleName, "moduleName");
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(builtIns, "builtIns");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ x(u10.f r10, j20.n r11, t00.h r12, v10.a r13, java.util.Map r14, u10.f r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r16 & 16
            if (r0 == 0) goto L12
            java.util.Map r0 = wz.p0.i()
            r7 = r0
            goto L13
        L12:
            r7 = r14
        L13:
            r0 = r16 & 32
            if (r0 == 0) goto L19
            r8 = r1
            goto L1a
        L19:
            r8 = r15
        L1a:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.x.<init>(u10.f, j20.n, t00.h, v10.a, java.util.Map, u10.f, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String L0() {
        String fVar = getName().toString();
        kotlin.jvm.internal.s.f(fVar, "name.toString()");
        return fVar;
    }

    private final i N0() {
        return (i) this.f58923k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean P0() {
        return this.f58920h != null;
    }

    public void K0() {
        if (!Q0()) {
            throw new InvalidModuleException(kotlin.jvm.internal.s.p("Accessing invalid module descriptor ", this));
        }
    }

    public final w00.b0 M0() {
        K0();
        return N0();
    }

    public final void O0(w00.b0 providerForModuleContent) {
        kotlin.jvm.internal.s.g(providerForModuleContent, "providerForModuleContent");
        P0();
        this.f58920h = providerForModuleContent;
    }

    public boolean Q0() {
        return this.f58921i;
    }

    @Override // w00.x
    public w00.f0 R(u10.c fqName) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        K0();
        return this.f58922j.invoke(fqName);
    }

    public final void R0(List<x> descriptors) {
        Set<x> d11;
        kotlin.jvm.internal.s.g(descriptors, "descriptors");
        d11 = x0.d();
        S0(descriptors, d11);
    }

    public final void S0(List<x> descriptors, Set<x> friends) {
        List i11;
        Set d11;
        kotlin.jvm.internal.s.g(descriptors, "descriptors");
        kotlin.jvm.internal.s.g(friends, "friends");
        i11 = wz.w.i();
        d11 = x0.d();
        T0(new w(descriptors, friends, i11, d11));
    }

    public final void T0(v dependencies) {
        kotlin.jvm.internal.s.g(dependencies, "dependencies");
        this.f58919g = dependencies;
    }

    public final void U0(x... descriptors) {
        List<x> s02;
        kotlin.jvm.internal.s.g(descriptors, "descriptors");
        s02 = wz.p.s0(descriptors);
        R0(s02);
    }

    @Override // w00.i
    public w00.i b() {
        return x.a.b(this);
    }

    @Override // w00.x
    public t00.h l() {
        return this.f58916d;
    }

    @Override // w00.x
    public <T> T l0(w00.w<T> capability) {
        kotlin.jvm.internal.s.g(capability, "capability");
        return (T) this.f58917e.get(capability);
    }

    @Override // w00.x
    public Collection<u10.c> r(u10.c fqName, h00.l<? super u10.f, Boolean> nameFilter) {
        kotlin.jvm.internal.s.g(fqName, "fqName");
        kotlin.jvm.internal.s.g(nameFilter, "nameFilter");
        K0();
        return M0().r(fqName, nameFilter);
    }

    @Override // w00.x
    public List<w00.x> t0() {
        v vVar = this.f58919g;
        if (vVar != null) {
            return vVar.b();
        }
        throw new AssertionError("Dependencies of module " + L0() + " were not set");
    }

    @Override // w00.i
    public <R, D> R v0(w00.k<R, D> kVar, D d11) {
        return (R) x.a.a(this, kVar, d11);
    }

    @Override // w00.x
    public boolean y(w00.x targetModule) {
        boolean T;
        kotlin.jvm.internal.s.g(targetModule, "targetModule");
        if (kotlin.jvm.internal.s.c(this, targetModule)) {
            return true;
        }
        v vVar = this.f58919g;
        kotlin.jvm.internal.s.e(vVar);
        T = wz.e0.T(vVar.c(), targetModule);
        return T || t0().contains(targetModule) || targetModule.t0().contains(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(u10.f moduleName, j20.n storageManager, t00.h builtIns, v10.a aVar, Map<w00.w<?>, ? extends Object> capabilities, u10.f fVar) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), moduleName);
        Map<w00.w<?>, Object> y11;
        vz.k a11;
        kotlin.jvm.internal.s.g(moduleName, "moduleName");
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(builtIns, "builtIns");
        kotlin.jvm.internal.s.g(capabilities, "capabilities");
        this.f58915c = storageManager;
        this.f58916d = builtIns;
        if (moduleName.g()) {
            y11 = s0.y(capabilities);
            this.f58917e = y11;
            y11.put(kotlin.reflect.jvm.internal.impl.types.checker.i.a(), new kotlin.reflect.jvm.internal.impl.types.checker.q(null));
            a0 a0Var = (a0) l0(a0.f58736a.a());
            this.f58918f = a0Var == null ? a0.b.f58739b : a0Var;
            this.f58921i = true;
            this.f58922j = storageManager.e(new b());
            a11 = vz.m.a(new a());
            this.f58923k = a11;
            return;
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Module name must be special: ", moduleName));
    }
}