package i8;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final v7.d f30187a;

    /* renamed from: b  reason: collision with root package name */
    public final T f30188b;

    /* renamed from: c  reason: collision with root package name */
    public T f30189c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f30190d;

    /* renamed from: e  reason: collision with root package name */
    public final Interpolator f30191e;

    /* renamed from: f  reason: collision with root package name */
    public final Interpolator f30192f;

    /* renamed from: g  reason: collision with root package name */
    public final float f30193g;

    /* renamed from: h  reason: collision with root package name */
    public Float f30194h;

    /* renamed from: i  reason: collision with root package name */
    private float f30195i;

    /* renamed from: j  reason: collision with root package name */
    private float f30196j;

    /* renamed from: k  reason: collision with root package name */
    private int f30197k;

    /* renamed from: l  reason: collision with root package name */
    private int f30198l;

    /* renamed from: m  reason: collision with root package name */
    private float f30199m;

    /* renamed from: n  reason: collision with root package name */
    private float f30200n;

    /* renamed from: o  reason: collision with root package name */
    public PointF f30201o;

    /* renamed from: p  reason: collision with root package name */
    public PointF f30202p;

    public a(v7.d dVar, T t11, T t12, Interpolator interpolator, float f11, Float f12) {
        this.f30195i = -3987645.8f;
        this.f30196j = -3987645.8f;
        this.f30197k = 784923401;
        this.f30198l = 784923401;
        this.f30199m = Float.MIN_VALUE;
        this.f30200n = Float.MIN_VALUE;
        this.f30201o = null;
        this.f30202p = null;
        this.f30187a = dVar;
        this.f30188b = t11;
        this.f30189c = t12;
        this.f30190d = interpolator;
        this.f30191e = null;
        this.f30192f = null;
        this.f30193g = f11;
        this.f30194h = f12;
    }

    public boolean a(float f11) {
        return f11 >= e() && f11 < b();
    }

    public float b() {
        if (this.f30187a == null) {
            return 1.0f;
        }
        if (this.f30200n == Float.MIN_VALUE) {
            if (this.f30194h == null) {
                this.f30200n = 1.0f;
            } else {
                this.f30200n = e() + ((this.f30194h.floatValue() - this.f30193g) / this.f30187a.e());
            }
        }
        return this.f30200n;
    }

    public float c() {
        if (this.f30196j == -3987645.8f) {
            this.f30196j = ((Float) this.f30189c).floatValue();
        }
        return this.f30196j;
    }

    public int d() {
        if (this.f30198l == 784923401) {
            this.f30198l = ((Integer) this.f30189c).intValue();
        }
        return this.f30198l;
    }

    public float e() {
        v7.d dVar = this.f30187a;
        if (dVar == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (this.f30199m == Float.MIN_VALUE) {
            this.f30199m = (this.f30193g - dVar.p()) / this.f30187a.e();
        }
        return this.f30199m;
    }

    public float f() {
        if (this.f30195i == -3987645.8f) {
            this.f30195i = ((Float) this.f30188b).floatValue();
        }
        return this.f30195i;
    }

    public int g() {
        if (this.f30197k == 784923401) {
            this.f30197k = ((Integer) this.f30188b).intValue();
        }
        return this.f30197k;
    }

    public boolean h() {
        return this.f30190d == null && this.f30191e == null && this.f30192f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f30188b + ", endValue=" + this.f30189c + ", startFrame=" + this.f30193g + ", endFrame=" + this.f30194h + ", interpolator=" + this.f30190d + CoreConstants.CURLY_RIGHT;
    }

    public a(v7.d dVar, T t11, T t12, Interpolator interpolator, Interpolator interpolator2, float f11, Float f12) {
        this.f30195i = -3987645.8f;
        this.f30196j = -3987645.8f;
        this.f30197k = 784923401;
        this.f30198l = 784923401;
        this.f30199m = Float.MIN_VALUE;
        this.f30200n = Float.MIN_VALUE;
        this.f30201o = null;
        this.f30202p = null;
        this.f30187a = dVar;
        this.f30188b = t11;
        this.f30189c = t12;
        this.f30190d = null;
        this.f30191e = interpolator;
        this.f30192f = interpolator2;
        this.f30193g = f11;
        this.f30194h = f12;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(v7.d dVar, T t11, T t12, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f11, Float f12) {
        this.f30195i = -3987645.8f;
        this.f30196j = -3987645.8f;
        this.f30197k = 784923401;
        this.f30198l = 784923401;
        this.f30199m = Float.MIN_VALUE;
        this.f30200n = Float.MIN_VALUE;
        this.f30201o = null;
        this.f30202p = null;
        this.f30187a = dVar;
        this.f30188b = t11;
        this.f30189c = t12;
        this.f30190d = interpolator;
        this.f30191e = interpolator2;
        this.f30192f = interpolator3;
        this.f30193g = f11;
        this.f30194h = f12;
    }

    public a(T t11) {
        this.f30195i = -3987645.8f;
        this.f30196j = -3987645.8f;
        this.f30197k = 784923401;
        this.f30198l = 784923401;
        this.f30199m = Float.MIN_VALUE;
        this.f30200n = Float.MIN_VALUE;
        this.f30201o = null;
        this.f30202p = null;
        this.f30187a = null;
        this.f30188b = t11;
        this.f30189c = t11;
        this.f30190d = null;
        this.f30191e = null;
        this.f30192f = null;
        this.f30193g = Float.MIN_VALUE;
        this.f30194h = Float.valueOf(Float.MAX_VALUE);
    }
}