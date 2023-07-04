package d2;

import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final f2.o f23307a;

    /* renamed from: b  reason: collision with root package name */
    private final k f23308b;

    public f(f2.o rootCoordinates) {
        kotlin.jvm.internal.s.g(rootCoordinates, "rootCoordinates");
        this.f23307a = rootCoordinates;
        this.f23308b = new k();
    }

    public final void a(long j11, List<? extends a0> pointerInputFilters) {
        j jVar;
        j jVar2;
        kotlin.jvm.internal.s.g(pointerInputFilters, "pointerInputFilters");
        k kVar = this.f23308b;
        int size = pointerInputFilters.size();
        boolean z11 = true;
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            a0 a0Var = pointerInputFilters.get(i11);
            if (z11) {
                d1.e<j> g11 = kVar.g();
                int l11 = g11.l();
                if (l11 > 0) {
                    j[] k11 = g11.k();
                    int i13 = 0;
                    do {
                        jVar2 = k11[i13];
                        if (kotlin.jvm.internal.s.c(jVar2.k(), a0Var)) {
                            break;
                        }
                        i13++;
                    } while (i13 < l11);
                    jVar2 = null;
                } else {
                    jVar2 = null;
                }
                jVar = jVar2;
                if (jVar != null) {
                    jVar.m();
                    if (!jVar.j().h(t.a(j11))) {
                        jVar.j().b(t.a(j11));
                    }
                    i11 = i12;
                    kVar = jVar;
                } else {
                    z11 = false;
                }
            }
            jVar = new j(a0Var);
            jVar.j().b(t.a(j11));
            kVar.g().b(jVar);
            i11 = i12;
            kVar = jVar;
        }
    }

    public final boolean b(g internalPointerEvent, boolean z11) {
        kotlin.jvm.internal.s.g(internalPointerEvent, "internalPointerEvent");
        if (this.f23308b.a(internalPointerEvent.a(), this.f23307a, internalPointerEvent, z11)) {
            return this.f23308b.e(internalPointerEvent) || this.f23308b.f(internalPointerEvent.a(), this.f23307a, internalPointerEvent, z11);
        }
        return false;
    }

    public final void c() {
        this.f23308b.d();
        this.f23308b.c();
    }

    public final void d() {
        this.f23308b.h();
    }
}