package b7;

import j7.f;
import kotlin.jvm.internal.s;
import v6.z;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f7527a = new g();

    private g() {
    }

    public final j7.a<String> a(String birthDateOrTaxNumber) {
        j7.f aVar;
        s.g(birthDateOrTaxNumber, "birthDateOrTaxNumber");
        int length = birthDateOrTaxNumber.length();
        if (length == 6 && m7.c.f38434a.a(birthDateOrTaxNumber, "yyMMdd")) {
            aVar = f.b.f33276a;
        } else if (length == 10) {
            aVar = f.b.f33276a;
        } else {
            aVar = new f.a(z.checkout_kcp_birth_date_or_tax_number_invalid);
        }
        return new j7.a<>(birthDateOrTaxNumber, aVar);
    }

    public final j7.a<String> b(String cardPassword) {
        j7.f aVar;
        s.g(cardPassword, "cardPassword");
        if (cardPassword.length() == 2) {
            aVar = f.b.f33276a;
        } else {
            aVar = new f.a(z.checkout_kcp_password_invalid);
        }
        return new j7.a<>(cardPassword, aVar);
    }
}