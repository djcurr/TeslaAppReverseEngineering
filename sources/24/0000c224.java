package y7;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;

/* loaded from: classes.dex */
public class n extends a<PointF, PointF> {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f59294i;

    /* renamed from: j  reason: collision with root package name */
    private final PointF f59295j;

    /* renamed from: k  reason: collision with root package name */
    private final a<Float, Float> f59296k;

    /* renamed from: l  reason: collision with root package name */
    private final a<Float, Float> f59297l;

    /* renamed from: m  reason: collision with root package name */
    protected i8.c<Float> f59298m;

    /* renamed from: n  reason: collision with root package name */
    protected i8.c<Float> f59299n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f59294i = new PointF();
        this.f59295j = new PointF();
        this.f59296k = aVar;
        this.f59297l = aVar2;
        m(f());
    }

    @Override // y7.a
    public void m(float f11) {
        this.f59296k.m(f11);
        this.f59297l.m(f11);
        this.f59294i.set(this.f59296k.h().floatValue(), this.f59297l.h().floatValue());
        for (int i11 = 0; i11 < this.f59258a.size(); i11++) {
            this.f59258a.get(i11).a();
        }
    }

    @Override // y7.a
    /* renamed from: p */
    public PointF h() {
        return i(null, BitmapDescriptorFactory.HUE_RED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y7.a
    /* renamed from: q */
    public PointF i(i8.a<PointF> aVar, float f11) {
        Float f12;
        i8.a<Float> b11;
        i8.a<Float> b12;
        Float f13 = null;
        if (this.f59298m == null || (b12 = this.f59296k.b()) == null) {
            f12 = null;
        } else {
            float d11 = this.f59296k.d();
            Float f14 = b12.f30194h;
            i8.c<Float> cVar = this.f59298m;
            float f15 = b12.f30193g;
            f12 = cVar.b(f15, f14 == null ? f15 : f14.floatValue(), b12.f30188b, b12.f30189c, f11, f11, d11);
        }
        if (this.f59299n != null && (b11 = this.f59297l.b()) != null) {
            float d12 = this.f59297l.d();
            Float f16 = b11.f30194h;
            i8.c<Float> cVar2 = this.f59299n;
            float f17 = b11.f30193g;
            f13 = cVar2.b(f17, f16 == null ? f17 : f16.floatValue(), b11.f30188b, b11.f30189c, f11, f11, d12);
        }
        if (f12 == null) {
            this.f59295j.set(this.f59294i.x, BitmapDescriptorFactory.HUE_RED);
        } else {
            this.f59295j.set(f12.floatValue(), BitmapDescriptorFactory.HUE_RED);
        }
        if (f13 == null) {
            PointF pointF = this.f59295j;
            pointF.set(pointF.x, this.f59294i.y);
        } else {
            PointF pointF2 = this.f59295j;
            pointF2.set(pointF2.x, f13.floatValue());
        }
        return this.f59295j;
    }

    public void r(i8.c<Float> cVar) {
        i8.c<Float> cVar2 = this.f59298m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f59298m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void s(i8.c<Float> cVar) {
        i8.c<Float> cVar2 = this.f59299n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f59299n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}