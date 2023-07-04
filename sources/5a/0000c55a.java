package zu;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class c0<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f60762e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final T f60763a;

    /* renamed from: b  reason: collision with root package name */
    private final Throwable f60764b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f60765c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f60766d;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> c0<T> a(Throwable exception) {
            kotlin.jvm.internal.s.g(exception, "exception");
            return new c0<>(null, exception, null);
        }

        public final <T> c0<T> b(T t11) {
            return new c0<>(t11, null, 2, null);
        }
    }

    private c0(T t11, Throwable th2) {
        this.f60763a = t11;
        this.f60764b = th2;
        boolean z11 = true;
        boolean z12 = t11 != null;
        this.f60765c = z12;
        if (th2 == null && z12) {
            z11 = false;
        }
        this.f60766d = z11;
    }

    public /* synthetic */ c0(Object obj, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, th2);
    }

    public final Throwable a() {
        return this.f60764b;
    }

    public final T b() {
        T t11 = this.f60763a;
        if (t11 != null) {
            return t11;
        }
        Throwable th2 = this.f60764b;
        kotlin.jvm.internal.s.e(th2);
        throw th2;
    }

    public final boolean c() {
        return this.f60766d;
    }

    /* synthetic */ c0(Object obj, Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i11 & 2) != 0 ? null : th2);
    }
}