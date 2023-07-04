package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.DateOrTimeProperty;
import ezvcard.util.PartialDate;
import java.util.Date;

/* loaded from: classes5.dex */
public abstract class l<T extends DateOrTimeProperty> extends g1<T> {

    /* loaded from: classes5.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59908a;

        static {
            int[] iArr = new int[VCardVersion.values().length];
            f59908a = iArr;
            try {
                iArr[VCardVersion.V2_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59908a[VCardVersion.V3_0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59908a[VCardVersion.V4_0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(Class<T> cls, String str) {
        super(cls, str);
    }

    private T m(String str, ww.a aVar) {
        try {
            return l(g1.c(str), str.contains("T"));
        } catch (IllegalArgumentException unused) {
            if (aVar.d() != VCardVersion.V2_1 && aVar.d() != VCardVersion.V3_0) {
                try {
                    return j(PartialDate.o(str));
                } catch (IllegalArgumentException unused2) {
                    aVar.a(6, new Object[0]);
                    return k(str);
                }
            }
            throw new CannotParseException(5, new Object[0]);
        }
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        if (a.f59908a[vCardVersion.ordinal()] != 3) {
            return null;
        }
        return VCardDataType.f25379f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        String f11 = ih.e.f(str);
        if (aVar.d() == VCardVersion.V4_0 && vCardDataType == VCardDataType.f25378e) {
            return k(f11);
        }
        return m(f11, aVar);
    }

    protected abstract T j(PartialDate partialDate);

    protected abstract T k(String str);

    protected abstract T l(Date date, boolean z11);
}