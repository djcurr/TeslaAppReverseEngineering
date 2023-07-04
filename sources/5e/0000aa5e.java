package p6;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import e7.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c extends f {
    public static final Parcelable.Creator<c> CREATOR;

    /* loaded from: classes.dex */
    public static final class a extends e7.c<c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String clientKey) {
            super(context, clientKey);
            s.g(context, "context");
            s.g(clientKey, "clientKey");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e7.c
        /* renamed from: h */
        public c b() {
            return new c(this, (DefaultConstructorMarker) null);
        }

        public a i(com.adyen.checkout.core.api.d builderEnvironment) {
            s.g(builderEnvironment, "builderEnvironment");
            return (a) super.f(builderEnvironment);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<c> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel in2) {
            s.g(in2, "in");
            return new c(in2, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    }

    /* renamed from: p6.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0987c {
        private C0987c() {
        }

        public /* synthetic */ C0987c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0987c(null);
        CREATOR = new b();
    }

    public /* synthetic */ c(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private c(a aVar) {
        super(aVar.e(), aVar.d(), aVar.c());
    }

    public /* synthetic */ c(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private c(Parcel parcel) {
        super(parcel);
    }
}