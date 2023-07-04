package a4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final Parcelable f232a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f231b = new C0009a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0009a extends a {
        C0009a() {
            super((C0009a) null);
        }
    }

    /* loaded from: classes.dex */
    class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f231b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* synthetic */ a(C0009a c0009a) {
        this();
    }

    public final Parcelable a() {
        return this.f232a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f232a, i11);
    }

    private a() {
        this.f232a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f232a = parcelable == f231b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f232a = readParcelable == null ? f231b : readParcelable;
    }
}