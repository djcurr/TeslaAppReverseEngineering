package w;

import android.os.Build;
import androidx.camera.core.impl.d1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class m implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f54797a = new ArrayList(Arrays.asList("sunfish", "bramble", "redfin"));

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        return "Google".equals(Build.MANUFACTURER) && f54797a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}