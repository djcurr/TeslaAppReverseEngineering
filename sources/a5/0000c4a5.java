package z7;

import a8.i;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import h8.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    private final AssetManager f60366d;

    /* renamed from: a  reason: collision with root package name */
    private final i<String> f60363a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<i<String>, Typeface> f60364b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Typeface> f60365c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private String f60367e = ".ttf";

    public a(Drawable.Callback callback, v7.a aVar) {
        if (!(callback instanceof View)) {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f60366d = null;
            return;
        }
        this.f60366d = ((View) callback).getContext().getAssets();
    }

    private Typeface a(String str) {
        Typeface typeface = this.f60365c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f60366d, "fonts/" + str + this.f60367e);
        this.f60365c.put(str, createFromAsset);
        return createFromAsset;
    }

    private Typeface d(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i11 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i11 ? typeface : Typeface.create(typeface, i11);
    }

    public Typeface b(String str, String str2) {
        this.f60363a.b(str, str2);
        Typeface typeface = this.f60364b.get(this.f60363a);
        if (typeface != null) {
            return typeface;
        }
        Typeface d11 = d(a(str), str2);
        this.f60364b.put(this.f60363a, d11);
        return d11;
    }

    public void c(v7.a aVar) {
    }
}