package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class j extends a0.e.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f776a;

    /* renamed from: b  reason: collision with root package name */
    private final String f777b;

    /* renamed from: c  reason: collision with root package name */
    private final int f778c;

    /* renamed from: d  reason: collision with root package name */
    private final long f779d;

    /* renamed from: e  reason: collision with root package name */
    private final long f780e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f781f;

    /* renamed from: g  reason: collision with root package name */
    private final int f782g;

    /* renamed from: h  reason: collision with root package name */
    private final String f783h;

    /* renamed from: i  reason: collision with root package name */
    private final String f784i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f785a;

        /* renamed from: b  reason: collision with root package name */
        private String f786b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f787c;

        /* renamed from: d  reason: collision with root package name */
        private Long f788d;

        /* renamed from: e  reason: collision with root package name */
        private Long f789e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f790f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f791g;

        /* renamed from: h  reason: collision with root package name */
        private String f792h;

        /* renamed from: i  reason: collision with root package name */
        private String f793i;

        @Override // am.a0.e.c.a
        public a0.e.c a() {
            String str = "";
            if (this.f785a == null) {
                str = " arch";
            }
            if (this.f786b == null) {
                str = str + " model";
            }
            if (this.f787c == null) {
                str = str + " cores";
            }
            if (this.f788d == null) {
                str = str + " ram";
            }
            if (this.f789e == null) {
                str = str + " diskSpace";
            }
            if (this.f790f == null) {
                str = str + " simulator";
            }
            if (this.f791g == null) {
                str = str + " state";
            }
            if (this.f792h == null) {
                str = str + " manufacturer";
            }
            if (this.f793i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new j(this.f785a.intValue(), this.f786b, this.f787c.intValue(), this.f788d.longValue(), this.f789e.longValue(), this.f790f.booleanValue(), this.f791g.intValue(), this.f792h, this.f793i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.c.a
        public a0.e.c.a b(int i11) {
            this.f785a = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.e.c.a
        public a0.e.c.a c(int i11) {
            this.f787c = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.e.c.a
        public a0.e.c.a d(long j11) {
            this.f789e = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.e.c.a
        public a0.e.c.a e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f792h = str;
            return this;
        }

        @Override // am.a0.e.c.a
        public a0.e.c.a f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f786b = str;
            return this;
        }

        @Override // am.a0.e.c.a
        public a0.e.c.a g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f793i = str;
            return this;
        }

        @Override // am.a0.e.c.a
        public a0.e.c.a h(long j11) {
            this.f788d = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.e.c.a
        public a0.e.c.a i(boolean z11) {
            this.f790f = Boolean.valueOf(z11);
            return this;
        }

        @Override // am.a0.e.c.a
        public a0.e.c.a j(int i11) {
            this.f791g = Integer.valueOf(i11);
            return this;
        }
    }

    @Override // am.a0.e.c
    public int b() {
        return this.f776a;
    }

    @Override // am.a0.e.c
    public int c() {
        return this.f778c;
    }

    @Override // am.a0.e.c
    public long d() {
        return this.f780e;
    }

    @Override // am.a0.e.c
    public String e() {
        return this.f783h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.c) {
            a0.e.c cVar = (a0.e.c) obj;
            return this.f776a == cVar.b() && this.f777b.equals(cVar.f()) && this.f778c == cVar.c() && this.f779d == cVar.h() && this.f780e == cVar.d() && this.f781f == cVar.j() && this.f782g == cVar.i() && this.f783h.equals(cVar.e()) && this.f784i.equals(cVar.g());
        }
        return false;
    }

    @Override // am.a0.e.c
    public String f() {
        return this.f777b;
    }

    @Override // am.a0.e.c
    public String g() {
        return this.f784i;
    }

    @Override // am.a0.e.c
    public long h() {
        return this.f779d;
    }

    public int hashCode() {
        long j11 = this.f779d;
        long j12 = this.f780e;
        return ((((((((((((((((this.f776a ^ 1000003) * 1000003) ^ this.f777b.hashCode()) * 1000003) ^ this.f778c) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ (this.f781f ? 1231 : 1237)) * 1000003) ^ this.f782g) * 1000003) ^ this.f783h.hashCode()) * 1000003) ^ this.f784i.hashCode();
    }

    @Override // am.a0.e.c
    public int i() {
        return this.f782g;
    }

    @Override // am.a0.e.c
    public boolean j() {
        return this.f781f;
    }

    public String toString() {
        return "Device{arch=" + this.f776a + ", model=" + this.f777b + ", cores=" + this.f778c + ", ram=" + this.f779d + ", diskSpace=" + this.f780e + ", simulator=" + this.f781f + ", state=" + this.f782g + ", manufacturer=" + this.f783h + ", modelClass=" + this.f784i + "}";
    }

    private j(int i11, String str, int i12, long j11, long j12, boolean z11, int i13, String str2, String str3) {
        this.f776a = i11;
        this.f777b = str;
        this.f778c = i12;
        this.f779d = j11;
        this.f780e = j12;
        this.f781f = z11;
        this.f782g = i13;
        this.f783h = str2;
        this.f784i = str3;
    }
}