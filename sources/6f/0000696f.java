package expo.modules.filesystem;

import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okhttp3.RequestBody;
import okio.c0;
import okio.f;
import okio.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lexpo/modules/filesystem/CountingSink;", "Lokio/k;", "Lokio/f;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "byteCount", "Lvz/b0;", "write", "Lokhttp3/RequestBody;", "requestBody", "Lokhttp3/RequestBody;", "Lexpo/modules/filesystem/CountingRequestListener;", "progressListener", "Lexpo/modules/filesystem/CountingRequestListener;", "bytesWritten", "J", "Lokio/c0;", "sink", "<init>", "(Lokio/c0;Lokhttp3/RequestBody;Lexpo/modules/filesystem/CountingRequestListener;)V", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
final class CountingSink extends k {
    private long bytesWritten;
    private final CountingRequestListener progressListener;
    private final RequestBody requestBody;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountingSink(c0 sink, RequestBody requestBody, CountingRequestListener progressListener) {
        super(sink);
        s.g(sink, "sink");
        s.g(requestBody, "requestBody");
        s.g(progressListener, "progressListener");
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }

    @Override // okio.k, okio.c0
    public void write(f source, long j11) {
        s.g(source, "source");
        super.write(source, j11);
        long j12 = this.bytesWritten + j11;
        this.bytesWritten = j12;
        this.progressListener.onProgress(j12, this.requestBody.contentLength());
    }
}