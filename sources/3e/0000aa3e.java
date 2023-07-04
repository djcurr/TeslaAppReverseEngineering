package p5;

import android.content.ComponentName;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes.dex */
public class u extends n {
    public u(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String c() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String i() {
        return "com.whatsapp";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p5.m
    public String j() {
        return "market://details?id=com.whatsapp";
    }

    @Override // p5.n, p5.m
    public void m(ReadableMap readableMap) {
        super.m(readableMap);
        if (readableMap.hasKey("whatsAppNumber")) {
            try {
                g().setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
                n();
                Thread.sleep(10L);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        g().setComponent(null);
        n();
    }
}