package yw;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Timezone;
import ezvcard.util.UtcOffset;

/* loaded from: classes5.dex */
public class b1 extends g1<Timezone> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f59903a;

        static {
            int[] iArr = new int[VCardVersion.values().length];
            f59903a = iArr;
            try {
                iArr[VCardVersion.V2_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59903a[VCardVersion.V3_0.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59903a[VCardVersion.V4_0.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b1() {
        super(Timezone.class, "TZ");
    }

    private Timezone j(String str, VCardDataType vCardDataType, ww.a aVar) {
        if (str != null && str.length() != 0) {
            int i11 = a.f59903a[aVar.d().ordinal()];
            if (i11 == 1) {
                try {
                    return new Timezone(UtcOffset.f(str));
                } catch (IllegalArgumentException unused) {
                    throw new CannotParseException(19, new Object[0]);
                }
            } else if (i11 != 2 && i11 != 3) {
                return new Timezone((String) null);
            } else {
                try {
                    return new Timezone(UtcOffset.f(str));
                } catch (IllegalArgumentException unused2) {
                    if (vCardDataType == VCardDataType.f25381h) {
                        aVar.a(20, new Object[0]);
                    }
                    return new Timezone(str);
                }
            }
        }
        return new Timezone((String) null);
    }

    @Override // yw.g1
    protected VCardDataType a(VCardVersion vCardVersion) {
        int i11 = a.f59903a[vCardVersion.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return VCardDataType.f25381h;
        }
        if (i11 != 3) {
            return null;
        }
        return VCardDataType.f25378e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yw.g1
    /* renamed from: i */
    public Timezone b(String str, VCardDataType vCardDataType, VCardParameters vCardParameters, ww.a aVar) {
        return j(ih.e.f(str), vCardDataType, aVar);
    }
}