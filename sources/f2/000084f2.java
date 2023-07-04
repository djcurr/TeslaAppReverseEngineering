package ly;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public enum a implements iy.b {
    DISPOSED;

    public static boolean dispose(AtomicReference<iy.b> atomicReference) {
        iy.b andSet;
        iy.b bVar = atomicReference.get();
        a aVar = DISPOSED;
        if (bVar == aVar || (andSet = atomicReference.getAndSet(aVar)) == aVar) {
            return false;
        }
        if (andSet != null) {
            andSet.dispose();
            return true;
        }
        return true;
    }

    public static boolean isDisposed(iy.b bVar) {
        return bVar == DISPOSED;
    }

    public static boolean replace(AtomicReference<iy.b> atomicReference, iy.b bVar) {
        iy.b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar != null) {
                    bVar.dispose();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        return true;
    }

    public static void reportDisposableSet() {
        az.a.r(new ProtocolViolationException("Disposable already set!"));
    }

    public static boolean set(AtomicReference<iy.b> atomicReference, iy.b bVar) {
        iy.b bVar2;
        do {
            bVar2 = atomicReference.get();
            if (bVar2 == DISPOSED) {
                if (bVar != null) {
                    bVar.dispose();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(bVar2, bVar));
        if (bVar2 != null) {
            bVar2.dispose();
            return true;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<iy.b> atomicReference, iy.b bVar) {
        Objects.requireNonNull(bVar, "d is null");
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() != DISPOSED) {
            reportDisposableSet();
            return false;
        }
        return false;
    }

    public static boolean trySet(AtomicReference<iy.b> atomicReference, iy.b bVar) {
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        if (atomicReference.get() == DISPOSED) {
            bVar.dispose();
            return false;
        }
        return false;
    }

    public static boolean validate(iy.b bVar, iy.b bVar2) {
        if (bVar2 == null) {
            az.a.r(new NullPointerException("next is null"));
            return false;
        } else if (bVar != null) {
            bVar2.dispose();
            reportDisposableSet();
            return false;
        } else {
            return true;
        }
    }

    @Override // iy.b
    public void dispose() {
    }

    @Override // iy.b
    public boolean isDisposed() {
        return true;
    }
}