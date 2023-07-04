package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.s;
import zz.g;

/* loaded from: classes5.dex */
public abstract class d extends a {
    private final zz.g _context;
    private transient zz.d<Object> intercepted;

    public d(zz.d<Object> dVar, zz.g gVar) {
        super(dVar);
        this._context = gVar;
    }

    @Override // zz.d
    public zz.g getContext() {
        zz.g gVar = this._context;
        s.e(gVar);
        return gVar;
    }

    public final zz.d<Object> intercepted() {
        zz.d<Object> dVar = this.intercepted;
        if (dVar == null) {
            zz.e eVar = (zz.e) getContext().get(zz.e.f61277h3);
            if (eVar == null || (dVar = eVar.D0(this)) == null) {
                dVar = this;
            }
            this.intercepted = dVar;
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        zz.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            g.b bVar = getContext().get(zz.e.f61277h3);
            s.e(bVar);
            ((zz.e) bVar).C(dVar);
        }
        this.intercepted = c.f34887a;
    }

    public d(zz.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}