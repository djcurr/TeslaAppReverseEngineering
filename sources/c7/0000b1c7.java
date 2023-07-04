package s2;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final a f50125f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final m f50126g = new m(false, 0, false, 0, 0, 31, null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f50127a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50128b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f50129c;

    /* renamed from: d  reason: collision with root package name */
    private final int f50130d;

    /* renamed from: e  reason: collision with root package name */
    private final int f50131e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m a() {
            return m.f50126g;
        }
    }

    private m(boolean z11, int i11, boolean z12, int i12, int i13) {
        this.f50127a = z11;
        this.f50128b = i11;
        this.f50129c = z12;
        this.f50130d = i12;
        this.f50131e = i13;
    }

    public /* synthetic */ m(boolean z11, int i11, boolean z12, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, i11, z12, i12, i13);
    }

    public final boolean b() {
        return this.f50129c;
    }

    public final int c() {
        return this.f50128b;
    }

    public final int d() {
        return this.f50131e;
    }

    public final int e() {
        return this.f50130d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return this.f50127a == mVar.f50127a && r.f(c(), mVar.c()) && this.f50129c == mVar.f50129c && s.l(e(), mVar.e()) && l.l(d(), mVar.d());
        }
        return false;
    }

    public final boolean f() {
        return this.f50127a;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f50127a) * 31) + r.g(c())) * 31) + Boolean.hashCode(this.f50129c)) * 31) + s.m(e())) * 31) + l.m(d());
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f50127a + ", capitalization=" + ((Object) r.h(c())) + ", autoCorrect=" + this.f50129c + ", keyboardType=" + ((Object) s.n(e())) + ", imeAction=" + ((Object) l.n(d())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ m(boolean z11, int i11, boolean z12, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? false : z11, (i14 & 2) != 0 ? r.f50134a.b() : i11, (i14 & 4) != 0 ? true : z12, (i14 & 8) != 0 ? s.f50139b.g() : i12, (i14 & 16) != 0 ? l.f50115b.a() : i13, null);
    }
}