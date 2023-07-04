package gw;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes6.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private final String f28444a;

    /* renamed from: b  reason: collision with root package name */
    private final c f28445b;

    /* renamed from: c  reason: collision with root package name */
    private final a f28446c;

    /* loaded from: classes6.dex */
    public enum a {
        AUTO("auto"),
        MANUAL("manual");
        
        private final String method;

        a(String str) {
            this.method = str;
        }

        public final String getMethod() {
            return this.method;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final n createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.s.g(parcel, "parcel");
            return new n(parcel.readString(), c.valueOf(parcel.readString()), a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final n[] newArray(int i11) {
            return new n[i11];
        }
    }

    /* loaded from: classes6.dex */
    public enum c {
        CENTER,
        LEFT,
        RIGHT
    }

    public n(String absoluteFilePath, c direction, a captureMethod) {
        kotlin.jvm.internal.s.g(absoluteFilePath, "absoluteFilePath");
        kotlin.jvm.internal.s.g(direction, "direction");
        kotlin.jvm.internal.s.g(captureMethod, "captureMethod");
        this.f28444a = absoluteFilePath;
        this.f28445b = direction;
        this.f28446c = captureMethod;
    }

    public final String a() {
        return this.f28444a;
    }

    public final a b() {
        return this.f28446c;
    }

    public final c c() {
        return this.f28445b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return kotlin.jvm.internal.s.c(this.f28444a, nVar.f28444a) && this.f28445b == nVar.f28445b && this.f28446c == nVar.f28446c;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f28444a.hashCode() * 31) + this.f28445b.hashCode()) * 31) + this.f28446c.hashCode();
    }

    public String toString() {
        return "Selfie(absoluteFilePath=" + this.f28444a + ", direction=" + this.f28445b + ", captureMethod=" + this.f28446c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.s.g(out, "out");
        out.writeString(this.f28444a);
        out.writeString(this.f28445b.name());
        out.writeString(this.f28446c.name());
    }
}