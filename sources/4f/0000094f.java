package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class g implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private float[] f6292a;

    /* renamed from: b  reason: collision with root package name */
    private float[] f6293b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    private void a(float f11, float f12, float f13, float f14) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.cubicTo(f11, f12, f13, f14, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i11 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f6292a = new float[min];
            this.f6293b = new float[min];
            float[] fArr = new float[2];
            for (int i12 = 0; i12 < min; i12++) {
                pathMeasure.getPosTan((i12 * length) / (min - 1), fArr, null);
                this.f6292a[i12] = fArr[0];
                this.f6293b[i12] = fArr[1];
            }
            if (Math.abs(this.f6292a[0]) <= 1.0E-5d && Math.abs(this.f6293b[0]) <= 1.0E-5d) {
                int i13 = min - 1;
                if (Math.abs(this.f6292a[i13] - 1.0f) <= 1.0E-5d && Math.abs(this.f6293b[i13] - 1.0f) <= 1.0E-5d) {
                    float f11 = BitmapDescriptorFactory.HUE_RED;
                    int i14 = 0;
                    while (i11 < min) {
                        float[] fArr2 = this.f6292a;
                        int i15 = i14 + 1;
                        float f12 = fArr2[i14];
                        if (f12 >= f11) {
                            fArr2[i11] = f12;
                            i11++;
                            f11 = f12;
                            i14 = i15;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f12);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb2.append(this.f6292a[0]);
            sb2.append(",");
            sb2.append(this.f6293b[0]);
            sb2.append(" end:");
            int i16 = min - 1;
            sb2.append(this.f6292a[i16]);
            sb2.append(",");
            sb2.append(this.f6293b[i16]);
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    private void c(float f11, float f12) {
        Path path = new Path();
        path.moveTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        path.quadTo(f11, f12, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (l3.i.j(xmlPullParser, "pathData")) {
            String i11 = l3.i.i(typedArray, xmlPullParser, "pathData", 4);
            Path e11 = m3.c.e(i11);
            if (e11 != null) {
                b(e11);
                return;
            }
            throw new InflateException("The path is null, which is created from " + i11);
        } else if (l3.i.j(xmlPullParser, "controlX1")) {
            if (l3.i.j(xmlPullParser, "controlY1")) {
                float f11 = l3.i.f(typedArray, xmlPullParser, "controlX1", 0, BitmapDescriptorFactory.HUE_RED);
                float f12 = l3.i.f(typedArray, xmlPullParser, "controlY1", 1, BitmapDescriptorFactory.HUE_RED);
                boolean j11 = l3.i.j(xmlPullParser, "controlX2");
                if (j11 != l3.i.j(xmlPullParser, "controlY2")) {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                }
                if (!j11) {
                    c(f11, f12);
                    return;
                } else {
                    a(f11, f12, l3.i.f(typedArray, xmlPullParser, "controlX2", 2, BitmapDescriptorFactory.HUE_RED), l3.i.f(typedArray, xmlPullParser, "controlY2", 3, BitmapDescriptorFactory.HUE_RED));
                    return;
                }
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        } else {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f11) {
        if (f11 <= BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (f11 >= 1.0f) {
            return 1.0f;
        }
        int i11 = 0;
        int length = this.f6292a.length - 1;
        while (length - i11 > 1) {
            int i12 = (i11 + length) / 2;
            if (f11 < this.f6292a[i12]) {
                length = i12;
            } else {
                i11 = i12;
            }
        }
        float[] fArr = this.f6292a;
        float f12 = fArr[length] - fArr[i11];
        if (f12 == BitmapDescriptorFactory.HUE_RED) {
            return this.f6293b[i11];
        }
        float[] fArr2 = this.f6293b;
        float f13 = fArr2[i11];
        return f13 + (((f11 - fArr[i11]) / f12) * (fArr2[length] - f13));
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k11 = l3.i.k(resources, theme, attributeSet, a.f6278l);
        d(k11, xmlPullParser);
        k11.recycle();
    }
}