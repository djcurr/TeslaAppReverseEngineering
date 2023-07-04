package zv;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<com.withpersona.sdk.inquiry.internal.c> f60888a;

    /* loaded from: classes6.dex */
    public static final class a implements Parcelable.Creator<e0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final e0 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.s.g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(parcel.readParcelable(e0.class.getClassLoader()));
            }
            return new e0(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final e0[] newArray(int i11) {
            return new e0[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(List<? extends com.withpersona.sdk.inquiry.internal.c> verifications) {
        kotlin.jvm.internal.s.g(verifications, "verifications");
        this.f60888a = verifications;
    }

    public final List<com.withpersona.sdk.inquiry.internal.c> a() {
        return this.f60888a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.s.g(out, "out");
        List<com.withpersona.sdk.inquiry.internal.c> list = this.f60888a;
        out.writeInt(list.size());
        for (com.withpersona.sdk.inquiry.internal.c cVar : list) {
            out.writeParcelable(cVar, i11);
        }
    }
}