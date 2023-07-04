package com.tesla.godot;

import androidx.annotation.Keep;
import com.tesla.logging.TeslaLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;

@Keep
/* loaded from: classes6.dex */
public class AndroidGodotInterface extends GodotPlugin {
    private static final String TAG = "AndroidGodotInterface";
    public AndroidGodotInterfaceListener listener;
    private final List<String> pendingMessages;

    /* loaded from: classes6.dex */
    public interface AndroidGodotInterfaceListener {
        void onGodotMessage(String str);
    }

    public AndroidGodotInterface(Godot godot) {
        super(godot);
        this.pendingMessages = new ArrayList();
    }

    public void addMessage(String str) {
        this.pendingMessages.add(str);
    }

    public String getMessage() {
        return this.pendingMessages.remove(0);
    }

    @Override // org.godotengine.godot.plugin.GodotPlugin
    public List<String> getPluginMethods() {
        return Arrays.asList("sendMessage", "getMessage", "pendingMessagesCount");
    }

    @Override // org.godotengine.godot.plugin.GodotPlugin
    public String getPluginName() {
        return TAG;
    }

    public int pendingMessagesCount() {
        return this.pendingMessages.size();
    }

    @Keep
    public void sendMessage(String str) {
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        teslaLog.d(TAG, "Godot Message: " + str);
        AndroidGodotInterfaceListener androidGodotInterfaceListener = this.listener;
        if (androidGodotInterfaceListener != null) {
            androidGodotInterfaceListener.onGodotMessage(str);
        }
    }
}