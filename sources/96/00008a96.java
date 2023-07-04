package net.time4j.base;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ServiceLoader;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f40834a;

    /* renamed from: b  reason: collision with root package name */
    private static final d f40835b;

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f40836c;

    /* loaded from: classes5.dex */
    private static class a extends d {
        a() {
            if (d.f40834a) {
                throw new IllegalStateException("The module time4j-android is not active. Check your configuration.");
            }
        }

        @Override // net.time4j.base.d
        public InputStream e(URI uri, boolean z11) {
            if (uri != null && !d.f40836c) {
                try {
                    URL url = uri.toURL();
                    if (z11) {
                        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection());
                        uRLConnection.setUseCaches(false);
                        uRLConnection.connect();
                        return uRLConnection.getInputStream();
                    }
                    return FirebasePerfUrlConnection.openStream(url);
                } catch (IOException e11) {
                    if (uri.toString().contains(".repository")) {
                        PrintStream printStream = System.err;
                        printStream.println("Warning: Loading of resource " + uri + " failed (" + e11.getMessage() + "). Consider setting the system property \"net.time4j.base.useClassloaderOnly\" for reducing overhead.");
                        e11.printStackTrace(System.err);
                    }
                }
            }
            return null;
        }

        @Override // net.time4j.base.d
        public URI f(String str, Class<?> cls, String str2) {
            String str3;
            try {
                try {
                    ProtectionDomain protectionDomain = cls.getProtectionDomain();
                    CodeSource codeSource = protectionDomain == null ? null : protectionDomain.getCodeSource();
                    if (codeSource != null) {
                        String externalForm = codeSource.getLocation().toExternalForm();
                        try {
                            if (externalForm.endsWith(".jar")) {
                                externalForm = "jar:" + externalForm + "!/";
                            }
                            str3 = externalForm + str2;
                            return new URI(str3);
                        } catch (URISyntaxException unused) {
                            System.err.println("Warning: malformed resource path = " + str3);
                            return null;
                        }
                    }
                } catch (URISyntaxException unused2) {
                    str3 = null;
                }
            } catch (SecurityException unused3) {
            }
            return null;
        }

        @Override // net.time4j.base.d
        public <S> Iterable<S> g(Class<S> cls) {
            return ServiceLoader.load(cls, cls.getClassLoader());
        }
    }

    static {
        boolean equalsIgnoreCase = "Dalvik".equalsIgnoreCase(System.getProperty("java.vm.name"));
        f40834a = equalsIgnoreCase;
        f40836c = !equalsIgnoreCase && Boolean.getBoolean("net.time4j.base.useClassloaderOnly");
        String property = System.getProperty("net.time4j.base.ResourceLoader");
        if (property == null) {
            f40835b = new a();
            return;
        }
        try {
            f40835b = (d) Class.forName(property).newInstance();
        } catch (Exception e11) {
            throw new AssertionError("Wrong configuration of external resource loader: " + e11.getMessage());
        }
    }

    public static d c() {
        return f40835b;
    }

    public final InputStream d(Class<?> cls, String str, boolean z11) {
        if (!f40834a) {
            URL resource = cls.getClassLoader().getResource(str);
            if (resource != null) {
                if (z11) {
                    URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(resource.openConnection());
                    uRLConnection.setUseCaches(false);
                    uRLConnection.connect();
                    return uRLConnection.getInputStream();
                }
                return FirebasePerfUrlConnection.openStream(resource);
            }
            throw new FileNotFoundException(str);
        }
        throw new FileNotFoundException(str);
    }

    public abstract InputStream e(URI uri, boolean z11);

    public abstract URI f(String str, Class<?> cls, String str2);

    public abstract <S> Iterable<S> g(Class<S> cls);
}