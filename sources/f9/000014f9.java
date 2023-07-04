package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);
        
        private final boolean hasAlpha;

        ImageType(boolean z11) {
            this.hasAlpha = z11;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    ImageType b(InputStream inputStream);

    int c(InputStream inputStream, ka.b bVar);
}