package e10;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: d  reason: collision with root package name */
    public static final b f24496d = new b(null);

    /* renamed from: e  reason: collision with root package name */
    private static final v f24497e = new v(t.b(null, 1, null), a.f24501a);

    /* renamed from: a  reason: collision with root package name */
    private final x f24498a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<u10.c, e0> f24499b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f24500c;

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.o implements h00.l<u10.c, e0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24501a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: d */
        public final e0 invoke(u10.c p02) {
            kotlin.jvm.internal.s.g(p02, "p0");
            return t.d(p02);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.f
        public final n00.g getOwner() {
            return m0.d(t.class, "descriptors.jvm");
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a() {
            return v.f24497e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v(x jsr305, h00.l<? super u10.c, ? extends e0> getReportLevelForAnnotation) {
        kotlin.jvm.internal.s.g(jsr305, "jsr305");
        kotlin.jvm.internal.s.g(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f24498a = jsr305;
        this.f24499b = getReportLevelForAnnotation;
        this.f24500c = jsr305.d() || getReportLevelForAnnotation.invoke(t.e()) == e0.IGNORE;
    }

    public final boolean b() {
        return this.f24500c;
    }

    public final h00.l<u10.c, e0> c() {
        return this.f24499b;
    }

    public final x d() {
        return this.f24498a;
    }
}