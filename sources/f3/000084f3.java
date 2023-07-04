package ly;

import hy.h;
import hy.k;
import hy.o;

/* loaded from: classes5.dex */
public enum b implements ny.c<Object> {
    INSTANCE,
    NEVER;

    public static void complete(k<?> kVar) {
        kVar.a(INSTANCE);
        kVar.onComplete();
    }

    public static void error(Throwable th2, k<?> kVar) {
        kVar.a(INSTANCE);
        kVar.onError(th2);
    }

    @Override // ny.h
    public void clear() {
    }

    @Override // iy.b
    public void dispose() {
    }

    @Override // iy.b
    public boolean isDisposed() {
        return this == INSTANCE;
    }

    @Override // ny.h
    public boolean isEmpty() {
        return true;
    }

    @Override // ny.h
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ny.h
    public Object poll() {
        return null;
    }

    @Override // ny.d
    public int requestFusion(int i11) {
        return i11 & 2;
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(h<?> hVar) {
        hVar.a(INSTANCE);
        hVar.onComplete();
    }

    public static void error(Throwable th2, hy.c cVar) {
        cVar.a(INSTANCE);
        cVar.onError(th2);
    }

    public static void complete(hy.c cVar) {
        cVar.a(INSTANCE);
        cVar.onComplete();
    }

    public static void error(Throwable th2, o<?> oVar) {
        oVar.a(INSTANCE);
        oVar.onError(th2);
    }

    public static void error(Throwable th2, h<?> hVar) {
        hVar.a(INSTANCE);
        hVar.onError(th2);
    }
}