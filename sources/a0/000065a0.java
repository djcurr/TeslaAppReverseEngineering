package df;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import bf.e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class a implements bf.a {

    /* renamed from: a  reason: collision with root package name */
    private final ef.a f23958a;

    /* renamed from: b  reason: collision with root package name */
    private final e f23959b;

    /* renamed from: c  reason: collision with root package name */
    private final bf.c f23960c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f23961d;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f23962e;

    /* renamed from: f  reason: collision with root package name */
    private final bf.b[] f23963f;

    /* renamed from: g  reason: collision with root package name */
    private final Rect f23964g = new Rect();

    /* renamed from: h  reason: collision with root package name */
    private final Rect f23965h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    private final boolean f23966i;

    /* renamed from: j  reason: collision with root package name */
    private Bitmap f23967j;

    public a(ef.a aVar, e eVar, Rect rect, boolean z11) {
        this.f23958a = aVar;
        this.f23959b = eVar;
        bf.c d11 = eVar.d();
        this.f23960c = d11;
        int[] j11 = d11.j();
        this.f23962e = j11;
        aVar.a(j11);
        aVar.c(j11);
        aVar.b(j11);
        this.f23961d = k(d11, rect);
        this.f23966i = z11;
        this.f23963f = new bf.b[d11.a()];
        for (int i11 = 0; i11 < this.f23960c.a(); i11++) {
            this.f23963f[i11] = this.f23960c.c(i11);
        }
    }

    private synchronized void j() {
        Bitmap bitmap = this.f23967j;
        if (bitmap != null) {
            bitmap.recycle();
            this.f23967j = null;
        }
    }

    private static Rect k(bf.c cVar, Rect rect) {
        if (rect == null) {
            return new Rect(0, 0, cVar.getWidth(), cVar.getHeight());
        }
        return new Rect(0, 0, Math.min(rect.width(), cVar.getWidth()), Math.min(rect.height(), cVar.getHeight()));
    }

    private synchronized Bitmap l(int i11, int i12) {
        Bitmap bitmap = this.f23967j;
        if (bitmap != null && (bitmap.getWidth() < i11 || this.f23967j.getHeight() < i12)) {
            j();
        }
        if (this.f23967j == null) {
            this.f23967j = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        }
        this.f23967j.eraseColor(0);
        return this.f23967j;
    }

    private void m(Canvas canvas, bf.d dVar) {
        int width;
        int height;
        int b11;
        int c11;
        if (this.f23966i) {
            float max = Math.max(dVar.getWidth() / Math.min(dVar.getWidth(), canvas.getWidth()), dVar.getHeight() / Math.min(dVar.getHeight(), canvas.getHeight()));
            width = (int) (dVar.getWidth() / max);
            height = (int) (dVar.getHeight() / max);
            b11 = (int) (dVar.b() / max);
            c11 = (int) (dVar.c() / max);
        } else {
            width = dVar.getWidth();
            height = dVar.getHeight();
            b11 = dVar.b();
            c11 = dVar.c();
        }
        synchronized (this) {
            Bitmap l11 = l(width, height);
            this.f23967j = l11;
            dVar.a(width, height, l11);
            canvas.save();
            canvas.translate(b11, c11);
            canvas.drawBitmap(this.f23967j, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
            canvas.restore();
        }
    }

    private void n(Canvas canvas, bf.d dVar) {
        double width = this.f23961d.width() / this.f23960c.getWidth();
        double height = this.f23961d.height() / this.f23960c.getHeight();
        int round = (int) Math.round(dVar.getWidth() * width);
        int round2 = (int) Math.round(dVar.getHeight() * height);
        int b11 = (int) (dVar.b() * width);
        int c11 = (int) (dVar.c() * height);
        synchronized (this) {
            int width2 = this.f23961d.width();
            int height2 = this.f23961d.height();
            l(width2, height2);
            Bitmap bitmap = this.f23967j;
            if (bitmap != null) {
                dVar.a(round, round2, bitmap);
            }
            this.f23964g.set(0, 0, width2, height2);
            this.f23965h.set(b11, c11, width2 + b11, height2 + c11);
            Bitmap bitmap2 = this.f23967j;
            if (bitmap2 != null) {
                canvas.drawBitmap(bitmap2, this.f23964g, this.f23965h, (Paint) null);
            }
        }
    }

    @Override // bf.a
    public int a() {
        return this.f23960c.a();
    }

    @Override // bf.a
    public int b() {
        return this.f23960c.b();
    }

    @Override // bf.a
    public bf.b c(int i11) {
        return this.f23963f[i11];
    }

    @Override // bf.a
    public void d(int i11, Canvas canvas) {
        bf.d i12 = this.f23960c.i(i11);
        try {
            if (this.f23960c.f()) {
                n(canvas, i12);
            } else {
                m(canvas, i12);
            }
        } finally {
            i12.dispose();
        }
    }

    @Override // bf.a
    public bf.a e(Rect rect) {
        return k(this.f23960c, rect).equals(this.f23961d) ? this : new a(this.f23958a, this.f23959b, rect, this.f23966i);
    }

    @Override // bf.a
    public int f(int i11) {
        return this.f23962e[i11];
    }

    @Override // bf.a
    public int g() {
        return this.f23961d.height();
    }

    @Override // bf.a
    public int getHeight() {
        return this.f23960c.getHeight();
    }

    @Override // bf.a
    public int getWidth() {
        return this.f23960c.getWidth();
    }

    @Override // bf.a
    public int h() {
        return this.f23961d.width();
    }

    @Override // bf.a
    public e i() {
        return this.f23959b;
    }
}