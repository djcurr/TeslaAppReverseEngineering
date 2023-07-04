package atd.j;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends b {
    @Override // atd.i.b
    public String a() {
        return atd.s0.a.a(-74645195516480L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // atd.i.d
    /* renamed from: f */
    public JSONArray c(Context context) {
        Set<BluetoothDevice> bondedDevices;
        JSONArray jSONArray = new JSONArray();
        BluetoothAdapter d11 = d(context);
        if (d11 != null && (bondedDevices = d11.getBondedDevices()) != null) {
            for (BluetoothDevice bluetoothDevice : bondedDevices) {
                jSONArray.put(a(bluetoothDevice));
            }
        }
        return jSONArray;
    }

    private JSONObject a(BluetoothDevice bluetoothDevice) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(atd.s0.a.a(-74658080418368L), bluetoothDevice.getName());
            jSONObject.put(atd.s0.a.a(-74670965320256L), bluetoothDevice.getAddress());
            if (Build.VERSION.SDK_INT >= 18) {
                jSONObject.put(atd.s0.a.a(-74705325058624L), bluetoothDevice.getType());
            }
            jSONObject.put(atd.s0.a.a(-74718209960512L), bluetoothDevice.getBondState());
            return jSONObject;
        } catch (JSONException e11) {
            throw new RuntimeException(atd.s0.a.a(-74503461595712L), e11);
        }
    }
}