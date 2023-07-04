package nz;

import io.sentry.d0;
import io.sentry.f3;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes5.dex */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f41996a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f41997b;

    public e(String str, d0 d0Var) {
        this.f41996a = str;
        this.f41997b = d0Var;
    }

    public Properties a() {
        try {
            File file = new File(this.f41996a);
            if (file.isFile() && file.canRead()) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                bufferedInputStream.close();
                return properties;
            }
            return null;
        } catch (IOException e11) {
            this.f41997b.a(f3.ERROR, e11, "Failed to load Sentry configuration from file: %s", this.f41996a);
            return null;
        }
    }
}