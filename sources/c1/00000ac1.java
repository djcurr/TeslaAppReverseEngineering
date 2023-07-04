package atd.m;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import atd.i.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends atd.i.d {
    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-74009540356672L);
    }

    @Override // atd.i.d
    protected List<String> b() {
        return Build.VERSION.SDK_INT >= 31 ? Collections.unmodifiableList(Arrays.asList(atd.s0.a.a(-74022425258560L), atd.s0.a.a(-73313755654720L))) : Collections.singletonList(atd.s0.a.a(-73189201603136L));
    }

    @Override // atd.i.d
    protected Object c(Context context) {
        if (Build.VERSION.SDK_INT >= 18) {
            BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService(atd.s0.a.a(-73614403365440L));
            BluetoothAdapter adapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
            if (adapter != null) {
                return adapter.getName();
            }
            return null;
        }
        throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
    }
}