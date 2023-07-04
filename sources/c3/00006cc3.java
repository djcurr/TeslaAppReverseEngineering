package f2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final i f25550a = new i(a.f25552a);

    /* renamed from: b  reason: collision with root package name */
    private static final i f25551b = new i(C0500b.f25553a);

    /* loaded from: classes.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.p<Integer, Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25552a = new a();

        a() {
            super(2, j00.a.class, "min", "min(II)I", 1);
        }

        public final Integer d(int i11, int i12) {
            return Integer.valueOf(Math.min(i11, i12));
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return d(num.intValue(), num2.intValue());
        }
    }

    /* renamed from: f2.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    /* synthetic */ class C0500b extends kotlin.jvm.internal.p implements h00.p<Integer, Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0500b f25553a = new C0500b();

        C0500b() {
            super(2, j00.a.class, "max", "max(II)I", 1);
        }

        public final Integer d(int i11, int i12) {
            return Integer.valueOf(Math.max(i11, i12));
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
            return d(num.intValue(), num2.intValue());
        }
    }

    public static final i a() {
        return f25550a;
    }

    public static final i b() {
        return f25551b;
    }

    public static final int c(f2.a aVar, int i11, int i12) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return aVar.a().invoke(Integer.valueOf(i11), Integer.valueOf(i12)).intValue();
    }
}