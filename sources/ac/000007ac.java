package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.profileinstaller.d;
import com.google.firebase.messaging.h;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* loaded from: classes.dex */
    class a implements d.c {
        a() {
        }

        @Override // androidx.profileinstaller.d.c
        public void a(int i11, Object obj) {
            d.f5280b.a(i11, obj);
            ProfileInstallReceiver.this.setResultCode(i11);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "androidx.profileinstaller.action.INSTALL_PROFILE".equals(intent.getAction())) {
            d.i(context, h.f16804a, new a(), true);
        }
    }
}