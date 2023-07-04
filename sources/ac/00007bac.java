package jf;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.x;
import hf.i;
import hf.s;
import hf.t;
import hf.w;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import jf.k;
import vd.b;

/* loaded from: classes3.dex */
public class i implements j {
    private static c I = new c(null);
    private final k A;
    private final boolean B;
    private final id.a C;
    private final kf.a D;
    private final s<gd.d, nf.c> E;
    private final s<gd.d, PooledByteBuffer> F;
    private final kd.f G;
    private final hf.a H;

    /* renamed from: a  reason: collision with root package name */
    private final md.n<t> f33491a;

    /* renamed from: b  reason: collision with root package name */
    private final s.a f33492b;

    /* renamed from: c  reason: collision with root package name */
    private final i.b<gd.d> f33493c;

    /* renamed from: d  reason: collision with root package name */
    private final hf.f f33494d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f33495e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f33496f;

    /* renamed from: g  reason: collision with root package name */
    private final g f33497g;

    /* renamed from: h  reason: collision with root package name */
    private final md.n<t> f33498h;

    /* renamed from: i  reason: collision with root package name */
    private final f f33499i;

    /* renamed from: j  reason: collision with root package name */
    private final hf.o f33500j;

    /* renamed from: k  reason: collision with root package name */
    private final lf.b f33501k;

    /* renamed from: l  reason: collision with root package name */
    private final uf.d f33502l;

    /* renamed from: m  reason: collision with root package name */
    private final Integer f33503m;

    /* renamed from: n  reason: collision with root package name */
    private final md.n<Boolean> f33504n;

    /* renamed from: o  reason: collision with root package name */
    private final hd.c f33505o;

    /* renamed from: p  reason: collision with root package name */
    private final pd.c f33506p;

    /* renamed from: q  reason: collision with root package name */
    private final int f33507q;

    /* renamed from: r  reason: collision with root package name */
    private final k0 f33508r;

    /* renamed from: s  reason: collision with root package name */
    private final int f33509s;

    /* renamed from: t  reason: collision with root package name */
    private final qf.t f33510t;

    /* renamed from: u  reason: collision with root package name */
    private final lf.d f33511u;

    /* renamed from: v  reason: collision with root package name */
    private final Set<pf.e> f33512v;

    /* renamed from: w  reason: collision with root package name */
    private final Set<pf.d> f33513w;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f33514x;

    /* renamed from: y  reason: collision with root package name */
    private final hd.c f33515y;

    /* renamed from: z  reason: collision with root package name */
    private final lf.c f33516z;

    /* loaded from: classes3.dex */
    class a implements md.n<Boolean> {
        a(i iVar) {
        }

        @Override // md.n
        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    public static class b {
        private lf.c A;
        private int B;
        private final k.b C;
        private boolean D;
        private id.a E;
        private kf.a F;
        private s<gd.d, nf.c> G;
        private s<gd.d, PooledByteBuffer> H;
        private kd.f I;
        private hf.a J;

        /* renamed from: a  reason: collision with root package name */
        private Bitmap.Config f33517a;

        /* renamed from: b  reason: collision with root package name */
        private md.n<t> f33518b;

        /* renamed from: c  reason: collision with root package name */
        private i.b<gd.d> f33519c;

        /* renamed from: d  reason: collision with root package name */
        private s.a f33520d;

        /* renamed from: e  reason: collision with root package name */
        private hf.f f33521e;

        /* renamed from: f  reason: collision with root package name */
        private final Context f33522f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f33523g;

        /* renamed from: h  reason: collision with root package name */
        private md.n<t> f33524h;

        /* renamed from: i  reason: collision with root package name */
        private f f33525i;

        /* renamed from: j  reason: collision with root package name */
        private hf.o f33526j;

        /* renamed from: k  reason: collision with root package name */
        private lf.b f33527k;

        /* renamed from: l  reason: collision with root package name */
        private uf.d f33528l;

        /* renamed from: m  reason: collision with root package name */
        private Integer f33529m;

        /* renamed from: n  reason: collision with root package name */
        private md.n<Boolean> f33530n;

        /* renamed from: o  reason: collision with root package name */
        private hd.c f33531o;

        /* renamed from: p  reason: collision with root package name */
        private pd.c f33532p;

        /* renamed from: q  reason: collision with root package name */
        private Integer f33533q;

        /* renamed from: r  reason: collision with root package name */
        private k0 f33534r;

        /* renamed from: s  reason: collision with root package name */
        private gf.f f33535s;

        /* renamed from: t  reason: collision with root package name */
        private qf.t f33536t;

        /* renamed from: u  reason: collision with root package name */
        private lf.d f33537u;

        /* renamed from: v  reason: collision with root package name */
        private Set<pf.e> f33538v;

        /* renamed from: w  reason: collision with root package name */
        private Set<pf.d> f33539w;

        /* renamed from: x  reason: collision with root package name */
        private boolean f33540x;

        /* renamed from: y  reason: collision with root package name */
        private hd.c f33541y;

        /* renamed from: z  reason: collision with root package name */
        private g f33542z;

        /* synthetic */ b(Context context, a aVar) {
            this(context);
        }

        public i K() {
            return new i(this, null);
        }

        public b L(boolean z11) {
            this.f33523g = z11;
            return this;
        }

        public b M(k0 k0Var) {
            this.f33534r = k0Var;
            return this;
        }

        public b N(Set<pf.e> set) {
            this.f33538v = set;
            return this;
        }

        private b(Context context) {
            this.f33523g = false;
            this.f33529m = null;
            this.f33533q = null;
            this.f33540x = true;
            this.B = -1;
            this.C = new k.b(this);
            this.D = true;
            this.F = new kf.b();
            this.f33522f = (Context) md.k.g(context);
        }
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private boolean f33543a;

        /* synthetic */ c(a aVar) {
            this();
        }

        public boolean a() {
            return this.f33543a;
        }

        private c() {
            this.f33543a = false;
        }
    }

    /* synthetic */ i(b bVar, a aVar) {
        this(bVar);
    }

    public static c F() {
        return I;
    }

    private static hd.c G(Context context) {
        try {
            if (tf.b.d()) {
                tf.b.a("DiskCacheConfig.getDefaultMainDiskCacheConfig");
            }
            return hd.c.m(context).n();
        } finally {
            if (tf.b.d()) {
                tf.b.b();
            }
        }
    }

    private static uf.d H(b bVar) {
        if (bVar.f33528l == null || bVar.f33529m == null) {
            if (bVar.f33528l != null) {
                return bVar.f33528l;
            }
            return null;
        }
        throw new IllegalStateException("You can't define a custom ImageTranscoderFactory and provide an ImageTranscoderType");
    }

    private static int I(b bVar, k kVar) {
        if (bVar.f33533q != null) {
            return bVar.f33533q.intValue();
        }
        if (kVar.g() != 2 || Build.VERSION.SDK_INT < 27) {
            if (kVar.g() == 1) {
                return 1;
            }
            kVar.g();
            return 0;
        }
        return 2;
    }

    public static b J(Context context) {
        return new b(context, null);
    }

    private static void K(vd.b bVar, k kVar, vd.a aVar) {
        vd.c.f54477b = bVar;
        b.a n11 = kVar.n();
        if (n11 != null) {
            bVar.a(n11);
        }
        if (aVar != null) {
            bVar.c(aVar);
        }
    }

    @Override // jf.j
    public hf.o A() {
        return this.f33500j;
    }

    @Override // jf.j
    public pd.c B() {
        return this.f33506p;
    }

    @Override // jf.j
    public id.a C() {
        return this.C;
    }

    @Override // jf.j
    public k D() {
        return this.A;
    }

    @Override // jf.j
    public f E() {
        return this.f33499i;
    }

    @Override // jf.j
    public Set<pf.d> a() {
        return Collections.unmodifiableSet(this.f33513w);
    }

    @Override // jf.j
    public md.n<Boolean> b() {
        return this.f33504n;
    }

    @Override // jf.j
    public k0 c() {
        return this.f33508r;
    }

    @Override // jf.j
    public s<gd.d, PooledByteBuffer> d() {
        return this.F;
    }

    @Override // jf.j
    public hd.c e() {
        return this.f33505o;
    }

    @Override // jf.j
    public Set<pf.e> f() {
        return Collections.unmodifiableSet(this.f33512v);
    }

    @Override // jf.j
    public s.a g() {
        return this.f33492b;
    }

    @Override // jf.j
    public Context getContext() {
        return this.f33495e;
    }

    @Override // jf.j
    public lf.d h() {
        return this.f33511u;
    }

    @Override // jf.j
    public hd.c i() {
        return this.f33515y;
    }

    @Override // jf.j
    public i.b<gd.d> j() {
        return this.f33493c;
    }

    @Override // jf.j
    public boolean k() {
        return this.f33496f;
    }

    @Override // jf.j
    public kd.f l() {
        return this.G;
    }

    @Override // jf.j
    public Integer m() {
        return this.f33503m;
    }

    @Override // jf.j
    public uf.d n() {
        return this.f33502l;
    }

    @Override // jf.j
    public lf.c o() {
        return this.f33516z;
    }

    @Override // jf.j
    public boolean p() {
        return this.B;
    }

    @Override // jf.j
    public md.n<t> q() {
        return this.f33491a;
    }

    @Override // jf.j
    public lf.b r() {
        return this.f33501k;
    }

    @Override // jf.j
    public md.n<t> s() {
        return this.f33498h;
    }

    @Override // jf.j
    public qf.t t() {
        return this.f33510t;
    }

    @Override // jf.j
    public int u() {
        return this.f33507q;
    }

    @Override // jf.j
    public g v() {
        return this.f33497g;
    }

    @Override // jf.j
    public kf.a w() {
        return this.D;
    }

    @Override // jf.j
    public hf.a x() {
        return this.H;
    }

    @Override // jf.j
    public hf.f y() {
        return this.f33494d;
    }

    @Override // jf.j
    public boolean z() {
        return this.f33514x;
    }

    private i(b bVar) {
        md.n<t> nVar;
        hf.f fVar;
        hf.o oVar;
        pd.c cVar;
        qf.t tVar;
        vd.b i11;
        if (tf.b.d()) {
            tf.b.a("ImagePipelineConfig()");
        }
        k s11 = bVar.C.s();
        this.A = s11;
        if (bVar.f33518b != null) {
            nVar = bVar.f33518b;
        } else {
            nVar = new hf.j((ActivityManager) md.k.g(bVar.f33522f.getSystemService("activity")));
        }
        this.f33491a = nVar;
        this.f33492b = bVar.f33520d == null ? new hf.c() : bVar.f33520d;
        this.f33493c = bVar.f33519c;
        if (bVar.f33517a == null) {
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
        } else {
            Bitmap.Config unused = bVar.f33517a;
        }
        if (bVar.f33521e != null) {
            fVar = bVar.f33521e;
        } else {
            fVar = hf.k.f();
        }
        this.f33494d = fVar;
        this.f33495e = (Context) md.k.g(bVar.f33522f);
        this.f33497g = bVar.f33542z == null ? new jf.c(new e()) : bVar.f33542z;
        this.f33496f = bVar.f33523g;
        this.f33498h = bVar.f33524h == null ? new hf.l() : bVar.f33524h;
        if (bVar.f33526j != null) {
            oVar = bVar.f33526j;
        } else {
            oVar = w.o();
        }
        this.f33500j = oVar;
        this.f33501k = bVar.f33527k;
        this.f33502l = H(bVar);
        this.f33503m = bVar.f33529m;
        this.f33504n = bVar.f33530n == null ? new a(this) : bVar.f33530n;
        hd.c G = bVar.f33531o == null ? G(bVar.f33522f) : bVar.f33531o;
        this.f33505o = G;
        if (bVar.f33532p != null) {
            cVar = bVar.f33532p;
        } else {
            cVar = pd.d.b();
        }
        this.f33506p = cVar;
        this.f33507q = I(bVar, s11);
        int i12 = bVar.B < 0 ? 30000 : bVar.B;
        this.f33509s = i12;
        if (tf.b.d()) {
            tf.b.a("ImagePipelineConfig->mNetworkFetcher");
        }
        this.f33508r = bVar.f33534r == null ? new x(i12) : bVar.f33534r;
        if (tf.b.d()) {
            tf.b.b();
        }
        gf.f unused2 = bVar.f33535s;
        if (bVar.f33536t != null) {
            tVar = bVar.f33536t;
        } else {
            tVar = new qf.t(qf.s.n().m());
        }
        this.f33510t = tVar;
        this.f33511u = bVar.f33537u == null ? new lf.f() : bVar.f33537u;
        this.f33512v = bVar.f33538v == null ? new HashSet<>() : bVar.f33538v;
        this.f33513w = bVar.f33539w == null ? new HashSet<>() : bVar.f33539w;
        this.f33514x = bVar.f33540x;
        this.f33515y = bVar.f33541y != null ? bVar.f33541y : G;
        lf.c unused3 = bVar.A;
        this.f33499i = bVar.f33525i == null ? new jf.b(tVar.e()) : bVar.f33525i;
        this.B = bVar.D;
        this.C = bVar.E;
        this.D = bVar.F;
        this.E = bVar.G;
        this.H = bVar.J == null ? new hf.g() : bVar.J;
        this.F = bVar.H;
        this.G = bVar.I;
        vd.b m11 = s11.m();
        if (m11 != null) {
            K(m11, s11, new gf.d(t()));
        } else if (s11.y() && vd.c.f54476a && (i11 = vd.c.i()) != null) {
            K(i11, s11, new gf.d(t()));
        }
        if (tf.b.d()) {
            tf.b.b();
        }
    }
}