package xh;

import java.util.concurrent.Executor;
import zh.a;

/* loaded from: classes3.dex */
public class t {

    /* renamed from: a */
    private final Executor f57441a;

    /* renamed from: b */
    private final yh.d f57442b;

    /* renamed from: c */
    private final v f57443c;

    /* renamed from: d */
    private final zh.a f57444d;

    public t(Executor executor, yh.d dVar, v vVar, zh.a aVar) {
        this.f57441a = executor;
        this.f57442b = dVar;
        this.f57443c = vVar;
        this.f57444d = aVar;
    }

    public static /* synthetic */ Object a(t tVar) {
        return tVar.d();
    }

    public static /* synthetic */ void b(t tVar) {
        tVar.e();
    }

    public /* synthetic */ Object d() {
        for (ph.o oVar : this.f57442b.F()) {
            this.f57443c.a(oVar, 1);
        }
        return null;
    }

    public /* synthetic */ void e() {
        this.f57444d.g(new a.InterfaceC1382a() { // from class: xh.s
            {
                t.this = this;
            }

            @Override // zh.a.InterfaceC1382a
            public final Object execute() {
                return t.a(t.this);
            }
        });
    }

    public void c() {
        this.f57441a.execute(new Runnable() { // from class: xh.r
            {
                t.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                t.b(t.this);
            }
        });
    }
}