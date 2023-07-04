package expo.modules.interfaces.barcodescanner;

import android.graphics.Bitmap;
import java.util.List;

/* loaded from: classes5.dex */
public interface BarCodeScannerInterface {
    BarCodeScannerResult scan(byte[] bArr, int i11, int i12, int i13);

    List<BarCodeScannerResult> scanMultiple(Bitmap bitmap);

    void setSettings(BarCodeScannerSettings barCodeScannerSettings);
}