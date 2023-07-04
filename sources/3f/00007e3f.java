package kotlin.coroutines.jvm.internal;

/* loaded from: classes5.dex */
public abstract class j extends a {
    public j(zz.d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == zz.h.f61280a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // zz.d
    public zz.g getContext() {
        return zz.h.f61280a;
    }
}