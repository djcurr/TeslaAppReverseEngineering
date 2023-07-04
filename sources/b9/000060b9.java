package com.tesla.godot;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.tesla.godot.TMGodot;
import com.tesla.logging.g;

/* loaded from: classes6.dex */
class TMGodotViewModule extends ReactContextBaseJavaModule implements TMGodot.Listener {
    private static final String TAG = "TMGodotViewModule";
    private final g logger;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TMGodotViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.logger = g.g(TAG);
        TMGodot.setListener(this);
    }

    private synchronized void sendQueuedMessages() {
        for (String str : TMGodot.getQueuedMessages()) {
            TMGodot.sendMessageToGodot(str);
        }
        TMGodot.clearQueuedMessages();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "GodotModule";
    }

    @Override // com.tesla.godot.TMGodot.Listener
    public void onGodotReady() {
        sendQueuedMessages();
    }

    @ReactMethod
    public void sendMessageToGodot(String str) {
        TMGodot.queueMessage(str);
        if (TMGodot.godotReady()) {
            sendQueuedMessages();
        }
    }
}