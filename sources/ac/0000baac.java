package w;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.impl.d1;
import androidx.camera.core.n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class h implements d1 {
    private List<Size> b(String str, int i11) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i11 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private List<Size> c(String str, int i11) {
        ArrayList arrayList = new ArrayList();
        if (str.equals("0") && i11 == 256) {
            arrayList.add(new Size(4160, 3120));
            arrayList.add(new Size(4000, 3000));
        }
        return arrayList;
    }

    private static boolean d() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6".equalsIgnoreCase(Build.DEVICE);
    }

    private static boolean e() {
        return "OnePlus".equalsIgnoreCase(Build.BRAND) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f() {
        return d() || e();
    }

    public List<Size> a(String str, int i11) {
        if (d()) {
            return b(str, i11);
        }
        if (e()) {
            return c(str, i11);
        }
        n0.m("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
        return Collections.emptyList();
    }
}