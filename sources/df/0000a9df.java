package p4;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.p;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR;

    /* renamed from: a  reason: collision with root package name */
    private final String f46021a;

    /* renamed from: b  reason: collision with root package name */
    private final int f46022b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f46023c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f46024d;

    /* loaded from: classes.dex */
    public static final class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public j createFromParcel(Parcel inParcel) {
            kotlin.jvm.internal.s.g(inParcel, "inParcel");
            return new j(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public j[] newArray(int i11) {
            return new j[i11];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    public j(i entry) {
        kotlin.jvm.internal.s.g(entry, "entry");
        this.f46021a = entry.g();
        this.f46022b = entry.f().m();
        this.f46023c = entry.d();
        Bundle bundle = new Bundle();
        this.f46024d = bundle;
        entry.l(bundle);
    }

    public final int a() {
        return this.f46022b;
    }

    public final i b(Context context, p destination, p.c hostLifecycleState, m mVar) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(destination, "destination");
        kotlin.jvm.internal.s.g(hostLifecycleState, "hostLifecycleState");
        Bundle bundle = this.f46023c;
        if (bundle == null) {
            bundle = null;
        } else {
            bundle.setClassLoader(context.getClassLoader());
        }
        return i.f46004n.a(context, destination, bundle, hostLifecycleState, mVar, this.f46021a, this.f46024d);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.f46021a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        kotlin.jvm.internal.s.g(parcel, "parcel");
        parcel.writeString(this.f46021a);
        parcel.writeInt(this.f46022b);
        parcel.writeBundle(this.f46023c);
        parcel.writeBundle(this.f46024d);
    }

    public j(Parcel inParcel) {
        kotlin.jvm.internal.s.g(inParcel, "inParcel");
        String readString = inParcel.readString();
        kotlin.jvm.internal.s.e(readString);
        kotlin.jvm.internal.s.f(readString, "inParcel.readString()!!");
        this.f46021a = readString;
        this.f46022b = inParcel.readInt();
        this.f46023c = inParcel.readBundle(j.class.getClassLoader());
        Bundle readBundle = inParcel.readBundle(j.class.getClassLoader());
        kotlin.jvm.internal.s.e(readBundle);
        kotlin.jvm.internal.s.f(readBundle, "inParcel.readBundle(javaClass.classLoader)!!");
        this.f46024d = readBundle;
    }
}