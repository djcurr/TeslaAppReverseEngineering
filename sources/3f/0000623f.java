package com.withpersona.sdk.inquiry;

import java.util.Date;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u0013\u0014B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk/inquiry/Attributes;", "", "Ljava/util/Date;", "birthdate", "Ljava/util/Date;", "getBirthdate", "()Ljava/util/Date;", "Lcom/withpersona/sdk/inquiry/Attributes$Name;", "name", "Lcom/withpersona/sdk/inquiry/Attributes$Name;", "getName", "()Lcom/withpersona/sdk/inquiry/Attributes$Name;", "Lcom/withpersona/sdk/inquiry/Attributes$Address;", "address", "Lcom/withpersona/sdk/inquiry/Attributes$Address;", "getAddress", "()Lcom/withpersona/sdk/inquiry/Attributes$Address;", "<init>", "(Ljava/util/Date;Lcom/withpersona/sdk/inquiry/Attributes$Name;Lcom/withpersona/sdk/inquiry/Attributes$Address;)V", "Address", "Name", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class Attributes {
    private final Address address;
    private final Date birthdate;
    private final Name name;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/withpersona/sdk/inquiry/Attributes$Address;", "", "", "street1", "Ljava/lang/String;", "getStreet1", "()Ljava/lang/String;", "street2", "getStreet2", "city", "getCity", "subdivision", "getSubdivision", "subdivisionAbbr", "getSubdivisionAbbr", "postalCode", "getPostalCode", "countryCode", "getCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class Address {
        private final String city;
        private final String countryCode;
        private final String postalCode;
        private final String street1;
        private final String street2;
        private final String subdivision;
        private final String subdivisionAbbr;

        public Address(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.street1 = str;
            this.street2 = str2;
            this.city = str3;
            this.subdivision = str4;
            this.subdivisionAbbr = str5;
            this.postalCode = str6;
            this.countryCode = str7;
        }

        public final String getCity() {
            return this.city;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public final String getStreet1() {
            return this.street1;
        }

        public final String getStreet2() {
            return this.street2;
        }

        public final String getSubdivision() {
            return this.subdivision;
        }

        public final String getSubdivisionAbbr() {
            return this.subdivisionAbbr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk/inquiry/Attributes$Name;", "", "", "first", "Ljava/lang/String;", "getFirst", "()Ljava/lang/String;", "middle", "getMiddle", "last", "getLast", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "inquiry-public_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes2.dex */
    public static final class Name {
        private final String first;
        private final String last;
        private final String middle;

        public Name(String str, String str2, String str3) {
            this.first = str;
            this.middle = str2;
            this.last = str3;
        }

        public final String getFirst() {
            return this.first;
        }

        public final String getLast() {
            return this.last;
        }

        public final String getMiddle() {
            return this.middle;
        }
    }

    public Attributes(Date date, Name name, Address address) {
        this.birthdate = date;
        this.name = name;
        this.address = address;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final Date getBirthdate() {
        return this.birthdate;
    }

    public final Name getName() {
        return this.name;
    }
}