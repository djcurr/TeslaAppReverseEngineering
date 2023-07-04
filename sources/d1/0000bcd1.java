package wk;

import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f55973a;

    /* renamed from: b  reason: collision with root package name */
    private final float f55974b;

    public b(float f11, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f55973a;
            f11 += ((b) cVar).f55974b;
        }
        this.f55973a = cVar;
        this.f55974b = f11;
    }

    @Override // wk.c
    public float a(RectF rectF) {
        return Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f55973a.a(rectF) + this.f55974b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f55973a.equals(bVar.f55973a) && this.f55974b == bVar.f55974b;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f55973a, Float.valueOf(this.f55974b)});
    }
}