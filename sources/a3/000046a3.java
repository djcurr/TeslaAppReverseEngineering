package com.plaid.link.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.link.exception.InvalidLinkConfigurationException;
import com.plaid.link.exception.LinkConfigurationInvalidCountryCodeException;
import com.plaid.link.exception.LinkConfigurationInvalidLanguageException;
import com.plaid.link.exception.LinkConfigurationMissingKeyException;
import com.plaid.link.exception.LinkConfigurationNoClientNameException;
import com.plaid.link.exception.LinkConfigurationNoProductException;
import com.plaid.link.result.LinkAccountSubtype;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.e0;
import wz.p;
import wz.s0;
import wz.v;
import wz.w;

/* loaded from: classes2.dex */
public final class LinkPublicKeyConfiguration implements Parcelable {
    public static final Parcelable.Creator<LinkPublicKeyConfiguration> CREATOR = new Creator();
    private final List<LinkAccountSubtype> accountSubtypes;
    private final String clientName;
    private final List<String> countryCodes;
    private final PlaidEnvironment environment;
    private final Map<String, String> extraParams;
    private final String language;
    private final String linkCustomizationName;
    private final LinkLogLevel logLevel;
    private final List<PlaidProduct> products;
    private final String publicKey;
    private final String token;
    private final String userEmailAddress;
    private final String userLegalName;
    private final String userPhoneNumber;
    private final String webhook;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private List<? extends LinkAccountSubtype> accountSubtypes;
        private String clientName;
        private List<String> countryCodes;
        private PlaidEnvironment environment;
        private Map<String, String> extraParams;
        private String language;
        private String linkCustomizationName;
        private LinkLogLevel logLevel;
        private List<? extends PlaidProduct> products;
        private String publicKey;
        private String token;
        private String userEmailAddress;
        private String userLegalName;
        private String userPhoneNumber;
        private String webhook;

        public Builder() {
            List<? extends PlaidProduct> i11;
            List<String> d11;
            Map<String, String> i12;
            i11 = w.i();
            this.products = i11;
            d11 = v.d(Locale.US.getCountry());
            this.countryCodes = d11;
            String language = Locale.ENGLISH.getLanguage();
            s.f(language, "ENGLISH.language");
            this.language = language;
            this.environment = PlaidEnvironment.SANDBOX;
            this.logLevel = LinkLogLevel.ASSERT;
            i12 = s0.i();
            this.extraParams = i12;
        }

        public static /* synthetic */ void getPublicKey$annotations() {
        }

        private final InvalidLinkConfigurationException validateConfiguration() {
            boolean D;
            boolean D2;
            if (this.token == null && this.publicKey == null) {
                return LinkConfigurationMissingKeyException.INSTANCE;
            }
            if (this.publicKey != null) {
                String str = this.clientName;
                boolean z11 = false;
                if (str == null || str.length() == 0) {
                    return LinkConfigurationNoClientNameException.INSTANCE;
                }
                List<? extends PlaidProduct> list = this.products;
                if (list == null || list.isEmpty()) {
                    return LinkConfigurationNoProductException.INSTANCE;
                }
                List<String> list2 = this.countryCodes;
                if (list2 == null || list2.isEmpty()) {
                    return LinkConfigurationInvalidCountryCodeException.INSTANCE;
                }
                List<String> list3 = this.countryCodes;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String[] iSOCountries = Locale.getISOCountries();
                        s.f(iSOCountries, "getISOCountries()");
                        D = p.D(iSOCountries, (String) it2.next());
                        if (!D) {
                            z11 = true;
                            break;
                        }
                    }
                }
                if (z11) {
                    return LinkConfigurationInvalidCountryCodeException.INSTANCE;
                }
                String[] iSOLanguages = Locale.getISOLanguages();
                s.f(iSOLanguages, "getISOLanguages()");
                D2 = p.D(iSOLanguages, this.language);
                if (D2) {
                    return null;
                }
                return LinkConfigurationInvalidLanguageException.INSTANCE;
            }
            return null;
        }

        public final Builder accountSubtypes(List<? extends LinkAccountSubtype> accountSubtypes) {
            List O0;
            s.g(accountSubtypes, "accountSubtypes");
            O0 = e0.O0(accountSubtypes);
            setAccountSubtypes(O0);
            return this;
        }

        public final LinkPublicKeyConfiguration build() {
            Map v11;
            InvalidLinkConfigurationException validateConfiguration = validateConfiguration();
            if (validateConfiguration == null) {
                String str = this.token;
                String str2 = this.publicKey;
                String str3 = this.clientName;
                PlaidEnvironment plaidEnvironment = this.environment;
                List<? extends PlaidProduct> list = this.products;
                String str4 = this.language;
                List<String> list2 = this.countryCodes;
                String str5 = this.webhook;
                String str6 = this.userLegalName;
                String str7 = this.userEmailAddress;
                String str8 = this.userPhoneNumber;
                String str9 = this.linkCustomizationName;
                List<? extends LinkAccountSubtype> list3 = this.accountSubtypes;
                LinkLogLevel linkLogLevel = this.logLevel;
                v11 = s0.v(this.extraParams);
                return new LinkPublicKeyConfiguration(str, str2, str3, plaidEnvironment, list, str4, list2, str5, str6, str7, str8, str9, list3, linkLogLevel, v11, null);
            }
            throw validateConfiguration;
        }

        public final Builder clientName(String clientName) {
            s.g(clientName, "clientName");
            setClientName(clientName);
            return this;
        }

        public final Builder countryCodes(List<String> countryCodes) {
            s.g(countryCodes, "countryCodes");
            setCountryCodes(countryCodes);
            return this;
        }

        public final Builder environment(PlaidEnvironment environment) {
            s.g(environment, "environment");
            setEnvironment(environment);
            return this;
        }

        public final Builder extraParams(Map<String, String> extraParams) {
            Map v11;
            s.g(extraParams, "extraParams");
            v11 = s0.v(extraParams);
            setExtraParams(v11);
            return this;
        }

        public final List<LinkAccountSubtype> getAccountSubtypes() {
            return this.accountSubtypes;
        }

        public final String getClientName() {
            return this.clientName;
        }

        public final List<String> getCountryCodes() {
            return this.countryCodes;
        }

        public final PlaidEnvironment getEnvironment() {
            return this.environment;
        }

        public final Map<String, String> getExtraParams() {
            return this.extraParams;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getLinkCustomizationName() {
            return this.linkCustomizationName;
        }

        public final LinkLogLevel getLogLevel() {
            return this.logLevel;
        }

        public final List<PlaidProduct> getProducts() {
            return this.products;
        }

        public final String getPublicKey() {
            return this.publicKey;
        }

        public final String getToken() {
            return this.token;
        }

        public final String getUserEmailAddress() {
            return this.userEmailAddress;
        }

        public final String getUserLegalName() {
            return this.userLegalName;
        }

        public final String getUserPhoneNumber() {
            return this.userPhoneNumber;
        }

        public final String getWebhook() {
            return this.webhook;
        }

        public final Builder language(String language) {
            s.g(language, "language");
            setLanguage(language);
            return this;
        }

        public final Builder linkCustomizationName(String str) {
            setLinkCustomizationName(str);
            return this;
        }

        public final Builder logLevel(LinkLogLevel logLevel) {
            s.g(logLevel, "logLevel");
            setLogLevel(logLevel);
            return this;
        }

        public final Builder products(List<? extends PlaidProduct> products) {
            List O0;
            s.g(products, "products");
            O0 = e0.O0(products);
            setProducts(O0);
            return this;
        }

        public final Builder publicKey(String str) {
            setPublicKey(str);
            return this;
        }

        public final /* synthetic */ void setAccountSubtypes(List list) {
            this.accountSubtypes = list;
        }

        public final /* synthetic */ void setClientName(String str) {
            this.clientName = str;
        }

        public final /* synthetic */ void setCountryCodes(List list) {
            s.g(list, "<set-?>");
            this.countryCodes = list;
        }

        public final /* synthetic */ void setEnvironment(PlaidEnvironment plaidEnvironment) {
            s.g(plaidEnvironment, "<set-?>");
            this.environment = plaidEnvironment;
        }

        public final /* synthetic */ void setExtraParams(Map map) {
            s.g(map, "<set-?>");
            this.extraParams = map;
        }

        public final /* synthetic */ void setLanguage(String str) {
            s.g(str, "<set-?>");
            this.language = str;
        }

        public final /* synthetic */ void setLinkCustomizationName(String str) {
            this.linkCustomizationName = str;
        }

        public final /* synthetic */ void setLogLevel(LinkLogLevel linkLogLevel) {
            s.g(linkLogLevel, "<set-?>");
            this.logLevel = linkLogLevel;
        }

        public final /* synthetic */ void setProducts(List list) {
            s.g(list, "<set-?>");
            this.products = list;
        }

        public final /* synthetic */ void setPublicKey(String str) {
            this.publicKey = str;
        }

        public final /* synthetic */ void setToken(String str) {
            this.token = str;
        }

        public final /* synthetic */ void setUserEmailAddress(String str) {
            this.userEmailAddress = str;
        }

        public final /* synthetic */ void setUserLegalName(String str) {
            this.userLegalName = str;
        }

        public final /* synthetic */ void setUserPhoneNumber(String str) {
            this.userPhoneNumber = str;
        }

        public final /* synthetic */ void setWebhook(String str) {
            this.webhook = str;
        }

        public final Builder token(String str) {
            setToken(str);
            return this;
        }

        public final Builder userEmailAddress(String str) {
            setUserEmailAddress(str);
            return this;
        }

        public final Builder userLegalName(String str) {
            setUserLegalName(str);
            return this;
        }

        public final Builder userPhoneNumber(String str) {
            setUserPhoneNumber(str);
            return this;
        }

        public final Builder webhook(String str) {
            setWebhook(str);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LinkPublicKeyConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkPublicKeyConfiguration createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            s.g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            PlaidEnvironment createFromParcel = PlaidEnvironment.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList2.add(PlaidProduct.CREATOR.createFromParcel(parcel));
            }
            String readString4 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    arrayList.add(parcel.readParcelable(LinkPublicKeyConfiguration.class.getClassLoader()));
                    i12++;
                    readInt2 = readInt2;
                }
            }
            LinkLogLevel valueOf = LinkLogLevel.valueOf(parcel.readString());
            int readInt3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt3);
            int i13 = 0;
            while (i13 != readInt3) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
                i13++;
                readInt3 = readInt3;
                arrayList = arrayList;
            }
            return new LinkPublicKeyConfiguration(readString, readString2, readString3, createFromParcel, arrayList2, readString4, createStringArrayList, readString5, readString6, readString7, readString8, readString9, arrayList, valueOf, linkedHashMap, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkPublicKeyConfiguration[] newArray(int i11) {
            return new LinkPublicKeyConfiguration[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LinkPublicKeyConfiguration(String str, String str2, String str3, PlaidEnvironment plaidEnvironment, List<? extends PlaidProduct> list, String str4, List<String> list2, String str5, String str6, String str7, String str8, String str9, List<? extends LinkAccountSubtype> list3, LinkLogLevel linkLogLevel, Map<String, String> map) {
        this.token = str;
        this.publicKey = str2;
        this.clientName = str3;
        this.environment = plaidEnvironment;
        this.products = list;
        this.language = str4;
        this.countryCodes = list2;
        this.webhook = str5;
        this.userLegalName = str6;
        this.userEmailAddress = str7;
        this.userPhoneNumber = str8;
        this.linkCustomizationName = str9;
        this.accountSubtypes = list3;
        this.logLevel = linkLogLevel;
        this.extraParams = map;
    }

    public /* synthetic */ LinkPublicKeyConfiguration(String str, String str2, String str3, PlaidEnvironment plaidEnvironment, List list, String str4, List list2, String str5, String str6, String str7, String str8, String str9, List list3, LinkLogLevel linkLogLevel, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, plaidEnvironment, list, str4, list2, str5, str6, str7, str8, str9, list3, linkLogLevel, map);
    }

    public final void copy() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (s.c(LinkPublicKeyConfiguration.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.plaid.link.configuration.LinkPublicKeyConfiguration");
            LinkPublicKeyConfiguration linkPublicKeyConfiguration = (LinkPublicKeyConfiguration) obj;
            return s.c(this.clientName, linkPublicKeyConfiguration.clientName) && s.c(this.countryCodes, linkPublicKeyConfiguration.countryCodes) && this.environment == linkPublicKeyConfiguration.environment && s.c(this.language, linkPublicKeyConfiguration.language) && s.c(this.products, linkPublicKeyConfiguration.products) && s.c(this.linkCustomizationName, linkPublicKeyConfiguration.linkCustomizationName) && this.logLevel == linkPublicKeyConfiguration.logLevel && s.c(this.publicKey, linkPublicKeyConfiguration.publicKey) && s.c(this.token, linkPublicKeyConfiguration.token) && s.c(this.userEmailAddress, linkPublicKeyConfiguration.userEmailAddress) && s.c(this.userLegalName, linkPublicKeyConfiguration.userLegalName) && s.c(this.userPhoneNumber, linkPublicKeyConfiguration.userPhoneNumber) && s.c(this.webhook, linkPublicKeyConfiguration.webhook) && s.c(this.extraParams, linkPublicKeyConfiguration.extraParams);
        }
        return false;
    }

    public final List<LinkAccountSubtype> getAccountSubtypes() {
        return this.accountSubtypes;
    }

    public final String getClientName() {
        return this.clientName;
    }

    public final List<String> getCountryCodes() {
        return this.countryCodes;
    }

    public final PlaidEnvironment getEnvironment() {
        return this.environment;
    }

    public final Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLinkCustomizationName() {
        return this.linkCustomizationName;
    }

    public final LinkLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final List<PlaidProduct> getProducts() {
        return this.products;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUserEmailAddress() {
        return this.userEmailAddress;
    }

    public final String getUserLegalName() {
        return this.userLegalName;
    }

    public final String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public final String getWebhook() {
        return this.webhook;
    }

    public int hashCode() {
        return Objects.hash(this.clientName, this.countryCodes, this.environment, this.language, this.products, this.linkCustomizationName, this.logLevel, this.publicKey, this.token, this.userEmailAddress, this.userLegalName, this.userPhoneNumber, this.webhook, this.extraParams);
    }

    public String toString() {
        return "LinkConfiguration(clientName='" + ((Object) this.clientName) + "', countryCodes=" + this.countryCodes + ", environment=" + this.environment + ", language='" + this.language + "', products=" + this.products + ", linkCustomizationName=" + ((Object) this.linkCustomizationName) + ", logLevel=" + this.logLevel + ", publicKey=" + ((Object) this.publicKey) + ", token=" + ((Object) this.token) + ", userEmailAddress=" + ((Object) this.userEmailAddress) + ", userLegalName=" + ((Object) this.userLegalName) + ", userPhoneNumber=" + ((Object) this.userPhoneNumber) + ", webhook=" + ((Object) this.webhook) + ", extraParams=" + this.extraParams + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.token);
        out.writeString(this.publicKey);
        out.writeString(this.clientName);
        this.environment.writeToParcel(out, i11);
        List<PlaidProduct> list = this.products;
        out.writeInt(list.size());
        for (PlaidProduct plaidProduct : list) {
            plaidProduct.writeToParcel(out, i11);
        }
        out.writeString(this.language);
        out.writeStringList(this.countryCodes);
        out.writeString(this.webhook);
        out.writeString(this.userLegalName);
        out.writeString(this.userEmailAddress);
        out.writeString(this.userPhoneNumber);
        out.writeString(this.linkCustomizationName);
        List<LinkAccountSubtype> list2 = this.accountSubtypes;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            for (LinkAccountSubtype linkAccountSubtype : list2) {
                out.writeParcelable(linkAccountSubtype, i11);
            }
        }
        out.writeString(this.logLevel.name());
        Map<String, String> map = this.extraParams;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ LinkPublicKeyConfiguration(java.lang.String r16, java.lang.String r17, java.lang.String r18, com.plaid.link.configuration.PlaidEnvironment r19, java.util.List r20, java.lang.String r21, java.util.List r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.List r28, com.plaid.link.configuration.LinkLogLevel r29, java.util.Map r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r15 = this;
            r0 = r31
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r1 = r2
            goto Lb
        L9:
            r1 = r16
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L11
            r3 = r2
            goto L13
        L11:
            r3 = r17
        L13:
            r4 = r0 & 4
            if (r4 == 0) goto L19
            r4 = r2
            goto L1b
        L19:
            r4 = r18
        L1b:
            r5 = r0 & 8
            if (r5 == 0) goto L22
            com.plaid.link.configuration.PlaidEnvironment r5 = com.plaid.link.configuration.PlaidEnvironment.SANDBOX
            goto L24
        L22:
            r5 = r19
        L24:
            r6 = r0 & 16
            if (r6 == 0) goto L2d
            java.util.List r6 = wz.u.i()
            goto L2f
        L2d:
            r6 = r20
        L2f:
            r7 = r0 & 32
            if (r7 == 0) goto L3f
            java.util.Locale r7 = java.util.Locale.ENGLISH
            java.lang.String r7 = r7.getLanguage()
            java.lang.String r8 = "ENGLISH.language"
            kotlin.jvm.internal.s.f(r7, r8)
            goto L41
        L3f:
            r7 = r21
        L41:
            r8 = r0 & 64
            if (r8 == 0) goto L50
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r8 = r8.getCountry()
            java.util.List r8 = wz.u.d(r8)
            goto L52
        L50:
            r8 = r22
        L52:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L58
            r9 = r2
            goto L5a
        L58:
            r9 = r23
        L5a:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L60
            r10 = r2
            goto L62
        L60:
            r10 = r24
        L62:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L68
            r11 = r2
            goto L6a
        L68:
            r11 = r25
        L6a:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L70
            r12 = r2
            goto L72
        L70:
            r12 = r26
        L72:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L78
            r13 = r2
            goto L7a
        L78:
            r13 = r27
        L7a:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L7f
            goto L81
        L7f:
            r2 = r28
        L81:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r14 == 0) goto L88
            com.plaid.link.configuration.LinkLogLevel r14 = com.plaid.link.configuration.LinkLogLevel.ASSERT
            goto L8a
        L88:
            r14 = r29
        L8a:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L93
            java.util.Map r0 = wz.p0.i()
            goto L95
        L93:
            r0 = r30
        L95:
            r16 = r15
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r13
            r29 = r2
            r30 = r14
            r31 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.link.configuration.LinkPublicKeyConfiguration.<init>(java.lang.String, java.lang.String, java.lang.String, com.plaid.link.configuration.PlaidEnvironment, java.util.List, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.plaid.link.configuration.LinkLogLevel, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}