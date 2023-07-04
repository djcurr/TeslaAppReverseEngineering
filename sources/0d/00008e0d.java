package oh;

import java.util.List;
import oh.m;

/* loaded from: classes3.dex */
final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f42446a;

    /* renamed from: b  reason: collision with root package name */
    private final long f42447b;

    /* renamed from: c  reason: collision with root package name */
    private final k f42448c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f42449d;

    /* renamed from: e  reason: collision with root package name */
    private final String f42450e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f42451f;

    /* renamed from: g  reason: collision with root package name */
    private final p f42452g;

    /* loaded from: classes3.dex */
    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f42453a;

        /* renamed from: b  reason: collision with root package name */
        private Long f42454b;

        /* renamed from: c  reason: collision with root package name */
        private k f42455c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f42456d;

        /* renamed from: e  reason: collision with root package name */
        private String f42457e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f42458f;

        /* renamed from: g  reason: collision with root package name */
        private p f42459g;

        @Override // oh.m.a
        public m a() {
            String str = "";
            if (this.f42453a == null) {
                str = " requestTimeMs";
            }
            if (this.f42454b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f42453a.longValue(), this.f42454b.longValue(), this.f42455c, this.f42456d, this.f42457e, this.f42458f, this.f42459g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // oh.m.a
        public m.a b(k kVar) {
            this.f42455c = kVar;
            return this;
        }

        @Override // oh.m.a
        public m.a c(List<l> list) {
            this.f42458f = list;
            return this;
        }

        @Override // oh.m.a
        m.a d(Integer num) {
            this.f42456d = num;
            return this;
        }

        @Override // oh.m.a
        m.a e(String str) {
            this.f42457e = str;
            return this;
        }

        @Override // oh.m.a
        public m.a f(p pVar) {
            this.f42459g = pVar;
            return this;
        }

        @Override // oh.m.a
        public m.a g(long j11) {
            this.f42453a = Long.valueOf(j11);
            return this;
        }

        @Override // oh.m.a
        public m.a h(long j11) {
            this.f42454b = Long.valueOf(j11);
            return this;
        }
    }

    @Override // oh.m
    public k b() {
        return this.f42448c;
    }

    @Override // oh.m
    public List<l> c() {
        return this.f42451f;
    }

    @Override // oh.m
    public Integer d() {
        return this.f42449d;
    }

    @Override // oh.m
    public String e() {
        return this.f42450e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f42446a == mVar.g() && this.f42447b == mVar.h() && ((kVar = this.f42448c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f42449d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f42450e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f42451f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
                p pVar = this.f42452g;
                if (pVar == null) {
                    if (mVar.f() == null) {
                        return true;
                    }
                } else if (pVar.equals(mVar.f())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // oh.m
    public p f() {
        return this.f42452g;
    }

    @Override // oh.m
    public long g() {
        return this.f42446a;
    }

    @Override // oh.m
    public long h() {
        return this.f42447b;
    }

    public int hashCode() {
        long j11 = this.f42446a;
        long j12 = this.f42447b;
        int i11 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        k kVar = this.f42448c;
        int hashCode = (i11 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f42449d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f42450e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f42451f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f42452g;
        return hashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f42446a + ", requestUptimeMs=" + this.f42447b + ", clientInfo=" + this.f42448c + ", logSource=" + this.f42449d + ", logSourceName=" + this.f42450e + ", logEvents=" + this.f42451f + ", qosTier=" + this.f42452g + "}";
    }

    private g(long j11, long j12, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f42446a = j11;
        this.f42447b = j12;
        this.f42448c = kVar;
        this.f42449d = num;
        this.f42450e = str;
        this.f42451f = list;
        this.f42452g = pVar;
    }
}