package qx;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import io.grpc.l0;
import io.grpc.w;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes5.dex */
final class a extends InputStream implements w, l0 {

    /* renamed from: a  reason: collision with root package name */
    private MessageLite f48683a;

    /* renamed from: b  reason: collision with root package name */
    private final Parser<?> f48684b;

    /* renamed from: c  reason: collision with root package name */
    private ByteArrayInputStream f48685c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(MessageLite messageLite, Parser<?> parser) {
        this.f48683a = messageLite;
        this.f48684b = parser;
    }

    @Override // io.grpc.w
    public int a(OutputStream outputStream) {
        MessageLite messageLite = this.f48683a;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            this.f48683a.writeTo(outputStream);
            this.f48683a = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.f48685c;
        if (byteArrayInputStream != null) {
            int a11 = (int) b.a(byteArrayInputStream, outputStream);
            this.f48685c = null;
            return a11;
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int available() {
        MessageLite messageLite = this.f48683a;
        if (messageLite != null) {
            return messageLite.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f48685c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageLite g() {
        MessageLite messageLite = this.f48683a;
        if (messageLite != null) {
            return messageLite;
        }
        throw new IllegalStateException("message not available");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parser<?> j() {
        return this.f48684b;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f48683a != null) {
            this.f48685c = new ByteArrayInputStream(this.f48683a.toByteArray());
            this.f48683a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f48685c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        MessageLite messageLite = this.f48683a;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            if (serializedSize == 0) {
                this.f48683a = null;
                this.f48685c = null;
                return -1;
            } else if (i12 >= serializedSize) {
                CodedOutputStream newInstance = CodedOutputStream.newInstance(bArr, i11, serializedSize);
                this.f48683a.writeTo(newInstance);
                newInstance.flush();
                newInstance.checkNoSpaceLeft();
                this.f48683a = null;
                this.f48685c = null;
                return serializedSize;
            } else {
                this.f48685c = new ByteArrayInputStream(this.f48683a.toByteArray());
                this.f48683a = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.f48685c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i11, i12);
        }
        return -1;
    }
}