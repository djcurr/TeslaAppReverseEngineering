package u30;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public class d {
    static {
        char c11 = File.separatorChar;
        v30.a aVar = new v30.a(4);
        try {
            PrintWriter printWriter = new PrintWriter(aVar);
            printWriter.println();
            aVar.toString();
            printWriter.close();
            aVar.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    aVar.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public static int a(InputStream inputStream, OutputStream outputStream) {
        long e11 = e(inputStream, outputStream);
        if (e11 > 2147483647L) {
            return -1;
        }
        return (int) e11;
    }

    public static int b(Reader reader, Writer writer) {
        long g11 = g(reader, writer);
        if (g11 > 2147483647L) {
            return -1;
        }
        return (int) g11;
    }

    public static long c(InputStream inputStream, OutputStream outputStream, int i11) {
        return f(inputStream, outputStream, new byte[i11]);
    }

    public static void d(InputStream inputStream, Writer writer, Charset charset) {
        b(new InputStreamReader(inputStream, a.a(charset)), writer);
    }

    public static long e(InputStream inputStream, OutputStream outputStream) {
        return c(inputStream, outputStream, 4096);
    }

    public static long f(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        long j11 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j11;
            }
            outputStream.write(bArr, 0, read);
            j11 += read;
        }
    }

    public static long g(Reader reader, Writer writer) {
        return h(reader, writer, new char[4096]);
    }

    public static long h(Reader reader, Writer writer, char[] cArr) {
        long j11 = 0;
        while (true) {
            int read = reader.read(cArr);
            if (-1 == read) {
                return j11;
            }
            writer.write(cArr, 0, read);
            j11 += read;
        }
    }

    @Deprecated
    public static String i(InputStream inputStream) {
        return j(inputStream, Charset.defaultCharset());
    }

    public static String j(InputStream inputStream, Charset charset) {
        v30.a aVar = new v30.a();
        try {
            d(inputStream, aVar, charset);
            String aVar2 = aVar.toString();
            aVar.close();
            return aVar2;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    aVar.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }
}