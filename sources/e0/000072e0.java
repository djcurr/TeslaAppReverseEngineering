package ha;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: b  reason: collision with root package name */
    private final androidx.collection.a<d<?>, Object> f29016b = new bb.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void f(d<T> dVar, Object obj, MessageDigest messageDigest) {
        dVar.g(obj, messageDigest);
    }

    @Override // ha.b
    public void b(MessageDigest messageDigest) {
        for (int i11 = 0; i11 < this.f29016b.size(); i11++) {
            f(this.f29016b.k(i11), this.f29016b.o(i11), messageDigest);
        }
    }

    public <T> T c(d<T> dVar) {
        return this.f29016b.containsKey(dVar) ? (T) this.f29016b.get(dVar) : dVar.c();
    }

    public void d(e eVar) {
        this.f29016b.l(eVar.f29016b);
    }

    public <T> e e(d<T> dVar, T t11) {
        this.f29016b.put(dVar, t11);
        return this;
    }

    @Override // ha.b
    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f29016b.equals(((e) obj).f29016b);
        }
        return false;
    }

    @Override // ha.b
    public int hashCode() {
        return this.f29016b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f29016b + CoreConstants.CURLY_RIGHT;
    }
}