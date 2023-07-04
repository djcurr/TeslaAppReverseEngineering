package io.sentry;

import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class y3 {

    /* renamed from: a  reason: collision with root package name */
    private final Deque<a> f32719a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f32720b;

    public y3(d0 d0Var, a aVar) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f32719a = linkedBlockingDeque;
        this.f32720b = (d0) rz.j.a(d0Var, "logger is required");
        linkedBlockingDeque.push((a) rz.j.a(aVar, "rootStackItem is required"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a() {
        return this.f32719a.peek();
    }

    void b(a aVar) {
        this.f32719a.push(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final g3 f32721a;

        /* renamed from: b  reason: collision with root package name */
        private volatile f0 f32722b;

        /* renamed from: c  reason: collision with root package name */
        private volatile u1 f32723c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(g3 g3Var, f0 f0Var, u1 u1Var) {
            this.f32722b = (f0) rz.j.a(f0Var, "ISentryClient is required.");
            this.f32723c = (u1) rz.j.a(u1Var, "Scope is required.");
            this.f32721a = (g3) rz.j.a(g3Var, "Options is required");
        }

        public f0 a() {
            return this.f32722b;
        }

        public g3 b() {
            return this.f32721a;
        }

        public u1 c() {
            return this.f32723c;
        }

        a(a aVar) {
            this.f32721a = aVar.f32721a;
            this.f32722b = aVar.f32722b;
            this.f32723c = new u1(aVar.f32723c);
        }
    }

    public y3(y3 y3Var) {
        this(y3Var.f32720b, new a(y3Var.f32719a.getLast()));
        Iterator<a> descendingIterator = y3Var.f32719a.descendingIterator();
        if (descendingIterator.hasNext()) {
            descendingIterator.next();
        }
        while (descendingIterator.hasNext()) {
            b(new a(descendingIterator.next()));
        }
    }
}