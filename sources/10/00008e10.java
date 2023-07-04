package oh;

/* loaded from: classes3.dex */
final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    private final long f42460a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(long j11) {
        this.f42460a = j11;
    }

    @Override // oh.n
    public long c() {
        return this.f42460a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f42460a == ((n) obj).c();
    }

    public int hashCode() {
        long j11 = this.f42460a;
        return ((int) (j11 ^ (j11 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f42460a + "}";
    }
}