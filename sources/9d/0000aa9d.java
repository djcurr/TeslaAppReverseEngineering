package ph;

import java.util.Map;
import java.util.Objects;
import ph.i;

/* loaded from: classes3.dex */
final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final String f46471a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f46472b;

    /* renamed from: c  reason: collision with root package name */
    private final h f46473c;

    /* renamed from: d  reason: collision with root package name */
    private final long f46474d;

    /* renamed from: e  reason: collision with root package name */
    private final long f46475e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f46476f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ph.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0993b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        private String f46477a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f46478b;

        /* renamed from: c  reason: collision with root package name */
        private h f46479c;

        /* renamed from: d  reason: collision with root package name */
        private Long f46480d;

        /* renamed from: e  reason: collision with root package name */
        private Long f46481e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f46482f;

        @Override // ph.i.a
        public i d() {
            String str = "";
            if (this.f46477a == null) {
                str = " transportName";
            }
            if (this.f46479c == null) {
                str = str + " encodedPayload";
            }
            if (this.f46480d == null) {
                str = str + " eventMillis";
            }
            if (this.f46481e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f46482f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f46477a, this.f46478b, this.f46479c, this.f46480d.longValue(), this.f46481e.longValue(), this.f46482f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // ph.i.a
        protected Map<String, String> e() {
            Map<String, String> map = this.f46482f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ph.i.a
        public i.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f46482f = map;
            return this;
        }

        @Override // ph.i.a
        public i.a g(Integer num) {
            this.f46478b = num;
            return this;
        }

        @Override // ph.i.a
        public i.a h(h hVar) {
            Objects.requireNonNull(hVar, "Null encodedPayload");
            this.f46479c = hVar;
            return this;
        }

        @Override // ph.i.a
        public i.a i(long j11) {
            this.f46480d = Long.valueOf(j11);
            return this;
        }

        @Override // ph.i.a
        public i.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f46477a = str;
            return this;
        }

        @Override // ph.i.a
        public i.a k(long j11) {
            this.f46481e = Long.valueOf(j11);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ph.i
    public Map<String, String> c() {
        return this.f46476f;
    }

    @Override // ph.i
    public Integer d() {
        return this.f46472b;
    }

    @Override // ph.i
    public h e() {
        return this.f46473c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f46471a.equals(iVar.j()) && ((num = this.f46472b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f46473c.equals(iVar.e()) && this.f46474d == iVar.f() && this.f46475e == iVar.k() && this.f46476f.equals(iVar.c());
        }
        return false;
    }

    @Override // ph.i
    public long f() {
        return this.f46474d;
    }

    public int hashCode() {
        int hashCode = (this.f46471a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f46472b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j11 = this.f46474d;
        long j12 = this.f46475e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f46473c.hashCode()) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ this.f46476f.hashCode();
    }

    @Override // ph.i
    public String j() {
        return this.f46471a;
    }

    @Override // ph.i
    public long k() {
        return this.f46475e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f46471a + ", code=" + this.f46472b + ", encodedPayload=" + this.f46473c + ", eventMillis=" + this.f46474d + ", uptimeMillis=" + this.f46475e + ", autoMetadata=" + this.f46476f + "}";
    }

    private b(String str, Integer num, h hVar, long j11, long j12, Map<String, String> map) {
        this.f46471a = str;
        this.f46472b = num;
        this.f46473c = hVar;
        this.f46474d = j11;
        this.f46475e = j12;
        this.f46476f = map;
    }
}