package te;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import je.d;

/* loaded from: classes3.dex */
public class a extends Drawable implements Animatable, ae.a {

    /* renamed from: t  reason: collision with root package name */
    private static final Class<?> f51907t = a.class;

    /* renamed from: w  reason: collision with root package name */
    private static final te.b f51908w = new c();

    /* renamed from: a  reason: collision with root package name */
    private oe.a f51909a;

    /* renamed from: b  reason: collision with root package name */
    private ve.b f51910b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f51911c;

    /* renamed from: d  reason: collision with root package name */
    private long f51912d;

    /* renamed from: e  reason: collision with root package name */
    private long f51913e;

    /* renamed from: f  reason: collision with root package name */
    private long f51914f;

    /* renamed from: g  reason: collision with root package name */
    private int f51915g;

    /* renamed from: h  reason: collision with root package name */
    private long f51916h;

    /* renamed from: i  reason: collision with root package name */
    private long f51917i;

    /* renamed from: j  reason: collision with root package name */
    private int f51918j;

    /* renamed from: k  reason: collision with root package name */
    private long f51919k;

    /* renamed from: l  reason: collision with root package name */
    private long f51920l;

    /* renamed from: m  reason: collision with root package name */
    private int f51921m;

    /* renamed from: n  reason: collision with root package name */
    private volatile te.b f51922n;

    /* renamed from: o  reason: collision with root package name */
    private volatile b f51923o;

    /* renamed from: p  reason: collision with root package name */
    private d f51924p;

    /* renamed from: q  reason: collision with root package name */
    private final Runnable f51925q;

    /* renamed from: te.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class RunnableC1152a implements Runnable {
        RunnableC1152a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.unscheduleSelf(aVar.f51925q);
            a.this.invalidateSelf();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(a aVar, ve.b bVar, int i11, boolean z11, boolean z12, long j11, long j12, long j13, long j14, long j15, long j16, long j17);
    }

    public a() {
        this(null);
    }

    private static ve.b c(oe.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new ve.a(aVar);
    }

    private long d() {
        return SystemClock.uptimeMillis();
    }

    private void e() {
        this.f51921m++;
        if (nd.a.u(2)) {
            nd.a.w(f51907t, "Dropped a frame. Count: %s", Integer.valueOf(this.f51921m));
        }
    }

    private void f(long j11) {
        long j12 = this.f51912d + j11;
        this.f51914f = j12;
        scheduleSelf(this.f51925q, j12);
    }

    @Override // ae.a
    public void a() {
        oe.a aVar = this.f51909a;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        long j11;
        long j12;
        a aVar;
        long j13;
        if (this.f51909a == null || this.f51910b == null) {
            return;
        }
        long d11 = d();
        long max = this.f51911c ? (d11 - this.f51912d) + this.f51920l : Math.max(this.f51913e, 0L);
        int b11 = this.f51910b.b(max, this.f51913e);
        if (b11 == -1) {
            b11 = this.f51909a.a() - 1;
            this.f51922n.c(this);
            this.f51911c = false;
        } else if (b11 == 0 && this.f51915g != -1 && d11 >= this.f51914f) {
            this.f51922n.a(this);
        }
        int i11 = b11;
        boolean g11 = this.f51909a.g(this, canvas, i11);
        if (g11) {
            this.f51922n.d(this, i11);
            this.f51915g = i11;
        }
        if (!g11) {
            e();
        }
        long d12 = d();
        if (this.f51911c) {
            long a11 = this.f51910b.a(d12 - this.f51912d);
            if (a11 != -1) {
                long j14 = this.f51919k + a11;
                f(j14);
                j12 = j14;
            } else {
                this.f51922n.c(this);
                this.f51911c = false;
                j12 = -1;
            }
            j11 = a11;
        } else {
            j11 = -1;
            j12 = -1;
        }
        b bVar = this.f51923o;
        if (bVar != null) {
            bVar.a(this, this.f51910b, i11, g11, this.f51911c, this.f51912d, max, this.f51913e, d11, d12, j11, j12);
            aVar = this;
            j13 = max;
        } else {
            aVar = this;
            j13 = max;
        }
        aVar.f51913e = j13;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        oe.a aVar = this.f51909a;
        if (aVar == null) {
            return super.getIntrinsicHeight();
        }
        return aVar.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        oe.a aVar = this.f51909a;
        if (aVar == null) {
            return super.getIntrinsicWidth();
        }
        return aVar.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f51911c;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        oe.a aVar = this.f51909a;
        if (aVar != null) {
            aVar.d(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        if (this.f51911c) {
            return false;
        }
        long j11 = i11;
        if (this.f51913e != j11) {
            this.f51913e = j11;
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f51924p == null) {
            this.f51924p = new d();
        }
        this.f51924p.b(i11);
        oe.a aVar = this.f51909a;
        if (aVar != null) {
            aVar.j(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f51924p == null) {
            this.f51924p = new d();
        }
        this.f51924p.c(colorFilter);
        oe.a aVar = this.f51909a;
        if (aVar != null) {
            aVar.f(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        oe.a aVar;
        if (this.f51911c || (aVar = this.f51909a) == null || aVar.a() <= 1) {
            return;
        }
        this.f51911c = true;
        long d11 = d();
        long j11 = d11 - this.f51916h;
        this.f51912d = j11;
        this.f51914f = j11;
        this.f51913e = d11 - this.f51917i;
        this.f51915g = this.f51918j;
        invalidateSelf();
        this.f51922n.b(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f51911c) {
            long d11 = d();
            this.f51916h = d11 - this.f51912d;
            this.f51917i = d11 - this.f51913e;
            this.f51918j = this.f51915g;
            this.f51911c = false;
            this.f51912d = 0L;
            this.f51914f = 0L;
            this.f51913e = -1L;
            this.f51915g = -1;
            unscheduleSelf(this.f51925q);
            this.f51922n.c(this);
        }
    }

    public a(oe.a aVar) {
        this.f51919k = 8L;
        this.f51920l = 0L;
        this.f51922n = f51908w;
        this.f51923o = null;
        this.f51925q = new RunnableC1152a();
        this.f51909a = aVar;
        this.f51910b = c(aVar);
    }
}