package atd.j;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.Build;
import atd.i.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
abstract class b extends atd.i.d {
    @Override // atd.i.d
    protected List<String> b() {
        return Collections.singletonList(atd.s0.a.a(-74469101857344L));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BluetoothAdapter d(Context context) {
        return e(context).getAdapter();
    }

    BluetoothManager e(Context context) {
        BluetoothManager bluetoothManager;
        if (Build.VERSION.SDK_INT < 18 || (bluetoothManager = (BluetoothManager) context.getSystemService(atd.s0.a.a(-74310188067392L))) == null) {
            throw new atd.i.c(c.a.UNSUPPORTED_BY_PLATFORM_OR_DEPRECATED, null);
        }
        return bluetoothManager;
    }
}