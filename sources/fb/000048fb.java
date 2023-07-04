package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public abstract class LinkExitMetadataStatus implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, LinkExitMetadataStatus> map;
    private String jsonValue;

    /* loaded from: classes2.dex */
    public static final class CHOOSE_DEVICE extends LinkExitMetadataStatus {
        public static final CHOOSE_DEVICE INSTANCE = new CHOOSE_DEVICE();
        public static final Parcelable.Creator<CHOOSE_DEVICE> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<CHOOSE_DEVICE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CHOOSE_DEVICE createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return CHOOSE_DEVICE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CHOOSE_DEVICE[] newArray(int i11) {
                return new CHOOSE_DEVICE[i11];
            }
        }

        private CHOOSE_DEVICE() {
            super("choose_device", null);
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

        public final LinkExitMetadataStatus fromString(String str) {
            if (str == null || str.length() == 0) {
                return null;
            }
            LinkExitMetadataStatus linkExitMetadataStatus = (LinkExitMetadataStatus) LinkExitMetadataStatus.map.get(str);
            return linkExitMetadataStatus == null ? new UNKNOWN(str) : linkExitMetadataStatus;
        }
    }

    /* loaded from: classes2.dex */
    public static final class INSTITUTION_NOT_FOUND extends LinkExitMetadataStatus {
        public static final INSTITUTION_NOT_FOUND INSTANCE = new INSTITUTION_NOT_FOUND();
        public static final Parcelable.Creator<INSTITUTION_NOT_FOUND> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<INSTITUTION_NOT_FOUND> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INSTITUTION_NOT_FOUND createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return INSTITUTION_NOT_FOUND.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final INSTITUTION_NOT_FOUND[] newArray(int i11) {
                return new INSTITUTION_NOT_FOUND[i11];
            }
        }

        private INSTITUTION_NOT_FOUND() {
            super("institution_not_found", null);
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
    public static final class REQUIRES_ACCOUNT_SELECTION extends LinkExitMetadataStatus {
        public static final REQUIRES_ACCOUNT_SELECTION INSTANCE = new REQUIRES_ACCOUNT_SELECTION();
        public static final Parcelable.Creator<REQUIRES_ACCOUNT_SELECTION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<REQUIRES_ACCOUNT_SELECTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_ACCOUNT_SELECTION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return REQUIRES_ACCOUNT_SELECTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_ACCOUNT_SELECTION[] newArray(int i11) {
                return new REQUIRES_ACCOUNT_SELECTION[i11];
            }
        }

        private REQUIRES_ACCOUNT_SELECTION() {
            super("requires_account_selection", null);
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
    public static final class REQUIRES_CODE extends LinkExitMetadataStatus {
        public static final REQUIRES_CODE INSTANCE = new REQUIRES_CODE();
        public static final Parcelable.Creator<REQUIRES_CODE> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<REQUIRES_CODE> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_CODE createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return REQUIRES_CODE.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_CODE[] newArray(int i11) {
                return new REQUIRES_CODE[i11];
            }
        }

        private REQUIRES_CODE() {
            super("requires_code", null);
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
    public static final class REQUIRES_CREDENTIALS extends LinkExitMetadataStatus {
        public static final REQUIRES_CREDENTIALS INSTANCE = new REQUIRES_CREDENTIALS();
        public static final Parcelable.Creator<REQUIRES_CREDENTIALS> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<REQUIRES_CREDENTIALS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_CREDENTIALS createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return REQUIRES_CREDENTIALS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_CREDENTIALS[] newArray(int i11) {
                return new REQUIRES_CREDENTIALS[i11];
            }
        }

        private REQUIRES_CREDENTIALS() {
            super("requires_credentials", null);
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
    public static final class REQUIRES_OAUTH extends LinkExitMetadataStatus {
        public static final REQUIRES_OAUTH INSTANCE = new REQUIRES_OAUTH();
        public static final Parcelable.Creator<REQUIRES_OAUTH> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<REQUIRES_OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_OAUTH createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return REQUIRES_OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_OAUTH[] newArray(int i11) {
                return new REQUIRES_OAUTH[i11];
            }
        }

        private REQUIRES_OAUTH() {
            super("requires_oauth", null);
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
    public static final class REQUIRES_QUESTIONS extends LinkExitMetadataStatus {
        public static final REQUIRES_QUESTIONS INSTANCE = new REQUIRES_QUESTIONS();
        public static final Parcelable.Creator<REQUIRES_QUESTIONS> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<REQUIRES_QUESTIONS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_QUESTIONS createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return REQUIRES_QUESTIONS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_QUESTIONS[] newArray(int i11) {
                return new REQUIRES_QUESTIONS[i11];
            }
        }

        private REQUIRES_QUESTIONS() {
            super("requires_questions", null);
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
    public static final class REQUIRES_SELECTIONS extends LinkExitMetadataStatus {
        public static final REQUIRES_SELECTIONS INSTANCE = new REQUIRES_SELECTIONS();
        public static final Parcelable.Creator<REQUIRES_SELECTIONS> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<REQUIRES_SELECTIONS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_SELECTIONS createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return REQUIRES_SELECTIONS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final REQUIRES_SELECTIONS[] newArray(int i11) {
                return new REQUIRES_SELECTIONS[i11];
            }
        }

        private REQUIRES_SELECTIONS() {
            super("requires_selections", null);
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
    public static final class UNKNOWN extends LinkExitMetadataStatus {
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

    static {
        Map<String, LinkExitMetadataStatus> l11;
        l11 = s0.l(v.a("choose_device", CHOOSE_DEVICE.INSTANCE), v.a("institution_not_found", INSTITUTION_NOT_FOUND.INSTANCE), v.a("requires_account_selection", REQUIRES_ACCOUNT_SELECTION.INSTANCE), v.a("requires_code", REQUIRES_CODE.INSTANCE), v.a("requires_credentials", REQUIRES_CREDENTIALS.INSTANCE), v.a("requires_oauth", REQUIRES_OAUTH.INSTANCE), v.a("requires_questions", REQUIRES_QUESTIONS.INSTANCE), v.a("requires_selections", REQUIRES_SELECTIONS.INSTANCE));
        map = l11;
    }

    private LinkExitMetadataStatus(String str) {
        this.jsonValue = str;
    }

    public /* synthetic */ LinkExitMetadataStatus(String str, DefaultConstructorMarker defaultConstructorMarker) {
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