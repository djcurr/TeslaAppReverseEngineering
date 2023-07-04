package jf;

import hd.e;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private d f33473a;

    public c(d dVar) {
        this.f33473a = dVar;
    }

    public static hd.e b(hd.c cVar, hd.d dVar) {
        return c(cVar, dVar, Executors.newSingleThreadExecutor());
    }

    public static hd.e c(hd.c cVar, hd.d dVar, Executor executor) {
        return new hd.e(dVar, cVar.h(), new e.c(cVar.k(), cVar.j(), cVar.f()), cVar.e(), cVar.d(), cVar.g(), executor, cVar.i());
    }

    @Override // jf.g
    public hd.i a(hd.c cVar) {
        return b(cVar, this.f33473a.a(cVar));
    }
}