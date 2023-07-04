package w;

import android.os.Build;
import androidx.camera.core.impl.d1;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class l implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f54796a = Arrays.asList("NEXUS 4");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b() {
        return "GOOGLE".equals(Build.BRAND.toUpperCase()) && Build.VERSION.SDK_INT < 23 && f54796a.contains(Build.MODEL.toUpperCase());
    }

    public int a() {
        return 2;
    }
}