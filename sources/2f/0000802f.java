package kotlinx.coroutines.scheduling;

/* loaded from: classes5.dex */
public final class c extends f {

    /* renamed from: g  reason: collision with root package name */
    public static final c f35553g = new c();

    private c() {
        super(l.f35565b, l.f35566c, l.f35567d, "DefaultDispatcher");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // v20.j0
    public String toString() {
        return "Dispatchers.Default";
    }
}