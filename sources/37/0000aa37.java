package p5;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import cl.json.RNShareModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes.dex */
public abstract class n extends m {
    public n(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // p5.m
    public void m(ReadableMap readableMap) {
        String j11;
        System.out.println(i());
        if (i() != null || c() != null || j() != null) {
            if (m.l(i(), this.f46200a)) {
                System.out.println("INSTALLED");
                if (b() != null) {
                    g().setComponent(new ComponentName(i(), b()));
                } else {
                    g().setPackage(i());
                }
                super.m(readableMap);
                return;
            }
            System.out.println("NOT INSTALLED");
            if (c() != null) {
                j11 = c().replace("{url}", m.p(readableMap.getString("url"))).replace("{message}", m.p(readableMap.getString("message")));
            } else {
                j11 = j() != null ? j() : "";
            }
            o(new Intent(new Intent("android.intent.action.VIEW", Uri.parse(j11))));
        }
        super.m(readableMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public void n() {
        q(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q(ReadableMap readableMap) {
        if (this.f46204e.hasKey("forceDialog") && this.f46204e.getBoolean("forceDialog")) {
            Activity currentActivity = this.f46200a.getCurrentActivity();
            if (currentActivity == null) {
                p.d(false, "Something went wrong");
                return;
            } else if (readableMap != null && !m.k("social", readableMap)) {
                throw new IllegalArgumentException("social is empty");
            } else {
                if (p.b()) {
                    Intent createChooser = Intent.createChooser(g(), this.f46202c, p.a(this.f46200a));
                    createChooser.addFlags(1073741824);
                    currentActivity.startActivityForResult(createChooser, RNShareModule.SHARE_REQUEST_CODE);
                    return;
                }
                Intent createChooser2 = Intent.createChooser(g(), this.f46202c);
                createChooser2.addFlags(1073741824);
                currentActivity.startActivityForResult(createChooser2, RNShareModule.SHARE_REQUEST_CODE);
                p.d(true, Boolean.TRUE, "OK");
                return;
            }
        }
        g().addFlags(268435456);
        this.f46200a.startActivity(g());
        p.d(true, Boolean.TRUE, g().getPackage());
    }
}