package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.VCardProperty;

/* loaded from: classes5.dex */
public abstract class t0<T extends VCardProperty> extends g1<T> {

    /* renamed from: d */
    protected final VCardDataType f59914d;

    public t0(Class<T> cls, String str, VCardDataType vCardDataType) {
        super(cls, str);
        this.f59914d = vCardDataType;
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return this.f59914d;
    }

    @Override // yw.g1
    protected T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        return i(ih.e.f(str));
    }

    protected abstract T i(String str);
}