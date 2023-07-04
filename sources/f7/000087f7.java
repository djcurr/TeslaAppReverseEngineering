package mv;

import android.bluetooth.BluetoothAdapter;
import com.tesla.logging.g;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f39466a = new c();

    /* renamed from: b  reason: collision with root package name */
    private static final g f39467b = g.f21878b.a("BluetoothStateHelper");

    /* renamed from: c  reason: collision with root package name */
    private static transient a f39468c = a.UNKNOWN;

    private c() {
    }

    public final boolean a(BluetoothAdapter bluetoothAdapter) {
        b(bluetoothAdapter);
        return f39468c == a.ENABLED;
    }

    public final void b(BluetoothAdapter bluetoothAdapter) {
        a aVar;
        if (f39468c == a.UNKNOWN) {
            if (bluetoothAdapter != null) {
                boolean isEnabled = bluetoothAdapter.isEnabled();
                c cVar = f39466a;
                if (isEnabled) {
                    aVar = a.ENABLED;
                } else {
                    aVar = a.DISABLED;
                }
                cVar.c(aVar);
            }
            g gVar = f39467b;
            String name = f39468c.name();
            gVar.i("initializing bluetooth state: " + name);
        }
    }

    public final void c(a aVar) {
        s.g(aVar, "<set-?>");
        f39468c = aVar;
    }

    public final void d() {
        f39468c = a.DISABLED;
    }

    public final void e() {
        f39468c = a.ENABLED;
    }
}