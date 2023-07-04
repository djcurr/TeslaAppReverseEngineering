package kotlin.jvm.internal;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.slf4j.Marker;

/* loaded from: classes5.dex */
public final class t0 implements n00.p {

    /* renamed from: a  reason: collision with root package name */
    private final n00.f f34925a;

    /* renamed from: b  reason: collision with root package name */
    private final List<n00.r> f34926b;

    /* renamed from: c  reason: collision with root package name */
    private final n00.p f34927c;

    /* renamed from: d  reason: collision with root package name */
    private final int f34928d;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34929a;

        static {
            int[] iArr = new int[n00.s.values().length];
            iArr[n00.s.INVARIANT.ordinal()] = 1;
            iArr[n00.s.IN.ordinal()] = 2;
            iArr[n00.s.OUT.ordinal()] = 3;
            f34929a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends u implements h00.l<n00.r, CharSequence> {
        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence invoke(n00.r it2) {
            s.g(it2, "it");
            return t0.this.k(it2);
        }
    }

    static {
        new a(null);
    }

    public t0(n00.f classifier, List<n00.r> arguments, n00.p pVar, int i11) {
        s.g(classifier, "classifier");
        s.g(arguments, "arguments");
        this.f34925a = classifier;
        this.f34926b = arguments;
        this.f34927c = pVar;
        this.f34928d = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k(n00.r rVar) {
        String valueOf;
        if (rVar.d() == null) {
            return Marker.ANY_MARKER;
        }
        n00.p c11 = rVar.c();
        t0 t0Var = c11 instanceof t0 ? (t0) c11 : null;
        if (t0Var == null || (valueOf = t0Var.r(true)) == null) {
            valueOf = String.valueOf(rVar.c());
        }
        int i11 = b.f34929a[rVar.d().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return "in " + valueOf;
            } else if (i11 == 3) {
                return "out " + valueOf;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return valueOf;
    }

    private final String r(boolean z11) {
        String name;
        n00.f c11 = c();
        n00.d dVar = c11 instanceof n00.d ? (n00.d) c11 : null;
        Class<?> b11 = dVar != null ? g00.a.b(dVar) : null;
        if (b11 == null) {
            name = c().toString();
        } else if ((this.f34928d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (b11.isArray()) {
            name = s(b11);
        } else {
            name = (z11 && b11.isPrimitive()) ? g00.a.c((n00.d) c()).getName() : b11.getName();
        }
        String str = name + (f().isEmpty() ? "" : wz.e0.l0(f(), ", ", "<", ">", 0, null, new c(), 24, null)) + (e() ? CallerData.NA : "");
        n00.p pVar = this.f34927c;
        if (pVar instanceof t0) {
            String r11 = ((t0) pVar).r(true);
            if (s.c(r11, str)) {
                return str;
            }
            if (s.c(r11, str + '?')) {
                return str + '!';
            }
            return CoreConstants.LEFT_PARENTHESIS_CHAR + str + CallerDataConverter.DEFAULT_RANGE_DELIMITER + r11 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        return str;
    }

    private final String s(Class<?> cls) {
        return s.c(cls, boolean[].class) ? "kotlin.BooleanArray" : s.c(cls, char[].class) ? "kotlin.CharArray" : s.c(cls, byte[].class) ? "kotlin.ByteArray" : s.c(cls, short[].class) ? "kotlin.ShortArray" : s.c(cls, int[].class) ? "kotlin.IntArray" : s.c(cls, float[].class) ? "kotlin.FloatArray" : s.c(cls, long[].class) ? "kotlin.LongArray" : s.c(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @Override // n00.p
    public n00.f c() {
        return this.f34925a;
    }

    @Override // n00.p
    public boolean e() {
        return (this.f34928d & 1) != 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            if (s.c(c(), t0Var.c()) && s.c(f(), t0Var.f()) && s.c(this.f34927c, t0Var.f34927c) && this.f34928d == t0Var.f34928d) {
                return true;
            }
        }
        return false;
    }

    @Override // n00.p
    public List<n00.r> f() {
        return this.f34926b;
    }

    @Override // n00.b
    public List<Annotation> getAnnotations() {
        List<Annotation> i11;
        i11 = wz.w.i();
        return i11;
    }

    public int hashCode() {
        return (((c().hashCode() * 31) + f().hashCode()) * 31) + Integer.valueOf(this.f34928d).hashCode();
    }

    public String toString() {
        return r(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t0(n00.f classifier, List<n00.r> arguments, boolean z11) {
        this(classifier, arguments, null, z11 ? 1 : 0);
        s.g(classifier, "classifier");
        s.g(arguments, "arguments");
    }
}