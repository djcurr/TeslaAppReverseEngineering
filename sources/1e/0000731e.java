package he;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import expo.modules.interfaces.permissions.PermissionsResponse;
import ie.b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import je.q;

/* loaded from: classes3.dex */
public class a extends Drawable implements b {

    /* renamed from: a  reason: collision with root package name */
    private String f29113a;

    /* renamed from: b  reason: collision with root package name */
    private String f29114b;

    /* renamed from: c  reason: collision with root package name */
    private int f29115c;

    /* renamed from: d  reason: collision with root package name */
    private int f29116d;

    /* renamed from: e  reason: collision with root package name */
    private int f29117e;

    /* renamed from: f  reason: collision with root package name */
    private String f29118f;

    /* renamed from: g  reason: collision with root package name */
    private q.c f29119g;

    /* renamed from: i  reason: collision with root package name */
    private int f29121i;

    /* renamed from: j  reason: collision with root package name */
    private int f29122j;

    /* renamed from: p  reason: collision with root package name */
    private int f29128p;

    /* renamed from: q  reason: collision with root package name */
    private int f29129q;

    /* renamed from: t  reason: collision with root package name */
    private int f29130t;

    /* renamed from: w  reason: collision with root package name */
    private int f29131w;

    /* renamed from: x  reason: collision with root package name */
    private int f29132x;

    /* renamed from: y  reason: collision with root package name */
    private long f29133y;

    /* renamed from: z  reason: collision with root package name */
    private String f29134z;

    /* renamed from: h  reason: collision with root package name */
    private HashMap<String, String> f29120h = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private int f29123k = 80;

    /* renamed from: l  reason: collision with root package name */
    private final Paint f29124l = new Paint(1);

    /* renamed from: m  reason: collision with root package name */
    private final Matrix f29125m = new Matrix();

    /* renamed from: n  reason: collision with root package name */
    private final Rect f29126n = new Rect();

    /* renamed from: o  reason: collision with root package name */
    private final RectF f29127o = new RectF();
    private int A = -1;
    private int B = 0;

    public a() {
        h();
    }

    private void b(Canvas canvas, String str, Object obj) {
        d(canvas, str, String.valueOf(obj), -1);
    }

    private void c(Canvas canvas, String str, String str2) {
        d(canvas, str, str2, -1);
    }

    private void d(Canvas canvas, String str, String str2, int i11) {
        String str3 = str + ": ";
        float measureText = this.f29124l.measureText(str3);
        float measureText2 = this.f29124l.measureText(str2);
        this.f29124l.setColor(1711276032);
        int i12 = this.f29131w;
        int i13 = this.f29132x;
        canvas.drawRect(i12 - 4, i13 + 8, i12 + measureText + measureText2 + 4.0f, i13 + this.f29130t + 8, this.f29124l);
        this.f29124l.setColor(-1);
        canvas.drawText(str3, this.f29131w, this.f29132x, this.f29124l);
        this.f29124l.setColor(i11);
        canvas.drawText(str2, this.f29131w + measureText, this.f29132x, this.f29124l);
        this.f29132x += this.f29130t;
    }

    private static String f(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    private void g(Rect rect, int i11, int i12) {
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i12, rect.height() / i11)));
        this.f29124l.setTextSize(min);
        int i13 = min + 8;
        this.f29130t = i13;
        int i14 = this.f29123k;
        if (i14 == 80) {
            this.f29130t = i13 * (-1);
        }
        this.f29128p = rect.left + 10;
        this.f29129q = i14 == 80 ? rect.bottom - 10 : rect.top + 10 + 10;
    }

    @Override // ie.b
    public void a(long j11) {
        this.f29133y = j11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f29124l.setStyle(Paint.Style.STROKE);
        this.f29124l.setStrokeWidth(2.0f);
        this.f29124l.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f29124l);
        this.f29124l.setStyle(Paint.Style.FILL);
        this.f29124l.setColor(this.B);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f29124l);
        this.f29124l.setStyle(Paint.Style.FILL);
        this.f29124l.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        this.f29124l.setColor(-1);
        this.f29131w = this.f29128p;
        this.f29132x = this.f29129q;
        String str = this.f29114b;
        if (str != null) {
            c(canvas, "IDs", f("%s, %s", this.f29113a, str));
        } else {
            c(canvas, "ID", this.f29113a);
        }
        c(canvas, "D", f("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        d(canvas, "I", f("%dx%d", Integer.valueOf(this.f29115c), Integer.valueOf(this.f29116d)), e(this.f29115c, this.f29116d, this.f29119g));
        c(canvas, "I", f("%d KiB", Integer.valueOf(this.f29117e / 1024)));
        String str2 = this.f29118f;
        if (str2 != null) {
            c(canvas, "i format", str2);
        }
        int i11 = this.f29121i;
        if (i11 > 0) {
            c(canvas, "anim", f("f %d, l %d", Integer.valueOf(i11), Integer.valueOf(this.f29122j)));
        }
        q.c cVar = this.f29119g;
        if (cVar != null) {
            b(canvas, "scale", cVar);
        }
        long j11 = this.f29133y;
        if (j11 >= 0) {
            c(canvas, "t", f("%d ms", Long.valueOf(j11)));
        }
        String str3 = this.f29134z;
        if (str3 != null) {
            d(canvas, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, str3, this.A);
        }
        for (Map.Entry<String, String> entry : this.f29120h.entrySet()) {
            c(canvas, entry.getKey(), entry.getValue());
        }
    }

    int e(int i11, int i12, q.c cVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i11 > 0 && i12 > 0) {
            if (cVar != null) {
                Rect rect = this.f29126n;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f29125m.reset();
                cVar.a(this.f29125m, this.f29126n, i11, i12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                RectF rectF = this.f29127o;
                rectF.top = BitmapDescriptorFactory.HUE_RED;
                rectF.left = BitmapDescriptorFactory.HUE_RED;
                rectF.right = i11;
                rectF.bottom = i12;
                this.f29125m.mapRect(rectF);
                width = Math.min(width, (int) this.f29127o.width());
                height = Math.min(height, (int) this.f29127o.height());
            }
            float f11 = width;
            float f12 = f11 * 0.1f;
            float f13 = f11 * 0.5f;
            float f14 = height;
            float f15 = 0.1f * f14;
            float f16 = f14 * 0.5f;
            int abs = Math.abs(i11 - width);
            int abs2 = Math.abs(i12 - height);
            float f17 = abs;
            if (f17 < f12 && abs2 < f15) {
                return -16711936;
            }
            if (f17 < f13 && abs2 < f16) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public void h() {
        this.f29115c = -1;
        this.f29116d = -1;
        this.f29117e = -1;
        this.f29120h = new HashMap<>();
        this.f29121i = -1;
        this.f29122j = -1;
        this.f29118f = null;
        i(null);
        this.f29133y = -1L;
        this.f29134z = null;
        this.A = -1;
        invalidateSelf();
    }

    public void i(String str) {
        if (str == null) {
            str = PermissionsResponse.SCOPE_NONE;
        }
        this.f29113a = str;
        invalidateSelf();
    }

    public void j(int i11, int i12) {
        this.f29115c = i11;
        this.f29116d = i12;
        invalidateSelf();
    }

    public void k(int i11) {
        this.f29117e = i11;
    }

    public void l(String str, int i11) {
        this.f29134z = str;
        this.A = i11;
        invalidateSelf();
    }

    public void m(q.c cVar) {
        this.f29119g = cVar;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        g(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}