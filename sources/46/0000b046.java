package r7;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f49275a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49276b;

    /* renamed from: c  reason: collision with root package name */
    private final String f49277c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49278d;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    }

    /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }

    public String a() {
        return this.f49275a;
    }

    public String b() {
        return this.f49276b;
    }

    public String c() {
        return this.f49277c;
    }

    public String d() {
        return this.f49278d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f49275a);
        parcel.writeString(this.f49276b);
        parcel.writeString(this.f49277c);
        parcel.writeString(this.f49278d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(String str, String str2, String str3, String str4) {
        this.f49275a = str;
        this.f49276b = str2;
        this.f49277c = str3;
        this.f49278d = str4;
    }

    private c(Parcel parcel) {
        this.f49275a = parcel.readString();
        this.f49276b = parcel.readString();
        this.f49277c = parcel.readString();
        this.f49278d = parcel.readString();
    }
}