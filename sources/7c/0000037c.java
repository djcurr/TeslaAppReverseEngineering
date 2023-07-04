package androidx.camera.core.impl;

import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.o1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a */
    private final String f2343a;

    /* renamed from: b */
    private final Map<String, b> f2344b = new HashMap();

    /* loaded from: classes.dex */
    public interface a {
        boolean a(b bVar);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final g1 f2345a;

        /* renamed from: b */
        private boolean f2346b = false;

        /* renamed from: c */
        private boolean f2347c = false;

        b(g1 g1Var) {
            this.f2345a = g1Var;
        }

        boolean a() {
            return this.f2347c;
        }

        public boolean b() {
            return this.f2346b;
        }

        g1 c() {
            return this.f2345a;
        }

        void d(boolean z11) {
            this.f2347c = z11;
        }

        void e(boolean z11) {
            this.f2346b = z11;
        }
    }

    public o1(String str) {
        this.f2343a = str;
    }

    public static /* synthetic */ boolean a(b bVar) {
        return bVar.b();
    }

    public static /* synthetic */ boolean b(b bVar) {
        return j(bVar);
    }

    private b g(String str, g1 g1Var) {
        b bVar = this.f2344b.get(str);
        if (bVar == null) {
            b bVar2 = new b(g1Var);
            this.f2344b.put(str, bVar2);
            return bVar2;
        }
        return bVar;
    }

    private Collection<g1> h(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f2344b.entrySet()) {
            if (aVar == null || aVar.a(entry.getValue())) {
                arrayList.add(entry.getValue().c());
            }
        }
        return arrayList;
    }

    public static /* synthetic */ boolean j(b bVar) {
        return bVar.a() && bVar.b();
    }

    public g1.f c() {
        g1.f fVar = new g1.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f2344b.entrySet()) {
            b value = entry.getValue();
            if (value.a() && value.b()) {
                fVar.a(value.c());
                arrayList.add(entry.getKey());
            }
        }
        androidx.camera.core.n0.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f2343a);
        return fVar;
    }

    public Collection<g1> d() {
        return Collections.unmodifiableCollection(h(new a() { // from class: androidx.camera.core.impl.n1
            @Override // androidx.camera.core.impl.o1.a
            public final boolean a(o1.b bVar) {
                return o1.b(bVar);
            }
        }));
    }

    public g1.f e() {
        g1.f fVar = new g1.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, b> entry : this.f2344b.entrySet()) {
            b value = entry.getValue();
            if (value.b()) {
                fVar.a(value.c());
                arrayList.add(entry.getKey());
            }
        }
        androidx.camera.core.n0.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f2343a);
        return fVar;
    }

    public Collection<g1> f() {
        return Collections.unmodifiableCollection(h(new a() { // from class: androidx.camera.core.impl.m1
            @Override // androidx.camera.core.impl.o1.a
            public final boolean a(o1.b bVar) {
                return o1.a(bVar);
            }
        }));
    }

    public boolean i(String str) {
        if (this.f2344b.containsKey(str)) {
            return this.f2344b.get(str).b();
        }
        return false;
    }

    public void l(String str) {
        this.f2344b.remove(str);
    }

    public void m(String str, g1 g1Var) {
        g(str, g1Var).d(true);
    }

    public void n(String str, g1 g1Var) {
        g(str, g1Var).e(true);
    }

    public void o(String str) {
        if (this.f2344b.containsKey(str)) {
            b bVar = this.f2344b.get(str);
            bVar.e(false);
            if (bVar.a()) {
                return;
            }
            this.f2344b.remove(str);
        }
    }

    public void p(String str) {
        if (this.f2344b.containsKey(str)) {
            b bVar = this.f2344b.get(str);
            bVar.d(false);
            if (bVar.b()) {
                return;
            }
            this.f2344b.remove(str);
        }
    }

    public void q(String str, g1 g1Var) {
        if (this.f2344b.containsKey(str)) {
            b bVar = new b(g1Var);
            b bVar2 = this.f2344b.get(str);
            bVar.e(bVar2.b());
            bVar.d(bVar2.a());
            this.f2344b.put(str, bVar);
        }
    }
}