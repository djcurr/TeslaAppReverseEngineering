package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class c extends a0.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f711a;

    /* renamed from: b  reason: collision with root package name */
    private final String f712b;

    /* renamed from: c  reason: collision with root package name */
    private final int f713c;

    /* renamed from: d  reason: collision with root package name */
    private final int f714d;

    /* renamed from: e  reason: collision with root package name */
    private final long f715e;

    /* renamed from: f  reason: collision with root package name */
    private final long f716f;

    /* renamed from: g  reason: collision with root package name */
    private final long f717g;

    /* renamed from: h  reason: collision with root package name */
    private final String f718h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.a.AbstractC0014a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f719a;

        /* renamed from: b  reason: collision with root package name */
        private String f720b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f721c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f722d;

        /* renamed from: e  reason: collision with root package name */
        private Long f723e;

        /* renamed from: f  reason: collision with root package name */
        private Long f724f;

        /* renamed from: g  reason: collision with root package name */
        private Long f725g;

        /* renamed from: h  reason: collision with root package name */
        private String f726h;

        @Override // am.a0.a.AbstractC0014a
        public a0.a a() {
            String str = "";
            if (this.f719a == null) {
                str = " pid";
            }
            if (this.f720b == null) {
                str = str + " processName";
            }
            if (this.f721c == null) {
                str = str + " reasonCode";
            }
            if (this.f722d == null) {
                str = str + " importance";
            }
            if (this.f723e == null) {
                str = str + " pss";
            }
            if (this.f724f == null) {
                str = str + " rss";
            }
            if (this.f725g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new c(this.f719a.intValue(), this.f720b, this.f721c.intValue(), this.f722d.intValue(), this.f723e.longValue(), this.f724f.longValue(), this.f725g.longValue(), this.f726h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.a.AbstractC0014a
        public a0.a.AbstractC0014a b(int i11) {
            this.f722d = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.a.AbstractC0014a
        public a0.a.AbstractC0014a c(int i11) {
            this.f719a = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.a.AbstractC0014a
        public a0.a.AbstractC0014a d(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f720b = str;
            return this;
        }

        @Override // am.a0.a.AbstractC0014a
        public a0.a.AbstractC0014a e(long j11) {
            this.f723e = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.a.AbstractC0014a
        public a0.a.AbstractC0014a f(int i11) {
            this.f721c = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.a.AbstractC0014a
        public a0.a.AbstractC0014a g(long j11) {
            this.f724f = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.a.AbstractC0014a
        public a0.a.AbstractC0014a h(long j11) {
            this.f725g = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.a.AbstractC0014a
        public a0.a.AbstractC0014a i(String str) {
            this.f726h = str;
            return this;
        }
    }

    @Override // am.a0.a
    public int b() {
        return this.f714d;
    }

    @Override // am.a0.a
    public int c() {
        return this.f711a;
    }

    @Override // am.a0.a
    public String d() {
        return this.f712b;
    }

    @Override // am.a0.a
    public long e() {
        return this.f715e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.a) {
            a0.a aVar = (a0.a) obj;
            if (this.f711a == aVar.c() && this.f712b.equals(aVar.d()) && this.f713c == aVar.f() && this.f714d == aVar.b() && this.f715e == aVar.e() && this.f716f == aVar.g() && this.f717g == aVar.h()) {
                String str = this.f718h;
                if (str == null) {
                    if (aVar.i() == null) {
                        return true;
                    }
                } else if (str.equals(aVar.i())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // am.a0.a
    public int f() {
        return this.f713c;
    }

    @Override // am.a0.a
    public long g() {
        return this.f716f;
    }

    @Override // am.a0.a
    public long h() {
        return this.f717g;
    }

    public int hashCode() {
        long j11 = this.f715e;
        long j12 = this.f716f;
        long j13 = this.f717g;
        int hashCode = (((((((((((((this.f711a ^ 1000003) * 1000003) ^ this.f712b.hashCode()) * 1000003) ^ this.f713c) * 1000003) ^ this.f714d) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003;
        String str = this.f718h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // am.a0.a
    public String i() {
        return this.f718h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f711a + ", processName=" + this.f712b + ", reasonCode=" + this.f713c + ", importance=" + this.f714d + ", pss=" + this.f715e + ", rss=" + this.f716f + ", timestamp=" + this.f717g + ", traceFile=" + this.f718h + "}";
    }

    private c(int i11, String str, int i12, int i13, long j11, long j12, long j13, String str2) {
        this.f711a = i11;
        this.f712b = str;
        this.f713c = i12;
        this.f714d = i13;
        this.f715e = j11;
        this.f716f = j12;
        this.f717g = j13;
        this.f718h = str2;
    }
}