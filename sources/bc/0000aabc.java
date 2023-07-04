package ph;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes3.dex */
public class t implements s {

    /* renamed from: e  reason: collision with root package name */
    private static volatile u f46528e;

    /* renamed from: a  reason: collision with root package name */
    private final ai.a f46529a;

    /* renamed from: b  reason: collision with root package name */
    private final ai.a f46530b;

    /* renamed from: c  reason: collision with root package name */
    private final wh.e f46531c;

    /* renamed from: d  reason: collision with root package name */
    private final xh.p f46532d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(ai.a aVar, ai.a aVar2, wh.e eVar, xh.p pVar, xh.t tVar) {
        this.f46529a = aVar;
        this.f46530b = aVar2;
        this.f46531c = eVar;
        this.f46532d = pVar;
        tVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f46529a.a()).k(this.f46530b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f46528e;
        if (uVar != null) {
            return uVar.g();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<nh.b> d(f fVar) {
        if (fVar instanceof g) {
            return Collections.unmodifiableSet(((g) fVar).a());
        }
        return Collections.singleton(nh.b.b("proto"));
    }

    public static void f(Context context) {
        if (f46528e == null) {
            synchronized (t.class) {
                if (f46528e == null) {
                    f46528e = e.j().a(context).build();
                }
            }
        }
    }

    @Override // ph.s
    public void a(n nVar, nh.h hVar) {
        this.f46531c.a(nVar.f().f(nVar.c().c()), b(nVar), hVar);
    }

    public xh.p e() {
        return this.f46532d;
    }

    @Deprecated
    public nh.g g(String str) {
        return new p(d(null), o.a().b(str).a(), this);
    }

    public nh.g h(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}