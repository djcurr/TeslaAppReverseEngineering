package p20;

import java.util.Collection;
import java.util.List;
import k20.d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.util.Check;
import p20.f;
import p20.k;
import p20.l;
import w00.l0;
import wz.w;

/* loaded from: classes5.dex */
public final class i extends p20.a {

    /* renamed from: a  reason: collision with root package name */
    public static final i f45917a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final List<d> f45918b;

    /* loaded from: classes5.dex */
    static final class a extends u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.e, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f45919a = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
            if ((!a20.a.a(r4) && r4.q0() == null) == true) goto L4;
         */
        @Override // h00.l
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String mo12invoke(kotlin.reflect.jvm.internal.impl.descriptors.e r4) {
            /*
                r3 = this;
                java.lang.String r0 = "$this$$receiver"
                kotlin.jvm.internal.s.g(r4, r0)
                java.util.List r4 = r4.h()
                java.lang.String r0 = "valueParameters"
                kotlin.jvm.internal.s.f(r4, r0)
                java.lang.Object r4 = wz.u.p0(r4)
                w00.v0 r4 = (w00.v0) r4
                r0 = 1
                r1 = 0
                if (r4 != 0) goto L1a
            L18:
                r0 = r1
                goto L2b
            L1a:
                boolean r2 = a20.a.a(r4)
                if (r2 != 0) goto L28
                k20.d0 r4 = r4.q0()
                if (r4 != 0) goto L28
                r4 = r0
                goto L29
            L28:
                r4 = r1
            L29:
                if (r4 != r0) goto L18
            L2b:
                p20.i r4 = p20.i.f45917a
                if (r0 != 0) goto L32
                java.lang.String r4 = "last parameter should not have a default value or be a vararg"
                goto L33
            L32:
                r4 = 0
            L33:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p20.i.a.mo12invoke(kotlin.reflect.jvm.internal.impl.descriptors.e):java.lang.String");
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.e, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f45920a = new b();

        b() {
            super(1);
        }

        private static final boolean b(w00.i iVar) {
            return (iVar instanceof w00.c) && t00.h.a0((w00.c) iVar);
        }

        @Override // h00.l
        /* renamed from: a */
        public final String mo12invoke(kotlin.reflect.jvm.internal.impl.descriptors.e $receiver) {
            boolean z11;
            s.g($receiver, "$this$$receiver");
            i iVar = i.f45917a;
            w00.i containingDeclaration = $receiver.mo223b();
            s.f(containingDeclaration, "containingDeclaration");
            boolean z12 = true;
            if (!b(containingDeclaration)) {
                Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> overriddenDescriptors = $receiver.d();
                s.f(overriddenDescriptors, "overriddenDescriptors");
                if (!overriddenDescriptors.isEmpty()) {
                    for (kotlin.reflect.jvm.internal.impl.descriptors.e eVar : overriddenDescriptors) {
                        w00.i mo223b = eVar.mo223b();
                        s.f(mo223b, "it.containingDeclaration");
                        if (b(mo223b)) {
                            z11 = true;
                            break;
                        }
                    }
                }
                z11 = false;
                if (!z11) {
                    z12 = false;
                }
            }
            if (z12) {
                return null;
            }
            return "must override ''equals()'' in Any";
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends u implements h00.l<kotlin.reflect.jvm.internal.impl.descriptors.e, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f45921a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final String mo12invoke(kotlin.reflect.jvm.internal.impl.descriptors.e $receiver) {
            boolean m11;
            s.g($receiver, "$this$$receiver");
            l0 J = $receiver.J();
            if (J == null) {
                J = $receiver.N();
            }
            i iVar = i.f45917a;
            boolean z11 = false;
            if (J != null) {
                d0 returnType = $receiver.getReturnType();
                if (returnType == null) {
                    m11 = false;
                } else {
                    d0 type = J.getType();
                    s.f(type, "receiver.type");
                    m11 = n20.a.m(returnType, type);
                }
                if (m11) {
                    z11 = true;
                }
            }
            if (z11) {
                return null;
            }
            return "receiver must be a supertype of the return type";
        }
    }

    static {
        List l11;
        List<d> l12;
        u10.f fVar = j.f45930i;
        f.b bVar = f.b.f45913b;
        p20.b[] bVarArr = {bVar, new l.a(1)};
        u10.f fVar2 = j.f45931j;
        p20.b[] bVarArr2 = {bVar, new l.a(2)};
        u10.f fVar3 = j.f45922a;
        h hVar = h.f45915a;
        e eVar = e.f45909a;
        u10.f fVar4 = j.f45927f;
        l.d dVar = l.d.f45961b;
        k.a aVar = k.a.f45951d;
        u10.f fVar5 = j.f45929h;
        l.c cVar = l.c.f45960b;
        l11 = w.l(j.f45935n, j.f45936o);
        l12 = w.l(new d(fVar, bVarArr, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(fVar2, (Check[]) bVarArr2, (h00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String>) a.f45919a), new d(fVar3, new p20.b[]{bVar, hVar, new l.a(2), eVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(j.f45923b, new p20.b[]{bVar, hVar, new l.a(3), eVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(j.f45924c, new p20.b[]{bVar, hVar, new l.b(2), eVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(j.f45928g, new p20.b[]{bVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(fVar4, new p20.b[]{bVar, dVar, hVar, aVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(fVar5, new p20.b[]{bVar, cVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(j.f45932k, new p20.b[]{bVar, cVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(j.f45933l, new p20.b[]{bVar, cVar, aVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(j.f45946y, new p20.b[]{bVar, dVar, hVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(j.f45925d, (Check[]) new p20.b[]{f.a.f45912b}, (h00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String>) b.f45920a), new d(j.f45926e, new p20.b[]{bVar, k.b.f45953d, dVar, hVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(j.H, new p20.b[]{bVar, dVar, hVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(j.G, new p20.b[]{bVar, cVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d((Collection<u10.f>) l11, (Check[]) new p20.b[]{bVar}, (h00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String>) c.f45921a), new d(j.I, new p20.b[]{bVar, k.c.f45955d, dVar, hVar}, (h00.l) null, 4, (DefaultConstructorMarker) null), new d(j.f45934m, new p20.b[]{bVar, cVar}, (h00.l) null, 4, (DefaultConstructorMarker) null));
        f45918b = l12;
    }

    private i() {
    }

    @Override // p20.a
    public List<d> b() {
        return f45918b;
    }
}