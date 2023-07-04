package n10;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final b f40207a = new b(null);

    /* renamed from: b  reason: collision with root package name */
    private static final d f40208b = new d(b20.e.BOOLEAN);

    /* renamed from: c  reason: collision with root package name */
    private static final d f40209c = new d(b20.e.CHAR);

    /* renamed from: d  reason: collision with root package name */
    private static final d f40210d = new d(b20.e.BYTE);

    /* renamed from: e  reason: collision with root package name */
    private static final d f40211e = new d(b20.e.SHORT);

    /* renamed from: f  reason: collision with root package name */
    private static final d f40212f = new d(b20.e.INT);

    /* renamed from: g  reason: collision with root package name */
    private static final d f40213g = new d(b20.e.FLOAT);

    /* renamed from: h  reason: collision with root package name */
    private static final d f40214h = new d(b20.e.LONG);

    /* renamed from: i  reason: collision with root package name */
    private static final d f40215i = new d(b20.e.DOUBLE);

    /* loaded from: classes5.dex */
    public static final class a extends j {

        /* renamed from: j  reason: collision with root package name */
        private final j f40216j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j elementType) {
            super(null);
            kotlin.jvm.internal.s.g(elementType, "elementType");
            this.f40216j = elementType;
        }

        public final j i() {
            return this.f40216j;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return j.f40208b;
        }

        public final d b() {
            return j.f40210d;
        }

        public final d c() {
            return j.f40209c;
        }

        public final d d() {
            return j.f40215i;
        }

        public final d e() {
            return j.f40213g;
        }

        public final d f() {
            return j.f40212f;
        }

        public final d g() {
            return j.f40214h;
        }

        public final d h() {
            return j.f40211e;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends j {

        /* renamed from: j  reason: collision with root package name */
        private final String f40217j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String internalName) {
            super(null);
            kotlin.jvm.internal.s.g(internalName, "internalName");
            this.f40217j = internalName;
        }

        public final String i() {
            return this.f40217j;
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends j {

        /* renamed from: j  reason: collision with root package name */
        private final b20.e f40218j;

        public d(b20.e eVar) {
            super(null);
            this.f40218j = eVar;
        }

        public final b20.e i() {
            return this.f40218j;
        }
    }

    private j() {
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return l.f40219a.d(this);
    }
}