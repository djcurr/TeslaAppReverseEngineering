package wk;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f56022a;

    public i(float f11) {
        this.f56022a = f11;
    }

    @Override // wk.c
    public float a(RectF rectF) {
        return this.f56022a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f56022a == ((i) obj).f56022a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f56022a)});
    }
}