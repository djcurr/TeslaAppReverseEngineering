package nv;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f41902a;

    /* renamed from: b  reason: collision with root package name */
    public String f41903b;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<h> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public h[] newArray(int i11) {
            return new h[i11];
        }
    }

    public h() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f41902a);
        parcel.writeString(this.f41903b);
    }

    protected h(Parcel parcel) {
        this.f41902a = parcel.readString();
        this.f41903b = parcel.readString();
    }
}