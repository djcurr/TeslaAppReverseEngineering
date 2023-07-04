package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.android.volley.ParseError;
import com.android.volley.i;
import com.android.volley.k;

/* loaded from: classes.dex */
public class k extends com.android.volley.i<Bitmap> {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object sDecodeLock = new Object();
    private final Bitmap.Config mDecodeConfig;
    private k.b<Bitmap> mListener;
    private final Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final ImageView.ScaleType mScaleType;

    public k(String str, k.b<Bitmap> bVar, int i11, int i12, ImageView.ScaleType scaleType, Bitmap.Config config, k.a aVar) {
        super(0, str, aVar);
        this.mLock = new Object();
        setRetryPolicy(new com.android.volley.c(1000, 2, 2.0f));
        this.mListener = bVar;
        this.mDecodeConfig = config;
        this.mMaxWidth = i11;
        this.mMaxHeight = i12;
        this.mScaleType = scaleType;
    }

    private com.android.volley.k<Bitmap> doParse(com.android.volley.h hVar) {
        Bitmap decodeByteArray;
        byte[] bArr = hVar.f10284b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i11 = options.outWidth;
            int i12 = options.outHeight;
            int resizedDimension = getResizedDimension(this.mMaxWidth, this.mMaxHeight, i11, i12, this.mScaleType);
            int resizedDimension2 = getResizedDimension(this.mMaxHeight, this.mMaxWidth, i12, i11, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i11, i12, resizedDimension, resizedDimension2);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > resizedDimension || decodeByteArray.getHeight() > resizedDimension2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, resizedDimension, resizedDimension2, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray == null) {
            return com.android.volley.k.a(new ParseError(hVar));
        }
        return com.android.volley.k.c(decodeByteArray, g.e(hVar));
    }

    static int findBestSampleSize(int i11, int i12, int i13, int i14) {
        double min = Math.min(i11 / i13, i12 / i14);
        float f11 = 1.0f;
        while (true) {
            float f12 = 2.0f * f11;
            if (f12 > min) {
                return (int) f11;
            }
            f11 = f12;
        }
    }

    private static int getResizedDimension(int i11, int i12, int i13, int i14, ImageView.ScaleType scaleType) {
        if (i11 == 0 && i12 == 0) {
            return i13;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i11 == 0 ? i13 : i11;
        } else if (i11 == 0) {
            return (int) (i13 * (i12 / i14));
        } else if (i12 == 0) {
            return i11;
        } else {
            double d11 = i14 / i13;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d12 = i12;
                return ((double) i11) * d11 < d12 ? (int) (d12 / d11) : i11;
            }
            double d13 = i12;
            return ((double) i11) * d11 > d13 ? (int) (d13 / d11) : i11;
        }
    }

    @Override // com.android.volley.i
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.i
    public i.c getPriority() {
        return i.c.LOW;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.i
    public com.android.volley.k<Bitmap> parseNetworkResponse(com.android.volley.h hVar) {
        com.android.volley.k<Bitmap> doParse;
        synchronized (sDecodeLock) {
            try {
                try {
                    doParse = doParse(hVar);
                } catch (OutOfMemoryError e11) {
                    com.android.volley.n.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(hVar.f10284b.length), getUrl());
                    return com.android.volley.k.a(new ParseError(e11));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return doParse;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.i
    public void deliverResponse(Bitmap bitmap) {
        k.b<Bitmap> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(bitmap);
        }
    }

    @Deprecated
    public k(String str, k.b<Bitmap> bVar, int i11, int i12, Bitmap.Config config, k.a aVar) {
        this(str, bVar, i11, i12, ImageView.ScaleType.CENTER_INSIDE, config, aVar);
    }
}