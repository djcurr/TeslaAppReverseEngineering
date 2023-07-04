package xk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.g;

/* loaded from: classes3.dex */
public class a extends a4.a {
    public static final Parcelable.Creator<a> CREATOR = new C1307a();

    /* renamed from: c  reason: collision with root package name */
    public final g<String, Bundle> f57592c;

    /* renamed from: xk.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C1307a implements Parcelable.ClassLoaderCreator<a> {
        C1307a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C1307a c1307a) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f57592c + "}";
    }

    @Override // a4.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        int size = this.f57592c.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i12 = 0; i12 < size; i12++) {
            strArr[i12] = this.f57592c.k(i12);
            bundleArr[i12] = this.f57592c.o(i12);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f57592c = new g<>();
    }

    private a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f57592c = new g<>(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f57592c.put(strArr[i11], bundleArr[i11]);
        }
    }
}