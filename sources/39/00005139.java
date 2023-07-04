package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;

/* loaded from: classes6.dex */
public final class MandateDataParams implements StripeParamsModel, Parcelable {
    @Deprecated
    private static final String PARAM_CUSTOMER_ACCEPTANCE = "customer_acceptance";
    @Deprecated
    private static final String PARAM_TYPE = "type";
    private final Type type;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<MandateDataParams> CREATOR = new Creator();
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
    public static final class Creator implements Parcelable.Creator<MandateDataParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MandateDataParams createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new MandateDataParams((Type) parcel.readParcelable(MandateDataParams.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MandateDataParams[] newArray(int i11) {
            return new MandateDataParams[i11];
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class Type implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Online extends Type {
            private static final String PARAM_INFER_FROM_CLIENT = "infer_from_client";
            private static final String PARAM_IP_ADDRESS = "ip_address";
            private static final String PARAM_USER_AGENT = "user_agent";
            private final boolean inferFromClient;
            private final String ipAddress;
            private final String userAgent;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<Online> CREATOR = new Creator();
            public static final int $stable = 8;
            private static final Online DEFAULT = new Online(null, null, true, 3, null);

            /* loaded from: classes6.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Online getDEFAULT() {
                    return Online.DEFAULT;
                }
            }

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Online> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Online createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Online(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Online[] newArray(int i11) {
                    return new Online[i11];
                }
            }

            public Online() {
                this(null, null, false, 7, null);
            }

            public /* synthetic */ Online(String str, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? false : z11);
            }

            private final String component1() {
                return this.ipAddress;
            }

            private final String component2() {
                return this.userAgent;
            }

            private final boolean component3() {
                return this.inferFromClient;
            }

            public static /* synthetic */ Online copy$default(Online online, String str, String str2, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = online.ipAddress;
                }
                if ((i11 & 2) != 0) {
                    str2 = online.userAgent;
                }
                if ((i11 & 4) != 0) {
                    z11 = online.inferFromClient;
                }
                return online.copy(str, str2, z11);
            }

            public final Online copy(String str, String str2, boolean z11) {
                return new Online(str, str2, z11);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Online) {
                    Online online = (Online) obj;
                    return s.c(this.ipAddress, online.ipAddress) && s.c(this.userAgent, online.userAgent) && this.inferFromClient == online.inferFromClient;
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                String str = this.ipAddress;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.userAgent;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                boolean z11 = this.inferFromClient;
                int i11 = z11;
                if (z11 != 0) {
                    i11 = 1;
                }
                return hashCode2 + i11;
            }

            @Override // com.stripe.android.model.StripeParamsModel
            public Map<String, Object> toParamMap() {
                Map<String, Object> l11;
                Map<String, Object> f11;
                if (this.inferFromClient) {
                    f11 = r0.f(v.a(PARAM_INFER_FROM_CLIENT, Boolean.TRUE));
                    return f11;
                }
                p[] pVarArr = new p[2];
                String str = this.ipAddress;
                if (str == null) {
                    str = "";
                }
                pVarArr[0] = v.a(PARAM_IP_ADDRESS, str);
                String str2 = this.userAgent;
                pVarArr[1] = v.a(PARAM_USER_AGENT, str2 != null ? str2 : "");
                l11 = s0.l(pVarArr);
                return l11;
            }

            public String toString() {
                return "Online(ipAddress=" + ((Object) this.ipAddress) + ", userAgent=" + ((Object) this.userAgent) + ", inferFromClient=" + this.inferFromClient + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.ipAddress);
                out.writeString(this.userAgent);
                out.writeInt(this.inferFromClient ? 1 : 0);
            }

            public Online(String str, String str2, boolean z11) {
                super("online", null);
                this.ipAddress = str;
                this.userAgent = str2;
                this.inferFromClient = z11;
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Online(String ipAddress, String userAgent) {
                this(ipAddress, userAgent, false);
                s.g(ipAddress, "ipAddress");
                s.g(userAgent, "userAgent");
            }
        }

        private Type(String str) {
            this.code = str;
        }

        public /* synthetic */ Type(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }
    }

    public MandateDataParams(Type type) {
        s.g(type, "type");
        this.type = type;
    }

    private final Type component1() {
        return this.type;
    }

    public static /* synthetic */ MandateDataParams copy$default(MandateDataParams mandateDataParams, Type type, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            type = mandateDataParams.type;
        }
        return mandateDataParams.copy(type);
    }

    public final MandateDataParams copy(Type type) {
        s.g(type, "type");
        return new MandateDataParams(type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MandateDataParams) && s.c(this.type, ((MandateDataParams) obj).type);
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map l11;
        Map<String, Object> f11;
        l11 = s0.l(v.a("type", this.type.getCode$payments_core_release()), v.a(this.type.getCode$payments_core_release(), this.type.toParamMap()));
        f11 = r0.f(v.a(PARAM_CUSTOMER_ACCEPTANCE, l11));
        return f11;
    }

    public String toString() {
        return "MandateDataParams(type=" + this.type + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeParcelable(this.type, i11);
    }
}