package androidx.lifecycle;

import androidx.lifecycle.p;
import kotlin.Metadata;
import vz.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/s;", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements s {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p.c f5097a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p f5098b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v20.o<Object> f5099c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h00.a<Object> f5100d;

    @Override // androidx.lifecycle.s
    public void g(v source, p.b event) {
        Object b11;
        kotlin.jvm.internal.s.g(source, "source");
        kotlin.jvm.internal.s.g(event, "event");
        if (event == p.b.upTo(this.f5097a)) {
            this.f5098b.c(this);
            v20.o<Object> oVar = this.f5099c;
            h00.a<Object> aVar = this.f5100d;
            try {
                q.a aVar2 = vz.q.f54772b;
                b11 = vz.q.b(aVar.invoke());
            } catch (Throwable th2) {
                q.a aVar3 = vz.q.f54772b;
                b11 = vz.q.b(vz.r.a(th2));
            }
            oVar.resumeWith(b11);
        } else if (event == p.b.ON_DESTROY) {
            this.f5098b.c(this);
            v20.o<Object> oVar2 = this.f5099c;
            LifecycleDestroyedException lifecycleDestroyedException = new LifecycleDestroyedException();
            q.a aVar4 = vz.q.f54772b;
            oVar2.resumeWith(vz.q.b(vz.r.a(lifecycleDestroyedException)));
        }
    }
}