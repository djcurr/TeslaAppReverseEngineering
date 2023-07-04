package e00;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;
import wz.o;

/* loaded from: classes5.dex */
public class h extends g {

    /* loaded from: classes5.dex */
    public static final class a extends u implements h00.l<String, b0> {

        /* renamed from: a */
        final /* synthetic */ ArrayList<String> f24396a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList<String> arrayList) {
            super(1);
            this.f24396a = arrayList;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(String str) {
            invoke2(str);
            return b0.f54756a;
        }

        /* renamed from: invoke */
        public final void invoke2(String it2) {
            s.g(it2, "it");
            this.f24396a.add(it2);
        }
    }

    public static final void a(File file, Charset charset, h00.l<? super String, b0> action) {
        s.g(file, "<this>");
        s.g(charset, "charset");
        s.g(action, "action");
        l.c(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static byte[] b(File file) {
        s.g(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= 2147483647L) {
                int i11 = (int) length;
                byte[] bArr = new byte[i11];
                int i12 = i11;
                int i13 = 0;
                while (i12 > 0) {
                    int read = fileInputStream.read(bArr, i13, i12);
                    if (read < 0) {
                        break;
                    }
                    i12 -= read;
                    i13 += read;
                }
                if (i12 > 0) {
                    bArr = Arrays.copyOf(bArr, i13);
                    s.f(bArr, "copyOf(this, newSize)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        d dVar = new d(8193);
                        dVar.write(read2);
                        e00.a.b(fileInputStream, dVar, 0, 2, null);
                        int size = dVar.size() + i11;
                        if (size >= 0) {
                            byte[] a11 = dVar.a();
                            byte[] copyOf = Arrays.copyOf(bArr, size);
                            s.f(copyOf, "copyOf(this, newSize)");
                            bArr = o.f(a11, copyOf, i11, 0, dVar.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                b.a(fileInputStream, null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static final List<String> c(File file, Charset charset) {
        s.g(file, "<this>");
        s.g(charset, "charset");
        ArrayList arrayList = new ArrayList();
        a(file, charset, new a(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List d(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = kotlin.text.d.f35187b;
        }
        return c(file, charset);
    }

    public static final String e(File file, Charset charset) {
        s.g(file, "<this>");
        s.g(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String e11 = l.e(inputStreamReader);
            b.a(inputStreamReader, null);
            return e11;
        } finally {
        }
    }

    public static /* synthetic */ String f(File file, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = kotlin.text.d.f35187b;
        }
        return e(file, charset);
    }

    public static final void g(File file, byte[] array) {
        s.g(file, "<this>");
        s.g(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            b0 b0Var = b0.f54756a;
            b.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void h(File file, String text, Charset charset) {
        s.g(file, "<this>");
        s.g(text, "text");
        s.g(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        s.f(bytes, "this as java.lang.String).getBytes(charset)");
        g(file, bytes);
    }

    public static /* synthetic */ void i(File file, String str, Charset charset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = kotlin.text.d.f35187b;
        }
        h(file, str, charset);
    }
}