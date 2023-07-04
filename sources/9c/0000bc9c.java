package wg;

import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f55784a = Integer.MIN_VALUE;

    /* renamed from: b  reason: collision with root package name */
    private int f55785b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private float f55786c = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: d  reason: collision with root package name */
    private float f55787d = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: e  reason: collision with root package name */
    private long f55788e = -11;

    public float a() {
        return this.f55786c;
    }

    public float b() {
        return this.f55787d;
    }

    public boolean c(int i11, int i12) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j11 = this.f55788e;
        boolean z11 = (uptimeMillis - j11 <= 10 && this.f55784a == i11 && this.f55785b == i12) ? false : true;
        if (uptimeMillis - j11 != 0) {
            this.f55786c = (i11 - this.f55784a) / ((float) (uptimeMillis - j11));
            this.f55787d = (i12 - this.f55785b) / ((float) (uptimeMillis - j11));
        }
        this.f55788e = uptimeMillis;
        this.f55784a = i11;
        this.f55785b = i12;
        return z11;
    }
}