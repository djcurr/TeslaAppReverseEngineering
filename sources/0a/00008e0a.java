package oh;

import java.util.Arrays;
import oh.l;

/* loaded from: classes3.dex */
final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f42432a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f42433b;

    /* renamed from: c  reason: collision with root package name */
    private final long f42434c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f42435d;

    /* renamed from: e  reason: collision with root package name */
    private final String f42436e;

    /* renamed from: f  reason: collision with root package name */
    private final long f42437f;

    /* renamed from: g  reason: collision with root package name */
    private final o f42438g;

    /* loaded from: classes3.dex */
    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f42439a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f42440b;

        /* renamed from: c  reason: collision with root package name */
        private Long f42441c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f42442d;

        /* renamed from: e  reason: collision with root package name */
        private String f42443e;

        /* renamed from: f  reason: collision with root package name */
        private Long f42444f;

        /* renamed from: g  reason: collision with root package name */
        private o f42445g;

        @Override // oh.l.a
        public l a() {
            String str = "";
            if (this.f42439a == null) {
                str = " eventTimeMs";
            }
            if (this.f42441c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f42444f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f42439a.longValue(), this.f42440b, this.f42441c.longValue(), this.f42442d, this.f42443e, this.f42444f.longValue(), this.f42445g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // oh.l.a
        public l.a b(Integer num) {
            this.f42440b = num;
            return this;
        }

        @Override // oh.l.a
        public l.a c(long j11) {
            this.f42439a = Long.valueOf(j11);
            return this;
        }

        @Override // oh.l.a
        public l.a d(long j11) {
            this.f42441c = Long.valueOf(j11);
            return this;
        }

        @Override // oh.l.a
        public l.a e(o oVar) {
            this.f42445g = oVar;
            return this;
        }

        @Override // oh.l.a
        l.a f(byte[] bArr) {
            this.f42442d = bArr;
            return this;
        }

        @Override // oh.l.a
        l.a g(String str) {
            this.f42443e = str;
            return this;
        }

        @Override // oh.l.a
        public l.a h(long j11) {
            this.f42444f = Long.valueOf(j11);
            return this;
        }
    }

    @Override // oh.l
    public Integer b() {
        return this.f42433b;
    }

    @Override // oh.l
    public long c() {
        return this.f42432a;
    }

    @Override // oh.l
    public long d() {
        return this.f42434c;
    }

    @Override // oh.l
    public o e() {
        return this.f42438g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f42432a == lVar.c() && ((num = this.f42433b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f42434c == lVar.d()) {
                if (Arrays.equals(this.f42435d, lVar instanceof f ? ((f) lVar).f42435d : lVar.f()) && ((str = this.f42436e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f42437f == lVar.h()) {
                    o oVar = this.f42438g;
                    if (oVar == null) {
                        if (lVar.e() == null) {
                            return true;
                        }
                    } else if (oVar.equals(lVar.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // oh.l
    public byte[] f() {
        return this.f42435d;
    }

    @Override // oh.l
    public String g() {
        return this.f42436e;
    }

    @Override // oh.l
    public long h() {
        return this.f42437f;
    }

    public int hashCode() {
        long j11 = this.f42432a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f42433b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j12 = this.f42434c;
        int hashCode2 = (((((i11 ^ hashCode) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f42435d)) * 1000003;
        String str = this.f42436e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j13 = this.f42437f;
        int i12 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j13 >>> 32) ^ j13))) * 1000003;
        o oVar = this.f42438g;
        return i12 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f42432a + ", eventCode=" + this.f42433b + ", eventUptimeMs=" + this.f42434c + ", sourceExtension=" + Arrays.toString(this.f42435d) + ", sourceExtensionJsonProto3=" + this.f42436e + ", timezoneOffsetSeconds=" + this.f42437f + ", networkConnectionInfo=" + this.f42438g + "}";
    }

    private f(long j11, Integer num, long j12, byte[] bArr, String str, long j13, o oVar) {
        this.f42432a = j11;
        this.f42433b = num;
        this.f42434c = j12;
        this.f42435d = bArr;
        this.f42436e = str;
        this.f42437f = j13;
        this.f42438g = oVar;
    }
}