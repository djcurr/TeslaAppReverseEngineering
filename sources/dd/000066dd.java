package e10;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.s0;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    private final e0 f24503a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f24504b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<u10.c, e0> f24505c;

    /* renamed from: d  reason: collision with root package name */
    private final vz.k f24506d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f24507e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<String[]> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final String[] invoke() {
            List c11;
            List a11;
            x xVar = x.this;
            c11 = wz.v.c();
            c11.add(xVar.a().getDescription());
            e0 b11 = xVar.b();
            if (b11 != null) {
                c11.add(kotlin.jvm.internal.s.p("under-migration:", b11.getDescription()));
            }
            for (Map.Entry<u10.c, e0> entry : xVar.c().entrySet()) {
                c11.add('@' + entry.getKey() + CoreConstants.COLON_CHAR + entry.getValue().getDescription());
            }
            a11 = wz.v.a(c11);
            Object[] array = a11.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return (String[]) array;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(e0 globalLevel, e0 e0Var, Map<u10.c, ? extends e0> userDefinedLevelForSpecificAnnotation) {
        vz.k a11;
        kotlin.jvm.internal.s.g(globalLevel, "globalLevel");
        kotlin.jvm.internal.s.g(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f24503a = globalLevel;
        this.f24504b = e0Var;
        this.f24505c = userDefinedLevelForSpecificAnnotation;
        a11 = vz.m.a(new a());
        this.f24506d = a11;
        e0 e0Var2 = e0.IGNORE;
        this.f24507e = globalLevel == e0Var2 && e0Var == e0Var2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public final e0 a() {
        return this.f24503a;
    }

    public final e0 b() {
        return this.f24504b;
    }

    public final Map<u10.c, e0> c() {
        return this.f24505c;
    }

    public final boolean d() {
        return this.f24507e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return this.f24503a == xVar.f24503a && this.f24504b == xVar.f24504b && kotlin.jvm.internal.s.c(this.f24505c, xVar.f24505c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f24503a.hashCode() * 31;
        e0 e0Var = this.f24504b;
        return ((hashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31) + this.f24505c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f24503a + ", migrationLevel=" + this.f24504b + ", userDefinedLevelForSpecificAnnotation=" + this.f24505c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ x(e0 e0Var, e0 e0Var2, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(e0Var, (i11 & 2) != 0 ? null : e0Var2, (i11 & 4) != 0 ? s0.i() : map);
    }
}