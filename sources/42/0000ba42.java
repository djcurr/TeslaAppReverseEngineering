package vs;

import android.app.PendingIntent;
import android.content.Context;
import kotlin.jvm.internal.s;
import ot.c;

/* loaded from: classes6.dex */
public interface b extends nu.a {

    /* loaded from: classes6.dex */
    public static final class a {
        public static PendingIntent a(b bVar, Context context, int i11, String str) {
            s.g(bVar, "this");
            s.g(context, "context");
            if (str != null) {
                PendingIntent broadcast = PendingIntent.getBroadcast(context, i11, vs.a.f54611a.b(context, i11, str, bVar), 67108864);
                s.f(broadcast, "getBroadcast(\n      cont…tent.FLAG_IMMUTABLE\n    )");
                return broadcast;
            }
            throw new IllegalStateException("Cannot create pending intent with null product id");
        }
    }

    c b(String str);
}