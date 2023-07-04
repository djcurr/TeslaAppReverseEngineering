package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public abstract class LinkAccountVerificationStatus implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, LinkAccountVerificationStatus> map;
    private final String json;

    /* loaded from: classes2.dex */
    public static final class AUTOMATICALLY_VERIFIED extends LinkAccountVerificationStatus {
        public static final AUTOMATICALLY_VERIFIED INSTANCE = new AUTOMATICALLY_VERIFIED();
        public static final Parcelable.Creator<AUTOMATICALLY_VERIFIED> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<AUTOMATICALLY_VERIFIED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AUTOMATICALLY_VERIFIED createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return AUTOMATICALLY_VERIFIED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AUTOMATICALLY_VERIFIED[] newArray(int i11) {
                return new AUTOMATICALLY_VERIFIED[i11];
            }
        }

        private AUTOMATICALLY_VERIFIED() {
            super("automatically_verified", null);
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

        public final LinkAccountVerificationStatus convert(String str) {
            if (str == null) {
                return null;
            }
            LinkAccountVerificationStatus linkAccountVerificationStatus = (LinkAccountVerificationStatus) LinkAccountVerificationStatus.map.get(str);
            return linkAccountVerificationStatus == null ? new UNKNOWN(str) : linkAccountVerificationStatus;
        }
    }

    /* loaded from: classes2.dex */
    public static final class MANUALLY_VERIFIED extends LinkAccountVerificationStatus {
        public static final MANUALLY_VERIFIED INSTANCE = new MANUALLY_VERIFIED();
        public static final Parcelable.Creator<MANUALLY_VERIFIED> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<MANUALLY_VERIFIED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MANUALLY_VERIFIED createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return MANUALLY_VERIFIED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MANUALLY_VERIFIED[] newArray(int i11) {
                return new MANUALLY_VERIFIED[i11];
            }
        }

        private MANUALLY_VERIFIED() {
            super("manually_verified", null);
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
    public static final class PENDING_AUTOMATIC_VERIFICATION extends LinkAccountVerificationStatus {
        public static final PENDING_AUTOMATIC_VERIFICATION INSTANCE = new PENDING_AUTOMATIC_VERIFICATION();
        public static final Parcelable.Creator<PENDING_AUTOMATIC_VERIFICATION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<PENDING_AUTOMATIC_VERIFICATION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PENDING_AUTOMATIC_VERIFICATION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return PENDING_AUTOMATIC_VERIFICATION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PENDING_AUTOMATIC_VERIFICATION[] newArray(int i11) {
                return new PENDING_AUTOMATIC_VERIFICATION[i11];
            }
        }

        private PENDING_AUTOMATIC_VERIFICATION() {
            super("pending_automatic_verification", null);
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
    public static final class PENDING_MANUAL_VERIFICATION extends LinkAccountVerificationStatus {
        public static final PENDING_MANUAL_VERIFICATION INSTANCE = new PENDING_MANUAL_VERIFICATION();
        public static final Parcelable.Creator<PENDING_MANUAL_VERIFICATION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<PENDING_MANUAL_VERIFICATION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PENDING_MANUAL_VERIFICATION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return PENDING_MANUAL_VERIFICATION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PENDING_MANUAL_VERIFICATION[] newArray(int i11) {
                return new PENDING_MANUAL_VERIFICATION[i11];
            }
        }

        private PENDING_MANUAL_VERIFICATION() {
            super("pending_manual_verification", null);
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
    public static final class UNKNOWN extends LinkAccountVerificationStatus {
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

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (s.c(UNKNOWN.class, obj == null ? null : obj.getClass())) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.plaid.link.result.LinkAccountVerificationStatus.UNKNOWN");
                return s.c(this.rawJson, ((UNKNOWN) obj).rawJson);
            }
            return false;
        }

        public final String getRawJson() {
            return this.rawJson;
        }

        public int hashCode() {
            return this.rawJson.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.rawJson);
        }
    }

    /* loaded from: classes2.dex */
    public static final class VERIFICATION_EXPIRED extends LinkAccountVerificationStatus {
        public static final VERIFICATION_EXPIRED INSTANCE = new VERIFICATION_EXPIRED();
        public static final Parcelable.Creator<VERIFICATION_EXPIRED> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<VERIFICATION_EXPIRED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VERIFICATION_EXPIRED createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return VERIFICATION_EXPIRED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VERIFICATION_EXPIRED[] newArray(int i11) {
                return new VERIFICATION_EXPIRED[i11];
            }
        }

        private VERIFICATION_EXPIRED() {
            super("verification_expired", null);
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
    public static final class VERIFICATION_FAILED extends LinkAccountVerificationStatus {
        public static final VERIFICATION_FAILED INSTANCE = new VERIFICATION_FAILED();
        public static final Parcelable.Creator<VERIFICATION_FAILED> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<VERIFICATION_FAILED> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VERIFICATION_FAILED createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return VERIFICATION_FAILED.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VERIFICATION_FAILED[] newArray(int i11) {
                return new VERIFICATION_FAILED[i11];
            }
        }

        private VERIFICATION_FAILED() {
            super("verification_failed", null);
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
        Map<String, LinkAccountVerificationStatus> l11;
        PENDING_AUTOMATIC_VERIFICATION pending_automatic_verification = PENDING_AUTOMATIC_VERIFICATION.INSTANCE;
        PENDING_MANUAL_VERIFICATION pending_manual_verification = PENDING_MANUAL_VERIFICATION.INSTANCE;
        AUTOMATICALLY_VERIFIED automatically_verified = AUTOMATICALLY_VERIFIED.INSTANCE;
        MANUALLY_VERIFIED manually_verified = MANUALLY_VERIFIED.INSTANCE;
        VERIFICATION_EXPIRED verification_expired = VERIFICATION_EXPIRED.INSTANCE;
        VERIFICATION_FAILED verification_failed = VERIFICATION_FAILED.INSTANCE;
        l11 = s0.l(v.a(pending_automatic_verification.getJson(), pending_automatic_verification), v.a(pending_manual_verification.getJson(), pending_manual_verification), v.a(automatically_verified.getJson(), automatically_verified), v.a(manually_verified.getJson(), manually_verified), v.a(verification_expired.getJson(), verification_expired), v.a(verification_failed.getJson(), verification_failed));
        map = l11;
    }

    private LinkAccountVerificationStatus(String str) {
        this.json = str;
    }

    public /* synthetic */ LinkAccountVerificationStatus(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getJson() {
        return this.json;
    }
}