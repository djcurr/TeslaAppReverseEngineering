package xy;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public enum e implements b80.c {
    CANCELLED;

    public static boolean cancel(AtomicReference<b80.c> atomicReference) {
        b80.c andSet;
        b80.c cVar = atomicReference.get();
        e eVar = CANCELLED;
        if (cVar == eVar || (andSet = atomicReference.getAndSet(eVar)) == eVar) {
            return false;
        }
        if (andSet != null) {
            andSet.cancel();
            return true;
        }
        return true;
    }

    public static void deferredRequest(AtomicReference<b80.c> atomicReference, AtomicLong atomicLong, long j11) {
        b80.c cVar = atomicReference.get();
        if (cVar != null) {
            cVar.request(j11);
        } else if (validate(j11)) {
            yy.c.a(atomicLong, j11);
            b80.c cVar2 = atomicReference.get();
            if (cVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    cVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<b80.c> atomicReference, AtomicLong atomicLong, b80.c cVar) {
        if (setOnce(atomicReference, cVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                cVar.request(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean replace(AtomicReference<b80.c> atomicReference, b80.c cVar) {
        b80.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar != null) {
                    cVar.cancel();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        return true;
    }

    public static void reportMoreProduced(long j11) {
        az.a.r(new ProtocolViolationException("More produced than requested: " + j11));
    }

    public static void reportSubscriptionSet() {
        az.a.r(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<b80.c> atomicReference, b80.c cVar) {
        b80.c cVar2;
        do {
            cVar2 = atomicReference.get();
            if (cVar2 == CANCELLED) {
                if (cVar != null) {
                    cVar.cancel();
                    return false;
                }
                return false;
            }
        } while (!atomicReference.compareAndSet(cVar2, cVar));
        if (cVar2 != null) {
            cVar2.cancel();
            return true;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<b80.c> atomicReference, b80.c cVar) {
        Objects.requireNonNull(cVar, "s is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() != CANCELLED) {
            reportSubscriptionSet();
            return false;
        }
        return false;
    }

    public static boolean validate(b80.c cVar, b80.c cVar2) {
        if (cVar2 == null) {
            az.a.r(new NullPointerException("next is null"));
            return false;
        } else if (cVar != null) {
            cVar2.cancel();
            reportSubscriptionSet();
            return false;
        } else {
            return true;
        }
    }

    @Override // b80.c
    public void cancel() {
    }

    @Override // b80.c
    public void request(long j11) {
    }

    public static boolean validate(long j11) {
        if (j11 <= 0) {
            az.a.r(new IllegalArgumentException("n > 0 required but it was " + j11));
            return false;
        }
        return true;
    }

    public static boolean setOnce(AtomicReference<b80.c> atomicReference, b80.c cVar, long j11) {
        if (setOnce(atomicReference, cVar)) {
            cVar.request(j11);
            return true;
        }
        return false;
    }
}