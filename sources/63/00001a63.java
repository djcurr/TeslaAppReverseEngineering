package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f12639c = {"", "_bold", "_italic", "_bold_italic"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f12640d = {".ttf", ".otf"};

    /* renamed from: e  reason: collision with root package name */
    private static j f12641e;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b> f12642a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Typeface> f12643b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private SparseArray<Typeface> f12644a;

        public Typeface a(int i11) {
            return this.f12644a.get(i11);
        }

        public void b(int i11, Typeface typeface) {
            this.f12644a.put(i11, typeface);
        }

        private b() {
            this.f12644a = new SparseArray<>(4);
        }
    }

    private j() {
    }

    private static Typeface a(String str, int i11, AssetManager assetManager) {
        String[] strArr;
        String str2 = f12639c[i11];
        for (String str3 : f12640d) {
            try {
                return Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
            } catch (RuntimeException unused) {
            }
        }
        return Typeface.create(str, i11);
    }

    public static j b() {
        if (f12641e == null) {
            f12641e = new j();
        }
        return f12641e;
    }

    public Typeface c(String str, int i11, AssetManager assetManager) {
        return d(str, new f0(i11), assetManager);
    }

    public Typeface d(String str, f0 f0Var, AssetManager assetManager) {
        if (this.f12643b.containsKey(str)) {
            return f0Var.a(this.f12643b.get(str));
        }
        b bVar = this.f12642a.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f12642a.put(str, bVar);
        }
        int b11 = f0Var.b();
        Typeface a11 = bVar.a(b11);
        if (a11 == null) {
            Typeface a12 = a(str, b11, assetManager);
            bVar.b(b11, a12);
            return a12;
        }
        return a11;
    }

    public void e(String str, int i11, Typeface typeface) {
        if (typeface != null) {
            b bVar = this.f12642a.get(str);
            if (bVar == null) {
                bVar = new b();
                this.f12642a.put(str, bVar);
            }
            bVar.b(i11, typeface);
        }
    }
}