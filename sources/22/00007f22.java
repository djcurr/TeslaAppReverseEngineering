package kotlin.reflect.jvm.internal.impl.types.checker;

import k20.d0;
import k20.d1;
import k20.g;
import k20.j1;
import k20.k0;
import k20.k1;
import k20.x0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.h;

/* loaded from: classes5.dex */
public class a extends k20.g {

    /* renamed from: k  reason: collision with root package name */
    public static final C0659a f35140k = new C0659a(null);

    /* renamed from: e  reason: collision with root package name */
    private final boolean f35141e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f35142f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f35143g;

    /* renamed from: h  reason: collision with root package name */
    private final h f35144h;

    /* renamed from: i  reason: collision with root package name */
    private final g f35145i;

    /* renamed from: j  reason: collision with root package name */
    private final c f35146j;

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0659a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0660a extends g.b.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f35147a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d1 f35148b;

            C0660a(c cVar, d1 d1Var) {
                this.f35147a = cVar;
                this.f35148b = d1Var;
            }

            @Override // k20.g.b
            public m20.j a(k20.g context, m20.i type) {
                kotlin.jvm.internal.s.g(context, "context");
                kotlin.jvm.internal.s.g(type, "type");
                c cVar = this.f35147a;
                d0 n11 = this.f35148b.n((d0) cVar.U(type), k1.INVARIANT);
                kotlin.jvm.internal.s.f(n11, "substitutor.safeSubstitu…ANT\n                    )");
                m20.j a11 = cVar.a(n11);
                kotlin.jvm.internal.s.e(a11);
                return a11;
            }
        }

        private C0659a() {
        }

        public /* synthetic */ C0659a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g.b.a a(c cVar, m20.j type) {
            String b11;
            kotlin.jvm.internal.s.g(cVar, "<this>");
            kotlin.jvm.internal.s.g(type, "type");
            if (!(type instanceof k0)) {
                b11 = b.b(type);
                throw new IllegalArgumentException(b11.toString());
            }
            return new C0660a(cVar, x0.f34347b.a((d0) type).c());
        }
    }

    public /* synthetic */ a(boolean z11, boolean z12, boolean z13, h hVar, g gVar, c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? true : z12, (i11 & 4) == 0 ? z13 : true, (i11 & 8) != 0 ? h.a.f35151a : hVar, (i11 & 16) != 0 ? g.a.f35150a : gVar, (i11 & 32) != 0 ? r.f35177a : cVar);
    }

    @Override // k20.g
    public boolean l(m20.i iVar) {
        kotlin.jvm.internal.s.g(iVar, "<this>");
        return (iVar instanceof j1) && this.f35143g && (((j1) iVar).H0() instanceof o);
    }

    @Override // k20.g
    public boolean n() {
        return this.f35141e;
    }

    @Override // k20.g
    public boolean o() {
        return this.f35142f;
    }

    @Override // k20.g
    public m20.i p(m20.i type) {
        String b11;
        kotlin.jvm.internal.s.g(type, "type");
        if (!(type instanceof d0)) {
            b11 = b.b(type);
            throw new IllegalArgumentException(b11.toString());
        }
        return this.f35145i.a(((d0) type).K0());
    }

    @Override // k20.g
    public m20.i q(m20.i type) {
        String b11;
        kotlin.jvm.internal.s.g(type, "type");
        if (!(type instanceof d0)) {
            b11 = b.b(type);
            throw new IllegalArgumentException(b11.toString());
        }
        return this.f35144h.g((d0) type);
    }

    @Override // k20.g
    /* renamed from: s */
    public c j() {
        return this.f35146j;
    }

    @Override // k20.g
    /* renamed from: t */
    public g.b.a r(m20.j type) {
        kotlin.jvm.internal.s.g(type, "type");
        return f35140k.a(j(), type);
    }

    public a(boolean z11, boolean z12, boolean z13, h kotlinTypeRefiner, g kotlinTypePreparator, c typeSystemContext) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlin.jvm.internal.s.g(kotlinTypePreparator, "kotlinTypePreparator");
        kotlin.jvm.internal.s.g(typeSystemContext, "typeSystemContext");
        this.f35141e = z11;
        this.f35142f = z12;
        this.f35143g = z13;
        this.f35144h = kotlinTypeRefiner;
        this.f35145i = kotlinTypePreparator;
        this.f35146j = typeSystemContext;
    }
}