package xj;

import ak.k0;
import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.accessibility.CaptioningManager;
import com.google.common.collect.r;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes3.dex */
public class l implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public final r<String> f57574a;

    /* renamed from: b  reason: collision with root package name */
    public final int f57575b;

    /* renamed from: c  reason: collision with root package name */
    public final r<String> f57576c;

    /* renamed from: d  reason: collision with root package name */
    public final int f57577d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f57578e;

    /* renamed from: f  reason: collision with root package name */
    public final int f57579f;

    /* renamed from: g  reason: collision with root package name */
    public static final l f57573g = new b().a();
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public l[] newArray(int i11) {
            return new l[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(r<String> rVar, int i11, r<String> rVar2, int i12, boolean z11, int i13) {
        this.f57574a = rVar;
        this.f57575b = i11;
        this.f57576c = rVar2;
        this.f57577d = i12;
        this.f57578e = z11;
        this.f57579f = i13;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f57574a.equals(lVar.f57574a) && this.f57575b == lVar.f57575b && this.f57576c.equals(lVar.f57576c) && this.f57577d == lVar.f57577d && this.f57578e == lVar.f57578e && this.f57579f == lVar.f57579f;
    }

    public int hashCode() {
        return ((((((((((this.f57574a.hashCode() + 31) * 31) + this.f57575b) * 31) + this.f57576c.hashCode()) * 31) + this.f57577d) * 31) + (this.f57578e ? 1 : 0)) * 31) + this.f57579f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeList(this.f57574a);
        parcel.writeInt(this.f57575b);
        parcel.writeList(this.f57576c);
        parcel.writeInt(this.f57577d);
        k0.V0(parcel, this.f57578e);
        parcel.writeInt(this.f57579f);
    }

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        r<String> f57580a;

        /* renamed from: b  reason: collision with root package name */
        int f57581b;

        /* renamed from: c  reason: collision with root package name */
        r<String> f57582c;

        /* renamed from: d  reason: collision with root package name */
        int f57583d;

        /* renamed from: e  reason: collision with root package name */
        boolean f57584e;

        /* renamed from: f  reason: collision with root package name */
        int f57585f;

        public b(Context context) {
            this();
            b(context);
        }

        private void c(Context context) {
            CaptioningManager captioningManager;
            if ((k0.f477a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.f57583d = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.f57582c = r.s(k0.U(locale));
                }
            }
        }

        public l a() {
            return new l(this.f57580a, this.f57581b, this.f57582c, this.f57583d, this.f57584e, this.f57585f);
        }

        public b b(Context context) {
            if (k0.f477a >= 19) {
                c(context);
            }
            return this;
        }

        @Deprecated
        public b() {
            this.f57580a = r.r();
            this.f57581b = 0;
            this.f57582c = r.r();
            this.f57583d = 0;
            this.f57584e = false;
            this.f57585f = 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(l lVar) {
            this.f57580a = lVar.f57574a;
            this.f57581b = lVar.f57575b;
            this.f57582c = lVar.f57576c;
            this.f57583d = lVar.f57577d;
            this.f57584e = lVar.f57578e;
            this.f57585f = lVar.f57579f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.f57574a = r.o(arrayList);
        this.f57575b = parcel.readInt();
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.f57576c = r.o(arrayList2);
        this.f57577d = parcel.readInt();
        this.f57578e = k0.G0(parcel);
        this.f57579f = parcel.readInt();
    }
}