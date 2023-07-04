package s2;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private a0 f50072a = new a0(n2.b.d(), n2.y.f40417b.a(), (n2.y) null, (DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private g f50073b = new g(this.f50072a.e(), this.f50072a.g(), null);

    public final a0 a(List<? extends d> editCommands) {
        kotlin.jvm.internal.s.g(editCommands, "editCommands");
        int size = editCommands.size();
        for (int i11 = 0; i11 < size; i11++) {
            editCommands.get(i11).a(b());
        }
        a0 a0Var = new a0(this.f50073b.o(), n2.z.b(this.f50073b.i(), this.f50073b.h()), this.f50073b.j() ? n2.y.b(n2.z.b(this.f50073b.e(), this.f50073b.d())) : null, (DefaultConstructorMarker) null);
        this.f50072a = a0Var;
        return a0Var;
    }

    public final g b() {
        return this.f50073b;
    }

    public final void c(a0 value, h0 h0Var) {
        kotlin.jvm.internal.s.g(value, "value");
        if (!kotlin.jvm.internal.s.c(this.f50072a.e(), value.e())) {
            this.f50073b = new g(value.e(), value.g(), null);
        } else if (!n2.y.g(this.f50072a.g(), value.g())) {
            this.f50073b.n(n2.y.l(value.g()), n2.y.k(value.g()));
        }
        if (value.f() == null) {
            this.f50073b.a();
        } else if (!n2.y.h(value.f().r())) {
            this.f50073b.l(n2.y.l(value.f().r()), n2.y.k(value.f().r()));
        }
        a0 a0Var = this.f50072a;
        this.f50072a = value;
        if (h0Var == null) {
            return;
        }
        h0Var.f(a0Var, value);
    }

    public final a0 d() {
        return this.f50072a;
    }
}