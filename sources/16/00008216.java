package l2;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l2.m;
import o1.f;
import vz.b0;

/* loaded from: classes.dex */
public final class n implements m {

    /* renamed from: c  reason: collision with root package name */
    public static final a f36439c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static AtomicInteger f36440d = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    private final int f36441a;

    /* renamed from: b  reason: collision with root package name */
    private final k f36442b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return n.f36440d.addAndGet(1);
        }
    }

    public n(int i11, boolean z11, boolean z12, h00.l<? super v, b0> properties) {
        kotlin.jvm.internal.s.g(properties, "properties");
        this.f36441a = i11;
        k kVar = new k();
        kVar.p(z11);
        kVar.o(z12);
        properties.invoke(kVar);
        this.f36442b = kVar;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) m.a.b(this, r11, pVar);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) m.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return getId() == nVar.getId() && kotlin.jvm.internal.s.c(r0(), nVar.r0());
        }
        return false;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return m.a.d(this, fVar);
    }

    @Override // l2.m
    public int getId() {
        return this.f36441a;
    }

    public int hashCode() {
        return (r0().hashCode() * 31) + Integer.hashCode(getId());
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return m.a.a(this, lVar);
    }

    @Override // l2.m
    public k r0() {
        return this.f36442b;
    }
}