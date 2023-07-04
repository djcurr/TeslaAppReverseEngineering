package g20;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p10.c;
import w00.n0;

/* loaded from: classes5.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private final r10.c f27470a;

    /* renamed from: b  reason: collision with root package name */
    private final r10.g f27471b;

    /* renamed from: c  reason: collision with root package name */
    private final n0 f27472c;

    /* loaded from: classes5.dex */
    public static final class a extends y {

        /* renamed from: d  reason: collision with root package name */
        private final p10.c f27473d;

        /* renamed from: e  reason: collision with root package name */
        private final a f27474e;

        /* renamed from: f  reason: collision with root package name */
        private final u10.b f27475f;

        /* renamed from: g  reason: collision with root package name */
        private final c.EnumC0974c f27476g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f27477h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p10.c classProto, r10.c nameResolver, r10.g typeTable, n0 n0Var, a aVar) {
            super(nameResolver, typeTable, n0Var, null);
            kotlin.jvm.internal.s.g(classProto, "classProto");
            kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
            kotlin.jvm.internal.s.g(typeTable, "typeTable");
            this.f27473d = classProto;
            this.f27474e = aVar;
            this.f27475f = w.a(nameResolver, classProto.l0());
            c.EnumC0974c d11 = r10.b.f49035f.d(classProto.k0());
            this.f27476g = d11 == null ? c.EnumC0974c.CLASS : d11;
            Boolean d12 = r10.b.f49036g.d(classProto.k0());
            kotlin.jvm.internal.s.f(d12, "IS_INNER.get(classProto.flags)");
            this.f27477h = d12.booleanValue();
        }

        @Override // g20.y
        public u10.c a() {
            u10.c b11 = this.f27475f.b();
            kotlin.jvm.internal.s.f(b11, "classId.asSingleFqName()");
            return b11;
        }

        public final u10.b e() {
            return this.f27475f;
        }

        public final p10.c f() {
            return this.f27473d;
        }

        public final c.EnumC0974c g() {
            return this.f27476g;
        }

        public final a h() {
            return this.f27474e;
        }

        public final boolean i() {
            return this.f27477h;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends y {

        /* renamed from: d  reason: collision with root package name */
        private final u10.c f27478d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(u10.c fqName, r10.c nameResolver, r10.g typeTable, n0 n0Var) {
            super(nameResolver, typeTable, n0Var, null);
            kotlin.jvm.internal.s.g(fqName, "fqName");
            kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
            kotlin.jvm.internal.s.g(typeTable, "typeTable");
            this.f27478d = fqName;
        }

        @Override // g20.y
        public u10.c a() {
            return this.f27478d;
        }
    }

    private y(r10.c cVar, r10.g gVar, n0 n0Var) {
        this.f27470a = cVar;
        this.f27471b = gVar;
        this.f27472c = n0Var;
    }

    public /* synthetic */ y(r10.c cVar, r10.g gVar, n0 n0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, gVar, n0Var);
    }

    public abstract u10.c a();

    public final r10.c b() {
        return this.f27470a;
    }

    public final n0 c() {
        return this.f27472c;
    }

    public final r10.g d() {
        return this.f27471b;
    }

    public String toString() {
        return ((Object) getClass().getSimpleName()) + ": " + a();
    }
}