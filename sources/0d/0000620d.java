package com.teslamotors.plugins.ble.card;

import android.content.Context;
import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.f;
import com.tesla.logging.g;
import com.teslamotors.plugins.ble.beacon.OemWalletInjector;
import h00.l;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;
import vz.k;
import vz.m;
import wz.w;

@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J(\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J$\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0011H'J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\b\u0010\u0015\u001a\u00020\bH&J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0019\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/teslamotors/plugins/ble/card/OemWalletProvider;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "isSupported", "Lvz/b0;", "init", "", "vin", "carType", "macAddress", "issueCard", "withdrawCard", "withdrawAllCard", "cardIssued", "currentAuthStatus", "Lkotlin/Function1;", "resultListener", "authorize", "unauthorize", "getBrandName", "onBLEServiceInitialized", "getVendor", "()Ljava/lang/String;", "vendor", "Companion", "a", "tesla-ble_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public interface OemWalletProvider {
    public static final a Companion = a.f22213a;
    public static final long KEY_CARD_LIVE_TIME = 5;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f22213a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final g f22214b = g.f21878b.a("OemWallet");

        /* renamed from: c  reason: collision with root package name */
        private static final k<List<OemWalletProvider>> f22215c;

        /* renamed from: d  reason: collision with root package name */
        private static OemWalletProvider f22216d;

        /* renamed from: com.teslamotors.plugins.ble.card.OemWalletProvider$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0409a extends u implements h00.a<List<? extends OemWalletProvider>> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0409a f22217a = new C0409a();

            C0409a() {
                super(0);
            }

            @Override // h00.a
            public final List<? extends OemWalletProvider> invoke() {
                List<? extends OemWalletProvider> i11;
                List<? extends OemWalletProvider> list = null;
                try {
                    OemWalletInjector oemWalletInjector = OemWalletInjector.INSTANCE;
                    Object invoke = OemWalletInjector.class.getDeclaredMethod("inject", new Class[0]).invoke(OemWalletInjector.class.getDeclaredField("INSTANCE").get(null), new Object[0]);
                    if (!(invoke instanceof List)) {
                        invoke = null;
                    }
                    list = (List) invoke;
                } catch (Exception e11) {
                    TeslaLog.INSTANCE.e("ReflectionHelper", "can not invoke static method# inject on class# com.teslamotors.plugins.ble.beacon.OemWalletInjector", e11);
                }
                if (list == null) {
                    i11 = w.i();
                    return i11;
                }
                return list;
            }
        }

        static {
            k<List<OemWalletProvider>> a11;
            a11 = m.a(C0409a.f22217a);
            f22215c = a11;
        }

        private a() {
        }

        private final List<OemWalletProvider> a() {
            return f22215c.getValue();
        }

        public final OemWalletProvider b(Context context) {
            Object obj;
            s.g(context, "context");
            if (f22216d == null) {
                Iterator<T> it2 = a().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((OemWalletProvider) obj).isSupported(context)) {
                        break;
                    }
                }
                f22216d = (OemWalletProvider) obj;
            }
            return f22216d;
        }

        public final void c(Context context) {
            Object obj;
            boolean M;
            s.g(context, "context");
            f22214b.i("init providers");
            if (f.d(context)) {
                for (OemWalletProvider oemWalletProvider : a()) {
                    oemWalletProvider.init(context);
                }
            } else if (f.b(context)) {
                Iterator<T> it2 = a().iterator();
                while (true) {
                    obj = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    String canonicalName = ((OemWalletProvider) next).getClass().getCanonicalName();
                    s.f(canonicalName, "it.javaClass.canonicalName");
                    M = kotlin.text.w.M(canonicalName, "MiWalletProvider", false, 2, null);
                    if (M) {
                        obj = next;
                        break;
                    }
                }
                OemWalletProvider oemWalletProvider2 = (OemWalletProvider) obj;
                if (oemWalletProvider2 == null) {
                    return;
                }
                oemWalletProvider2.init(context);
            }
        }
    }

    static OemWalletProvider getSupportedProvider(Context context) {
        return Companion.b(context);
    }

    void authorize(Context context, l<? super Boolean, b0> lVar);

    boolean cardIssued(String str, Context context);

    boolean currentAuthStatus(Context context);

    String getBrandName();

    String getVendor();

    void init(Context context);

    boolean isSupported(Context context);

    boolean issueCard(String str, String str2, String str3, Context context);

    void onBLEServiceInitialized(String str, Context context);

    boolean unauthorize(Context context);

    boolean withdrawAllCard(Context context);

    boolean withdrawCard(String str, Context context);
}