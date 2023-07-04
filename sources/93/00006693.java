package e00;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import u20.n;
import vz.b0;

/* loaded from: classes5.dex */
public final class l {
    public static final long a(Reader reader, Writer out, int i11) {
        s.g(reader, "<this>");
        s.g(out, "out");
        char[] cArr = new char[i11];
        int read = reader.read(cArr);
        long j11 = 0;
        while (read >= 0) {
            out.write(cArr, 0, read);
            j11 += read;
            read = reader.read(cArr);
        }
        return j11;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = PKIFailureInfo.certRevoked;
        }
        return a(reader, writer, i11);
    }

    public static final void c(Reader reader, h00.l<? super String, b0> action) {
        s.g(reader, "<this>");
        s.g(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, PKIFailureInfo.certRevoked);
        try {
            for (String str : d(bufferedReader)) {
                action.invoke(str);
            }
            b0 b0Var = b0.f54756a;
            b.a(bufferedReader, null);
        } finally {
        }
    }

    public static final u20.h<String> d(BufferedReader bufferedReader) {
        u20.h<String> d11;
        s.g(bufferedReader, "<this>");
        d11 = n.d(new k(bufferedReader));
        return d11;
    }

    public static final String e(Reader reader) {
        s.g(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        s.f(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}