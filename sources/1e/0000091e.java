package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* loaded from: classes.dex */
class q<T> extends Property<T, Float> {

    /* renamed from: a  reason: collision with root package name */
    private final Property<T, PointF> f6197a;

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f6198b;

    /* renamed from: c  reason: collision with root package name */
    private final float f6199c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f6200d;

    /* renamed from: e  reason: collision with root package name */
    private final PointF f6201e;

    /* renamed from: f  reason: collision with root package name */
    private float f6202f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f6200d = new float[2];
        this.f6201e = new PointF();
        this.f6197a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f6198b = pathMeasure;
        this.f6199c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a */
    public Float get(T t11) {
        return Float.valueOf(this.f6202f);
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(T t11, Float f11) {
        this.f6202f = f11.floatValue();
        this.f6198b.getPosTan(this.f6199c * f11.floatValue(), this.f6200d, null);
        PointF pointF = this.f6201e;
        float[] fArr = this.f6200d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f6197a.set(t11, pointF);
    }
}