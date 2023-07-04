package okhttp3.internal.http2;

import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okio.f;
import okio.g;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001@B\u0017\u0012\u0006\u0010;\u001a\u00020:\u0012\u0006\u0010=\u001a\u00020\u0016¢\u0006\u0004\b>\u0010?J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ$\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0006\u0010\u0011\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0002J(\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J(\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\tJ\u001e\u0010\"\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002J\u001e\u0010&\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$J\u0016\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0004J&\u0010+\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010,\u001a\u00020\u0006H\u0016J$\u0010.\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0\rR\u0016\u0010/\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0019\u00106\u001a\u0002058\u0006@\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00104¨\u0006A"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "", "streamId", "", "byteCount", "Lvz/b0;", "writeContinuationFrames", "connectionPreface", "Lokhttp3/internal/http2/Settings;", "peerSettings", "applyAndAckSettings", "promisedStreamId", "", "Lokhttp3/internal/http2/Header;", "requestHeaders", "pushPromise", "flush", "Lokhttp3/internal/http2/ErrorCode;", "errorCode", "rstStream", "maxDataLength", "", "outFinished", "Lokio/f;", Stripe3ds2AuthParams.FIELD_SOURCE, MessageExtension.FIELD_DATA, "flags", "buffer", "dataFrame", "settings", "ack", "payload1", "payload2", "ping", "lastGoodStreamId", "", "debugData", "goAway", "windowSizeIncrement", "windowUpdate", "length", "type", "frameHeader", "close", "headerBlock", "headers", "hpackBuffer", "Lokio/f;", "maxFrameSize", "I", "closed", "Z", "Lokhttp3/internal/http2/Hpack$Writer;", "hpackWriter", "Lokhttp3/internal/http2/Hpack$Writer;", "getHpackWriter", "()Lokhttp3/internal/http2/Hpack$Writer;", "Lokio/g;", "sink", "Lokio/g;", PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, "<init>", "(Lokio/g;Z)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class Http2Writer implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final Logger logger = Logger.getLogger(Http2.class.getName());
    private final boolean client;
    private boolean closed;
    private final f hpackBuffer;
    private final Hpack.Writer hpackWriter;
    private int maxFrameSize;
    private final g sink;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lokhttp3/internal/http2/Http2Writer$Companion;", "", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Http2Writer(g sink, boolean z11) {
        s.g(sink, "sink");
        this.sink = sink;
        this.client = z11;
        f fVar = new f();
        this.hpackBuffer = fVar;
        this.maxFrameSize = 16384;
        this.hpackWriter = new Hpack.Writer(0, false, fVar, 3, null);
    }

    private final void writeContinuationFrames(int i11, long j11) {
        while (j11 > 0) {
            long min = Math.min(this.maxFrameSize, j11);
            j11 -= min;
            frameHeader(i11, (int) min, 9, j11 == 0 ? 4 : 0);
            this.sink.write(this.hpackBuffer, min);
        }
    }

    public final synchronized void applyAndAckSettings(Settings peerSettings) {
        s.g(peerSettings, "peerSettings");
        if (!this.closed) {
            this.maxFrameSize = peerSettings.getMaxFrameSize(this.maxFrameSize);
            if (peerSettings.getHeaderTableSize() != -1) {
                this.hpackWriter.resizeHeaderTable(peerSettings.getHeaderTableSize());
            }
            frameHeader(0, 0, 4, 1);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.closed = true;
        this.sink.close();
    }

    public final synchronized void connectionPreface() {
        if (!this.closed) {
            if (this.client) {
                Logger logger2 = logger;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(Util.format(">> CONNECTION " + Http2.CONNECTION_PREFACE.n(), new Object[0]));
                }
                this.sink.w1(Http2.CONNECTION_PREFACE);
                this.sink.flush();
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void data(boolean z11, int i11, f fVar, int i12) {
        if (!this.closed) {
            dataFrame(i11, z11 ? 1 : 0, fVar, i12);
        } else {
            throw new IOException("closed");
        }
    }

    public final void dataFrame(int i11, int i12, f fVar, int i13) {
        frameHeader(i11, i13, 0, i12);
        if (i13 > 0) {
            g gVar = this.sink;
            s.e(fVar);
            gVar.write(fVar, i13);
        }
    }

    public final synchronized void flush() {
        if (!this.closed) {
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void frameHeader(int i11, int i12, int i13, int i14) {
        Logger logger2 = logger;
        if (logger2.isLoggable(Level.FINE)) {
            logger2.fine(Http2.INSTANCE.frameLog(false, i11, i12, i13, i14));
        }
        if (!(i12 <= this.maxFrameSize)) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.maxFrameSize + ": " + i12).toString());
        }
        if ((((int) 2147483648L) & i11) == 0) {
            Util.writeMedium(this.sink, i12);
            this.sink.O0(i13 & 255);
            this.sink.O0(i14 & 255);
            this.sink.x(i11 & Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException(("reserved bit set: " + i11).toString());
    }

    public final Hpack.Writer getHpackWriter() {
        return this.hpackWriter;
    }

    public final synchronized void goAway(int i11, ErrorCode errorCode, byte[] debugData) {
        s.g(errorCode, "errorCode");
        s.g(debugData, "debugData");
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                frameHeader(0, debugData.length + 8, 7, 0);
                this.sink.x(i11);
                this.sink.x(errorCode.getHttpCode());
                if (!(debugData.length == 0)) {
                    this.sink.j0(debugData);
                }
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void headers(boolean z11, int i11, List<Header> headerBlock) {
        s.g(headerBlock, "headerBlock");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(headerBlock);
            long P0 = this.hpackBuffer.P0();
            long min = Math.min(this.maxFrameSize, P0);
            int i12 = (P0 > min ? 1 : (P0 == min ? 0 : -1));
            int i13 = i12 == 0 ? 4 : 0;
            if (z11) {
                i13 |= 1;
            }
            frameHeader(i11, (int) min, 1, i13);
            this.sink.write(this.hpackBuffer, min);
            if (i12 > 0) {
                writeContinuationFrames(i11, P0 - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final int maxDataLength() {
        return this.maxFrameSize;
    }

    public final synchronized void ping(boolean z11, int i11, int i12) {
        if (!this.closed) {
            frameHeader(0, 8, 6, z11 ? 1 : 0);
            this.sink.x(i11);
            this.sink.x(i12);
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void pushPromise(int i11, int i12, List<Header> requestHeaders) {
        s.g(requestHeaders, "requestHeaders");
        if (!this.closed) {
            this.hpackWriter.writeHeaders(requestHeaders);
            long P0 = this.hpackBuffer.P0();
            int min = (int) Math.min(this.maxFrameSize - 4, P0);
            int i13 = min + 4;
            long j11 = min;
            int i14 = (P0 > j11 ? 1 : (P0 == j11 ? 0 : -1));
            frameHeader(i11, i13, 5, i14 == 0 ? 4 : 0);
            this.sink.x(i12 & Integer.MAX_VALUE);
            this.sink.write(this.hpackBuffer, j11);
            if (i14 > 0) {
                writeContinuationFrames(i11, P0 - j11);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void rstStream(int i11, ErrorCode errorCode) {
        s.g(errorCode, "errorCode");
        if (!this.closed) {
            if (errorCode.getHttpCode() != -1) {
                frameHeader(i11, 4, 3, 0);
                this.sink.x(errorCode.getHttpCode());
                this.sink.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void settings(Settings settings) {
        s.g(settings, "settings");
        if (!this.closed) {
            int i11 = 0;
            frameHeader(0, settings.size() * 6, 4, 0);
            while (i11 < 10) {
                if (settings.isSet(i11)) {
                    this.sink.E0(i11 != 4 ? i11 != 7 ? i11 : 4 : 3);
                    this.sink.x(settings.get(i11));
                }
                i11++;
            }
            this.sink.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void windowUpdate(int i11, long j11) {
        if (this.closed) {
            throw new IOException("closed");
        }
        if (j11 != 0 && j11 <= 2147483647L) {
            frameHeader(i11, 4, 8, 0);
            this.sink.x((int) j11);
            this.sink.flush();
        } else {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j11).toString());
        }
    }
}