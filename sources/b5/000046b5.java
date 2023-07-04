package com.plaid.link.event;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public abstract class LinkEventName implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final Map<String, LinkEventName> map;
    private final String json;

    /* loaded from: classes2.dex */
    public static final class CLOSE_OAUTH extends LinkEventName {
        public static final CLOSE_OAUTH INSTANCE = new CLOSE_OAUTH();
        public static final Parcelable.Creator<CLOSE_OAUTH> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<CLOSE_OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CLOSE_OAUTH createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return CLOSE_OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CLOSE_OAUTH[] newArray(int i11) {
                return new CLOSE_OAUTH[i11];
            }
        }

        private CLOSE_OAUTH() {
            super("CLOSE_OAUTH", null);
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

        public final LinkEventName fromString$link_sdk_release(String string) {
            s.g(string, "string");
            LinkEventName linkEventName = (LinkEventName) LinkEventName.map.get(string);
            return linkEventName == null ? new UNKNOWN(string) : linkEventName;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ERROR extends LinkEventName {
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
    public static final class EXIT extends LinkEventName {
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
    public static final class FAIL_OAUTH extends LinkEventName {
        public static final FAIL_OAUTH INSTANCE = new FAIL_OAUTH();
        public static final Parcelable.Creator<FAIL_OAUTH> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<FAIL_OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FAIL_OAUTH createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return FAIL_OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FAIL_OAUTH[] newArray(int i11) {
                return new FAIL_OAUTH[i11];
            }
        }

        private FAIL_OAUTH() {
            super("FAIL_OAUTH", null);
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
    public static final class HANDOFF extends LinkEventName {
        public static final HANDOFF INSTANCE = new HANDOFF();
        public static final Parcelable.Creator<HANDOFF> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<HANDOFF> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HANDOFF createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return HANDOFF.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HANDOFF[] newArray(int i11) {
                return new HANDOFF[i11];
            }
        }

        private HANDOFF() {
            super("HANDOFF", null);
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
    public static final class IDENTITY_VERIFICATION_CLOSE_UI extends LinkEventName {
        public static final IDENTITY_VERIFICATION_CLOSE_UI INSTANCE = new IDENTITY_VERIFICATION_CLOSE_UI();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_CLOSE_UI> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_CLOSE_UI> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_CLOSE_UI createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_CLOSE_UI.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_CLOSE_UI[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_CLOSE_UI[i11];
            }
        }

        private IDENTITY_VERIFICATION_CLOSE_UI() {
            super("IDENTITY_VERIFICATION_CLOSE_UI", null);
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
    public static final class IDENTITY_VERIFICATION_CREATE_SESSION extends LinkEventName {
        public static final IDENTITY_VERIFICATION_CREATE_SESSION INSTANCE = new IDENTITY_VERIFICATION_CREATE_SESSION();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_CREATE_SESSION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_CREATE_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_CREATE_SESSION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_CREATE_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_CREATE_SESSION[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_CREATE_SESSION[i11];
            }
        }

        private IDENTITY_VERIFICATION_CREATE_SESSION() {
            super("IDENTITY_VERIFICATION_CREATE_SESSION", null);
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
    public static final class IDENTITY_VERIFICATION_FAIL_SESSION extends LinkEventName {
        public static final IDENTITY_VERIFICATION_FAIL_SESSION INSTANCE = new IDENTITY_VERIFICATION_FAIL_SESSION();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_FAIL_SESSION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_FAIL_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_FAIL_SESSION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_FAIL_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_FAIL_SESSION[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_FAIL_SESSION[i11];
            }
        }

        private IDENTITY_VERIFICATION_FAIL_SESSION() {
            super("IDENTITY_VERIFICATION_FAIL_SESSION", null);
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
    public static final class IDENTITY_VERIFICATION_FAIL_STEP extends LinkEventName {
        public static final IDENTITY_VERIFICATION_FAIL_STEP INSTANCE = new IDENTITY_VERIFICATION_FAIL_STEP();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_FAIL_STEP> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_FAIL_STEP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_FAIL_STEP createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_FAIL_STEP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_FAIL_STEP[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_FAIL_STEP[i11];
            }
        }

        private IDENTITY_VERIFICATION_FAIL_STEP() {
            super("IDENTITY_VERIFICATION_FAIL_STEP", null);
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
    public static final class IDENTITY_VERIFICATION_OPEN_UI extends LinkEventName {
        public static final IDENTITY_VERIFICATION_OPEN_UI INSTANCE = new IDENTITY_VERIFICATION_OPEN_UI();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_OPEN_UI> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_OPEN_UI> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_OPEN_UI createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_OPEN_UI.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_OPEN_UI[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_OPEN_UI[i11];
            }
        }

        private IDENTITY_VERIFICATION_OPEN_UI() {
            super("IDENTITY_VERIFICATION_OPEN_UI", null);
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
    public static final class IDENTITY_VERIFICATION_PASS_SESSION extends LinkEventName {
        public static final IDENTITY_VERIFICATION_PASS_SESSION INSTANCE = new IDENTITY_VERIFICATION_PASS_SESSION();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_PASS_SESSION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_PASS_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PASS_SESSION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_PASS_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PASS_SESSION[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_PASS_SESSION[i11];
            }
        }

        private IDENTITY_VERIFICATION_PASS_SESSION() {
            super("IDENTITY_VERIFICATION_PASS_SESSION", null);
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
    public static final class IDENTITY_VERIFICATION_PASS_STEP extends LinkEventName {
        public static final IDENTITY_VERIFICATION_PASS_STEP INSTANCE = new IDENTITY_VERIFICATION_PASS_STEP();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_PASS_STEP> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_PASS_STEP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PASS_STEP createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_PASS_STEP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PASS_STEP[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_PASS_STEP[i11];
            }
        }

        private IDENTITY_VERIFICATION_PASS_STEP() {
            super("IDENTITY_VERIFICATION_PASS_STEP", null);
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
    public static final class IDENTITY_VERIFICATION_PENDING_REVIEW_STEP extends LinkEventName {
        public static final IDENTITY_VERIFICATION_PENDING_REVIEW_STEP INSTANCE = new IDENTITY_VERIFICATION_PENDING_REVIEW_STEP();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_PENDING_REVIEW_STEP> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_PENDING_REVIEW_STEP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PENDING_REVIEW_STEP createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_PENDING_REVIEW_STEP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_PENDING_REVIEW_STEP[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_PENDING_REVIEW_STEP[i11];
            }
        }

        private IDENTITY_VERIFICATION_PENDING_REVIEW_STEP() {
            super("IDENTITY_VERIFICATION_PENDING_REVIEW_STEP", null);
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
    public static final class IDENTITY_VERIFICATION_RESUME_SESSION extends LinkEventName {
        public static final IDENTITY_VERIFICATION_RESUME_SESSION INSTANCE = new IDENTITY_VERIFICATION_RESUME_SESSION();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_RESUME_SESSION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_RESUME_SESSION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_RESUME_SESSION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_RESUME_SESSION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_RESUME_SESSION[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_RESUME_SESSION[i11];
            }
        }

        private IDENTITY_VERIFICATION_RESUME_SESSION() {
            super("IDENTITY_VERIFICATION_RESUME_SESSION", null);
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
    public static final class IDENTITY_VERIFICATION_RESUME_UI extends LinkEventName {
        public static final IDENTITY_VERIFICATION_RESUME_UI INSTANCE = new IDENTITY_VERIFICATION_RESUME_UI();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_RESUME_UI> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_RESUME_UI> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_RESUME_UI createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_RESUME_UI.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_RESUME_UI[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_RESUME_UI[i11];
            }
        }

        private IDENTITY_VERIFICATION_RESUME_UI() {
            super("IDENTITY_VERIFICATION_RESUME_UI", null);
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
    public static final class IDENTITY_VERIFICATION_START_STEP extends LinkEventName {
        public static final IDENTITY_VERIFICATION_START_STEP INSTANCE = new IDENTITY_VERIFICATION_START_STEP();
        public static final Parcelable.Creator<IDENTITY_VERIFICATION_START_STEP> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<IDENTITY_VERIFICATION_START_STEP> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_START_STEP createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return IDENTITY_VERIFICATION_START_STEP.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final IDENTITY_VERIFICATION_START_STEP[] newArray(int i11) {
                return new IDENTITY_VERIFICATION_START_STEP[i11];
            }
        }

        private IDENTITY_VERIFICATION_START_STEP() {
            super("IDENTITY_VERIFICATION_START_STEP", null);
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
    public static final class MATCHED_SELECT_INSTITUTION extends LinkEventName {
        public static final MATCHED_SELECT_INSTITUTION INSTANCE = new MATCHED_SELECT_INSTITUTION();
        public static final Parcelable.Creator<MATCHED_SELECT_INSTITUTION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<MATCHED_SELECT_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_SELECT_INSTITUTION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return MATCHED_SELECT_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_SELECT_INSTITUTION[] newArray(int i11) {
                return new MATCHED_SELECT_INSTITUTION[i11];
            }
        }

        private MATCHED_SELECT_INSTITUTION() {
            super("MATCHED_SELECT_INSTITUTION", null);
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
    public static final class MATCHED_SELECT_VERIFY_METHOD extends LinkEventName {
        public static final MATCHED_SELECT_VERIFY_METHOD INSTANCE = new MATCHED_SELECT_VERIFY_METHOD();
        public static final Parcelable.Creator<MATCHED_SELECT_VERIFY_METHOD> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<MATCHED_SELECT_VERIFY_METHOD> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_SELECT_VERIFY_METHOD createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return MATCHED_SELECT_VERIFY_METHOD.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MATCHED_SELECT_VERIFY_METHOD[] newArray(int i11) {
                return new MATCHED_SELECT_VERIFY_METHOD[i11];
            }
        }

        private MATCHED_SELECT_VERIFY_METHOD() {
            super("MATCHED_SELECT_VERIFY_METHOD", null);
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
    public static final class OPEN extends LinkEventName {
        public static final OPEN INSTANCE = new OPEN();
        public static final Parcelable.Creator<OPEN> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<OPEN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OPEN createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return OPEN.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OPEN[] newArray(int i11) {
                return new OPEN[i11];
            }
        }

        private OPEN() {
            super("OPEN", null);
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
    public static final class OPEN_MY_PLAID extends LinkEventName {
        public static final OPEN_MY_PLAID INSTANCE = new OPEN_MY_PLAID();
        public static final Parcelable.Creator<OPEN_MY_PLAID> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<OPEN_MY_PLAID> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OPEN_MY_PLAID createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return OPEN_MY_PLAID.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OPEN_MY_PLAID[] newArray(int i11) {
                return new OPEN_MY_PLAID[i11];
            }
        }

        private OPEN_MY_PLAID() {
            super("OPEN_MY_PLAID", null);
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
    public static final class OPEN_OAUTH extends LinkEventName {
        public static final OPEN_OAUTH INSTANCE = new OPEN_OAUTH();
        public static final Parcelable.Creator<OPEN_OAUTH> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<OPEN_OAUTH> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OPEN_OAUTH createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return OPEN_OAUTH.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OPEN_OAUTH[] newArray(int i11) {
                return new OPEN_OAUTH[i11];
            }
        }

        private OPEN_OAUTH() {
            super("OPEN_OAUTH", null);
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
    public static final class SEARCH_INSTITUTION extends LinkEventName {
        public static final SEARCH_INSTITUTION INSTANCE = new SEARCH_INSTITUTION();
        public static final Parcelable.Creator<SEARCH_INSTITUTION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SEARCH_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SEARCH_INSTITUTION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return SEARCH_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SEARCH_INSTITUTION[] newArray(int i11) {
                return new SEARCH_INSTITUTION[i11];
            }
        }

        private SEARCH_INSTITUTION() {
            super("SEARCH_INSTITUTION", null);
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
    public static final class SELECT_AUTH_TYPE extends LinkEventName {
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
    public static final class SELECT_DEGRADED_INSTITUTION extends LinkEventName {
        public static final SELECT_DEGRADED_INSTITUTION INSTANCE = new SELECT_DEGRADED_INSTITUTION();
        public static final Parcelable.Creator<SELECT_DEGRADED_INSTITUTION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SELECT_DEGRADED_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_DEGRADED_INSTITUTION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return SELECT_DEGRADED_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_DEGRADED_INSTITUTION[] newArray(int i11) {
                return new SELECT_DEGRADED_INSTITUTION[i11];
            }
        }

        private SELECT_DEGRADED_INSTITUTION() {
            super("SELECT_DEGRADED_INSTITUTION", null);
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
    public static final class SELECT_DOWN_INSTITUTION extends LinkEventName {
        public static final SELECT_DOWN_INSTITUTION INSTANCE = new SELECT_DOWN_INSTITUTION();
        public static final Parcelable.Creator<SELECT_DOWN_INSTITUTION> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SELECT_DOWN_INSTITUTION> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_DOWN_INSTITUTION createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return SELECT_DOWN_INSTITUTION.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SELECT_DOWN_INSTITUTION[] newArray(int i11) {
                return new SELECT_DOWN_INSTITUTION[i11];
            }
        }

        private SELECT_DOWN_INSTITUTION() {
            super("SELECT_DOWN_INSTITUTION", null);
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
    public static final class SELECT_INSTITUTION extends LinkEventName {
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
    public static final class SUBMIT_CREDENTIALS extends LinkEventName {
        public static final SUBMIT_CREDENTIALS INSTANCE = new SUBMIT_CREDENTIALS();
        public static final Parcelable.Creator<SUBMIT_CREDENTIALS> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SUBMIT_CREDENTIALS> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_CREDENTIALS createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_CREDENTIALS.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_CREDENTIALS[] newArray(int i11) {
                return new SUBMIT_CREDENTIALS[i11];
            }
        }

        private SUBMIT_CREDENTIALS() {
            super("SUBMIT_CREDENTIALS", null);
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
    public static final class SUBMIT_MFA extends LinkEventName {
        public static final SUBMIT_MFA INSTANCE = new SUBMIT_MFA();
        public static final Parcelable.Creator<SUBMIT_MFA> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SUBMIT_MFA> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_MFA createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_MFA.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_MFA[] newArray(int i11) {
                return new SUBMIT_MFA[i11];
            }
        }

        private SUBMIT_MFA() {
            super("SUBMIT_MFA", null);
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
    public static final class SUBMIT_ROUTING_NUMBER extends LinkEventName {
        public static final SUBMIT_ROUTING_NUMBER INSTANCE = new SUBMIT_ROUTING_NUMBER();
        public static final Parcelable.Creator<SUBMIT_ROUTING_NUMBER> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<SUBMIT_ROUTING_NUMBER> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_ROUTING_NUMBER createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return SUBMIT_ROUTING_NUMBER.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SUBMIT_ROUTING_NUMBER[] newArray(int i11) {
                return new SUBMIT_ROUTING_NUMBER[i11];
            }
        }

        private SUBMIT_ROUTING_NUMBER() {
            super("SUBMIT_ROUTING_NUMBER", null);
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
    public static final class TRANSITION_VIEW extends LinkEventName {
        public static final TRANSITION_VIEW INSTANCE = new TRANSITION_VIEW();
        public static final Parcelable.Creator<TRANSITION_VIEW> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<TRANSITION_VIEW> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TRANSITION_VIEW createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return TRANSITION_VIEW.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TRANSITION_VIEW[] newArray(int i11) {
                return new TRANSITION_VIEW[i11];
            }
        }

        private TRANSITION_VIEW() {
            super("TRANSITION_VIEW", null);
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
    public static final class UNKNOWN extends LinkEventName {
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();
        private String rawJson;

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

        public final String getRawJson() {
            return this.rawJson;
        }

        public final void setRawJson(String str) {
            s.g(str, "<set-?>");
            this.rawJson = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.rawJson);
        }
    }

    static {
        Map<String, LinkEventName> l11;
        CLOSE_OAUTH close_oauth = CLOSE_OAUTH.INSTANCE;
        ERROR error = ERROR.INSTANCE;
        EXIT exit = EXIT.INSTANCE;
        FAIL_OAUTH fail_oauth = FAIL_OAUTH.INSTANCE;
        HANDOFF handoff = HANDOFF.INSTANCE;
        IDENTITY_VERIFICATION_START_STEP identity_verification_start_step = IDENTITY_VERIFICATION_START_STEP.INSTANCE;
        IDENTITY_VERIFICATION_PASS_STEP identity_verification_pass_step = IDENTITY_VERIFICATION_PASS_STEP.INSTANCE;
        IDENTITY_VERIFICATION_FAIL_STEP identity_verification_fail_step = IDENTITY_VERIFICATION_FAIL_STEP.INSTANCE;
        IDENTITY_VERIFICATION_PENDING_REVIEW_STEP identity_verification_pending_review_step = IDENTITY_VERIFICATION_PENDING_REVIEW_STEP.INSTANCE;
        IDENTITY_VERIFICATION_CREATE_SESSION identity_verification_create_session = IDENTITY_VERIFICATION_CREATE_SESSION.INSTANCE;
        IDENTITY_VERIFICATION_RESUME_SESSION identity_verification_resume_session = IDENTITY_VERIFICATION_RESUME_SESSION.INSTANCE;
        IDENTITY_VERIFICATION_PASS_SESSION identity_verification_pass_session = IDENTITY_VERIFICATION_PASS_SESSION.INSTANCE;
        IDENTITY_VERIFICATION_FAIL_SESSION identity_verification_fail_session = IDENTITY_VERIFICATION_FAIL_SESSION.INSTANCE;
        IDENTITY_VERIFICATION_OPEN_UI identity_verification_open_ui = IDENTITY_VERIFICATION_OPEN_UI.INSTANCE;
        IDENTITY_VERIFICATION_RESUME_UI identity_verification_resume_ui = IDENTITY_VERIFICATION_RESUME_UI.INSTANCE;
        IDENTITY_VERIFICATION_CLOSE_UI identity_verification_close_ui = IDENTITY_VERIFICATION_CLOSE_UI.INSTANCE;
        MATCHED_SELECT_INSTITUTION matched_select_institution = MATCHED_SELECT_INSTITUTION.INSTANCE;
        MATCHED_SELECT_VERIFY_METHOD matched_select_verify_method = MATCHED_SELECT_VERIFY_METHOD.INSTANCE;
        OPEN open = OPEN.INSTANCE;
        OPEN_MY_PLAID open_my_plaid = OPEN_MY_PLAID.INSTANCE;
        OPEN_OAUTH open_oauth = OPEN_OAUTH.INSTANCE;
        SEARCH_INSTITUTION search_institution = SEARCH_INSTITUTION.INSTANCE;
        SELECT_AUTH_TYPE select_auth_type = SELECT_AUTH_TYPE.INSTANCE;
        SELECT_DEGRADED_INSTITUTION select_degraded_institution = SELECT_DEGRADED_INSTITUTION.INSTANCE;
        SELECT_DOWN_INSTITUTION select_down_institution = SELECT_DOWN_INSTITUTION.INSTANCE;
        SELECT_INSTITUTION select_institution = SELECT_INSTITUTION.INSTANCE;
        SUBMIT_CREDENTIALS submit_credentials = SUBMIT_CREDENTIALS.INSTANCE;
        SUBMIT_MFA submit_mfa = SUBMIT_MFA.INSTANCE;
        SUBMIT_ROUTING_NUMBER submit_routing_number = SUBMIT_ROUTING_NUMBER.INSTANCE;
        TRANSITION_VIEW transition_view = TRANSITION_VIEW.INSTANCE;
        l11 = s0.l(v.a(close_oauth.getJson(), close_oauth), v.a(error.getJson(), error), v.a(exit.getJson(), exit), v.a(fail_oauth.getJson(), fail_oauth), v.a(handoff.getJson(), handoff), v.a(identity_verification_start_step.getJson(), identity_verification_start_step), v.a(identity_verification_pass_step.getJson(), identity_verification_pass_step), v.a(identity_verification_fail_step.getJson(), identity_verification_fail_step), v.a(identity_verification_pending_review_step.getJson(), identity_verification_pending_review_step), v.a(identity_verification_create_session.getJson(), identity_verification_create_session), v.a(identity_verification_resume_session.getJson(), identity_verification_resume_session), v.a(identity_verification_pass_session.getJson(), identity_verification_pass_session), v.a(identity_verification_fail_session.getJson(), identity_verification_fail_session), v.a(identity_verification_open_ui.getJson(), identity_verification_open_ui), v.a(identity_verification_resume_ui.getJson(), identity_verification_resume_ui), v.a(identity_verification_close_ui.getJson(), identity_verification_close_ui), v.a(matched_select_institution.getJson(), matched_select_institution), v.a(matched_select_verify_method.getJson(), matched_select_verify_method), v.a(open.getJson(), open), v.a(open_my_plaid.getJson(), open_my_plaid), v.a(open_oauth.getJson(), open_oauth), v.a(search_institution.getJson(), search_institution), v.a(select_auth_type.getJson(), select_auth_type), v.a(select_degraded_institution.getJson(), select_degraded_institution), v.a(select_down_institution.getJson(), select_down_institution), v.a(select_institution.getJson(), select_institution), v.a(submit_credentials.getJson(), submit_credentials), v.a(submit_mfa.getJson(), submit_mfa), v.a(submit_routing_number.getJson(), submit_routing_number), v.a(transition_view.getJson(), transition_view));
        map = l11;
    }

    private LinkEventName(String str) {
        this.json = str;
    }

    public /* synthetic */ LinkEventName(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String getJson() {
        return this.json;
    }

    public String toString() {
        return this.json;
    }
}