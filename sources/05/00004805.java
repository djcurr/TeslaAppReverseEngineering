package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.link.result.LinkErrorType;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

/* loaded from: classes2.dex */
public abstract class LinkErrorCode implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final k<Map<String, LinkErrorCode>> jsonToObject$delegate;
    private final LinkErrorType errorType;
    private final String json;

    /* loaded from: classes2.dex */
    public static abstract class ApiError extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class INTERNAL_SERVER_ERROR extends ApiError {
            public static final INTERNAL_SERVER_ERROR INSTANCE = new INTERNAL_SERVER_ERROR();
            public static final Parcelable.Creator<INTERNAL_SERVER_ERROR> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INTERNAL_SERVER_ERROR> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INTERNAL_SERVER_ERROR createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INTERNAL_SERVER_ERROR.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INTERNAL_SERVER_ERROR[] newArray(int i11) {
                    return new INTERNAL_SERVER_ERROR[i11];
                }
            }

            private INTERNAL_SERVER_ERROR() {
                super("INTERNAL_SERVER_ERROR", null);
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
        public static final class PLANNED_MAINTENANCE extends ApiError {
            public static final PLANNED_MAINTENANCE INSTANCE = new PLANNED_MAINTENANCE();
            public static final Parcelable.Creator<PLANNED_MAINTENANCE> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PLANNED_MAINTENANCE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PLANNED_MAINTENANCE createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PLANNED_MAINTENANCE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PLANNED_MAINTENANCE[] newArray(int i11) {
                    return new PLANNED_MAINTENANCE[i11];
                }
            }

            private PLANNED_MAINTENANCE() {
                super("PLANNED_MAINTENANCE", null);
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

        private ApiError(String str) {
            super(str, LinkErrorType.API_ERROR.INSTANCE, null);
        }

        public /* synthetic */ ApiError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ ApiError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class AssetReport extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class ASSET_REPORT_GENERATION_FAILED extends AssetReport {
            public static final ASSET_REPORT_GENERATION_FAILED INSTANCE = new ASSET_REPORT_GENERATION_FAILED();
            public static final Parcelable.Creator<ASSET_REPORT_GENERATION_FAILED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ASSET_REPORT_GENERATION_FAILED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ASSET_REPORT_GENERATION_FAILED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ASSET_REPORT_GENERATION_FAILED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ASSET_REPORT_GENERATION_FAILED[] newArray(int i11) {
                    return new ASSET_REPORT_GENERATION_FAILED[i11];
                }
            }

            private ASSET_REPORT_GENERATION_FAILED() {
                super("ASSET_REPORT_GENERATION_FAILED", null);
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
        public static final class DATA_UNAVAILABLE extends AssetReport {
            public static final DATA_UNAVAILABLE INSTANCE = new DATA_UNAVAILABLE();
            public static final Parcelable.Creator<DATA_UNAVAILABLE> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<DATA_UNAVAILABLE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DATA_UNAVAILABLE createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return DATA_UNAVAILABLE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DATA_UNAVAILABLE[] newArray(int i11) {
                    return new DATA_UNAVAILABLE[i11];
                }
            }

            private DATA_UNAVAILABLE() {
                super("DATA_UNAVAILABLE", null);
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
        public static final class INSIGHTS_NOT_ENABLED extends AssetReport {
            public static final INSIGHTS_NOT_ENABLED INSTANCE = new INSIGHTS_NOT_ENABLED();
            public static final Parcelable.Creator<INSIGHTS_NOT_ENABLED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INSIGHTS_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSIGHTS_NOT_ENABLED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INSIGHTS_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSIGHTS_NOT_ENABLED[] newArray(int i11) {
                    return new INSIGHTS_NOT_ENABLED[i11];
                }
            }

            private INSIGHTS_NOT_ENABLED() {
                super("INSIGHTS_NOT_ENABLED", null);
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
        public static final class INSIGHTS_PREVIOUSLY_NOT_ENABLED extends AssetReport {
            public static final INSIGHTS_PREVIOUSLY_NOT_ENABLED INSTANCE = new INSIGHTS_PREVIOUSLY_NOT_ENABLED();
            public static final Parcelable.Creator<INSIGHTS_PREVIOUSLY_NOT_ENABLED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INSIGHTS_PREVIOUSLY_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSIGHTS_PREVIOUSLY_NOT_ENABLED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INSIGHTS_PREVIOUSLY_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSIGHTS_PREVIOUSLY_NOT_ENABLED[] newArray(int i11) {
                    return new INSIGHTS_PREVIOUSLY_NOT_ENABLED[i11];
                }
            }

            private INSIGHTS_PREVIOUSLY_NOT_ENABLED() {
                super("INSIGHTS_PREVIOUSLY_NOT_ENABLED", null);
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
        public static final class INVALID_PARENT extends AssetReport {
            public static final INVALID_PARENT INSTANCE = new INVALID_PARENT();
            public static final Parcelable.Creator<INVALID_PARENT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_PARENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_PARENT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_PARENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_PARENT[] newArray(int i11) {
                    return new INVALID_PARENT[i11];
                }
            }

            private INVALID_PARENT() {
                super("INVALID_PARENT", null);
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
        public static final class PRODUCT_NOT_ENABLED extends AssetReport {
            public static final PRODUCT_NOT_ENABLED INSTANCE = new PRODUCT_NOT_ENABLED();
            public static final Parcelable.Creator<PRODUCT_NOT_ENABLED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PRODUCT_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRODUCT_NOT_ENABLED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PRODUCT_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRODUCT_NOT_ENABLED[] newArray(int i11) {
                    return new PRODUCT_NOT_ENABLED[i11];
                }
            }

            private PRODUCT_NOT_ENABLED() {
                super("PRODUCT_NOT_ENABLED", null);
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
        public static final class PRODUCT_NOT_READY extends AssetReport {
            public static final PRODUCT_NOT_READY INSTANCE = new PRODUCT_NOT_READY();
            public static final Parcelable.Creator<PRODUCT_NOT_READY> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PRODUCT_NOT_READY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRODUCT_NOT_READY createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PRODUCT_NOT_READY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRODUCT_NOT_READY[] newArray(int i11) {
                    return new PRODUCT_NOT_READY[i11];
                }
            }

            private PRODUCT_NOT_READY() {
                super("PRODUCT_NOT_READY", null);
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

        private AssetReport(String str) {
            super(str, LinkErrorType.ASSET_REPORT_ERROR.INSTANCE, null);
        }

        public /* synthetic */ AssetReport(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ AssetReport(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class BankTransferError extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class BANK_TRANSFER_ACCOUNT_BLOCKED extends BankTransferError {
            public static final BANK_TRANSFER_ACCOUNT_BLOCKED INSTANCE = new BANK_TRANSFER_ACCOUNT_BLOCKED();
            public static final Parcelable.Creator<BANK_TRANSFER_ACCOUNT_BLOCKED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_ACCOUNT_BLOCKED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_ACCOUNT_BLOCKED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_ACCOUNT_BLOCKED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_ACCOUNT_BLOCKED[] newArray(int i11) {
                    return new BANK_TRANSFER_ACCOUNT_BLOCKED[i11];
                }
            }

            private BANK_TRANSFER_ACCOUNT_BLOCKED() {
                super("BANK_TRANSFER_ACCOUNT_BLOCKED", null);
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
        public static final class BANK_TRANSFER_INSUFFICIENT_FUNDS extends BankTransferError {
            public static final BANK_TRANSFER_INSUFFICIENT_FUNDS INSTANCE = new BANK_TRANSFER_INSUFFICIENT_FUNDS();
            public static final Parcelable.Creator<BANK_TRANSFER_INSUFFICIENT_FUNDS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_INSUFFICIENT_FUNDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_INSUFFICIENT_FUNDS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_INSUFFICIENT_FUNDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_INSUFFICIENT_FUNDS[] newArray(int i11) {
                    return new BANK_TRANSFER_INSUFFICIENT_FUNDS[i11];
                }
            }

            private BANK_TRANSFER_INSUFFICIENT_FUNDS() {
                super("BANK_TRANSFER_INSUFFICIENT_FUNDS", null);
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
        public static final class BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT extends BankTransferError {
            public static final BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT INSTANCE = new BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT();
            public static final Parcelable.Creator<BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT[] newArray(int i11) {
                    return new BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT[i11];
                }
            }

            private BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT() {
                super("BANK_TRANSFER_INVALID_ORIGINATION_ACCOUNT", null);
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
        public static final class BANK_TRANSFER_LIMIT_EXCEEDED extends BankTransferError {
            public static final BANK_TRANSFER_LIMIT_EXCEEDED INSTANCE = new BANK_TRANSFER_LIMIT_EXCEEDED();
            public static final Parcelable.Creator<BANK_TRANSFER_LIMIT_EXCEEDED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_LIMIT_EXCEEDED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_LIMIT_EXCEEDED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_LIMIT_EXCEEDED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_LIMIT_EXCEEDED[] newArray(int i11) {
                    return new BANK_TRANSFER_LIMIT_EXCEEDED[i11];
                }
            }

            private BANK_TRANSFER_LIMIT_EXCEEDED() {
                super("BANK_TRANSFER_LIMIT_EXCEEDED", null);
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
        public static final class BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT extends BankTransferError {
            public static final BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT INSTANCE = new BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT();
            public static final Parcelable.Creator<BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT[] newArray(int i11) {
                    return new BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT[i11];
                }
            }

            private BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT() {
                super("BANK_TRANSFER_MISSING_ORIGINATION_ACCOUNT", null);
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
        public static final class BANK_TRANSFER_NOT_CANCELLABLE extends BankTransferError {
            public static final BANK_TRANSFER_NOT_CANCELLABLE INSTANCE = new BANK_TRANSFER_NOT_CANCELLABLE();
            public static final Parcelable.Creator<BANK_TRANSFER_NOT_CANCELLABLE> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_NOT_CANCELLABLE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_NOT_CANCELLABLE createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_NOT_CANCELLABLE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_NOT_CANCELLABLE[] newArray(int i11) {
                    return new BANK_TRANSFER_NOT_CANCELLABLE[i11];
                }
            }

            private BANK_TRANSFER_NOT_CANCELLABLE() {
                super("BANK_TRANSFER_NOT_CANCELLABLE", null);
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
        public static final class BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE extends BankTransferError {
            public static final BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE INSTANCE = new BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE();
            public static final Parcelable.Creator<BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE[] newArray(int i11) {
                    return new BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE[i11];
                }
            }

            private BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE() {
                super("BANK_TRANSFER_UNSUPPORTED_ACCOUNT_TYPE", null);
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
        public static final class BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT extends BankTransferError {
            public static final BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT INSTANCE = new BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT();
            public static final Parcelable.Creator<BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT[] newArray(int i11) {
                    return new BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT[i11];
                }
            }

            private BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT() {
                super("BANK_TRANSFER_UNSUPPORTED_ENVIRONMENT", null);
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

        private BankTransferError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ BankTransferError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ BankTransferError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<String, LinkErrorCode> getJsonToObject() {
            return (Map) LinkErrorCode.jsonToObject$delegate.getValue();
        }

        public final LinkErrorCode convert(String str) {
            LinkErrorCode linkErrorCode = getJsonToObject().get(str);
            if (linkErrorCode == null) {
                String str2 = str == null ? "" : str;
                if (str == null) {
                    str = "";
                }
                linkErrorCode = new UNKNOWN(str2, new LinkErrorType.UNKNOWN(str));
            }
            return linkErrorCode;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class DepositSwitchError extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class DEPOSIT_SWITCH_ALREADY_COMPLETED extends DepositSwitchError {
            public static final DEPOSIT_SWITCH_ALREADY_COMPLETED INSTANCE = new DEPOSIT_SWITCH_ALREADY_COMPLETED();
            public static final Parcelable.Creator<DEPOSIT_SWITCH_ALREADY_COMPLETED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_ALREADY_COMPLETED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DEPOSIT_SWITCH_ALREADY_COMPLETED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return DEPOSIT_SWITCH_ALREADY_COMPLETED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DEPOSIT_SWITCH_ALREADY_COMPLETED[] newArray(int i11) {
                    return new DEPOSIT_SWITCH_ALREADY_COMPLETED[i11];
                }
            }

            private DEPOSIT_SWITCH_ALREADY_COMPLETED() {
                super("DEPOSIT_SWITCH_ALREADY_COMPLETED", null);
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
        public static final class DEPOSIT_SWITCH_INVALID_ACCOUNT extends DepositSwitchError {
            public static final DEPOSIT_SWITCH_INVALID_ACCOUNT INSTANCE = new DEPOSIT_SWITCH_INVALID_ACCOUNT();
            public static final Parcelable.Creator<DEPOSIT_SWITCH_INVALID_ACCOUNT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_INVALID_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DEPOSIT_SWITCH_INVALID_ACCOUNT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return DEPOSIT_SWITCH_INVALID_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DEPOSIT_SWITCH_INVALID_ACCOUNT[] newArray(int i11) {
                    return new DEPOSIT_SWITCH_INVALID_ACCOUNT[i11];
                }
            }

            private DEPOSIT_SWITCH_INVALID_ACCOUNT() {
                super("DEPOSIT_SWITCH_INVALID_ACCOUNT", null);
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
        public static final class DEPOSIT_SWITCH_NOT_FOUND extends DepositSwitchError {
            public static final DEPOSIT_SWITCH_NOT_FOUND INSTANCE = new DEPOSIT_SWITCH_NOT_FOUND();
            public static final Parcelable.Creator<DEPOSIT_SWITCH_NOT_FOUND> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DEPOSIT_SWITCH_NOT_FOUND createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return DEPOSIT_SWITCH_NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DEPOSIT_SWITCH_NOT_FOUND[] newArray(int i11) {
                    return new DEPOSIT_SWITCH_NOT_FOUND[i11];
                }
            }

            private DEPOSIT_SWITCH_NOT_FOUND() {
                super("DEPOSIT_SWITCH_NOT_FOUND", null);
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
        public static final class DEPOSIT_SWITCH_TOKEN_NOT_FOUND extends DepositSwitchError {
            public static final DEPOSIT_SWITCH_TOKEN_NOT_FOUND INSTANCE = new DEPOSIT_SWITCH_TOKEN_NOT_FOUND();
            public static final Parcelable.Creator<DEPOSIT_SWITCH_TOKEN_NOT_FOUND> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_TOKEN_NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DEPOSIT_SWITCH_TOKEN_NOT_FOUND createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return DEPOSIT_SWITCH_TOKEN_NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DEPOSIT_SWITCH_TOKEN_NOT_FOUND[] newArray(int i11) {
                    return new DEPOSIT_SWITCH_TOKEN_NOT_FOUND[i11];
                }
            }

            private DEPOSIT_SWITCH_TOKEN_NOT_FOUND() {
                super("DEPOSIT_SWITCH_TOKEN_NOT_FOUND", null);
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
        public static final class DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND extends DepositSwitchError {
            public static final DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND INSTANCE = new DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND();
            public static final Parcelable.Creator<DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND[] newArray(int i11) {
                    return new DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND[i11];
                }
            }

            private DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND() {
                super("DEPOSIT_SWITCH_VALID_AUTH_NOT_FOUND", null);
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
        public static final class DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND extends DepositSwitchError {
            public static final DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND INSTANCE = new DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND();
            public static final Parcelable.Creator<DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND[] newArray(int i11) {
                    return new DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND[i11];
                }
            }

            private DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND() {
                super("DEPOSIT_SWITCH_VALID_IDENTITY_NOT_FOUND", null);
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
        public static final class INVALID_DEPOSIT_SWITCH_ID extends DepositSwitchError {
            public static final INVALID_DEPOSIT_SWITCH_ID INSTANCE = new INVALID_DEPOSIT_SWITCH_ID();
            public static final Parcelable.Creator<INVALID_DEPOSIT_SWITCH_ID> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_DEPOSIT_SWITCH_ID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_DEPOSIT_SWITCH_ID createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_DEPOSIT_SWITCH_ID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_DEPOSIT_SWITCH_ID[] newArray(int i11) {
                    return new INVALID_DEPOSIT_SWITCH_ID[i11];
                }
            }

            private INVALID_DEPOSIT_SWITCH_ID() {
                super("INVALID_DEPOSIT_SWITCH_ID", null);
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

        private DepositSwitchError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ DepositSwitchError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ DepositSwitchError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class INTERNAL_ERROR extends LinkErrorCode {
        public static final Parcelable.Creator<INTERNAL_ERROR> CREATOR = new Creator();
        private final String name;
        private final LinkErrorType type;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<INTERNAL_ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INTERNAL_ERROR createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new INTERNAL_ERROR(parcel.readString(), (LinkErrorType) parcel.readParcelable(INTERNAL_ERROR.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INTERNAL_ERROR[] newArray(int i11) {
                return new INTERNAL_ERROR[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public INTERNAL_ERROR(String name, LinkErrorType type) {
            super(name, type, null);
            s.g(name, "name");
            s.g(type, "type");
            this.name = name;
            this.type = type;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getName() {
            return this.name;
        }

        public final LinkErrorType getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.name);
            out.writeParcelable(this.type, i11);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class InstitutionError extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class INSTITUTION_DOWN extends InstitutionError {
            public static final INSTITUTION_DOWN INSTANCE = new INSTITUTION_DOWN();
            public static final Parcelable.Creator<INSTITUTION_DOWN> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INSTITUTION_DOWN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSTITUTION_DOWN createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INSTITUTION_DOWN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSTITUTION_DOWN[] newArray(int i11) {
                    return new INSTITUTION_DOWN[i11];
                }
            }

            private INSTITUTION_DOWN() {
                super("INSTITUTION_DOWN", null);
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
        public static final class INSTITUTION_NOT_AVAILABLE extends InstitutionError {
            public static final INSTITUTION_NOT_AVAILABLE INSTANCE = new INSTITUTION_NOT_AVAILABLE();
            public static final Parcelable.Creator<INSTITUTION_NOT_AVAILABLE> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INSTITUTION_NOT_AVAILABLE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSTITUTION_NOT_AVAILABLE createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INSTITUTION_NOT_AVAILABLE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSTITUTION_NOT_AVAILABLE[] newArray(int i11) {
                    return new INSTITUTION_NOT_AVAILABLE[i11];
                }
            }

            private INSTITUTION_NOT_AVAILABLE() {
                super("INSTITUTION_NOT_AVAILABLE", null);
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
        public static final class INSTITUTION_NOT_RESPONDING extends InstitutionError {
            public static final INSTITUTION_NOT_RESPONDING INSTANCE = new INSTITUTION_NOT_RESPONDING();
            public static final Parcelable.Creator<INSTITUTION_NOT_RESPONDING> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INSTITUTION_NOT_RESPONDING> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSTITUTION_NOT_RESPONDING createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INSTITUTION_NOT_RESPONDING.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSTITUTION_NOT_RESPONDING[] newArray(int i11) {
                    return new INSTITUTION_NOT_RESPONDING[i11];
                }
            }

            private INSTITUTION_NOT_RESPONDING() {
                super("INSTITUTION_NOT_RESPONDING", null);
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
        public static final class INSTITUTION_NO_LONGER_SUPPORTED extends InstitutionError {
            public static final INSTITUTION_NO_LONGER_SUPPORTED INSTANCE = new INSTITUTION_NO_LONGER_SUPPORTED();
            public static final Parcelable.Creator<INSTITUTION_NO_LONGER_SUPPORTED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INSTITUTION_NO_LONGER_SUPPORTED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSTITUTION_NO_LONGER_SUPPORTED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INSTITUTION_NO_LONGER_SUPPORTED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSTITUTION_NO_LONGER_SUPPORTED[] newArray(int i11) {
                    return new INSTITUTION_NO_LONGER_SUPPORTED[i11];
                }
            }

            private INSTITUTION_NO_LONGER_SUPPORTED() {
                super("INSTITUTION_NO_LONGER_SUPPORTED", null);
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

        private InstitutionError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ InstitutionError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ InstitutionError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class InvalidInput extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class DIRECT_INTEGRATION_NOT_ENABLED extends InvalidInput {
            public static final DIRECT_INTEGRATION_NOT_ENABLED INSTANCE = new DIRECT_INTEGRATION_NOT_ENABLED();
            public static final Parcelable.Creator<DIRECT_INTEGRATION_NOT_ENABLED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<DIRECT_INTEGRATION_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DIRECT_INTEGRATION_NOT_ENABLED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return DIRECT_INTEGRATION_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DIRECT_INTEGRATION_NOT_ENABLED[] newArray(int i11) {
                    return new DIRECT_INTEGRATION_NOT_ENABLED[i11];
                }
            }

            private DIRECT_INTEGRATION_NOT_ENABLED() {
                super("DIRECT_INTEGRATION_NOT_ENABLED", null);
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
        public static final class INCORRECT_DEPOSIT_AMOUNTS extends InvalidInput {
            public static final INCORRECT_DEPOSIT_AMOUNTS INSTANCE = new INCORRECT_DEPOSIT_AMOUNTS();
            public static final Parcelable.Creator<INCORRECT_DEPOSIT_AMOUNTS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INCORRECT_DEPOSIT_AMOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INCORRECT_DEPOSIT_AMOUNTS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INCORRECT_DEPOSIT_AMOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INCORRECT_DEPOSIT_AMOUNTS[] newArray(int i11) {
                    return new INCORRECT_DEPOSIT_AMOUNTS[i11];
                }
            }

            private INCORRECT_DEPOSIT_AMOUNTS() {
                super("INCORRECT_DEPOSIT_AMOUNTS", null);
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
        public static final class INVALID_ACCESS_TOKEN extends InvalidInput {
            public static final INVALID_ACCESS_TOKEN INSTANCE = new INVALID_ACCESS_TOKEN();
            public static final Parcelable.Creator<INVALID_ACCESS_TOKEN> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_ACCESS_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_ACCESS_TOKEN createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_ACCESS_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_ACCESS_TOKEN[] newArray(int i11) {
                    return new INVALID_ACCESS_TOKEN[i11];
                }
            }

            private INVALID_ACCESS_TOKEN() {
                super("INVALID_ACCESS_TOKEN", null);
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
        public static final class INVALID_ACCOUNT_ID extends InvalidInput {
            public static final INVALID_ACCOUNT_ID INSTANCE = new INVALID_ACCOUNT_ID();
            public static final Parcelable.Creator<INVALID_ACCOUNT_ID> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_ACCOUNT_ID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_ACCOUNT_ID createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_ACCOUNT_ID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_ACCOUNT_ID[] newArray(int i11) {
                    return new INVALID_ACCOUNT_ID[i11];
                }
            }

            private INVALID_ACCOUNT_ID() {
                super("INVALID_ACCOUNT_ID", null);
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
        public static final class INVALID_API_KEYS extends InvalidInput {
            public static final INVALID_API_KEYS INSTANCE = new INVALID_API_KEYS();
            public static final Parcelable.Creator<INVALID_API_KEYS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_API_KEYS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_API_KEYS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_API_KEYS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_API_KEYS[] newArray(int i11) {
                    return new INVALID_API_KEYS[i11];
                }
            }

            private INVALID_API_KEYS() {
                super("INVALID_API_KEYS", null);
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
        public static final class INVALID_AUDIT_COPY_TOKEN extends InvalidInput {
            public static final INVALID_AUDIT_COPY_TOKEN INSTANCE = new INVALID_AUDIT_COPY_TOKEN();
            public static final Parcelable.Creator<INVALID_AUDIT_COPY_TOKEN> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_AUDIT_COPY_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_AUDIT_COPY_TOKEN createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_AUDIT_COPY_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_AUDIT_COPY_TOKEN[] newArray(int i11) {
                    return new INVALID_AUDIT_COPY_TOKEN[i11];
                }
            }

            private INVALID_AUDIT_COPY_TOKEN() {
                super("INVALID_AUDIT_COPY_TOKEN", null);
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
        public static final class INVALID_CREDENTIAL_FIELDS extends InvalidInput {
            public static final INVALID_CREDENTIAL_FIELDS INSTANCE = new INVALID_CREDENTIAL_FIELDS();
            public static final Parcelable.Creator<INVALID_CREDENTIAL_FIELDS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_CREDENTIAL_FIELDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_CREDENTIAL_FIELDS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_CREDENTIAL_FIELDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_CREDENTIAL_FIELDS[] newArray(int i11) {
                    return new INVALID_CREDENTIAL_FIELDS[i11];
                }
            }

            private INVALID_CREDENTIAL_FIELDS() {
                super("INVALID_CREDENTIAL_FIELDS", null);
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
        public static final class INVALID_INSTITUTION extends InvalidInput {
            public static final INVALID_INSTITUTION INSTANCE = new INVALID_INSTITUTION();
            public static final Parcelable.Creator<INVALID_INSTITUTION> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_INSTITUTION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_INSTITUTION createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_INSTITUTION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_INSTITUTION[] newArray(int i11) {
                    return new INVALID_INSTITUTION[i11];
                }
            }

            private INVALID_INSTITUTION() {
                super("INVALID_INSTITUTION", null);
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
        public static final class INVALID_LINK_TOKEN extends InvalidInput {
            public static final INVALID_LINK_TOKEN INSTANCE = new INVALID_LINK_TOKEN();
            public static final Parcelable.Creator<INVALID_LINK_TOKEN> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_LINK_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_LINK_TOKEN createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_LINK_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_LINK_TOKEN[] newArray(int i11) {
                    return new INVALID_LINK_TOKEN[i11];
                }
            }

            private INVALID_LINK_TOKEN() {
                super("INVALID_LINK_TOKEN", null);
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
        public static final class INVALID_PROCESSOR_TOKEN extends InvalidInput {
            public static final INVALID_PROCESSOR_TOKEN INSTANCE = new INVALID_PROCESSOR_TOKEN();
            public static final Parcelable.Creator<INVALID_PROCESSOR_TOKEN> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_PROCESSOR_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_PROCESSOR_TOKEN createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_PROCESSOR_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_PROCESSOR_TOKEN[] newArray(int i11) {
                    return new INVALID_PROCESSOR_TOKEN[i11];
                }
            }

            private INVALID_PROCESSOR_TOKEN() {
                super("INVALID_PROCESSOR_TOKEN", null);
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
        public static final class INVALID_PRODUCTS extends InvalidInput {
            public static final INVALID_PRODUCTS INSTANCE = new INVALID_PRODUCTS();
            public static final Parcelable.Creator<INVALID_PRODUCTS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_PRODUCTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_PRODUCTS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_PRODUCTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_PRODUCTS[] newArray(int i11) {
                    return new INVALID_PRODUCTS[i11];
                }
            }

            private INVALID_PRODUCTS() {
                super("INVALID_PRODUCTS", null);
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
        public static final class INVALID_PUBLIC_TOKEN extends InvalidInput {
            public static final INVALID_PUBLIC_TOKEN INSTANCE = new INVALID_PUBLIC_TOKEN();
            public static final Parcelable.Creator<INVALID_PUBLIC_TOKEN> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_PUBLIC_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_PUBLIC_TOKEN createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_PUBLIC_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_PUBLIC_TOKEN[] newArray(int i11) {
                    return new INVALID_PUBLIC_TOKEN[i11];
                }
            }

            private INVALID_PUBLIC_TOKEN() {
                super("INVALID_PUBLIC_TOKEN", null);
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
        public static final class INVALID_STRIPE_ACCOUNT extends InvalidInput {
            public static final INVALID_STRIPE_ACCOUNT INSTANCE = new INVALID_STRIPE_ACCOUNT();
            public static final Parcelable.Creator<INVALID_STRIPE_ACCOUNT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_STRIPE_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_STRIPE_ACCOUNT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_STRIPE_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_STRIPE_ACCOUNT[] newArray(int i11) {
                    return new INVALID_STRIPE_ACCOUNT[i11];
                }
            }

            private INVALID_STRIPE_ACCOUNT() {
                super("INVALID_STRIPE_ACCOUNT", null);
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
        public static final class INVALID_WEBHOOK_VERIFICATION_KEY_ID extends InvalidInput {
            public static final INVALID_WEBHOOK_VERIFICATION_KEY_ID INSTANCE = new INVALID_WEBHOOK_VERIFICATION_KEY_ID();
            public static final Parcelable.Creator<INVALID_WEBHOOK_VERIFICATION_KEY_ID> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_WEBHOOK_VERIFICATION_KEY_ID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_WEBHOOK_VERIFICATION_KEY_ID createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_WEBHOOK_VERIFICATION_KEY_ID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_WEBHOOK_VERIFICATION_KEY_ID[] newArray(int i11) {
                    return new INVALID_WEBHOOK_VERIFICATION_KEY_ID[i11];
                }
            }

            private INVALID_WEBHOOK_VERIFICATION_KEY_ID() {
                super("INVALID_WEBHOOK_VERIFICATION_KEY_ID", null);
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
        public static final class PRODUCT_UNAVAILABLE extends InvalidInput {
            public static final PRODUCT_UNAVAILABLE INSTANCE = new PRODUCT_UNAVAILABLE();
            public static final Parcelable.Creator<PRODUCT_UNAVAILABLE> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PRODUCT_UNAVAILABLE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRODUCT_UNAVAILABLE createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PRODUCT_UNAVAILABLE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRODUCT_UNAVAILABLE[] newArray(int i11) {
                    return new PRODUCT_UNAVAILABLE[i11];
                }
            }

            private PRODUCT_UNAVAILABLE() {
                super("PRODUCT_UNAVAILABLE", null);
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
        public static final class TOO_MANY_VERIFICATION_ATTEMPTS extends InvalidInput {
            public static final TOO_MANY_VERIFICATION_ATTEMPTS INSTANCE = new TOO_MANY_VERIFICATION_ATTEMPTS();
            public static final Parcelable.Creator<TOO_MANY_VERIFICATION_ATTEMPTS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<TOO_MANY_VERIFICATION_ATTEMPTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TOO_MANY_VERIFICATION_ATTEMPTS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return TOO_MANY_VERIFICATION_ATTEMPTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TOO_MANY_VERIFICATION_ATTEMPTS[] newArray(int i11) {
                    return new TOO_MANY_VERIFICATION_ATTEMPTS[i11];
                }
            }

            private TOO_MANY_VERIFICATION_ATTEMPTS() {
                super("TOO_MANY_VERIFICATION_ATTEMPTS", null);
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
        public static final class UNAUTHORIZED_ENVIRONMENT extends InvalidInput {
            public static final UNAUTHORIZED_ENVIRONMENT INSTANCE = new UNAUTHORIZED_ENVIRONMENT();
            public static final Parcelable.Creator<UNAUTHORIZED_ENVIRONMENT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<UNAUTHORIZED_ENVIRONMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UNAUTHORIZED_ENVIRONMENT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return UNAUTHORIZED_ENVIRONMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UNAUTHORIZED_ENVIRONMENT[] newArray(int i11) {
                    return new UNAUTHORIZED_ENVIRONMENT[i11];
                }
            }

            private UNAUTHORIZED_ENVIRONMENT() {
                super("UNAUTHORIZED_ENVIRONMENT", null);
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
        public static final class UNAUTHORIZED_ROUTE_ACCESS extends InvalidInput {
            public static final UNAUTHORIZED_ROUTE_ACCESS INSTANCE = new UNAUTHORIZED_ROUTE_ACCESS();
            public static final Parcelable.Creator<UNAUTHORIZED_ROUTE_ACCESS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<UNAUTHORIZED_ROUTE_ACCESS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UNAUTHORIZED_ROUTE_ACCESS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return UNAUTHORIZED_ROUTE_ACCESS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UNAUTHORIZED_ROUTE_ACCESS[] newArray(int i11) {
                    return new UNAUTHORIZED_ROUTE_ACCESS[i11];
                }
            }

            private UNAUTHORIZED_ROUTE_ACCESS() {
                super("UNAUTHORIZED_ROUTE_ACCESS", null);
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
        public static final class USER_PERMISSION_REVOKED extends InvalidInput {
            public static final USER_PERMISSION_REVOKED INSTANCE = new USER_PERMISSION_REVOKED();
            public static final Parcelable.Creator<USER_PERMISSION_REVOKED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<USER_PERMISSION_REVOKED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USER_PERMISSION_REVOKED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return USER_PERMISSION_REVOKED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USER_PERMISSION_REVOKED[] newArray(int i11) {
                    return new USER_PERMISSION_REVOKED[i11];
                }
            }

            private USER_PERMISSION_REVOKED() {
                super("USER_PERMISSION_REVOKED", null);
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

        private InvalidInput(String str) {
            super(str, LinkErrorType.INVALID_INPUT.INSTANCE, null);
        }

        public /* synthetic */ InvalidInput(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ InvalidInput(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class InvalidRequest extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class INCOMPATIBLE_API_VERSION extends InvalidRequest {
            public static final INCOMPATIBLE_API_VERSION INSTANCE = new INCOMPATIBLE_API_VERSION();
            public static final Parcelable.Creator<INCOMPATIBLE_API_VERSION> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INCOMPATIBLE_API_VERSION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INCOMPATIBLE_API_VERSION createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INCOMPATIBLE_API_VERSION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INCOMPATIBLE_API_VERSION[] newArray(int i11) {
                    return new INCOMPATIBLE_API_VERSION[i11];
                }
            }

            private INCOMPATIBLE_API_VERSION() {
                super("INCOMPATIBLE_API_VERSION", null);
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
        public static final class INVALID_BODY extends InvalidRequest {
            public static final INVALID_BODY INSTANCE = new INVALID_BODY();
            public static final Parcelable.Creator<INVALID_BODY> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_BODY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_BODY createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_BODY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_BODY[] newArray(int i11) {
                    return new INVALID_BODY[i11];
                }
            }

            private INVALID_BODY() {
                super("INVALID_BODY", null);
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
        public static final class INVALID_CONFIGURATION extends InvalidRequest {
            public static final INVALID_CONFIGURATION INSTANCE = new INVALID_CONFIGURATION();
            public static final Parcelable.Creator<INVALID_CONFIGURATION> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_CONFIGURATION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_CONFIGURATION createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_CONFIGURATION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_CONFIGURATION[] newArray(int i11) {
                    return new INVALID_CONFIGURATION[i11];
                }
            }

            private INVALID_CONFIGURATION() {
                super("INVALID_CONFIGURATION", null);
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
        public static final class INVALID_FIELD extends InvalidRequest {
            public static final INVALID_FIELD INSTANCE = new INVALID_FIELD();
            public static final Parcelable.Creator<INVALID_FIELD> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_FIELD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_FIELD createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_FIELD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_FIELD[] newArray(int i11) {
                    return new INVALID_FIELD[i11];
                }
            }

            private INVALID_FIELD() {
                super("INVALID_FIELD", null);
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
        public static final class INVALID_HEADERS extends InvalidRequest {
            public static final INVALID_HEADERS INSTANCE = new INVALID_HEADERS();
            public static final Parcelable.Creator<INVALID_HEADERS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_HEADERS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_HEADERS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_HEADERS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_HEADERS[] newArray(int i11) {
                    return new INVALID_HEADERS[i11];
                }
            }

            private INVALID_HEADERS() {
                super("INVALID_HEADERS", null);
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
        public static final class MISSING_FIELDS extends InvalidRequest {
            public static final MISSING_FIELDS INSTANCE = new MISSING_FIELDS();
            public static final Parcelable.Creator<MISSING_FIELDS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<MISSING_FIELDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MISSING_FIELDS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return MISSING_FIELDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MISSING_FIELDS[] newArray(int i11) {
                    return new MISSING_FIELDS[i11];
                }
            }

            private MISSING_FIELDS() {
                super("MISSING_FIELDS", null);
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
        public static final class NOT_FOUND extends InvalidRequest {
            public static final NOT_FOUND INSTANCE = new NOT_FOUND();
            public static final Parcelable.Creator<NOT_FOUND> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<NOT_FOUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NOT_FOUND createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return NOT_FOUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NOT_FOUND[] newArray(int i11) {
                    return new NOT_FOUND[i11];
                }
            }

            private NOT_FOUND() {
                super("NOT_FOUND", null);
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
        public static final class SANDBOX_ONLY extends InvalidRequest {
            public static final SANDBOX_ONLY INSTANCE = new SANDBOX_ONLY();
            public static final Parcelable.Creator<SANDBOX_ONLY> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<SANDBOX_ONLY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SANDBOX_ONLY createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return SANDBOX_ONLY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SANDBOX_ONLY[] newArray(int i11) {
                    return new SANDBOX_ONLY[i11];
                }
            }

            private SANDBOX_ONLY() {
                super("SANDBOX_ONLY", null);
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
        public static final class UNKNOWN_FIELDS extends InvalidRequest {
            public static final UNKNOWN_FIELDS INSTANCE = new UNKNOWN_FIELDS();
            public static final Parcelable.Creator<UNKNOWN_FIELDS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<UNKNOWN_FIELDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UNKNOWN_FIELDS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return UNKNOWN_FIELDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UNKNOWN_FIELDS[] newArray(int i11) {
                    return new UNKNOWN_FIELDS[i11];
                }
            }

            private UNKNOWN_FIELDS() {
                super("UNKNOWN_FIELDS", null);
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

        private InvalidRequest(String str) {
            super(str, LinkErrorType.INVALID_REQUEST.INSTANCE, null);
        }

        public /* synthetic */ InvalidRequest(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ InvalidRequest(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ItemError extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class INSTANT_MATCH_FAILED extends ItemError {
            public static final INSTANT_MATCH_FAILED INSTANCE = new INSTANT_MATCH_FAILED();
            public static final Parcelable.Creator<INSTANT_MATCH_FAILED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INSTANT_MATCH_FAILED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSTANT_MATCH_FAILED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INSTANT_MATCH_FAILED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSTANT_MATCH_FAILED[] newArray(int i11) {
                    return new INSTANT_MATCH_FAILED[i11];
                }
            }

            private INSTANT_MATCH_FAILED() {
                super("INSTANT_MATCH_FAILED", null);
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
        public static final class INSUFFICIENT_CREDENTIALS extends ItemError {
            public static final INSUFFICIENT_CREDENTIALS INSTANCE = new INSUFFICIENT_CREDENTIALS();
            public static final Parcelable.Creator<INSUFFICIENT_CREDENTIALS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INSUFFICIENT_CREDENTIALS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSUFFICIENT_CREDENTIALS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INSUFFICIENT_CREDENTIALS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INSUFFICIENT_CREDENTIALS[] newArray(int i11) {
                    return new INSUFFICIENT_CREDENTIALS[i11];
                }
            }

            private INSUFFICIENT_CREDENTIALS() {
                super("INSUFFICIENT_CREDENTIALS", null);
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
        public static final class INVALID_CREDENTIALS extends ItemError {
            public static final INVALID_CREDENTIALS INSTANCE = new INVALID_CREDENTIALS();
            public static final Parcelable.Creator<INVALID_CREDENTIALS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_CREDENTIALS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_CREDENTIALS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_CREDENTIALS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_CREDENTIALS[] newArray(int i11) {
                    return new INVALID_CREDENTIALS[i11];
                }
            }

            private INVALID_CREDENTIALS() {
                super("INVALID_CREDENTIALS", null);
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
        public static final class INVALID_MFA extends ItemError {
            public static final INVALID_MFA INSTANCE = new INVALID_MFA();
            public static final Parcelable.Creator<INVALID_MFA> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_MFA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_MFA createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_MFA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_MFA[] newArray(int i11) {
                    return new INVALID_MFA[i11];
                }
            }

            private INVALID_MFA() {
                super("INVALID_MFA", null);
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
        public static final class INVALID_SEND_METHOD extends ItemError {
            public static final INVALID_SEND_METHOD INSTANCE = new INVALID_SEND_METHOD();
            public static final Parcelable.Creator<INVALID_SEND_METHOD> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVALID_SEND_METHOD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_SEND_METHOD createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVALID_SEND_METHOD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVALID_SEND_METHOD[] newArray(int i11) {
                    return new INVALID_SEND_METHOD[i11];
                }
            }

            private INVALID_SEND_METHOD() {
                super("INVALID_SEND_METHOD", null);
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
        public static final class ITEM_LOCKED extends ItemError {
            public static final ITEM_LOCKED INSTANCE = new ITEM_LOCKED();
            public static final Parcelable.Creator<ITEM_LOCKED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ITEM_LOCKED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ITEM_LOCKED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ITEM_LOCKED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ITEM_LOCKED[] newArray(int i11) {
                    return new ITEM_LOCKED[i11];
                }
            }

            private ITEM_LOCKED() {
                super("ITEM_LOCKED", null);
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
        public static final class ITEM_LOGIN_REQUIRED extends ItemError {
            public static final ITEM_LOGIN_REQUIRED INSTANCE = new ITEM_LOGIN_REQUIRED();
            public static final Parcelable.Creator<ITEM_LOGIN_REQUIRED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ITEM_LOGIN_REQUIRED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ITEM_LOGIN_REQUIRED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ITEM_LOGIN_REQUIRED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ITEM_LOGIN_REQUIRED[] newArray(int i11) {
                    return new ITEM_LOGIN_REQUIRED[i11];
                }
            }

            private ITEM_LOGIN_REQUIRED() {
                super("ITEM_LOGIN_REQUIRED", null);
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
        public static final class ITEM_NOT_SUPPORTED extends ItemError {
            public static final ITEM_NOT_SUPPORTED INSTANCE = new ITEM_NOT_SUPPORTED();
            public static final Parcelable.Creator<ITEM_NOT_SUPPORTED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ITEM_NOT_SUPPORTED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ITEM_NOT_SUPPORTED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ITEM_NOT_SUPPORTED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ITEM_NOT_SUPPORTED[] newArray(int i11) {
                    return new ITEM_NOT_SUPPORTED[i11];
                }
            }

            private ITEM_NOT_SUPPORTED() {
                super("ITEM_NOT_SUPPORTED", null);
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
        public static final class ITEM_NO_ERROR extends ItemError {
            public static final ITEM_NO_ERROR INSTANCE = new ITEM_NO_ERROR();
            public static final Parcelable.Creator<ITEM_NO_ERROR> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ITEM_NO_ERROR> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ITEM_NO_ERROR createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ITEM_NO_ERROR.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ITEM_NO_ERROR[] newArray(int i11) {
                    return new ITEM_NO_ERROR[i11];
                }
            }

            private ITEM_NO_ERROR() {
                super("ITEM_NO_ERROR", null);
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
        public static final class MFA_NOT_SUPPORTED extends ItemError {
            public static final MFA_NOT_SUPPORTED INSTANCE = new MFA_NOT_SUPPORTED();
            public static final Parcelable.Creator<MFA_NOT_SUPPORTED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<MFA_NOT_SUPPORTED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MFA_NOT_SUPPORTED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return MFA_NOT_SUPPORTED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MFA_NOT_SUPPORTED[] newArray(int i11) {
                    return new MFA_NOT_SUPPORTED[i11];
                }
            }

            private MFA_NOT_SUPPORTED() {
                super("MFA_NOT_SUPPORTED", null);
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
        public static final class NO_ACCOUNTS extends ItemError {
            public static final NO_ACCOUNTS INSTANCE = new NO_ACCOUNTS();
            public static final Parcelable.Creator<NO_ACCOUNTS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<NO_ACCOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NO_ACCOUNTS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return NO_ACCOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NO_ACCOUNTS[] newArray(int i11) {
                    return new NO_ACCOUNTS[i11];
                }
            }

            private NO_ACCOUNTS() {
                super("NO_ACCOUNTS", null);
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
        public static final class NO_AUTH_ACCOUNTS extends ItemError {
            public static final NO_AUTH_ACCOUNTS INSTANCE = new NO_AUTH_ACCOUNTS();
            public static final Parcelable.Creator<NO_AUTH_ACCOUNTS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<NO_AUTH_ACCOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NO_AUTH_ACCOUNTS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return NO_AUTH_ACCOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NO_AUTH_ACCOUNTS[] newArray(int i11) {
                    return new NO_AUTH_ACCOUNTS[i11];
                }
            }

            private NO_AUTH_ACCOUNTS() {
                super("NO_AUTH_ACCOUNTS", null);
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
        public static final class NO_INVESTMENT_ACCOUNTS extends ItemError {
            public static final NO_INVESTMENT_ACCOUNTS INSTANCE = new NO_INVESTMENT_ACCOUNTS();
            public static final Parcelable.Creator<NO_INVESTMENT_ACCOUNTS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<NO_INVESTMENT_ACCOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NO_INVESTMENT_ACCOUNTS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return NO_INVESTMENT_ACCOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NO_INVESTMENT_ACCOUNTS[] newArray(int i11) {
                    return new NO_INVESTMENT_ACCOUNTS[i11];
                }
            }

            private NO_INVESTMENT_ACCOUNTS() {
                super("NO_INVESTMENT_ACCOUNTS", null);
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
        public static final class NO_LIABILITY_ACCOUNTS extends ItemError {
            public static final NO_LIABILITY_ACCOUNTS INSTANCE = new NO_LIABILITY_ACCOUNTS();
            public static final Parcelable.Creator<NO_LIABILITY_ACCOUNTS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<NO_LIABILITY_ACCOUNTS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NO_LIABILITY_ACCOUNTS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return NO_LIABILITY_ACCOUNTS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NO_LIABILITY_ACCOUNTS[] newArray(int i11) {
                    return new NO_LIABILITY_ACCOUNTS[i11];
                }
            }

            private NO_LIABILITY_ACCOUNTS() {
                super("NO_LIABILITY_ACCOUNTS", null);
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
        public static final class PRODUCTS_NOT_SUPPORTED extends ItemError {
            public static final PRODUCTS_NOT_SUPPORTED INSTANCE = new PRODUCTS_NOT_SUPPORTED();
            public static final Parcelable.Creator<PRODUCTS_NOT_SUPPORTED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PRODUCTS_NOT_SUPPORTED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRODUCTS_NOT_SUPPORTED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PRODUCTS_NOT_SUPPORTED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRODUCTS_NOT_SUPPORTED[] newArray(int i11) {
                    return new PRODUCTS_NOT_SUPPORTED[i11];
                }
            }

            private PRODUCTS_NOT_SUPPORTED() {
                super("PRODUCTS_NOT_SUPPORTED", null);
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
        public static final class PRODUCT_NOT_READY extends ItemError {
            public static final PRODUCT_NOT_READY INSTANCE = new PRODUCT_NOT_READY();
            public static final Parcelable.Creator<PRODUCT_NOT_READY> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PRODUCT_NOT_READY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRODUCT_NOT_READY createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PRODUCT_NOT_READY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRODUCT_NOT_READY[] newArray(int i11) {
                    return new PRODUCT_NOT_READY[i11];
                }
            }

            private PRODUCT_NOT_READY() {
                super("PRODUCT_NOT_READY", null);
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
        public static final class USER_SETUP_REQUIRED extends ItemError {
            public static final USER_SETUP_REQUIRED INSTANCE = new USER_SETUP_REQUIRED();
            public static final Parcelable.Creator<USER_SETUP_REQUIRED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<USER_SETUP_REQUIRED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USER_SETUP_REQUIRED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return USER_SETUP_REQUIRED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final USER_SETUP_REQUIRED[] newArray(int i11) {
                    return new USER_SETUP_REQUIRED[i11];
                }
            }

            private USER_SETUP_REQUIRED() {
                super("USER_SETUP_REQUIRED", null);
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

        private ItemError(String str) {
            super(str, LinkErrorType.ITEM_ERROR.INSTANCE, null);
        }

        public /* synthetic */ ItemError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ ItemError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class OAuthError extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class INCORRECT_LINK_TOKEN extends OAuthError {
            public static final INCORRECT_LINK_TOKEN INSTANCE = new INCORRECT_LINK_TOKEN();
            public static final Parcelable.Creator<INCORRECT_LINK_TOKEN> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INCORRECT_LINK_TOKEN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INCORRECT_LINK_TOKEN createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INCORRECT_LINK_TOKEN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INCORRECT_LINK_TOKEN[] newArray(int i11) {
                    return new INCORRECT_LINK_TOKEN[i11];
                }
            }

            private INCORRECT_LINK_TOKEN() {
                super("INCORRECT_LINK_TOKEN", null);
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
        public static final class INCORRECT_OAUTH_NONCE extends OAuthError {
            public static final INCORRECT_OAUTH_NONCE INSTANCE = new INCORRECT_OAUTH_NONCE();
            public static final Parcelable.Creator<INCORRECT_OAUTH_NONCE> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INCORRECT_OAUTH_NONCE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INCORRECT_OAUTH_NONCE createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INCORRECT_OAUTH_NONCE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INCORRECT_OAUTH_NONCE[] newArray(int i11) {
                    return new INCORRECT_OAUTH_NONCE[i11];
                }
            }

            private INCORRECT_OAUTH_NONCE() {
                super("INCORRECT_OAUTH_NONCE", null);
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
        public static final class OAUTH_STATE_ID_ALREADY_PROCESSED extends OAuthError {
            public static final OAUTH_STATE_ID_ALREADY_PROCESSED INSTANCE = new OAUTH_STATE_ID_ALREADY_PROCESSED();
            public static final Parcelable.Creator<OAUTH_STATE_ID_ALREADY_PROCESSED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<OAUTH_STATE_ID_ALREADY_PROCESSED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OAUTH_STATE_ID_ALREADY_PROCESSED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return OAUTH_STATE_ID_ALREADY_PROCESSED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OAUTH_STATE_ID_ALREADY_PROCESSED[] newArray(int i11) {
                    return new OAUTH_STATE_ID_ALREADY_PROCESSED[i11];
                }
            }

            private OAUTH_STATE_ID_ALREADY_PROCESSED() {
                super("OAUTH_STATE_ID_ALREADY_PROCESSED", null);
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

        private OAuthError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ OAuthError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ OAuthError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class PaymentError extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class PAYMENT_BLOCKED extends PaymentError {
            public static final PAYMENT_BLOCKED INSTANCE = new PAYMENT_BLOCKED();
            public static final Parcelable.Creator<PAYMENT_BLOCKED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PAYMENT_BLOCKED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYMENT_BLOCKED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PAYMENT_BLOCKED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYMENT_BLOCKED[] newArray(int i11) {
                    return new PAYMENT_BLOCKED[i11];
                }
            }

            private PAYMENT_BLOCKED() {
                super("PAYMENT_BLOCKED", null);
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
        public static final class PAYMENT_INSUFFICIENT_FUNDS extends PaymentError {
            public static final PAYMENT_INSUFFICIENT_FUNDS INSTANCE = new PAYMENT_INSUFFICIENT_FUNDS();
            public static final Parcelable.Creator<PAYMENT_INSUFFICIENT_FUNDS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PAYMENT_INSUFFICIENT_FUNDS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYMENT_INSUFFICIENT_FUNDS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PAYMENT_INSUFFICIENT_FUNDS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYMENT_INSUFFICIENT_FUNDS[] newArray(int i11) {
                    return new PAYMENT_INSUFFICIENT_FUNDS[i11];
                }
            }

            private PAYMENT_INSUFFICIENT_FUNDS() {
                super("PAYMENT_INSUFFICIENT_FUNDS", null);
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
        public static final class PAYMENT_INVALID_RECIPIENT extends PaymentError {
            public static final PAYMENT_INVALID_RECIPIENT INSTANCE = new PAYMENT_INVALID_RECIPIENT();
            public static final Parcelable.Creator<PAYMENT_INVALID_RECIPIENT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PAYMENT_INVALID_RECIPIENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYMENT_INVALID_RECIPIENT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PAYMENT_INVALID_RECIPIENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYMENT_INVALID_RECIPIENT[] newArray(int i11) {
                    return new PAYMENT_INVALID_RECIPIENT[i11];
                }
            }

            private PAYMENT_INVALID_RECIPIENT() {
                super("PAYMENT_INVALID_RECIPIENT", null);
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
        public static final class PAYMENT_INVALID_REFERENCE extends PaymentError {
            public static final PAYMENT_INVALID_REFERENCE INSTANCE = new PAYMENT_INVALID_REFERENCE();
            public static final Parcelable.Creator<PAYMENT_INVALID_REFERENCE> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PAYMENT_INVALID_REFERENCE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYMENT_INVALID_REFERENCE createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PAYMENT_INVALID_REFERENCE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYMENT_INVALID_REFERENCE[] newArray(int i11) {
                    return new PAYMENT_INVALID_REFERENCE[i11];
                }
            }

            private PAYMENT_INVALID_REFERENCE() {
                super("PAYMENT_INVALID_REFERENCE", null);
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
        public static final class PAYMENT_INVALID_SCHEDULE extends PaymentError {
            public static final PAYMENT_INVALID_SCHEDULE INSTANCE = new PAYMENT_INVALID_SCHEDULE();
            public static final Parcelable.Creator<PAYMENT_INVALID_SCHEDULE> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PAYMENT_INVALID_SCHEDULE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYMENT_INVALID_SCHEDULE createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PAYMENT_INVALID_SCHEDULE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYMENT_INVALID_SCHEDULE[] newArray(int i11) {
                    return new PAYMENT_INVALID_SCHEDULE[i11];
                }
            }

            private PAYMENT_INVALID_SCHEDULE() {
                super("PAYMENT_INVALID_SCHEDULE", null);
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

        private PaymentError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ PaymentError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ PaymentError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class RateLimit extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class ACCOUNTS_LIMIT extends RateLimit {
            public static final ACCOUNTS_LIMIT INSTANCE = new ACCOUNTS_LIMIT();
            public static final Parcelable.Creator<ACCOUNTS_LIMIT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ACCOUNTS_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ACCOUNTS_LIMIT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ACCOUNTS_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ACCOUNTS_LIMIT[] newArray(int i11) {
                    return new ACCOUNTS_LIMIT[i11];
                }
            }

            private ACCOUNTS_LIMIT() {
                super("ACCOUNTS_LIMIT", null);
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
        public static final class ADDITION_LIMIT extends RateLimit {
            public static final ADDITION_LIMIT INSTANCE = new ADDITION_LIMIT();
            public static final Parcelable.Creator<ADDITION_LIMIT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ADDITION_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ADDITION_LIMIT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ADDITION_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ADDITION_LIMIT[] newArray(int i11) {
                    return new ADDITION_LIMIT[i11];
                }
            }

            private ADDITION_LIMIT() {
                super("ADDITION_LIMIT", null);
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
        public static final class AUTH_LIMIT extends RateLimit {
            public static final AUTH_LIMIT INSTANCE = new AUTH_LIMIT();
            public static final Parcelable.Creator<AUTH_LIMIT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<AUTH_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AUTH_LIMIT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return AUTH_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AUTH_LIMIT[] newArray(int i11) {
                    return new AUTH_LIMIT[i11];
                }
            }

            private AUTH_LIMIT() {
                super("AUTH_LIMIT", null);
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
        public static final class BALANCE_LIMIT extends RateLimit {
            public static final BALANCE_LIMIT INSTANCE = new BALANCE_LIMIT();
            public static final Parcelable.Creator<BALANCE_LIMIT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<BALANCE_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BALANCE_LIMIT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return BALANCE_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BALANCE_LIMIT[] newArray(int i11) {
                    return new BALANCE_LIMIT[i11];
                }
            }

            private BALANCE_LIMIT() {
                super("BALANCE_LIMIT", null);
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
        public static final class IDENTITY_LIMIT extends RateLimit {
            public static final IDENTITY_LIMIT INSTANCE = new IDENTITY_LIMIT();
            public static final Parcelable.Creator<IDENTITY_LIMIT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<IDENTITY_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IDENTITY_LIMIT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return IDENTITY_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IDENTITY_LIMIT[] newArray(int i11) {
                    return new IDENTITY_LIMIT[i11];
                }
            }

            private IDENTITY_LIMIT() {
                super("IDENTITY_LIMIT", null);
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
        public static final class ITEM_GET_LIMIT extends RateLimit {
            public static final ITEM_GET_LIMIT INSTANCE = new ITEM_GET_LIMIT();
            public static final Parcelable.Creator<ITEM_GET_LIMIT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ITEM_GET_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ITEM_GET_LIMIT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ITEM_GET_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ITEM_GET_LIMIT[] newArray(int i11) {
                    return new ITEM_GET_LIMIT[i11];
                }
            }

            private ITEM_GET_LIMIT() {
                super("ITEM_GET_LIMIT", null);
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
        public static final class RATE_LIMIT extends RateLimit {
            public static final RATE_LIMIT INSTANCE = new RATE_LIMIT();
            public static final Parcelable.Creator<RATE_LIMIT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<RATE_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RATE_LIMIT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return RATE_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RATE_LIMIT[] newArray(int i11) {
                    return new RATE_LIMIT[i11];
                }
            }

            private RATE_LIMIT() {
                super("RATE_LIMIT", null);
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
        public static final class TRANSACTIONS_LIMIT extends RateLimit {
            public static final TRANSACTIONS_LIMIT INSTANCE = new TRANSACTIONS_LIMIT();
            public static final Parcelable.Creator<TRANSACTIONS_LIMIT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<TRANSACTIONS_LIMIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TRANSACTIONS_LIMIT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return TRANSACTIONS_LIMIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TRANSACTIONS_LIMIT[] newArray(int i11) {
                    return new TRANSACTIONS_LIMIT[i11];
                }
            }

            private TRANSACTIONS_LIMIT() {
                super("TRANSACTIONS_LIMIT", null);
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

        private RateLimit(String str) {
            super(str, LinkErrorType.RATE_LIMIT_EXCEEDED.INSTANCE, null);
        }

        public /* synthetic */ RateLimit(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ RateLimit(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class RecaptchaError extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class RECAPTCHA_BAD extends RecaptchaError {
            public static final RECAPTCHA_BAD INSTANCE = new RECAPTCHA_BAD();
            public static final Parcelable.Creator<RECAPTCHA_BAD> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<RECAPTCHA_BAD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RECAPTCHA_BAD createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return RECAPTCHA_BAD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RECAPTCHA_BAD[] newArray(int i11) {
                    return new RECAPTCHA_BAD[i11];
                }
            }

            private RECAPTCHA_BAD() {
                super("RECAPTCHA_BAD", null);
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
        public static final class RECAPTCHA_REQUIRED extends RecaptchaError {
            public static final RECAPTCHA_REQUIRED INSTANCE = new RECAPTCHA_REQUIRED();
            public static final Parcelable.Creator<RECAPTCHA_REQUIRED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<RECAPTCHA_REQUIRED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RECAPTCHA_REQUIRED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return RECAPTCHA_REQUIRED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RECAPTCHA_REQUIRED[] newArray(int i11) {
                    return new RECAPTCHA_REQUIRED[i11];
                }
            }

            private RECAPTCHA_REQUIRED() {
                super("RECAPTCHA_REQUIRED", null);
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

        private RecaptchaError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ RecaptchaError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ RecaptchaError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class SandboxError extends LinkErrorCode {

        /* loaded from: classes2.dex */
        public static final class SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID extends SandboxError {
            public static final SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID INSTANCE = new SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID();
            public static final Parcelable.Creator<SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID[] newArray(int i11) {
                    return new SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID[i11];
                }
            }

            private SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID() {
                super("SANDBOX_BANK_TRANSFER_EVENT_TRANSITION_INVALID", null);
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
        public static final class SANDBOX_PRODUCT_NOT_ENABLED extends SandboxError {
            public static final SANDBOX_PRODUCT_NOT_ENABLED INSTANCE = new SANDBOX_PRODUCT_NOT_ENABLED();
            public static final Parcelable.Creator<SANDBOX_PRODUCT_NOT_ENABLED> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<SANDBOX_PRODUCT_NOT_ENABLED> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SANDBOX_PRODUCT_NOT_ENABLED createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return SANDBOX_PRODUCT_NOT_ENABLED.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SANDBOX_PRODUCT_NOT_ENABLED[] newArray(int i11) {
                    return new SANDBOX_PRODUCT_NOT_ENABLED[i11];
                }
            }

            private SANDBOX_PRODUCT_NOT_ENABLED() {
                super("SANDBOX_PRODUCT_NOT_ENABLED", null);
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
        public static final class SANDBOX_WEBHOOK_INVALID extends SandboxError {
            public static final SANDBOX_WEBHOOK_INVALID INSTANCE = new SANDBOX_WEBHOOK_INVALID();
            public static final Parcelable.Creator<SANDBOX_WEBHOOK_INVALID> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<SANDBOX_WEBHOOK_INVALID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SANDBOX_WEBHOOK_INVALID createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return SANDBOX_WEBHOOK_INVALID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SANDBOX_WEBHOOK_INVALID[] newArray(int i11) {
                    return new SANDBOX_WEBHOOK_INVALID[i11];
                }
            }

            private SANDBOX_WEBHOOK_INVALID() {
                super("SANDBOX_WEBHOOK_INVALID", null);
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

        private SandboxError(String str) {
            super(str, LinkErrorType.INSTITUTION_ERROR.INSTANCE, null);
        }

        public /* synthetic */ SandboxError(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ SandboxError(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class UNKNOWN extends LinkErrorCode {
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();
        private final String name;
        private final LinkErrorType type;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UNKNOWN createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new UNKNOWN(parcel.readString(), (LinkErrorType) parcel.readParcelable(UNKNOWN.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UNKNOWN[] newArray(int i11) {
                return new UNKNOWN[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(String name, LinkErrorType type) {
            super(name, type, null);
            s.g(name, "name");
            s.g(type, "type");
            this.name = name;
            this.type = type;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String getName() {
            return this.name;
        }

        public final LinkErrorType getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.name);
            out.writeParcelable(this.type, i11);
        }
    }

    static {
        k<Map<String, LinkErrorCode>> a11;
        a11 = m.a(LinkErrorCode$Companion$jsonToObject$2.INSTANCE);
        jsonToObject$delegate = a11;
    }

    private LinkErrorCode(String str, LinkErrorType linkErrorType) {
        this.json = str;
        this.errorType = linkErrorType;
    }

    public /* synthetic */ LinkErrorCode(String str, LinkErrorType linkErrorType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkErrorType);
    }

    public final LinkErrorType getErrorType$link_sdk_release() {
        return this.errorType;
    }

    public final String getJson() {
        return this.json;
    }

    public String toString() {
        return this.errorType + " : " + this.json;
    }

    public /* synthetic */ LinkErrorCode(String str, LinkErrorType linkErrorType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, linkErrorType, null);
    }
}