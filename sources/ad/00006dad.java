package f70;

/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    private final int f25981a;

    /* renamed from: b  reason: collision with root package name */
    private final long f25982b;

    /* renamed from: c  reason: collision with root package name */
    private final int f25983c;

    /* renamed from: d  reason: collision with root package name */
    private final int f25984d;

    /* loaded from: classes5.dex */
    protected static abstract class a<T extends a> {

        /* renamed from: a  reason: collision with root package name */
        private final int f25985a;

        /* renamed from: b  reason: collision with root package name */
        private int f25986b = 0;

        /* renamed from: c  reason: collision with root package name */
        private long f25987c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f25988d = 0;

        /* JADX INFO: Access modifiers changed from: protected */
        public a(int i11) {
            this.f25985a = i11;
        }

        protected abstract T e();

        /* JADX INFO: Access modifiers changed from: protected */
        public T f(int i11) {
            this.f25988d = i11;
            return e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public T g(int i11) {
            this.f25986b = i11;
            return e();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public T h(long j11) {
            this.f25987c = j11;
            return e();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public o(a aVar) {
        this.f25981a = aVar.f25986b;
        this.f25982b = aVar.f25987c;
        this.f25983c = aVar.f25985a;
        this.f25984d = aVar.f25988d;
    }

    public final int a() {
        return this.f25984d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int b() {
        return this.f25981a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long c() {
        return this.f25982b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public byte[] d() {
        byte[] bArr = new byte[32];
        r70.i.f(this.f25981a, bArr, 0);
        r70.i.s(this.f25982b, bArr, 4);
        r70.i.f(this.f25983c, bArr, 12);
        r70.i.f(this.f25984d, bArr, 28);
        return bArr;
    }
}