package wh;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import ph.o;
import ph.t;
import qh.k;
import xh.v;
import zh.a;

/* loaded from: classes3.dex */
public class c implements e {

    /* renamed from: f */
    private static final Logger f55885f = Logger.getLogger(t.class.getName());

    /* renamed from: a */
    private final v f55886a;

    /* renamed from: b */
    private final Executor f55887b;

    /* renamed from: c */
    private final qh.d f55888c;

    /* renamed from: d */
    private final yh.d f55889d;

    /* renamed from: e */
    private final zh.a f55890e;

    public c(Executor executor, qh.d dVar, v vVar, yh.d dVar2, zh.a aVar) {
        this.f55887b = executor;
        this.f55888c = dVar;
        this.f55886a = vVar;
        this.f55889d = dVar2;
        this.f55890e = aVar;
    }

    public static /* synthetic */ void b(c cVar, o oVar, nh.h hVar, ph.i iVar) {
        cVar.e(oVar, hVar, iVar);
    }

    public static /* synthetic */ Object c(c cVar, o oVar, ph.i iVar) {
        return cVar.d(oVar, iVar);
    }

    public /* synthetic */ Object d(o oVar, ph.i iVar) {
        this.f55889d.q1(oVar, iVar);
        this.f55886a.a(oVar, 1);
        return null;
    }

    public /* synthetic */ void e(final o oVar, nh.h hVar, ph.i iVar) {
        try {
            k kVar = this.f55888c.get(oVar.b());
            if (kVar == null) {
                String format = String.format("Transport backend '%s' is not registered", oVar.b());
                f55885f.warning(format);
                hVar.a(new IllegalArgumentException(format));
                return;
            }
            final ph.i b11 = kVar.b(iVar);
            this.f55890e.g(new a.InterfaceC1382a() { // from class: wh.b
                {
                    c.this = this;
                }

                @Override // zh.a.InterfaceC1382a
                public final Object execute() {
                    return c.c(c.this, oVar, b11);
                }
            });
            hVar.a(null);
        } catch (Exception e11) {
            Logger logger = f55885f;
            logger.warning("Error scheduling event " + e11.getMessage());
            hVar.a(e11);
        }
    }

    @Override // wh.e
    public void a(final o oVar, final ph.i iVar, final nh.h hVar) {
        this.f55887b.execute(new Runnable() { // from class: wh.a
            {
                c.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                c.b(c.this, oVar, hVar, iVar);
            }
        });
    }
}