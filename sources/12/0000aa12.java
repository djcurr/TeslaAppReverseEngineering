package p4;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f46151a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f46152b;

    /* renamed from: c  reason: collision with root package name */
    private final int f46153c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f46154d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f46155e;

    /* renamed from: f  reason: collision with root package name */
    private final int f46156f;

    /* renamed from: g  reason: collision with root package name */
    private final int f46157g;

    /* renamed from: h  reason: collision with root package name */
    private final int f46158h;

    /* renamed from: i  reason: collision with root package name */
    private final int f46159i;

    /* renamed from: j  reason: collision with root package name */
    private String f46160j;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f46161a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f46162b;

        /* renamed from: d  reason: collision with root package name */
        private String f46164d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f46165e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f46166f;

        /* renamed from: c  reason: collision with root package name */
        private int f46163c = -1;

        /* renamed from: g  reason: collision with root package name */
        private int f46167g = -1;

        /* renamed from: h  reason: collision with root package name */
        private int f46168h = -1;

        /* renamed from: i  reason: collision with root package name */
        private int f46169i = -1;

        /* renamed from: j  reason: collision with root package name */
        private int f46170j = -1;

        public static /* synthetic */ a i(a aVar, int i11, boolean z11, boolean z12, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                z12 = false;
            }
            return aVar.g(i11, z11, z12);
        }

        public final w a() {
            String str = this.f46164d;
            if (str != null) {
                return new w(this.f46161a, this.f46162b, str, this.f46165e, this.f46166f, this.f46167g, this.f46168h, this.f46169i, this.f46170j);
            }
            return new w(this.f46161a, this.f46162b, this.f46163c, this.f46165e, this.f46166f, this.f46167g, this.f46168h, this.f46169i, this.f46170j);
        }

        public final a b(int i11) {
            this.f46167g = i11;
            return this;
        }

        public final a c(int i11) {
            this.f46168h = i11;
            return this;
        }

        public final a d(boolean z11) {
            this.f46161a = z11;
            return this;
        }

        public final a e(int i11) {
            this.f46169i = i11;
            return this;
        }

        public final a f(int i11) {
            this.f46170j = i11;
            return this;
        }

        public final a g(int i11, boolean z11, boolean z12) {
            this.f46163c = i11;
            this.f46164d = null;
            this.f46165e = z11;
            this.f46166f = z12;
            return this;
        }

        public final a h(String str, boolean z11, boolean z12) {
            this.f46164d = str;
            this.f46163c = -1;
            this.f46165e = z11;
            this.f46166f = z12;
            return this;
        }

        public final a j(boolean z11) {
            this.f46162b = z11;
            return this;
        }
    }

    public w(boolean z11, boolean z12, int i11, boolean z13, boolean z14, int i12, int i13, int i14, int i15) {
        this.f46151a = z11;
        this.f46152b = z12;
        this.f46153c = i11;
        this.f46154d = z13;
        this.f46155e = z14;
        this.f46156f = i12;
        this.f46157g = i13;
        this.f46158h = i14;
        this.f46159i = i15;
    }

    public final int a() {
        return this.f46156f;
    }

    public final int b() {
        return this.f46157g;
    }

    public final int c() {
        return this.f46158h;
    }

    public final int d() {
        return this.f46159i;
    }

    public final int e() {
        return this.f46153c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.s.c(w.class, obj.getClass())) {
            return false;
        }
        w wVar = (w) obj;
        return this.f46151a == wVar.f46151a && this.f46152b == wVar.f46152b && this.f46153c == wVar.f46153c && kotlin.jvm.internal.s.c(this.f46160j, wVar.f46160j) && this.f46154d == wVar.f46154d && this.f46155e == wVar.f46155e && this.f46156f == wVar.f46156f && this.f46157g == wVar.f46157g && this.f46158h == wVar.f46158h && this.f46159i == wVar.f46159i;
    }

    public final boolean f() {
        return this.f46154d;
    }

    public final boolean g() {
        return this.f46151a;
    }

    public final boolean h() {
        return this.f46155e;
    }

    public int hashCode() {
        int i11 = (((((g() ? 1 : 0) * 31) + (i() ? 1 : 0)) * 31) + this.f46153c) * 31;
        String str = this.f46160j;
        return ((((((((((((i11 + (str == null ? 0 : str.hashCode())) * 31) + (f() ? 1 : 0)) * 31) + (h() ? 1 : 0)) * 31) + this.f46156f) * 31) + this.f46157g) * 31) + this.f46158h) * 31) + this.f46159i;
    }

    public final boolean i() {
        return this.f46152b;
    }

    public w(boolean z11, boolean z12, String str, boolean z13, boolean z14, int i11, int i12, int i13, int i14) {
        this(z11, z12, p.f46114j.a(str).hashCode(), z13, z14, i11, i12, i13, i14);
        this.f46160j = str;
    }
}