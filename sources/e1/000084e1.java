package lw;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes6.dex */
public class a {
    public Intent a(Context context) {
        try {
            Intent intent = new Intent(context, Class.forName(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName()));
            intent.setFlags(270532608);
            intent.putExtra("launchedFromNotification", true);
            return intent;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}