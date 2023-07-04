package y20;

/* loaded from: classes5.dex */
final class v<T> implements zz.d<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: a  reason: collision with root package name */
    private final zz.d<T> f59066a;

    /* renamed from: b  reason: collision with root package name */
    private final zz.g f59067b;

    /* JADX WARN: Multi-variable type inference failed */
    public v(zz.d<? super T> dVar, zz.g gVar) {
        this.f59066a = dVar;
        this.f59067b = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        zz.d<T> dVar = this.f59066a;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // zz.d
    public zz.g getContext() {
        return this.f59067b;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // zz.d
    public void resumeWith(Object obj) {
        this.f59066a.resumeWith(obj);
    }
}