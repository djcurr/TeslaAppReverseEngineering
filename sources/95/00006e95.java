package fr.greweb.reactnativeviewshot;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.util.Log;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public class RNViewShotModule extends ReactContextBaseJavaModule {
    public static final String RNVIEW_SHOT = "RNViewShot";
    private static final String TEMP_FILE_PREFIX = "ReactNative-snapshot-image";
    private final ReactApplicationContext reactContext;

    /* loaded from: classes5.dex */
    private static class b extends GuardedAsyncTask<Void, Void> implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        private final File f26804a;

        /* renamed from: b  reason: collision with root package name */
        private final File f26805b;

        private void a(File file) {
            File[] listFiles = file.listFiles(this);
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.delete()) {
                        Log.d(RNViewShotModule.RNVIEW_SHOT, "deleted file: " + file2.getAbsolutePath());
                    }
                }
            }
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(RNViewShotModule.TEMP_FILE_PREFIX);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: b */
        public void doInBackgroundGuarded(Void... voidArr) {
            File file = this.f26804a;
            if (file != null) {
                a(file);
            }
            File file2 = this.f26805b;
            if (file2 != null) {
                a(file2);
            }
        }

        private b(ReactContext reactContext) {
            super(reactContext);
            this.f26804a = reactContext.getCacheDir();
            this.f26805b = reactContext.getExternalCacheDir();
        }
    }

    public RNViewShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private File createTempFile(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        return File.createTempFile(TEMP_FILE_PREFIX, "." + str, externalCacheDir);
    }

    @ReactMethod
    public void captureRef(int i11, ReadableMap readableMap, Promise promise) {
        int i12;
        DisplayMetrics displayMetrics = getReactApplicationContext().getResources().getDisplayMetrics();
        String string = readableMap.getString("format");
        if ("jpg".equals(string)) {
            i12 = 0;
        } else if ("webm".equals(string)) {
            i12 = 2;
        } else {
            i12 = "raw".equals(string) ? -1 : 1;
        }
        int i13 = i12;
        double d11 = readableMap.getDouble(ImagePickerConstants.OPTION_QUALITY);
        Integer valueOf = readableMap.hasKey(Snapshot.WIDTH) ? Integer.valueOf((int) (displayMetrics.density * readableMap.getDouble(Snapshot.WIDTH))) : null;
        Integer valueOf2 = readableMap.hasKey(Snapshot.HEIGHT) ? Integer.valueOf((int) (displayMetrics.density * readableMap.getDouble(Snapshot.HEIGHT))) : null;
        String string2 = readableMap.getString("result");
        Boolean valueOf3 = Boolean.valueOf(readableMap.getBoolean("snapshotContentContainer"));
        try {
            ((UIManagerModule) this.reactContext.getNativeModule(UIManagerModule.class)).addUIBlock(new fr.greweb.reactnativeviewshot.a(i11, string, i13, d11, valueOf, valueOf2, "tmpfile".equals(string2) ? createTempFile(getReactApplicationContext(), string) : null, string2, valueOf3, this.reactContext, getCurrentActivity(), promise));
        } catch (Throwable th2) {
            Log.e(RNVIEW_SHOT, "Failed to snapshot view tag " + i11, th2);
            promise.reject("E_UNABLE_TO_SNAPSHOT", "Failed to snapshot view tag " + i11);
        }
    }

    @ReactMethod
    public void captureScreen(ReadableMap readableMap, Promise promise) {
        captureRef(-1, readableMap, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return RNVIEW_SHOT;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        new b(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void releaseCapture(String str) {
        String path = Uri.parse(str).getPath();
        if (path == null) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile.equals(this.reactContext.getExternalCacheDir()) || parentFile.equals(this.reactContext.getCacheDir())) {
                file.delete();
            }
        }
    }
}