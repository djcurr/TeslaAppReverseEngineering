package okhttp3.internal.cache;

import com.stripe.android.model.Stripe3ds2AuthParams;
import h00.l;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okio.c0;
import okio.f;
import okio.k;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR%\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Lokio/k;", "Lokio/f;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "byteCount", "Lvz/b0;", "write", "flush", "close", "", "hasErrors", "Z", "Lkotlin/Function1;", "Ljava/io/IOException;", "onException", "Lh00/l;", "getOnException", "()Lh00/l;", "Lokio/c0;", "delegate", "<init>", "(Lokio/c0;Lh00/l;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public class FaultHidingSink extends k {
    private boolean hasErrors;
    private final l<IOException, b0> onException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(c0 delegate, l<? super IOException, b0> onException) {
        super(delegate);
        s.g(delegate, "delegate");
        s.g(onException, "onException");
        this.onException = onException;
    }

    @Override // okio.k, okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.close();
        } catch (IOException e11) {
            this.hasErrors = true;
            this.onException.invoke(e11);
        }
    }

    @Override // okio.k, okio.c0, java.io.Flushable
    public void flush() {
        if (this.hasErrors) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e11) {
            this.hasErrors = true;
            this.onException.invoke(e11);
        }
    }

    public final l<IOException, b0> getOnException() {
        return this.onException;
    }

    @Override // okio.k, okio.c0
    public void write(f source, long j11) {
        s.g(source, "source");
        if (this.hasErrors) {
            source.skip(j11);
            return;
        }
        try {
            super.write(source, j11);
        } catch (IOException e11) {
            this.hasErrors = true;
            this.onException.invoke(e11);
        }
    }
}