package m00;

import ch.qos.logback.classic.pattern.CallerDataConverter;

/* loaded from: classes5.dex */
final class d implements e<Float> {

    /* renamed from: a  reason: collision with root package name */
    private final float f38145a;

    /* renamed from: b  reason: collision with root package name */
    private final float f38146b;

    public d(float f11, float f12) {
        this.f38145a = f11;
        this.f38146b = f12;
    }

    @Override // m00.f
    /* renamed from: a */
    public Float b() {
        return Float.valueOf(this.f38146b);
    }

    @Override // m00.f
    /* renamed from: c */
    public Float getStart() {
        return Float.valueOf(this.f38145a);
    }

    public boolean d() {
        return this.f38145a > this.f38146b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (d() && ((d) obj).d()) {
                return true;
            }
            d dVar = (d) obj;
            if (this.f38145a == dVar.f38145a) {
                if (this.f38146b == dVar.f38146b) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (d()) {
            return -1;
        }
        return (Float.valueOf(this.f38145a).hashCode() * 31) + Float.valueOf(this.f38146b).hashCode();
    }

    public String toString() {
        return this.f38145a + CallerDataConverter.DEFAULT_RANGE_DELIMITER + this.f38146b;
    }
}