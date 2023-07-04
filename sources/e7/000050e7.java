package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Token;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.y;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;
import wz.w;

/* loaded from: classes6.dex */
public final class CardParams extends TokenParams {
    @Deprecated
    private static final String PARAM_ADDRESS_CITY = "address_city";
    @Deprecated
    private static final String PARAM_ADDRESS_COUNTRY = "address_country";
    @Deprecated
    private static final String PARAM_ADDRESS_LINE1 = "address_line1";
    @Deprecated
    private static final String PARAM_ADDRESS_LINE2 = "address_line2";
    @Deprecated
    private static final String PARAM_ADDRESS_STATE = "address_state";
    @Deprecated
    private static final String PARAM_ADDRESS_ZIP = "address_zip";
    @Deprecated
    private static final String PARAM_CURRENCY = "currency";
    @Deprecated
    private static final String PARAM_CVC = "cvc";
    @Deprecated
    private static final String PARAM_EXP_MONTH = "exp_month";
    @Deprecated
    private static final String PARAM_EXP_YEAR = "exp_year";
    @Deprecated
    private static final String PARAM_METADATA = "metadata";
    @Deprecated
    private static final String PARAM_NAME = "name";
    @Deprecated
    private static final String PARAM_NUMBER = "number";
    private Address address;
    private final CardBrand brand;
    private String currency;
    private String cvc;
    private int expMonth;
    private int expYear;
    private final Set<String> loggingTokens;
    private Map<String, String> metadata;
    private String name;
    private String number;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CardParams> CREATOR = new Creator();
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
    public static final class Creator implements Parcelable.Creator<CardParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardParams createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            s.g(parcel, "parcel");
            CardBrand valueOf = CardBrand.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                linkedHashSet.add(parcel.readString());
            }
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Address createFromParcel = parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt4 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt4);
                for (int i12 = 0; i12 != readInt4; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new CardParams(valueOf, linkedHashSet, readString, readInt2, readInt3, readString2, readString3, createFromParcel, readString4, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardParams[] newArray(int i11) {
            return new CardParams[i11];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CardParams(com.stripe.android.model.CardBrand r14, java.util.Set r15, java.lang.String r16, int r17, int r18, java.lang.String r19, java.lang.String r20, com.stripe.android.model.Address r21, java.lang.String r22, java.util.Map r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 2
            if (r1 == 0) goto Lc
            java.util.Set r1 = wz.v0.d()
            r4 = r1
            goto Ld
        Lc:
            r4 = r15
        Ld:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L14
            r8 = r2
            goto L16
        L14:
            r8 = r19
        L16:
            r1 = r0 & 64
            if (r1 == 0) goto L1c
            r9 = r2
            goto L1e
        L1c:
            r9 = r20
        L1e:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L24
            r10 = r2
            goto L26
        L24:
            r10 = r21
        L26:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2c
            r11 = r2
            goto L2e
        L2c:
            r11 = r22
        L2e:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L34
            r12 = r2
            goto L36
        L34:
            r12 = r23
        L36:
            r2 = r13
            r3 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.CardParams.<init>(com.stripe.android.model.CardBrand, java.util.Set, java.lang.String, int, int, java.lang.String, java.lang.String, com.stripe.android.model.Address, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardParams(String number, int i11, int i12) {
        this(number, i11, i12, (String) null, (String) null, (Address) null, (String) null, (Map) null, 248, (DefaultConstructorMarker) null);
        s.g(number, "number");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardParams(String number, int i11, int i12, String str) {
        this(number, i11, i12, str, (String) null, (Address) null, (String) null, (Map) null, 240, (DefaultConstructorMarker) null);
        s.g(number, "number");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardParams(String number, int i11, int i12, String str, String str2) {
        this(number, i11, i12, str, str2, (Address) null, (String) null, (Map) null, 224, (DefaultConstructorMarker) null);
        s.g(number, "number");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardParams(String number, int i11, int i12, String str, String str2, Address address) {
        this(number, i11, i12, str, str2, address, (String) null, (Map) null, 192, (DefaultConstructorMarker) null);
        s.g(number, "number");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardParams(String number, int i11, int i12, String str, String str2, Address address, String str3) {
        this(number, i11, i12, str, str2, address, str3, (Map) null, 128, (DefaultConstructorMarker) null);
        s.g(number, "number");
    }

    private final Set<String> component2() {
        return this.loggingTokens;
    }

    public final CardBrand component1() {
        return this.brand;
    }

    public final Map<String, String> component10() {
        return this.metadata;
    }

    public final String component3$payments_core_release() {
        return this.number;
    }

    public final int component4$payments_core_release() {
        return this.expMonth;
    }

    public final int component5$payments_core_release() {
        return this.expYear;
    }

    public final String component6$payments_core_release() {
        return this.cvc;
    }

    public final String component7() {
        return this.name;
    }

    public final Address component8() {
        return this.address;
    }

    public final String component9() {
        return this.currency;
    }

    public final CardParams copy(CardBrand brand, Set<String> loggingTokens, String number, int i11, int i12, String str, String str2, Address address, String str3, Map<String, String> map) {
        s.g(brand, "brand");
        s.g(loggingTokens, "loggingTokens");
        s.g(number, "number");
        return new CardParams(brand, loggingTokens, number, i11, i12, str, str2, address, str3, map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardParams) {
            CardParams cardParams = (CardParams) obj;
            return this.brand == cardParams.brand && s.c(this.loggingTokens, cardParams.loggingTokens) && s.c(this.number, cardParams.number) && this.expMonth == cardParams.expMonth && this.expYear == cardParams.expYear && s.c(this.cvc, cardParams.cvc) && s.c(this.name, cardParams.name) && s.c(this.address, cardParams.address) && s.c(this.currency, cardParams.currency) && s.c(this.metadata, cardParams.metadata);
        }
        return false;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final CardBrand getBrand() {
        return this.brand;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getCvc$payments_core_release() {
        return this.cvc;
    }

    public final int getExpMonth$payments_core_release() {
        return this.expMonth;
    }

    public final int getExpYear$payments_core_release() {
        return this.expYear;
    }

    public final String getLast4() {
        String j12;
        j12 = y.j1(this.number, 4);
        return j12;
    }

    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber$payments_core_release() {
        return this.number;
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        List<p> l11;
        Map<String, Object> i11;
        p[] pVarArr = new p[13];
        pVarArr[0] = v.a(PARAM_NUMBER, this.number);
        pVarArr[1] = v.a(PARAM_EXP_MONTH, Integer.valueOf(this.expMonth));
        pVarArr[2] = v.a(PARAM_EXP_YEAR, Integer.valueOf(this.expYear));
        pVarArr[3] = v.a(PARAM_CVC, this.cvc);
        pVarArr[4] = v.a("name", this.name);
        pVarArr[5] = v.a(PARAM_CURRENCY, this.currency);
        Address address = this.address;
        pVarArr[6] = v.a(PARAM_ADDRESS_LINE1, address == null ? null : address.getLine1());
        Address address2 = this.address;
        pVarArr[7] = v.a(PARAM_ADDRESS_LINE2, address2 == null ? null : address2.getLine2());
        Address address3 = this.address;
        pVarArr[8] = v.a(PARAM_ADDRESS_CITY, address3 == null ? null : address3.getCity());
        Address address4 = this.address;
        pVarArr[9] = v.a(PARAM_ADDRESS_STATE, address4 == null ? null : address4.getState());
        Address address5 = this.address;
        pVarArr[10] = v.a(PARAM_ADDRESS_ZIP, address5 == null ? null : address5.getPostalCode());
        Address address6 = this.address;
        pVarArr[11] = v.a(PARAM_ADDRESS_COUNTRY, address6 == null ? null : address6.getCountry());
        pVarArr[12] = v.a(PARAM_METADATA, this.metadata);
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

    public int hashCode() {
        int hashCode = ((((((((this.brand.hashCode() * 31) + this.loggingTokens.hashCode()) * 31) + this.number.hashCode()) * 31) + Integer.hashCode(this.expMonth)) * 31) + Integer.hashCode(this.expYear)) * 31;
        String str = this.cvc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.address;
        int hashCode4 = (hashCode3 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.currency;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.metadata;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final void setAddress(Address address) {
        this.address = address;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setCvc$payments_core_release(String str) {
        this.cvc = str;
    }

    public final void setExpMonth$payments_core_release(int i11) {
        this.expMonth = i11;
    }

    public final void setExpYear$payments_core_release(int i11) {
        this.expYear = i11;
    }

    public final void setMetadata(Map<String, String> map) {
        this.metadata = map;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setNumber$payments_core_release(String str) {
        s.g(str, "<set-?>");
        this.number = str;
    }

    public String toString() {
        return "CardParams(brand=" + this.brand + ", loggingTokens=" + this.loggingTokens + ", number=" + this.number + ", expMonth=" + this.expMonth + ", expYear=" + this.expYear + ", cvc=" + ((Object) this.cvc) + ", name=" + ((Object) this.name) + ", address=" + this.address + ", currency=" + ((Object) this.currency) + ", metadata=" + this.metadata + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.brand.name());
        Set<String> set = this.loggingTokens;
        out.writeInt(set.size());
        for (String str : set) {
            out.writeString(str);
        }
        out.writeString(this.number);
        out.writeInt(this.expMonth);
        out.writeInt(this.expYear);
        out.writeString(this.cvc);
        out.writeString(this.name);
        Address address = this.address;
        if (address == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            address.writeToParcel(out, i11);
        }
        out.writeString(this.currency);
        Map<String, String> map = this.metadata;
        if (map == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardParams(CardBrand brand, Set<String> loggingTokens, String number, int i11, int i12, String str, String str2, Address address, String str3, Map<String, String> map) {
        super(Token.Type.Card, loggingTokens);
        s.g(brand, "brand");
        s.g(loggingTokens, "loggingTokens");
        s.g(number, "number");
        this.brand = brand;
        this.loggingTokens = loggingTokens;
        this.number = number;
        this.expMonth = i11;
        this.expYear = i12;
        this.cvc = str;
        this.name = str2;
        this.address = address;
        this.currency = str3;
        this.metadata = map;
    }

    public /* synthetic */ CardParams(String str, int i11, int i12, String str2, String str3, Address address, String str4, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, (i13 & 8) != 0 ? null : str2, (i13 & 16) != 0 ? null : str3, (i13 & 32) != 0 ? null : address, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? null : map);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CardParams(java.lang.String r13, int r14, int r15, java.lang.String r16, java.lang.String r17, com.stripe.android.model.Address r18, java.lang.String r19, java.util.Map<java.lang.String, java.lang.String> r20) {
        /*
            r12 = this;
            java.lang.String r0 = "number"
            r4 = r13
            kotlin.jvm.internal.s.g(r13, r0)
            com.stripe.android.model.CardBrand r2 = com.stripe.android.CardUtils.getPossibleCardBrand(r13)
            java.util.Set r3 = wz.v0.d()
            r1 = r12
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.CardParams.<init>(java.lang.String, int, int, java.lang.String, java.lang.String, com.stripe.android.model.Address, java.lang.String, java.util.Map):void");
    }
}