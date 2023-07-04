package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0034a();

    /* renamed from: a  reason: collision with root package name */
    private final int f1053a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f1054b;

    /* renamed from: androidx.activity.result.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0034a implements Parcelable.Creator<a> {
        C0034a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(int i11, Intent intent) {
        this.f1053a = i11;
        this.f1054b = intent;
    }

    public static String c(int i11) {
        return i11 != -1 ? i11 != 0 ? String.valueOf(i11) : "RESULT_CANCELED" : "RESULT_OK";
    }

    public Intent a() {
        return this.f1054b;
    }

    public int b() {
        return this.f1053a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.f1053a) + ", data=" + this.f1054b + CoreConstants.CURLY_RIGHT;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f1053a);
        parcel.writeInt(this.f1054b == null ? 0 : 1);
        Intent intent = this.f1054b;
        if (intent != null) {
            intent.writeToParcel(parcel, i11);
        }
    }

    a(Parcel parcel) {
        this.f1053a = parcel.readInt();
        this.f1054b = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}