package w0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: e  reason: collision with root package name */
    public static final a f55229e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final v f55230f = new v(0, false, 0, 0, 15, null);

    /* renamed from: a  reason: collision with root package name */
    private final int f55231a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f55232b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55233c;

    /* renamed from: d  reason: collision with root package name */
    private final int f55234d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final v a() {
            return v.f55230f;
        }
    }

    private v(int i11, boolean z11, int i12, int i13) {
        this.f55231a = i11;
        this.f55232b = z11;
        this.f55233c = i12;
        this.f55234d = i13;
    }

    public /* synthetic */ v(int i11, boolean z11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, z11, i12, i13);
    }

    public final int b() {
        return this.f55231a;
    }

    public final int c() {
        return this.f55234d;
    }

    public final int d() {
        return this.f55233c;
    }

    public final s2.m e(boolean z11) {
        return new s2.m(z11, b(), this.f55232b, d(), c(), null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return s2.r.f(b(), vVar.b()) && this.f55232b == vVar.f55232b && s2.s.l(d(), vVar.d()) && s2.l.l(c(), vVar.c());
        }
        return false;
    }

    public int hashCode() {
        return (((((s2.r.g(b()) * 31) + Boolean.hashCode(this.f55232b)) * 31) + s2.s.m(d())) * 31) + s2.l.m(c());
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) s2.r.h(b())) + ", autoCorrect=" + this.f55232b + ", keyboardType=" + ((Object) s2.s.n(d())) + ", imeAction=" + ((Object) s2.l.n(c())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ v(int i11, boolean z11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? s2.r.f50134a.b() : i11, (i14 & 2) != 0 ? true : z11, (i14 & 4) != 0 ? s2.s.f50139b.g() : i12, (i14 & 8) != 0 ? s2.l.f50115b.a() : i13, null);
    }
}