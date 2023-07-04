package x1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import t1.a0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f56660a;

    /* renamed from: b  reason: collision with root package name */
    private final float f56661b;

    /* renamed from: c  reason: collision with root package name */
    private final float f56662c;

    /* renamed from: d  reason: collision with root package name */
    private final float f56663d;

    /* renamed from: e  reason: collision with root package name */
    private final float f56664e;

    /* renamed from: f  reason: collision with root package name */
    private final o f56665f;

    /* renamed from: g  reason: collision with root package name */
    private final long f56666g;

    /* renamed from: h  reason: collision with root package name */
    private final int f56667h;

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b(null);
    }

    private c(String str, float f11, float f12, float f13, float f14, o oVar, long j11, int i11) {
        this.f56660a = str;
        this.f56661b = f11;
        this.f56662c = f12;
        this.f56663d = f13;
        this.f56664e = f14;
        this.f56665f = oVar;
        this.f56666g = j11;
        this.f56667h = i11;
    }

    public /* synthetic */ c(String str, float f11, float f12, float f13, float f14, o oVar, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f11, f12, f13, f14, oVar, j11, i11);
    }

    public final float a() {
        return this.f56662c;
    }

    public final float b() {
        return this.f56661b;
    }

    public final String c() {
        return this.f56660a;
    }

    public final o d() {
        return this.f56665f;
    }

    public final int e() {
        return this.f56667h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (kotlin.jvm.internal.s.c(this.f56660a, cVar.f56660a) && x2.g.h(b(), cVar.b()) && x2.g.h(a(), cVar.a())) {
                if (this.f56663d == cVar.f56663d) {
                    return ((this.f56664e > cVar.f56664e ? 1 : (this.f56664e == cVar.f56664e ? 0 : -1)) == 0) && kotlin.jvm.internal.s.c(this.f56665f, cVar.f56665f) && a0.n(f(), cVar.f()) && t1.p.E(e(), cVar.e());
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final long f() {
        return this.f56666g;
    }

    public final float g() {
        return this.f56664e;
    }

    public final float h() {
        return this.f56663d;
    }

    public int hashCode() {
        return (((((((((((((this.f56660a.hashCode() * 31) + x2.g.i(b())) * 31) + x2.g.i(a())) * 31) + Float.hashCode(this.f56663d)) * 31) + Float.hashCode(this.f56664e)) * 31) + this.f56665f.hashCode()) * 31) + a0.t(f())) * 31) + t1.p.F(e());
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f56668a;

        /* renamed from: b  reason: collision with root package name */
        private final float f56669b;

        /* renamed from: c  reason: collision with root package name */
        private final float f56670c;

        /* renamed from: d  reason: collision with root package name */
        private final float f56671d;

        /* renamed from: e  reason: collision with root package name */
        private final float f56672e;

        /* renamed from: f  reason: collision with root package name */
        private final long f56673f;

        /* renamed from: g  reason: collision with root package name */
        private final int f56674g;

        /* renamed from: h  reason: collision with root package name */
        private final ArrayList<C1296a> f56675h;

        /* renamed from: i  reason: collision with root package name */
        private C1296a f56676i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f56677j;

        private a(String str, float f11, float f12, float f13, float f14, long j11, int i11) {
            this.f56668a = str;
            this.f56669b = f11;
            this.f56670c = f12;
            this.f56671d = f13;
            this.f56672e = f14;
            this.f56673f = j11;
            this.f56674g = i11;
            ArrayList<C1296a> b11 = i.b(null, 1, null);
            this.f56675h = b11;
            C1296a c1296a = new C1296a(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, 1023, null);
            this.f56676i = c1296a;
            i.f(b11, c1296a);
        }

        public /* synthetic */ a(String str, float f11, float f12, float f13, float f14, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f11, f12, f13, f14, j11, i11);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a b(a aVar, String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, int i11, Object obj) {
            String str2 = (i11 & 1) != 0 ? "" : str;
            int i12 = i11 & 2;
            float f18 = BitmapDescriptorFactory.HUE_RED;
            float f19 = i12 != 0 ? 0.0f : f11;
            float f21 = (i11 & 4) != 0 ? 0.0f : f12;
            float f22 = (i11 & 8) != 0 ? 0.0f : f13;
            float f23 = (i11 & 16) != 0 ? 1.0f : f14;
            float f24 = (i11 & 32) == 0 ? f15 : 1.0f;
            float f25 = (i11 & 64) != 0 ? 0.0f : f16;
            if ((i11 & 128) == 0) {
                f18 = f17;
            }
            return aVar.a(str2, f19, f21, f22, f23, f24, f25, f18, (i11 & 256) != 0 ? p.e() : list);
        }

        public static /* synthetic */ a d(a aVar, List list, int i11, String str, t1.s sVar, float f11, t1.s sVar2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17, int i14, Object obj) {
            int b11 = (i14 & 2) != 0 ? p.b() : i11;
            String str2 = (i14 & 4) != 0 ? "" : str;
            t1.s sVar3 = (i14 & 8) != 0 ? null : sVar;
            float f18 = (i14 & 16) != 0 ? 1.0f : f11;
            t1.s sVar4 = (i14 & 32) == 0 ? sVar2 : null;
            float f19 = (i14 & 64) != 0 ? 1.0f : f12;
            int i15 = i14 & 128;
            float f21 = BitmapDescriptorFactory.HUE_RED;
            float f22 = i15 != 0 ? 0.0f : f13;
            int c11 = (i14 & 256) != 0 ? p.c() : i12;
            int d11 = (i14 & 512) != 0 ? p.d() : i13;
            float f23 = (i14 & 1024) != 0 ? 4.0f : f14;
            float f24 = (i14 & 2048) != 0 ? 0.0f : f15;
            float f25 = (i14 & 4096) == 0 ? f16 : 1.0f;
            if ((i14 & PKIFailureInfo.certRevoked) == 0) {
                f21 = f17;
            }
            return aVar.c(list, b11, str2, sVar3, f18, sVar4, f19, f22, c11, d11, f23, f24, f25, f21);
        }

        private final o e(C1296a c1296a) {
            return new o(c1296a.c(), c1296a.f(), c1296a.d(), c1296a.e(), c1296a.g(), c1296a.h(), c1296a.i(), c1296a.j(), c1296a.b(), c1296a.a());
        }

        private final void h() {
            if (!(!this.f56677j)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        private final C1296a i() {
            return (C1296a) i.d(this.f56675h);
        }

        public final a a(String name, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List<? extends f> clipPathData) {
            kotlin.jvm.internal.s.g(name, "name");
            kotlin.jvm.internal.s.g(clipPathData, "clipPathData");
            h();
            i.f(this.f56675h, new C1296a(name, f11, f12, f13, f14, f15, f16, f17, clipPathData, null, 512, null));
            return this;
        }

        public final a c(List<? extends f> pathData, int i11, String name, t1.s sVar, float f11, t1.s sVar2, float f12, float f13, int i12, int i13, float f14, float f15, float f16, float f17) {
            kotlin.jvm.internal.s.g(pathData, "pathData");
            kotlin.jvm.internal.s.g(name, "name");
            h();
            i().a().add(new t(name, pathData, i11, sVar, f11, sVar2, f12, f13, i12, i13, f14, f15, f16, f17, null));
            return this;
        }

        public final c f() {
            h();
            while (i.c(this.f56675h) > 1) {
                g();
            }
            c cVar = new c(this.f56668a, this.f56669b, this.f56670c, this.f56671d, this.f56672e, e(this.f56676i), this.f56673f, this.f56674g, null);
            this.f56677j = true;
            return cVar;
        }

        public final a g() {
            h();
            i().a().add(e((C1296a) i.e(this.f56675h)));
            return this;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x1.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1296a {

            /* renamed from: a  reason: collision with root package name */
            private String f56678a;

            /* renamed from: b  reason: collision with root package name */
            private float f56679b;

            /* renamed from: c  reason: collision with root package name */
            private float f56680c;

            /* renamed from: d  reason: collision with root package name */
            private float f56681d;

            /* renamed from: e  reason: collision with root package name */
            private float f56682e;

            /* renamed from: f  reason: collision with root package name */
            private float f56683f;

            /* renamed from: g  reason: collision with root package name */
            private float f56684g;

            /* renamed from: h  reason: collision with root package name */
            private float f56685h;

            /* renamed from: i  reason: collision with root package name */
            private List<? extends f> f56686i;

            /* renamed from: j  reason: collision with root package name */
            private List<q> f56687j;

            public C1296a() {
                this(null, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, null, 1023, null);
            }

            public C1296a(String name, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List<? extends f> clipPathData, List<q> children) {
                kotlin.jvm.internal.s.g(name, "name");
                kotlin.jvm.internal.s.g(clipPathData, "clipPathData");
                kotlin.jvm.internal.s.g(children, "children");
                this.f56678a = name;
                this.f56679b = f11;
                this.f56680c = f12;
                this.f56681d = f13;
                this.f56682e = f14;
                this.f56683f = f15;
                this.f56684g = f16;
                this.f56685h = f17;
                this.f56686i = clipPathData;
                this.f56687j = children;
            }

            public final List<q> a() {
                return this.f56687j;
            }

            public final List<f> b() {
                return this.f56686i;
            }

            public final String c() {
                return this.f56678a;
            }

            public final float d() {
                return this.f56680c;
            }

            public final float e() {
                return this.f56681d;
            }

            public final float f() {
                return this.f56679b;
            }

            public final float g() {
                return this.f56682e;
            }

            public final float h() {
                return this.f56683f;
            }

            public final float i() {
                return this.f56684g;
            }

            public final float j() {
                return this.f56685h;
            }

            public /* synthetic */ C1296a(String str, float f11, float f12, float f13, float f14, float f15, float f16, float f17, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0.0f : f11, (i11 & 4) != 0 ? 0.0f : f12, (i11 & 8) != 0 ? 0.0f : f13, (i11 & 16) != 0 ? 1.0f : f14, (i11 & 32) == 0 ? f15 : 1.0f, (i11 & 64) != 0 ? 0.0f : f16, (i11 & 128) == 0 ? f17 : BitmapDescriptorFactory.HUE_RED, (i11 & 256) != 0 ? p.e() : list, (i11 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ a(String str, float f11, float f12, float f13, float f14, long j11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? "" : str, f11, f12, f13, f14, (i12 & 32) != 0 ? a0.f51365b.f() : j11, (i12 & 64) != 0 ? t1.p.f51470a.z() : i11, null);
        }
    }
}