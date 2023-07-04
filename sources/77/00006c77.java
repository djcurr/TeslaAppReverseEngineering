package ezvcard.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;

/* loaded from: classes5.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final File f25455a;

    /* renamed from: b  reason: collision with root package name */
    private final InputStream f25456b;

    /* renamed from: c  reason: collision with root package name */
    private final Reader f25457c;

    public e(InputStream inputStream) {
        this(null, inputStream, null);
    }

    private InputStream b() {
        InputStream inputStream = this.f25456b;
        return inputStream == null ? new BufferedInputStream(new FileInputStream(this.f25455a)) : inputStream;
    }

    private byte[] c(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    inputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Throwable th2) {
                inputStream.close();
                throw th2;
            }
        }
    }

    public byte[] a() {
        if (this.f25457c == null) {
            return c(b());
        }
        throw new IllegalStateException("Cannot get raw bytes from a Reader object.");
    }

    private e(File file, InputStream inputStream, Reader reader) {
        this.f25455a = file;
        this.f25456b = inputStream;
        this.f25457c = reader;
    }
}