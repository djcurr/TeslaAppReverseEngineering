package jf;

import android.content.Context;
import com.facebook.common.memory.PooledByteBuffer;
import hf.s;
import jf.i;
import vd.b;

/* loaded from: classes3.dex */
public class k {
    private final int A;
    private final boolean B;
    private final boolean C;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f33544a;

    /* renamed from: b  reason: collision with root package name */
    private final b.a f33545b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33546c;

    /* renamed from: d  reason: collision with root package name */
    private final vd.b f33547d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f33548e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f33549f;

    /* renamed from: g  reason: collision with root package name */
    private final int f33550g;

    /* renamed from: h  reason: collision with root package name */
    private final int f33551h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f33552i;

    /* renamed from: j  reason: collision with root package name */
    private final int f33553j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f33554k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f33555l;

    /* renamed from: m  reason: collision with root package name */
    private final d f33556m;

    /* renamed from: n  reason: collision with root package name */
    private final md.n<Boolean> f33557n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f33558o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f33559p;

    /* renamed from: q  reason: collision with root package name */
    private final int f33560q;

    /* renamed from: r  reason: collision with root package name */
    private final md.n<Boolean> f33561r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f33562s;

    /* renamed from: t  reason: collision with root package name */
    private final long f33563t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f33564u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f33565v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f33566w;

    /* renamed from: x  reason: collision with root package name */
    private final boolean f33567x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f33568y;

    /* renamed from: z  reason: collision with root package name */
    private final boolean f33569z;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: b  reason: collision with root package name */
        private b.a f33571b;

        /* renamed from: d  reason: collision with root package name */
        private vd.b f33573d;

        /* renamed from: m  reason: collision with root package name */
        private d f33582m;

        /* renamed from: n  reason: collision with root package name */
        public md.n<Boolean> f33583n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f33584o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f33585p;

        /* renamed from: q  reason: collision with root package name */
        public int f33586q;

        /* renamed from: s  reason: collision with root package name */
        public boolean f33588s;

        /* renamed from: u  reason: collision with root package name */
        private boolean f33590u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f33591v;

        /* renamed from: a  reason: collision with root package name */
        private boolean f33570a = false;

        /* renamed from: c  reason: collision with root package name */
        private boolean f33572c = false;

        /* renamed from: e  reason: collision with root package name */
        private boolean f33574e = false;

        /* renamed from: f  reason: collision with root package name */
        private boolean f33575f = false;

        /* renamed from: g  reason: collision with root package name */
        private int f33576g = 0;

        /* renamed from: h  reason: collision with root package name */
        private int f33577h = 0;

        /* renamed from: i  reason: collision with root package name */
        public boolean f33578i = false;

        /* renamed from: j  reason: collision with root package name */
        private int f33579j = 2048;

        /* renamed from: k  reason: collision with root package name */
        private boolean f33580k = false;

        /* renamed from: l  reason: collision with root package name */
        private boolean f33581l = false;

        /* renamed from: r  reason: collision with root package name */
        public md.n<Boolean> f33587r = md.o.a(Boolean.FALSE);

        /* renamed from: t  reason: collision with root package name */
        public long f33589t = 0;

        /* renamed from: w  reason: collision with root package name */
        public boolean f33592w = true;

        /* renamed from: x  reason: collision with root package name */
        public boolean f33593x = true;

        /* renamed from: y  reason: collision with root package name */
        private boolean f33594y = false;

        /* renamed from: z  reason: collision with root package name */
        private boolean f33595z = false;
        private int A = 20;
        private boolean B = false;
        private boolean C = false;

        public b(i.b bVar) {
        }

        public k s() {
            return new k(this);
        }
    }

    /* loaded from: classes3.dex */
    public static class c implements d {
        @Override // jf.k.d
        public o a(Context context, pd.a aVar, lf.b bVar, lf.d dVar, boolean z11, boolean z12, boolean z13, f fVar, pd.g gVar, pd.j jVar, s<gd.d, nf.c> sVar, s<gd.d, PooledByteBuffer> sVar2, hf.e eVar, hf.e eVar2, hf.f fVar2, gf.f fVar3, int i11, int i12, boolean z14, int i13, jf.a aVar2, boolean z15, int i14) {
            return new o(context, aVar, bVar, dVar, z11, z12, z13, fVar, gVar, sVar, sVar2, eVar, eVar2, fVar2, fVar3, i11, i12, z14, i13, aVar2, z15, i14);
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        o a(Context context, pd.a aVar, lf.b bVar, lf.d dVar, boolean z11, boolean z12, boolean z13, f fVar, pd.g gVar, pd.j jVar, s<gd.d, nf.c> sVar, s<gd.d, PooledByteBuffer> sVar2, hf.e eVar, hf.e eVar2, hf.f fVar2, gf.f fVar3, int i11, int i12, boolean z14, int i13, jf.a aVar2, boolean z15, int i14);
    }

    public boolean A() {
        return this.f33559p;
    }

    public boolean B() {
        return this.f33564u;
    }

    public boolean C() {
        return this.B;
    }

    public boolean a() {
        return this.C;
    }

    public int b() {
        return this.f33560q;
    }

    public boolean c() {
        return this.f33552i;
    }

    public int d() {
        return this.f33551h;
    }

    public int e() {
        return this.f33550g;
    }

    public int f() {
        return this.f33553j;
    }

    public long g() {
        return this.f33563t;
    }

    public d h() {
        return this.f33556m;
    }

    public md.n<Boolean> i() {
        return this.f33561r;
    }

    public int j() {
        return this.A;
    }

    public boolean k() {
        return this.f33549f;
    }

    public boolean l() {
        return this.f33548e;
    }

    public vd.b m() {
        return this.f33547d;
    }

    public b.a n() {
        return this.f33545b;
    }

    public boolean o() {
        return this.f33546c;
    }

    public boolean p() {
        return this.f33569z;
    }

    public boolean q() {
        return this.f33566w;
    }

    public boolean r() {
        return this.f33568y;
    }

    public boolean s() {
        return this.f33567x;
    }

    public boolean t() {
        return this.f33562s;
    }

    public boolean u() {
        return this.f33558o;
    }

    public md.n<Boolean> v() {
        return this.f33557n;
    }

    public boolean w() {
        return this.f33554k;
    }

    public boolean x() {
        return this.f33555l;
    }

    public boolean y() {
        return this.f33544a;
    }

    public boolean z() {
        return this.f33565v;
    }

    private k(b bVar) {
        this.f33544a = bVar.f33570a;
        this.f33545b = bVar.f33571b;
        this.f33546c = bVar.f33572c;
        this.f33547d = bVar.f33573d;
        this.f33548e = bVar.f33574e;
        this.f33549f = bVar.f33575f;
        this.f33550g = bVar.f33576g;
        this.f33551h = bVar.f33577h;
        this.f33552i = bVar.f33578i;
        this.f33553j = bVar.f33579j;
        this.f33554k = bVar.f33580k;
        this.f33555l = bVar.f33581l;
        if (bVar.f33582m != null) {
            this.f33556m = bVar.f33582m;
        } else {
            this.f33556m = new c();
        }
        this.f33557n = bVar.f33583n;
        this.f33558o = bVar.f33584o;
        this.f33559p = bVar.f33585p;
        this.f33560q = bVar.f33586q;
        this.f33561r = bVar.f33587r;
        this.f33562s = bVar.f33588s;
        this.f33563t = bVar.f33589t;
        this.f33564u = bVar.f33590u;
        this.f33565v = bVar.f33591v;
        this.f33566w = bVar.f33592w;
        this.f33567x = bVar.f33593x;
        this.f33568y = bVar.f33594y;
        this.f33569z = bVar.f33595z;
        this.A = bVar.A;
        this.B = bVar.B;
        this.C = bVar.C;
    }
}