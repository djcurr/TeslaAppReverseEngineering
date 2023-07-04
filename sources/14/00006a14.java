package expo.modules.interfaces.barcodescanner;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class BarCodeScannerSettings extends HashMap<BarCodeScannerSettingsKey, Object> {
    public BarCodeScannerSettings() {
    }

    public Object getTypes() {
        return get(BarCodeScannerSettingsKey.TYPES);
    }

    public void putTypes(Object obj) {
        put(BarCodeScannerSettingsKey.TYPES, obj);
    }

    public BarCodeScannerSettings(Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            BarCodeScannerSettingsKey fromStringName = BarCodeScannerSettingsKey.fromStringName(entry.getKey());
            if (fromStringName != null) {
                put(fromStringName, entry.getValue());
            }
        }
    }
}