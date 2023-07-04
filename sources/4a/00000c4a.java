package bb;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes.dex */
public final class d extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    private static final Queue<d> f7571c = k.f(0);

    /* renamed from: a  reason: collision with root package name */
    private InputStream f7572a;

    /* renamed from: b  reason: collision with root package name */
    private IOException f7573b;

    d() {
    }

    public static d g(InputStream inputStream) {
        d poll;
        Queue<d> queue = f7571c;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.j(inputStream);
        return poll;
    }

    public IOException a() {
        return this.f7573b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f7572a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7572a.close();
    }

    void j(InputStream inputStream) {
        this.f7572a = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f7572a.mark(i11);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f7572a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f7572a.read();
        } catch (IOException e11) {
            this.f7573b = e11;
            throw e11;
        }
    }

    public void release() {
        this.f7573b = null;
        this.f7572a = null;
        Queue<d> queue = f7571c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f7572a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        try {
            return this.f7572a.skip(j11);
        } catch (IOException e11) {
            this.f7573b = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f7572a.read(bArr);
        } catch (IOException e11) {
            this.f7573b = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        try {
            return this.f7572a.read(bArr, i11, i12);
        } catch (IOException e11) {
            this.f7573b = e11;
            throw e11;
        }
    }
}