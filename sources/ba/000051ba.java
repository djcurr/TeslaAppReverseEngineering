package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.model.Token;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;
import wz.w;

/* loaded from: classes6.dex */
public final class PersonTokenParams extends TokenParams {
    @Deprecated
    private static final String PARAM_ADDRESS = "address";
    @Deprecated
    private static final String PARAM_ADDRESS_KANA = "address_kana";
    @Deprecated
    private static final String PARAM_ADDRESS_KANJI = "address_kanji";
    @Deprecated
    private static final String PARAM_DOB = "dob";
    @Deprecated
    private static final String PARAM_EMAIL = "email";
    @Deprecated
    private static final String PARAM_FIRST_NAME = "first_name";
    @Deprecated
    private static final String PARAM_FIRST_NAME_KANA = "first_name_kana";
    @Deprecated
    private static final String PARAM_FIRST_NAME_KANJI = "first_name_kanji";
    @Deprecated
    private static final String PARAM_GENDER = "gender";
    @Deprecated
    private static final String PARAM_ID_NUMBER = "id_number";
    @Deprecated
    private static final String PARAM_LAST_NAME = "last_name";
    @Deprecated
    private static final String PARAM_LAST_NAME_KANA = "last_name_kana";
    @Deprecated
    private static final String PARAM_LAST_NAME_KANJI = "last_name_kanji";
    @Deprecated
    private static final String PARAM_MAIDEN_NAME = "maiden_name";
    @Deprecated
    private static final String PARAM_METADATA = "metadata";
    @Deprecated
    private static final String PARAM_PERSON = "person";
    @Deprecated
    private static final String PARAM_PHONE = "phone";
    @Deprecated
    private static final String PARAM_RELATIONSHIP = "relationship";
    @Deprecated
    private static final String PARAM_SSN_LAST_4 = "ssn_last_4";
    @Deprecated
    private static final String PARAM_VERIFICATION = "verification";
    private final Address address;
    private final AddressJapanParams addressKana;
    private final AddressJapanParams addressKanji;
    private final DateOfBirth dateOfBirth;
    private final String email;
    private final String firstName;
    private final String firstNameKana;
    private final String firstNameKanji;
    private final String gender;
    private final String idNumber;
    private final String lastName;
    private final String lastNameKana;
    private final String lastNameKanji;
    private final String maidenName;
    private final Map<String, String> metadata;
    private final String phone;
    private final Relationship relationship;
    private final String ssnLast4;
    private final Verification verification;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PersonTokenParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Builder implements ObjectBuilder<PersonTokenParams> {
        public static final int $stable = 8;
        private Address address;
        private AddressJapanParams addressKana;
        private AddressJapanParams addressKanji;
        private DateOfBirth dateOfBirth;
        private String email;
        private String firstName;
        private String firstNameKana;
        private String firstNameKanji;
        private String gender;
        private String idNumber;
        private String lastName;
        private String lastNameKana;
        private String lastNameKanji;
        private String maidenName;
        private Map<String, String> metadata;
        private String phone;
        private Relationship relationship;
        private String ssnLast4;
        private Verification verification;

        public final Builder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public final Builder setAddressKana(AddressJapanParams addressJapanParams) {
            this.addressKana = addressJapanParams;
            return this;
        }

        public final Builder setAddressKanji(AddressJapanParams addressJapanParams) {
            this.addressKanji = addressJapanParams;
            return this;
        }

        public final Builder setDateOfBirth(DateOfBirth dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public final Builder setEmail(String str) {
            this.email = str;
            return this;
        }

        public final Builder setFirstName(String str) {
            this.firstName = str;
            return this;
        }

        public final Builder setFirstNameKana(String str) {
            this.firstNameKana = str;
            return this;
        }

        public final Builder setFirstNameKanji(String str) {
            this.firstNameKanji = str;
            return this;
        }

        public final Builder setGender(String str) {
            this.gender = str;
            return this;
        }

        public final Builder setIdNumber(String str) {
            this.idNumber = str;
            return this;
        }

        public final Builder setLastName(String str) {
            this.lastName = str;
            return this;
        }

        public final Builder setLastNameKana(String str) {
            this.lastNameKana = str;
            return this;
        }

        public final Builder setLastNameKanji(String str) {
            this.lastNameKanji = str;
            return this;
        }

        public final Builder setMaidenName(String str) {
            this.maidenName = str;
            return this;
        }

        public final Builder setMetadata(Map<String, String> map) {
            this.metadata = map;
            return this;
        }

        public final Builder setPhone(String str) {
            this.phone = str;
            return this;
        }

        public final Builder setRelationship(Relationship relationship) {
            this.relationship = relationship;
            return this;
        }

        public final Builder setSsnLast4(String str) {
            this.ssnLast4 = str;
            return this;
        }

        public final Builder setVerification(Verification verification) {
            this.verification = verification;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.ObjectBuilder
        public PersonTokenParams build() {
            return new PersonTokenParams(this.address, this.addressKana, this.addressKanji, this.dateOfBirth, this.email, this.firstName, this.firstNameKana, this.firstNameKanji, this.gender, this.idNumber, this.lastName, this.lastNameKana, this.lastNameKanji, this.maidenName, this.metadata, this.phone, this.relationship, this.ssnLast4, this.verification);
        }
    }

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PersonTokenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonTokenParams createFromParcel(Parcel parcel) {
            String str;
            LinkedHashMap linkedHashMap;
            s.g(parcel, "parcel");
            Address createFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
            AddressJapanParams createFromParcel2 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
            AddressJapanParams createFromParcel3 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
            DateOfBirth createFromParcel4 = parcel.readInt() == 0 ? null : DateOfBirth.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = readString8;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                    i11++;
                    readInt = readInt;
                    readString8 = readString8;
                }
                str = readString8;
                linkedHashMap = linkedHashMap2;
            }
            return new PersonTokenParams(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, readString, readString2, readString3, readString4, readString5, readString6, readString7, str, readString9, readString10, linkedHashMap, parcel.readString(), parcel.readInt() == 0 ? null : Relationship.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Verification.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PersonTokenParams[] newArray(int i11) {
            return new PersonTokenParams[i11];
        }
    }

    public PersonTokenParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public /* synthetic */ PersonTokenParams(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, String str11, Relationship relationship, String str12, Verification verification, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : address, (i11 & 2) != 0 ? null : addressJapanParams, (i11 & 4) != 0 ? null : addressJapanParams2, (i11 & 8) != 0 ? null : dateOfBirth, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5, (i11 & 512) != 0 ? null : str6, (i11 & 1024) != 0 ? null : str7, (i11 & 2048) != 0 ? null : str8, (i11 & 4096) != 0 ? null : str9, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str10, (i11 & 16384) != 0 ? null : map, (i11 & 32768) != 0 ? null : str11, (i11 & 65536) != 0 ? null : relationship, (i11 & 131072) != 0 ? null : str12, (i11 & 262144) != 0 ? null : verification);
    }

    public final Address component1() {
        return this.address;
    }

    public final String component10() {
        return this.idNumber;
    }

    public final String component11() {
        return this.lastName;
    }

    public final String component12() {
        return this.lastNameKana;
    }

    public final String component13() {
        return this.lastNameKanji;
    }

    public final String component14() {
        return this.maidenName;
    }

    public final Map<String, String> component15() {
        return this.metadata;
    }

    public final String component16() {
        return this.phone;
    }

    public final Relationship component17() {
        return this.relationship;
    }

    public final String component18() {
        return this.ssnLast4;
    }

    public final Verification component19() {
        return this.verification;
    }

    public final AddressJapanParams component2() {
        return this.addressKana;
    }

    public final AddressJapanParams component3() {
        return this.addressKanji;
    }

    public final DateOfBirth component4() {
        return this.dateOfBirth;
    }

    public final String component5() {
        return this.email;
    }

    public final String component6() {
        return this.firstName;
    }

    public final String component7() {
        return this.firstNameKana;
    }

    public final String component8() {
        return this.firstNameKanji;
    }

    public final String component9() {
        return this.gender;
    }

    public final PersonTokenParams copy(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, Relationship relationship, String str12, Verification verification) {
        return new PersonTokenParams(address, addressJapanParams, addressJapanParams2, dateOfBirth, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, map, str11, relationship, str12, verification);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PersonTokenParams) {
            PersonTokenParams personTokenParams = (PersonTokenParams) obj;
            return s.c(this.address, personTokenParams.address) && s.c(this.addressKana, personTokenParams.addressKana) && s.c(this.addressKanji, personTokenParams.addressKanji) && s.c(this.dateOfBirth, personTokenParams.dateOfBirth) && s.c(this.email, personTokenParams.email) && s.c(this.firstName, personTokenParams.firstName) && s.c(this.firstNameKana, personTokenParams.firstNameKana) && s.c(this.firstNameKanji, personTokenParams.firstNameKanji) && s.c(this.gender, personTokenParams.gender) && s.c(this.idNumber, personTokenParams.idNumber) && s.c(this.lastName, personTokenParams.lastName) && s.c(this.lastNameKana, personTokenParams.lastNameKana) && s.c(this.lastNameKanji, personTokenParams.lastNameKanji) && s.c(this.maidenName, personTokenParams.maidenName) && s.c(this.metadata, personTokenParams.metadata) && s.c(this.phone, personTokenParams.phone) && s.c(this.relationship, personTokenParams.relationship) && s.c(this.ssnLast4, personTokenParams.ssnLast4) && s.c(this.verification, personTokenParams.verification);
        }
        return false;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final AddressJapanParams getAddressKana() {
        return this.addressKana;
    }

    public final AddressJapanParams getAddressKanji() {
        return this.addressKanji;
    }

    public final DateOfBirth getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getFirstNameKana() {
        return this.firstNameKana;
    }

    public final String getFirstNameKanji() {
        return this.firstNameKanji;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getIdNumber() {
        return this.idNumber;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getLastNameKana() {
        return this.lastNameKana;
    }

    public final String getLastNameKanji() {
        return this.lastNameKanji;
    }

    public final String getMaidenName() {
        return this.maidenName;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final Relationship getRelationship() {
        return this.relationship;
    }

    public final String getSsnLast4() {
        return this.ssnLast4;
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        List<p> l11;
        Map<String, Object> i11;
        p[] pVarArr = new p[19];
        Address address = this.address;
        pVarArr[0] = v.a("address", address == null ? null : address.toParamMap());
        AddressJapanParams addressJapanParams = this.addressKana;
        pVarArr[1] = v.a(PARAM_ADDRESS_KANA, addressJapanParams == null ? null : addressJapanParams.toParamMap());
        AddressJapanParams addressJapanParams2 = this.addressKanji;
        pVarArr[2] = v.a(PARAM_ADDRESS_KANJI, addressJapanParams2 == null ? null : addressJapanParams2.toParamMap());
        DateOfBirth dateOfBirth = this.dateOfBirth;
        pVarArr[3] = v.a(PARAM_DOB, dateOfBirth == null ? null : dateOfBirth.toParamMap());
        pVarArr[4] = v.a("email", this.email);
        pVarArr[5] = v.a(PARAM_FIRST_NAME, this.firstName);
        pVarArr[6] = v.a(PARAM_FIRST_NAME_KANA, this.firstNameKana);
        pVarArr[7] = v.a(PARAM_FIRST_NAME_KANJI, this.firstNameKanji);
        pVarArr[8] = v.a(PARAM_GENDER, this.gender);
        pVarArr[9] = v.a(PARAM_ID_NUMBER, this.idNumber);
        pVarArr[10] = v.a(PARAM_LAST_NAME, this.lastName);
        pVarArr[11] = v.a(PARAM_LAST_NAME_KANA, this.lastNameKana);
        pVarArr[12] = v.a(PARAM_LAST_NAME_KANJI, this.lastNameKanji);
        pVarArr[13] = v.a(PARAM_MAIDEN_NAME, this.maidenName);
        pVarArr[14] = v.a(PARAM_METADATA, this.metadata);
        pVarArr[15] = v.a("phone", this.phone);
        Relationship relationship = this.relationship;
        pVarArr[16] = v.a(PARAM_RELATIONSHIP, relationship == null ? null : relationship.toParamMap());
        pVarArr[17] = v.a(PARAM_SSN_LAST_4, this.ssnLast4);
        Verification verification = this.verification;
        pVarArr[18] = v.a(PARAM_VERIFICATION, verification == null ? null : verification.toParamMap());
        l11 = w.l(pVarArr);
        i11 = s0.i();
        for (p pVar : l11) {
            String str = (String) pVar.a();
            Object b11 = pVar.b();
            Map f11 = b11 == null ? null : r0.f(v.a(str, b11));
            if (f11 == null) {
                f11 = s0.i();
            }
            i11 = s0.p(i11, f11);
        }
        return i11;
    }

    public final Verification getVerification() {
        return this.verification;
    }

    public int hashCode() {
        Address address = this.address;
        int hashCode = (address == null ? 0 : address.hashCode()) * 31;
        AddressJapanParams addressJapanParams = this.addressKana;
        int hashCode2 = (hashCode + (addressJapanParams == null ? 0 : addressJapanParams.hashCode())) * 31;
        AddressJapanParams addressJapanParams2 = this.addressKanji;
        int hashCode3 = (hashCode2 + (addressJapanParams2 == null ? 0 : addressJapanParams2.hashCode())) * 31;
        DateOfBirth dateOfBirth = this.dateOfBirth;
        int hashCode4 = (hashCode3 + (dateOfBirth == null ? 0 : dateOfBirth.hashCode())) * 31;
        String str = this.email;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.firstName;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstNameKana;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstNameKanji;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.gender;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.idNumber;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lastName;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastNameKana;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.lastNameKanji;
        int hashCode13 = (hashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.maidenName;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        int hashCode15 = (hashCode14 + (map == null ? 0 : map.hashCode())) * 31;
        String str11 = this.phone;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Relationship relationship = this.relationship;
        int hashCode17 = (hashCode16 + (relationship == null ? 0 : relationship.hashCode())) * 31;
        String str12 = this.ssnLast4;
        int hashCode18 = (hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Verification verification = this.verification;
        return hashCode18 + (verification != null ? verification.hashCode() : 0);
    }

    public String toString() {
        return "PersonTokenParams(address=" + this.address + ", addressKana=" + this.addressKana + ", addressKanji=" + this.addressKanji + ", dateOfBirth=" + this.dateOfBirth + ", email=" + ((Object) this.email) + ", firstName=" + ((Object) this.firstName) + ", firstNameKana=" + ((Object) this.firstNameKana) + ", firstNameKanji=" + ((Object) this.firstNameKanji) + ", gender=" + ((Object) this.gender) + ", idNumber=" + ((Object) this.idNumber) + ", lastName=" + ((Object) this.lastName) + ", lastNameKana=" + ((Object) this.lastNameKana) + ", lastNameKanji=" + ((Object) this.lastNameKanji) + ", maidenName=" + ((Object) this.maidenName) + ", metadata=" + this.metadata + ", phone=" + ((Object) this.phone) + ", relationship=" + this.relationship + ", ssnLast4=" + ((Object) this.ssnLast4) + ", verification=" + this.verification + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        Address address = this.address;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i11);
        }
        AddressJapanParams addressJapanParams = this.addressKana;
        if (addressJapanParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            addressJapanParams.writeToParcel(out, i11);
        }
        AddressJapanParams addressJapanParams2 = this.addressKanji;
        if (addressJapanParams2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            addressJapanParams2.writeToParcel(out, i11);
        }
        DateOfBirth dateOfBirth = this.dateOfBirth;
        if (dateOfBirth == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dateOfBirth.writeToParcel(out, i11);
        }
        out.writeString(this.email);
        out.writeString(this.firstName);
        out.writeString(this.firstNameKana);
        out.writeString(this.firstNameKanji);
        out.writeString(this.gender);
        out.writeString(this.idNumber);
        out.writeString(this.lastName);
        out.writeString(this.lastNameKana);
        out.writeString(this.lastNameKanji);
        out.writeString(this.maidenName);
        Map<String, String> map = this.metadata;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                out.writeString(entry.getKey());
                out.writeString(entry.getValue());
            }
        }
        out.writeString(this.phone);
        Relationship relationship = this.relationship;
        if (relationship == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            relationship.writeToParcel(out, i11);
        }
        out.writeString(this.ssnLast4);
        Verification verification = this.verification;
        if (verification == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        verification.writeToParcel(out, i11);
    }

    public PersonTokenParams(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, Relationship relationship, String str12, Verification verification) {
        super(Token.Type.Person, null, 2, null);
        this.address = address;
        this.addressKana = addressJapanParams;
        this.addressKanji = addressJapanParams2;
        this.dateOfBirth = dateOfBirth;
        this.email = str;
        this.firstName = str2;
        this.firstNameKana = str3;
        this.firstNameKanji = str4;
        this.gender = str5;
        this.idNumber = str6;
        this.lastName = str7;
        this.lastNameKana = str8;
        this.lastNameKanji = str9;
        this.maidenName = str10;
        this.metadata = map;
        this.phone = str11;
        this.relationship = relationship;
        this.ssnLast4 = str12;
        this.verification = verification;
    }

    /* loaded from: classes6.dex */
    public static final class Document implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_BACK = "back";
        @Deprecated
        private static final String PARAM_FRONT = "front";
        private final String back;
        private final String front;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Document> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Document> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Document createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Document(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Document[] newArray(int i11) {
                return new Document[i11];
            }
        }

        public Document() {
            this(null, null, 3, null);
        }

        public Document(String str) {
            this(str, null, 2, null);
        }

        public Document(String str, String str2) {
            this.front = str;
            this.back = str2;
        }

        public static /* synthetic */ Document copy$default(Document document, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = document.front;
            }
            if ((i11 & 2) != 0) {
                str2 = document.back;
            }
            return document.copy(str, str2);
        }

        public final String component1() {
            return this.front;
        }

        public final String component2() {
            return this.back;
        }

        public final Document copy(String str, String str2) {
            return new Document(str, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Document) {
                Document document = (Document) obj;
                return s.c(this.front, document.front) && s.c(this.back, document.back);
            }
            return false;
        }

        public final String getBack() {
            return this.back;
        }

        public final String getFront() {
            return this.front;
        }

        public int hashCode() {
            String str = this.front;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.back;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<p> l11;
            Map<String, Object> i11;
            l11 = w.l(v.a(PARAM_BACK, this.back), v.a(PARAM_FRONT, this.front));
            i11 = s0.i();
            for (p pVar : l11) {
                String str = (String) pVar.a();
                String str2 = (String) pVar.b();
                Map f11 = str2 == null ? null : r0.f(v.a(str, str2));
                if (f11 == null) {
                    f11 = s0.i();
                }
                i11 = s0.p(i11, f11);
            }
            return i11;
        }

        public String toString() {
            return "Document(front=" + ((Object) this.front) + ", back=" + ((Object) this.back) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.front);
            out.writeString(this.back);
        }

        public /* synthetic */ Document(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Verification implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        @Deprecated
        private static final String PARAM_ADDITIONAL_DOCUMENT = "additional_document";
        @Deprecated
        private static final String PARAM_DOCUMENT = "document";
        private final Document additionalDocument;
        private final Document document;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Verification> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Verification> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Verification createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Verification(parcel.readInt() == 0 ? null : Document.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Document.CREATOR.createFromParcel(parcel) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Verification[] newArray(int i11) {
                return new Verification[i11];
            }
        }

        public Verification() {
            this(null, null, 3, null);
        }

        public Verification(Document document) {
            this(document, null, 2, null);
        }

        public Verification(Document document, Document document2) {
            this.document = document;
            this.additionalDocument = document2;
        }

        public static /* synthetic */ Verification copy$default(Verification verification, Document document, Document document2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                document = verification.document;
            }
            if ((i11 & 2) != 0) {
                document2 = verification.additionalDocument;
            }
            return verification.copy(document, document2);
        }

        public final Document component1() {
            return this.document;
        }

        public final Document component2() {
            return this.additionalDocument;
        }

        public final Verification copy(Document document, Document document2) {
            return new Verification(document, document2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Verification) {
                Verification verification = (Verification) obj;
                return s.c(this.document, verification.document) && s.c(this.additionalDocument, verification.additionalDocument);
            }
            return false;
        }

        public final Document getAdditionalDocument() {
            return this.additionalDocument;
        }

        public final Document getDocument() {
            return this.document;
        }

        public int hashCode() {
            Document document = this.document;
            int hashCode = (document == null ? 0 : document.hashCode()) * 31;
            Document document2 = this.additionalDocument;
            return hashCode + (document2 != null ? document2.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<p> l11;
            Map<String, Object> i11;
            p[] pVarArr = new p[2];
            Document document = this.document;
            pVarArr[0] = v.a(PARAM_ADDITIONAL_DOCUMENT, document == null ? null : document.toParamMap());
            Document document2 = this.additionalDocument;
            pVarArr[1] = v.a(PARAM_DOCUMENT, document2 == null ? null : document2.toParamMap());
            l11 = w.l(pVarArr);
            i11 = s0.i();
            for (p pVar : l11) {
                String str = (String) pVar.a();
                Map map = (Map) pVar.b();
                Map f11 = map == null ? null : r0.f(v.a(str, map));
                if (f11 == null) {
                    f11 = s0.i();
                }
                i11 = s0.p(i11, f11);
            }
            return i11;
        }

        public String toString() {
            return "Verification(document=" + this.document + ", additionalDocument=" + this.additionalDocument + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            Document document = this.document;
            if (document == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                document.writeToParcel(out, i11);
            }
            Document document2 = this.additionalDocument;
            if (document2 == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            document2.writeToParcel(out, i11);
        }

        public /* synthetic */ Verification(Document document, Document document2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : document, (i11 & 2) != 0 ? null : document2);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Relationship implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_DIRECTOR = "director";
        @Deprecated
        private static final String PARAM_EXECUTIVE = "executive";
        @Deprecated
        private static final String PARAM_OWNER = "owner";
        @Deprecated
        private static final String PARAM_PERCENT_OWNERSHIP = "percent_ownership";
        @Deprecated
        private static final String PARAM_REPRESENTATIVE = "representative";
        @Deprecated
        private static final String PARAM_TITLE = "title";
        private final Boolean director;
        private final Boolean executive;
        private final Boolean owner;
        private final Integer percentOwnership;
        private final Boolean representative;
        private final String title;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Relationship> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Builder implements ObjectBuilder<Relationship> {
            public static final int $stable = 8;
            private Boolean director;
            private Boolean executive;
            private Boolean owner;
            private Integer percentOwnership;
            private Boolean representative;
            private String title;

            public final Builder setDirector(Boolean bool) {
                this.director = bool;
                return this;
            }

            public final Builder setExecutive(Boolean bool) {
                this.executive = bool;
                return this;
            }

            public final Builder setOwner(Boolean bool) {
                this.owner = bool;
                return this;
            }

            public final Builder setPercentOwnership(Integer num) {
                this.percentOwnership = num;
                return this;
            }

            public final Builder setRepresentative(Boolean bool) {
                this.representative = bool;
                return this;
            }

            public final Builder setTitle(String str) {
                this.title = str;
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Relationship build() {
                return new Relationship(this.director, this.executive, this.owner, this.percentOwnership, this.representative, this.title);
            }
        }

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Relationship> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Relationship createFromParcel(Parcel parcel) {
                Boolean valueOf;
                Boolean valueOf2;
                Boolean valueOf3;
                Boolean valueOf4;
                s.g(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                }
                Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Relationship(valueOf, valueOf2, valueOf3, valueOf5, valueOf4, parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Relationship[] newArray(int i11) {
                return new Relationship[i11];
            }
        }

        public Relationship() {
            this(null, null, null, null, null, null, 63, null);
        }

        public Relationship(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str) {
            this.director = bool;
            this.executive = bool2;
            this.owner = bool3;
            this.percentOwnership = num;
            this.representative = bool4;
            this.title = str;
        }

        public static /* synthetic */ Relationship copy$default(Relationship relationship, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = relationship.director;
            }
            if ((i11 & 2) != 0) {
                bool2 = relationship.executive;
            }
            Boolean bool5 = bool2;
            if ((i11 & 4) != 0) {
                bool3 = relationship.owner;
            }
            Boolean bool6 = bool3;
            if ((i11 & 8) != 0) {
                num = relationship.percentOwnership;
            }
            Integer num2 = num;
            if ((i11 & 16) != 0) {
                bool4 = relationship.representative;
            }
            Boolean bool7 = bool4;
            if ((i11 & 32) != 0) {
                str = relationship.title;
            }
            return relationship.copy(bool, bool5, bool6, num2, bool7, str);
        }

        public final Boolean component1() {
            return this.director;
        }

        public final Boolean component2() {
            return this.executive;
        }

        public final Boolean component3() {
            return this.owner;
        }

        public final Integer component4() {
            return this.percentOwnership;
        }

        public final Boolean component5() {
            return this.representative;
        }

        public final String component6() {
            return this.title;
        }

        public final Relationship copy(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str) {
            return new Relationship(bool, bool2, bool3, num, bool4, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Relationship) {
                Relationship relationship = (Relationship) obj;
                return s.c(this.director, relationship.director) && s.c(this.executive, relationship.executive) && s.c(this.owner, relationship.owner) && s.c(this.percentOwnership, relationship.percentOwnership) && s.c(this.representative, relationship.representative) && s.c(this.title, relationship.title);
            }
            return false;
        }

        public final Boolean getDirector() {
            return this.director;
        }

        public final Boolean getExecutive() {
            return this.executive;
        }

        public final Boolean getOwner() {
            return this.owner;
        }

        public final Integer getPercentOwnership() {
            return this.percentOwnership;
        }

        public final Boolean getRepresentative() {
            return this.representative;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            Boolean bool = this.director;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.executive;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.owner;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Integer num = this.percentOwnership;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool4 = this.representative;
            int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
            String str = this.title;
            return hashCode5 + (str != null ? str.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<p> l11;
            Map<String, Object> i11;
            l11 = w.l(v.a(PARAM_DIRECTOR, this.director), v.a(PARAM_EXECUTIVE, this.executive), v.a(PARAM_OWNER, this.owner), v.a(PARAM_PERCENT_OWNERSHIP, this.percentOwnership), v.a(PARAM_REPRESENTATIVE, this.representative), v.a("title", this.title));
            i11 = s0.i();
            for (p pVar : l11) {
                String str = (String) pVar.a();
                Object b11 = pVar.b();
                Map f11 = b11 == null ? null : r0.f(v.a(str, b11));
                if (f11 == null) {
                    f11 = s0.i();
                }
                i11 = s0.p(i11, f11);
            }
            return i11;
        }

        public String toString() {
            return "Relationship(director=" + this.director + ", executive=" + this.executive + ", owner=" + this.owner + ", percentOwnership=" + this.percentOwnership + ", representative=" + this.representative + ", title=" + ((Object) this.title) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            Boolean bool = this.director;
            if (bool == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool.booleanValue() ? 1 : 0);
            }
            Boolean bool2 = this.executive;
            if (bool2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool2.booleanValue() ? 1 : 0);
            }
            Boolean bool3 = this.owner;
            if (bool3 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool3.booleanValue() ? 1 : 0);
            }
            Integer num = this.percentOwnership;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Boolean bool4 = this.representative;
            if (bool4 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool4.booleanValue() ? 1 : 0);
            }
            out.writeString(this.title);
        }

        public /* synthetic */ Relationship(Boolean bool, Boolean bool2, Boolean bool3, Integer num, Boolean bool4, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : bool2, (i11 & 4) != 0 ? null : bool3, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : bool4, (i11 & 32) != 0 ? null : str);
        }
    }
}