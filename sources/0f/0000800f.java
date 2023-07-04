package kotlinx.coroutines.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f35484a = new l();

    private l() {
    }

    private final <S> S a(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> b(Class<S> cls, ClassLoader classLoader) {
        List<S> O0;
        try {
            return d(cls, classLoader);
        } catch (Throwable unused) {
            O0 = wz.e0.O0(ServiceLoader.load(cls, classLoader));
            return O0;
        }
    }

    private final List<String> e(URL url) {
        boolean H;
        String P0;
        String W0;
        String P02;
        String url2 = url.toString();
        H = kotlin.text.v.H(url2, "jar", false, 2, null);
        if (H) {
            P0 = kotlin.text.w.P0(url2, "jar:file:", null, 2, null);
            W0 = kotlin.text.w.W0(P0, '!', null, 2, null);
            P02 = kotlin.text.w.P0(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(W0, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(P02)), "UTF-8"));
                List<String> f11 = f35484a.f(bufferedReader);
                e00.b.a(bufferedReader, null);
                jarFile.close();
                return f11;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        jarFile.close();
                        throw th3;
                    } catch (Throwable th4) {
                        vz.f.a(th2, th4);
                        throw th2;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(FirebasePerfUrlConnection.openStream(url)));
        try {
            List<String> f12 = f35484a.f(bufferedReader2);
            e00.b.a(bufferedReader2, null);
            return f12;
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                e00.b.a(bufferedReader2, th5);
                throw th6;
            }
        }
    }

    private final List<String> f(BufferedReader bufferedReader) {
        List<String> O0;
        String X0;
        CharSequence d12;
        boolean z11;
        boolean z12;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                O0 = wz.e0.O0(linkedHashSet);
                return O0;
            }
            X0 = kotlin.text.w.X0(readLine, "#", null, 2, null);
            d12 = kotlin.text.w.d1(X0);
            String obj = d12.toString();
            int i11 = 0;
            while (true) {
                if (i11 >= obj.length()) {
                    z11 = true;
                    break;
                }
                char charAt = obj.charAt(i11);
                i11++;
                if (charAt == '.' || Character.isJavaIdentifierPart(charAt)) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                if (!z12) {
                    z11 = false;
                    break;
                }
            }
            if (z11) {
                if (obj.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Illegal service provider class name: ", obj).toString());
            }
        }
    }

    public final List<MainDispatcherFactory> c() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!m.a()) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory != null) {
                arrayList.add(mainDispatcherFactory);
            }
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return b(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    public final <S> List<S> d(Class<S> cls, ClassLoader classLoader) {
        Set<String> S0;
        int t11;
        ArrayList<URL> list = Collections.list(classLoader.getResources(kotlin.jvm.internal.s.p("META-INF/services/", cls.getName())));
        kotlin.jvm.internal.s.f(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            wz.b0.z(arrayList, f35484a.e(url));
        }
        S0 = wz.e0.S0(arrayList);
        if (!S0.isEmpty()) {
            t11 = wz.x.t(S0, 10);
            ArrayList arrayList2 = new ArrayList(t11);
            for (String str : S0) {
                arrayList2.add(f35484a.a(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}