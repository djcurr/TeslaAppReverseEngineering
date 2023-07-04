package v1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import t1.f1;
import t1.g1;
import t1.r0;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: f  reason: collision with root package name */
    public static final a f53872f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    private static final int f53873g = f1.f51429b.a();

    /* renamed from: a  reason: collision with root package name */
    private final float f53874a;

    /* renamed from: b  reason: collision with root package name */
    private final float f53875b;

    /* renamed from: c  reason: collision with root package name */
    private final int f53876c;

    /* renamed from: d  reason: collision with root package name */
    private final int f53877d;

    /* renamed from: e  reason: collision with root package name */
    private final r0 f53878e;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return j.f53873g;
        }
    }

    static {
        g1.f51434b.b();
    }

    public /* synthetic */ j(float f11, float f12, int i11, int i12, r0 r0Var, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? BitmapDescriptorFactory.HUE_RED : f11, (i13 & 2) != 0 ? 4.0f : f12, (i13 & 4) != 0 ? f1.f51429b.a() : i11, (i13 & 8) != 0 ? g1.f51434b.b() : i12, (i13 & 16) != 0 ? null : r0Var, null);
    }

    public /* synthetic */ j(float f11, float f12, int i11, int i12, r0 r0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, i11, i12, r0Var);
    }

    public final int b() {
        return this.f53876c;
    }

    public final int c() {
        return this.f53877d;
    }

    public final float d() {
        return this.f53875b;
    }

    public final r0 e() {
        return this.f53878e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f53874a == jVar.f53874a) {
                return ((this.f53875b > jVar.f53875b ? 1 : (this.f53875b == jVar.f53875b ? 0 : -1)) == 0) && f1.g(b(), jVar.b()) && g1.g(c(), jVar.c()) && s.c(this.f53878e, jVar.f53878e);
            }
            return false;
        }
        return false;
    }

    public final float f() {
        return this.f53874a;
    }

    public int hashCode() {
        int hashCode = ((((((Float.hashCode(this.f53874a) * 31) + Float.hashCode(this.f53875b)) * 31) + f1.h(b())) * 31) + g1.h(c())) * 31;
        r0 r0Var = this.f53878e;
        return hashCode + (r0Var == null ? 0 : r0Var.hashCode());
    }

    public String toString() {
        return "Stroke(width=" + this.f53874a + ", miter=" + this.f53875b + ", cap=" + ((Object) f1.i(b())) + ", join=" + ((Object) g1.i(c())) + ", pathEffect=" + this.f53878e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private j(float f11, float f12, int i11, int i12, r0 r0Var) {
        super(null);
        this.f53874a = f11;
        this.f53875b = f12;
        this.f53876c = i11;
        this.f53877d = i12;
        this.f53878e = r0Var;
    }
}