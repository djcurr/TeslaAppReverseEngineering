package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.android.gms.dynamite.DynamiteModule;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes3.dex */
public final class zzp {
    public static boolean zza(Context context, String str) {
        return DynamiteModule.getLocalVersion(context, str) > DynamiteModule.getRemoteVersion(context, "com.google.android.gms.vision.dynamite");
    }

    public static Bitmap zzb(Bitmap bitmap, zzn zznVar) {
        int i11;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (zznVar.rotation != 0) {
            Matrix matrix = new Matrix();
            int i12 = zznVar.rotation;
            if (i12 == 0) {
                i11 = 0;
            } else if (i12 == 1) {
                i11 = 90;
            } else if (i12 == 2) {
                i11 = CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            } else if (i12 != 3) {
                throw new IllegalArgumentException("Unsupported rotation degree.");
            } else {
                i11 = 270;
            }
            matrix.postRotate(i11);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        }
        int i13 = zznVar.rotation;
        if (i13 == 1 || i13 == 3) {
            zznVar.width = height;
            zznVar.height = width;
        }
        return bitmap;
    }
}