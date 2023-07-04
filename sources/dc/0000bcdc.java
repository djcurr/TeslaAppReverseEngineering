package wk;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class j extends d {

    /* renamed from: a  reason: collision with root package name */
    float f56023a = -1.0f;

    @Override // wk.d
    public void a(m mVar, float f11, float f12, float f13) {
        mVar.o(BitmapDescriptorFactory.HUE_RED, f13 * f12, 180.0f, 180.0f - f11);
        float f14 = f13 * 2.0f * f12;
        mVar.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f14, f14, 180.0f, f11);
    }
}