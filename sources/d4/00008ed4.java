package okhttp3.internal.connection;

import com.stripe.android.core.networking.NetworkConstantsKt;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.ws.RealWebSocket;
import okio.c0;
import okio.e0;
import okio.f;
import okio.k;
import okio.l;
import okio.r;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002HIB'\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00108\u001a\u000207\u0012\u0006\u0010=\u001a\u00020<\u0012\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bF\u0010GJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0006\u0010\u000f\u001a\u00020\u0004J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u0004J\u0006\u0010\u001e\u001a\u00020\u0004J\u0006\u0010\u001f\u001a\u00020\u0004J9\u0010%\u001a\u00028\u0000\"\n\b\u0000\u0010 *\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b%\u0010&J\u0006\u0010'\u001a\u00020\u0004R$\u0010)\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010.\u001a\u00020-8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u00103\u001a\u0002028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u00108\u001a\u0002078\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001c\u0010=\u001a\u00020<8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020\t8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010,¨\u0006J"}, d2 = {"Lokhttp3/internal/connection/Exchange;", "", "Ljava/io/IOException;", "e", "Lvz/b0;", "trackFailure", "Lokhttp3/Request;", "request", "writeRequestHeaders", "", "duplex", "Lokio/c0;", "createRequestBody", "flushRequest", "finishRequest", "responseHeadersStart", "expectContinue", "Lokhttp3/Response$Builder;", "readResponseHeaders", "Lokhttp3/Response;", "response", "responseHeadersEnd", "Lokhttp3/ResponseBody;", "openResponseBody", "Lokhttp3/Headers;", "trailers", "Lokhttp3/internal/ws/RealWebSocket$Streams;", "newWebSocketStreams", "webSocketUpgradeFailed", "noNewExchangesOnConnection", "cancel", "detachWithViolence", "E", "", "bytesRead", "responseDone", "requestDone", "bodyComplete", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "noRequestBody", "<set-?>", "isDuplex", "Z", "isDuplex$okhttp", "()Z", "Lokhttp3/internal/connection/RealConnection;", "connection", "Lokhttp3/internal/connection/RealConnection;", "getConnection$okhttp", "()Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "getEventListener$okhttp", "()Lokhttp3/EventListener;", "Lokhttp3/internal/connection/ExchangeFinder;", "finder", "Lokhttp3/internal/connection/ExchangeFinder;", "getFinder$okhttp", "()Lokhttp3/internal/connection/ExchangeFinder;", "Lokhttp3/internal/http/ExchangeCodec;", "codec", "Lokhttp3/internal/http/ExchangeCodec;", "isCoalescedConnection$okhttp", "isCoalescedConnection", "<init>", "(Lokhttp3/internal/connection/RealCall;Lokhttp3/EventListener;Lokhttp3/internal/connection/ExchangeFinder;Lokhttp3/internal/http/ExchangeCodec;)V", "RequestBodySink", "ResponseBodySource", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class Exchange {
    private final RealCall call;
    private final ExchangeCodec codec;
    private final RealConnection connection;
    private final EventListener eventListener;
    private final ExchangeFinder finder;
    private boolean isDuplex;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/connection/Exchange$RequestBodySink;", "Lokio/k;", "Ljava/io/IOException;", "E", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lokio/f;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "byteCount", "Lvz/b0;", "write", "flush", "close", "", "completed", "Z", "bytesReceived", "J", "closed", "contentLength", "Lokio/c0;", "delegate", "<init>", "(Lokhttp3/internal/connection/Exchange;Lokio/c0;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    private final class RequestBodySink extends k {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestBodySink(Exchange exchange, c0 delegate, long j11) {
            super(delegate);
            s.g(delegate, "delegate");
            this.this$0 = exchange;
            this.contentLength = j11;
        }

        private final <E extends IOException> E complete(E e11) {
            if (this.completed) {
                return e11;
            }
            this.completed = true;
            return (E) this.this$0.bodyComplete(this.bytesReceived, false, true, e11);
        }

        @Override // okio.k, okio.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            long j11 = this.contentLength;
            if (j11 != -1 && this.bytesReceived != j11) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                complete(null);
            } catch (IOException e11) {
                throw complete(e11);
            }
        }

        @Override // okio.k, okio.c0, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e11) {
                throw complete(e11);
            }
        }

        @Override // okio.k, okio.c0
        public void write(f source, long j11) {
            s.g(source, "source");
            if (!this.closed) {
                long j12 = this.contentLength;
                if (j12 != -1 && this.bytesReceived + j11 > j12) {
                    throw new ProtocolException("expected " + this.contentLength + " bytes but received " + (this.bytesReceived + j11));
                }
                try {
                    super.write(source, j11);
                    this.bytesReceived += j11;
                    return;
                } catch (IOException e11) {
                    throw complete(e11);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/connection/Exchange$ResponseBodySource;", "Lokio/l;", "Lokio/f;", "sink", "", "byteCount", "read", "Lvz/b0;", "close", "Ljava/io/IOException;", "E", "e", "complete", "(Ljava/io/IOException;)Ljava/io/IOException;", "bytesReceived", "J", "", "invokeStartEvent", "Z", "completed", "closed", "contentLength", "Lokio/e0;", "delegate", "<init>", "(Lokhttp3/internal/connection/Exchange;Lokio/e0;J)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public final class ResponseBodySource extends l {
        private long bytesReceived;
        private boolean closed;
        private boolean completed;
        private final long contentLength;
        private boolean invokeStartEvent;
        final /* synthetic */ Exchange this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResponseBodySource(Exchange exchange, e0 delegate, long j11) {
            super(delegate);
            s.g(delegate, "delegate");
            this.this$0 = exchange;
            this.contentLength = j11;
            this.invokeStartEvent = true;
            if (j11 == 0) {
                complete(null);
            }
        }

        @Override // okio.l, okio.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            try {
                super.close();
                complete(null);
            } catch (IOException e11) {
                throw complete(e11);
            }
        }

        public final <E extends IOException> E complete(E e11) {
            if (this.completed) {
                return e11;
            }
            this.completed = true;
            if (e11 == null && this.invokeStartEvent) {
                this.invokeStartEvent = false;
                this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
            }
            return (E) this.this$0.bodyComplete(this.bytesReceived, true, false, e11);
        }

        @Override // okio.l, okio.e0
        public long read(f sink, long j11) {
            s.g(sink, "sink");
            if (!this.closed) {
                try {
                    long read = delegate().read(sink, j11);
                    if (this.invokeStartEvent) {
                        this.invokeStartEvent = false;
                        this.this$0.getEventListener$okhttp().responseBodyStart(this.this$0.getCall$okhttp());
                    }
                    if (read == -1) {
                        complete(null);
                        return -1L;
                    }
                    long j12 = this.bytesReceived + read;
                    long j13 = this.contentLength;
                    if (j13 != -1 && j12 > j13) {
                        throw new ProtocolException("expected " + this.contentLength + " bytes but received " + j12);
                    }
                    this.bytesReceived = j12;
                    if (j12 == j13) {
                        complete(null);
                    }
                    return read;
                } catch (IOException e11) {
                    throw complete(e11);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public Exchange(RealCall call, EventListener eventListener, ExchangeFinder finder, ExchangeCodec codec) {
        s.g(call, "call");
        s.g(eventListener, "eventListener");
        s.g(finder, "finder");
        s.g(codec, "codec");
        this.call = call;
        this.eventListener = eventListener;
        this.finder = finder;
        this.codec = codec;
        this.connection = codec.getConnection();
    }

    private final void trackFailure(IOException iOException) {
        this.finder.trackFailure(iOException);
        this.codec.getConnection().trackFailure$okhttp(this.call, iOException);
    }

    public final <E extends IOException> E bodyComplete(long j11, boolean z11, boolean z12, E e11) {
        if (e11 != null) {
            trackFailure(e11);
        }
        if (z12) {
            if (e11 != null) {
                this.eventListener.requestFailed(this.call, e11);
            } else {
                this.eventListener.requestBodyEnd(this.call, j11);
            }
        }
        if (z11) {
            if (e11 != null) {
                this.eventListener.responseFailed(this.call, e11);
            } else {
                this.eventListener.responseBodyEnd(this.call, j11);
            }
        }
        return (E) this.call.messageDone$okhttp(this, z12, z11, e11);
    }

    public final void cancel() {
        this.codec.cancel();
    }

    public final c0 createRequestBody(Request request, boolean z11) {
        s.g(request, "request");
        this.isDuplex = z11;
        RequestBody body = request.body();
        s.e(body);
        long contentLength = body.contentLength();
        this.eventListener.requestBodyStart(this.call);
        return new RequestBodySink(this, this.codec.createRequestBody(request, contentLength), contentLength);
    }

    public final void detachWithViolence() {
        this.codec.cancel();
        this.call.messageDone$okhttp(this, true, true, null);
    }

    public final void finishRequest() {
        try {
            this.codec.finishRequest();
        } catch (IOException e11) {
            this.eventListener.requestFailed(this.call, e11);
            trackFailure(e11);
            throw e11;
        }
    }

    public final void flushRequest() {
        try {
            this.codec.flushRequest();
        } catch (IOException e11) {
            this.eventListener.requestFailed(this.call, e11);
            trackFailure(e11);
            throw e11;
        }
    }

    public final RealCall getCall$okhttp() {
        return this.call;
    }

    public final RealConnection getConnection$okhttp() {
        return this.connection;
    }

    public final EventListener getEventListener$okhttp() {
        return this.eventListener;
    }

    public final ExchangeFinder getFinder$okhttp() {
        return this.finder;
    }

    public final boolean isCoalescedConnection$okhttp() {
        return !s.c(this.finder.getAddress$okhttp().url().host(), this.connection.route().address().url().host());
    }

    public final boolean isDuplex$okhttp() {
        return this.isDuplex;
    }

    public final RealWebSocket.Streams newWebSocketStreams() {
        this.call.timeoutEarlyExit();
        return this.codec.getConnection().newWebSocketStreams$okhttp(this);
    }

    public final void noNewExchangesOnConnection() {
        this.codec.getConnection().noNewExchanges$okhttp();
    }

    public final void noRequestBody() {
        this.call.messageDone$okhttp(this, true, false, null);
    }

    public final ResponseBody openResponseBody(Response response) {
        s.g(response, "response");
        try {
            String header$default = Response.header$default(response, NetworkConstantsKt.HEADER_CONTENT_TYPE, null, 2, null);
            long reportedContentLength = this.codec.reportedContentLength(response);
            return new RealResponseBody(header$default, reportedContentLength, r.d(new ResponseBodySource(this, this.codec.openResponseBodySource(response), reportedContentLength)));
        } catch (IOException e11) {
            this.eventListener.responseFailed(this.call, e11);
            trackFailure(e11);
            throw e11;
        }
    }

    public final Response.Builder readResponseHeaders(boolean z11) {
        try {
            Response.Builder readResponseHeaders = this.codec.readResponseHeaders(z11);
            if (readResponseHeaders != null) {
                readResponseHeaders.initExchange$okhttp(this);
            }
            return readResponseHeaders;
        } catch (IOException e11) {
            this.eventListener.responseFailed(this.call, e11);
            trackFailure(e11);
            throw e11;
        }
    }

    public final void responseHeadersEnd(Response response) {
        s.g(response, "response");
        this.eventListener.responseHeadersEnd(this.call, response);
    }

    public final void responseHeadersStart() {
        this.eventListener.responseHeadersStart(this.call);
    }

    public final Headers trailers() {
        return this.codec.trailers();
    }

    public final void webSocketUpgradeFailed() {
        bodyComplete(-1L, true, true, null);
    }

    public final void writeRequestHeaders(Request request) {
        s.g(request, "request");
        try {
            this.eventListener.requestHeadersStart(this.call);
            this.codec.writeRequestHeaders(request);
            this.eventListener.requestHeadersEnd(this.call, request);
        } catch (IOException e11) {
            this.eventListener.requestFailed(this.call, e11);
            trackFailure(e11);
            throw e11;
        }
    }
}