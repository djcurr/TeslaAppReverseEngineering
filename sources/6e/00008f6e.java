package okhttp3.internal.ws;

import e00.b;
import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okio.c0;
import okio.f;
import okio.i;
import okio.j;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/ws/MessageDeflater;", "Ljava/io/Closeable;", "Lokio/f;", "Lokio/i;", "suffix", "", "endsWith", "buffer", "Lvz/b0;", "deflate", "close", "deflatedBytes", "Lokio/f;", "Ljava/util/zip/Deflater;", "deflater", "Ljava/util/zip/Deflater;", "Lokio/j;", "deflaterSink", "Lokio/j;", "noContextTakeover", "Z", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class MessageDeflater implements Closeable {
    private final f deflatedBytes;
    private final Deflater deflater;
    private final j deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z11) {
        this.noContextTakeover = z11;
        f fVar = new f();
        this.deflatedBytes = fVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new j((c0) fVar, deflater);
    }

    private final boolean endsWith(f fVar, i iVar) {
        return fVar.V(fVar.P0() - iVar.z(), iVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.deflaterSink.close();
    }

    public final void deflate(f buffer) {
        i iVar;
        s.g(buffer, "buffer");
        if (this.deflatedBytes.P0() == 0) {
            if (this.noContextTakeover) {
                this.deflater.reset();
            }
            this.deflaterSink.write(buffer, buffer.P0());
            this.deflaterSink.flush();
            f fVar = this.deflatedBytes;
            iVar = MessageDeflaterKt.EMPTY_DEFLATE_BLOCK;
            if (endsWith(fVar, iVar)) {
                long P0 = this.deflatedBytes.P0() - 4;
                f.a u02 = f.u0(this.deflatedBytes, null, 1, null);
                try {
                    u02.j(P0);
                    b.a(u02, null);
                } finally {
                }
            } else {
                this.deflatedBytes.O0(0);
            }
            f fVar2 = this.deflatedBytes;
            buffer.write(fVar2, fVar2.P0());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}