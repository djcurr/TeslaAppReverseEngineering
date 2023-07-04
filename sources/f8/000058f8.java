package com.stripe.android.stripe3ds2.utils;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public interface ImageCache {

    /* loaded from: classes6.dex */
    public static final class Default implements ImageCache {
        public static final Default INSTANCE = new Default();
        private static final int KB = 1024;
        private static final int MAX_SIZE = 10240;
        private static final LruCache<String, Bitmap> cache;
        private static final int cacheSize;

        static {
            int min = Math.min((int) ((Runtime.getRuntime().maxMemory() / 1024) / 8), (int) MAX_SIZE);
            cacheSize = min;
            cache = new LruCache<String, Bitmap>(min) { // from class: com.stripe.android.stripe3ds2.utils.ImageCache$Default$cache$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.util.LruCache
                public int sizeOf(String key, Bitmap bitmap) {
                    s.g(key, "key");
                    s.g(bitmap, "bitmap");
                    return bitmap.getByteCount() / 1024;
                }
            };
        }

        private Default() {
        }

        public static /* synthetic */ void getCache$3ds2sdk_release$annotations() {
        }

        @Override // com.stripe.android.stripe3ds2.utils.ImageCache
        public void clear() {
            cache.evictAll();
        }

        @Override // com.stripe.android.stripe3ds2.utils.ImageCache
        public Bitmap get(String key) {
            s.g(key, "key");
            return cache.get(key);
        }

        public final LruCache<String, Bitmap> getCache$3ds2sdk_release() {
            return cache;
        }

        @Override // com.stripe.android.stripe3ds2.utils.ImageCache
        public void set(String key, Bitmap bitmap) {
            s.g(key, "key");
            s.g(bitmap, "bitmap");
            cache.put(key, bitmap);
        }
    }

    void clear();

    Bitmap get(String str);

    void set(String str, Bitmap bitmap);
}