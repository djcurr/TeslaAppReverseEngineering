package an;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final long f909a;

    /* renamed from: b  reason: collision with root package name */
    private final String f910b;

    /* renamed from: c  reason: collision with root package name */
    private final String f911c;

    /* renamed from: d  reason: collision with root package name */
    private final c f912d;

    /* renamed from: e  reason: collision with root package name */
    private final d f913e;

    /* renamed from: f  reason: collision with root package name */
    private final String f914f;

    /* renamed from: g  reason: collision with root package name */
    private final String f915g;

    /* renamed from: h  reason: collision with root package name */
    private final int f916h;

    /* renamed from: i  reason: collision with root package name */
    private final int f917i;

    /* renamed from: j  reason: collision with root package name */
    private final String f918j;

    /* renamed from: k  reason: collision with root package name */
    private final long f919k;

    /* renamed from: l  reason: collision with root package name */
    private final b f920l;

    /* renamed from: m  reason: collision with root package name */
    private final String f921m;

    /* renamed from: n  reason: collision with root package name */
    private final long f922n;

    /* renamed from: o  reason: collision with root package name */
    private final String f923o;

    /* renamed from: an.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0030a {

        /* renamed from: a  reason: collision with root package name */
        private long f924a = 0;

        /* renamed from: b  reason: collision with root package name */
        private String f925b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f926c = "";

        /* renamed from: d  reason: collision with root package name */
        private c f927d = c.UNKNOWN;

        /* renamed from: e  reason: collision with root package name */
        private d f928e = d.UNKNOWN_OS;

        /* renamed from: f  reason: collision with root package name */
        private String f929f = "";

        /* renamed from: g  reason: collision with root package name */
        private String f930g = "";

        /* renamed from: h  reason: collision with root package name */
        private int f931h = 0;

        /* renamed from: i  reason: collision with root package name */
        private int f932i = 0;

        /* renamed from: j  reason: collision with root package name */
        private String f933j = "";

        /* renamed from: k  reason: collision with root package name */
        private long f934k = 0;

        /* renamed from: l  reason: collision with root package name */
        private b f935l = b.UNKNOWN_EVENT;

        /* renamed from: m  reason: collision with root package name */
        private String f936m = "";

        /* renamed from: n  reason: collision with root package name */
        private long f937n = 0;

        /* renamed from: o  reason: collision with root package name */
        private String f938o = "";

        C0030a() {
        }

        public a a() {
            return new a(this.f924a, this.f925b, this.f926c, this.f927d, this.f928e, this.f929f, this.f930g, this.f931h, this.f932i, this.f933j, this.f934k, this.f935l, this.f936m, this.f937n, this.f938o);
        }

        public C0030a b(String str) {
            this.f936m = str;
            return this;
        }

        public C0030a c(String str) {
            this.f930g = str;
            return this;
        }

        public C0030a d(String str) {
            this.f938o = str;
            return this;
        }

        public C0030a e(b bVar) {
            this.f935l = bVar;
            return this;
        }

        public C0030a f(String str) {
            this.f926c = str;
            return this;
        }

        public C0030a g(String str) {
            this.f925b = str;
            return this;
        }

        public C0030a h(c cVar) {
            this.f927d = cVar;
            return this;
        }

        public C0030a i(String str) {
            this.f929f = str;
            return this;
        }

        public C0030a j(long j11) {
            this.f924a = j11;
            return this;
        }

        public C0030a k(d dVar) {
            this.f928e = dVar;
            return this;
        }

        public C0030a l(String str) {
            this.f933j = str;
            return this;
        }

        public C0030a m(int i11) {
            this.f932i = i11;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public enum b implements om.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);
        
        private final int number_;

        b(int i11) {
            this.number_ = i11;
        }

        @Override // om.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* loaded from: classes2.dex */
    public enum c implements om.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);
        
        private final int number_;

        c(int i11) {
            this.number_ = i11;
        }

        @Override // om.c
        public int getNumber() {
            return this.number_;
        }
    }

    /* loaded from: classes2.dex */
    public enum d implements om.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);
        
        private final int number_;

        d(int i11) {
            this.number_ = i11;
        }

        @Override // om.c
        public int getNumber() {
            return this.number_;
        }
    }

    static {
        new C0030a().a();
    }

    a(long j11, String str, String str2, c cVar, d dVar, String str3, String str4, int i11, int i12, String str5, long j12, b bVar, String str6, long j13, String str7) {
        this.f909a = j11;
        this.f910b = str;
        this.f911c = str2;
        this.f912d = cVar;
        this.f913e = dVar;
        this.f914f = str3;
        this.f915g = str4;
        this.f916h = i11;
        this.f917i = i12;
        this.f918j = str5;
        this.f919k = j12;
        this.f920l = bVar;
        this.f921m = str6;
        this.f922n = j13;
        this.f923o = str7;
    }

    public static C0030a p() {
        return new C0030a();
    }

    @om.d(tag = 13)
    public String a() {
        return this.f921m;
    }

    @om.d(tag = 11)
    public long b() {
        return this.f919k;
    }

    @om.d(tag = 14)
    public long c() {
        return this.f922n;
    }

    @om.d(tag = 7)
    public String d() {
        return this.f915g;
    }

    @om.d(tag = 15)
    public String e() {
        return this.f923o;
    }

    @om.d(tag = 12)
    public b f() {
        return this.f920l;
    }

    @om.d(tag = 3)
    public String g() {
        return this.f911c;
    }

    @om.d(tag = 2)
    public String h() {
        return this.f910b;
    }

    @om.d(tag = 4)
    public c i() {
        return this.f912d;
    }

    @om.d(tag = 6)
    public String j() {
        return this.f914f;
    }

    @om.d(tag = 8)
    public int k() {
        return this.f916h;
    }

    @om.d(tag = 1)
    public long l() {
        return this.f909a;
    }

    @om.d(tag = 5)
    public d m() {
        return this.f913e;
    }

    @om.d(tag = 10)
    public String n() {
        return this.f918j;
    }

    @om.d(tag = 9)
    public int o() {
        return this.f917i;
    }
}