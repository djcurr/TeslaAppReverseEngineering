package t7;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g extends e7.f {
    public static final Parcelable.Creator<g> CREATOR;

    /* loaded from: classes.dex */
    public static final class a extends e7.c<g> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String clientKey) {
            super(context, clientKey);
            s.g(context, "context");
            s.g(clientKey, "clientKey");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // e7.c
        /* renamed from: h */
        public g b() {
            return new g(this, (DefaultConstructorMarker) null);
        }

        public a i(com.adyen.checkout.core.api.d builderEnvironment) {
            s.g(builderEnvironment, "builderEnvironment");
            return (a) super.f(builderEnvironment);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<g> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public g createFromParcel(Parcel in2) {
            s.g(in2, "in");
            return new g(in2, (DefaultConstructorMarker) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public g[] newArray(int i11) {
            return new g[i11];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new c(null);
        CREATOR = new b();
    }

    public /* synthetic */ g(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    private g(a aVar) {
        super(aVar.e(), aVar.d(), aVar.c());
    }

    public /* synthetic */ g(a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private g(Parcel parcel) {
        super(parcel);
    }
}