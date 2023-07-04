package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public class ByteQueue {
    private static final int DEFAULT_CAPACITY = 1024;
    private int available;
    private byte[] databuf;
    private int skipped;

    public ByteQueue() {
        this(1024);
    }

    public static int nextTwoPow(int i11) {
        int i12 = i11 | (i11 >> 1);
        int i13 = i12 | (i12 >> 2);
        int i14 = i13 | (i13 >> 4);
        int i15 = i14 | (i14 >> 8);
        return (i15 | (i15 >> 16)) + 1;
    }

    public void addData(byte[] bArr, int i11, int i12) {
        int i13 = this.skipped;
        int i14 = this.available;
        if (i13 + i14 + i12 > this.databuf.length) {
            int nextTwoPow = nextTwoPow(i14 + i12);
            byte[] bArr2 = this.databuf;
            if (nextTwoPow > bArr2.length) {
                byte[] bArr3 = new byte[nextTwoPow];
                System.arraycopy(bArr2, this.skipped, bArr3, 0, this.available);
                this.databuf = bArr3;
            } else {
                System.arraycopy(bArr2, this.skipped, bArr2, 0, this.available);
            }
            this.skipped = 0;
        }
        System.arraycopy(bArr, i11, this.databuf, this.skipped + this.available, i12);
        this.available += i12;
    }

    public int available() {
        return this.available;
    }

    public void read(byte[] bArr, int i11, int i12, int i13) {
        if (bArr.length - i11 >= i12) {
            if (this.available - i13 >= i12) {
                System.arraycopy(this.databuf, this.skipped + i13, bArr, i11, i12);
                return;
            }
            throw new IllegalStateException("Not enough data to read");
        }
        throw new IllegalArgumentException("Buffer size of " + bArr.length + " is too small for a read of " + i12 + " bytes");
    }

    public void removeData(int i11) {
        int i12 = this.available;
        if (i11 <= i12) {
            this.available = i12 - i11;
            this.skipped += i11;
            return;
        }
        throw new IllegalStateException("Cannot remove " + i11 + " bytes, only got " + this.available);
    }

    public int size() {
        return this.available;
    }

    public ByteQueue(int i11) {
        this.skipped = 0;
        this.available = 0;
        this.databuf = new byte[i11];
    }

    public void removeData(byte[] bArr, int i11, int i12, int i13) {
        read(bArr, i11, i12, i13);
        removeData(i13 + i12);
    }

    public byte[] removeData(int i11, int i12) {
        byte[] bArr = new byte[i11];
        removeData(bArr, 0, i11, i12);
        return bArr;
    }
}