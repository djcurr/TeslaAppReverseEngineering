package l2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f implements Comparable<f> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f36395e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static b f36396f = b.Stripe;

    /* renamed from: a  reason: collision with root package name */
    private final h2.k f36397a;

    /* renamed from: b  reason: collision with root package name */
    private final h2.k f36398b;

    /* renamed from: c  reason: collision with root package name */
    private final s1.h f36399c;

    /* renamed from: d  reason: collision with root package name */
    private final x2.q f36400d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(b bVar) {
            kotlin.jvm.internal.s.g(bVar, "<set-?>");
            f.f36396f = bVar;
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        Stripe,
        Location
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<h2.k, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s1.h f36401a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(s1.h hVar) {
            super(1);
            this.f36401a = hVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(h2.k it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            h2.o e11 = w.e(it2);
            return Boolean.valueOf(e11.h() && !kotlin.jvm.internal.s.c(this.f36401a, f2.p.b(e11)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.l<h2.k, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s1.h f36402a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(s1.h hVar) {
            super(1);
            this.f36402a = hVar;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean invoke(h2.k it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            h2.o e11 = w.e(it2);
            return Boolean.valueOf(e11.h() && !kotlin.jvm.internal.s.c(this.f36402a, f2.p.b(e11)));
        }
    }

    public f(h2.k subtreeRoot, h2.k node) {
        kotlin.jvm.internal.s.g(subtreeRoot, "subtreeRoot");
        kotlin.jvm.internal.s.g(node, "node");
        this.f36397a = subtreeRoot;
        this.f36398b = node;
        this.f36400d = subtreeRoot.getLayoutDirection();
        h2.o P = subtreeRoot.P();
        h2.o e11 = w.e(node);
        s1.h hVar = null;
        if (P.h() && e11.h()) {
            hVar = o.a.a(P, e11, false, 2, null);
        }
        this.f36399c = hVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(f other) {
        kotlin.jvm.internal.s.g(other, "other");
        s1.h hVar = this.f36399c;
        if (hVar == null) {
            return 1;
        }
        if (other.f36399c == null) {
            return -1;
        }
        if (f36396f == b.Stripe) {
            if (hVar.e() - other.f36399c.l() <= BitmapDescriptorFactory.HUE_RED) {
                return -1;
            }
            if (this.f36399c.l() - other.f36399c.e() >= BitmapDescriptorFactory.HUE_RED) {
                return 1;
            }
        }
        if (this.f36400d == x2.q.Ltr) {
            int i11 = ((this.f36399c.i() - other.f36399c.i()) > BitmapDescriptorFactory.HUE_RED ? 1 : ((this.f36399c.i() - other.f36399c.i()) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            if (!(i11 == 0)) {
                return i11 < 0 ? -1 : 1;
            }
        } else {
            int i12 = ((this.f36399c.j() - other.f36399c.j()) > BitmapDescriptorFactory.HUE_RED ? 1 : ((this.f36399c.j() - other.f36399c.j()) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            if (!(i12 == 0)) {
                return i12 < 0 ? 1 : -1;
            }
        }
        int i13 = ((this.f36399c.l() - other.f36399c.l()) > BitmapDescriptorFactory.HUE_RED ? 1 : ((this.f36399c.l() - other.f36399c.l()) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (!(i13 == 0)) {
            return i13 < 0 ? -1 : 1;
        }
        int i14 = ((this.f36399c.h() - other.f36399c.h()) > BitmapDescriptorFactory.HUE_RED ? 1 : ((this.f36399c.h() - other.f36399c.h()) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (!(i14 == 0)) {
            return i14 < 0 ? 1 : -1;
        }
        int i15 = ((this.f36399c.n() - other.f36399c.n()) > BitmapDescriptorFactory.HUE_RED ? 1 : ((this.f36399c.n() - other.f36399c.n()) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (!(i15 == 0)) {
            return i15 < 0 ? 1 : -1;
        }
        s1.h b11 = f2.p.b(w.e(this.f36398b));
        s1.h b12 = f2.p.b(w.e(other.f36398b));
        h2.k a11 = w.a(this.f36398b, new c(b11));
        h2.k a12 = w.a(other.f36398b, new d(b12));
        if (a11 == null || a12 == null) {
            return a11 != null ? 1 : -1;
        }
        return new f(this.f36397a, a11).compareTo(new f(other.f36397a, a12));
    }

    public final h2.k c() {
        return this.f36398b;
    }
}