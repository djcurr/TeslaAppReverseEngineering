package pe;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import gf.f;
import oe.c;
import oe.d;

/* loaded from: classes3.dex */
public class a implements oe.a, c.b {

    /* renamed from: m  reason: collision with root package name */
    private static final Class<?> f46434m = a.class;

    /* renamed from: a  reason: collision with root package name */
    private final f f46435a;

    /* renamed from: b  reason: collision with root package name */
    private final b f46436b;

    /* renamed from: c  reason: collision with root package name */
    private final d f46437c;

    /* renamed from: d  reason: collision with root package name */
    private final c f46438d;

    /* renamed from: e  reason: collision with root package name */
    private final re.a f46439e;

    /* renamed from: f  reason: collision with root package name */
    private final re.b f46440f;

    /* renamed from: h  reason: collision with root package name */
    private Rect f46442h;

    /* renamed from: i  reason: collision with root package name */
    private int f46443i;

    /* renamed from: j  reason: collision with root package name */
    private int f46444j;

    /* renamed from: l  reason: collision with root package name */
    private InterfaceC0991a f46446l;

    /* renamed from: k  reason: collision with root package name */
    private Bitmap.Config f46445k = Bitmap.Config.ARGB_8888;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f46441g = new Paint(6);

    /* renamed from: pe.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0991a {
        void a(a aVar, int i11, int i12);

        void b(a aVar, int i11);

        void c(a aVar, int i11);
    }

    public a(f fVar, b bVar, d dVar, c cVar, re.a aVar, re.b bVar2) {
        this.f46435a = fVar;
        this.f46436b = bVar;
        this.f46437c = dVar;
        this.f46438d = cVar;
        this.f46439e = aVar;
        this.f46440f = bVar2;
        n();
    }

    private boolean k(int i11, qd.a<Bitmap> aVar, Canvas canvas, int i12) {
        if (qd.a.n0(aVar)) {
            if (this.f46442h == null) {
                canvas.drawBitmap(aVar.J(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f46441g);
            } else {
                canvas.drawBitmap(aVar.J(), (Rect) null, this.f46442h, this.f46441g);
            }
            if (i12 != 3) {
                this.f46436b.e(i11, aVar, i12);
            }
            InterfaceC0991a interfaceC0991a = this.f46446l;
            if (interfaceC0991a != null) {
                interfaceC0991a.a(this, i11, i12);
                return true;
            }
            return true;
        }
        return false;
    }

    private boolean l(Canvas canvas, int i11, int i12) {
        qd.a<Bitmap> d11;
        boolean k11;
        int i13 = 3;
        boolean z11 = false;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    d11 = this.f46436b.b(i11, this.f46443i, this.f46444j);
                    if (m(i11, d11) && k(i11, d11, canvas, 1)) {
                        z11 = true;
                    }
                    i13 = 2;
                } else if (i12 == 2) {
                    d11 = this.f46435a.b(this.f46443i, this.f46444j, this.f46445k);
                    if (m(i11, d11) && k(i11, d11, canvas, 2)) {
                        z11 = true;
                    }
                } else if (i12 != 3) {
                    return false;
                } else {
                    d11 = this.f46436b.a(i11);
                    k11 = k(i11, d11, canvas, 3);
                    i13 = -1;
                }
                k11 = z11;
            } else {
                d11 = this.f46436b.d(i11);
                k11 = k(i11, d11, canvas, 0);
                i13 = 1;
            }
            qd.a.C(d11);
            return (k11 || i13 == -1) ? k11 : l(canvas, i11, i13);
        } catch (RuntimeException e11) {
            nd.a.D(f46434m, "Failed to create frame bitmap", e11);
            return false;
        } finally {
            qd.a.C(null);
        }
    }

    private boolean m(int i11, qd.a<Bitmap> aVar) {
        if (qd.a.n0(aVar)) {
            boolean a11 = this.f46438d.a(i11, aVar.J());
            if (!a11) {
                qd.a.C(aVar);
            }
            return a11;
        }
        return false;
    }

    private void n() {
        int e11 = this.f46438d.e();
        this.f46443i = e11;
        if (e11 == -1) {
            Rect rect = this.f46442h;
            this.f46443i = rect == null ? -1 : rect.width();
        }
        int c11 = this.f46438d.c();
        this.f46444j = c11;
        if (c11 == -1) {
            Rect rect2 = this.f46442h;
            this.f46444j = rect2 != null ? rect2.height() : -1;
        }
    }

    @Override // oe.d
    public int a() {
        return this.f46437c.a();
    }

    @Override // oe.d
    public int b() {
        return this.f46437c.b();
    }

    @Override // oe.a
    public int c() {
        return this.f46444j;
    }

    @Override // oe.a
    public void clear() {
        this.f46436b.clear();
    }

    @Override // oe.a
    public void d(Rect rect) {
        this.f46442h = rect;
        this.f46438d.d(rect);
        n();
    }

    @Override // oe.a
    public int e() {
        return this.f46443i;
    }

    @Override // oe.a
    public void f(ColorFilter colorFilter) {
        this.f46441g.setColorFilter(colorFilter);
    }

    @Override // oe.a
    public boolean g(Drawable drawable, Canvas canvas, int i11) {
        re.b bVar;
        InterfaceC0991a interfaceC0991a;
        InterfaceC0991a interfaceC0991a2 = this.f46446l;
        if (interfaceC0991a2 != null) {
            interfaceC0991a2.b(this, i11);
        }
        boolean l11 = l(canvas, i11, 0);
        if (!l11 && (interfaceC0991a = this.f46446l) != null) {
            interfaceC0991a.c(this, i11);
        }
        re.a aVar = this.f46439e;
        if (aVar != null && (bVar = this.f46440f) != null) {
            aVar.a(bVar, this.f46436b, this, i11);
        }
        return l11;
    }

    @Override // oe.c.b
    public void h() {
        clear();
    }

    @Override // oe.d
    public int i(int i11) {
        return this.f46437c.i(i11);
    }

    @Override // oe.a
    public void j(int i11) {
        this.f46441g.setAlpha(i11);
    }
}