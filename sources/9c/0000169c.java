package com.facebook.imagepipeline.datasource;

import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.v0;

/* loaded from: classes3.dex */
public class c<T> extends a<qd.a<T>> {
    private c(o0<qd.a<T>> o0Var, v0 v0Var, pf.d dVar) {
        super(o0Var, v0Var, dVar);
    }

    public static <T> com.facebook.datasource.c<qd.a<T>> I(o0<qd.a<T>> o0Var, v0 v0Var, pf.d dVar) {
        if (tf.b.d()) {
            tf.b.a("CloseableProducerToDataSourceAdapter#create");
        }
        c cVar = new c(o0Var, v0Var, dVar);
        if (tf.b.d()) {
            tf.b.b();
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.datasource.a
    /* renamed from: H */
    public void h(qd.a<T> aVar) {
        qd.a.C(aVar);
    }

    @Override // com.facebook.datasource.a, com.facebook.datasource.c
    /* renamed from: J */
    public qd.a<T> g() {
        return qd.a.m((qd.a) super.g());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.datasource.a
    /* renamed from: K */
    public void F(qd.a<T> aVar, int i11, p0 p0Var) {
        super.F(qd.a.m(aVar), i11, p0Var);
    }
}