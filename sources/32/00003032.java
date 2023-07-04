package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class Frame {
    public static final int ROTATION_0 = 0;
    public static final int ROTATION_180 = 2;
    public static final int ROTATION_270 = 3;
    public static final int ROTATION_90 = 1;
    private Metadata zzap;
    private ByteBuffer zzaq;
    private Bitmap zzar;

    /* loaded from: classes3.dex */
    public static class Builder {
        private Frame zzas = new Frame();

        public Frame build() {
            if (this.zzas.zzaq == null && this.zzas.zzar == null) {
                throw new IllegalStateException("Missing image data.  Call either setBitmap or setImageData to specify the image");
            }
            return this.zzas;
        }

        public Builder setBitmap(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            this.zzas.zzar = bitmap;
            Metadata metadata = this.zzas.getMetadata();
            metadata.width = width;
            metadata.height = height;
            return this;
        }

        public Builder setId(int i11) {
            this.zzas.getMetadata().f14807id = i11;
            return this;
        }

        public Builder setImageData(ByteBuffer byteBuffer, int i11, int i12, int i13) {
            if (byteBuffer != null) {
                if (byteBuffer.capacity() >= i11 * i12) {
                    if (i13 == 16 || i13 == 17 || i13 == 842094169) {
                        this.zzas.zzaq = byteBuffer;
                        Metadata metadata = this.zzas.getMetadata();
                        metadata.width = i11;
                        metadata.height = i12;
                        metadata.format = i13;
                        return this;
                    }
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Unsupported image format: ");
                    sb2.append(i13);
                    throw new IllegalArgumentException(sb2.toString());
                }
                throw new IllegalArgumentException("Invalid image data size.");
            }
            throw new IllegalArgumentException("Null image data supplied.");
        }

        public Builder setRotation(int i11) {
            this.zzas.getMetadata().rotation = i11;
            return this;
        }

        public Builder setTimestampMillis(long j11) {
            this.zzas.getMetadata().zzat = j11;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static class Metadata {
        private int format = -1;
        private int height;

        /* renamed from: id  reason: collision with root package name */
        private int f14807id;
        private int rotation;
        private int width;
        private long zzat;

        public Metadata() {
        }

        public int getFormat() {
            return this.format;
        }

        public int getHeight() {
            return this.height;
        }

        public int getId() {
            return this.f14807id;
        }

        public int getRotation() {
            return this.rotation;
        }

        public long getTimestampMillis() {
            return this.zzat;
        }

        public int getWidth() {
            return this.width;
        }

        public final void zzd() {
            if (this.rotation % 2 != 0) {
                int i11 = this.width;
                this.width = this.height;
                this.height = i11;
            }
            this.rotation = 0;
        }

        public Metadata(Metadata metadata) {
            this.width = metadata.getWidth();
            this.height = metadata.getHeight();
            this.f14807id = metadata.getId();
            this.zzat = metadata.getTimestampMillis();
            this.rotation = metadata.getRotation();
        }
    }

    private Frame() {
        this.zzap = new Metadata();
        this.zzaq = null;
        this.zzar = null;
    }

    public Bitmap getBitmap() {
        return this.zzar;
    }

    public ByteBuffer getGrayscaleImageData() {
        Bitmap bitmap = this.zzar;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = this.zzar.getHeight();
            int i11 = width * height;
            int[] iArr = new int[i11];
            this.zzar.getPixels(iArr, 0, width, 0, 0, width, height);
            byte[] bArr = new byte[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                bArr[i12] = (byte) ((Color.red(iArr[i12]) * 0.299f) + (Color.green(iArr[i12]) * 0.587f) + (Color.blue(iArr[i12]) * 0.114f));
            }
            return ByteBuffer.wrap(bArr);
        }
        return this.zzaq;
    }

    public Metadata getMetadata() {
        return this.zzap;
    }
}