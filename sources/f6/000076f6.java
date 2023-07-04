package io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<a> f31254a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private volatile io.grpc.p f31255b = io.grpc.p.IDLE;

    /* loaded from: classes5.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f31256a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f31257b;

        void a() {
            this.f31257b.execute(this.f31256a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(io.grpc.p pVar) {
        com.google.common.base.u.p(pVar, "newState");
        if (this.f31255b == pVar || this.f31255b == io.grpc.p.SHUTDOWN) {
            return;
        }
        this.f31255b = pVar;
        if (this.f31254a.isEmpty()) {
            return;
        }
        ArrayList<a> arrayList = this.f31254a;
        this.f31254a = new ArrayList<>();
        Iterator<a> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
    }
}