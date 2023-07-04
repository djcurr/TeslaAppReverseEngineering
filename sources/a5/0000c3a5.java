package yy;

import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class e {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        az.a.r(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<b80.c> atomicReference, b80.c cVar, Class<?> cls) {
        Objects.requireNonNull(cVar, "next is null");
        if (atomicReference.compareAndSet(null, cVar)) {
            return true;
        }
        cVar.cancel();
        if (atomicReference.get() != xy.e.CANCELLED) {
            b(cls);
            return false;
        }
        return false;
    }
}