package expo.modules.filesystem;

import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.g;
import okio.r;
import org.spongycastle.cms.CMSAttributeTableGenerator;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\n\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lexpo/modules/filesystem/CountingRequestBody;", "Lokhttp3/RequestBody;", "Lokhttp3/MediaType;", CMSAttributeTableGenerator.CONTENT_TYPE, "", "contentLength", "Lokio/g;", "sink", "Lvz/b0;", "writeTo", "requestBody", "Lokhttp3/RequestBody;", "Lexpo/modules/filesystem/CountingRequestListener;", "progressListener", "Lexpo/modules/filesystem/CountingRequestListener;", "<init>", "(Lokhttp3/RequestBody;Lexpo/modules/filesystem/CountingRequestListener;)V", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class CountingRequestBody extends RequestBody {
    private final CountingRequestListener progressListener;
    private final RequestBody requestBody;

    public CountingRequestBody(RequestBody requestBody, CountingRequestListener progressListener) {
        s.g(requestBody, "requestBody");
        s.g(progressListener, "progressListener");
        this.requestBody = requestBody;
        this.progressListener = progressListener;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.requestBody.contentLength();
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.requestBody.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(g sink) {
        s.g(sink, "sink");
        g c11 = r.c(new CountingSink(sink, this, this.progressListener));
        this.requestBody.writeTo(c11);
        c11.flush();
    }
}