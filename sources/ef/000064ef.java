package d2;

import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final d1.e<j> f23383a = new d1.e<>(new j[16], 0);

    public boolean a(Map<t, u> changes, f2.o parentCoordinates, g internalPointerEvent, boolean z11) {
        kotlin.jvm.internal.s.g(changes, "changes");
        kotlin.jvm.internal.s.g(parentCoordinates, "parentCoordinates");
        kotlin.jvm.internal.s.g(internalPointerEvent, "internalPointerEvent");
        d1.e<j> eVar = this.f23383a;
        int l11 = eVar.l();
        if (l11 > 0) {
            j[] k11 = eVar.k();
            int i11 = 0;
            boolean z12 = false;
            do {
                z12 = k11[i11].a(changes, parentCoordinates, internalPointerEvent, z11) || z12;
                i11++;
            } while (i11 < l11);
            return z12;
        }
        return false;
    }

    public void b(g internalPointerEvent) {
        kotlin.jvm.internal.s.g(internalPointerEvent, "internalPointerEvent");
        int l11 = this.f23383a.l() - 1;
        if (l11 < 0) {
            return;
        }
        while (true) {
            int i11 = l11 - 1;
            if (this.f23383a.k()[l11].j().n()) {
                this.f23383a.s(l11);
            }
            if (i11 < 0) {
                return;
            }
            l11 = i11;
        }
    }

    public final void c() {
        this.f23383a.g();
    }

    public void d() {
        d1.e<j> eVar = this.f23383a;
        int l11 = eVar.l();
        if (l11 > 0) {
            int i11 = 0;
            j[] k11 = eVar.k();
            do {
                k11[i11].d();
                i11++;
            } while (i11 < l11);
        }
    }

    public boolean e(g internalPointerEvent) {
        kotlin.jvm.internal.s.g(internalPointerEvent, "internalPointerEvent");
        d1.e<j> eVar = this.f23383a;
        int l11 = eVar.l();
        boolean z11 = false;
        if (l11 > 0) {
            j[] k11 = eVar.k();
            int i11 = 0;
            boolean z12 = false;
            do {
                z12 = k11[i11].e(internalPointerEvent) || z12;
                i11++;
            } while (i11 < l11);
            z11 = z12;
        }
        b(internalPointerEvent);
        return z11;
    }

    public boolean f(Map<t, u> changes, f2.o parentCoordinates, g internalPointerEvent, boolean z11) {
        kotlin.jvm.internal.s.g(changes, "changes");
        kotlin.jvm.internal.s.g(parentCoordinates, "parentCoordinates");
        kotlin.jvm.internal.s.g(internalPointerEvent, "internalPointerEvent");
        d1.e<j> eVar = this.f23383a;
        int l11 = eVar.l();
        if (l11 > 0) {
            j[] k11 = eVar.k();
            int i11 = 0;
            boolean z12 = false;
            do {
                z12 = k11[i11].f(changes, parentCoordinates, internalPointerEvent, z11) || z12;
                i11++;
            } while (i11 < l11);
            return z12;
        }
        return false;
    }

    public final d1.e<j> g() {
        return this.f23383a;
    }

    public final void h() {
        int i11 = 0;
        while (i11 < this.f23383a.l()) {
            j jVar = this.f23383a.k()[i11];
            if (!jVar.k().v0()) {
                this.f23383a.s(i11);
                jVar.d();
            } else {
                i11++;
                jVar.h();
            }
        }
    }
}