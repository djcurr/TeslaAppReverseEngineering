package f4;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f4.a;
import f4.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b<T extends b<T>> implements a.b {

    /* renamed from: m  reason: collision with root package name */
    public static final r f25779m;

    /* renamed from: n  reason: collision with root package name */
    public static final r f25780n;

    /* renamed from: o  reason: collision with root package name */
    public static final r f25781o;

    /* renamed from: p  reason: collision with root package name */
    public static final r f25782p;

    /* renamed from: q  reason: collision with root package name */
    public static final r f25783q;

    /* renamed from: r  reason: collision with root package name */
    public static final r f25784r;

    /* renamed from: d  reason: collision with root package name */
    final Object f25788d;

    /* renamed from: e  reason: collision with root package name */
    final f4.c f25789e;

    /* renamed from: j  reason: collision with root package name */
    private float f25794j;

    /* renamed from: a  reason: collision with root package name */
    float f25785a = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: b  reason: collision with root package name */
    float f25786b = Float.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    boolean f25787c = false;

    /* renamed from: f  reason: collision with root package name */
    boolean f25790f = false;

    /* renamed from: g  reason: collision with root package name */
    float f25791g = Float.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    float f25792h = -Float.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    private long f25793i = 0;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<p> f25795k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<q> f25796l = new ArrayList<>();

    /* loaded from: classes.dex */
    static class a extends r {
        a(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return view.getY();
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            view.setY(f11);
        }
    }

    /* renamed from: f4.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0508b extends r {
        C0508b(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return a0.S(view);
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            a0.Q0(view, f11);
        }
    }

    /* loaded from: classes.dex */
    static class c extends r {
        c(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            view.setAlpha(f11);
        }
    }

    /* loaded from: classes.dex */
    static class d extends r {
        d(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            view.setScrollX((int) f11);
        }
    }

    /* loaded from: classes.dex */
    static class e extends r {
        e(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            view.setScrollY((int) f11);
        }
    }

    /* loaded from: classes.dex */
    static class f extends r {
        f(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            view.setTranslationX(f11);
        }
    }

    /* loaded from: classes.dex */
    static class g extends r {
        g(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            view.setTranslationY(f11);
        }
    }

    /* loaded from: classes.dex */
    static class h extends r {
        h(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return a0.P(view);
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            a0.O0(view, f11);
        }
    }

    /* loaded from: classes.dex */
    static class i extends r {
        i(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            view.setScaleX(f11);
        }
    }

    /* loaded from: classes.dex */
    static class j extends r {
        j(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            view.setScaleY(f11);
        }
    }

    /* loaded from: classes.dex */
    static class k extends r {
        k(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            view.setRotation(f11);
        }
    }

    /* loaded from: classes.dex */
    static class l extends r {
        l(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            view.setRotationX(f11);
        }
    }

    /* loaded from: classes.dex */
    static class m extends r {
        m(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            view.setRotationY(f11);
        }
    }

    /* loaded from: classes.dex */
    static class n extends r {
        n(String str) {
            super(str, null);
        }

        @Override // f4.c
        /* renamed from: c */
        public float a(View view) {
            return view.getX();
        }

        @Override // f4.c
        /* renamed from: d */
        public void b(View view, float f11) {
            view.setX(f11);
        }
    }

    /* loaded from: classes.dex */
    static class o {

        /* renamed from: a  reason: collision with root package name */
        float f25797a;

        /* renamed from: b  reason: collision with root package name */
        float f25798b;
    }

    /* loaded from: classes.dex */
    public interface p {
        void a(b bVar, boolean z11, float f11, float f12);
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(b bVar, float f11, float f12);
    }

    /* loaded from: classes.dex */
    public static abstract class r extends f4.c<View> {
        /* synthetic */ r(String str, f fVar) {
            this(str);
        }

        private r(String str) {
            super(str);
        }
    }

    static {
        new f("translationX");
        new g("translationY");
        new h("translationZ");
        f25779m = new i("scaleX");
        f25780n = new j("scaleY");
        f25781o = new k("rotation");
        f25782p = new l("rotationX");
        f25783q = new m("rotationY");
        new n("x");
        new a("y");
        new C0508b("z");
        f25784r = new c("alpha");
        new d("scrollX");
        new e("scrollY");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <K> b(K k11, f4.c<K> cVar) {
        this.f25788d = k11;
        this.f25789e = cVar;
        if (cVar != f25781o && cVar != f25782p && cVar != f25783q) {
            if (cVar == f25784r) {
                this.f25794j = 0.00390625f;
                return;
            } else if (cVar != f25779m && cVar != f25780n) {
                this.f25794j = 1.0f;
                return;
            } else {
                this.f25794j = 0.00390625f;
                return;
            }
        }
        this.f25794j = 0.1f;
    }

    private void b(boolean z11) {
        this.f25790f = false;
        f4.a.d().g(this);
        this.f25793i = 0L;
        this.f25787c = false;
        for (int i11 = 0; i11 < this.f25795k.size(); i11++) {
            if (this.f25795k.get(i11) != null) {
                this.f25795k.get(i11).a(this, z11, this.f25786b, this.f25785a);
            }
        }
        f(this.f25795k);
    }

    private float c() {
        return this.f25789e.a(this.f25788d);
    }

    private static <T> void f(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void j() {
        if (this.f25790f) {
            return;
        }
        this.f25790f = true;
        if (!this.f25787c) {
            this.f25786b = c();
        }
        float f11 = this.f25786b;
        if (f11 <= this.f25791g && f11 >= this.f25792h) {
            f4.a.d().a(this, 0L);
            return;
        }
        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
    }

    @Override // f4.a.b
    public boolean a(long j11) {
        long j12 = this.f25793i;
        if (j12 == 0) {
            this.f25793i = j11;
            g(this.f25786b);
            return false;
        }
        this.f25793i = j11;
        boolean k11 = k(j11 - j12);
        float min = Math.min(this.f25786b, this.f25791g);
        this.f25786b = min;
        float max = Math.max(min, this.f25792h);
        this.f25786b = max;
        g(max);
        if (k11) {
            b(false);
        }
        return k11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.f25794j * 0.75f;
    }

    public boolean e() {
        return this.f25790f;
    }

    void g(float f11) {
        this.f25789e.b(this.f25788d, f11);
        for (int i11 = 0; i11 < this.f25796l.size(); i11++) {
            if (this.f25796l.get(i11) != null) {
                this.f25796l.get(i11).a(this, this.f25786b, this.f25785a);
            }
        }
        f(this.f25796l);
    }

    public T h(float f11) {
        this.f25786b = f11;
        this.f25787c = true;
        return this;
    }

    public void i() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f25790f) {
                return;
            }
            j();
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    abstract boolean k(long j11);
}