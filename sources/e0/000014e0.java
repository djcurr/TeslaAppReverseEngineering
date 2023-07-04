package com.bumptech.glide;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.d;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.a0;
import com.bumptech.glide.load.resource.bitmap.b0;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.r;
import com.bumptech.glide.load.resource.bitmap.t;
import com.bumptech.glide.load.resource.bitmap.v;
import com.bumptech.glide.load.resource.bitmap.x;
import com.bumptech.glide.load.resource.bitmap.y;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import na.a;
import na.b;
import na.d;
import na.e;
import na.f;
import na.k;
import na.s;
import na.u;
import na.v;
import na.w;
import na.x;
import oa.a;
import oa.b;
import oa.c;
import oa.d;
import oa.e;
import qa.a;
import va.p;

/* loaded from: classes.dex */
public class c implements ComponentCallbacks2 {

    /* renamed from: j */
    private static volatile c f10444j;

    /* renamed from: k */
    private static volatile boolean f10445k;

    /* renamed from: a */
    private final com.bumptech.glide.load.engine.j f10446a;

    /* renamed from: b */
    private final ka.e f10447b;

    /* renamed from: c */
    private final la.h f10448c;

    /* renamed from: d */
    private final e f10449d;

    /* renamed from: e */
    private final Registry f10450e;

    /* renamed from: f */
    private final ka.b f10451f;

    /* renamed from: g */
    private final p f10452g;

    /* renamed from: h */
    private final va.d f10453h;

    /* renamed from: i */
    private final List<k> f10454i = new ArrayList();

    /* loaded from: classes.dex */
    public interface a {
        com.bumptech.glide.request.h build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [com.bumptech.glide.load.resource.bitmap.h] */
    public c(Context context, com.bumptech.glide.load.engine.j jVar, la.h hVar, ka.e eVar, ka.b bVar, p pVar, va.d dVar, int i11, a aVar, Map<Class<?>, l<?, ?>> map, List<com.bumptech.glide.request.g<Object>> list, f fVar) {
        ha.f yVar;
        com.bumptech.glide.load.resource.bitmap.g gVar;
        g gVar2 = g.NORMAL;
        this.f10446a = jVar;
        this.f10447b = eVar;
        this.f10451f = bVar;
        this.f10448c = hVar;
        this.f10452g = pVar;
        this.f10453h = dVar;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f10450e = registry;
        registry.o(new DefaultImageHeaderParser());
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 27) {
            registry.o(new com.bumptech.glide.load.resource.bitmap.p());
        }
        List<ImageHeaderParser> g11 = registry.g();
        ta.a aVar2 = new ta.a(context, g11, eVar, bVar);
        ha.f<ParcelFileDescriptor, Bitmap> h11 = b0.h(eVar);
        m mVar = new m(registry.g(), resources.getDisplayMetrics(), eVar, bVar);
        if (fVar.a(d.b.class) && i12 >= 28) {
            yVar = new t();
            gVar = new com.bumptech.glide.load.resource.bitmap.h();
        } else {
            com.bumptech.glide.load.resource.bitmap.g gVar3 = new com.bumptech.glide.load.resource.bitmap.g(mVar);
            yVar = new y(mVar, bVar);
            gVar = gVar3;
        }
        ra.d dVar2 = new ra.d(context);
        s.c cVar = new s.c(resources);
        s.d dVar3 = new s.d(resources);
        s.b bVar2 = new s.b(resources);
        s.a aVar3 = new s.a(resources);
        com.bumptech.glide.load.resource.bitmap.c cVar2 = new com.bumptech.glide.load.resource.bitmap.c(bVar);
        ua.a aVar4 = new ua.a();
        ua.d dVar4 = new ua.d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.a(ByteBuffer.class, new na.c()).a(InputStream.class, new na.t(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, gVar).e("Bitmap", InputStream.class, Bitmap.class, yVar);
        if (ParcelFileDescriptorRewinder.b()) {
            registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new v(mVar));
        }
        registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, h11).e("Bitmap", AssetFileDescriptor.class, Bitmap.class, b0.c(eVar)).d(Bitmap.class, Bitmap.class, v.a.b()).e("Bitmap", Bitmap.class, Bitmap.class, new a0()).b(Bitmap.class, cVar2).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, gVar)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, yVar)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, h11)).b(BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.b(eVar, cVar2)).e("Gif", InputStream.class, ta.c.class, new ta.j(g11, aVar2, bVar)).e("Gif", ByteBuffer.class, ta.c.class, aVar2).b(ta.c.class, new ta.d()).d(fa.a.class, fa.a.class, v.a.b()).e("Bitmap", fa.a.class, Bitmap.class, new ta.h(eVar)).c(Uri.class, Drawable.class, dVar2).c(Uri.class, Bitmap.class, new x(dVar2, eVar)).p(new a.C1023a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new f.e()).c(File.class, File.class, new sa.a()).d(File.class, ParcelFileDescriptor.class, new f.b()).d(File.class, File.class, v.a.b()).p(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.b()) {
            registry.p(new ParcelFileDescriptorRewinder.a());
        }
        Class cls = Integer.TYPE;
        registry.d(cls, InputStream.class, cVar).d(cls, ParcelFileDescriptor.class, bVar2).d(Integer.class, InputStream.class, cVar).d(Integer.class, ParcelFileDescriptor.class, bVar2).d(Integer.class, Uri.class, dVar3).d(cls, AssetFileDescriptor.class, aVar3).d(Integer.class, AssetFileDescriptor.class, aVar3).d(cls, Uri.class, dVar3).d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new u.c()).d(String.class, ParcelFileDescriptor.class, new u.b()).d(String.class, AssetFileDescriptor.class, new u.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new b.a(context)).d(Uri.class, InputStream.class, new c.a(context));
        if (i12 >= 29) {
            registry.d(Uri.class, InputStream.class, new d.c(context));
            registry.d(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        registry.d(Uri.class, InputStream.class, new w.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver)).d(Uri.class, InputStream.class, new x.a()).d(URL.class, InputStream.class, new e.a()).d(Uri.class, File.class, new k.a(context)).d(na.g.class, InputStream.class, new a.C0840a()).d(byte[].class, ByteBuffer.class, new b.a()).d(byte[].class, InputStream.class, new b.d()).d(Uri.class, Uri.class, v.a.b()).d(Drawable.class, Drawable.class, v.a.b()).c(Drawable.class, Drawable.class, new ra.e()).q(Bitmap.class, BitmapDrawable.class, new ua.b(resources)).q(Bitmap.class, byte[].class, aVar4).q(Drawable.class, byte[].class, new ua.c(eVar, aVar4, dVar4)).q(ta.c.class, byte[].class, dVar4);
        if (i12 >= 23) {
            ha.f<ByteBuffer, Bitmap> d11 = b0.d(eVar);
            registry.c(ByteBuffer.class, Bitmap.class, d11);
            registry.c(ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.a(resources, d11));
        }
        this.f10449d = new e(context, bVar, registry, new ya.g(), aVar, map, list, jVar, fVar, i11);
    }

    public static k A(Activity activity) {
        return p(activity).j(activity);
    }

    @Deprecated
    public static k B(Fragment fragment) {
        return p(fragment.getActivity()).k(fragment);
    }

    public static k C(Context context) {
        return p(context).l(context);
    }

    public static k D(View view) {
        return p(view.getContext()).m(view);
    }

    public static k E(androidx.fragment.app.Fragment fragment) {
        return p(fragment.getContext()).n(fragment);
    }

    public static k F(androidx.fragment.app.h hVar) {
        return p(hVar).o(hVar);
    }

    private static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f10445k) {
            f10445k = true;
            s(context, generatedAppGlideModule);
            f10445k = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static void d() {
        r.b().j();
    }

    public static c e(Context context) {
        if (f10444j == null) {
            GeneratedAppGlideModule f11 = f(context.getApplicationContext());
            synchronized (c.class) {
                if (f10444j == null) {
                    a(context, f11);
                }
            }
        }
        return f10444j;
    }

    private static GeneratedAppGlideModule f(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e11) {
            x(e11);
            return null;
        } catch (InstantiationException e12) {
            x(e12);
            return null;
        } catch (NoSuchMethodException e13) {
            x(e13);
            return null;
        } catch (InvocationTargetException e14) {
            x(e14);
            return null;
        }
    }

    public static File l(Context context) {
        return m(context, "image_manager_disk_cache");
    }

    public static File m(Context context, String str) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            File file = new File(cacheDir, str);
            if (file.isDirectory() || file.mkdirs()) {
                return file;
            }
            return null;
        }
        if (Log.isLoggable("Glide", 6)) {
            Log.e("Glide", "default disk cache dir is null");
        }
        return null;
    }

    private static p p(Context context) {
        bb.j.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return e(context).o();
    }

    public static void q(Context context, d dVar) {
        GeneratedAppGlideModule f11 = f(context);
        synchronized (c.class) {
            if (f10444j != null) {
                w();
            }
            t(context, dVar, f11);
        }
    }

    @Deprecated
    public static synchronized void r(c cVar) {
        synchronized (c.class) {
            if (f10444j != null) {
                w();
            }
            f10444j = cVar;
        }
    }

    private static void s(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        t(context, new d(), generatedAppGlideModule);
    }

    private static void t(Context context, d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<wa.b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.isManifestParsingEnabled()) {
            emptyList = new wa.d(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.a().isEmpty()) {
            Set<Class<?>> a11 = generatedAppGlideModule.a();
            Iterator<wa.b> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                wa.b next = it2.next();
                if (a11.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it2.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<wa.b> it3 = emptyList.iterator();
            while (it3.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it3.next().getClass());
            }
        }
        dVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.b() : null);
        for (wa.b bVar : emptyList) {
            bVar.a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.applyOptions(applicationContext, dVar);
        }
        c a12 = dVar.a(applicationContext);
        for (wa.b bVar2 : emptyList) {
            try {
                bVar2.b(applicationContext, a12, a12.f10450e);
            } catch (AbstractMethodError e11) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + bVar2.getClass().getName(), e11);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.registerComponents(applicationContext, a12, a12.f10450e);
        }
        applicationContext.registerComponentCallbacks(a12);
        f10444j = a12;
    }

    public static void w() {
        synchronized (c.class) {
            if (f10444j != null) {
                f10444j.j().getApplicationContext().unregisterComponentCallbacks(f10444j);
                f10444j.f10446a.m();
            }
            f10444j = null;
        }
    }

    private static void x(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public void b() {
        bb.k.a();
        this.f10446a.e();
    }

    public void c() {
        bb.k.b();
        this.f10448c.d();
        this.f10447b.d();
        this.f10451f.d();
    }

    public ka.b g() {
        return this.f10451f;
    }

    public ka.e h() {
        return this.f10447b;
    }

    public va.d i() {
        return this.f10453h;
    }

    public Context j() {
        return this.f10449d.getBaseContext();
    }

    public e k() {
        return this.f10449d;
    }

    public Registry n() {
        return this.f10450e;
    }

    public p o() {
        return this.f10452g;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        c();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        y(i11);
    }

    public void u(k kVar) {
        synchronized (this.f10454i) {
            if (!this.f10454i.contains(kVar)) {
                this.f10454i.add(kVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public boolean v(ya.k<?> kVar) {
        synchronized (this.f10454i) {
            for (k kVar2 : this.f10454i) {
                if (kVar2.untrack(kVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void y(int i11) {
        bb.k.b();
        synchronized (this.f10454i) {
            for (k kVar : this.f10454i) {
                kVar.onTrimMemory(i11);
            }
        }
        this.f10448c.a(i11);
        this.f10447b.a(i11);
        this.f10451f.a(i11);
    }

    public void z(k kVar) {
        synchronized (this.f10454i) {
            if (this.f10454i.contains(kVar)) {
                this.f10454i.remove(kVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}