package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class l implements Comparable<l>, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Calendar f15248a;

    /* renamed from: b  reason: collision with root package name */
    final int f15249b;

    /* renamed from: c  reason: collision with root package name */
    final int f15250c;

    /* renamed from: d  reason: collision with root package name */
    final int f15251d;

    /* renamed from: e  reason: collision with root package name */
    final int f15252e;

    /* renamed from: f  reason: collision with root package name */
    final long f15253f;

    /* renamed from: g  reason: collision with root package name */
    private String f15254g;

    /* loaded from: classes3.dex */
    static class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return l.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public l[] newArray(int i11) {
            return new l[i11];
        }
    }

    private l(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d11 = s.d(calendar);
        this.f15248a = d11;
        this.f15249b = d11.get(2);
        this.f15250c = d11.get(1);
        this.f15251d = d11.getMaximum(7);
        this.f15252e = d11.getActualMaximum(5);
        this.f15253f = d11.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l b(int i11, int i12) {
        Calendar k11 = s.k();
        k11.set(1, i11);
        k11.set(2, i12);
        return new l(k11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l c(long j11) {
        Calendar k11 = s.k();
        k11.setTimeInMillis(j11);
        return new l(k11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l d() {
        return new l(s.i());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(l lVar) {
        return this.f15248a.compareTo(lVar.f15248a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        int firstDayOfWeek = this.f15248a.get(7) - this.f15248a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f15251d : firstDayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            return this.f15249b == lVar.f15249b && this.f15250c == lVar.f15250c;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long f(int i11) {
        Calendar d11 = s.d(this.f15248a);
        d11.set(5, i11);
        return d11.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g(long j11) {
        Calendar d11 = s.d(this.f15248a);
        d11.setTimeInMillis(j11);
        return d11.get(5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String h(Context context) {
        if (this.f15254g == null) {
            this.f15254g = e.c(context, this.f15248a.getTimeInMillis());
        }
        return this.f15254g;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15249b), Integer.valueOf(this.f15250c)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long i() {
        return this.f15248a.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l k(int i11) {
        Calendar d11 = s.d(this.f15248a);
        d11.add(2, i11);
        return new l(d11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l(l lVar) {
        if (this.f15248a instanceof GregorianCalendar) {
            return ((lVar.f15250c - this.f15250c) * 12) + (lVar.f15249b - this.f15249b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f15250c);
        parcel.writeInt(this.f15249b);
    }
}