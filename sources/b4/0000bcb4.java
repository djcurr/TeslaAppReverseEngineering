package wh;

import android.content.Context;
import android.os.Build;
import xh.v;

/* loaded from: classes3.dex */
public abstract class h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static v a(Context context, yh.d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar, ai.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new xh.c(context, dVar, cVar);
        }
        return new xh.a(context, dVar, aVar, cVar);
    }
}