package nz;

import io.sentry.d0;
import io.sentry.f3;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* loaded from: classes5.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f41992a;

    /* renamed from: b  reason: collision with root package name */
    private final ClassLoader f41993b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f41994c;

    public b(String str, ClassLoader classLoader, d0 d0Var) {
        this.f41992a = str;
        this.f41993b = classLoader;
        this.f41994c = d0Var;
    }

    public Properties a() {
        try {
            InputStream resourceAsStream = this.f41993b.getResourceAsStream(this.f41992a);
            if (resourceAsStream == null) {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                resourceAsStream.close();
                return properties;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            this.f41994c.a(f3.ERROR, e11, "Failed to load Sentry configuration from classpath resource: %s", this.f41992a);
            return null;
        }
    }

    public b(d0 d0Var) {
        this("sentry.properties", b.class.getClassLoader(), d0Var);
    }
}