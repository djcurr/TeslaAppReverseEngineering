package nv;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public Map<String, d> f41898a;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e[] newArray(int i11) {
            return new e[i11];
        }
    }

    protected e(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f41898a = new HashMap();
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f41898a.put(parcel.readString(), (d) parcel.readParcelable(d.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f41898a.size());
        for (Map.Entry<String, d> entry : this.f41898a.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeParcelable(entry.getValue(), i11);
        }
    }

    public e() {
        this.f41898a = new HashMap();
    }
}