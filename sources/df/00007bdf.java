package ji;

/* loaded from: classes3.dex */
public interface v {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final w f33771a;

        /* renamed from: b  reason: collision with root package name */
        public final w f33772b;

        public a(w wVar) {
            this(wVar, wVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f33771a.equals(aVar.f33771a) && this.f33772b.equals(aVar.f33772b);
        }

        public int hashCode() {
            return (this.f33771a.hashCode() * 31) + this.f33772b.hashCode();
        }

        public String toString() {
            String sb2;
            String valueOf = String.valueOf(this.f33771a);
            if (this.f33771a.equals(this.f33772b)) {
                sb2 = "";
            } else {
                String valueOf2 = String.valueOf(this.f33772b);
                StringBuilder sb3 = new StringBuilder(valueOf2.length() + 2);
                sb3.append(", ");
                sb3.append(valueOf2);
                sb2 = sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder(valueOf.length() + 2 + String.valueOf(sb2).length());
            sb4.append("[");
            sb4.append(valueOf);
            sb4.append(sb2);
            sb4.append("]");
            return sb4.toString();
        }

        public a(w wVar, w wVar2) {
            this.f33771a = (w) ak.a.e(wVar);
            this.f33772b = (w) ak.a.e(wVar2);
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements v {

        /* renamed from: a  reason: collision with root package name */
        private final long f33773a;

        /* renamed from: b  reason: collision with root package name */
        private final a f33774b;

        public b(long j11) {
            this(j11, 0L);
        }

        @Override // ji.v
        public a f(long j11) {
            return this.f33774b;
        }

        @Override // ji.v
        public boolean h() {
            return false;
        }

        @Override // ji.v
        public long i() {
            return this.f33773a;
        }

        public b(long j11, long j12) {
            this.f33773a = j11;
            this.f33774b = new a(j12 == 0 ? w.f33775c : new w(0L, j12));
        }
    }

    a f(long j11);

    boolean h();

    long i();
}