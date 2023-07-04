package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.model.Token;
import ezvcard.property.Kind;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;
import wz.w;

/* loaded from: classes6.dex */
public final class AccountParams extends TokenParams {
    private static final String PARAM_BUSINESS_TYPE = "business_type";
    private static final String PARAM_TOS_SHOWN_AND_ACCEPTED = "tos_shown_and_accepted";
    private final BusinessTypeParams businessTypeParams;
    private final boolean tosShownAndAccepted;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AccountParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public enum BusinessType {
        Individual(Kind.INDIVIDUAL),
        Company("company");
        
        private final String code;

        BusinessType(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class BusinessTypeParams implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        private final BusinessType type;

        /* loaded from: classes6.dex */
        public static final class Company extends BusinessTypeParams {
            @Deprecated
            private static final String PARAM_ADDRESS = "address";
            @Deprecated
            private static final String PARAM_ADDRESS_KANA = "address_kana";
            @Deprecated
            private static final String PARAM_ADDRESS_KANJI = "address_kanji";
            @Deprecated
            private static final String PARAM_DIRECTORS_PROVIDED = "directors_provided";
            @Deprecated
            private static final String PARAM_EXECUTIVES_PROVIDED = "executives_provided";
            @Deprecated
            private static final String PARAM_NAME = "name";
            @Deprecated
            private static final String PARAM_NAME_KANA = "name_kana";
            @Deprecated
            private static final String PARAM_NAME_KANJI = "name_kanji";
            @Deprecated
            private static final String PARAM_OWNERS_PROVIDED = "owners_provided";
            @Deprecated
            private static final String PARAM_PHONE = "phone";
            @Deprecated
            private static final String PARAM_TAX_ID = "tax_id";
            @Deprecated
            private static final String PARAM_TAX_ID_REGISTRAR = "tax_id_registrar";
            @Deprecated
            private static final String PARAM_VAT_ID = "vat_id";
            @Deprecated
            private static final String PARAM_VERIFICATION = "verification";
            private Address address;
            private AddressJapanParams addressKana;
            private AddressJapanParams addressKanji;
            private Boolean directorsProvided;
            private Boolean executivesProvided;
            private String name;
            private String nameKana;
            private String nameKanji;
            private Boolean ownersProvided;
            private String phone;
            private String taxId;
            private String taxIdRegistrar;
            private String vatId;
            private Verification verification;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Company> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Builder implements ObjectBuilder<Company> {
                public static final int $stable = 8;
                private Address address;
                private AddressJapanParams addressKana;
                private AddressJapanParams addressKanji;
                private Boolean directorsProvided;
                private Boolean executivesProvided;
                private String name;
                private String nameKana;
                private String nameKanji;
                private Boolean ownersProvided;
                private String phone;
                private String taxId;
                private String taxIdRegistrar;
                private String vatId;
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

                public final Builder setDirectorsProvided(Boolean bool) {
                    this.directorsProvided = bool;
                    return this;
                }

                public final Builder setExecutivesProvided(Boolean bool) {
                    this.executivesProvided = bool;
                    return this;
                }

                public final Builder setName(String str) {
                    this.name = str;
                    return this;
                }

                public final Builder setNameKana(String str) {
                    this.nameKana = str;
                    return this;
                }

                public final Builder setNameKanji(String str) {
                    this.nameKanji = str;
                    return this;
                }

                public final Builder setOwnersProvided(Boolean bool) {
                    this.ownersProvided = bool;
                    return this;
                }

                public final Builder setPhone(String str) {
                    this.phone = str;
                    return this;
                }

                public final Builder setTaxId(String str) {
                    this.taxId = str;
                    return this;
                }

                public final Builder setTaxIdRegistrar(String str) {
                    this.taxIdRegistrar = str;
                    return this;
                }

                public final Builder setVatId(String str) {
                    this.vatId = str;
                    return this;
                }

                public final Builder setVerification(Verification verification) {
                    this.verification = verification;
                    return this;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.stripe.android.ObjectBuilder
                public Company build() {
                    return new Company(this.address, this.addressKana, this.addressKanji, this.directorsProvided, this.executivesProvided, this.name, this.nameKana, this.nameKanji, this.ownersProvided, this.phone, this.taxId, this.taxIdRegistrar, this.vatId, this.verification);
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
            public static final class Creator implements Parcelable.Creator<Company> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Company createFromParcel(Parcel parcel) {
                    Boolean valueOf;
                    Boolean valueOf2;
                    Boolean valueOf3;
                    s.g(parcel, "parcel");
                    Address createFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
                    AddressJapanParams createFromParcel2 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
                    AddressJapanParams createFromParcel3 = parcel.readInt() == 0 ? null : AddressJapanParams.CREATOR.createFromParcel(parcel);
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
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Company(createFromParcel, createFromParcel2, createFromParcel3, valueOf, valueOf2, readString, readString2, readString3, valueOf3, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Verification.CREATOR.createFromParcel(parcel) : null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Company[] newArray(int i11) {
                    return new Company[i11];
                }
            }

            public Company() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }

            public /* synthetic */ Company(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Verification verification, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : address, (i11 & 2) != 0 ? null : addressJapanParams, (i11 & 4) != 0 ? null : addressJapanParams2, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : bool2, (i11 & 32) != 0 ? null : str, (i11 & 64) != 0 ? null : str2, (i11 & 128) != 0 ? null : str3, (i11 & 256) != 0 ? Boolean.FALSE : bool3, (i11 & 512) != 0 ? null : str4, (i11 & 1024) != 0 ? null : str5, (i11 & 2048) != 0 ? null : str6, (i11 & 4096) != 0 ? null : str7, (i11 & PKIFailureInfo.certRevoked) == 0 ? verification : null);
            }

            public final Address component1() {
                return this.address;
            }

            public final String component10() {
                return this.phone;
            }

            public final String component11() {
                return this.taxId;
            }

            public final String component12() {
                return this.taxIdRegistrar;
            }

            public final String component13() {
                return this.vatId;
            }

            public final Verification component14() {
                return this.verification;
            }

            public final AddressJapanParams component2() {
                return this.addressKana;
            }

            public final AddressJapanParams component3() {
                return this.addressKanji;
            }

            public final Boolean component4() {
                return this.directorsProvided;
            }

            public final Boolean component5() {
                return this.executivesProvided;
            }

            public final String component6() {
                return this.name;
            }

            public final String component7() {
                return this.nameKana;
            }

            public final String component8() {
                return this.nameKanji;
            }

            public final Boolean component9() {
                return this.ownersProvided;
            }

            public final Company copy(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Verification verification) {
                return new Company(address, addressJapanParams, addressJapanParams2, bool, bool2, str, str2, str3, bool3, str4, str5, str6, str7, verification);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Company) {
                    Company company = (Company) obj;
                    return s.c(this.address, company.address) && s.c(this.addressKana, company.addressKana) && s.c(this.addressKanji, company.addressKanji) && s.c(this.directorsProvided, company.directorsProvided) && s.c(this.executivesProvided, company.executivesProvided) && s.c(this.name, company.name) && s.c(this.nameKana, company.nameKana) && s.c(this.nameKanji, company.nameKanji) && s.c(this.ownersProvided, company.ownersProvided) && s.c(this.phone, company.phone) && s.c(this.taxId, company.taxId) && s.c(this.taxIdRegistrar, company.taxIdRegistrar) && s.c(this.vatId, company.vatId) && s.c(this.verification, company.verification);
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

            public final Boolean getDirectorsProvided() {
                return this.directorsProvided;
            }

            public final Boolean getExecutivesProvided() {
                return this.executivesProvided;
            }

            public final String getName() {
                return this.name;
            }

            public final String getNameKana() {
                return this.nameKana;
            }

            public final String getNameKanji() {
                return this.nameKanji;
            }

            public final Boolean getOwnersProvided() {
                return this.ownersProvided;
            }

            @Override // com.stripe.android.model.AccountParams.BusinessTypeParams
            public List<p<String, Object>> getParamsList() {
                List<p<String, Object>> l11;
                p[] pVarArr = new p[14];
                Address address = this.address;
                pVarArr[0] = v.a("address", address == null ? null : address.toParamMap());
                AddressJapanParams addressJapanParams = this.addressKana;
                pVarArr[1] = v.a(PARAM_ADDRESS_KANA, addressJapanParams == null ? null : addressJapanParams.toParamMap());
                AddressJapanParams addressJapanParams2 = this.addressKanji;
                pVarArr[2] = v.a(PARAM_ADDRESS_KANJI, addressJapanParams2 == null ? null : addressJapanParams2.toParamMap());
                pVarArr[3] = v.a(PARAM_DIRECTORS_PROVIDED, this.directorsProvided);
                pVarArr[4] = v.a(PARAM_EXECUTIVES_PROVIDED, this.executivesProvided);
                pVarArr[5] = v.a("name", this.name);
                pVarArr[6] = v.a(PARAM_NAME_KANA, this.nameKana);
                pVarArr[7] = v.a(PARAM_NAME_KANJI, this.nameKanji);
                pVarArr[8] = v.a(PARAM_OWNERS_PROVIDED, this.ownersProvided);
                pVarArr[9] = v.a("phone", this.phone);
                pVarArr[10] = v.a(PARAM_TAX_ID, this.taxId);
                pVarArr[11] = v.a(PARAM_TAX_ID_REGISTRAR, this.taxIdRegistrar);
                pVarArr[12] = v.a(PARAM_VAT_ID, this.vatId);
                Verification verification = this.verification;
                pVarArr[13] = v.a(PARAM_VERIFICATION, verification != null ? verification.toParamMap() : null);
                l11 = w.l(pVarArr);
                return l11;
            }

            public final String getPhone() {
                return this.phone;
            }

            public final String getTaxId() {
                return this.taxId;
            }

            public final String getTaxIdRegistrar() {
                return this.taxIdRegistrar;
            }

            public final String getVatId() {
                return this.vatId;
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
                Boolean bool = this.directorsProvided;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.executivesProvided;
                int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                String str = this.name;
                int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.nameKana;
                int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.nameKanji;
                int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Boolean bool3 = this.ownersProvided;
                int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                String str4 = this.phone;
                int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.taxId;
                int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.taxIdRegistrar;
                int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.vatId;
                int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
                Verification verification = this.verification;
                return hashCode13 + (verification != null ? verification.hashCode() : 0);
            }

            public final void setAddress(Address address) {
                this.address = address;
            }

            public final void setAddressKana(AddressJapanParams addressJapanParams) {
                this.addressKana = addressJapanParams;
            }

            public final void setAddressKanji(AddressJapanParams addressJapanParams) {
                this.addressKanji = addressJapanParams;
            }

            public final void setDirectorsProvided(Boolean bool) {
                this.directorsProvided = bool;
            }

            public final void setExecutivesProvided(Boolean bool) {
                this.executivesProvided = bool;
            }

            public final void setName(String str) {
                this.name = str;
            }

            public final void setNameKana(String str) {
                this.nameKana = str;
            }

            public final void setNameKanji(String str) {
                this.nameKanji = str;
            }

            public final void setOwnersProvided(Boolean bool) {
                this.ownersProvided = bool;
            }

            public final void setPhone(String str) {
                this.phone = str;
            }

            public final void setTaxId(String str) {
                this.taxId = str;
            }

            public final void setTaxIdRegistrar(String str) {
                this.taxIdRegistrar = str;
            }

            public final void setVatId(String str) {
                this.vatId = str;
            }

            public final void setVerification(Verification verification) {
                this.verification = verification;
            }

            public String toString() {
                return "Company(address=" + this.address + ", addressKana=" + this.addressKana + ", addressKanji=" + this.addressKanji + ", directorsProvided=" + this.directorsProvided + ", executivesProvided=" + this.executivesProvided + ", name=" + ((Object) this.name) + ", nameKana=" + ((Object) this.nameKana) + ", nameKanji=" + ((Object) this.nameKanji) + ", ownersProvided=" + this.ownersProvided + ", phone=" + ((Object) this.phone) + ", taxId=" + ((Object) this.taxId) + ", taxIdRegistrar=" + ((Object) this.taxIdRegistrar) + ", vatId=" + ((Object) this.vatId) + ", verification=" + this.verification + CoreConstants.RIGHT_PARENTHESIS_CHAR;
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
                Boolean bool = this.directorsProvided;
                if (bool == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.executivesProvided;
                if (bool2 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                out.writeString(this.name);
                out.writeString(this.nameKana);
                out.writeString(this.nameKanji);
                Boolean bool3 = this.ownersProvided;
                if (bool3 == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(bool3.booleanValue() ? 1 : 0);
                }
                out.writeString(this.phone);
                out.writeString(this.taxId);
                out.writeString(this.taxIdRegistrar);
                out.writeString(this.vatId);
                Verification verification = this.verification;
                if (verification == null) {
                    out.writeInt(0);
                    return;
                }
                out.writeInt(1);
                verification.writeToParcel(out, i11);
            }

            /* loaded from: classes6.dex */
            public static final class Verification implements StripeParamsModel, Parcelable {
                @Deprecated
                private static final String PARAM_DOCUMENT = "document";
                private Document document;
                private static final Companion Companion = new Companion(null);
                public static final Parcelable.Creator<Verification> CREATOR = new Creator();
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
                public static final class Creator implements Parcelable.Creator<Verification> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Verification createFromParcel(Parcel parcel) {
                        s.g(parcel, "parcel");
                        return new Verification(parcel.readInt() == 0 ? null : Document.CREATOR.createFromParcel(parcel));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public final Verification[] newArray(int i11) {
                        return new Verification[i11];
                    }
                }

                public Verification() {
                    this(null, 1, null);
                }

                public Verification(Document document) {
                    this.document = document;
                }

                public static /* synthetic */ Verification copy$default(Verification verification, Document document, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        document = verification.document;
                    }
                    return verification.copy(document);
                }

                public final Document component1() {
                    return this.document;
                }

                public final Verification copy(Document document) {
                    return new Verification(document);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Verification) && s.c(this.document, ((Verification) obj).document);
                }

                public final Document getDocument() {
                    return this.document;
                }

                public int hashCode() {
                    Document document = this.document;
                    if (document == null) {
                        return 0;
                    }
                    return document.hashCode();
                }

                public final void setDocument(Document document) {
                    this.document = document;
                }

                @Override // com.stripe.android.model.StripeParamsModel
                public Map<String, Object> toParamMap() {
                    Map<String, Object> i11;
                    Document document = this.document;
                    Map<String, Object> f11 = document == null ? null : r0.f(v.a(PARAM_DOCUMENT, document.toParamMap()));
                    if (f11 == null) {
                        i11 = s0.i();
                        return i11;
                    }
                    return f11;
                }

                public String toString() {
                    return "Verification(document=" + this.document + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    s.g(out, "out");
                    Document document = this.document;
                    if (document == null) {
                        out.writeInt(0);
                        return;
                    }
                    out.writeInt(1);
                    document.writeToParcel(out, i11);
                }

                public /* synthetic */ Verification(Document document, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : document);
                }
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

                private final String component1() {
                    return this.front;
                }

                private final String component2() {
                    return this.back;
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
                    l11 = w.l(v.a(PARAM_FRONT, this.front), v.a(PARAM_BACK, this.back));
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

            public Company(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, Boolean bool, Boolean bool2, String str, String str2, String str3, Boolean bool3, String str4, String str5, String str6, String str7, Verification verification) {
                super(BusinessType.Company, null);
                this.address = address;
                this.addressKana = addressJapanParams;
                this.addressKanji = addressJapanParams2;
                this.directorsProvided = bool;
                this.executivesProvided = bool2;
                this.name = str;
                this.nameKana = str2;
                this.nameKanji = str3;
                this.ownersProvided = bool3;
                this.phone = str4;
                this.taxId = str5;
                this.taxIdRegistrar = str6;
                this.vatId = str7;
                this.verification = verification;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Individual extends BusinessTypeParams {
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
            private static final String PARAM_PHONE = "phone";
            @Deprecated
            private static final String PARAM_SSN_LAST_4 = "ssn_last_4";
            @Deprecated
            private static final String PARAM_VERIFICATION = "verification";
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
            private String ssnLast4;
            private Verification verification;
            private static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Individual> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Builder implements ObjectBuilder<Individual> {
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
                public Individual build() {
                    return new Individual(this.address, this.addressKana, this.addressKanji, this.dateOfBirth, this.email, this.firstName, this.firstNameKana, this.firstNameKanji, this.gender, this.idNumber, this.lastName, this.lastNameKana, this.lastNameKanji, this.maidenName, this.metadata, this.phone, this.ssnLast4, this.verification);
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
            public static final class Creator implements Parcelable.Creator<Individual> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Individual createFromParcel(Parcel parcel) {
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
                    return new Individual(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, readString, readString2, readString3, readString4, readString5, readString6, readString7, str, readString9, readString10, linkedHashMap, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Verification.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Individual[] newArray(int i11) {
                    return new Individual[i11];
                }
            }

            public Individual() {
                this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
            }

            public /* synthetic */ Individual(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map, String str11, String str12, Verification verification, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : address, (i11 & 2) != 0 ? null : addressJapanParams, (i11 & 4) != 0 ? null : addressJapanParams2, (i11 & 8) != 0 ? null : dateOfBirth, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5, (i11 & 512) != 0 ? null : str6, (i11 & 1024) != 0 ? null : str7, (i11 & 2048) != 0 ? null : str8, (i11 & 4096) != 0 ? null : str9, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str10, (i11 & 16384) != 0 ? null : map, (i11 & 32768) != 0 ? null : str11, (i11 & 65536) != 0 ? null : str12, (i11 & 131072) != 0 ? null : verification);
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

            public final String component17() {
                return this.ssnLast4;
            }

            public final Verification component18() {
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

            public final Individual copy(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, String str12, Verification verification) {
                return new Individual(address, addressJapanParams, addressJapanParams2, dateOfBirth, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, map, str11, str12, verification);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Individual) {
                    Individual individual = (Individual) obj;
                    return s.c(this.address, individual.address) && s.c(this.addressKana, individual.addressKana) && s.c(this.addressKanji, individual.addressKanji) && s.c(this.dateOfBirth, individual.dateOfBirth) && s.c(this.email, individual.email) && s.c(this.firstName, individual.firstName) && s.c(this.firstNameKana, individual.firstNameKana) && s.c(this.firstNameKanji, individual.firstNameKanji) && s.c(this.gender, individual.gender) && s.c(this.idNumber, individual.idNumber) && s.c(this.lastName, individual.lastName) && s.c(this.lastNameKana, individual.lastNameKana) && s.c(this.lastNameKanji, individual.lastNameKanji) && s.c(this.maidenName, individual.maidenName) && s.c(this.metadata, individual.metadata) && s.c(this.phone, individual.phone) && s.c(this.ssnLast4, individual.ssnLast4) && s.c(this.verification, individual.verification);
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

            @Override // com.stripe.android.model.AccountParams.BusinessTypeParams
            public List<p<String, Object>> getParamsList() {
                List<p<String, Object>> l11;
                p[] pVarArr = new p[18];
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
                pVarArr[16] = v.a(PARAM_SSN_LAST_4, this.ssnLast4);
                Verification verification = this.verification;
                pVarArr[17] = v.a(PARAM_VERIFICATION, verification != null ? verification.toParamMap() : null);
                l11 = w.l(pVarArr);
                return l11;
            }

            public final String getPhone() {
                return this.phone;
            }

            public final String getSsnLast4() {
                return this.ssnLast4;
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
                String str12 = this.ssnLast4;
                int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
                Verification verification = this.verification;
                return hashCode17 + (verification != null ? verification.hashCode() : 0);
            }

            public final void setAddress(Address address) {
                this.address = address;
            }

            public final void setAddressKana(AddressJapanParams addressJapanParams) {
                this.addressKana = addressJapanParams;
            }

            public final void setAddressKanji(AddressJapanParams addressJapanParams) {
                this.addressKanji = addressJapanParams;
            }

            public final void setDateOfBirth(DateOfBirth dateOfBirth) {
                this.dateOfBirth = dateOfBirth;
            }

            public final void setEmail(String str) {
                this.email = str;
            }

            public final void setFirstName(String str) {
                this.firstName = str;
            }

            public final void setFirstNameKana(String str) {
                this.firstNameKana = str;
            }

            public final void setFirstNameKanji(String str) {
                this.firstNameKanji = str;
            }

            public final void setGender(String str) {
                this.gender = str;
            }

            public final void setIdNumber(String str) {
                this.idNumber = str;
            }

            public final void setLastName(String str) {
                this.lastName = str;
            }

            public final void setLastNameKana(String str) {
                this.lastNameKana = str;
            }

            public final void setLastNameKanji(String str) {
                this.lastNameKanji = str;
            }

            public final void setMaidenName(String str) {
                this.maidenName = str;
            }

            public final void setMetadata(Map<String, String> map) {
                this.metadata = map;
            }

            public final void setPhone(String str) {
                this.phone = str;
            }

            public final void setSsnLast4(String str) {
                this.ssnLast4 = str;
            }

            public final void setVerification(Verification verification) {
                this.verification = verification;
            }

            public String toString() {
                return "Individual(address=" + this.address + ", addressKana=" + this.addressKana + ", addressKanji=" + this.addressKanji + ", dateOfBirth=" + this.dateOfBirth + ", email=" + ((Object) this.email) + ", firstName=" + ((Object) this.firstName) + ", firstNameKana=" + ((Object) this.firstNameKana) + ", firstNameKanji=" + ((Object) this.firstNameKanji) + ", gender=" + ((Object) this.gender) + ", idNumber=" + ((Object) this.idNumber) + ", lastName=" + ((Object) this.lastName) + ", lastNameKana=" + ((Object) this.lastNameKana) + ", lastNameKanji=" + ((Object) this.lastNameKanji) + ", maidenName=" + ((Object) this.maidenName) + ", metadata=" + this.metadata + ", phone=" + ((Object) this.phone) + ", ssnLast4=" + ((Object) this.ssnLast4) + ", verification=" + this.verification + CoreConstants.RIGHT_PARENTHESIS_CHAR;
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
                out.writeString(this.ssnLast4);
                Verification verification = this.verification;
                if (verification == null) {
                    out.writeInt(0);
                    return;
                }
                out.writeInt(1);
                verification.writeToParcel(out, i11);
            }

            public Individual(Address address, AddressJapanParams addressJapanParams, AddressJapanParams addressJapanParams2, DateOfBirth dateOfBirth, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map<String, String> map, String str11, String str12, Verification verification) {
                super(BusinessType.Individual, null);
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
                this.ssnLast4 = str12;
                this.verification = verification;
            }

            /* loaded from: classes6.dex */
            public static final class Document implements StripeParamsModel, Parcelable {
                @Deprecated
                private static final String PARAM_BACK = "back";
                @Deprecated
                private static final String PARAM_FRONT = "front";
                private String back;
                private String front;
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

                private final String component1() {
                    return this.front;
                }

                private final String component2() {
                    return this.back;
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
                    l11 = w.l(v.a(PARAM_FRONT, this.front), v.a(PARAM_BACK, this.back));
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
                @Deprecated
                private static final String PARAM_ADDITIONAL_DOCUMENT = "additional_document";
                @Deprecated
                private static final String PARAM_DOCUMENT = "document";
                private Document additionalDocument;
                private Document document;
                private static final Companion Companion = new Companion(null);
                public static final Parcelable.Creator<Verification> CREATOR = new Creator();
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

                public final void setAdditionalDocument(Document document) {
                    this.additionalDocument = document;
                }

                public final void setDocument(Document document) {
                    this.document = document;
                }

                @Override // com.stripe.android.model.StripeParamsModel
                public Map<String, Object> toParamMap() {
                    List<p> l11;
                    Map<String, Object> i11;
                    p[] pVarArr = new p[2];
                    Document document = this.additionalDocument;
                    pVarArr[0] = v.a(PARAM_ADDITIONAL_DOCUMENT, document == null ? null : document.toParamMap());
                    Document document2 = this.document;
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
        }

        private BusinessTypeParams(BusinessType businessType) {
            this.type = businessType;
        }

        public /* synthetic */ BusinessTypeParams(BusinessType businessType, DefaultConstructorMarker defaultConstructorMarker) {
            this(businessType);
        }

        public abstract List<p<String, Object>> getParamsList();

        public final BusinessType getType$payments_core_release() {
            return this.type;
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map<String, Object> i11;
            List<p<String, Object>> paramsList = getParamsList();
            i11 = s0.i();
            Iterator<T> it2 = paramsList.iterator();
            while (it2.hasNext()) {
                p pVar = (p) it2.next();
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
    }

    /* loaded from: classes6.dex */
    public static final class Companion {

        /* loaded from: classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[BusinessType.values().length];
                iArr[BusinessType.Individual.ordinal()] = 1;
                iArr[BusinessType.Company.ordinal()] = 2;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccountParams create(boolean z11, BusinessTypeParams.Individual individual) {
            s.g(individual, "individual");
            return new AccountParams(z11, individual);
        }

        public final AccountParams create(boolean z11, BusinessTypeParams.Company company) {
            s.g(company, "company");
            return new AccountParams(z11, company);
        }

        public final AccountParams create(boolean z11, BusinessType businessType) {
            BusinessTypeParams individual;
            s.g(businessType, "businessType");
            int i11 = WhenMappings.$EnumSwitchMapping$0[businessType.ordinal()];
            if (i11 == 1) {
                individual = new BusinessTypeParams.Individual(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
            } else if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                individual = new BusinessTypeParams.Company(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }
            return new AccountParams(z11, individual);
        }

        public final AccountParams create(boolean z11) {
            return new AccountParams(z11, null, 2, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<AccountParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountParams createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new AccountParams(parcel.readInt() != 0, (BusinessTypeParams) parcel.readParcelable(AccountParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountParams[] newArray(int i11) {
            return new AccountParams[i11];
        }
    }

    public /* synthetic */ AccountParams(boolean z11, BusinessTypeParams businessTypeParams, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, (i11 & 2) != 0 ? null : businessTypeParams);
    }

    private final boolean component1() {
        return this.tosShownAndAccepted;
    }

    private final BusinessTypeParams component2() {
        return this.businessTypeParams;
    }

    public static /* synthetic */ AccountParams copy$default(AccountParams accountParams, boolean z11, BusinessTypeParams businessTypeParams, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = accountParams.tosShownAndAccepted;
        }
        if ((i11 & 2) != 0) {
            businessTypeParams = accountParams.businessTypeParams;
        }
        return accountParams.copy(z11, businessTypeParams);
    }

    public static final AccountParams create(boolean z11) {
        return Companion.create(z11);
    }

    public static final AccountParams create(boolean z11, BusinessType businessType) {
        return Companion.create(z11, businessType);
    }

    public static final AccountParams create(boolean z11, BusinessTypeParams.Company company) {
        return Companion.create(z11, company);
    }

    public static final AccountParams create(boolean z11, BusinessTypeParams.Individual individual) {
        return Companion.create(z11, individual);
    }

    public final AccountParams copy(boolean z11, BusinessTypeParams businessTypeParams) {
        return new AccountParams(z11, businessTypeParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccountParams) {
            AccountParams accountParams = (AccountParams) obj;
            return this.tosShownAndAccepted == accountParams.tosShownAndAccepted && s.c(this.businessTypeParams, accountParams.businessTypeParams);
        }
        return false;
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        Map f11;
        Map<String, Object> p11;
        f11 = r0.f(v.a(PARAM_TOS_SHOWN_AND_ACCEPTED, Boolean.valueOf(this.tosShownAndAccepted)));
        BusinessTypeParams businessTypeParams = this.businessTypeParams;
        Map l11 = businessTypeParams == null ? null : s0.l(v.a(PARAM_BUSINESS_TYPE, businessTypeParams.getType$payments_core_release().getCode()), v.a(businessTypeParams.getType$payments_core_release().getCode(), businessTypeParams.toParamMap()));
        if (l11 == null) {
            l11 = s0.i();
        }
        p11 = s0.p(f11, l11);
        return p11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.tosShownAndAccepted;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        BusinessTypeParams businessTypeParams = this.businessTypeParams;
        return i11 + (businessTypeParams == null ? 0 : businessTypeParams.hashCode());
    }

    public String toString() {
        return "AccountParams(tosShownAndAccepted=" + this.tosShownAndAccepted + ", businessTypeParams=" + this.businessTypeParams + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeInt(this.tosShownAndAccepted ? 1 : 0);
        out.writeParcelable(this.businessTypeParams, i11);
    }

    public AccountParams(boolean z11, BusinessTypeParams businessTypeParams) {
        super(Token.Type.Account, null, 2, null);
        this.tosShownAndAccepted = z11;
        this.businessTypeParams = businessTypeParams;
    }
}