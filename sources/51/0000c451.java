package z5;

import androidx.core.view.a0;
import coil.memory.BaseRequestDelegate;
import coil.memory.RequestDelegate;
import coil.memory.ViewTargetRequestDelegate;
import v20.a2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final r5.d f60218a;

    /* renamed from: b  reason: collision with root package name */
    private final t5.d f60219b;

    /* renamed from: c  reason: collision with root package name */
    private final g6.k f60220c;

    public a(r5.d imageLoader, t5.d referenceCounter, g6.k kVar) {
        kotlin.jvm.internal.s.g(imageLoader, "imageLoader");
        kotlin.jvm.internal.s.g(referenceCounter, "referenceCounter");
        this.f60218a = imageLoader;
        this.f60219b = referenceCounter;
        this.f60220c = kVar;
    }

    public final RequestDelegate a(b6.g request, t targetDelegate, a2 job) {
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(targetDelegate, "targetDelegate");
        kotlin.jvm.internal.s.g(job, "job");
        androidx.lifecycle.p v11 = request.v();
        d6.b G = request.G();
        if (G instanceof d6.c) {
            ViewTargetRequestDelegate viewTargetRequestDelegate = new ViewTargetRequestDelegate(this.f60218a, request, targetDelegate, job);
            v11.a(viewTargetRequestDelegate);
            if (G instanceof androidx.lifecycle.u) {
                v11.a((androidx.lifecycle.u) G);
            }
            d6.c cVar = (d6.c) G;
            g6.e.g(cVar.mo51getView()).e(viewTargetRequestDelegate);
            if (a0.Y(cVar.mo51getView())) {
                return viewTargetRequestDelegate;
            }
            g6.e.g(cVar.mo51getView()).onViewDetachedFromWindow(cVar.mo51getView());
            return viewTargetRequestDelegate;
        }
        BaseRequestDelegate baseRequestDelegate = new BaseRequestDelegate(v11, job);
        v11.a(baseRequestDelegate);
        return baseRequestDelegate;
    }

    public final t b(d6.b bVar, int i11, r5.c eventListener) {
        t nVar;
        kotlin.jvm.internal.s.g(eventListener, "eventListener");
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("Invalid type.".toString());
            }
            if (bVar == null) {
                return new i(this.f60219b);
            }
            nVar = new j(bVar, this.f60219b, eventListener, this.f60220c);
        } else if (bVar == null) {
            return c.f60222a;
        } else {
            nVar = bVar instanceof d6.a ? new n((d6.a) bVar, this.f60219b, eventListener, this.f60220c) : new j(bVar, this.f60219b, eventListener, this.f60220c);
        }
        return nVar;
    }
}