package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0273a();

    /* renamed from: a  reason: collision with root package name */
    private final l f15158a;

    /* renamed from: b  reason: collision with root package name */
    private final l f15159b;

    /* renamed from: c  reason: collision with root package name */
    private final c f15160c;

    /* renamed from: d  reason: collision with root package name */
    private l f15161d;

    /* renamed from: e  reason: collision with root package name */
    private final int f15162e;

    /* renamed from: f  reason: collision with root package name */
    private final int f15163f;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0273a implements Parcelable.Creator<a> {
        C0273a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a((l) parcel.readParcelable(l.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (l) parcel.readParcelable(l.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        static final long f15164e = s.a(l.b(1900, 0).f15253f);

        /* renamed from: f  reason: collision with root package name */
        static final long f15165f = s.a(l.b(2100, 11).f15253f);

        /* renamed from: a  reason: collision with root package name */
        private long f15166a;

        /* renamed from: b  reason: collision with root package name */
        private long f15167b;

        /* renamed from: c  reason: collision with root package name */
        private Long f15168c;

        /* renamed from: d  reason: collision with root package name */
        private c f15169d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(a aVar) {
            this.f15166a = f15164e;
            this.f15167b = f15165f;
            this.f15169d = f.a(Long.MIN_VALUE);
            this.f15166a = aVar.f15158a.f15253f;
            this.f15167b = aVar.f15159b.f15253f;
            this.f15168c = Long.valueOf(aVar.f15161d.f15253f);
            this.f15169d = aVar.f15160c;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f15169d);
            l c11 = l.c(this.f15166a);
            l c12 = l.c(this.f15167b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l11 = this.f15168c;
            return new a(c11, c12, cVar, l11 == null ? null : l.c(l11.longValue()), null);
        }

        public b b(long j11) {
            this.f15168c = Long.valueOf(j11);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public interface c extends Parcelable {
        boolean e0(long j11);
    }

    /* synthetic */ a(l lVar, l lVar2, c cVar, l lVar3, C0273a c0273a) {
        this(lVar, lVar2, cVar, lVar3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l e(l lVar) {
        if (lVar.compareTo(this.f15158a) < 0) {
            return this.f15158a;
        }
        return lVar.compareTo(this.f15159b) > 0 ? this.f15159b : lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f15158a.equals(aVar.f15158a) && this.f15159b.equals(aVar.f15159b) && v3.c.a(this.f15161d, aVar.f15161d) && this.f15160c.equals(aVar.f15160c);
        }
        return false;
    }

    public c f() {
        return this.f15160c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l g() {
        return this.f15159b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return this.f15163f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15158a, this.f15159b, this.f15161d, this.f15160c});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l i() {
        return this.f15161d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l j() {
        return this.f15158a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.f15162e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f15158a, 0);
        parcel.writeParcelable(this.f15159b, 0);
        parcel.writeParcelable(this.f15161d, 0);
        parcel.writeParcelable(this.f15160c, 0);
    }

    private a(l lVar, l lVar2, c cVar, l lVar3) {
        this.f15158a = lVar;
        this.f15159b = lVar2;
        this.f15161d = lVar3;
        this.f15160c = cVar;
        if (lVar3 != null && lVar.compareTo(lVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (lVar3 != null && lVar3.compareTo(lVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f15163f = lVar.l(lVar2) + 1;
        this.f15162e = (lVar2.f15250c - lVar.f15250c) + 1;
    }
}