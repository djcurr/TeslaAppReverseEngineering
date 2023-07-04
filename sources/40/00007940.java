package io.sentry;

import io.sentry.exception.ExceptionMechanismException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c3 {

    /* renamed from: a  reason: collision with root package name */
    private final i3 f32210a;

    public c3(i3 i3Var) {
        this.f32210a = (i3) rz.j.a(i3Var, "The SentryStackTraceFactory is required.");
    }

    private io.sentry.protocol.n b(Throwable th2, io.sentry.protocol.h hVar, Thread thread, boolean z11) {
        Package r02 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        io.sentry.protocol.n nVar = new io.sentry.protocol.n();
        String message = th2.getMessage();
        if (r02 != null) {
            name = name.replace(r02.getName() + ".", "");
        }
        String name2 = r02 != null ? r02.getName() : null;
        List<io.sentry.protocol.s> a11 = this.f32210a.a(th2.getStackTrace());
        if (a11 != null && !a11.isEmpty()) {
            io.sentry.protocol.t tVar = new io.sentry.protocol.t(a11);
            if (z11) {
                tVar.d(Boolean.TRUE);
            }
            nVar.l(tVar);
        }
        if (thread != null) {
            nVar.m(Long.valueOf(thread.getId()));
        }
        nVar.n(name);
        nVar.j(hVar);
        nVar.k(name2);
        nVar.p(message);
        return nVar;
    }

    private List<io.sentry.protocol.n> d(Deque<io.sentry.protocol.n> deque) {
        return new ArrayList(deque);
    }

    Deque<io.sentry.protocol.n> a(Throwable th2) {
        Thread currentThread;
        boolean z11;
        io.sentry.protocol.h hVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        while (th2 != null && hashSet.add(th2)) {
            if (th2 instanceof ExceptionMechanismException) {
                ExceptionMechanismException exceptionMechanismException = (ExceptionMechanismException) th2;
                hVar = exceptionMechanismException.a();
                Throwable c11 = exceptionMechanismException.c();
                currentThread = exceptionMechanismException.b();
                z11 = exceptionMechanismException.d();
                th2 = c11;
            } else {
                currentThread = Thread.currentThread();
                z11 = false;
                hVar = null;
            }
            arrayDeque.addFirst(b(th2, hVar, currentThread, z11));
            th2 = th2.getCause();
        }
        return arrayDeque;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<io.sentry.protocol.n> c(Throwable th2) {
        return d(a(th2));
    }
}