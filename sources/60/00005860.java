package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class ChallengeAction implements Parcelable {

    /* loaded from: classes6.dex */
    public static final class Cancel extends ChallengeAction {
        public static final Cancel INSTANCE = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Cancel> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return Cancel.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i11) {
                return new Cancel[i11];
            }
        }

        private Cancel() {
            super(null);
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

    /* loaded from: classes6.dex */
    public static final class HtmlForm extends ChallengeAction {
        public static final Parcelable.Creator<HtmlForm> CREATOR = new Creator();
        private final String userEntry;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<HtmlForm> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HtmlForm createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new HtmlForm(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final HtmlForm[] newArray(int i11) {
                return new HtmlForm[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HtmlForm(String userEntry) {
            super(null);
            s.g(userEntry, "userEntry");
            this.userEntry = userEntry;
        }

        public static /* synthetic */ HtmlForm copy$default(HtmlForm htmlForm, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = htmlForm.userEntry;
            }
            return htmlForm.copy(str);
        }

        public final String component1$3ds2sdk_release() {
            return this.userEntry;
        }

        public final HtmlForm copy(String userEntry) {
            s.g(userEntry, "userEntry");
            return new HtmlForm(userEntry);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HtmlForm) && s.c(this.userEntry, ((HtmlForm) obj).userEntry);
        }

        public final String getUserEntry$3ds2sdk_release() {
            return this.userEntry;
        }

        public int hashCode() {
            return this.userEntry.hashCode();
        }

        public String toString() {
            return "HtmlForm(userEntry=" + this.userEntry + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.userEntry);
        }
    }

    /* loaded from: classes6.dex */
    public static final class NativeForm extends ChallengeAction {
        public static final Parcelable.Creator<NativeForm> CREATOR = new Creator();
        private final String userEntry;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<NativeForm> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NativeForm createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new NativeForm(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final NativeForm[] newArray(int i11) {
                return new NativeForm[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NativeForm(String userEntry) {
            super(null);
            s.g(userEntry, "userEntry");
            this.userEntry = userEntry;
        }

        public static /* synthetic */ NativeForm copy$default(NativeForm nativeForm, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = nativeForm.userEntry;
            }
            return nativeForm.copy(str);
        }

        public final String component1$3ds2sdk_release() {
            return this.userEntry;
        }

        public final NativeForm copy(String userEntry) {
            s.g(userEntry, "userEntry");
            return new NativeForm(userEntry);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NativeForm) && s.c(this.userEntry, ((NativeForm) obj).userEntry);
        }

        public final String getUserEntry$3ds2sdk_release() {
            return this.userEntry;
        }

        public int hashCode() {
            return this.userEntry.hashCode();
        }

        public String toString() {
            return "NativeForm(userEntry=" + this.userEntry + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.userEntry);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Oob extends ChallengeAction {
        public static final Oob INSTANCE = new Oob();
        public static final Parcelable.Creator<Oob> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Oob> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Oob createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return Oob.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Oob[] newArray(int i11) {
                return new Oob[i11];
            }
        }

        private Oob() {
            super(null);
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

    /* loaded from: classes6.dex */
    public static final class Resend extends ChallengeAction {
        public static final Resend INSTANCE = new Resend();
        public static final Parcelable.Creator<Resend> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Resend> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Resend createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                parcel.readInt();
                return Resend.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Resend[] newArray(int i11) {
                return new Resend[i11];
            }
        }

        private Resend() {
            super(null);
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

    private ChallengeAction() {
    }

    public /* synthetic */ ChallengeAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}