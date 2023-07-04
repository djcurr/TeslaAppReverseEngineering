package fr.bamlab.rnimageresizer;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes5.dex */
public class ImageResizerModule extends ReactContextBaseJavaModule {
    private Context context;

    /* loaded from: classes5.dex */
    class a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f26791a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f26792b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f26793c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f26794d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f26795e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f26796f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f26797g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f26798h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ ReadableMap f26799i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ Callback f26800j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ Callback f26801k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, String str, int i11, int i12, String str2, int i13, int i14, String str3, boolean z11, ReadableMap readableMap, Callback callback, Callback callback2) {
            super(reactContext);
            this.f26791a = str;
            this.f26792b = i11;
            this.f26793c = i12;
            this.f26794d = str2;
            this.f26795e = i13;
            this.f26796f = i14;
            this.f26797g = str3;
            this.f26798h = z11;
            this.f26799i = readableMap;
            this.f26800j = callback;
            this.f26801k = callback2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            try {
                ImageResizerModule.this.createResizedImageWithExceptions(this.f26791a, this.f26792b, this.f26793c, this.f26794d, this.f26795e, this.f26796f, this.f26797g, this.f26798h, this.f26799i, this.f26800j, this.f26801k);
            } catch (IOException e11) {
                this.f26801k.invoke(e11.getMessage());
            }
        }
    }

    public ImageResizerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.context = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createResizedImageWithExceptions(String str, int i11, int i12, String str2, int i13, int i14, String str3, boolean z11, ReadableMap readableMap, Callback callback, Callback callback2) {
        Bitmap.CompressFormat valueOf = Bitmap.CompressFormat.valueOf(str2);
        Uri parse = Uri.parse(str);
        Bitmap c11 = fr.bamlab.rnimageresizer.a.c(this.context, parse, i11, i12, i13, i14, readableMap.getString("mode"), readableMap.getBoolean("onlyScaleDown"));
        if (c11 != null) {
            File cacheDir = this.context.getCacheDir();
            if (str3 != null) {
                cacheDir = new File(str3);
            }
            File m11 = fr.bamlab.rnimageresizer.a.m(c11, cacheDir, UUID.randomUUID().toString(), valueOf, i13);
            if (m11.isFile()) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("path", m11.getAbsolutePath());
                createMap.putString("uri", Uri.fromFile(m11).toString());
                createMap.putString("name", m11.getName());
                createMap.putDouble("size", m11.length());
                createMap.putDouble(Snapshot.WIDTH, c11.getWidth());
                createMap.putDouble(Snapshot.HEIGHT, c11.getHeight());
                if (z11) {
                    try {
                        fr.bamlab.rnimageresizer.a.b(this.context, parse, m11.getAbsolutePath());
                    } catch (Exception e11) {
                        Log.e("ImageResizer::createResizedImageWithExceptions", "EXIF copy failed", e11);
                    }
                }
                callback.invoke(createMap);
            } else {
                callback2.invoke("Error getting resized image path");
            }
            c11.recycle();
            return;
        }
        throw new IOException("The image failed to be resized; invalid Bitmap result.");
    }

    @ReactMethod
    public void createResizedImage(String str, int i11, int i12, String str2, int i13, int i14, String str3, boolean z11, ReadableMap readableMap, Callback callback, Callback callback2) {
        new a(getReactApplicationContext(), str, i11, i12, str2, i13, i14, str3, z11, readableMap, callback, callback2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageResizerAndroid";
    }
}