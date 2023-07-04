package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.PlaceProperty;
import ezvcard.util.GeoUri;

/* loaded from: classes5.dex */
public abstract class l0<T extends PlaceProperty> extends g1<T> {
    public l0(Class<T> cls, String str) {
        super(cls, str);
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f25378e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        T j11 = j();
        String f11 = ih.e.f(str);
        if (vCardDataType == VCardDataType.f25378e) {
            j11.setText(f11);
            return j11;
        } else if (vCardDataType == VCardDataType.f25377d) {
            try {
                j11.setGeoUri(GeoUri.n(f11));
            } catch (IllegalArgumentException unused) {
                j11.setUri(f11);
            }
            return j11;
        } else {
            j11.setText(f11);
            return j11;
        }
    }

    protected abstract T j();
}