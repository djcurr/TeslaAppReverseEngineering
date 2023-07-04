package com.stripe.android.stripe3ds2.init;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class Warning implements Parcelable {
    public static final Parcelable.Creator<Warning> CREATOR = new Creator();

    /* renamed from: id  reason: collision with root package name */
    private final String f21021id;
    private final String message;
    private final Severity severity;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Warning> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Warning createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new Warning(parcel.readString(), parcel.readString(), Severity.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Warning[] newArray(int i11) {
            return new Warning[i11];
        }
    }

    /* loaded from: classes6.dex */
    public enum Severity {
        LOW,
        MEDIUM,
        HIGH
    }

    public Warning(String id2, String message, Severity severity) {
        s.g(id2, "id");
        s.g(message, "message");
        s.g(severity, "severity");
        this.f21021id = id2;
        this.message = message;
        this.severity = severity;
    }

    public static /* synthetic */ Warning copy$default(Warning warning, String str, String str2, Severity severity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = warning.f21021id;
        }
        if ((i11 & 2) != 0) {
            str2 = warning.message;
        }
        if ((i11 & 4) != 0) {
            severity = warning.severity;
        }
        return warning.copy(str, str2, severity);
    }

    public final String component1() {
        return this.f21021id;
    }

    public final String component2() {
        return this.message;
    }

    public final Severity component3() {
        return this.severity;
    }

    public final Warning copy(String id2, String message, Severity severity) {
        s.g(id2, "id");
        s.g(message, "message");
        s.g(severity, "severity");
        return new Warning(id2, message, severity);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Warning) {
            Warning warning = (Warning) obj;
            return s.c(this.f21021id, warning.f21021id) && s.c(this.message, warning.message) && this.severity == warning.severity;
        }
        return false;
    }

    public final String getId() {
        return this.f21021id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Severity getSeverity() {
        return this.severity;
    }

    public int hashCode() {
        return (((this.f21021id.hashCode() * 31) + this.message.hashCode()) * 31) + this.severity.hashCode();
    }

    public String toString() {
        return "Warning(id=" + this.f21021id + ", message=" + this.message + ", severity=" + this.severity + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f21021id);
        out.writeString(this.message);
        out.writeString(this.severity.name());
    }
}