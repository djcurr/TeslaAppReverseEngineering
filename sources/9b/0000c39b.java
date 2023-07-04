package yw;

import ezvcard.VCardDataType;
import ezvcard.property.TextProperty;

/* loaded from: classes5.dex */
public abstract class y0<T extends TextProperty> extends t0<T> {
    public y0(Class<T> cls, String str) {
        this(cls, str, VCardDataType.f25378e);
    }

    public y0(Class<T> cls, String str, VCardDataType vCardDataType) {
        super(cls, str, vCardDataType);
    }
}