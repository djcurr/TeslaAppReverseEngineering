package kz;

import android.content.Context;
import android.os.Process;
import org.jetbrains.annotations.ApiStatus;
import rz.j;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class e {
    public static boolean a(Context context, String str) {
        j.a(context, "The application context is required.");
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}