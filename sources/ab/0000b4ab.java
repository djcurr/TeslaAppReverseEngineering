package t6;

import j7.f;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final q f51698a = new q();

    private q() {
    }

    public final j7.a<String> a(String bankAccountNumber) {
        kotlin.jvm.internal.s.g(bankAccountNumber, "bankAccountNumber");
        if (bankAccountNumber.length() == 8) {
            return new j7.a<>(bankAccountNumber, f.b.f33276a);
        }
        return new j7.a<>(bankAccountNumber, new f.a(u.bacs_account_number_invalid));
    }

    public final j7.a<String> b(String holderName) {
        boolean w11;
        kotlin.jvm.internal.s.g(holderName, "holderName");
        w11 = kotlin.text.v.w(holderName);
        if (w11) {
            return new j7.a<>(holderName, new f.a(u.bacs_holder_name_invalid));
        }
        return new j7.a<>(holderName, f.b.f33276a);
    }

    public final j7.a<String> c(String shopperEmail) {
        kotlin.jvm.internal.s.g(shopperEmail, "shopperEmail");
        if (m7.d.f38435a.c(shopperEmail)) {
            return new j7.a<>(shopperEmail, f.b.f33276a);
        }
        return new j7.a<>(shopperEmail, new f.a(u.bacs_shopper_email_invalid));
    }

    public final j7.a<String> d(String sortCode) {
        kotlin.jvm.internal.s.g(sortCode, "sortCode");
        if (sortCode.length() == 6) {
            return new j7.a<>(sortCode, f.b.f33276a);
        }
        return new j7.a<>(sortCode, new f.a(u.bacs_sort_code_invalid));
    }
}