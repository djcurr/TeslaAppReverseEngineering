package com.facebook.react;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
public class n {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Integer, String> f12125c = yf.c.a().b(23, "select").b(66, "select").b(62, "select").b(85, "playPause").b(89, "rewind").b(90, "fastForward").b(86, "stop").b(87, "next").b(88, "previous").b(19, "up").b(22, "right").b(20, "down").b(21, "left").b(Integer.valueOf((int) CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384), "info").b(82, "menu").a();

    /* renamed from: a  reason: collision with root package name */
    private int f12126a = -1;

    /* renamed from: b  reason: collision with root package name */
    private final z f12127b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(z zVar) {
        this.f12127b = zVar;
    }

    private void b(String str, int i11) {
        c(str, i11, -1);
    }

    private void c(String str, int i11, int i12) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("eventType", str);
        writableNativeMap.putInt("eventKeyAction", i12);
        if (i11 != -1) {
            writableNativeMap.putInt("tag", i11);
        }
        this.f12127b.q("onHWKeyEvent", writableNativeMap);
    }

    public void a() {
        int i11 = this.f12126a;
        if (i11 != -1) {
            b("blur", i11);
        }
        this.f12126a = -1;
    }

    public void d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if (action == 1 || action == 0) {
            Map<Integer, String> map = f12125c;
            if (map.containsKey(Integer.valueOf(keyCode))) {
                c(map.get(Integer.valueOf(keyCode)), this.f12126a, action);
            }
        }
    }

    public void e(View view) {
        if (this.f12126a == view.getId()) {
            return;
        }
        int i11 = this.f12126a;
        if (i11 != -1) {
            b("blur", i11);
        }
        this.f12126a = view.getId();
        b("focus", view.getId());
    }
}