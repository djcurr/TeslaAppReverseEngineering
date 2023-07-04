package org.spongycastle.crypto.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.SkippingCipher;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.modes.AEADBlockCipher;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class CipherInputStream extends FilterInputStream {
    private static final int INPUT_BUF_SIZE = 2048;
    private AEADBlockCipher aeadBlockCipher;
    private byte[] buf;
    private int bufOff;
    private BufferedBlockCipher bufferedBlockCipher;
    private boolean finalized;
    private byte[] inBuf;
    private byte[] markBuf;
    private int markBufOff;
    private long markPosition;
    private int maxBuf;
    private SkippingCipher skippingCipher;
    private StreamCipher streamCipher;

    public CipherInputStream(InputStream inputStream, BufferedBlockCipher bufferedBlockCipher) {
        this(inputStream, bufferedBlockCipher, 2048);
    }

    private void ensureCapacity(int i11, boolean z11) {
        if (z11) {
            BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
            if (bufferedBlockCipher != null) {
                i11 = bufferedBlockCipher.getOutputSize(i11);
            } else {
                AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                if (aEADBlockCipher != null) {
                    i11 = aEADBlockCipher.getOutputSize(i11);
                }
            }
        } else {
            BufferedBlockCipher bufferedBlockCipher2 = this.bufferedBlockCipher;
            if (bufferedBlockCipher2 != null) {
                i11 = bufferedBlockCipher2.getUpdateOutputSize(i11);
            } else {
                AEADBlockCipher aEADBlockCipher2 = this.aeadBlockCipher;
                if (aEADBlockCipher2 != null) {
                    i11 = aEADBlockCipher2.getUpdateOutputSize(i11);
                }
            }
        }
        byte[] bArr = this.buf;
        if (bArr == null || bArr.length < i11) {
            this.buf = new byte[i11];
        }
    }

    private void finaliseCipher() {
        try {
            this.finalized = true;
            ensureCapacity(0, true);
            BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
            if (bufferedBlockCipher != null) {
                this.maxBuf = bufferedBlockCipher.doFinal(this.buf, 0);
                return;
            }
            AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
            if (aEADBlockCipher != null) {
                this.maxBuf = aEADBlockCipher.doFinal(this.buf, 0);
            } else {
                this.maxBuf = 0;
            }
        } catch (InvalidCipherTextException e11) {
            throw new InvalidCipherTextIOException("Error finalising cipher", e11);
        } catch (Exception e12) {
            throw new IOException("Error finalising cipher " + e12);
        }
    }

    private int nextChunk() {
        if (this.finalized) {
            return -1;
        }
        this.bufOff = 0;
        this.maxBuf = 0;
        while (true) {
            int i11 = this.maxBuf;
            if (i11 != 0) {
                return i11;
            }
            int read = ((FilterInputStream) this).in.read(this.inBuf);
            if (read == -1) {
                finaliseCipher();
                int i12 = this.maxBuf;
                if (i12 == 0) {
                    return -1;
                }
                return i12;
            }
            try {
                ensureCapacity(read, false);
                BufferedBlockCipher bufferedBlockCipher = this.bufferedBlockCipher;
                if (bufferedBlockCipher != null) {
                    this.maxBuf = bufferedBlockCipher.processBytes(this.inBuf, 0, read, this.buf, 0);
                } else {
                    AEADBlockCipher aEADBlockCipher = this.aeadBlockCipher;
                    if (aEADBlockCipher != null) {
                        this.maxBuf = aEADBlockCipher.processBytes(this.inBuf, 0, read, this.buf, 0);
                    } else {
                        this.streamCipher.processBytes(this.inBuf, 0, read, this.buf, 0);
                        this.maxBuf = read;
                    }
                }
            } catch (Exception e11) {
                throw new CipherIOException("Error processing stream ", e11);
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return this.maxBuf - this.bufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            ((FilterInputStream) this).in.close();
            this.bufOff = 0;
            this.maxBuf = 0;
            this.markBufOff = 0;
            this.markPosition = 0L;
            byte[] bArr = this.markBuf;
            if (bArr != null) {
                Arrays.fill(bArr, (byte) 0);
                this.markBuf = null;
            }
            byte[] bArr2 = this.buf;
            if (bArr2 != null) {
                Arrays.fill(bArr2, (byte) 0);
                this.buf = null;
            }
            Arrays.fill(this.inBuf, (byte) 0);
        } finally {
            if (!this.finalized) {
                finaliseCipher();
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
        ((FilterInputStream) this).in.mark(i11);
        SkippingCipher skippingCipher = this.skippingCipher;
        if (skippingCipher != null) {
            this.markPosition = skippingCipher.getPosition();
        }
        byte[] bArr = this.buf;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            this.markBuf = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        this.markBufOff = this.bufOff;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        if (this.skippingCipher != null) {
            return ((FilterInputStream) this).in.markSupported();
        }
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.bufOff < this.maxBuf || nextChunk() >= 0) {
            byte[] bArr = this.buf;
            int i11 = this.bufOff;
            this.bufOff = i11 + 1;
            return bArr[i11] & 255;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (this.skippingCipher != null) {
            ((FilterInputStream) this).in.reset();
            this.skippingCipher.seekTo(this.markPosition);
            byte[] bArr = this.markBuf;
            if (bArr != null) {
                this.buf = bArr;
            }
            this.bufOff = this.markBufOff;
            return;
        }
        throw new IOException("cipher must implement SkippingCipher to be used with reset()");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) {
        if (j11 <= 0) {
            return 0L;
        }
        if (this.skippingCipher != null) {
            long available = available();
            if (j11 <= available) {
                this.bufOff = (int) (this.bufOff + j11);
                return j11;
            }
            this.bufOff = this.maxBuf;
            long skip = ((FilterInputStream) this).in.skip(j11 - available);
            if (skip == this.skippingCipher.skip(skip)) {
                return skip + available;
            }
            throw new IOException("Unable to skip cipher " + skip + " bytes.");
        }
        int min = (int) Math.min(j11, available());
        this.bufOff += min;
        return min;
    }

    public CipherInputStream(InputStream inputStream, StreamCipher streamCipher) {
        this(inputStream, streamCipher, 2048);
    }

    public CipherInputStream(InputStream inputStream, AEADBlockCipher aEADBlockCipher) {
        this(inputStream, aEADBlockCipher, 2048);
    }

    public CipherInputStream(InputStream inputStream, BufferedBlockCipher bufferedBlockCipher, int i11) {
        super(inputStream);
        this.bufferedBlockCipher = bufferedBlockCipher;
        this.inBuf = new byte[i11];
        this.skippingCipher = bufferedBlockCipher instanceof SkippingCipher ? (SkippingCipher) bufferedBlockCipher : null;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        if (this.bufOff < this.maxBuf || nextChunk() >= 0) {
            int min = Math.min(i12, available());
            System.arraycopy(this.buf, this.bufOff, bArr, i11, min);
            this.bufOff += min;
            return min;
        }
        return -1;
    }

    public CipherInputStream(InputStream inputStream, StreamCipher streamCipher, int i11) {
        super(inputStream);
        this.streamCipher = streamCipher;
        this.inBuf = new byte[i11];
        this.skippingCipher = streamCipher instanceof SkippingCipher ? (SkippingCipher) streamCipher : null;
    }

    public CipherInputStream(InputStream inputStream, AEADBlockCipher aEADBlockCipher, int i11) {
        super(inputStream);
        this.aeadBlockCipher = aEADBlockCipher;
        this.inBuf = new byte[i11];
        this.skippingCipher = aEADBlockCipher instanceof SkippingCipher ? (SkippingCipher) aEADBlockCipher : null;
    }
}