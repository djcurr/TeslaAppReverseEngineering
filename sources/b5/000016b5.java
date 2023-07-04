package com.facebook.imagepipeline.memory;

import java.util.LinkedList;
import md.k;

/* loaded from: classes3.dex */
class i<V> extends b<V> {

    /* renamed from: f  reason: collision with root package name */
    private LinkedList<qd.f<V>> f11291f;

    public i(int i11, int i12, int i13) {
        super(i11, i12, i13, false);
        this.f11291f = new LinkedList<>();
    }

    @Override // com.facebook.imagepipeline.memory.b
    void a(V v11) {
        qd.f<V> poll = this.f11291f.poll();
        if (poll == null) {
            poll = new qd.f<>();
        }
        poll.c(v11);
        this.f11280c.add(poll);
    }

    @Override // com.facebook.imagepipeline.memory.b
    public V g() {
        qd.f<V> fVar = (qd.f) this.f11280c.poll();
        k.g(fVar);
        V b11 = fVar.b();
        fVar.a();
        this.f11291f.add(fVar);
        return b11;
    }
}