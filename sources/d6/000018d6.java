package com.facebook.react.modules.debug;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.debug.b;
import java.util.Locale;

@fg.a(name = AnimationsDebugModule.NAME)
/* loaded from: classes3.dex */
public class AnimationsDebugModule extends NativeAnimationsDebugModuleSpec {
    protected static final String NAME = "AnimationsDebugModule";
    private final hg.a mCatalystSettings;
    private b mFrameCallback;

    public AnimationsDebugModule(ReactApplicationContext reactApplicationContext, hg.a aVar) {
        super(reactApplicationContext);
        this.mCatalystSettings = aVar;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        b bVar = this.mFrameCallback;
        if (bVar != null) {
            bVar.l();
            this.mFrameCallback = null;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec
    public void startRecordingFps() {
        hg.a aVar = this.mCatalystSettings;
        if (aVar == null || !aVar.b()) {
            return;
        }
        if (this.mFrameCallback == null) {
            b bVar = new b(getReactApplicationContext());
            this.mFrameCallback = bVar;
            bVar.k();
            return;
        }
        throw new JSApplicationCausedNativeException("Already recording FPS!");
    }

    @Override // com.facebook.fbreact.specs.NativeAnimationsDebugModuleSpec
    public void stopRecordingFps(double d11) {
        b bVar = this.mFrameCallback;
        if (bVar == null) {
            return;
        }
        bVar.l();
        b.C0231b e11 = this.mFrameCallback.e((long) d11);
        if (e11 == null) {
            Toast.makeText(getReactApplicationContext(), "Unable to get FPS info", 1);
        } else {
            Locale locale = Locale.US;
            String str = String.format(locale, "FPS: %.2f, %d frames (%d expected)", Double.valueOf(e11.f12008d), Integer.valueOf(e11.f12005a), Integer.valueOf(e11.f12007c)) + "\n" + String.format(locale, "JS FPS: %.2f, %d frames (%d expected)", Double.valueOf(e11.f12009e), Integer.valueOf(e11.f12006b), Integer.valueOf(e11.f12007c)) + "\nTotal Time MS: " + String.format(locale, "%d", Integer.valueOf(e11.f12010f));
            nd.a.b("ReactNative", str);
            Toast.makeText(getReactApplicationContext(), str, 1).show();
        }
        this.mFrameCallback = null;
    }
}