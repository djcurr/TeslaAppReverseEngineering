package vk;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f54505i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f54506j = {BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final int[] f54507k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f54508l = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private final Paint f54509a;

    /* renamed from: b  reason: collision with root package name */
    private final Paint f54510b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f54511c;

    /* renamed from: d  reason: collision with root package name */
    private int f54512d;

    /* renamed from: e  reason: collision with root package name */
    private int f54513e;

    /* renamed from: f  reason: collision with root package name */
    private int f54514f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f54515g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f54516h;

    public a() {
        this(-16777216);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i11, float f11, float f12) {
        boolean z11 = f12 < BitmapDescriptorFactory.HUE_RED;
        Path path = this.f54515g;
        if (z11) {
            int[] iArr = f54507k;
            iArr[0] = 0;
            iArr[1] = this.f54514f;
            iArr[2] = this.f54513e;
            iArr[3] = this.f54512d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f11, f12);
            path.close();
            float f13 = -i11;
            rectF.inset(f13, f13);
            int[] iArr2 = f54507k;
            iArr2[0] = 0;
            iArr2[1] = this.f54512d;
            iArr2[2] = this.f54513e;
            iArr2[3] = this.f54514f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float f14 = 1.0f - (i11 / width);
        float[] fArr = f54508l;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f54510b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, f54507k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z11) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f54516h);
        }
        canvas.drawArc(rectF, f11, f12, true, this.f54510b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i11) {
        rectF.bottom += i11;
        rectF.offset(BitmapDescriptorFactory.HUE_RED, -i11);
        int[] iArr = f54505i;
        iArr[0] = this.f54514f;
        iArr[1] = this.f54513e;
        iArr[2] = this.f54512d;
        Paint paint = this.f54511c;
        float f11 = rectF.left;
        paint.setShader(new LinearGradient(f11, rectF.top, f11, rectF.bottom, iArr, f54506j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f54511c);
        canvas.restore();
    }

    public Paint c() {
        return this.f54509a;
    }

    public void d(int i11) {
        this.f54512d = m3.a.k(i11, 68);
        this.f54513e = m3.a.k(i11, 20);
        this.f54514f = m3.a.k(i11, 0);
        this.f54509a.setColor(this.f54512d);
    }

    public a(int i11) {
        this.f54515g = new Path();
        this.f54516h = new Paint();
        this.f54509a = new Paint();
        d(i11);
        this.f54516h.setColor(0);
        Paint paint = new Paint(4);
        this.f54510b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f54511c = new Paint(paint);
    }
}