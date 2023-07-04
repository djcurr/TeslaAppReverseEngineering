package org.godotengine.godot.plugin;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.godotengine.godot.Godot;

/* loaded from: classes5.dex */
public abstract class GodotPlugin {
    private static final String TAG = "GodotPlugin";
    private final Godot godot;
    private final ConcurrentHashMap<String, SignalInfo> registeredSignals = new ConcurrentHashMap<>();

    public GodotPlugin(Godot godot) {
        this.godot = godot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeEmitSignal(String str, String str2, Object[] objArr);

    private native void nativeRegisterGDNativeLibraries(String[] strArr);

    public static native void nativeRegisterMethod(String str, String str2, String str3, String[] strArr);

    private native void nativeRegisterSignal(String str, String str2, String[] strArr);

    public static native void nativeRegisterSingleton(String str, Object obj);

    protected void emitSignal(final String str, final Object... objArr) {
        try {
            SignalInfo signalInfo = this.registeredSignals.get(str);
            if (signalInfo != null) {
                Class<?>[] paramTypes = signalInfo.getParamTypes();
                if (objArr.length == paramTypes.length) {
                    for (int i11 = 0; i11 < paramTypes.length; i11++) {
                        if (!paramTypes[i11].isInstance(objArr[i11])) {
                            throw new IllegalArgumentException("Invalid type for argument #" + i11 + ". Should be of type " + paramTypes[i11].getName());
                        }
                    }
                    runOnRenderThread(new Runnable() { // from class: org.godotengine.godot.plugin.GodotPlugin.1
                        @Override // java.lang.Runnable
                        public void run() {
                            GodotPlugin godotPlugin = GodotPlugin.this;
                            godotPlugin.nativeEmitSignal(godotPlugin.getPluginName(), str, objArr);
                        }
                    });
                    return;
                }
                throw new IllegalArgumentException("Invalid arguments count. Should be " + paramTypes.length + "  but is " + objArr.length);
            }
            throw new IllegalArgumentException("Signal " + str + " is not registered for this plugin.");
        } catch (IllegalArgumentException e11) {
            Log.w(TAG, e11.getMessage());
        }
    }

    protected Activity getActivity() {
        return this.godot.getActivity();
    }

    protected Godot getGodot() {
        return this.godot;
    }

    protected Set<String> getPluginGDNativeLibrariesPaths() {
        return Collections.emptySet();
    }

    public List<String> getPluginMethods() {
        return Collections.emptyList();
    }

    public abstract String getPluginName();

    public Set<SignalInfo> getPluginSignals() {
        return Collections.emptySet();
    }

    public void onGLDrawFrame(GL10 gl10) {
    }

    public void onGLSurfaceChanged(GL10 gl10, int i11, int i12) {
    }

    public void onGLSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
    }

    public void onGodotMainLoopStarted() {
    }

    public void onMainActivityResult(int i11, int i12, Intent intent) {
    }

    public boolean onMainBackPressed() {
        return false;
    }

    public View onMainCreate(Activity activity) {
        return null;
    }

    public void onMainDestroy() {
    }

    public void onMainPause() {
    }

    public void onMainRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
    }

    public void onMainResume() {
    }

    public final void onRegisterPluginWithGodotNative() {
        Method[] declaredMethods;
        boolean z11;
        nativeRegisterSingleton(getPluginName(), this);
        for (Method method : getClass().getDeclaredMethods()) {
            Iterator<String> it2 = getPluginMethods().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().equals(method.getName())) {
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
            if (z11) {
                ArrayList arrayList = new ArrayList();
                for (Class<?> cls : method.getParameterTypes()) {
                    arrayList.add(cls.getName());
                }
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                nativeRegisterMethod(getPluginName(), method.getName(), method.getReturnType().getName(), strArr);
            }
        }
        for (SignalInfo signalInfo : getPluginSignals()) {
            String name = signalInfo.getName();
            nativeRegisterSignal(getPluginName(), name, signalInfo.getParamTypesNames());
            this.registeredSignals.put(name, signalInfo);
        }
        Set<String> pluginGDNativeLibrariesPaths = getPluginGDNativeLibrariesPaths();
        if (pluginGDNativeLibrariesPaths.isEmpty()) {
            return;
        }
        nativeRegisterGDNativeLibraries((String[]) pluginGDNativeLibrariesPaths.toArray(new String[0]));
    }

    protected void runOnRenderThread(Runnable runnable) {
        this.godot.runOnRenderThread(runnable);
    }

    protected void runOnUiThread(Runnable runnable) {
        this.godot.runOnUiThread(runnable);
    }
}