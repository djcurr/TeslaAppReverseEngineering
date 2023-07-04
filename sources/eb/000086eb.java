package mn;

/* loaded from: classes2.dex */
public class f {

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private long f38627a = 60;

        /* renamed from: b  reason: collision with root package name */
        private long f38628b = com.google.firebase.remoteconfig.internal.j.f17124j;

        public f c() {
            return new f(this);
        }

        public b d(long j11) {
            if (j11 >= 0) {
                this.f38627a = j11;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j11)));
        }

        public b e(long j11) {
            if (j11 >= 0) {
                this.f38628b = j11;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j11 + " is an invalid argument");
        }
    }

    private f(b bVar) {
        long unused = bVar.f38627a;
        long unused2 = bVar.f38628b;
    }
}