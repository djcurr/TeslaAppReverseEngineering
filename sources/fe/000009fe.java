package androidx.work;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.u implements h00.l<Throwable, vz.b0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.c<Object> f6695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.google.common.util.concurrent.c<Object> cVar) {
        super(1);
        this.f6695a = cVar;
    }

    public final void a(Throwable th2) {
        this.f6695a.cancel(false);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Throwable th2) {
        a(th2);
        return vz.b0.f54756a;
    }
}