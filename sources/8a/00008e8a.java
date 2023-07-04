package okhttp3;

import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.core.FileAppender;
import com.stripe.android.core.networking.FileUploadRequest;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.Closeable;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import okhttp3.internal.http1.HeadersReader;
import okio.e0;
import okio.f;
import okio.f0;
import okio.h;
import okio.i;
import okio.r;
import okio.u;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0003#$%B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001b\u001a\u00020\u001a8\u0007@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006&"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "", "maxResult", "currentPartBytesRemaining", "Lokhttp3/MultipartReader$Part;", "nextPart", "Lvz/b0;", "close", "Lokio/i;", "dashDashBoundary", "Lokio/i;", "crlfDashDashBoundary", "", "partCount", "I", "", "closed", "Z", "noMoreParts", "Lokhttp3/MultipartReader$PartSource;", "currentPart", "Lokhttp3/MultipartReader$PartSource;", "Lokio/h;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lokio/h;", "", "boundary", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Lokio/h;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "Companion", "Part", "PartSource", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion(null);
    private static final u afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final i crlfDashDashBoundary;
    private PartSource currentPart;
    private final i dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    private final h source;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "Lokio/u;", "afterBoundaryOptions", "Lokio/u;", "getAfterBoundaryOptions", "()Lokio/u;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final u getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001R\u0019\u0010\u0005\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0019\u0010\t\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lvz/b0;", "close", "Lokhttp3/Headers;", "headers", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "Lokio/h;", "body", "Lokio/h;", "()Lokio/h;", "<init>", "(Lokhttp3/Headers;Lokio/h;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Part implements Closeable {
        private final h body;
        private final Headers headers;

        public Part(Headers headers, h body) {
            s.g(headers, "headers");
            s.g(body, "body");
            this.headers = headers;
            this.body = body;
        }

        public final h body() {
            return this.body;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lokhttp3/MultipartReader$PartSource;", "Lokio/e0;", "Lvz/b0;", "close", "Lokio/f;", "sink", "", "byteCount", "read", "Lokio/f0;", "timeout", "Lokio/f0;", "<init>", "(Lokhttp3/MultipartReader;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    private final class PartSource implements e0 {
        private final f0 timeout = new f0();

        public PartSource() {
        }

        @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (s.c(MultipartReader.this.currentPart, this)) {
                MultipartReader.this.currentPart = null;
            }
        }

        @Override // okio.e0
        public long read(f sink, long j11) {
            s.g(sink, "sink");
            if (j11 >= 0) {
                if (s.c(MultipartReader.this.currentPart, this)) {
                    f0 timeout = MultipartReader.this.source.timeout();
                    f0 f0Var = this.timeout;
                    long timeoutNanos = timeout.timeoutNanos();
                    long a11 = f0.Companion.a(f0Var.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(a11, timeUnit);
                    if (timeout.hasDeadline()) {
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (f0Var.hasDeadline()) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), f0Var.deadlineNanoTime()));
                        }
                        try {
                            long currentPartBytesRemaining = MultipartReader.this.currentPartBytesRemaining(j11);
                            long read = currentPartBytesRemaining == 0 ? -1L : MultipartReader.this.source.read(sink, currentPartBytesRemaining);
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (f0Var.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            return read;
                        } catch (Throwable th2) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (f0Var.hasDeadline()) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                            throw th2;
                        }
                    }
                    if (f0Var.hasDeadline()) {
                        timeout.deadlineNanoTime(f0Var.deadlineNanoTime());
                    }
                    try {
                        long currentPartBytesRemaining2 = MultipartReader.this.currentPartBytesRemaining(j11);
                        long read2 = currentPartBytesRemaining2 == 0 ? -1L : MultipartReader.this.source.read(sink, currentPartBytesRemaining2);
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (f0Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        return read2;
                    } catch (Throwable th3) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (f0Var.hasDeadline()) {
                            timeout.clearDeadline();
                        }
                        throw th3;
                    }
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
        }

        @Override // okio.e0
        public f0 timeout() {
            return this.timeout;
        }
    }

    static {
        u.a aVar = u.f42682d;
        i.a aVar2 = i.f42657e;
        afterBoundaryOptions = aVar.d(aVar2.e(FileUploadRequest.LINE_BREAK), aVar2.e("--"), aVar2.e(" "), aVar2.e(SyslogAppender.DEFAULT_STACKTRACE_PATTERN));
    }

    public MultipartReader(h source, String boundary) {
        s.g(source, "source");
        s.g(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new f().T("--").T(boundary).j1();
        this.crlfDashDashBoundary = new f().T("\r\n--").T(boundary).j1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j11) {
        this.source.m0(this.crlfDashDashBoundary.z());
        long B = this.source.b().B(this.crlfDashDashBoundary);
        if (B == -1) {
            return Math.min(j11, (this.source.b().P0() - this.crlfDashDashBoundary.z()) + 1);
        }
        return Math.min(j11, B);
    }

    public final String boundary() {
        return this.boundary;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    public final Part nextPart() {
        if (!this.closed) {
            if (this.noMoreParts) {
                return null;
            }
            if (this.partCount == 0 && this.source.V(0L, this.dashDashBoundary)) {
                this.source.skip(this.dashDashBoundary.z());
            } else {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(FileAppender.DEFAULT_BUFFER_SIZE);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.skip(currentPartBytesRemaining);
                }
                this.source.skip(this.crlfDashDashBoundary.z());
            }
            boolean z11 = false;
            while (true) {
                int J1 = this.source.J1(afterBoundaryOptions);
                if (J1 == -1) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (J1 == 0) {
                    this.partCount++;
                    Headers readHeaders = new HeadersReader(this.source).readHeaders();
                    PartSource partSource = new PartSource();
                    this.currentPart = partSource;
                    return new Part(readHeaders, r.d(partSource));
                } else if (J1 == 1) {
                    if (!z11) {
                        if (this.partCount != 0) {
                            this.noMoreParts = true;
                            return null;
                        }
                        throw new ProtocolException("expected at least 1 part");
                    }
                    throw new ProtocolException("unexpected characters after boundary");
                } else if (J1 == 2 || J1 == 3) {
                    z11 = true;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultipartReader(okhttp3.ResponseBody r3) {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.s.g(r3, r0)
            okio.h r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L1b
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
            if (r3 == 0) goto L1b
            r2.<init>(r0, r3)
            return
        L1b:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}