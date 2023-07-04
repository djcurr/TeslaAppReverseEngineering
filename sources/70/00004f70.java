package com.stripe.android.link.ui;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class ErrorMessage implements Parcelable {

    /* loaded from: classes6.dex */
    public static final class FromResources extends ErrorMessage {
        private final int stringResId;
        public static final Parcelable.Creator<FromResources> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<FromResources> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromResources createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new FromResources(parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FromResources[] newArray(int i11) {
                return new FromResources[i11];
            }
        }

        public FromResources(int i11) {
            super(null);
            this.stringResId = i11;
        }

        public static /* synthetic */ FromResources copy$default(FromResources fromResources, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = fromResources.stringResId;
            }
            return fromResources.copy(i11);
        }

        public final int component1() {
            return this.stringResId;
        }

        public final FromResources copy(int i11) {
            return new FromResources(i11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FromResources) && this.stringResId == ((FromResources) obj).stringResId;
        }

        @Override // com.stripe.android.link.ui.ErrorMessage
        public String getMessage(Resources resources) {
            s.g(resources, "resources");
            String string = resources.getString(this.stringResId);
            s.f(string, "resources.getString(stringResId)");
            return string;
        }

        public final int getStringResId() {
            return this.stringResId;
        }

        public int hashCode() {
            return Integer.hashCode(this.stringResId);
        }

        public String toString() {
            return "FromResources(stringResId=" + this.stringResId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(this.stringResId);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Raw extends ErrorMessage {
        private final String errorMessage;
        public static final Parcelable.Creator<Raw> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Raw> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Raw createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Raw(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Raw[] newArray(int i11) {
                return new Raw[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Raw(String errorMessage) {
            super(null);
            s.g(errorMessage, "errorMessage");
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ Raw copy$default(Raw raw, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = raw.errorMessage;
            }
            return raw.copy(str);
        }

        public final String component1() {
            return this.errorMessage;
        }

        public final Raw copy(String errorMessage) {
            s.g(errorMessage, "errorMessage");
            return new Raw(errorMessage);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Raw) && s.c(this.errorMessage, ((Raw) obj).errorMessage);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        @Override // com.stripe.android.link.ui.ErrorMessage
        public String getMessage(Resources resources) {
            s.g(resources, "resources");
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode();
        }

        public String toString() {
            return "Raw(errorMessage=" + this.errorMessage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.errorMessage);
        }
    }

    private ErrorMessage() {
    }

    public /* synthetic */ ErrorMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getMessage(Resources resources);
}