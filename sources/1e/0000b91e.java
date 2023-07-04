package v20;

/* loaded from: classes5.dex */
final class z0 extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final zz.g f54017a;

    public z0(zz.g gVar) {
        this.f54017a = gVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f54017a.toString();
    }
}