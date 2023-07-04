package qf;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class p implements pd.g {

    /* renamed from: a  reason: collision with root package name */
    private final pd.j f48101a;

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.imagepipeline.memory.g f48102b;

    public p(com.facebook.imagepipeline.memory.g gVar, pd.j jVar) {
        this.f48102b = gVar;
        this.f48101a = jVar;
    }

    o f(InputStream inputStream, MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream) {
        this.f48101a.a(inputStream, memoryPooledByteBufferOutputStream);
        return memoryPooledByteBufferOutputStream.a();
    }

    @Override // pd.g
    /* renamed from: g */
    public o a(InputStream inputStream) {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f48102b);
        try {
            return f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // pd.g
    /* renamed from: h */
    public o b(InputStream inputStream, int i11) {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f48102b, i11);
        try {
            return f(inputStream, memoryPooledByteBufferOutputStream);
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // pd.g
    /* renamed from: i */
    public o d(byte[] bArr) {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.f48102b, bArr.length);
        try {
            try {
                memoryPooledByteBufferOutputStream.write(bArr, 0, bArr.length);
                return memoryPooledByteBufferOutputStream.a();
            } catch (IOException e11) {
                throw md.p.a(e11);
            }
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    @Override // pd.g
    /* renamed from: j */
    public MemoryPooledByteBufferOutputStream c() {
        return new MemoryPooledByteBufferOutputStream(this.f48102b);
    }

    @Override // pd.g
    /* renamed from: k */
    public MemoryPooledByteBufferOutputStream e(int i11) {
        return new MemoryPooledByteBufferOutputStream(this.f48102b, i11);
    }
}