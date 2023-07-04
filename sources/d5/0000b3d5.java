package t00;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class e extends h {

    /* renamed from: g  reason: collision with root package name */
    public static final a f51281g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    private static final e f51282h = new e(false, 1, null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.f51282h;
        }
    }

    public e(boolean z11) {
        super(new j20.f("DefaultBuiltIns"));
        if (z11) {
            f(false);
        }
    }

    public static final e E0() {
        return f51281g.a();
    }

    public /* synthetic */ e(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }
}