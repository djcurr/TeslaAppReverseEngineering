package c1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class r0<T> extends l1<T> implements Parcelable {
    public static final Parcelable.Creator<r0<Object>> CREATOR;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.ClassLoaderCreator<r0<Object>> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public r0<Object> createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.s.g(parcel, "parcel");
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public r0<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            m1 h11;
            kotlin.jvm.internal.s.g(parcel, "parcel");
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            Object readValue = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                h11 = n1.h();
            } else if (readInt == 1) {
                h11 = n1.o();
            } else if (readInt == 2) {
                h11 = n1.l();
            } else {
                throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
            }
            return new r0<>(readValue, h11);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public ParcelableSnapshotMutableState<Object>[] newArray(int i11) {
            return new r0[i11];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(T t11, m1<T> policy) {
        super(t11, policy);
        kotlin.jvm.internal.s.g(policy, "policy");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(parcel, "parcel");
        parcel.writeValue(getValue());
        m1<T> d11 = d();
        if (kotlin.jvm.internal.s.c(d11, n1.h())) {
            i12 = 0;
        } else if (kotlin.jvm.internal.s.c(d11, n1.o())) {
            i12 = 1;
        } else if (!kotlin.jvm.internal.s.c(d11, n1.l())) {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        } else {
            i12 = 2;
        }
        parcel.writeInt(i12);
    }
}