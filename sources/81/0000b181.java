package s1;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private float f49946a;

    /* renamed from: b  reason: collision with root package name */
    private float f49947b;

    /* renamed from: c  reason: collision with root package name */
    private float f49948c;

    /* renamed from: d  reason: collision with root package name */
    private float f49949d;

    public d(float f11, float f12, float f13, float f14) {
        this.f49946a = f11;
        this.f49947b = f12;
        this.f49948c = f13;
        this.f49949d = f14;
    }

    public final float a() {
        return this.f49949d;
    }

    public final float b() {
        return this.f49946a;
    }

    public final float c() {
        return this.f49948c;
    }

    public final float d() {
        return this.f49947b;
    }

    public final void e(float f11, float f12, float f13, float f14) {
        this.f49946a = Math.max(f11, this.f49946a);
        this.f49947b = Math.max(f12, this.f49947b);
        this.f49948c = Math.min(f13, this.f49948c);
        this.f49949d = Math.min(f14, this.f49949d);
    }

    public final boolean f() {
        return this.f49946a >= this.f49948c || this.f49947b >= this.f49949d;
    }

    public final void g(float f11, float f12, float f13, float f14) {
        this.f49946a = f11;
        this.f49947b = f12;
        this.f49948c = f13;
        this.f49949d = f14;
    }

    public final void h(float f11) {
        this.f49949d = f11;
    }

    public final void i(float f11) {
        this.f49946a = f11;
    }

    public final void j(float f11) {
        this.f49948c = f11;
    }

    public final void k(float f11) {
        this.f49947b = f11;
    }

    public String toString() {
        return "MutableRect(" + c.a(this.f49946a, 1) + ", " + c.a(this.f49947b, 1) + ", " + c.a(this.f49948c, 1) + ", " + c.a(this.f49949d, 1) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}