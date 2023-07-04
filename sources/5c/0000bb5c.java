package w0;

import s2.l;

/* loaded from: classes.dex */
public final class s implements t {

    /* renamed from: a  reason: collision with root package name */
    public u f55200a;

    /* renamed from: b  reason: collision with root package name */
    public r1.g f55201b;

    public void a(int i11) {
        l.a aVar = s2.l.f50115b;
        if (s2.l.l(i11, aVar.d())) {
            b().a(r1.c.f48976b.d());
        } else if (s2.l.l(i11, aVar.f())) {
            b().a(r1.c.f48976b.f());
        } else {
            if (s2.l.l(i11, aVar.b()) ? true : s2.l.l(i11, aVar.c()) ? true : s2.l.l(i11, aVar.g()) ? true : s2.l.l(i11, aVar.h()) ? true : s2.l.l(i11, aVar.a())) {
                return;
            }
            s2.l.l(i11, aVar.e());
        }
    }

    public final r1.g b() {
        r1.g gVar = this.f55201b;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.s.x("focusManager");
        return null;
    }

    public final u c() {
        u uVar = this.f55200a;
        if (uVar != null) {
            return uVar;
        }
        kotlin.jvm.internal.s.x("keyboardActions");
        return null;
    }

    public final void d(int i11) {
        h00.l<t, vz.b0> lVar;
        l.a aVar = s2.l.f50115b;
        vz.b0 b0Var = null;
        if (s2.l.l(i11, aVar.b())) {
            lVar = c().b();
        } else if (s2.l.l(i11, aVar.c())) {
            lVar = c().c();
        } else if (s2.l.l(i11, aVar.d())) {
            lVar = c().d();
        } else if (s2.l.l(i11, aVar.f())) {
            lVar = c().e();
        } else if (s2.l.l(i11, aVar.g())) {
            lVar = c().f();
        } else if (s2.l.l(i11, aVar.h())) {
            lVar = c().g();
        } else {
            if (!(s2.l.l(i11, aVar.a()) ? true : s2.l.l(i11, aVar.e()))) {
                throw new IllegalStateException("invalid ImeAction".toString());
            }
            lVar = null;
        }
        if (lVar != null) {
            lVar.invoke(this);
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            a(i11);
        }
    }

    public final void e(r1.g gVar) {
        kotlin.jvm.internal.s.g(gVar, "<set-?>");
        this.f55201b = gVar;
    }

    public final void f(u uVar) {
        kotlin.jvm.internal.s.g(uVar, "<set-?>");
        this.f55200a = uVar;
    }
}