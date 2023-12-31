package ch.qos.logback.core.encoder;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class EchoEncoder<E> extends EncoderBase<E> {
    String fileFooter;
    String fileHeader;

    @Override // ch.qos.logback.core.encoder.Encoder
    public byte[] encode(E e11) {
        return (e11 + CoreConstants.LINE_SEPARATOR).getBytes();
    }

    @Override // ch.qos.logback.core.encoder.Encoder
    public byte[] footerBytes() {
        String str = this.fileFooter;
        if (str == null) {
            return null;
        }
        return str.getBytes();
    }

    @Override // ch.qos.logback.core.encoder.Encoder
    public byte[] headerBytes() {
        String str = this.fileHeader;
        if (str == null) {
            return null;
        }
        return str.getBytes();
    }
}