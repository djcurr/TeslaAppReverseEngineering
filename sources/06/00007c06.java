package jn;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.h;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.f;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0618a();

    /* renamed from: a  reason: collision with root package name */
    private final String f33887a;

    /* renamed from: b  reason: collision with root package name */
    private final h f33888b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f33889c;

    /* renamed from: jn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0618a implements Parcelable.Creator<a> {
        C0618a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C0618a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* synthetic */ a(Parcel parcel, C0618a c0618a) {
        this(parcel);
    }

    public static PerfSession[] b(List<a> list) {
        if (list.isEmpty()) {
            return null;
        }
        PerfSession[] perfSessionArr = new PerfSession[list.size()];
        PerfSession a11 = list.get(0).a();
        boolean z11 = false;
        for (int i11 = 1; i11 < list.size(); i11++) {
            PerfSession a12 = list.get(i11).a();
            if (!z11 && list.get(i11).g()) {
                perfSessionArr[0] = a12;
                perfSessionArr[i11] = a11;
                z11 = true;
            } else {
                perfSessionArr[i11] = a12;
            }
        }
        if (!z11) {
            perfSessionArr[0] = a11;
        }
        return perfSessionArr;
    }

    public static a c() {
        a aVar = new a(UUID.randomUUID().toString().replace("-", ""), new com.google.firebase.perf.util.a());
        aVar.i(j());
        return aVar;
    }

    public static boolean j() {
        com.google.firebase.perf.config.a f11 = com.google.firebase.perf.config.a.f();
        return f11.I() && Math.random() < ((double) f11.B());
    }

    public PerfSession a() {
        PerfSession.c k11 = PerfSession.newBuilder().k(this.f33887a);
        if (this.f33889c) {
            k11.a(f.GAUGES_AND_SYSTEM_EVENTS);
        }
        return k11.build();
    }

    public h d() {
        return this.f33888b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f33888b.b()) > com.google.firebase.perf.config.a.f().y();
    }

    public boolean f() {
        return this.f33889c;
    }

    public boolean g() {
        return this.f33889c;
    }

    public String h() {
        return this.f33887a;
    }

    public void i(boolean z11) {
        this.f33889c = z11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f33887a);
        parcel.writeByte(this.f33889c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f33888b, 0);
    }

    public a(String str, com.google.firebase.perf.util.a aVar) {
        this.f33889c = false;
        this.f33887a = str;
        this.f33888b = aVar.a();
    }

    private a(Parcel parcel) {
        this.f33889c = false;
        this.f33887a = parcel.readString();
        this.f33889c = parcel.readByte() != 0;
        this.f33888b = (h) parcel.readParcelable(h.class.getClassLoader());
    }
}