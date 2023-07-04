package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract class f implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final Locale f24943a;

    /* renamed from: b  reason: collision with root package name */
    private final com.adyen.checkout.core.api.d f24944b;

    /* renamed from: c  reason: collision with root package name */
    private final String f24945c;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(Locale shopperLocale, com.adyen.checkout.core.api.d environment, String clientKey) {
        s.g(shopperLocale, "shopperLocale");
        s.g(environment, "environment");
        s.g(clientKey, "clientKey");
        this.f24943a = shopperLocale;
        this.f24944b = environment;
        this.f24945c = clientKey;
    }

    public final String a() {
        return this.f24945c;
    }

    public final com.adyen.checkout.core.api.d b() {
        return this.f24944b;
    }

    public final Locale c() {
        return this.f24943a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        parcel.writeSerializable(this.f24943a);
        parcel.writeParcelable(this.f24944b, i11);
        parcel.writeString(this.f24945c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.s.g(r4, r0)
            java.io.Serializable r0 = r4.readSerializable()
            java.lang.String r1 = "null cannot be cast to non-null type java.util.Locale"
            java.util.Objects.requireNonNull(r0, r1)
            java.util.Locale r0 = (java.util.Locale) r0
            java.lang.Class<com.adyen.checkout.core.api.d> r1 = com.adyen.checkout.core.api.d.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            kotlin.jvm.internal.s.e(r1)
            java.lang.String r2 = "parcel.readParcelable(Environment::class.java.classLoader)!!"
            kotlin.jvm.internal.s.f(r1, r2)
            com.adyen.checkout.core.api.d r1 = (com.adyen.checkout.core.api.d) r1
            java.lang.String r4 = r4.readString()
            kotlin.jvm.internal.s.e(r4)
            java.lang.String r2 = "parcel.readString()!!"
            kotlin.jvm.internal.s.f(r4, r2)
            r3.<init>(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.f.<init>(android.os.Parcel):void");
    }
}