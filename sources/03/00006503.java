package d2;

import java.util.Collection;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final h2.k f23436a;

    /* renamed from: b  reason: collision with root package name */
    private final f f23437b;

    /* renamed from: c  reason: collision with root package name */
    private final v f23438c;

    /* renamed from: d  reason: collision with root package name */
    private final h2.f<a0> f23439d;

    public y(h2.k root) {
        kotlin.jvm.internal.s.g(root, "root");
        this.f23436a = root;
        this.f23437b = new f(root.g());
        this.f23438c = new v();
        this.f23439d = new h2.f<>();
    }

    public final h2.k a() {
        return this.f23436a;
    }

    public final int b(w pointerEvent, f0 positionCalculator, boolean z11) {
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.s.g(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.s.g(positionCalculator, "positionCalculator");
        g b11 = this.f23438c.b(pointerEvent, positionCalculator);
        Collection<u> values = b11.a().values();
        boolean z14 = true;
        if (!(values instanceof Collection) || !values.isEmpty()) {
            for (u uVar : values) {
                if (uVar.i() || uVar.k()) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                if (z12) {
                    z13 = true;
                    break;
                }
            }
        }
        z13 = false;
        boolean z15 = !z13;
        for (u uVar2 : b11.a().values()) {
            if (z15 || n.b(uVar2)) {
                h2.k.n0(a(), uVar2.h(), this.f23439d, e0.g(uVar2.m(), e0.f23301a.d()), false, 8, null);
                if (!this.f23439d.isEmpty()) {
                    this.f23437b.a(uVar2.g(), this.f23439d);
                    this.f23439d.clear();
                }
            }
        }
        this.f23437b.d();
        boolean b12 = this.f23437b.b(b11, z11);
        if (!b11.c()) {
            Collection<u> values2 = b11.a().values();
            if (!(values2 instanceof Collection) || !values2.isEmpty()) {
                for (u uVar3 : values2) {
                    if (uVar3.e().b()) {
                        break;
                    }
                }
            }
        }
        z14 = false;
        return z.a(b12, z14);
    }

    public final void c() {
        this.f23438c.a();
        this.f23437b.c();
    }
}