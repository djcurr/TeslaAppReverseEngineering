package p4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p4.p;

/* loaded from: classes.dex */
public class r extends p implements Iterable<p>, i00.a {

    /* renamed from: o  reason: collision with root package name */
    public static final a f46137o = new a(null);

    /* renamed from: k  reason: collision with root package name */
    private final androidx.collection.h<p> f46138k;

    /* renamed from: l  reason: collision with root package name */
    private int f46139l;

    /* renamed from: m  reason: collision with root package name */
    private String f46140m;

    /* renamed from: n  reason: collision with root package name */
    private String f46141n;

    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: p4.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0984a extends kotlin.jvm.internal.u implements h00.l<p, p> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0984a f46142a = new C0984a();

            C0984a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final p invoke(p it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                if (it2 instanceof r) {
                    r rVar = (r) it2;
                    return rVar.z(rVar.F());
                }
                return null;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a(r rVar) {
            u20.h k11;
            kotlin.jvm.internal.s.g(rVar, "<this>");
            k11 = u20.n.k(rVar.z(rVar.F()), C0984a.f46142a);
            return (p) u20.k.z(k11);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Iterator<p>, i00.a {

        /* renamed from: a  reason: collision with root package name */
        private int f46143a = -1;

        /* renamed from: b  reason: collision with root package name */
        private boolean f46144b;

        b() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public p next() {
            if (hasNext()) {
                this.f46144b = true;
                androidx.collection.h<p> D = r.this.D();
                int i11 = this.f46143a + 1;
                this.f46143a = i11;
                p q11 = D.q(i11);
                kotlin.jvm.internal.s.f(q11, "nodes.valueAt(++index)");
                return q11;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f46143a + 1 < r.this.D().p();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f46144b) {
                androidx.collection.h<p> D = r.this.D();
                D.q(this.f46143a).u(null);
                D.n(this.f46143a);
                this.f46143a--;
                this.f46144b = false;
                return;
            }
            throw new IllegalStateException("You must call next() before you can remove an element".toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b0<? extends r> navGraphNavigator) {
        super(navGraphNavigator);
        kotlin.jvm.internal.s.g(navGraphNavigator, "navGraphNavigator");
        this.f46138k = new androidx.collection.h<>();
    }

    private final void K(int i11) {
        if (i11 != m()) {
            if (this.f46141n != null) {
                L(null);
            }
            this.f46139l = i11;
            this.f46140m = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i11 + " cannot use the same id as the graph " + this).toString());
    }

    private final void L(String str) {
        boolean w11;
        int hashCode;
        if (str == null) {
            hashCode = 0;
        } else if (!kotlin.jvm.internal.s.c(str, p())) {
            w11 = kotlin.text.v.w(str);
            if (!w11) {
                hashCode = p.f46114j.a(str).hashCode();
            } else {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
        } else {
            throw new IllegalArgumentException(("Start destination " + ((Object) str) + " cannot use the same route as the graph " + this).toString());
        }
        this.f46139l = hashCode;
        this.f46141n = str;
    }

    public final p A(int i11, boolean z11) {
        p g11 = this.f46138k.g(i11);
        if (g11 == null) {
            if (!z11 || o() == null) {
                return null;
            }
            r o11 = o();
            kotlin.jvm.internal.s.e(o11);
            return o11.z(i11);
        }
        return g11;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0014 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p4.p B(java.lang.String r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto Lc
            boolean r1 = kotlin.text.m.w(r3)
            if (r1 == 0) goto La
            goto Lc
        La:
            r1 = 0
            goto Ld
        Lc:
            r1 = r0
        Ld:
            if (r1 != 0) goto L14
            p4.p r3 = r2.C(r3, r0)
            goto L15
        L14:
            r3 = 0
        L15:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.r.B(java.lang.String):p4.p");
    }

    public final p C(String route, boolean z11) {
        kotlin.jvm.internal.s.g(route, "route");
        p g11 = this.f46138k.g(p.f46114j.a(route).hashCode());
        if (g11 == null) {
            if (!z11 || o() == null) {
                return null;
            }
            r o11 = o();
            kotlin.jvm.internal.s.e(o11);
            return o11.B(route);
        }
        return g11;
    }

    public final androidx.collection.h<p> D() {
        return this.f46138k;
    }

    public final String E() {
        if (this.f46140m == null) {
            String str = this.f46141n;
            if (str == null) {
                str = String.valueOf(this.f46139l);
            }
            this.f46140m = str;
        }
        String str2 = this.f46140m;
        kotlin.jvm.internal.s.e(str2);
        return str2;
    }

    public final int F() {
        return this.f46139l;
    }

    public final String G() {
        return this.f46141n;
    }

    public final void H(int i11) {
        K(i11);
    }

    public final void I(String startDestRoute) {
        kotlin.jvm.internal.s.g(startDestRoute, "startDestRoute");
        L(startDestRoute);
    }

    @Override // p4.p
    public boolean equals(Object obj) {
        u20.h c11;
        List J;
        if (obj == null || !(obj instanceof r)) {
            return false;
        }
        c11 = u20.n.c(androidx.collection.i.a(this.f46138k));
        J = u20.p.J(c11);
        r rVar = (r) obj;
        Iterator a11 = androidx.collection.i.a(rVar.f46138k);
        while (a11.hasNext()) {
            J.remove((p) a11.next());
        }
        return super.equals(obj) && this.f46138k.p() == rVar.f46138k.p() && F() == rVar.F() && J.isEmpty();
    }

    @Override // p4.p
    public int hashCode() {
        int F = F();
        androidx.collection.h<p> hVar = this.f46138k;
        int p11 = hVar.p();
        for (int i11 = 0; i11 < p11; i11++) {
            F = (((F * 31) + hVar.k(i11)) * 31) + hVar.q(i11).hashCode();
        }
        return F;
    }

    @Override // java.lang.Iterable
    public final Iterator<p> iterator() {
        return new b();
    }

    @Override // p4.p
    public String k() {
        return m() != 0 ? super.k() : "the root navigation";
    }

    @Override // p4.p
    public p.b q(o navDeepLinkRequest) {
        List n11;
        kotlin.jvm.internal.s.g(navDeepLinkRequest, "navDeepLinkRequest");
        p.b q11 = super.q(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<p> it2 = iterator();
        while (it2.hasNext()) {
            p.b q12 = it2.next().q(navDeepLinkRequest);
            if (q12 != null) {
                arrayList.add(q12);
            }
        }
        n11 = wz.w.n(q11, (p.b) wz.u.r0(arrayList));
        return (p.b) wz.u.r0(n11);
    }

    @Override // p4.p
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        p B = B(this.f46141n);
        if (B == null) {
            B = z(F());
        }
        sb2.append(" startDestination=");
        if (B == null) {
            String str = this.f46141n;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.f46140m;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append(kotlin.jvm.internal.s.p("0x", Integer.toHexString(this.f46139l)));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(B.toString());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.s.f(sb3, "sb.toString()");
        return sb3;
    }

    public final void x(p node) {
        kotlin.jvm.internal.s.g(node, "node");
        int m11 = node.m();
        String p11 = node.p();
        if ((m11 == 0 && p11 == null) ? false : true) {
            if (p() != null && !(!kotlin.jvm.internal.s.c(p11, p()))) {
                throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
            }
            if (m11 != m()) {
                p g11 = this.f46138k.g(m11);
                if (g11 == node) {
                    return;
                }
                if (node.o() == null) {
                    if (g11 != null) {
                        g11.u(null);
                    }
                    node.u(this);
                    this.f46138k.l(node.m(), node);
                    return;
                }
                throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
            }
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
    }

    public final void y(Collection<? extends p> nodes) {
        kotlin.jvm.internal.s.g(nodes, "nodes");
        for (p pVar : nodes) {
            if (pVar != null) {
                x(pVar);
            }
        }
    }

    public final p z(int i11) {
        return A(i11, true);
    }
}