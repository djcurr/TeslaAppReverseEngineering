package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final IntentSender f1055a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f1056b;

    /* renamed from: c  reason: collision with root package name */
    private final int f1057c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1058d;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public f[] newArray(int i11) {
            return new f[i11];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private IntentSender f1059a;

        /* renamed from: b  reason: collision with root package name */
        private Intent f1060b;

        /* renamed from: c  reason: collision with root package name */
        private int f1061c;

        /* renamed from: d  reason: collision with root package name */
        private int f1062d;

        public b(IntentSender intentSender) {
            this.f1059a = intentSender;
        }

        public f a() {
            return new f(this.f1059a, this.f1060b, this.f1061c, this.f1062d);
        }

        public b b(Intent intent) {
            this.f1060b = intent;
            return this;
        }

        public b c(int i11, int i12) {
            this.f1062d = i11;
            this.f1061c = i12;
            return this;
        }
    }

    f(IntentSender intentSender, Intent intent, int i11, int i12) {
        this.f1055a = intentSender;
        this.f1056b = intent;
        this.f1057c = i11;
        this.f1058d = i12;
    }

    public Intent a() {
        return this.f1056b;
    }

    public int b() {
        return this.f1057c;
    }

    public int c() {
        return this.f1058d;
    }

    public IntentSender d() {
        return this.f1055a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f1055a, i11);
        parcel.writeParcelable(this.f1056b, i11);
        parcel.writeInt(this.f1057c);
        parcel.writeInt(this.f1058d);
    }

    f(Parcel parcel) {
        this.f1055a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f1056b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f1057c = parcel.readInt();
        this.f1058d = parcel.readInt();
    }
}