package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Geo;
import ezvcard.util.GeoUri;

/* loaded from: classes5.dex */
public class t extends g1<Geo> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59913a;

        static {
            int[] iArr = new int[VCardVersion.values().length];
            f59913a = iArr;
            try {
                iArr[VCardVersion.V2_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59913a[VCardVersion.V3_0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59913a[VCardVersion.V4_0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public t() {
        super(Geo.class, "GEO");
    }

    private Geo j(String str) {
        try {
            return new Geo(GeoUri.n(str));
        } catch (IllegalArgumentException unused) {
            throw new CannotParseException(12, new Object[0]);
        }
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        if (a.f59913a[vCardVersion.ordinal()] != 3) {
            return null;
        }
        return VCardDataType.f25377d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public Geo b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        if (str.length() == 0) {
            return new Geo((GeoUri) null);
        }
        int i11 = a.f59913a[aVar.d().ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return null;
            }
            return j(ih.e.f(str));
        }
        int indexOf = str.indexOf(59);
        if (indexOf >= 0) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            try {
                try {
                    return new Geo(Double.valueOf(substring), Double.valueOf(substring2));
                } catch (NumberFormatException unused) {
                    throw new CannotParseException(10, substring2);
                }
            } catch (NumberFormatException unused2) {
                throw new CannotParseException(8, substring);
            }
        }
        throw new CannotParseException(11, new Object[0]);
    }
}