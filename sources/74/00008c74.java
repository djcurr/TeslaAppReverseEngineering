package nj;

import android.graphics.Bitmap;
import android.text.Layout;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: p  reason: collision with root package name */
    public static final b f41693p = new C0811b().m("").a();

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f41694a;

    /* renamed from: b  reason: collision with root package name */
    public final Layout.Alignment f41695b;

    /* renamed from: c  reason: collision with root package name */
    public final Bitmap f41696c;

    /* renamed from: d  reason: collision with root package name */
    public final float f41697d;

    /* renamed from: e  reason: collision with root package name */
    public final int f41698e;

    /* renamed from: f  reason: collision with root package name */
    public final int f41699f;

    /* renamed from: g  reason: collision with root package name */
    public final float f41700g;

    /* renamed from: h  reason: collision with root package name */
    public final int f41701h;

    /* renamed from: i  reason: collision with root package name */
    public final float f41702i;

    /* renamed from: j  reason: collision with root package name */
    public final float f41703j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f41704k;

    /* renamed from: l  reason: collision with root package name */
    public final int f41705l;

    /* renamed from: m  reason: collision with root package name */
    public final int f41706m;

    /* renamed from: n  reason: collision with root package name */
    public final float f41707n;

    /* renamed from: o  reason: collision with root package name */
    public final int f41708o;

    /* renamed from: nj.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0811b {

        /* renamed from: a  reason: collision with root package name */
        private CharSequence f41709a;

        /* renamed from: b  reason: collision with root package name */
        private Bitmap f41710b;

        /* renamed from: c  reason: collision with root package name */
        private Layout.Alignment f41711c;

        /* renamed from: d  reason: collision with root package name */
        private float f41712d;

        /* renamed from: e  reason: collision with root package name */
        private int f41713e;

        /* renamed from: f  reason: collision with root package name */
        private int f41714f;

        /* renamed from: g  reason: collision with root package name */
        private float f41715g;

        /* renamed from: h  reason: collision with root package name */
        private int f41716h;

        /* renamed from: i  reason: collision with root package name */
        private int f41717i;

        /* renamed from: j  reason: collision with root package name */
        private float f41718j;

        /* renamed from: k  reason: collision with root package name */
        private float f41719k;

        /* renamed from: l  reason: collision with root package name */
        private float f41720l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f41721m;

        /* renamed from: n  reason: collision with root package name */
        private int f41722n;

        /* renamed from: o  reason: collision with root package name */
        private int f41723o;

        public b a() {
            return new b(this.f41709a, this.f41711c, this.f41710b, this.f41712d, this.f41713e, this.f41714f, this.f41715g, this.f41716h, this.f41717i, this.f41718j, this.f41719k, this.f41720l, this.f41721m, this.f41722n, this.f41723o);
        }

        public C0811b b() {
            this.f41721m = false;
            return this;
        }

        public int c() {
            return this.f41714f;
        }

        public int d() {
            return this.f41716h;
        }

        public CharSequence e() {
            return this.f41709a;
        }

        public C0811b f(Bitmap bitmap) {
            this.f41710b = bitmap;
            return this;
        }

        public C0811b g(float f11) {
            this.f41720l = f11;
            return this;
        }

        public C0811b h(float f11, int i11) {
            this.f41712d = f11;
            this.f41713e = i11;
            return this;
        }

        public C0811b i(int i11) {
            this.f41714f = i11;
            return this;
        }

        public C0811b j(float f11) {
            this.f41715g = f11;
            return this;
        }

        public C0811b k(int i11) {
            this.f41716h = i11;
            return this;
        }

        public C0811b l(float f11) {
            this.f41719k = f11;
            return this;
        }

        public C0811b m(CharSequence charSequence) {
            this.f41709a = charSequence;
            return this;
        }

        public C0811b n(Layout.Alignment alignment) {
            this.f41711c = alignment;
            return this;
        }

        public C0811b o(float f11, int i11) {
            this.f41718j = f11;
            this.f41717i = i11;
            return this;
        }

        public C0811b p(int i11) {
            this.f41723o = i11;
            return this;
        }

        public C0811b q(int i11) {
            this.f41722n = i11;
            this.f41721m = true;
            return this;
        }

        public C0811b() {
            this.f41709a = null;
            this.f41710b = null;
            this.f41711c = null;
            this.f41712d = -3.4028235E38f;
            this.f41713e = Integer.MIN_VALUE;
            this.f41714f = Integer.MIN_VALUE;
            this.f41715g = -3.4028235E38f;
            this.f41716h = Integer.MIN_VALUE;
            this.f41717i = Integer.MIN_VALUE;
            this.f41718j = -3.4028235E38f;
            this.f41719k = -3.4028235E38f;
            this.f41720l = -3.4028235E38f;
            this.f41721m = false;
            this.f41722n = -16777216;
            this.f41723o = Integer.MIN_VALUE;
        }

        private C0811b(b bVar) {
            this.f41709a = bVar.f41694a;
            this.f41710b = bVar.f41696c;
            this.f41711c = bVar.f41695b;
            this.f41712d = bVar.f41697d;
            this.f41713e = bVar.f41698e;
            this.f41714f = bVar.f41699f;
            this.f41715g = bVar.f41700g;
            this.f41716h = bVar.f41701h;
            this.f41717i = bVar.f41706m;
            this.f41718j = bVar.f41707n;
            this.f41719k = bVar.f41702i;
            this.f41720l = bVar.f41703j;
            this.f41721m = bVar.f41704k;
            this.f41722n = bVar.f41705l;
            this.f41723o = bVar.f41708o;
        }
    }

    public C0811b a() {
        return new C0811b();
    }

    private b(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f11, int i11, int i12, float f12, int i13, int i14, float f13, float f14, float f15, boolean z11, int i15, int i16) {
        if (charSequence == null) {
            ak.a.e(bitmap);
        } else {
            ak.a.a(bitmap == null);
        }
        this.f41694a = charSequence;
        this.f41695b = alignment;
        this.f41696c = bitmap;
        this.f41697d = f11;
        this.f41698e = i11;
        this.f41699f = i12;
        this.f41700g = f12;
        this.f41701h = i13;
        this.f41702i = f14;
        this.f41703j = f15;
        this.f41704k = z11;
        this.f41705l = i15;
        this.f41706m = i14;
        this.f41707n = f13;
        this.f41708o = i16;
    }
}