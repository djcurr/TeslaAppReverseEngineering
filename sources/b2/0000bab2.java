package w;

import android.os.Build;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.d0;
import androidx.camera.core.impl.d1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class n implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f54798a = Arrays.asList("SM-J710MN", "SM-T580");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return "SAMSUNG".equals(Build.BRAND.toUpperCase()) && f54798a.contains(Build.MODEL.toUpperCase());
    }

    public boolean b(d0 d0Var) {
        return d0Var instanceof c1;
    }
}