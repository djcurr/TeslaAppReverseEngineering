package zv;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, z> f60813a;

    /* loaded from: classes6.dex */
    public static final class a implements Parcelable.Creator<a0> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final a0 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.s.g(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                linkedHashMap.put(parcel.readString(), parcel.readParcelable(a0.class.getClassLoader()));
            }
            return new a0(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final a0[] newArray(int i11) {
            return new a0[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a0(Map<String, ? extends z> fields) {
        kotlin.jvm.internal.s.g(fields, "fields");
        this.f60813a = fields;
    }

    public final Map<String, z> a() {
        return this.f60813a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.s.g(out, "out");
        Map<String, z> map = this.f60813a;
        out.writeInt(map.size());
        for (Map.Entry<String, z> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeParcelable(entry.getValue(), i11);
        }
    }
}