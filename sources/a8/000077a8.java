package io.grpc.stub;

import io.grpc.stub.b;
import io.grpc.stub.d;
import io.grpc.stub.g;

/* loaded from: classes5.dex */
public abstract class b<S extends b<S>> extends d<S> {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(io.grpc.d dVar, io.grpc.c cVar) {
        super(dVar, cVar);
    }

    public static <T extends d<T>> T newStub(d.a<T> aVar, io.grpc.d dVar) {
        return (T) newStub(aVar, dVar, io.grpc.c.f30520k);
    }

    public static <T extends d<T>> T newStub(d.a<T> aVar, io.grpc.d dVar, io.grpc.c cVar) {
        return aVar.newStub(dVar, cVar.r(g.f31612c, g.EnumC0595g.BLOCKING));
    }
}