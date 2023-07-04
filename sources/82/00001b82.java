package com.google.android.exoplayer2.drm;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class e implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a */
    private final b[] f13348a;

    /* renamed from: b */
    private int f13349b;

    /* renamed from: c */
    public final String f13350c;

    /* renamed from: d */
    public final int f13351d;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e[] newArray(int i11) {
            return new e[i11];
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a */
        private int f13352a;

        /* renamed from: b */
        public final UUID f13353b;

        /* renamed from: c */
        public final String f13354c;

        /* renamed from: d */
        public final String f13355d;

        /* renamed from: e */
        public final byte[] f13356e;

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

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean a(b bVar) {
            return c() && !bVar.c() && d(bVar.f13353b);
        }

        public b b(byte[] bArr) {
            return new b(this.f13353b, this.f13354c, this.f13355d, bArr);
        }

        public boolean c() {
            return this.f13356e != null;
        }

        public boolean d(UUID uuid) {
            return ci.b.f9153a.equals(this.f13353b) || uuid.equals(this.f13353b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                if (obj == this) {
                    return true;
                }
                b bVar = (b) obj;
                return k0.c(this.f13354c, bVar.f13354c) && k0.c(this.f13355d, bVar.f13355d) && k0.c(this.f13353b, bVar.f13353b) && Arrays.equals(this.f13356e, bVar.f13356e);
            }
            return false;
        }

        public int hashCode() {
            if (this.f13352a == 0) {
                int hashCode = this.f13353b.hashCode() * 31;
                String str = this.f13354c;
                this.f13352a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f13355d.hashCode()) * 31) + Arrays.hashCode(this.f13356e);
            }
            return this.f13352a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeLong(this.f13353b.getMostSignificantBits());
            parcel.writeLong(this.f13353b.getLeastSignificantBits());
            parcel.writeString(this.f13354c);
            parcel.writeString(this.f13355d);
            parcel.writeByteArray(this.f13356e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f13353b = (UUID) ak.a.e(uuid);
            this.f13354c = str;
            this.f13355d = (String) ak.a.e(str2);
            this.f13356e = bArr;
        }

        b(Parcel parcel) {
            this.f13353b = new UUID(parcel.readLong(), parcel.readLong());
            this.f13354c = parcel.readString();
            this.f13355d = (String) k0.j(parcel.readString());
            this.f13356e = parcel.createByteArray();
        }
    }

    public e(List<b> list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    private static boolean b(ArrayList<b> arrayList, int i11, UUID uuid) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (arrayList.get(i12).f13353b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static e f(e eVar, e eVar2) {
        String str;
        b[] bVarArr;
        b[] bVarArr2;
        ArrayList arrayList = new ArrayList();
        if (eVar != null) {
            str = eVar.f13350c;
            for (b bVar : eVar.f13348a) {
                if (bVar.c()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (eVar2 != null) {
            if (str == null) {
                str = eVar2.f13350c;
            }
            int size = arrayList.size();
            for (b bVar2 : eVar2.f13348a) {
                if (bVar2.c() && !b(arrayList, size, bVar2.f13353b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new e(str, arrayList);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(b bVar, b bVar2) {
        UUID uuid = ci.b.f9153a;
        if (uuid.equals(bVar.f13353b)) {
            return uuid.equals(bVar2.f13353b) ? 0 : 1;
        }
        return bVar.f13353b.compareTo(bVar2.f13353b);
    }

    public e c(String str) {
        return k0.c(this.f13350c, str) ? this : new e(str, false, this.f13348a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return k0.c(this.f13350c, eVar.f13350c) && Arrays.equals(this.f13348a, eVar.f13348a);
    }

    public b g(int i11) {
        return this.f13348a[i11];
    }

    public int hashCode() {
        if (this.f13349b == 0) {
            String str = this.f13350c;
            this.f13349b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f13348a);
        }
        return this.f13349b;
    }

    public e i(e eVar) {
        String str;
        String str2 = this.f13350c;
        ak.a.f(str2 == null || (str = eVar.f13350c) == null || TextUtils.equals(str2, str));
        String str3 = this.f13350c;
        if (str3 == null) {
            str3 = eVar.f13350c;
        }
        return new e(str3, (b[]) k0.A0(this.f13348a, eVar.f13348a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f13350c);
        parcel.writeTypedArray(this.f13348a, 0);
    }

    public e(String str, List<b> list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public e(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public e(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    private e(String str, boolean z11, b... bVarArr) {
        this.f13350c = str;
        bVarArr = z11 ? (b[]) bVarArr.clone() : bVarArr;
        this.f13348a = bVarArr;
        this.f13351d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    e(Parcel parcel) {
        this.f13350c = parcel.readString();
        b[] bVarArr = (b[]) k0.j((b[]) parcel.createTypedArray(b.CREATOR));
        this.f13348a = bVarArr;
        this.f13351d = bVarArr.length;
    }
}