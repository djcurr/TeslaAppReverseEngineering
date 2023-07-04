package com.dylanvann.fastimage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.h;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.HashMap;
import java.util.Map;
import na.j;

/* loaded from: classes.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Drawable f11046a = new ColorDrawable(0);

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, FastImageCacheControl> f11047b = new C0206a();

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, h> f11048c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, ImageView.ScaleType> f11049d = new c();

    /* renamed from: com.dylanvann.fastimage.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0206a extends HashMap<String, FastImageCacheControl> {
        C0206a() {
            put("immutable", FastImageCacheControl.IMMUTABLE);
            put("web", FastImageCacheControl.WEB);
            put("cacheOnly", FastImageCacheControl.CACHE_ONLY);
        }
    }

    /* loaded from: classes.dex */
    class b extends HashMap<String, h> {
        b() {
            put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_LOW, h.LOW);
            put("normal", h.NORMAL);
            put(RCTCameraModule.RCT_CAMERA_CAPTURE_QUALITY_HIGH, h.HIGH);
        }
    }

    /* loaded from: classes.dex */
    class c extends HashMap<String, ImageView.ScaleType> {
        c() {
            put("contain", ImageView.ScaleType.FIT_CENTER);
            put("cover", ImageView.ScaleType.CENTER_CROP);
            put("stretch", ImageView.ScaleType.FIT_XY);
            put("center", ImageView.ScaleType.CENTER_INSIDE);
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11050a;

        static {
            int[] iArr = new int[FastImageCacheControl.values().length];
            f11050a = iArr;
            try {
                iArr[FastImageCacheControl.WEB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11050a[FastImageCacheControl.CACHE_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11050a[FastImageCacheControl.IMMUTABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static FastImageCacheControl a(ReadableMap readableMap) {
        return (FastImageCacheControl) h("cache", "immutable", f11047b, readableMap);
    }

    static na.h b(ReadableMap readableMap) {
        na.h hVar = na.h.f40714a;
        if (readableMap.hasKey("headers")) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            j.a aVar = new j.a();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                aVar.a(nextKey, map.getString(nextKey));
            }
            return aVar.c();
        }
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FastImageSource c(Context context, ReadableMap readableMap) {
        return new FastImageSource(context, readableMap.getString("uri"), b(readableMap));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.bumptech.glide.request.h d(Context context, FastImageSource fastImageSource, ReadableMap readableMap) {
        Boolean bool;
        h e11 = e(readableMap);
        FastImageCacheControl a11 = a(readableMap);
        ja.a aVar = ja.a.f33307c;
        Boolean bool2 = Boolean.FALSE;
        int i11 = d.f11050a[a11.ordinal()];
        if (i11 == 1) {
            aVar = ja.a.f33305a;
            bool = Boolean.TRUE;
        } else if (i11 != 2) {
            bool = bool2;
        } else {
            bool2 = Boolean.TRUE;
            bool = bool2;
        }
        com.bumptech.glide.request.h placeholder = new com.bumptech.glide.request.h().diskCacheStrategy(aVar).onlyRetrieveFromCache(bool2.booleanValue()).skipMemoryCache(bool.booleanValue()).priority(e11).placeholder(f11046a);
        return fastImageSource.isResource() ? placeholder.apply(com.bumptech.glide.request.h.signatureOf(ab.b.c(context))) : placeholder;
    }

    private static h e(ReadableMap readableMap) {
        return (h) h("priority", "normal", f11048c, readableMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ImageView.ScaleType f(String str) {
        return (ImageView.ScaleType) g("resizeMode", "cover", f11049d, str);
    }

    private static <T> T g(String str, String str2, Map<String, T> map, String str3) {
        if (str3 != null) {
            str2 = str3;
        }
        T t11 = map.get(str2);
        if (t11 != null) {
            return t11;
        }
        throw new JSApplicationIllegalArgumentException("FastImage, invalid " + str + " : " + str2);
    }

    private static <T> T h(String str, String str2, Map<String, T> map, ReadableMap readableMap) {
        String str3 = null;
        if (readableMap != null) {
            try {
                str3 = readableMap.getString(str);
            } catch (NoSuchKeyException unused) {
            }
        }
        return (T) g(str, str2, map, str3);
    }
}