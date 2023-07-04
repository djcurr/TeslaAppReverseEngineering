package vs;

import android.content.Context;
import android.content.Intent;
import com.tesla.command.CommandRequestBroadcastReceiver;
import com.tesla.logging.g;
import kotlin.jvm.internal.s;
import ot.c;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f54611a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final g f54612b = g.f21878b.a("CommandNotificationActionIntentFactory");

    private a() {
    }

    public final c a(Intent intent) {
        s.g(intent, "intent");
        try {
            byte[] byteArrayExtra = intent.getByteArrayExtra("NotificationAction:CommandRequest");
            if (byteArrayExtra == null) {
                return null;
            }
            return c.f44007i.decode(byteArrayExtra);
        } catch (Exception e11) {
            f54612b.d("Failure to get command request", e11);
            return null;
        }
    }

    public final Intent b(Context context, int i11, String productId, b action) {
        byte[] bArr;
        s.g(context, "context");
        s.g(productId, "productId");
        s.g(action, "action");
        try {
            bArr = action.b(productId).encode();
        } catch (Exception e11) {
            f54612b.d("Failure to build or encode command request", e11);
            bArr = null;
        }
        Intent intent = new Intent(context, CommandRequestBroadcastReceiver.class);
        if (bArr != null) {
            intent.putExtra("NotificationAction:CommandRequest", bArr);
        }
        intent.putExtra("NotificationAction:NotificationId", i11);
        return intent;
    }

    public final int c(Intent intent) {
        s.g(intent, "intent");
        return intent.getIntExtra("NotificationAction:NotificationId", 0);
    }
}