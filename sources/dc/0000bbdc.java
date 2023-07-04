package w10;

import java.util.Collection;
import k20.w0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import kotlin.reflect.jvm.internal.impl.types.checker.h;
import w00.a0;
import w00.n0;
import w00.s0;
import w10.j;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f55369a = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends u implements h00.p<w00.i, w00.i, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f55370a = new a();

        a() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Boolean invoke(w00.i iVar, w00.i iVar2) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w10.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1260b implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f55371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a f55372b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a f55373c;

        /* renamed from: w10.b$b$a */
        /* loaded from: classes5.dex */
        static final class a extends u implements h00.p<w00.i, w00.i, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a f55374a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a f55375b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
                super(2);
                this.f55374a = aVar;
                this.f55375b = aVar2;
            }

            @Override // h00.p
            /* renamed from: a */
            public final Boolean invoke(w00.i iVar, w00.i iVar2) {
                return Boolean.valueOf(s.c(iVar, this.f55374a) && s.c(iVar2, this.f55375b));
            }
        }

        C1260b(boolean z11, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
            this.f55371a = z11;
            this.f55372b = aVar;
            this.f55373c = aVar2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.f.a
        public final boolean a(w0 c12, w0 c22) {
            s.g(c12, "c1");
            s.g(c22, "c2");
            if (s.c(c12, c22)) {
                return true;
            }
            w00.e n11 = c12.n();
            w00.e n12 = c22.n();
            if ((n11 instanceof s0) && (n12 instanceof s0)) {
                return b.f55369a.g((s0) n11, (s0) n12, this.f55371a, new a(this.f55372b, this.f55373c));
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends u implements h00.p<w00.i, w00.i, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f55376a = new c();

        c() {
            super(2);
        }

        @Override // h00.p
        /* renamed from: a */
        public final Boolean invoke(w00.i iVar, w00.i iVar2) {
            return Boolean.FALSE;
        }
    }

    private b() {
    }

    public static /* synthetic */ boolean b(b bVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, boolean z11, boolean z12, boolean z13, kotlin.reflect.jvm.internal.impl.types.checker.h hVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        boolean z14 = z12;
        if ((i11 & 16) != 0) {
            z13 = false;
        }
        return bVar.a(aVar, aVar2, z11, z14, z13, hVar);
    }

    private final boolean c(w00.c cVar, w00.c cVar2) {
        return s.c(cVar.i(), cVar2.i());
    }

    public static /* synthetic */ boolean e(b bVar, w00.i iVar, w00.i iVar2, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        return bVar.d(iVar, iVar2, z11, z12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean h(b bVar, s0 s0Var, s0 s0Var2, boolean z11, h00.p pVar, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            pVar = c.f55376a;
        }
        return bVar.g(s0Var, s0Var2, z11, pVar);
    }

    private final boolean i(w00.i iVar, w00.i iVar2, h00.p<? super w00.i, ? super w00.i, Boolean> pVar, boolean z11) {
        w00.i b11 = iVar.b();
        w00.i b12 = iVar2.b();
        if (!(b11 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) && !(b12 instanceof kotlin.reflect.jvm.internal.impl.descriptors.b)) {
            return e(this, b11, b12, z11, false, 8, null);
        }
        return pVar.invoke(b11, b12).booleanValue();
    }

    private final n0 j(kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        while (aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.b) {
            kotlin.reflect.jvm.internal.impl.descriptors.b bVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) aVar;
            if (bVar.getKind() != b.a.FAKE_OVERRIDE) {
                break;
            }
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> overriddenDescriptors = bVar.d();
            s.f(overriddenDescriptors, "overriddenDescriptors");
            aVar = (kotlin.reflect.jvm.internal.impl.descriptors.b) wz.u.D0(overriddenDescriptors);
            if (aVar == null) {
                return null;
            }
        }
        return aVar.f();
    }

    public final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.a a11, kotlin.reflect.jvm.internal.impl.descriptors.a b11, boolean z11, boolean z12, boolean z13, kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        s.g(a11, "a");
        s.g(b11, "b");
        s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        if (s.c(a11, b11)) {
            return true;
        }
        if (s.c(a11.getName(), b11.getName())) {
            if (z12 && (a11 instanceof w00.u) && (b11 instanceof w00.u) && ((w00.u) a11).g0() != ((w00.u) b11).g0()) {
                return false;
            }
            if ((!s.c(a11.b(), b11.b()) || (z11 && s.c(j(a11), j(b11)))) && !d.E(a11) && !d.E(b11) && i(a11, b11, a.f55370a, z11)) {
                j i11 = j.i(kotlinTypeRefiner, new C1260b(z11, a11, b11));
                s.f(i11, "a: CallableDescriptor,\n …= a && y == b }\n        }");
                j.i.a c11 = i11.F(a11, b11, null, !z13).c();
                j.i.a aVar = j.i.a.OVERRIDABLE;
                return c11 == aVar && i11.F(b11, a11, null, z13 ^ true).c() == aVar;
            }
            return false;
        }
        return false;
    }

    public final boolean d(w00.i iVar, w00.i iVar2, boolean z11, boolean z12) {
        if ((iVar instanceof w00.c) && (iVar2 instanceof w00.c)) {
            return c((w00.c) iVar, (w00.c) iVar2);
        }
        if ((iVar instanceof s0) && (iVar2 instanceof s0)) {
            return h(this, (s0) iVar, (s0) iVar2, z11, null, 8, null);
        }
        if ((iVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) && (iVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.a)) {
            return b(this, (kotlin.reflect.jvm.internal.impl.descriptors.a) iVar, (kotlin.reflect.jvm.internal.impl.descriptors.a) iVar2, z11, z12, false, h.a.f35151a, 16, null);
        }
        return ((iVar instanceof a0) && (iVar2 instanceof a0)) ? s.c(((a0) iVar).e(), ((a0) iVar2).e()) : s.c(iVar, iVar2);
    }

    public final boolean f(s0 a11, s0 b11, boolean z11) {
        s.g(a11, "a");
        s.g(b11, "b");
        return h(this, a11, b11, z11, null, 8, null);
    }

    public final boolean g(s0 a11, s0 b11, boolean z11, h00.p<? super w00.i, ? super w00.i, Boolean> equivalentCallables) {
        s.g(a11, "a");
        s.g(b11, "b");
        s.g(equivalentCallables, "equivalentCallables");
        if (s.c(a11, b11)) {
            return true;
        }
        return !s.c(a11.b(), b11.b()) && i(a11, b11, equivalentCallables, z11) && a11.getIndex() == b11.getIndex();
    }
}