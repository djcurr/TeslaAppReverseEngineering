package io.grpc;

import io.grpc.r;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
final class i1 extends r.c {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f30596a = Logger.getLogger(i1.class.getName());

    /* renamed from: b  reason: collision with root package name */
    static final ThreadLocal<r> f30597b = new ThreadLocal<>();

    @Override // io.grpc.r.c
    public r b() {
        r rVar = f30597b.get();
        return rVar == null ? r.f31575c : rVar;
    }

    @Override // io.grpc.r.c
    public void c(r rVar, r rVar2) {
        if (b() != rVar) {
            f30596a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (rVar2 != r.f31575c) {
            f30597b.set(rVar2);
        } else {
            f30597b.set(null);
        }
    }

    @Override // io.grpc.r.c
    public r d(r rVar) {
        r b11 = b();
        f30597b.set(rVar);
        return b11;
    }
}