package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public class SupplementalDataEntry {
    protected byte[] data;
    protected int dataType;

    public SupplementalDataEntry(int i11, byte[] bArr) {
        this.dataType = i11;
        this.data = bArr;
    }

    public byte[] getData() {
        return this.data;
    }

    public int getDataType() {
        return this.dataType;
    }
}