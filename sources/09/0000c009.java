package xy;

/* loaded from: classes5.dex */
public enum d implements ny.e<Object> {
    INSTANCE;

    public static void complete(b80.b<?> bVar) {
        bVar.c(INSTANCE);
        bVar.onComplete();
    }

    public static void error(Throwable th2, b80.b<?> bVar) {
        bVar.c(INSTANCE);
        bVar.onError(th2);
    }

    @Override // b80.c
    public void cancel() {
    }

    @Override // ny.h
    public void clear() {
    }

    @Override // ny.h
    public boolean isEmpty() {
        return true;
    }

    @Override // ny.h
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // ny.h
    public Object poll() {
        return null;
    }

    @Override // b80.c
    public void request(long j11) {
        e.validate(j11);
    }

    @Override // ny.d
    public int requestFusion(int i11) {
        return i11 & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}