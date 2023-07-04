package com.facebook.imagepipeline.datasource;

import com.facebook.imagepipeline.producers.l;
import com.facebook.imagepipeline.producers.o0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.v0;
import java.util.Map;
import md.k;

/* loaded from: classes3.dex */
public abstract class a<T> extends com.facebook.datasource.a<T> {

    /* renamed from: i  reason: collision with root package name */
    private final v0 f11253i;

    /* renamed from: j  reason: collision with root package name */
    private final pf.d f11254j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.datasource.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0214a extends com.facebook.imagepipeline.producers.b<T> {
        C0214a() {
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void f() {
            a.this.D();
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void g(Throwable th2) {
            a.this.E(th2);
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void h(T t11, int i11) {
            a aVar = a.this;
            aVar.F(t11, i11, aVar.f11253i);
        }

        @Override // com.facebook.imagepipeline.producers.b
        protected void i(float f11) {
            a.this.s(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(o0<T> o0Var, v0 v0Var, pf.d dVar) {
        if (tf.b.d()) {
            tf.b.a("AbstractProducerToDataSourceAdapter()");
        }
        this.f11253i = v0Var;
        this.f11254j = dVar;
        G();
        if (tf.b.d()) {
            tf.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        dVar.a(v0Var);
        if (tf.b.d()) {
            tf.b.b();
        }
        if (tf.b.d()) {
            tf.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        o0Var.b(B(), v0Var);
        if (tf.b.d()) {
            tf.b.b();
        }
        if (tf.b.d()) {
            tf.b.b();
        }
    }

    private l<T> B() {
        return new C0214a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void D() {
        k.i(k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(Throwable th2) {
        if (super.q(th2, C(this.f11253i))) {
            this.f11254j.i(this.f11253i, th2);
        }
    }

    private void G() {
        o(this.f11253i.getExtras());
    }

    protected Map<String, Object> C(p0 p0Var) {
        return p0Var.getExtras();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void F(T t11, int i11, p0 p0Var) {
        boolean d11 = com.facebook.imagepipeline.producers.b.d(i11);
        if (super.u(t11, d11, C(p0Var)) && d11) {
            this.f11254j.e(this.f11253i);
        }
    }

    @Override // com.facebook.datasource.a, com.facebook.datasource.c
    public boolean close() {
        if (super.close()) {
            if (super.a()) {
                return true;
            }
            this.f11254j.g(this.f11253i);
            this.f11253i.u();
            return true;
        }
        return false;
    }
}