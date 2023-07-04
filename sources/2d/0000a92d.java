package p1;

import java.util.HashMap;
import kotlin.jvm.internal.s;
import vz.v;
import wz.s0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final HashMap<j, String> f45454a;

    static {
        HashMap<j, String> k11;
        k11 = s0.k(v.a(j.EmailAddress, "emailAddress"), v.a(j.Username, "username"), v.a(j.Password, "password"), v.a(j.NewUsername, "newUsername"), v.a(j.NewPassword, "newPassword"), v.a(j.PostalAddress, "postalAddress"), v.a(j.PostalCode, "postalCode"), v.a(j.CreditCardNumber, "creditCardNumber"), v.a(j.CreditCardSecurityCode, "creditCardSecurityCode"), v.a(j.CreditCardExpirationDate, "creditCardExpirationDate"), v.a(j.CreditCardExpirationMonth, "creditCardExpirationMonth"), v.a(j.CreditCardExpirationYear, "creditCardExpirationYear"), v.a(j.CreditCardExpirationDay, "creditCardExpirationDay"), v.a(j.AddressCountry, "addressCountry"), v.a(j.AddressRegion, "addressRegion"), v.a(j.AddressLocality, "addressLocality"), v.a(j.AddressStreet, "streetAddress"), v.a(j.AddressAuxiliaryDetails, "extendedAddress"), v.a(j.PostalCodeExtended, "extendedPostalCode"), v.a(j.PersonFullName, "personName"), v.a(j.PersonFirstName, "personGivenName"), v.a(j.PersonLastName, "personFamilyName"), v.a(j.PersonMiddleName, "personMiddleName"), v.a(j.PersonMiddleInitial, "personMiddleInitial"), v.a(j.PersonNamePrefix, "personNamePrefix"), v.a(j.PersonNameSuffix, "personNameSuffix"), v.a(j.PhoneNumber, "phoneNumber"), v.a(j.PhoneNumberDevice, "phoneNumberDevice"), v.a(j.PhoneCountryCode, "phoneCountryCode"), v.a(j.PhoneNumberNational, "phoneNational"), v.a(j.Gender, "gender"), v.a(j.BirthDateFull, "birthDateFull"), v.a(j.BirthDateDay, "birthDateDay"), v.a(j.BirthDateMonth, "birthDateMonth"), v.a(j.BirthDateYear, "birthDateYear"), v.a(j.SmsOtpCode, "smsOTPCode"));
        f45454a = k11;
    }

    public static final String a(j jVar) {
        s.g(jVar, "<this>");
        String str = f45454a.get(jVar);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Unsupported autofill type".toString());
    }
}