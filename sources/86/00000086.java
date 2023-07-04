package ab;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap<String, ha.b> f372a = new ConcurrentHashMap();

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e11);
            return null;
        }
    }

    private static String b(PackageInfo packageInfo) {
        if (packageInfo != null) {
            return String.valueOf(packageInfo.versionCode);
        }
        return UUID.randomUUID().toString();
    }

    public static ha.b c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, ha.b> concurrentMap = f372a;
        ha.b bVar = concurrentMap.get(packageName);
        if (bVar == null) {
            ha.b d11 = d(context);
            ha.b putIfAbsent = concurrentMap.putIfAbsent(packageName, d11);
            return putIfAbsent == null ? d11 : putIfAbsent;
        }
        return bVar;
    }

    private static ha.b d(Context context) {
        return new d(b(a(context)));
    }
}