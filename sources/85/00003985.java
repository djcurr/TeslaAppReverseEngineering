package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0308a();

    /* renamed from: a  reason: collision with root package name */
    private final String f16974a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f16975b;

    /* renamed from: com.google.firebase.perf.metrics.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0308a implements Parcelable.Creator<a> {
        C0308a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* synthetic */ a(Parcel parcel, C0308a c0308a) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long a() {
        return this.f16975b.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f16974a;
    }

    public void c(long j11) {
        this.f16975b.addAndGet(j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(long j11) {
        this.f16975b.set(j11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f16974a);
        parcel.writeLong(this.f16975b.get());
    }

    public a(String str) {
        this.f16974a = str;
        this.f16975b = new AtomicLong(0L);
    }

    private a(Parcel parcel) {
        this.f16974a = parcel.readString();
        this.f16975b = new AtomicLong(parcel.readLong());
    }
}