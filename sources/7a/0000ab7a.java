package pr;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.i;

/* loaded from: classes2.dex */
public final class n implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final nr.m f46883a;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<n> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.s.g(parcel, "parcel");
            i.a aVar = okio.i.f42657e;
            byte[] createByteArray = parcel.createByteArray();
            kotlin.jvm.internal.s.e(createByteArray);
            kotlin.jvm.internal.s.f(createByteArray, "parcel.createByteArray()!!");
            return new n(nr.m.f41814c.a(i.a.h(aVar, createByteArray, 0, 0, 3, null)));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public n[] newArray(int i11) {
            return new n[i11];
        }
    }

    public n(nr.m snapshot) {
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        this.f46883a = snapshot;
    }

    public final nr.m a() {
        return this.f46883a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.s.g(dest, "dest");
        dest.writeByteArray(this.f46883a.c().E());
    }
}