package b7;

import com.adyen.checkout.card.api.model.Brand;
import j7.f;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kotlin.jvm.internal.s;
import v6.z;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f7523a = new d();

    private d() {
    }

    private final boolean a(x6.c cVar) {
        return (cVar == x6.c.f57131c || cVar.a() == 0 || cVar.b() == 0 || !d(cVar.a()) || cVar.b() <= 0) ? false : true;
    }

    private final Calendar b(x6.c cVar) {
        Calendar expiryCalendar = GregorianCalendar.getInstance();
        expiryCalendar.clear();
        expiryCalendar.set(cVar.b(), cVar.a() - 1, 1);
        expiryCalendar.add(2, 1);
        expiryCalendar.add(5, -1);
        s.f(expiryCalendar, "expiryCalendar");
        return expiryCalendar;
    }

    private final boolean c(String str) {
        int i11;
        int i12;
        String stringBuffer = new StringBuffer(str).reverse().toString();
        s.f(stringBuffer, "StringBuffer(normalizedNumber).reverse().toString()");
        int length = stringBuffer.length() - 1;
        if (length >= 0) {
            int i13 = 0;
            i11 = 0;
            i12 = 0;
            while (true) {
                int i14 = i13 + 1;
                int digit = Character.digit(stringBuffer.charAt(i13), 10);
                if (i13 % 2 == 0) {
                    i12 += digit;
                } else {
                    i11 += digit * 2;
                    if (digit >= 5) {
                        i11 -= 9;
                    }
                }
                if (i14 > length) {
                    break;
                }
                i13 = i14;
            }
        } else {
            i11 = 0;
            i12 = 0;
        }
        return (i12 + i11) % 10 == 0;
    }

    private final boolean d(int i11) {
        return 1 <= i11 && i11 <= 12;
    }

    public final c e(String number, boolean z11, boolean z12) {
        s.g(number, "number");
        String b11 = q7.d.b(number, new char[0]);
        s.f(b11, "normalize(number)");
        int length = b11.length();
        if (q7.d.a(b11, new char[0])) {
            if (length > 19) {
                return c.INVALID_TOO_LONG;
            }
            if (length < 8) {
                return c.INVALID_TOO_SHORT;
            }
            if (z12) {
                return (!z11 || c(b11)) ? c.VALID : c.INVALID_LUHN_CHECK;
            }
            return c.INVALID_UNSUPPORTED_BRAND;
        }
        return c.INVALID_ILLEGAL_CHARACTERS;
    }

    public final j7.a<x6.c> f(x6.c expiryDate, Brand.c cVar) {
        s.g(expiryDate, "expiryDate");
        j7.a<x6.c> aVar = new j7.a<>(expiryDate, new f.a(z.checkout_expiry_date_not_valid));
        if (!a(expiryDate)) {
            return (cVar != Brand.c.OPTIONAL || s.c(expiryDate, x6.c.f57132d)) ? aVar : new j7.a<>(expiryDate, f.b.f33276a);
        }
        Calendar b11 = b(expiryDate);
        Calendar gregorianCalendar = GregorianCalendar.getInstance();
        gregorianCalendar.add(1, 30);
        Calendar gregorianCalendar2 = GregorianCalendar.getInstance();
        gregorianCalendar2.add(2, -3);
        return (b11.compareTo(gregorianCalendar2) < 0 || b11.compareTo(gregorianCalendar) > 0) ? aVar : new j7.a<>(expiryDate, f.b.f33276a);
    }

    public final j7.a<String> g(String securityCode, x6.b bVar) {
        s.g(securityCode, "securityCode");
        String b11 = q7.d.b(securityCode, new char[0]);
        s.f(b11, "normalize(securityCode)");
        int length = b11.length();
        j7.f aVar = new f.a(z.checkout_security_code_not_valid);
        if (q7.d.a(b11, new char[0])) {
            if ((bVar == null ? null : bVar.d()) == Brand.c.OPTIONAL && length == 0) {
                aVar = f.b.f33276a;
            } else {
                x6.a c11 = bVar == null ? null : bVar.c();
                x6.a aVar2 = x6.a.AMERICAN_EXPRESS;
                if (c11 == aVar2 && length == 4) {
                    aVar = f.b.f33276a;
                } else {
                    if ((bVar != null ? bVar.c() : null) != aVar2 && length == 3) {
                        aVar = f.b.f33276a;
                    }
                }
            }
        }
        return new j7.a<>(b11, aVar);
    }
}