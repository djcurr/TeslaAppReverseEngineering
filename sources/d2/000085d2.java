package m10;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final a f38271e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final e f38272f = new e(null, null, false, false, 8, null);

    /* renamed from: a  reason: collision with root package name */
    private final h f38273a;

    /* renamed from: b  reason: collision with root package name */
    private final f f38274b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f38275c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f38276d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.f38272f;
        }
    }

    public e(h hVar, f fVar, boolean z11, boolean z12) {
        this.f38273a = hVar;
        this.f38274b = fVar;
        this.f38275c = z11;
        this.f38276d = z12;
    }

    public final f b() {
        return this.f38274b;
    }

    public final h c() {
        return this.f38273a;
    }

    public final boolean d() {
        return this.f38275c;
    }

    public final boolean e() {
        return this.f38276d;
    }

    public /* synthetic */ e(h hVar, f fVar, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, fVar, z11, (i11 & 8) != 0 ? false : z12);
    }
}