package org.spongycastle.crypto.tls;

import java.io.IOException;

/* loaded from: classes4.dex */
public class DTLSTransport implements DatagramTransport {
    private final DTLSRecordLayer recordLayer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DTLSTransport(DTLSRecordLayer dTLSRecordLayer) {
        this.recordLayer = dTLSRecordLayer;
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void close() {
        this.recordLayer.close();
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getReceiveLimit() {
        return this.recordLayer.getReceiveLimit();
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int getSendLimit() {
        return this.recordLayer.getSendLimit();
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public int receive(byte[] bArr, int i11, int i12, int i13) {
        try {
            return this.recordLayer.receive(bArr, i11, i12, i13);
        } catch (IOException e11) {
            this.recordLayer.fail((short) 80);
            throw e11;
        } catch (RuntimeException e12) {
            this.recordLayer.fail((short) 80);
            throw new TlsFatalAlert((short) 80, e12);
        } catch (TlsFatalAlert e13) {
            this.recordLayer.fail(e13.getAlertDescription());
            throw e13;
        }
    }

    @Override // org.spongycastle.crypto.tls.DatagramTransport
    public void send(byte[] bArr, int i11, int i12) {
        try {
            this.recordLayer.send(bArr, i11, i12);
        } catch (RuntimeException e11) {
            this.recordLayer.fail((short) 80);
            throw new TlsFatalAlert((short) 80, e11);
        } catch (TlsFatalAlert e12) {
            this.recordLayer.fail(e12.getAlertDescription());
            throw e12;
        } catch (IOException e13) {
            this.recordLayer.fail((short) 80);
            throw e13;
        }
    }
}