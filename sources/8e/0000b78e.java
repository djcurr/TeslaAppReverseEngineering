package u70;

import java.io.BufferedWriter;
import java.io.Writer;
import r70.m;

/* loaded from: classes5.dex */
public class d extends BufferedWriter {

    /* renamed from: a  reason: collision with root package name */
    private char[] f53365a;

    public d(Writer writer) {
        super(writer);
        this.f53365a = new char[64];
        m.d();
    }

    private void a(byte[] bArr) {
        char[] cArr;
        int i11;
        byte[] b11 = org.bouncycastle.util.encoders.a.b(bArr);
        int i12 = 0;
        while (i12 < b11.length) {
            int i13 = 0;
            while (true) {
                cArr = this.f53365a;
                if (i13 != cArr.length && (i11 = i12 + i13) < b11.length) {
                    cArr[i13] = (char) b11[i11];
                    i13++;
                }
            }
            write(cArr, 0, i13);
            newLine();
            i12 += this.f53365a.length;
        }
    }

    private void j(String str) {
        write("-----END " + str + "-----");
        newLine();
    }

    private void l(String str) {
        write("-----BEGIN " + str + "-----");
        newLine();
    }

    public void g(c cVar) {
        b generate = cVar.generate();
        l(generate.c());
        if (!generate.b().isEmpty()) {
            for (a aVar : generate.b()) {
                write(aVar.b());
                write(": ");
                write(aVar.c());
                newLine();
            }
            newLine();
        }
        a(generate.a());
        j(generate.c());
    }
}