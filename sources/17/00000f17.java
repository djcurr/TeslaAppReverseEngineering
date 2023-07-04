package c1;

import v20.a2;
import v20.f2;

/* loaded from: classes.dex */
public final class k0 implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private final h00.p<v20.o0, zz.d<? super vz.b0>, Object> f8586a;

    /* renamed from: b  reason: collision with root package name */
    private final v20.o0 f8587b;

    /* renamed from: c  reason: collision with root package name */
    private v20.a2 f8588c;

    /* JADX WARN: Multi-variable type inference failed */
    public k0(zz.g parentCoroutineContext, h00.p<? super v20.o0, ? super zz.d<? super vz.b0>, ? extends Object> task) {
        kotlin.jvm.internal.s.g(parentCoroutineContext, "parentCoroutineContext");
        kotlin.jvm.internal.s.g(task, "task");
        this.f8586a = task;
        this.f8587b = v20.p0.a(parentCoroutineContext);
    }

    @Override // c1.d1
    public void b() {
        v20.a2 d11;
        v20.a2 a2Var = this.f8588c;
        if (a2Var != null) {
            f2.e(a2Var, "Old job was still running!", null, 2, null);
        }
        d11 = v20.k.d(this.f8587b, null, null, this.f8586a, 3, null);
        this.f8588c = d11;
    }

    @Override // c1.d1
    public void d() {
        v20.a2 a2Var = this.f8588c;
        if (a2Var != null) {
            a2.a.a(a2Var, null, 1, null);
        }
        this.f8588c = null;
    }

    @Override // c1.d1
    public void e() {
        v20.a2 a2Var = this.f8588c;
        if (a2Var != null) {
            a2.a.a(a2Var, null, 1, null);
        }
        this.f8588c = null;
    }
}