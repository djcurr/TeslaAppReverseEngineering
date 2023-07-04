package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class Stripe3ds2AuthResult implements StripeModel {
    public static final Parcelable.Creator<Stripe3ds2AuthResult> CREATOR = new Creator();
    private final Ares ares;
    private final Long created;
    private final String creq;
    private final ThreeDS2Error error;
    private final String fallbackRedirectUrl;

    /* renamed from: id  reason: collision with root package name */
    private final String f20937id;
    private final boolean liveMode;
    private final String source;
    private final String state;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Stripe3ds2AuthResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthResult createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new Stripe3ds2AuthResult(parcel.readString(), parcel.readInt() == 0 ? null : Ares.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0 ? ThreeDS2Error.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthResult[] newArray(int i11) {
            return new Stripe3ds2AuthResult[i11];
        }
    }

    /* loaded from: classes6.dex */
    public static final class MessageExtension implements StripeModel {
        public static final Parcelable.Creator<MessageExtension> CREATOR = new Creator();
        private final boolean criticalityIndicator;
        private final Map<String, String> data;

        /* renamed from: id  reason: collision with root package name */
        private final String f20938id;
        private final String name;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<MessageExtension> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessageExtension createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                s.g(parcel, "parcel");
                String readString = parcel.readString();
                boolean z11 = parcel.readInt() != 0;
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new MessageExtension(readString, z11, readString2, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MessageExtension[] newArray(int i11) {
                return new MessageExtension[i11];
            }
        }

        public MessageExtension(String str, boolean z11, String str2, Map<String, String> map) {
            this.name = str;
            this.criticalityIndicator = z11;
            this.f20938id = str2;
            this.data = map;
        }

        private final boolean component2() {
            return this.criticalityIndicator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MessageExtension copy$default(MessageExtension messageExtension, String str, boolean z11, String str2, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = messageExtension.name;
            }
            if ((i11 & 2) != 0) {
                z11 = messageExtension.criticalityIndicator;
            }
            if ((i11 & 4) != 0) {
                str2 = messageExtension.f20938id;
            }
            if ((i11 & 8) != 0) {
                map = messageExtension.data;
            }
            return messageExtension.copy(str, z11, str2, map);
        }

        public final String component1() {
            return this.name;
        }

        public final String component3() {
            return this.f20938id;
        }

        public final Map<String, String> component4() {
            return this.data;
        }

        public final MessageExtension copy(String str, boolean z11, String str2, Map<String, String> map) {
            return new MessageExtension(str, z11, str2, map);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MessageExtension) {
                MessageExtension messageExtension = (MessageExtension) obj;
                return s.c(this.name, messageExtension.name) && this.criticalityIndicator == messageExtension.criticalityIndicator && s.c(this.f20938id, messageExtension.f20938id) && s.c(this.data, messageExtension.data);
            }
            return false;
        }

        public final Map<String, String> getData() {
            return this.data;
        }

        public final String getId() {
            return this.f20938id;
        }

        public final String getName() {
            return this.name;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z11 = this.criticalityIndicator;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode + i11) * 31;
            String str2 = this.f20938id;
            int hashCode2 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, String> map = this.data;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            return "MessageExtension(name=" + ((Object) this.name) + ", criticalityIndicator=" + this.criticalityIndicator + ", id=" + ((Object) this.f20938id) + ", data=" + this.data + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.name);
            out.writeInt(this.criticalityIndicator ? 1 : 0);
            out.writeString(this.f20938id);
            Map<String, String> map = this.data;
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
    }

    public Stripe3ds2AuthResult(String str, Ares ares, Long l11, String str2, String str3, boolean z11, ThreeDS2Error threeDS2Error, String str4, String str5) {
        this.f20937id = str;
        this.ares = ares;
        this.created = l11;
        this.source = str2;
        this.state = str3;
        this.liveMode = z11;
        this.error = threeDS2Error;
        this.fallbackRedirectUrl = str4;
        this.creq = str5;
    }

    private final boolean component6() {
        return this.liveMode;
    }

    public final String component1() {
        return this.f20937id;
    }

    public final Ares component2() {
        return this.ares;
    }

    public final Long component3() {
        return this.created;
    }

    public final String component4() {
        return this.source;
    }

    public final String component5() {
        return this.state;
    }

    public final ThreeDS2Error component7() {
        return this.error;
    }

    public final String component8() {
        return this.fallbackRedirectUrl;
    }

    public final String component9() {
        return this.creq;
    }

    public final Stripe3ds2AuthResult copy(String str, Ares ares, Long l11, String str2, String str3, boolean z11, ThreeDS2Error threeDS2Error, String str4, String str5) {
        return new Stripe3ds2AuthResult(str, ares, l11, str2, str3, z11, threeDS2Error, str4, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Stripe3ds2AuthResult) {
            Stripe3ds2AuthResult stripe3ds2AuthResult = (Stripe3ds2AuthResult) obj;
            return s.c(this.f20937id, stripe3ds2AuthResult.f20937id) && s.c(this.ares, stripe3ds2AuthResult.ares) && s.c(this.created, stripe3ds2AuthResult.created) && s.c(this.source, stripe3ds2AuthResult.source) && s.c(this.state, stripe3ds2AuthResult.state) && this.liveMode == stripe3ds2AuthResult.liveMode && s.c(this.error, stripe3ds2AuthResult.error) && s.c(this.fallbackRedirectUrl, stripe3ds2AuthResult.fallbackRedirectUrl) && s.c(this.creq, stripe3ds2AuthResult.creq);
        }
        return false;
    }

    public final Ares getAres() {
        return this.ares;
    }

    public final Long getCreated() {
        return this.created;
    }

    public final String getCreq() {
        return this.creq;
    }

    public final ThreeDS2Error getError() {
        return this.error;
    }

    public final String getFallbackRedirectUrl() {
        return this.fallbackRedirectUrl;
    }

    public final String getId() {
        return this.f20937id;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.f20937id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Ares ares = this.ares;
        int hashCode2 = (hashCode + (ares == null ? 0 : ares.hashCode())) * 31;
        Long l11 = this.created;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.source;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.state;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        boolean z11 = this.liveMode;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode5 + i11) * 31;
        ThreeDS2Error threeDS2Error = this.error;
        int hashCode6 = (i12 + (threeDS2Error == null ? 0 : threeDS2Error.hashCode())) * 31;
        String str4 = this.fallbackRedirectUrl;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.creq;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "Stripe3ds2AuthResult(id=" + ((Object) this.f20937id) + ", ares=" + this.ares + ", created=" + this.created + ", source=" + ((Object) this.source) + ", state=" + ((Object) this.state) + ", liveMode=" + this.liveMode + ", error=" + this.error + ", fallbackRedirectUrl=" + ((Object) this.fallbackRedirectUrl) + ", creq=" + ((Object) this.creq) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f20937id);
        Ares ares = this.ares;
        if (ares == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            ares.writeToParcel(out, i11);
        }
        Long l11 = this.created;
        if (l11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l11.longValue());
        }
        out.writeString(this.source);
        out.writeString(this.state);
        out.writeInt(this.liveMode ? 1 : 0);
        ThreeDS2Error threeDS2Error = this.error;
        if (threeDS2Error == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            threeDS2Error.writeToParcel(out, i11);
        }
        out.writeString(this.fallbackRedirectUrl);
        out.writeString(this.creq);
    }

    public /* synthetic */ Stripe3ds2AuthResult(String str, Ares ares, Long l11, String str2, String str3, boolean z11, ThreeDS2Error threeDS2Error, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : ares, l11, str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? null : threeDS2Error, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : str5);
    }

    /* loaded from: classes6.dex */
    public static final class ThreeDS2Error implements StripeModel {
        private final String acsTransId;
        private final String dsTransId;
        private final String errorCode;
        private final String errorComponent;
        private final String errorDescription;
        private final String errorDetail;
        private final String errorMessageType;
        private final String messageType;
        private final String messageVersion;
        private final String sdkTransId;
        private final String threeDSServerTransId;
        public static final Parcelable.Creator<ThreeDS2Error> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<ThreeDS2Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ThreeDS2Error createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new ThreeDS2Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ThreeDS2Error[] newArray(int i11) {
                return new ThreeDS2Error[i11];
            }
        }

        public ThreeDS2Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.threeDSServerTransId = str;
            this.acsTransId = str2;
            this.dsTransId = str3;
            this.errorCode = str4;
            this.errorComponent = str5;
            this.errorDescription = str6;
            this.errorDetail = str7;
            this.errorMessageType = str8;
            this.messageType = str9;
            this.messageVersion = str10;
            this.sdkTransId = str11;
        }

        public final String component1() {
            return this.threeDSServerTransId;
        }

        public final String component10() {
            return this.messageVersion;
        }

        public final String component11() {
            return this.sdkTransId;
        }

        public final String component2() {
            return this.acsTransId;
        }

        public final String component3() {
            return this.dsTransId;
        }

        public final String component4() {
            return this.errorCode;
        }

        public final String component5() {
            return this.errorComponent;
        }

        public final String component6() {
            return this.errorDescription;
        }

        public final String component7() {
            return this.errorDetail;
        }

        public final String component8() {
            return this.errorMessageType;
        }

        public final String component9() {
            return this.messageType;
        }

        public final ThreeDS2Error copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
            return new ThreeDS2Error(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ThreeDS2Error) {
                ThreeDS2Error threeDS2Error = (ThreeDS2Error) obj;
                return s.c(this.threeDSServerTransId, threeDS2Error.threeDSServerTransId) && s.c(this.acsTransId, threeDS2Error.acsTransId) && s.c(this.dsTransId, threeDS2Error.dsTransId) && s.c(this.errorCode, threeDS2Error.errorCode) && s.c(this.errorComponent, threeDS2Error.errorComponent) && s.c(this.errorDescription, threeDS2Error.errorDescription) && s.c(this.errorDetail, threeDS2Error.errorDetail) && s.c(this.errorMessageType, threeDS2Error.errorMessageType) && s.c(this.messageType, threeDS2Error.messageType) && s.c(this.messageVersion, threeDS2Error.messageVersion) && s.c(this.sdkTransId, threeDS2Error.sdkTransId);
            }
            return false;
        }

        public final String getAcsTransId() {
            return this.acsTransId;
        }

        public final String getDsTransId() {
            return this.dsTransId;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorComponent() {
            return this.errorComponent;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final String getErrorDetail() {
            return this.errorDetail;
        }

        public final String getErrorMessageType() {
            return this.errorMessageType;
        }

        public final String getMessageType() {
            return this.messageType;
        }

        public final String getMessageVersion() {
            return this.messageVersion;
        }

        public final String getSdkTransId() {
            return this.sdkTransId;
        }

        public final String getThreeDSServerTransId() {
            return this.threeDSServerTransId;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.threeDSServerTransId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.acsTransId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.dsTransId;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.errorCode;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.errorComponent;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.errorDescription;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.errorDetail;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.errorMessageType;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.messageType;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.messageVersion;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.sdkTransId;
            return hashCode10 + (str11 != null ? str11.hashCode() : 0);
        }

        public String toString() {
            return "ThreeDS2Error(threeDSServerTransId=" + ((Object) this.threeDSServerTransId) + ", acsTransId=" + ((Object) this.acsTransId) + ", dsTransId=" + ((Object) this.dsTransId) + ", errorCode=" + ((Object) this.errorCode) + ", errorComponent=" + ((Object) this.errorComponent) + ", errorDescription=" + ((Object) this.errorDescription) + ", errorDetail=" + ((Object) this.errorDetail) + ", errorMessageType=" + ((Object) this.errorMessageType) + ", messageType=" + ((Object) this.messageType) + ", messageVersion=" + ((Object) this.messageVersion) + ", sdkTransId=" + ((Object) this.sdkTransId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.threeDSServerTransId);
            out.writeString(this.acsTransId);
            out.writeString(this.dsTransId);
            out.writeString(this.errorCode);
            out.writeString(this.errorComponent);
            out.writeString(this.errorDescription);
            out.writeString(this.errorDetail);
            out.writeString(this.errorMessageType);
            out.writeString(this.messageType);
            out.writeString(this.messageVersion);
            out.writeString(this.sdkTransId);
        }

        public /* synthetic */ ThreeDS2Error(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, (i11 & 64) != 0 ? null : str7, str8, str9, str10, str11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Ares implements StripeModel {
        public static final String VALUE_CHALLENGE = "C";
        private final String acsChallengeMandated;
        private final String acsSignedContent;
        private final String acsTransId;
        private final String acsUrl;
        private final String authenticationType;
        private final String cardholderInfo;
        private final List<MessageExtension> messageExtension;
        private final String messageType;
        private final String messageVersion;
        private final String sdkTransId;
        private final String threeDSServerTransId;
        private final String transStatus;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Ares> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Ares> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ares createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                s.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList2.add(MessageExtension.CREATOR.createFromParcel(parcel));
                    }
                    arrayList = arrayList2;
                }
                return new Ares(readString, readString2, readString3, readString4, readString5, readString6, readString7, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ares[] newArray(int i11) {
                return new Ares[i11];
            }
        }

        public Ares(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<MessageExtension> list, String str8, String str9, String str10, String str11) {
            this.threeDSServerTransId = str;
            this.acsChallengeMandated = str2;
            this.acsSignedContent = str3;
            this.acsTransId = str4;
            this.acsUrl = str5;
            this.authenticationType = str6;
            this.cardholderInfo = str7;
            this.messageExtension = list;
            this.messageType = str8;
            this.messageVersion = str9;
            this.sdkTransId = str10;
            this.transStatus = str11;
        }

        private final String component10() {
            return this.messageVersion;
        }

        private final String component11() {
            return this.sdkTransId;
        }

        private final String component12() {
            return this.transStatus;
        }

        private final String component2() {
            return this.acsChallengeMandated;
        }

        private final String component5() {
            return this.acsUrl;
        }

        private final String component6() {
            return this.authenticationType;
        }

        private final String component7() {
            return this.cardholderInfo;
        }

        private final List<MessageExtension> component8() {
            return this.messageExtension;
        }

        private final String component9() {
            return this.messageType;
        }

        public final String component1$payments_core_release() {
            return this.threeDSServerTransId;
        }

        public final String component3$payments_core_release() {
            return this.acsSignedContent;
        }

        public final String component4$payments_core_release() {
            return this.acsTransId;
        }

        public final Ares copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, List<MessageExtension> list, String str8, String str9, String str10, String str11) {
            return new Ares(str, str2, str3, str4, str5, str6, str7, list, str8, str9, str10, str11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Ares) {
                Ares ares = (Ares) obj;
                return s.c(this.threeDSServerTransId, ares.threeDSServerTransId) && s.c(this.acsChallengeMandated, ares.acsChallengeMandated) && s.c(this.acsSignedContent, ares.acsSignedContent) && s.c(this.acsTransId, ares.acsTransId) && s.c(this.acsUrl, ares.acsUrl) && s.c(this.authenticationType, ares.authenticationType) && s.c(this.cardholderInfo, ares.cardholderInfo) && s.c(this.messageExtension, ares.messageExtension) && s.c(this.messageType, ares.messageType) && s.c(this.messageVersion, ares.messageVersion) && s.c(this.sdkTransId, ares.sdkTransId) && s.c(this.transStatus, ares.transStatus);
            }
            return false;
        }

        public final String getAcsSignedContent$payments_core_release() {
            return this.acsSignedContent;
        }

        public final String getAcsTransId$payments_core_release() {
            return this.acsTransId;
        }

        public final String getThreeDSServerTransId$payments_core_release() {
            return this.threeDSServerTransId;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.threeDSServerTransId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.acsChallengeMandated;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.acsSignedContent;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.acsTransId;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.acsUrl;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.authenticationType;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.cardholderInfo;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            List<MessageExtension> list = this.messageExtension;
            int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
            String str8 = this.messageType;
            int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.messageVersion;
            int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.sdkTransId;
            int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.transStatus;
            return hashCode11 + (str11 != null ? str11.hashCode() : 0);
        }

        public final boolean isChallenge() {
            return s.c(VALUE_CHALLENGE, this.transStatus);
        }

        public String toString() {
            return "Ares(threeDSServerTransId=" + ((Object) this.threeDSServerTransId) + ", acsChallengeMandated=" + ((Object) this.acsChallengeMandated) + ", acsSignedContent=" + ((Object) this.acsSignedContent) + ", acsTransId=" + ((Object) this.acsTransId) + ", acsUrl=" + ((Object) this.acsUrl) + ", authenticationType=" + ((Object) this.authenticationType) + ", cardholderInfo=" + ((Object) this.cardholderInfo) + ", messageExtension=" + this.messageExtension + ", messageType=" + ((Object) this.messageType) + ", messageVersion=" + ((Object) this.messageVersion) + ", sdkTransId=" + ((Object) this.sdkTransId) + ", transStatus=" + ((Object) this.transStatus) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.threeDSServerTransId);
            out.writeString(this.acsChallengeMandated);
            out.writeString(this.acsSignedContent);
            out.writeString(this.acsTransId);
            out.writeString(this.acsUrl);
            out.writeString(this.authenticationType);
            out.writeString(this.cardholderInfo);
            List<MessageExtension> list = this.messageExtension;
            if (list == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(list.size());
                for (MessageExtension messageExtension : list) {
                    messageExtension.writeToParcel(out, i11);
                }
            }
            out.writeString(this.messageType);
            out.writeString(this.messageVersion);
            out.writeString(this.sdkTransId);
            out.writeString(this.transStatus);
        }

        public /* synthetic */ Ares(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, String str10, String str11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : str3, str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : list, str8, str9, str10, (i11 & 2048) != 0 ? null : str11);
        }
    }
}