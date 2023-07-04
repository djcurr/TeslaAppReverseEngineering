package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class IterableByteBufferInputStream extends InputStream {
    private long currentAddress;
    private byte[] currentArray;
    private int currentArrayOffset;
    private ByteBuffer currentByteBuffer;
    private int currentByteBufferPos;
    private int currentIndex;
    private int dataSize = 0;
    private boolean hasArray;
    private Iterator<ByteBuffer> iterator;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IterableByteBufferInputStream(Iterable<ByteBuffer> iterable) {
        this.iterator = iterable.iterator();
        for (ByteBuffer byteBuffer : iterable) {
            this.dataSize++;
        }
        this.currentIndex = -1;
        if (getNextByteBuffer()) {
            return;
        }
        this.currentByteBuffer = Internal.EMPTY_BYTE_BUFFER;
        this.currentIndex = 0;
        this.currentByteBufferPos = 0;
        this.currentAddress = 0L;
    }

    private boolean getNextByteBuffer() {
        this.currentIndex++;
        if (this.iterator.hasNext()) {
            ByteBuffer next = this.iterator.next();
            this.currentByteBuffer = next;
            this.currentByteBufferPos = next.position();
            if (this.currentByteBuffer.hasArray()) {
                this.hasArray = true;
                this.currentArray = this.currentByteBuffer.array();
                this.currentArrayOffset = this.currentByteBuffer.arrayOffset();
            } else {
                this.hasArray = false;
                this.currentAddress = UnsafeUtil.addressOffset(this.currentByteBuffer);
                this.currentArray = null;
            }
            return true;
        }
        return false;
    }

    private void updateCurrentByteBufferPos(int i11) {
        int i12 = this.currentByteBufferPos + i11;
        this.currentByteBufferPos = i12;
        if (i12 == this.currentByteBuffer.limit()) {
            getNextByteBuffer();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        if (this.hasArray) {
            int i11 = this.currentArray[this.currentByteBufferPos + this.currentArrayOffset] & 255;
            updateCurrentByteBufferPos(1);
            return i11;
        }
        int i12 = UnsafeUtil.getByte(this.currentByteBufferPos + this.currentAddress) & 255;
        updateCurrentByteBufferPos(1);
        return i12;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        if (this.currentIndex == this.dataSize) {
            return -1;
        }
        int limit = this.currentByteBuffer.limit();
        int i13 = this.currentByteBufferPos;
        int i14 = limit - i13;
        if (i12 > i14) {
            i12 = i14;
        }
        if (this.hasArray) {
            System.arraycopy(this.currentArray, i13 + this.currentArrayOffset, bArr, i11, i12);
            updateCurrentByteBufferPos(i12);
        } else {
            int position = this.currentByteBuffer.position();
            this.currentByteBuffer.position(this.currentByteBufferPos);
            this.currentByteBuffer.get(bArr, i11, i12);
            this.currentByteBuffer.position(position);
            updateCurrentByteBufferPos(i12);
        }
        return i12;
    }
}