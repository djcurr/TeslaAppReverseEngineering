package vw;

import ezvcard.util.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* loaded from: classes5.dex */
public final class a {
    static {
        Properties properties = new Properties();
        InputStream inputStream = null;
        try {
            try {
                inputStream = a.class.getResourceAsStream("ez-vcard.properties");
                properties.load(inputStream);
                f.a(inputStream);
                properties.getProperty("version");
                properties.getProperty("groupId");
                properties.getProperty("artifactId");
                properties.getProperty("url");
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        } catch (Throwable th2) {
            f.a(inputStream);
            throw th2;
        }
    }

    private a() {
    }

    public static xw.b<xw.b<?>> a(InputStream inputStream) {
        return new xw.b<>(inputStream);
    }
}