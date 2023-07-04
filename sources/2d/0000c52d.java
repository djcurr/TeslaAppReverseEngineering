package zs;

import android.content.Context;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import zs.f;

/* loaded from: classes6.dex */
public final class g implements d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f60712c = new a(null);

    /* renamed from: b  reason: collision with root package name */
    private final Context f60713b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(Context context) {
            s.g(context, "context");
            Context applicationContext = context.getApplicationContext();
            s.f(applicationContext, "context.applicationContext");
            return new g(applicationContext, null);
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60714a;

        static {
            int[] iArr = new int[yt.b.values().length];
            iArr[yt.b.DOMAIN_VEHICLE_SECURITY.ordinal()] = 1;
            iArr[yt.b.DOMAIN_INFOTAINMENT.ordinal()] = 2;
            iArr[yt.b.DOMAIN_AUTHD.ordinal()] = 3;
            iArr[yt.b.DOMAIN_BROADCAST.ordinal()] = 4;
            iArr[yt.b.DOMAIN_ENERGY_DEVICE.ordinal()] = 5;
            iArr[yt.b.DOMAIN_ENERGY_DEVICE_AUTH.ordinal()] = 6;
            f60714a = iArr;
        }
    }

    private g(Context context) {
        this.f60713b = context;
    }

    public /* synthetic */ g(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    @Override // zs.d
    public e a(String unsignedMessage, String vehicleKey, String additionalData, yt.b domain) {
        f.b bVar;
        s.g(unsignedMessage, "unsignedMessage");
        s.g(vehicleKey, "vehicleKey");
        s.g(additionalData, "additionalData");
        s.g(domain, "domain");
        zs.a l11 = zs.a.l();
        Context context = this.f60713b;
        switch (b.f60714a[domain.ordinal()]) {
            case 1:
                bVar = f.b.VCSEC;
                break;
            case 2:
                bVar = f.b.CAR;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                throw new IllegalArgumentException("unsupported domain " + domain);
            default:
                throw new NoWhenBranchMatchedException();
        }
        Map<String, Object> a11 = f.a(l11, context, unsignedMessage, vehicleKey, additionalData, bVar);
        s.f(a11, "signMessage(\n      BLECr…)\n        }\n      }\n    )");
        Object obj = a11.get("success");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Object obj2 = a11.get("signedMessage");
        byte[] bArr = obj2 instanceof byte[] ? (byte[]) obj2 : null;
        Object obj3 = a11.get("nonce");
        byte[] bArr2 = obj3 instanceof byte[] ? (byte[]) obj3 : null;
        Object obj4 = a11.get("tag");
        byte[] bArr3 = obj4 instanceof byte[] ? (byte[]) obj4 : null;
        Object obj5 = a11.get("error");
        return new e(booleanValue, bArr, bArr2, bArr3, obj5 instanceof String ? (String) obj5 : null);
    }
}