package org.spongycastle.cms;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.util.io.Streams;

/* loaded from: classes5.dex */
public class CMSTypedStream {
    private static final int BUF_SIZ = 32768;
    protected InputStream _in;
    private final ASN1ObjectIdentifier _oid;

    /* loaded from: classes5.dex */
    private static class FullReaderStream extends FilterInputStream {
        FullReaderStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i11, int i12) {
            int readFully = Streams.readFully(((FilterInputStream) this).in, bArr, i11, i12);
            if (readFully > 0) {
                return readFully;
            }
            return -1;
        }
    }

    public CMSTypedStream(InputStream inputStream) {
        this(PKCSObjectIdentifiers.data.getId(), inputStream, 32768);
    }

    public void drain() {
        Streams.drain(this._in);
        this._in.close();
    }

    public InputStream getContentStream() {
        return this._in;
    }

    public ASN1ObjectIdentifier getContentType() {
        return this._oid;
    }

    public CMSTypedStream(String str, InputStream inputStream) {
        this(new ASN1ObjectIdentifier(str), inputStream, 32768);
    }

    public CMSTypedStream(String str, InputStream inputStream, int i11) {
        this(new ASN1ObjectIdentifier(str), inputStream, i11);
    }

    public CMSTypedStream(ASN1ObjectIdentifier aSN1ObjectIdentifier, InputStream inputStream) {
        this(aSN1ObjectIdentifier, inputStream, 32768);
    }

    public CMSTypedStream(ASN1ObjectIdentifier aSN1ObjectIdentifier, InputStream inputStream, int i11) {
        this._oid = aSN1ObjectIdentifier;
        this._in = new FullReaderStream(new BufferedInputStream(inputStream, i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public CMSTypedStream(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this._oid = aSN1ObjectIdentifier;
    }
}