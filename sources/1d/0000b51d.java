package th;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final e f51936a;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private e f51937a = null;

        a() {
        }

        public b a() {
            return new b(this.f51937a);
        }

        public a b(e eVar) {
            this.f51937a = eVar;
            return this;
        }
    }

    static {
        new a().a();
    }

    b(e eVar) {
        this.f51936a = eVar;
    }

    public static a b() {
        return new a();
    }

    @om.d(tag = 1)
    public e a() {
        return this.f51936a;
    }
}