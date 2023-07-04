package org.spongycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;
import org.spongycastle.util.io.Streams;

/* loaded from: classes6.dex */
class DefiniteLengthInputStream extends LimitedInputStream {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final int _originalLength;
    private int _remaining;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DefiniteLengthInputStream(InputStream inputStream, int i11) {
        super(inputStream, i11);
        if (i11 >= 0) {
            this._originalLength = i11;
            this._remaining = i11;
            if (i11 == 0) {
                setParentEofDetect(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.spongycastle.asn1.LimitedInputStream
    public int getRemaining() {
        return this._remaining;
    }

    @Override // java.io.InputStream
    public int read() {
        if (this._remaining == 0) {
            return -1;
        }
        int read = this._in.read();
        if (read >= 0) {
            int i11 = this._remaining - 1;
            this._remaining = i11;
            if (i11 == 0) {
                setParentEofDetect(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] toByteArray() {
        int i11 = this._remaining;
        if (i11 == 0) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i11];
        int readFully = i11 - Streams.readFully(this._in, bArr);
        this._remaining = readFully;
        if (readFully == 0) {
            setParentEofDetect(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        int i13 = this._remaining;
        if (i13 == 0) {
            return -1;
        }
        int read = this._in.read(bArr, i11, Math.min(i12, i13));
        if (read >= 0) {
            int i14 = this._remaining - read;
            this._remaining = i14;
            if (i14 == 0) {
                setParentEofDetect(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this._originalLength + " object truncated by " + this._remaining);
    }
}