package okhttp3.internal.ws;

import com.adyen.checkout.components.status.model.StatusResponse;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;
import okio.f;
import okio.h;
import okio.i;
import org.spongycastle.i18n.TextBundle;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00010B/\u0012\u0006\u0010#\u001a\u00020\n\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020\n\u0012\u0006\u0010-\u001a\u00020\n¢\u0006\u0004\b.\u0010/J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\fR\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\fR\u0019\u0010%\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\fR\u0016\u0010-\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\f¨\u00061"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "Lvz/b0;", "readHeader", "readControlFrame", "readMessageFrame", "readUntilNonControlFrame", "readMessage", "processNextFrame", "close", "", "closed", "Z", "", "opcode", "I", "", "frameLength", "J", "isFinalFrame", "isControlFrame", "readingCompressedMessage", "Lokio/f;", "controlFrameBuffer", "Lokio/f;", "messageFrameBuffer", "Lokhttp3/internal/ws/MessageInflater;", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", "", "maskKey", "[B", "Lokio/f$a;", "maskCursor", "Lokio/f$a;", "isClient", "Lokio/h;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lokio/h;", "getSource", "()Lokio/h;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "frameCallback", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "perMessageDeflate", "noContextTakeover", "<init>", "(ZLokio/h;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "FrameCallback", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final f controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final f.a maskCursor;
    private final byte[] maskKey;
    private final f messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;
    private final h source;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H&J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002H&¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "", TextBundle.TEXT_ENTRY, "Lvz/b0;", "onReadMessage", "Lokio/i;", "bytes", StatusResponse.PAYLOAD, "onReadPing", "onReadPong", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "reason", "onReadClose", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public interface FrameCallback {
        void onReadClose(int i11, String str);

        void onReadMessage(String str);

        void onReadMessage(i iVar);

        void onReadPing(i iVar);

        void onReadPong(i iVar);
    }

    public WebSocketReader(boolean z11, h source, FrameCallback frameCallback, boolean z12, boolean z13) {
        s.g(source, "source");
        s.g(frameCallback, "frameCallback");
        this.isClient = z11;
        this.source = source;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z12;
        this.noContextTakeover = z13;
        this.controlFrameBuffer = new f();
        this.messageFrameBuffer = new f();
        this.maskKey = z11 ? null : new byte[4];
        this.maskCursor = z11 ? null : new f.a();
    }

    private final void readControlFrame() {
        String str;
        long j11 = this.frameLength;
        if (j11 > 0) {
            this.source.G(this.controlFrameBuffer, j11);
            if (!this.isClient) {
                f fVar = this.controlFrameBuffer;
                f.a aVar = this.maskCursor;
                s.e(aVar);
                fVar.t0(aVar);
                this.maskCursor.l(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                f.a aVar2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                s.e(bArr);
                webSocketProtocol.toggleMask(aVar2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s11 = 1005;
                long P0 = this.controlFrameBuffer.P0();
                if (P0 != 1) {
                    if (P0 != 0) {
                        s11 = this.controlFrameBuffer.readShort();
                        str = this.controlFrameBuffer.G0();
                        String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s11);
                        if (closeCodeExceptionMessage != null) {
                            throw new ProtocolException(closeCodeExceptionMessage);
                        }
                    } else {
                        str = "";
                    }
                    this.frameCallback.onReadClose(s11, str);
                    this.closed = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.j1());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.j1());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + Util.toHexString(this.opcode));
        }
    }

    private final void readHeader() {
        boolean z11;
        if (!this.closed) {
            long timeoutNanos = this.source.timeout().timeoutNanos();
            this.source.timeout().clearTimeout();
            try {
                int and = Util.and(this.source.readByte(), 255);
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                int i11 = and & 15;
                this.opcode = i11;
                boolean z12 = (and & 128) != 0;
                this.isFinalFrame = z12;
                boolean z13 = (and & 8) != 0;
                this.isControlFrame = z13;
                if (z13 && !z12) {
                    throw new ProtocolException("Control frames must be final.");
                }
                boolean z14 = (and & 64) != 0;
                if (i11 == 1 || i11 == 2) {
                    if (!z14) {
                        z11 = false;
                    } else if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    } else {
                        z11 = true;
                    }
                    this.readingCompressedMessage = z11;
                } else if (z14) {
                    throw new ProtocolException("Unexpected rsv1 flag");
                }
                if ((and & 32) != 0) {
                    throw new ProtocolException("Unexpected rsv2 flag");
                }
                if (!((and & 16) != 0)) {
                    int and2 = Util.and(this.source.readByte(), 255);
                    boolean z15 = (and2 & 128) != 0;
                    if (z15 == this.isClient) {
                        throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
                    }
                    long j11 = and2 & 127;
                    this.frameLength = j11;
                    if (j11 == 126) {
                        this.frameLength = Util.and(this.source.readShort(), (int) Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                    } else if (j11 == 127) {
                        long readLong = this.source.readLong();
                        this.frameLength = readLong;
                        if (readLong < 0) {
                            throw new ProtocolException("Frame length 0x" + Util.toHexString(this.frameLength) + " > 0x7FFFFFFFFFFFFFFF");
                        }
                    }
                    if (this.isControlFrame && this.frameLength > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    }
                    if (z15) {
                        h hVar = this.source;
                        byte[] bArr = this.maskKey;
                        s.e(bArr);
                        hVar.readFully(bArr);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("Unexpected rsv3 flag");
            } catch (Throwable th2) {
                this.source.timeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                throw th2;
            }
        }
        throw new IOException("closed");
    }

    private final void readMessage() {
        while (!this.closed) {
            long j11 = this.frameLength;
            if (j11 > 0) {
                this.source.G(this.messageFrameBuffer, j11);
                if (!this.isClient) {
                    f fVar = this.messageFrameBuffer;
                    f.a aVar = this.maskCursor;
                    s.e(aVar);
                    fVar.t0(aVar);
                    this.maskCursor.l(this.messageFrameBuffer.P0() - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    f.a aVar2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    s.e(bArr);
                    webSocketProtocol.toggleMask(aVar2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + Util.toHexString(this.opcode));
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() {
        int i11 = this.opcode;
        if (i11 != 1 && i11 != 2) {
            throw new ProtocolException("Unknown opcode: " + Util.toHexString(i11));
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i11 == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.G0());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.j1());
        }
    }

    private final void readUntilNonControlFrame() {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            }
            readControlFrame();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    public final h getSource() {
        return this.source;
    }

    public final void processNextFrame() {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}