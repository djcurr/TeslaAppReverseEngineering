package e2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import s1.f;

/* loaded from: classes.dex */
final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final a f24534e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final e f24535f;

    /* renamed from: a  reason: collision with root package name */
    private final long f24536a;

    /* renamed from: b  reason: collision with root package name */
    private final float f24537b;

    /* renamed from: c  reason: collision with root package name */
    private final long f24538c;

    /* renamed from: d  reason: collision with root package name */
    private final long f24539d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return e.f24535f;
        }
    }

    static {
        f.a aVar = s1.f.f49950b;
        f24535f = new e(aVar.c(), 1.0f, 0L, aVar.c(), null);
    }

    private e(long j11, float f11, long j12, long j13) {
        this.f24536a = j11;
        this.f24537b = f11;
        this.f24538c = j12;
        this.f24539d = j13;
    }

    public /* synthetic */ e(long j11, float f11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, f11, j12, j13);
    }

    public final long b() {
        return this.f24536a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return s1.f.j(this.f24536a, eVar.f24536a) && s.c(Float.valueOf(this.f24537b), Float.valueOf(eVar.f24537b)) && this.f24538c == eVar.f24538c && s1.f.j(this.f24539d, eVar.f24539d);
        }
        return false;
    }

    public int hashCode() {
        return (((((s1.f.n(this.f24536a) * 31) + Float.hashCode(this.f24537b)) * 31) + Long.hashCode(this.f24538c)) * 31) + s1.f.n(this.f24539d);
    }

    public String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + ((Object) s1.f.s(this.f24536a)) + ", confidence=" + this.f24537b + ", durationMillis=" + this.f24538c + ", offset=" + ((Object) s1.f.s(this.f24539d)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}