package atd.j;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

/* loaded from: classes.dex */
public class a extends b {
    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-74456216955456L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.i.d
    /* renamed from: f */
    public String c(Context context) {
        BluetoothAdapter d11 = d(context);
        if (d11 != null) {
            return d11.getAddress();
        }
        return null;
    }
}