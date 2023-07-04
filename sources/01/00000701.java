package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.q;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s implements Parcelable {
    public static final Parcelable.Creator<s> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    ArrayList<w> f4943a;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<String> f4944b;

    /* renamed from: c  reason: collision with root package name */
    ArrayList<String> f4945c;

    /* renamed from: d  reason: collision with root package name */
    b[] f4946d;

    /* renamed from: e  reason: collision with root package name */
    int f4947e;

    /* renamed from: f  reason: collision with root package name */
    String f4948f;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<String> f4949g;

    /* renamed from: h  reason: collision with root package name */
    ArrayList<c> f4950h;

    /* renamed from: i  reason: collision with root package name */
    ArrayList<String> f4951i;

    /* renamed from: j  reason: collision with root package name */
    ArrayList<Bundle> f4952j;

    /* renamed from: k  reason: collision with root package name */
    ArrayList<q.k> f4953k;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<s> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public s createFromParcel(Parcel parcel) {
            return new s(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public s[] newArray(int i11) {
            return new s[i11];
        }
    }

    public s() {
        this.f4948f = null;
        this.f4949g = new ArrayList<>();
        this.f4950h = new ArrayList<>();
        this.f4951i = new ArrayList<>();
        this.f4952j = new ArrayList<>();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeTypedList(this.f4943a);
        parcel.writeStringList(this.f4944b);
        parcel.writeStringList(this.f4945c);
        parcel.writeTypedArray(this.f4946d, i11);
        parcel.writeInt(this.f4947e);
        parcel.writeString(this.f4948f);
        parcel.writeStringList(this.f4949g);
        parcel.writeTypedList(this.f4950h);
        parcel.writeStringList(this.f4951i);
        parcel.writeTypedList(this.f4952j);
        parcel.writeTypedList(this.f4953k);
    }

    public s(Parcel parcel) {
        this.f4948f = null;
        this.f4949g = new ArrayList<>();
        this.f4950h = new ArrayList<>();
        this.f4951i = new ArrayList<>();
        this.f4952j = new ArrayList<>();
        this.f4943a = parcel.createTypedArrayList(w.CREATOR);
        this.f4944b = parcel.createStringArrayList();
        this.f4945c = parcel.createStringArrayList();
        this.f4946d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f4947e = parcel.readInt();
        this.f4948f = parcel.readString();
        this.f4949g = parcel.createStringArrayList();
        this.f4950h = parcel.createTypedArrayList(c.CREATOR);
        this.f4951i = parcel.createStringArrayList();
        this.f4952j = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f4953k = parcel.createTypedArrayList(q.k.CREATOR);
    }
}