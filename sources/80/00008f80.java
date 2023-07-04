package okhttp3.internal.ws;

import com.adyen.checkout.components.status.model.StatusResponse;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okio.f;
import okio.g;
import okio.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010!\u001a\u00020\u0015\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010,\u001a\u00020\u0015\u0012\u0006\u0010-\u001a\u00020\u0015\u0012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b1\u00102J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017R\u0019\u0010#\u001a\u00020\"8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010(\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0017R\u0016\u0010-\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0017R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "", "opcode", "Lokio/i;", StatusResponse.PAYLOAD, "Lvz/b0;", "writeControlFrame", "writePing", "writePong", PaymentMethodOptionsParams.Blik.PARAM_CODE, "reason", "writeClose", "formatOpcode", MessageExtension.FIELD_DATA, "writeMessageFrame", "close", "Lokio/f;", "messageBuffer", "Lokio/f;", "sinkBuffer", "", "writerClosed", "Z", "Lokhttp3/internal/ws/MessageDeflater;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "", "maskKey", "[B", "Lokio/f$a;", "maskCursor", "Lokio/f$a;", "isClient", "Lokio/g;", "sink", "Lokio/g;", "getSink", "()Lokio/g;", "Ljava/util/Random;", "random", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", "", "minimumDeflateSize", "J", "<init>", "(ZLokio/g;Ljava/util/Random;ZZJ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final f.a maskCursor;
    private final byte[] maskKey;
    private final f messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;
    private final Random random;
    private final g sink;
    private final f sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z11, g sink, Random random, boolean z12, boolean z13, long j11) {
        s.g(sink, "sink");
        s.g(random, "random");
        this.isClient = z11;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z12;
        this.noContextTakeover = z13;
        this.minimumDeflateSize = j11;
        this.messageBuffer = new f();
        this.sinkBuffer = sink.b();
        this.maskKey = z11 ? new byte[4] : null;
        this.maskCursor = z11 ? new f.a() : null;
    }

    private final void writeControlFrame(int i11, i iVar) {
        if (!this.writerClosed) {
            int z11 = iVar.z();
            if (((long) z11) <= 125) {
                this.sinkBuffer.O0(i11 | 128);
                if (this.isClient) {
                    this.sinkBuffer.O0(z11 | 128);
                    Random random = this.random;
                    byte[] bArr = this.maskKey;
                    s.e(bArr);
                    random.nextBytes(bArr);
                    this.sinkBuffer.j0(this.maskKey);
                    if (z11 > 0) {
                        long P0 = this.sinkBuffer.P0();
                        this.sinkBuffer.w1(iVar);
                        f fVar = this.sinkBuffer;
                        f.a aVar = this.maskCursor;
                        s.e(aVar);
                        fVar.t0(aVar);
                        this.maskCursor.l(P0);
                        WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                        this.maskCursor.close();
                    }
                } else {
                    this.sinkBuffer.O0(z11);
                    this.sinkBuffer.w1(iVar);
                }
                this.sink.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    public final Random getRandom() {
        return this.random;
    }

    public final g getSink() {
        return this.sink;
    }

    public final void writeClose(int i11, i iVar) {
        i iVar2 = i.f42656d;
        if (i11 != 0 || iVar != null) {
            if (i11 != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(i11);
            }
            f fVar = new f();
            fVar.E0(i11);
            if (iVar != null) {
                fVar.w1(iVar);
            }
            iVar2 = fVar.j1();
        }
        try {
            writeControlFrame(8, iVar2);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int i11, i data) {
        s.g(data, "data");
        if (!this.writerClosed) {
            this.messageBuffer.w1(data);
            int i12 = i11 | 128;
            if (this.perMessageDeflate && data.z() >= this.minimumDeflateSize) {
                MessageDeflater messageDeflater = this.messageDeflater;
                if (messageDeflater == null) {
                    messageDeflater = new MessageDeflater(this.noContextTakeover);
                    this.messageDeflater = messageDeflater;
                }
                messageDeflater.deflate(this.messageBuffer);
                i12 |= 64;
            }
            long P0 = this.messageBuffer.P0();
            this.sinkBuffer.O0(i12);
            int i13 = this.isClient ? 128 : 0;
            if (P0 <= 125) {
                this.sinkBuffer.O0(((int) P0) | i13);
            } else if (P0 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                this.sinkBuffer.O0(i13 | 126);
                this.sinkBuffer.E0((int) P0);
            } else {
                this.sinkBuffer.O0(i13 | 127);
                this.sinkBuffer.D1(P0);
            }
            if (this.isClient) {
                Random random = this.random;
                byte[] bArr = this.maskKey;
                s.e(bArr);
                random.nextBytes(bArr);
                this.sinkBuffer.j0(this.maskKey);
                if (P0 > 0) {
                    f fVar = this.messageBuffer;
                    f.a aVar = this.maskCursor;
                    s.e(aVar);
                    fVar.t0(aVar);
                    this.maskCursor.l(0L);
                    WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                    this.maskCursor.close();
                }
            }
            this.sinkBuffer.write(this.messageBuffer, P0);
            this.sink.v();
            return;
        }
        throw new IOException("closed");
    }

    public final void writePing(i payload) {
        s.g(payload, "payload");
        writeControlFrame(9, payload);
    }

    public final void writePong(i payload) {
        s.g(payload, "payload");
        writeControlFrame(10, payload);
    }
}