package androidx.versionedparcelable;

import a5.b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b f6363a;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<ParcelImpl> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelImpl[] newArray(int i11) {
            return new ParcelImpl[i11];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f6363a = new androidx.versionedparcelable.a(parcel).u();
    }

    public <T extends b> T a() {
        return (T) this.f6363a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        new androidx.versionedparcelable.a(parcel).L(this.f6363a);
    }
}