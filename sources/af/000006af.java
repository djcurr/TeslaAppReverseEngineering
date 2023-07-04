package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.z;
import androidx.lifecycle.p;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int[] f4776a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<String> f4777b;

    /* renamed from: c  reason: collision with root package name */
    final int[] f4778c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f4779d;

    /* renamed from: e  reason: collision with root package name */
    final int f4780e;

    /* renamed from: f  reason: collision with root package name */
    final String f4781f;

    /* renamed from: g  reason: collision with root package name */
    final int f4782g;

    /* renamed from: h  reason: collision with root package name */
    final int f4783h;

    /* renamed from: i  reason: collision with root package name */
    final CharSequence f4784i;

    /* renamed from: j  reason: collision with root package name */
    final int f4785j;

    /* renamed from: k  reason: collision with root package name */
    final CharSequence f4786k;

    /* renamed from: l  reason: collision with root package name */
    final ArrayList<String> f4787l;

    /* renamed from: m  reason: collision with root package name */
    final ArrayList<String> f4788m;

    /* renamed from: n  reason: collision with root package name */
    final boolean f4789n;

    /* loaded from: classes.dex */
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f4997c.size();
        this.f4776a = new int[size * 6];
        if (aVar.f5003i) {
            this.f4777b = new ArrayList<>(size);
            this.f4778c = new int[size];
            this.f4779d = new int[size];
            int i11 = 0;
            int i12 = 0;
            while (i11 < size) {
                z.a aVar2 = aVar.f4997c.get(i11);
                int i13 = i12 + 1;
                this.f4776a[i12] = aVar2.f5014a;
                ArrayList<String> arrayList = this.f4777b;
                Fragment fragment = aVar2.f5015b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f4776a;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f5016c ? 1 : 0;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f5017d;
                int i16 = i15 + 1;
                iArr[i15] = aVar2.f5018e;
                int i17 = i16 + 1;
                iArr[i16] = aVar2.f5019f;
                iArr[i17] = aVar2.f5020g;
                this.f4778c[i11] = aVar2.f5021h.ordinal();
                this.f4779d[i11] = aVar2.f5022i.ordinal();
                i11++;
                i12 = i17 + 1;
            }
            this.f4780e = aVar.f5002h;
            this.f4781f = aVar.f5005k;
            this.f4782g = aVar.f4772v;
            this.f4783h = aVar.f5006l;
            this.f4784i = aVar.f5007m;
            this.f4785j = aVar.f5008n;
            this.f4786k = aVar.f5009o;
            this.f4787l = aVar.f5010p;
            this.f4788m = aVar.f5011q;
            this.f4789n = aVar.f5012r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    private void a(androidx.fragment.app.a aVar) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 < this.f4776a.length) {
                z.a aVar2 = new z.a();
                int i13 = i11 + 1;
                aVar2.f5014a = this.f4776a[i11];
                if (q.G0(2)) {
                    Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i12 + " base fragment #" + this.f4776a[i13]);
                }
                aVar2.f5021h = p.c.values()[this.f4778c[i12]];
                aVar2.f5022i = p.c.values()[this.f4779d[i12]];
                int[] iArr = this.f4776a;
                int i14 = i13 + 1;
                if (iArr[i13] == 0) {
                    z11 = false;
                }
                aVar2.f5016c = z11;
                int i15 = i14 + 1;
                int i16 = iArr[i14];
                aVar2.f5017d = i16;
                int i17 = i15 + 1;
                int i18 = iArr[i15];
                aVar2.f5018e = i18;
                int i19 = i17 + 1;
                int i21 = iArr[i17];
                aVar2.f5019f = i21;
                int i22 = iArr[i19];
                aVar2.f5020g = i22;
                aVar.f4998d = i16;
                aVar.f4999e = i18;
                aVar.f5000f = i21;
                aVar.f5001g = i22;
                aVar.f(aVar2);
                i12++;
                i11 = i19 + 1;
            } else {
                aVar.f5002h = this.f4780e;
                aVar.f5005k = this.f4781f;
                aVar.f5003i = true;
                aVar.f5006l = this.f4783h;
                aVar.f5007m = this.f4784i;
                aVar.f5008n = this.f4785j;
                aVar.f5009o = this.f4786k;
                aVar.f5010p = this.f4787l;
                aVar.f5011q = this.f4788m;
                aVar.f5012r = this.f4789n;
                return;
            }
        }
    }

    public androidx.fragment.app.a b(q qVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(qVar);
        a(aVar);
        aVar.f4772v = this.f4782g;
        for (int i11 = 0; i11 < this.f4777b.size(); i11++) {
            String str = this.f4777b.get(i11);
            if (str != null) {
                aVar.f4997c.get(i11).f5015b = qVar.e0(str);
            }
        }
        aVar.z(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeIntArray(this.f4776a);
        parcel.writeStringList(this.f4777b);
        parcel.writeIntArray(this.f4778c);
        parcel.writeIntArray(this.f4779d);
        parcel.writeInt(this.f4780e);
        parcel.writeString(this.f4781f);
        parcel.writeInt(this.f4782g);
        parcel.writeInt(this.f4783h);
        TextUtils.writeToParcel(this.f4784i, parcel, 0);
        parcel.writeInt(this.f4785j);
        TextUtils.writeToParcel(this.f4786k, parcel, 0);
        parcel.writeStringList(this.f4787l);
        parcel.writeStringList(this.f4788m);
        parcel.writeInt(this.f4789n ? 1 : 0);
    }

    b(Parcel parcel) {
        this.f4776a = parcel.createIntArray();
        this.f4777b = parcel.createStringArrayList();
        this.f4778c = parcel.createIntArray();
        this.f4779d = parcel.createIntArray();
        this.f4780e = parcel.readInt();
        this.f4781f = parcel.readString();
        this.f4782g = parcel.readInt();
        this.f4783h = parcel.readInt();
        this.f4784i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4785j = parcel.readInt();
        this.f4786k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f4787l = parcel.createStringArrayList();
        this.f4788m = parcel.createStringArrayList();
        this.f4789n = parcel.readInt() != 0;
    }
}