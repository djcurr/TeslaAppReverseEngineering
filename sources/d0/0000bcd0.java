package wk;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final float f55972a;

    public a(float f11) {
        this.f55972a = f11;
    }

    @Override // wk.c
    public float a(RectF rectF) {
        return this.f55972a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f55972a == ((a) obj).f55972a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f55972a)});
    }
}