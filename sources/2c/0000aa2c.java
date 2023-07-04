package p5;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.appstate.AppStateModule;

/* loaded from: classes.dex */
public class d extends n {
    public d(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        o(new Intent("com.facebook.stories.ADD_TO_STORY"));
    }

    private void r(ReadableMap readableMap) {
        String string;
        if (m.k("appId", readableMap)) {
            if (!m.k("backgroundImage", readableMap) && !m.k("backgroundVideo", readableMap) && !m.k("stickerImage", readableMap)) {
                throw new IllegalArgumentException("Invalid background or sticker assets provided.");
            }
            Activity currentActivity = this.f46200a.getCurrentActivity();
            boolean z11 = false;
            if (currentActivity == null) {
                p.d(false, "Something went wrong");
                return;
            }
            this.f46201b.putExtra("com.facebook.platform.extra.APPLICATION_ID", readableMap.getString("appId"));
            this.f46201b.putExtra("bottom_background_color", "#906df4");
            this.f46201b.putExtra("top_background_color", "#837DF4");
            if (m.k("attributionURL", readableMap)) {
                this.f46201b.putExtra("content_url", readableMap.getString("attributionURL"));
            }
            if (m.k("backgroundTopColor", readableMap)) {
                this.f46201b.putExtra("top_background_color", readableMap.getString("backgroundTopColor"));
            }
            if (m.k("backgroundBottomColor", readableMap)) {
                this.f46201b.putExtra("bottom_background_color", readableMap.getString("backgroundBottomColor"));
            }
            Boolean bool = Boolean.FALSE;
            if (m.k("useInternalStorage", readableMap)) {
                bool = Boolean.valueOf(readableMap.getBoolean("useInternalStorage"));
            }
            if (m.k("backgroundImage", readableMap) || m.k("backgroundVideo", readableMap)) {
                z11 = true;
            }
            Boolean valueOf = Boolean.valueOf(z11);
            if (valueOf.booleanValue()) {
                if (m.k("backgroundImage", readableMap)) {
                    string = readableMap.getString("backgroundImage");
                } else {
                    string = m.k("backgroundVideo", readableMap) ? readableMap.getString("backgroundVideo") : "";
                }
                o5.d dVar = new o5.d(string, "image/jpeg", AppStateModule.APP_STATE_BACKGROUND, bool, this.f46200a);
                this.f46201b.setDataAndType(dVar.d(), dVar.c());
                this.f46201b.setFlags(1);
            }
            if (m.k("stickerImage", readableMap)) {
                o5.d dVar2 = new o5.d(readableMap.getString("stickerImage"), "image/png", "sticker", bool, this.f46200a);
                if (!valueOf.booleanValue()) {
                    this.f46201b.setType("image/*");
                }
                this.f46201b.putExtra("interactive_asset_uri", dVar2.d());
                currentActivity.grantUriPermission("com.facebook.katana", dVar2.d(), 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("appId was not provided.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String c() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String i() {
        return "com.facebook.katana";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String j() {
        return "market://details?id=com.facebook.katana";
    }

    @Override // p5.n, p5.m
    public void m(ReadableMap readableMap) {
        super.m(readableMap);
        r(readableMap);
        q(readableMap);
    }
}