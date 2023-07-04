package com.reactnativestripesdk.pushprovisioning;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.pushProvisioning.PushProvisioningEphemeralKeyProvider;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class e implements PushProvisioningEphemeralKeyProvider {

    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<e> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new e(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e[] newArray(int i11) {
            return new e[i11];
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ e(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public e(String ephemeralKey) {
        s.g(ephemeralKey, "ephemeralKey");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private e(android.os.Parcel r1) {
        /*
            r0 = this;
            java.lang.String r1 = r1.readString()
            if (r1 != 0) goto L8
            java.lang.String r1 = ""
        L8:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativestripesdk.pushprovisioning.e.<init>(android.os.Parcel):void");
    }
}