package rr;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class j implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f49661a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<Parcelable> f49662b;

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<j> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            String readString = parcel.readString();
            s.e(readString);
            s.f(readString, "parcel.readString()!!");
            SparseArray readSparseArray = parcel.readSparseArray(j.class.getClassLoader());
            s.e(readSparseArray);
            s.f(readSparseArray, "parcel.readSparseArray<Parcelable>(ViewStateFrame::class.java.classLoader)!!");
            return new j(readString, readSparseArray);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public j[] newArray(int i11) {
            return new j[i11];
        }
    }

    public j(String key, SparseArray<Parcelable> viewState) {
        s.g(key, "key");
        s.g(viewState, "viewState");
        this.f49661a = key;
        this.f49662b = viewState;
    }

    public final SparseArray<Parcelable> a() {
        return this.f49662b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return s.c(this.f49661a, jVar.f49661a) && s.c(this.f49662b, jVar.f49662b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f49661a.hashCode() * 31) + this.f49662b.hashCode();
    }

    public String toString() {
        return "ViewStateFrame(key=" + this.f49661a + ", viewState=" + this.f49662b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        parcel.writeString(this.f49661a);
        parcel.writeSparseArray(this.f49662b);
    }
}