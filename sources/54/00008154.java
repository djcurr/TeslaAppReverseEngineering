package l0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.d0;

/* loaded from: classes.dex */
public final class f0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f36108a;

    /* renamed from: b  reason: collision with root package name */
    private final float f36109b;

    /* renamed from: c  reason: collision with root package name */
    private final float f36110c;

    /* renamed from: d  reason: collision with root package name */
    private final t0 f36111d;

    public f0() {
        this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 7, null);
    }

    public f0(float f11, float f12, float f13) {
        this.f36108a = f11;
        this.f36109b = f12;
        this.f36110c = f13;
        t0 t0Var = new t0(1.0f);
        t0Var.d(f());
        t0Var.f(g());
        this.f36111d = t0Var;
    }

    @Override // l0.d0
    public float b(float f11, float f12, float f13) {
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // l0.d0
    public float c(long j11, float f11, float f12, float f13) {
        this.f36111d.e(f12);
        return m0.b(this.f36111d.g(f11, f13, j11 / 1000000));
    }

    @Override // l0.d0
    public float d(long j11, float f11, float f12, float f13) {
        this.f36111d.e(f12);
        return m0.c(this.f36111d.g(f11, f13, j11 / 1000000));
    }

    @Override // l0.d0
    public long e(float f11, float f12, float f13) {
        float b11 = this.f36111d.b();
        float a11 = this.f36111d.a();
        float f14 = f11 - f12;
        float f15 = this.f36110c;
        return s0.b(b11, a11, f13 / f15, f14 / f15, 1.0f) * 1000000;
    }

    public final float f() {
        return this.f36108a;
    }

    public final float g() {
        return this.f36109b;
    }

    @Override // l0.i
    /* renamed from: h */
    public <V extends p> l1<V> a(d1<Float, V> d1Var) {
        return d0.a.b(this, d1Var);
    }

    public /* synthetic */ f0(float f11, float f12, float f13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1.0f : f11, (i11 & 2) != 0 ? 1500.0f : f12, (i11 & 4) != 0 ? 0.01f : f13);
    }
}