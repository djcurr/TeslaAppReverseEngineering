package dj;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e[] newArray(int i11) {
            return new e[i11];
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
    }
}