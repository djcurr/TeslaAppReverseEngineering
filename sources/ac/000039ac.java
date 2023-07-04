package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private long f17035a;

    /* renamed from: b  reason: collision with root package name */
    private long f17036b;

    /* loaded from: classes2.dex */
    class a implements Parcelable.Creator<h> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public h createFromParcel(Parcel parcel) {
            return new h(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public h[] newArray(int i11) {
            return new h[i11];
        }
    }

    /* synthetic */ h(Parcel parcel, a aVar) {
        this(parcel);
    }

    public long a() {
        return this.f17035a + b();
    }

    public long b() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - this.f17036b);
    }

    public long c(h hVar) {
        return TimeUnit.NANOSECONDS.toMicros(hVar.f17036b - this.f17036b);
    }

    public long d() {
        return this.f17035a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void e() {
        this.f17035a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f17036b = System.nanoTime();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f17035a);
        parcel.writeLong(this.f17036b);
    }

    public h() {
        this.f17035a = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        this.f17036b = System.nanoTime();
    }

    @VisibleForTesting
    public h(long j11) {
        this.f17035a = j11;
        this.f17036b = TimeUnit.MICROSECONDS.toNanos(j11);
    }

    private h(Parcel parcel) {
        this.f17035a = parcel.readLong();
        this.f17036b = parcel.readLong();
    }
}