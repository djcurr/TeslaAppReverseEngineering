package atd.j;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;

/* loaded from: classes.dex */
public class d extends b {
    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-74546411268672L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.i.d
    /* renamed from: f */
    public Boolean c(Context context) {
        BluetoothAdapter d11 = d(context);
        if (d11 != null) {
            return Boolean.valueOf(d11.isEnabled());
        }
        return null;
    }
}