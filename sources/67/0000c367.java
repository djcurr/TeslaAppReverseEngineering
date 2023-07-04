package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.MediaTypeParameter;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.BinaryProperty;

/* loaded from: classes5.dex */
public abstract class d<T extends BinaryProperty<U>, U extends MediaTypeParameter> extends g1<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59904a;

        static {
            int[] iArr = new int[VCardVersion.values().length];
            f59904a = iArr;
            try {
                iArr[VCardVersion.V2_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59904a[VCardVersion.V3_0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59904a[VCardVersion.V4_0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public d(Class<T> cls, String str) {
        super(cls, str);
    }

    protected static String p(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1 || str.lastIndexOf(47) > lastIndexOf) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    private T q(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, VCardVersion vCardVersion) {
        U r11 = r(str, vCardParameters, vCardVersion);
        int i11 = a.f59904a[vCardVersion.ordinal()];
        if (i11 == 1 || i11 == 2) {
            if (vCardDataType != VCardDataType.f25376c && vCardDataType != VCardDataType.f25377d) {
                ezvcard.parameter.a q11 = vCardParameters.q();
                if (q11 == ezvcard.parameter.a.f25407c || q11 == ezvcard.parameter.a.f25408d) {
                    return m(ax.a.p(str), r11);
                }
            } else {
                return l(str, r11);
            }
        } else if (i11 == 3) {
            try {
                ezvcard.util.d c11 = ezvcard.util.d.c(str);
                U j11 = j(c11.a());
                try {
                    return m(c11.b(), j11);
                } catch (IllegalArgumentException unused) {
                    r11 = j11;
                }
            } catch (IllegalArgumentException unused2) {
            }
        }
        return o(str, vCardVersion, r11);
    }

    private U r(String str, VCardParameters vCardParameters, VCardVersion vCardVersion) {
        String w11;
        int i11 = a.f59904a[vCardVersion.ordinal()];
        if (i11 == 1 || i11 == 2) {
            String B = vCardParameters.B();
            if (B != null) {
                return k(B);
            }
        } else if (i11 == 3 && (w11 = vCardParameters.w()) != null) {
            return j(w11);
        }
        String p11 = p(str);
        if (p11 == null) {
            return null;
        }
        return i(p11);
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        if (a.f59904a[vCardVersion.ordinal()] != 3) {
            return null;
        }
        return VCardDataType.f25377d;
    }

    protected abstract U i(String str);

    protected abstract U j(String str);

    protected abstract U k(String str);

    protected abstract T l(String str, U u11);

    protected abstract T m(byte[] bArr, U u11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: n */
    public T b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        return q(ih.e.f(str), vCardDataType, vCardParameters, aVar.d());
    }

    protected T o(String str, VCardVersion vCardVersion, U u11) {
        int i11 = a.f59904a[vCardVersion.ordinal()];
        if (i11 == 1 || i11 == 2) {
            if (str.startsWith("http")) {
                return l(str, u11);
            }
            return m(ax.a.p(str), u11);
        } else if (i11 != 3) {
            return null;
        } else {
            return l(str, u11);
        }
    }
}