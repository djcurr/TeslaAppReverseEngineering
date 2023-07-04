package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

/* loaded from: classes2.dex */
public abstract class LinkErrorType implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final k<Map<String, LinkErrorType>> jsonToObject$delegate;
    private final String json;

    /* loaded from: classes2.dex */
    public static final class API_ERROR extends LinkErrorType {
        public static final API_ERROR INSTANCE = new API_ERROR();
        public static final Parcelable.Creator<API_ERROR> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<API_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final API_ERROR createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return API_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final API_ERROR[] newArray(int i11) {
                return new API_ERROR[i11];
            }
        }

        private API_ERROR() {
            super("API_ERROR", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ASSET_REPORT_ERROR extends LinkErrorType {
        public static final ASSET_REPORT_ERROR INSTANCE = new ASSET_REPORT_ERROR();
        public static final Parcelable.Creator<ASSET_REPORT_ERROR> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<ASSET_REPORT_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ASSET_REPORT_ERROR createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return ASSET_REPORT_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ASSET_REPORT_ERROR[] newArray(int i11) {
                return new ASSET_REPORT_ERROR[i11];
            }
        }

        private ASSET_REPORT_ERROR() {
            super("ASSET_REPORT_ERROR", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class BANK_TRANSFER_ERROR extends LinkErrorType {
        public static final BANK_TRANSFER_ERROR INSTANCE = new BANK_TRANSFER_ERROR();
        public static final Parcelable.Creator<BANK_TRANSFER_ERROR> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BANK_TRANSFER_ERROR createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return BANK_TRANSFER_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BANK_TRANSFER_ERROR[] newArray(int i11) {
                return new BANK_TRANSFER_ERROR[i11];
            }
        }

        private BANK_TRANSFER_ERROR() {
            super("BANK_TRANSFER_ERROR", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<String, LinkErrorType> getJsonToObject() {
            return (Map) LinkErrorType.jsonToObject$delegate.getValue();
        }

        public final LinkErrorType convert(String str) {
            LinkErrorType linkErrorType = getJsonToObject().get(str);
            if (linkErrorType == null) {
                if (str == null) {
                    str = "";
                }
                linkErrorType = new UNKNOWN(str);
            }
            return linkErrorType;
        }
    }

    /* loaded from: classes2.dex */
    public static final class DEPOSIT_SWITCH_ERROR extends LinkErrorType {
        public static final DEPOSIT_SWITCH_ERROR INSTANCE = new DEPOSIT_SWITCH_ERROR();
        public static final Parcelable.Creator<DEPOSIT_SWITCH_ERROR> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DEPOSIT_SWITCH_ERROR createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return DEPOSIT_SWITCH_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DEPOSIT_SWITCH_ERROR[] newArray(int i11) {
                return new DEPOSIT_SWITCH_ERROR[i11];
            }
        }

        private DEPOSIT_SWITCH_ERROR() {
            super("DEPOSIT_SWITCH_ERROR", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class INSTITUTION_ERROR extends LinkErrorType {
        public static final INSTITUTION_ERROR INSTANCE = new INSTITUTION_ERROR();
        public static final Parcelable.Creator<INSTITUTION_ERROR> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<INSTITUTION_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INSTITUTION_ERROR createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return INSTITUTION_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INSTITUTION_ERROR[] newArray(int i11) {
                return new INSTITUTION_ERROR[i11];
            }
        }

        private INSTITUTION_ERROR() {
            super("INSTITUTION_ERROR", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class INTERNAL_ERROR_TYPE extends LinkErrorType {
        public static final Parcelable.Creator<INTERNAL_ERROR_TYPE> CREATOR = new Creator();
        private final String name;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<INTERNAL_ERROR_TYPE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INTERNAL_ERROR_TYPE createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new INTERNAL_ERROR_TYPE(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INTERNAL_ERROR_TYPE[] newArray(int i11) {
                return new INTERNAL_ERROR_TYPE[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public INTERNAL_ERROR_TYPE(String name) {
            super(name, null);
            s.g(name, "name");
            this.name = name;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.name);
        }
    }

    /* loaded from: classes2.dex */
    public static final class INVALID_INPUT extends LinkErrorType {
        public static final INVALID_INPUT INSTANCE = new INVALID_INPUT();
        public static final Parcelable.Creator<INVALID_INPUT> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<INVALID_INPUT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INVALID_INPUT createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return INVALID_INPUT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INVALID_INPUT[] newArray(int i11) {
                return new INVALID_INPUT[i11];
            }
        }

        private INVALID_INPUT() {
            super("INVALID_INPUT", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class INVALID_REQUEST extends LinkErrorType {
        public static final INVALID_REQUEST INSTANCE = new INVALID_REQUEST();
        public static final Parcelable.Creator<INVALID_REQUEST> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<INVALID_REQUEST> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INVALID_REQUEST createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return INVALID_REQUEST.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INVALID_REQUEST[] newArray(int i11) {
                return new INVALID_REQUEST[i11];
            }
        }

        private INVALID_REQUEST() {
            super("INVALID_REQUEST", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ITEM_ERROR extends LinkErrorType {
        public static final ITEM_ERROR INSTANCE = new ITEM_ERROR();
        public static final Parcelable.Creator<ITEM_ERROR> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<ITEM_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ITEM_ERROR createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return ITEM_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ITEM_ERROR[] newArray(int i11) {
                return new ITEM_ERROR[i11];
            }
        }

        private ITEM_ERROR() {
            super("ITEM_ERROR", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class OAUTH_ERROR extends LinkErrorType {
        public static final OAUTH_ERROR INSTANCE = new OAUTH_ERROR();
        public static final Parcelable.Creator<OAUTH_ERROR> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<OAUTH_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OAUTH_ERROR createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return OAUTH_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OAUTH_ERROR[] newArray(int i11) {
                return new OAUTH_ERROR[i11];
            }
        }

        private OAUTH_ERROR() {
            super("OAUTH_ERROR", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class PAYMENT_ERROR extends LinkErrorType {
        public static final PAYMENT_ERROR INSTANCE = new PAYMENT_ERROR();
        public static final Parcelable.Creator<PAYMENT_ERROR> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<PAYMENT_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PAYMENT_ERROR createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return PAYMENT_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PAYMENT_ERROR[] newArray(int i11) {
                return new PAYMENT_ERROR[i11];
            }
        }

        private PAYMENT_ERROR() {
            super("PAYMENT_ERROR", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RATE_LIMIT_EXCEEDED extends LinkErrorType {
        public static final RATE_LIMIT_EXCEEDED INSTANCE = new RATE_LIMIT_EXCEEDED();
        public static final Parcelable.Creator<RATE_LIMIT_EXCEEDED> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<RATE_LIMIT_EXCEEDED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RATE_LIMIT_EXCEEDED createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return RATE_LIMIT_EXCEEDED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RATE_LIMIT_EXCEEDED[] newArray(int i11) {
                return new RATE_LIMIT_EXCEEDED[i11];
            }
        }

        private RATE_LIMIT_EXCEEDED() {
            super("RATE_LIMIT_EXCEEDED", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RECAPTCHA_ERROR extends LinkErrorType {
        public static final RECAPTCHA_ERROR INSTANCE = new RECAPTCHA_ERROR();
        public static final Parcelable.Creator<RECAPTCHA_ERROR> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<RECAPTCHA_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RECAPTCHA_ERROR createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return RECAPTCHA_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RECAPTCHA_ERROR[] newArray(int i11) {
                return new RECAPTCHA_ERROR[i11];
            }
        }

        private RECAPTCHA_ERROR() {
            super("RECAPTCHA_ERROR", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SANDBOX_ERROR extends LinkErrorType {
        public static final SANDBOX_ERROR INSTANCE = new SANDBOX_ERROR();
        public static final Parcelable.Creator<SANDBOX_ERROR> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SANDBOX_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SANDBOX_ERROR createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return SANDBOX_ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SANDBOX_ERROR[] newArray(int i11) {
                return new SANDBOX_ERROR[i11];
            }
        }

        private SANDBOX_ERROR() {
            super("SANDBOX_ERROR", null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes2.dex */
    public static final class UNKNOWN extends LinkErrorType {
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();
        private final String name;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UNKNOWN createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new UNKNOWN(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UNKNOWN[] newArray(int i11) {
                return new UNKNOWN[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(String name) {
            super(name, null);
            s.g(name, "name");
            this.name = name;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getName() {
            return this.name;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.name);
        }
    }

    static {
        k<Map<String, LinkErrorType>> a11;
        a11 = m.a(LinkErrorType$Companion$jsonToObject$2.INSTANCE);
        jsonToObject$delegate = a11;
    }

    private LinkErrorType(String str) {
        this.json = str;
    }

    public /* synthetic */ LinkErrorType(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getJson() {
        return this.json;
    }

    public String toString() {
        return this.json;
    }

    public /* synthetic */ LinkErrorType(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, null);
    }
}