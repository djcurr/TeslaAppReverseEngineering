package t;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class v0 {
    private static String a(u.j jVar, Integer num, List<String> list) {
        if (num != null && list.contains("0") && list.contains("1")) {
            if (num.intValue() == 1) {
                if (((Integer) jVar.c("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    return "1";
                }
                return null;
            } else if (num.intValue() == 0 && ((Integer) jVar.c("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                return "0";
            } else {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> b(u uVar, z.e eVar) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(uVar.c().d());
            if (eVar == null) {
                for (String str2 : asList) {
                    arrayList.add(str2);
                }
                return arrayList;
            }
            try {
                str = a(uVar.c(), eVar.d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str3 : asList) {
                if (!str3.equals(str)) {
                    arrayList2.add(uVar.d(str3));
                }
            }
            try {
                Iterator<z.d> it2 = eVar.b(arrayList2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((androidx.camera.core.impl.r) it2.next()).a());
                }
            } catch (IllegalArgumentException unused2) {
            }
            return arrayList;
        } catch (CameraAccessExceptionCompat e11) {
            throw new InitializationException(w0.a(e11));
        } catch (CameraUnavailableException e12) {
            throw new InitializationException(e12);
        }
    }
}