package lp;

import com.google.zxing.l;

/* loaded from: classes2.dex */
public final class d extends l {

    /* renamed from: c  reason: collision with root package name */
    private final float f37265c;

    /* renamed from: d  reason: collision with root package name */
    private final int f37266d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(float f11, float f12, float f13) {
        this(f11, f12, f13, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(float f11, float f12, float f13) {
        if (Math.abs(f12 - d()) > f11 || Math.abs(f13 - c()) > f11) {
            return false;
        }
        float abs = Math.abs(f11 - this.f37265c);
        return abs <= 1.0f || abs <= this.f37265c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d g(float f11, float f12, float f13) {
        int i11 = this.f37266d;
        int i12 = i11 + 1;
        float c11 = (i11 * c()) + f12;
        float f14 = i12;
        return new d(c11 / f14, ((this.f37266d * d()) + f11) / f14, ((this.f37266d * this.f37265c) + f13) / f14, i12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f37266d;
    }

    public float i() {
        return this.f37265c;
    }

    private d(float f11, float f12, float f13, int i11) {
        super(f11, f12);
        this.f37265c = f13;
        this.f37266d = i11;
    }
}