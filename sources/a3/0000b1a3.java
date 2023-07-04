package s2;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: d  reason: collision with root package name */
    private static final l1.i<a0, Object> f50058d;

    /* renamed from: a  reason: collision with root package name */
    private final n2.a f50059a;

    /* renamed from: b  reason: collision with root package name */
    private final long f50060b;

    /* renamed from: c  reason: collision with root package name */
    private final n2.y f50061c;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<l1.k, a0, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f50062a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Object invoke(l1.k Saver, a0 it2) {
            ArrayList e11;
            kotlin.jvm.internal.s.g(Saver, "$this$Saver");
            kotlin.jvm.internal.s.g(it2, "it");
            e11 = wz.w.e(n2.r.t(it2.e(), n2.r.d(), Saver), n2.r.t(n2.y.b(it2.g()), n2.r.f(n2.y.f40417b), Saver));
            return e11;
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<Object, a0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f50063a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final a0 invoke(Object it2) {
            n2.a b11;
            kotlin.jvm.internal.s.g(it2, "it");
            List list = (List) it2;
            Object obj = list.get(0);
            l1.i<n2.a, Object> d11 = n2.r.d();
            Boolean bool = Boolean.FALSE;
            n2.y yVar = null;
            if (kotlin.jvm.internal.s.c(obj, bool)) {
                b11 = null;
            } else {
                b11 = obj == null ? null : d11.b(obj);
            }
            kotlin.jvm.internal.s.e(b11);
            Object obj2 = list.get(1);
            l1.i<n2.y, Object> f11 = n2.r.f(n2.y.f40417b);
            if (!kotlin.jvm.internal.s.c(obj2, bool) && obj2 != null) {
                yVar = f11.b(obj2);
            }
            kotlin.jvm.internal.s.e(yVar);
            return new a0(b11, yVar.r(), (n2.y) null, 4, (DefaultConstructorMarker) null);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new c(null);
        f50058d = l1.j.a(a.f50062a, b.f50063a);
    }

    public /* synthetic */ a0(String str, long j11, n2.y yVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j11, yVar);
    }

    private a0(n2.a aVar, long j11, n2.y yVar) {
        this.f50059a = aVar;
        this.f50060b = n2.z.c(j11, 0, h().length());
        this.f50061c = yVar == null ? null : n2.y.b(n2.z.c(yVar.r(), 0, h().length()));
    }

    public /* synthetic */ a0(n2.a aVar, long j11, n2.y yVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j11, yVar);
    }

    public static /* synthetic */ a0 c(a0 a0Var, String str, long j11, n2.y yVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = a0Var.g();
        }
        if ((i11 & 4) != 0) {
            yVar = a0Var.f();
        }
        return a0Var.a(str, j11, yVar);
    }

    public static /* synthetic */ a0 d(a0 a0Var, n2.a aVar, long j11, n2.y yVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = a0Var.f50059a;
        }
        if ((i11 & 2) != 0) {
            j11 = a0Var.g();
        }
        if ((i11 & 4) != 0) {
            yVar = a0Var.f();
        }
        return a0Var.b(aVar, j11, yVar);
    }

    public final a0 a(String text, long j11, n2.y yVar) {
        kotlin.jvm.internal.s.g(text, "text");
        return new a0(new n2.a(text, null, null, 6, null), j11, yVar, (DefaultConstructorMarker) null);
    }

    public final a0 b(n2.a annotatedString, long j11, n2.y yVar) {
        kotlin.jvm.internal.s.g(annotatedString, "annotatedString");
        return new a0(annotatedString, j11, yVar, (DefaultConstructorMarker) null);
    }

    public final n2.a e() {
        return this.f50059a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return n2.y.g(g(), a0Var.g()) && kotlin.jvm.internal.s.c(f(), a0Var.f()) && kotlin.jvm.internal.s.c(this.f50059a, a0Var.f50059a);
        }
        return false;
    }

    public final n2.y f() {
        return this.f50061c;
    }

    public final long g() {
        return this.f50060b;
    }

    public final String h() {
        return this.f50059a.g();
    }

    public int hashCode() {
        int hashCode = ((this.f50059a.hashCode() * 31) + n2.y.o(g())) * 31;
        n2.y f11 = f();
        return hashCode + (f11 == null ? 0 : n2.y.o(f11.r()));
    }

    public String toString() {
        return "TextFieldValue(text='" + ((Object) this.f50059a) + "', selection=" + ((Object) n2.y.q(g())) + ", composition=" + f() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ a0(n2.a aVar, long j11, n2.y yVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i11 & 2) != 0 ? n2.y.f40417b.a() : j11, (i11 & 4) != 0 ? null : yVar, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ a0(String str, long j11, n2.y yVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? n2.y.f40417b.a() : j11, (i11 & 4) != 0 ? null : yVar, (DefaultConstructorMarker) null);
    }

    private a0(String str, long j11, n2.y yVar) {
        this(new n2.a(str, null, null, 6, null), j11, yVar, (DefaultConstructorMarker) null);
    }
}