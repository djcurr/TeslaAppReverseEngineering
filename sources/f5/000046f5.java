package com.plaid.link.event;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public abstract class LinkEventViewName implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, LinkEventViewName> map;
    private String jsonValue;

    /* loaded from: classes2.dex */
    public static final class ACCEPT_TOS extends LinkEventViewName {
        public static final ACCEPT_TOS INSTANCE = new ACCEPT_TOS();
        public static final Parcelable.Creator<ACCEPT_TOS> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<ACCEPT_TOS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ACCEPT_TOS createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return ACCEPT_TOS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ACCEPT_TOS[] newArray(int i11) {
                return new ACCEPT_TOS[i11];
            }
        }

        private ACCEPT_TOS() {
            super("ACCEPT_TOS", null);
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
    public static final class BANK_INCOME_INSIGHTS_COMPLETED extends LinkEventViewName {
        public static final BANK_INCOME_INSIGHTS_COMPLETED INSTANCE = new BANK_INCOME_INSIGHTS_COMPLETED();
        public static final Parcelable.Creator<BANK_INCOME_INSIGHTS_COMPLETED> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<BANK_INCOME_INSIGHTS_COMPLETED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BANK_INCOME_INSIGHTS_COMPLETED createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return BANK_INCOME_INSIGHTS_COMPLETED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BANK_INCOME_INSIGHTS_COMPLETED[] newArray(int i11) {
                return new BANK_INCOME_INSIGHTS_COMPLETED[i11];
            }
        }

        private BANK_INCOME_INSIGHTS_COMPLETED() {
            super("BANK_INCOME_INSIGHTS_COMPLETED", null);
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
    public static final class CONNECTED extends LinkEventViewName {
        public static final CONNECTED INSTANCE = new CONNECTED();
        public static final Parcelable.Creator<CONNECTED> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<CONNECTED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CONNECTED createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return CONNECTED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CONNECTED[] newArray(int i11) {
                return new CONNECTED[i11];
            }
        }

        private CONNECTED() {
            super("CONNECTED", null);
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
    public static final class CONSENT extends LinkEventViewName {
        public static final CONSENT INSTANCE = new CONSENT();
        public static final Parcelable.Creator<CONSENT> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<CONSENT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CONSENT createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return CONSENT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CONSENT[] newArray(int i11) {
                return new CONSENT[i11];
            }
        }

        private CONSENT() {
            super("CONSENT", null);
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
    public static final class CREDENTIAL extends LinkEventViewName {
        public static final CREDENTIAL INSTANCE = new CREDENTIAL();
        public static final Parcelable.Creator<CREDENTIAL> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<CREDENTIAL> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CREDENTIAL createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return CREDENTIAL.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CREDENTIAL[] newArray(int i11) {
                return new CREDENTIAL[i11];
            }
        }

        private CREDENTIAL() {
            super("CREDENTIAL", null);
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

        public final LinkEventViewName fromString$link_sdk_release(String str) {
            if (str == null || str.length() == 0) {
                return null;
            }
            LinkEventViewName linkEventViewName = (LinkEventViewName) LinkEventViewName.map.get(str);
            return linkEventViewName == null ? new UNKNOWN(str) : linkEventViewName;
        }
    }

    /* loaded from: classes2.dex */
    public static final class DOCUMENTARY_VERIFICATION extends LinkEventViewName {
        public static final DOCUMENTARY_VERIFICATION INSTANCE = new DOCUMENTARY_VERIFICATION();
        public static final Parcelable.Creator<DOCUMENTARY_VERIFICATION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<DOCUMENTARY_VERIFICATION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DOCUMENTARY_VERIFICATION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return DOCUMENTARY_VERIFICATION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DOCUMENTARY_VERIFICATION[] newArray(int i11) {
                return new DOCUMENTARY_VERIFICATION[i11];
            }
        }

        private DOCUMENTARY_VERIFICATION() {
            super("DOCUMENTARY_VERIFICATION", null);
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
    public static final class ERROR extends LinkEventViewName {
        public static final ERROR INSTANCE = new ERROR();
        public static final Parcelable.Creator<ERROR> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<ERROR> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ERROR createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return ERROR.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ERROR[] newArray(int i11) {
                return new ERROR[i11];
            }
        }

        private ERROR() {
            super("ERROR", null);
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
    public static final class EXIT extends LinkEventViewName {
        public static final EXIT INSTANCE = new EXIT();
        public static final Parcelable.Creator<EXIT> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<EXIT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EXIT createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return EXIT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final EXIT[] newArray(int i11) {
                return new EXIT[i11];
            }
        }

        private EXIT() {
            super("EXIT", null);
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
    public static final class KYC_CHECK extends LinkEventViewName {
        public static final KYC_CHECK INSTANCE = new KYC_CHECK();
        public static final Parcelable.Creator<KYC_CHECK> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<KYC_CHECK> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final KYC_CHECK createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return KYC_CHECK.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final KYC_CHECK[] newArray(int i11) {
                return new KYC_CHECK[i11];
            }
        }

        private KYC_CHECK() {
            super("KYC_CHECK", null);
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
    public static final class LOADING extends LinkEventViewName {
        public static final LOADING INSTANCE = new LOADING();
        public static final Parcelable.Creator<LOADING> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<LOADING> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LOADING createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return LOADING.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LOADING[] newArray(int i11) {
                return new LOADING[i11];
            }
        }

        private LOADING() {
            super("LOADING", null);
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
    public static final class MATCHED_CONSENT extends LinkEventViewName {
        public static final MATCHED_CONSENT INSTANCE = new MATCHED_CONSENT();
        public static final Parcelable.Creator<MATCHED_CONSENT> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<MATCHED_CONSENT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_CONSENT createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return MATCHED_CONSENT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_CONSENT[] newArray(int i11) {
                return new MATCHED_CONSENT[i11];
            }
        }

        private MATCHED_CONSENT() {
            super("MATCHED_CONSENT", null);
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
    public static final class MATCHED_CREDENTIAL extends LinkEventViewName {
        public static final MATCHED_CREDENTIAL INSTANCE = new MATCHED_CREDENTIAL();
        public static final Parcelable.Creator<MATCHED_CREDENTIAL> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<MATCHED_CREDENTIAL> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_CREDENTIAL createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return MATCHED_CREDENTIAL.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_CREDENTIAL[] newArray(int i11) {
                return new MATCHED_CREDENTIAL[i11];
            }
        }

        private MATCHED_CREDENTIAL() {
            super("MATCHED_CREDENTIAL", null);
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
    public static final class MATCHED_MFA extends LinkEventViewName {
        public static final MATCHED_MFA INSTANCE = new MATCHED_MFA();
        public static final Parcelable.Creator<MATCHED_MFA> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<MATCHED_MFA> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_MFA createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return MATCHED_MFA.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_MFA[] newArray(int i11) {
                return new MATCHED_MFA[i11];
            }
        }

        private MATCHED_MFA() {
            super("MATCHED_MFA", null);
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
    public static final class MFA extends LinkEventViewName {
        public static final MFA INSTANCE = new MFA();
        public static final Parcelable.Creator<MFA> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<MFA> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MFA createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return MFA.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MFA[] newArray(int i11) {
                return new MFA[i11];
            }
        }

        private MFA() {
            super("MFA", null);
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
    public static final class NUMBERS extends LinkEventViewName {
        public static final NUMBERS INSTANCE = new NUMBERS();
        public static final Parcelable.Creator<NUMBERS> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<NUMBERS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NUMBERS createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return NUMBERS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NUMBERS[] newArray(int i11) {
                return new NUMBERS[i11];
            }
        }

        private NUMBERS() {
            super("NUMBERS", null);
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
    public static final class OAUTH extends LinkEventViewName {
        public static final OAUTH INSTANCE = new OAUTH();
        public static final Parcelable.Creator<OAUTH> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OAUTH createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OAUTH[] newArray(int i11) {
                return new OAUTH[i11];
            }
        }

        private OAUTH() {
            super("OAUTH", null);
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
    public static final class RECAPTCHA extends LinkEventViewName {
        public static final RECAPTCHA INSTANCE = new RECAPTCHA();
        public static final Parcelable.Creator<RECAPTCHA> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<RECAPTCHA> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RECAPTCHA createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return RECAPTCHA.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RECAPTCHA[] newArray(int i11) {
                return new RECAPTCHA[i11];
            }
        }

        private RECAPTCHA() {
            super("RECAPTCHA", null);
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
    public static final class RISK_CHECK extends LinkEventViewName {
        public static final RISK_CHECK INSTANCE = new RISK_CHECK();
        public static final Parcelable.Creator<RISK_CHECK> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<RISK_CHECK> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RISK_CHECK createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return RISK_CHECK.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RISK_CHECK[] newArray(int i11) {
                return new RISK_CHECK[i11];
            }
        }

        private RISK_CHECK() {
            super("RISK_CHECK", null);
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
    public static final class SCREENING extends LinkEventViewName {
        public static final SCREENING INSTANCE = new SCREENING();
        public static final Parcelable.Creator<SCREENING> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SCREENING> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SCREENING createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return SCREENING.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SCREENING[] newArray(int i11) {
                return new SCREENING[i11];
            }
        }

        private SCREENING() {
            super("SCREENING", null);
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
    public static final class SELECT_ACCOUNT extends LinkEventViewName {
        public static final SELECT_ACCOUNT INSTANCE = new SELECT_ACCOUNT();
        public static final Parcelable.Creator<SELECT_ACCOUNT> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SELECT_ACCOUNT> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_ACCOUNT createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return SELECT_ACCOUNT.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_ACCOUNT[] newArray(int i11) {
                return new SELECT_ACCOUNT[i11];
            }
        }

        private SELECT_ACCOUNT() {
            super("SELECT_ACCOUNT", null);
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
    public static final class SELECT_AUTH_TYPE extends LinkEventViewName {
        public static final SELECT_AUTH_TYPE INSTANCE = new SELECT_AUTH_TYPE();
        public static final Parcelable.Creator<SELECT_AUTH_TYPE> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SELECT_AUTH_TYPE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_AUTH_TYPE createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return SELECT_AUTH_TYPE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_AUTH_TYPE[] newArray(int i11) {
                return new SELECT_AUTH_TYPE[i11];
            }
        }

        private SELECT_AUTH_TYPE() {
            super("SELECT_AUTH_TYPE", null);
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
    public static final class SELECT_INSTITUTION extends LinkEventViewName {
        public static final SELECT_INSTITUTION INSTANCE = new SELECT_INSTITUTION();
        public static final Parcelable.Creator<SELECT_INSTITUTION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SELECT_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_INSTITUTION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return SELECT_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_INSTITUTION[] newArray(int i11) {
                return new SELECT_INSTITUTION[i11];
            }
        }

        private SELECT_INSTITUTION() {
            super("SELECT_INSTITUTION", null);
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
    public static final class SELFIE_CHECK extends LinkEventViewName {
        public static final SELFIE_CHECK INSTANCE = new SELFIE_CHECK();
        public static final Parcelable.Creator<SELFIE_CHECK> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SELFIE_CHECK> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELFIE_CHECK createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return SELFIE_CHECK.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELFIE_CHECK[] newArray(int i11) {
                return new SELFIE_CHECK[i11];
            }
        }

        private SELFIE_CHECK() {
            super("SELFIE_CHECK", null);
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
    public static final class UNKNOWN extends LinkEventViewName {
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();
        private final String rawJson;

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
        public UNKNOWN(String rawJson) {
            super(rawJson, null);
            s.g(rawJson, "rawJson");
            this.rawJson = rawJson;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.rawJson);
        }
    }

    /* loaded from: classes2.dex */
    public static final class UPLOAD_DOCUMENTS extends LinkEventViewName {
        public static final UPLOAD_DOCUMENTS INSTANCE = new UPLOAD_DOCUMENTS();
        public static final Parcelable.Creator<UPLOAD_DOCUMENTS> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<UPLOAD_DOCUMENTS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UPLOAD_DOCUMENTS createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return UPLOAD_DOCUMENTS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UPLOAD_DOCUMENTS[] newArray(int i11) {
                return new UPLOAD_DOCUMENTS[i11];
            }
        }

        private UPLOAD_DOCUMENTS() {
            super("UPLOAD_DOCUMENTS", null);
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
    public static final class VERIFY_SMS extends LinkEventViewName {
        public static final VERIFY_SMS INSTANCE = new VERIFY_SMS();
        public static final Parcelable.Creator<VERIFY_SMS> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<VERIFY_SMS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VERIFY_SMS createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return VERIFY_SMS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VERIFY_SMS[] newArray(int i11) {
                return new VERIFY_SMS[i11];
            }
        }

        private VERIFY_SMS() {
            super("VERIFY_SMS", null);
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

    static {
        Map<String, LinkEventViewName> l11;
        ACCEPT_TOS accept_tos = ACCEPT_TOS.INSTANCE;
        BANK_INCOME_INSIGHTS_COMPLETED bank_income_insights_completed = BANK_INCOME_INSIGHTS_COMPLETED.INSTANCE;
        CONNECTED connected = CONNECTED.INSTANCE;
        CONSENT consent = CONSENT.INSTANCE;
        CREDENTIAL credential = CREDENTIAL.INSTANCE;
        DOCUMENTARY_VERIFICATION documentary_verification = DOCUMENTARY_VERIFICATION.INSTANCE;
        ERROR error = ERROR.INSTANCE;
        EXIT exit = EXIT.INSTANCE;
        KYC_CHECK kyc_check = KYC_CHECK.INSTANCE;
        LOADING loading = LOADING.INSTANCE;
        MATCHED_CONSENT matched_consent = MATCHED_CONSENT.INSTANCE;
        MATCHED_CREDENTIAL matched_credential = MATCHED_CREDENTIAL.INSTANCE;
        MATCHED_MFA matched_mfa = MATCHED_MFA.INSTANCE;
        MFA mfa = MFA.INSTANCE;
        OAUTH oauth = OAUTH.INSTANCE;
        NUMBERS numbers = NUMBERS.INSTANCE;
        RECAPTCHA recaptcha = RECAPTCHA.INSTANCE;
        RISK_CHECK risk_check = RISK_CHECK.INSTANCE;
        SCREENING screening = SCREENING.INSTANCE;
        SELECT_ACCOUNT select_account = SELECT_ACCOUNT.INSTANCE;
        SELECT_AUTH_TYPE select_auth_type = SELECT_AUTH_TYPE.INSTANCE;
        SELECT_INSTITUTION select_institution = SELECT_INSTITUTION.INSTANCE;
        SELFIE_CHECK selfie_check = SELFIE_CHECK.INSTANCE;
        UPLOAD_DOCUMENTS upload_documents = UPLOAD_DOCUMENTS.INSTANCE;
        VERIFY_SMS verify_sms = VERIFY_SMS.INSTANCE;
        l11 = s0.l(v.a(accept_tos.getJsonValue(), accept_tos), v.a(bank_income_insights_completed.getJsonValue(), bank_income_insights_completed), v.a(connected.getJsonValue(), connected), v.a(consent.getJsonValue(), consent), v.a(credential.getJsonValue(), credential), v.a(documentary_verification.getJsonValue(), documentary_verification), v.a(error.getJsonValue(), error), v.a(exit.getJsonValue(), exit), v.a(kyc_check.getJsonValue(), kyc_check), v.a(loading.getJsonValue(), loading), v.a(matched_consent.getJsonValue(), matched_consent), v.a(matched_credential.getJsonValue(), matched_credential), v.a(matched_mfa.getJsonValue(), matched_mfa), v.a(mfa.getJsonValue(), mfa), v.a(oauth.getJsonValue(), oauth), v.a(numbers.getJsonValue(), numbers), v.a(recaptcha.getJsonValue(), recaptcha), v.a(risk_check.getJsonValue(), risk_check), v.a(screening.getJsonValue(), screening), v.a(select_account.getJsonValue(), select_account), v.a(select_auth_type.getJsonValue(), select_auth_type), v.a(select_institution.getJsonValue(), select_institution), v.a(selfie_check.getJsonValue(), selfie_check), v.a(upload_documents.getJsonValue(), upload_documents), v.a(verify_sms.getJsonValue(), verify_sms));
        map = l11;
    }

    private LinkEventViewName(String str) {
        this.jsonValue = str;
    }

    public /* synthetic */ LinkEventViewName(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getJsonValue() {
        return this.jsonValue;
    }

    public final void setJsonValue(String str) {
        s.g(str, "<set-?>");
        this.jsonValue = str;
    }
}