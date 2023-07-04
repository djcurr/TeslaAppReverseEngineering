package com.adyen.checkout.core.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.core.exception.CheckoutException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final d f9579b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f9580c;

    /* renamed from: d  reason: collision with root package name */
    public static final d f9581d;

    /* renamed from: e  reason: collision with root package name */
    public static final d f9582e;

    /* renamed from: f  reason: collision with root package name */
    public static final d f9583f;

    /* renamed from: g  reason: collision with root package name */
    public static final d f9584g;
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    public static final d f9585h;

    /* renamed from: a  reason: collision with root package name */
    private final URL f9586a;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d[] newArray(int i11) {
            return new d[i11];
        }
    }

    static {
        try {
            f9579b = new d(new URL("https://checkoutshopper-test.adyen.com/checkoutshopper/"));
            d dVar = new d(new URL("https://checkoutshopper-live.adyen.com/checkoutshopper/"));
            f9580c = dVar;
            f9581d = new d(new URL("https://checkoutshopper-live-us.adyen.com/checkoutshopper/"));
            f9582e = new d(new URL("https://checkoutshopper-live-au.adyen.com/checkoutshopper/"));
            f9583f = new d(new URL("https://checkoutshopper-live-in.adyen.com/checkoutshopper/"));
            f9584g = new d(new URL("https://checkoutshopper-live-apse.adyen.com/checkoutshopper/"));
            f9585h = dVar;
        } catch (MalformedURLException e11) {
            throw new CheckoutException("Failed to parse Environment URL.", e11);
        }
    }

    public d(URL url) {
        this.f9586a = url;
    }

    public String a() {
        return this.f9586a.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f9586a.toString().equals(((d) obj).f9586a.toString());
    }

    public int hashCode() {
        return Objects.hash(this.f9586a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f9586a);
    }

    d(Parcel parcel) {
        this.f9586a = (URL) parcel.readSerializable();
    }
}