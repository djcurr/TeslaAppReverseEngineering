package pd;

import java.io.InputStream;
import java.io.OutputStream;
import md.k;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private final int f46432a;

    /* renamed from: b  reason: collision with root package name */
    private final a f46433b;

    public j(a aVar) {
        this(aVar, 16384);
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = this.f46433b.get(this.f46432a);
        long j11 = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f46432a);
                if (read == -1) {
                    return j11;
                }
                outputStream.write(bArr, 0, read);
                j11 += read;
            } finally {
                this.f46433b.a(bArr);
            }
        }
    }

    public j(a aVar, int i11) {
        k.b(Boolean.valueOf(i11 > 0));
        this.f46432a = i11;
        this.f46433b = aVar;
    }
}