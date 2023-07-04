package wk;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class e extends d {

    /* renamed from: a  reason: collision with root package name */
    float f55975a = -1.0f;

    @Override // wk.d
    public void a(m mVar, float f11, float f12, float f13) {
        mVar.o(BitmapDescriptorFactory.HUE_RED, f13 * f12, 180.0f, 180.0f - f11);
        double d11 = f13;
        double d12 = f12;
        mVar.m((float) (Math.sin(Math.toRadians(f11)) * d11 * d12), (float) (Math.sin(Math.toRadians(90.0f - f11)) * d11 * d12));
    }
}