package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final int f15802a;

    /* renamed from: b  reason: collision with root package name */
    int f15803b;

    /* renamed from: c  reason: collision with root package name */
    int f15804c;

    /* renamed from: d  reason: collision with root package name */
    int f15805d;

    /* loaded from: classes3.dex */
    static class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public c() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    private static int c(int i11) {
        return i11 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f15803b == cVar.f15803b && this.f15804c == cVar.f15804c && this.f15802a == cVar.f15802a && this.f15805d == cVar.f15805d;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15802a), Integer.valueOf(this.f15803b), Integer.valueOf(this.f15804c), Integer.valueOf(this.f15805d)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f15803b);
        parcel.writeInt(this.f15804c);
        parcel.writeInt(this.f15805d);
        parcel.writeInt(this.f15802a);
    }

    public c(int i11) {
        this(0, 0, 10, i11);
    }

    public c(int i11, int i12, int i13, int i14) {
        this.f15803b = i11;
        this.f15804c = i12;
        this.f15805d = i13;
        this.f15802a = i14;
        c(i11);
        new com.google.android.material.timepicker.a(59);
        new com.google.android.material.timepicker.a(i14 == 1 ? 24 : 12);
    }

    protected c(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}