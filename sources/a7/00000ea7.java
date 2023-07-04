package c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import c.a;

/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    final Handler f8345a = null;

    /* renamed from: b  reason: collision with root package name */
    c.a f8346b;

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

    /* renamed from: c.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class BinderC0162b extends a.AbstractBinderC0160a {
        BinderC0162b() {
        }

        @Override // c.a
        public void p(int i11, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f8345a;
            if (handler != null) {
                handler.post(new c(i11, bundle));
            } else {
                bVar.a(i11, bundle);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f8348a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f8349b;

        c(int i11, Bundle bundle) {
            this.f8348a = i11;
            this.f8349b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f8348a, this.f8349b);
        }
    }

    b(Parcel parcel) {
        this.f8346b = a.AbstractBinderC0160a.J(parcel.readStrongBinder());
    }

    protected void a(int i11, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        synchronized (this) {
            if (this.f8346b == null) {
                this.f8346b = new BinderC0162b();
            }
            parcel.writeStrongBinder(this.f8346b.asBinder());
        }
    }
}