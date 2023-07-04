package nv;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import gv.o;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();
    public Set<String> A;

    /* renamed from: a  reason: collision with root package name */
    public Integer f41908a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f41909b;

    /* renamed from: c  reason: collision with root package name */
    public Integer f41910c;

    /* renamed from: d  reason: collision with root package name */
    public Integer f41911d;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f41912e;

    /* renamed from: f  reason: collision with root package name */
    public Boolean f41913f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f41914g;

    /* renamed from: h  reason: collision with root package name */
    public String[] f41915h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f41916i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f41917j;

    /* renamed from: k  reason: collision with root package name */
    public String f41918k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f41919l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f41920m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f41921n;

    /* renamed from: o  reason: collision with root package name */
    public long f41922o;

    /* renamed from: p  reason: collision with root package name */
    public int f41923p;

    /* renamed from: q  reason: collision with root package name */
    public double f41924q;

    /* renamed from: t  reason: collision with root package name */
    public double f41925t;

    /* renamed from: w  reason: collision with root package name */
    public boolean f41926w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f41927x;

    /* renamed from: y  reason: collision with root package name */
    public String f41928y;

    /* renamed from: z  reason: collision with root package name */
    public e f41929z;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public j[] newArray(int i11) {
            return new j[i11];
        }
    }

    public j() {
        this.f41915h = new String[0];
        this.A = new HashSet();
    }

    public Bundle a() {
        if (b() != o.f28179p) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("view", "vehicle_phone_key_screen");
        bundle.putString("vin", this.f41918k);
        return bundle;
    }

    public int b() {
        int i11;
        Map<String, d> map;
        int i12 = o.f28179p;
        e eVar = this.f41929z;
        int i13 = 0;
        if (eVar == null || (map = eVar.f41898a) == null) {
            i11 = 0;
        } else {
            i11 = 0;
            for (Map.Entry<String, d> entry : map.entrySet()) {
                i13++;
                if (entry.getValue().f41895b) {
                    i11++;
                }
            }
        }
        if (this.f41926w) {
            if (i13 > 0) {
                i12 = o.f28176m;
            }
            if (i11 > 0) {
                int i14 = o.f28175l;
                if (!this.f41927x || this.A.size() <= 0) {
                    return i14;
                }
                if (this.f41919l) {
                    return o.f28174k;
                }
                return o.f28178o;
            }
            return i12;
        }
        return o.f28173j;
    }

    public void c(Integer num, Integer num2, Integer num3, Integer num4, Boolean bool, Boolean bool2, Boolean bool3) {
        if (num != null) {
            this.f41908a = num;
        }
        if (num2 != null) {
            this.f41909b = num2;
        }
        if (num3 != null) {
            this.f41910c = num3;
        }
        if (num4 != null) {
            this.f41911d = num4;
        }
        if (bool != null) {
            this.f41912e = bool;
        }
        if (bool2 != null) {
            this.f41913f = bool2;
        }
        if (bool3 != null) {
            this.f41914g = bool3;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f41908a);
        parcel.writeSerializable(this.f41909b);
        parcel.writeSerializable(this.f41910c);
        parcel.writeSerializable(this.f41911d);
        parcel.writeSerializable(this.f41912e);
        parcel.writeSerializable(this.f41913f);
        parcel.writeSerializable(this.f41914g);
        parcel.writeByte(this.f41916i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f41917j ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f41918k);
        parcel.writeByte(this.f41919l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f41920m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f41921n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f41922o);
        parcel.writeInt(this.f41923p);
        parcel.writeStringArray(this.f41915h);
        parcel.writeDouble(this.f41924q);
        parcel.writeDouble(this.f41925t);
        parcel.writeByte(this.f41926w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f41927x ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f41928y);
        parcel.writeParcelable(this.f41929z, i11);
        parcel.writeInt(this.A.size());
        for (String str : this.A) {
            parcel.writeString(str);
        }
    }

    protected j(Parcel parcel) {
        this.f41915h = new String[0];
        this.A = new HashSet();
        this.f41908a = (Integer) parcel.readSerializable();
        this.f41909b = (Integer) parcel.readSerializable();
        this.f41910c = (Integer) parcel.readSerializable();
        this.f41911d = (Integer) parcel.readSerializable();
        this.f41912e = (Boolean) parcel.readSerializable();
        this.f41913f = (Boolean) parcel.readSerializable();
        this.f41914g = (Boolean) parcel.readSerializable();
        this.f41916i = parcel.readByte() != 0;
        this.f41917j = parcel.readByte() != 0;
        this.f41918k = parcel.readString();
        this.f41919l = parcel.readByte() != 0;
        this.f41920m = parcel.readByte() != 0;
        this.f41921n = parcel.readByte() != 0;
        this.f41922o = parcel.readLong();
        this.f41923p = parcel.readInt();
        this.f41915h = parcel.createStringArray();
        this.f41924q = parcel.readDouble();
        this.f41925t = parcel.readDouble();
        this.f41926w = parcel.readByte() != 0;
        this.f41927x = parcel.readByte() != 0;
        this.f41928y = parcel.readString();
        this.f41929z = (e) parcel.readParcelable(e.class.getClassLoader());
        int readInt = parcel.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            this.A.add(parcel.readString());
        }
    }
}