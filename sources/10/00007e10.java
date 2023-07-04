package kj;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import wi.a;

/* loaded from: classes3.dex */
public final class r implements a.b {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f34801a;

    /* renamed from: b  reason: collision with root package name */
    public final String f34802b;

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f34803c;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<r> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public r createFromParcel(Parcel parcel) {
            return new r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public r[] newArray(int i11) {
            return new r[i11];
        }
    }

    public r(String str, String str2, List<b> list) {
        this.f34801a = str;
        this.f34802b = str2;
        this.f34803c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return TextUtils.equals(this.f34801a, rVar.f34801a) && TextUtils.equals(this.f34802b, rVar.f34802b) && this.f34803c.equals(rVar.f34803c);
    }

    public int hashCode() {
        String str = this.f34801a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f34802b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f34803c.hashCode();
    }

    public String toString() {
        String str;
        String str2 = this.f34801a;
        if (str2 != null) {
            String str3 = this.f34802b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 5 + String.valueOf(str3).length());
            sb2.append(" [");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str3);
            sb2.append("]");
            str = sb2.toString();
        } else {
            str = "";
        }
        String valueOf = String.valueOf(str);
        return valueOf.length() != 0 ? "HlsTrackMetadataEntry".concat(valueOf) : new String("HlsTrackMetadataEntry");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f34801a);
        parcel.writeString(this.f34802b);
        int size = this.f34803c.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeParcelable(this.f34803c.get(i12), 0);
        }
    }

    r(Parcel parcel) {
        this.f34801a = parcel.readString();
        this.f34802b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.f34803c = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes3.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final int f34804a;

        /* renamed from: b  reason: collision with root package name */
        public final int f34805b;

        /* renamed from: c  reason: collision with root package name */
        public final String f34806c;

        /* renamed from: d  reason: collision with root package name */
        public final String f34807d;

        /* renamed from: e  reason: collision with root package name */
        public final String f34808e;

        /* renamed from: f  reason: collision with root package name */
        public final String f34809f;

        /* loaded from: classes3.dex */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(int i11, int i12, String str, String str2, String str3, String str4) {
            this.f34804a = i11;
            this.f34805b = i12;
            this.f34806c = str;
            this.f34807d = str2;
            this.f34808e = str3;
            this.f34809f = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f34804a == bVar.f34804a && this.f34805b == bVar.f34805b && TextUtils.equals(this.f34806c, bVar.f34806c) && TextUtils.equals(this.f34807d, bVar.f34807d) && TextUtils.equals(this.f34808e, bVar.f34808e) && TextUtils.equals(this.f34809f, bVar.f34809f);
        }

        public int hashCode() {
            int i11 = ((this.f34804a * 31) + this.f34805b) * 31;
            String str = this.f34806c;
            int hashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f34807d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f34808e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f34809f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f34804a);
            parcel.writeInt(this.f34805b);
            parcel.writeString(this.f34806c);
            parcel.writeString(this.f34807d);
            parcel.writeString(this.f34808e);
            parcel.writeString(this.f34809f);
        }

        b(Parcel parcel) {
            this.f34804a = parcel.readInt();
            this.f34805b = parcel.readInt();
            this.f34806c = parcel.readString();
            this.f34807d = parcel.readString();
            this.f34808e = parcel.readString();
            this.f34809f = parcel.readString();
        }
    }
}