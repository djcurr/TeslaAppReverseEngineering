package net.time4j.i18n;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;

/* loaded from: classes5.dex */
class g extends Reader {

    /* renamed from: a  reason: collision with root package name */
    private final PushbackInputStream f41450a;

    /* renamed from: b  reason: collision with root package name */
    private BufferedReader f41451b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(InputStream inputStream) {
        this.f41450a = new PushbackInputStream(inputStream, 3);
    }

    private void a() {
        if (this.f41451b != null) {
            return;
        }
        byte[] bArr = new byte[3];
        int read = this.f41450a.read(bArr, 0, 3);
        boolean z11 = true;
        if (read != 3 || bArr[0] != -17 || bArr[1] != -69 || bArr[2] != -65) {
            z11 = false;
        }
        if (!z11 && read > 0) {
            this.f41450a.unread(bArr, 0, read);
        }
        this.f41451b = new BufferedReader(new InputStreamReader(this.f41450a, "UTF-8"));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        BufferedReader bufferedReader = this.f41451b;
        if (bufferedReader == null) {
            this.f41450a.close();
        } else {
            bufferedReader.close();
        }
    }

    public String g() {
        a();
        return this.f41451b.readLine();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i11, int i12) {
        a();
        return this.f41451b.read(cArr, i11, i12);
    }

    @Override // java.io.Reader
    public boolean ready() {
        a();
        return this.f41451b.ready();
    }
}