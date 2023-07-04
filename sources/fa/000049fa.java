package com.reactnativestripesdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public final class n0 {
    public static final String a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.s.f(byteArray, "stream.toByteArray()");
        return Base64.encodeToString(byteArray, 0);
    }

    public static final Bitmap b(Context context, int i11) {
        kotlin.jvm.internal.s.e(context);
        Drawable d11 = h.a.d(context, i11);
        if (d11 == null) {
            return null;
        }
        Drawable mutate = n3.a.r(d11).mutate();
        kotlin.jvm.internal.s.f(mutate, "wrap(drawable).mutate()");
        Bitmap createBitmap = Bitmap.createBitmap(mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(-1);
        Canvas canvas = new Canvas(createBitmap);
        mutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        mutate.draw(canvas);
        return createBitmap;
    }
}