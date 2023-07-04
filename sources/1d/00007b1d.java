package j20;

/* loaded from: classes5.dex */
class l<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f33145a;

    /* renamed from: b  reason: collision with root package name */
    private final Thread f33146b = Thread.currentThread();

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(T t11) {
        this.f33145a = t11;
    }

    public T a() {
        if (b()) {
            return this.f33145a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f33146b == Thread.currentThread();
    }
}