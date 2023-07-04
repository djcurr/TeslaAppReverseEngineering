package z7;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import h8.d;
import h8.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import v7.f;

/* loaded from: classes.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f60368e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f60369a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60370b;

    /* renamed from: c  reason: collision with root package name */
    private v7.b f60371c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, f> f60372d;

    public b(Drawable.Callback callback, String str, v7.b bVar, Map<String, f> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f60370b = str + '/';
        } else {
            this.f60370b = str;
        }
        if (!(callback instanceof View)) {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f60372d = new HashMap();
            this.f60369a = null;
            return;
        }
        this.f60369a = ((View) callback).getContext();
        this.f60372d = map;
        d(bVar);
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f60368e) {
            this.f60372d.get(str).f(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        f fVar = this.f60372d.get(str);
        if (fVar == null) {
            return null;
        }
        Bitmap a11 = fVar.a();
        if (a11 != null) {
            return a11;
        }
        v7.b bVar = this.f60371c;
        if (bVar != null) {
            Bitmap a12 = bVar.a(fVar);
            if (a12 != null) {
                c(str, a12);
            }
            return a12;
        }
        String b11 = fVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (b11.startsWith("data:") && b11.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(b11.substring(b11.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e11) {
                d.d("data URL did not have correct base64 format.", e11);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f60370b)) {
                AssetManager assets = this.f60369a.getAssets();
                try {
                    return c(str, h.l(BitmapFactory.decodeStream(assets.open(this.f60370b + b11), null, options), fVar.e(), fVar.c()));
                } catch (IllegalArgumentException e12) {
                    d.d("Unable to decode image.", e12);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e13) {
            d.d("Unable to open asset.", e13);
            return null;
        }
    }

    public boolean b(Context context) {
        return (context == null && this.f60369a == null) || this.f60369a.equals(context);
    }

    public void d(v7.b bVar) {
        this.f60371c = bVar;
    }
}