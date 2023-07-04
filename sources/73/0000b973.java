package v6;

import j7.f;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class o {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f54207a;

        static {
            int[] iArr = new int[b7.c.values().length];
            iArr[b7.c.INVALID_ILLEGAL_CHARACTERS.ordinal()] = 1;
            iArr[b7.c.INVALID_TOO_SHORT.ordinal()] = 2;
            iArr[b7.c.INVALID_TOO_LONG.ordinal()] = 3;
            iArr[b7.c.INVALID_UNSUPPORTED_BRAND.ordinal()] = 4;
            iArr[b7.c.INVALID_LUHN_CHECK.ordinal()] = 5;
            iArr[b7.c.VALID.ordinal()] = 6;
            f54207a = iArr;
        }
    }

    public final j7.a<String> a(String cardNumber, b7.c validation) {
        j7.f aVar;
        kotlin.jvm.internal.s.g(cardNumber, "cardNumber");
        kotlin.jvm.internal.s.g(validation, "validation");
        switch (a.f54207a[validation.ordinal()]) {
            case 1:
                aVar = new f.a(z.checkout_card_number_not_valid);
                break;
            case 2:
                aVar = new f.a(z.checkout_card_number_not_valid);
                break;
            case 3:
                aVar = new f.a(z.checkout_card_number_not_valid);
                break;
            case 4:
                aVar = new f.a(z.checkout_card_brand_not_supported, true);
                break;
            case 5:
                aVar = new f.a(z.checkout_card_number_not_valid);
                break;
            case 6:
                aVar = f.b.f33276a;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new j7.a<>(cardNumber, aVar);
    }
}