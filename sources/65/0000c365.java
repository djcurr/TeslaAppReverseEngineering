package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.TextListProperty;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class c0<T extends TextListProperty> extends g1<T> {
    public c0(Class<T> cls, String str) {
        super(cls, str);
    }

    private T k(List<String> list) {
        T i11 = i();
        i11.getValues().addAll(list);
        return i11;
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        return VCardDataType.f25378e;
    }

    protected abstract T i();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: j */
    public T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        return k(ih.e.a(str));
    }
}