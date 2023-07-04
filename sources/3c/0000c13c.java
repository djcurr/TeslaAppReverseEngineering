package y00;

import com.stripe.android.model.Stripe3ds2AuthParams;
import d20.h;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k20.w0;
import w00.s0;

/* loaded from: classes5.dex */
public class n extends g {

    /* renamed from: i  reason: collision with root package name */
    private final w0 f58834i;

    /* renamed from: j  reason: collision with root package name */
    private final d20.h f58835j;

    /* renamed from: k  reason: collision with root package name */
    private final j20.i<Set<u10.f>> f58836k;

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f58837l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class a extends d20.i {

        /* renamed from: b  reason: collision with root package name */
        private final j20.g<u10.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> f58838b;

        /* renamed from: c  reason: collision with root package name */
        private final j20.g<u10.f, Collection<? extends w00.i0>> f58839c;

        /* renamed from: d  reason: collision with root package name */
        private final j20.i<Collection<w00.i>> f58840d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n f58841e;

        /* renamed from: y00.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        class C1337a implements h00.l<u10.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h>> {
            C1337a(n nVar) {
            }

            @Override // h00.l
            /* renamed from: a */
            public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> mo12invoke(u10.f fVar) {
                return a.this.m(fVar);
            }
        }

        /* loaded from: classes5.dex */
        class b implements h00.l<u10.f, Collection<? extends w00.i0>> {
            b(n nVar) {
            }

            @Override // h00.l
            /* renamed from: a */
            public Collection<? extends w00.i0> mo12invoke(u10.f fVar) {
                return a.this.n(fVar);
            }
        }

        /* loaded from: classes5.dex */
        class c implements h00.a<Collection<w00.i>> {
            c(n nVar) {
            }

            @Override // h00.a
            /* renamed from: a */
            public Collection<w00.i> mo11invoke() {
                return a.this.l();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class d extends w10.h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Set f58845a;

            d(a aVar, Set set) {
                this.f58845a = set;
            }

            private static /* synthetic */ void f(int i11) {
                Object[] objArr = new Object[3];
                if (i11 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i11 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i11 == 1 || i11 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // w10.i
            public void a(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
                if (bVar == null) {
                    f(0);
                }
                w10.j.L(bVar, null);
                this.f58845a.add(bVar);
            }

            @Override // w10.h
            protected void e(kotlin.reflect.jvm.internal.impl.descriptors.b bVar, kotlin.reflect.jvm.internal.impl.descriptors.b bVar2) {
                if (bVar == null) {
                    f(1);
                }
                if (bVar2 == null) {
                    f(2);
                }
            }
        }

        public a(n nVar, j20.n nVar2) {
            if (nVar2 == null) {
                h(0);
            }
            this.f58841e = nVar;
            this.f58838b = nVar2.e(new C1337a(nVar));
            this.f58839c = nVar2.e(new b(nVar));
            this.f58840d = nVar2.b(new c(nVar));
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b5 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y00.n.a.h(int):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<w00.i> l() {
            HashSet hashSet = new HashSet();
            for (u10.f fVar : (Set) this.f58841e.f58836k.mo11invoke()) {
                d10.d dVar = d10.d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(c(fVar, dVar));
                hashSet.addAll(a(fVar, dVar));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> m(u10.f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().c(fVar, d10.d.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<? extends w00.i0> n(u10.f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().a(fVar, d10.d.FOR_NON_TRACKED_SCOPE));
        }

        private d20.h o() {
            d20.h m11 = this.f58841e.mo234i().a().iterator().next().m();
            if (m11 == null) {
                h(9);
            }
            return m11;
        }

        private <D extends kotlin.reflect.jvm.internal.impl.descriptors.b> Collection<? extends D> p(u10.f fVar, Collection<? extends D> collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w10.j.f55379d.w(fVar, collection, Collections.emptySet(), this.f58841e, new d(this, linkedHashSet));
            return linkedHashSet;
        }

        @Override // d20.i, d20.h
        public Collection<? extends w00.i0> a(u10.f fVar, d10.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            Collection<? extends w00.i0> mo12invoke = this.f58839c.mo12invoke(fVar);
            if (mo12invoke == null) {
                h(3);
            }
            return mo12invoke;
        }

        @Override // d20.i, d20.h
        public Set<u10.f> b() {
            Set<u10.f> set = (Set) this.f58841e.f58836k.mo11invoke();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // d20.i, d20.h
        public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f fVar, d10.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> mo12invoke = this.f58838b.mo12invoke(fVar);
            if (mo12invoke == null) {
                h(7);
            }
            return mo12invoke;
        }

        @Override // d20.i, d20.h
        public Set<u10.f> d() {
            Set<u10.f> set = (Set) this.f58841e.f58836k.mo11invoke();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // d20.i, d20.h
        public Set<u10.f> f() {
            Set<u10.f> emptySet = Collections.emptySet();
            if (emptySet == null) {
                h(18);
            }
            return emptySet;
        }

        @Override // d20.i, d20.k
        public Collection<w00.i> g(d20.d dVar, h00.l<? super u10.f, Boolean> lVar) {
            if (dVar == null) {
                h(13);
            }
            if (lVar == null) {
                h(14);
            }
            Collection<w00.i> mo11invoke = this.f58840d.mo11invoke();
            if (mo11invoke == null) {
                h(15);
            }
            return mo11invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private n(j20.n nVar, w00.c cVar, k20.d0 d0Var, u10.f fVar, j20.i<Set<u10.f>> iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, w00.n0 n0Var) {
        super(nVar, cVar, fVar, n0Var, false);
        if (nVar == null) {
            d0(6);
        }
        if (cVar == null) {
            d0(7);
        }
        if (d0Var == null) {
            d0(8);
        }
        if (fVar == null) {
            d0(9);
        }
        if (iVar == null) {
            d0(10);
        }
        if (gVar == null) {
            d0(11);
        }
        if (n0Var == null) {
            d0(12);
        }
        this.f58837l = gVar;
        this.f58834i = new k20.j(this, Collections.emptyList(), Collections.singleton(d0Var), nVar);
        this.f58835j = new a(this, nVar);
        this.f58836k = iVar;
    }

    public static n H0(j20.n nVar, w00.c cVar, u10.f fVar, j20.i<Set<u10.f>> iVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, w00.n0 n0Var) {
        if (nVar == null) {
            d0(0);
        }
        if (cVar == null) {
            d0(1);
        }
        if (fVar == null) {
            d0(2);
        }
        if (iVar == null) {
            d0(3);
        }
        if (gVar == null) {
            d0(4);
        }
        if (n0Var == null) {
            d0(5);
        }
        return new n(nVar, cVar, cVar.n(), fVar, iVar, gVar, n0Var);
    }

    private static /* synthetic */ void d0(int i11) {
        String str;
        int i12;
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i12 = 2;
                break;
            default:
                i12 = 3;
                break;
        }
        Object[] objArr = new Object[i12];
        switch (i11) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i11) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i11) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String format = String.format(str, objArr);
        switch (i11) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // w00.c
    public w00.b B() {
        return null;
    }

    @Override // w00.c
    public boolean C0() {
        return false;
    }

    @Override // y00.t
    /* renamed from: M */
    public d20.h mo233M(kotlin.reflect.jvm.internal.impl.types.checker.h hVar) {
        if (hVar == null) {
            d0(13);
        }
        d20.h hVar2 = this.f58835j;
        if (hVar2 == null) {
            d0(14);
        }
        return hVar2;
    }

    @Override // w00.u
    public boolean W() {
        return false;
    }

    @Override // w00.c
    public boolean X() {
        return false;
    }

    @Override // w00.c
    public boolean a0() {
        return false;
    }

    @Override // w00.c
    public boolean f0() {
        return false;
    }

    @Override // w00.c
    /* renamed from: g */
    public Collection<w00.b> mo224g() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            d0(16);
        }
        return emptyList;
    }

    @Override // w00.u
    public boolean g0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    /* renamed from: getAnnotations */
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g mo140getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar = this.f58837l;
        if (gVar == null) {
            d0(21);
        }
        return gVar;
    }

    @Override // w00.c
    public kotlin.reflect.jvm.internal.impl.descriptors.c getKind() {
        kotlin.reflect.jvm.internal.impl.descriptors.c cVar = kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_ENTRY;
        if (cVar == null) {
            d0(18);
        }
        return cVar;
    }

    @Override // w00.c, w00.m, w00.u
    public w00.q getVisibility() {
        w00.q qVar = w00.p.f55309e;
        if (qVar == null) {
            d0(20);
        }
        return qVar;
    }

    @Override // w00.c
    /* renamed from: h0 */
    public d20.h mo138h0() {
        h.b bVar = h.b.f23482b;
        if (bVar == null) {
            d0(15);
        }
        return bVar;
    }

    @Override // w00.e
    /* renamed from: i */
    public w0 mo234i() {
        w0 w0Var = this.f58834i;
        if (w0Var == null) {
            d0(17);
        }
        return w0Var;
    }

    @Override // w00.c
    public w00.c i0() {
        return null;
    }

    @Override // w00.c
    public boolean isInline() {
        return false;
    }

    @Override // w00.f
    public boolean j() {
        return false;
    }

    @Override // w00.c, w00.f
    public List<s0> o() {
        List<s0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            d0(22);
        }
        return emptyList;
    }

    @Override // w00.c, w00.u
    public kotlin.reflect.jvm.internal.impl.descriptors.f p() {
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = kotlin.reflect.jvm.internal.impl.descriptors.f.FINAL;
        if (fVar == null) {
            d0(19);
        }
        return fVar;
    }

    @Override // w00.c
    public w00.t<k20.k0> t() {
        return null;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // w00.c
    /* renamed from: x */
    public Collection<w00.c> mo225x() {
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            d0(23);
        }
        return emptyList;
    }
}