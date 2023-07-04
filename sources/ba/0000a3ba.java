package org.spongycastle.pqc.crypto.gmss;

import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.encoders.Hex;

/* loaded from: classes4.dex */
public class GMSSLeaf {
    private byte[] concHashs;
    private GMSSRandom gmssRandom;

    /* renamed from: i  reason: collision with root package name */
    private int f43767i;

    /* renamed from: j  reason: collision with root package name */
    private int f43768j;
    private int keysize;
    private byte[] leaf;
    private int mdsize;
    private Digest messDigestOTS;
    byte[] privateKeyOTS;
    private byte[] seed;
    private int steps;
    private int two_power_w;

    /* renamed from: w  reason: collision with root package name */
    private int f43769w;

    public GMSSLeaf(Digest digest, byte[][] bArr, int[] iArr) {
        this.f43767i = iArr[0];
        this.f43768j = iArr[1];
        this.steps = iArr[2];
        this.f43769w = iArr[3];
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        int digestSize = this.messDigestOTS.getDigestSize();
        this.mdsize = digestSize;
        int ceil = (int) Math.ceil((digestSize << 3) / this.f43769w);
        this.keysize = ceil + ((int) Math.ceil(getLog((ceil << this.f43769w) + 1) / this.f43769w));
        this.two_power_w = 1 << this.f43769w;
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.concHashs = bArr[2];
        this.leaf = bArr[3];
    }

    private int getLog(int i11) {
        int i12 = 1;
        int i13 = 2;
        while (i13 < i11) {
            i13 <<= 1;
            i12++;
        }
        return i12;
    }

    private void updateLeafCalc() {
        byte[] bArr = new byte[this.messDigestOTS.getDigestSize()];
        for (int i11 = 0; i11 < this.steps + 10000; i11++) {
            int i12 = this.f43767i;
            if (i12 == this.keysize && this.f43768j == this.two_power_w - 1) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.concHashs;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.leaf = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                return;
            }
            if (i12 != 0 && this.f43768j != this.two_power_w - 1) {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr4 = this.privateKeyOTS;
                digest2.update(bArr4, 0, bArr4.length);
                this.privateKeyOTS = bArr;
                this.messDigestOTS.doFinal(bArr, 0);
                int i13 = this.f43768j + 1;
                this.f43768j = i13;
                if (i13 == this.two_power_w - 1) {
                    byte[] bArr5 = this.privateKeyOTS;
                    byte[] bArr6 = this.concHashs;
                    int i14 = this.mdsize;
                    System.arraycopy(bArr5, 0, bArr6, (this.f43767i - 1) * i14, i14);
                }
            } else {
                this.f43767i = i12 + 1;
                this.f43768j = 0;
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            }
        }
        throw new IllegalStateException("unable to updateLeaf in steps: " + this.steps + " " + this.f43767i + " " + this.f43768j);
    }

    public byte[] getLeaf() {
        return Arrays.clone(this.leaf);
    }

    public byte[][] getStatByte() {
        int i11 = this.mdsize;
        byte[][] bArr = {new byte[i11], new byte[i11], new byte[this.keysize * i11], new byte[i11]};
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.concHashs;
        bArr[3] = this.leaf;
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.f43767i, this.f43768j, this.steps, this.f43769w};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void initLeafCalc(byte[] bArr) {
        this.f43767i = 0;
        this.f43768j = 0;
        byte[] bArr2 = new byte[this.mdsize];
        System.arraycopy(bArr, 0, bArr2, 0, this.seed.length);
        this.seed = this.gmssRandom.nextSeed(bArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GMSSLeaf nextLeaf() {
        GMSSLeaf gMSSLeaf = new GMSSLeaf(this);
        gMSSLeaf.updateLeafCalc();
        return gMSSLeaf;
    }

    public String toString() {
        String str = "";
        for (int i11 = 0; i11 < 4; i11++) {
            str = str + getStatInt()[i11] + " ";
        }
        String str2 = str + " " + this.mdsize + " " + this.keysize + " " + this.two_power_w + " ";
        byte[][] statByte = getStatByte();
        for (int i12 = 0; i12 < 4; i12++) {
            str2 = statByte[i12] != null ? str2 + new String(Hex.encode(statByte[i12])) + " " : str2 + "null ";
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public GMSSLeaf(Digest digest, int i11, int i12) {
        int digestSize;
        int ceil;
        int ceil2;
        int i13;
        this.f43769w = i11;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d11 = i11;
        this.keysize = ((int) Math.ceil((digestSize << 3) / d11)) + ((int) Math.ceil(getLog((ceil << i11) + 1) / d11));
        this.two_power_w = 1 << i11;
        this.steps = (int) Math.ceil(((((i13 - 1) * ceil2) + 1) + ceil2) / i12);
        int i14 = this.mdsize;
        this.seed = new byte[i14];
        this.leaf = new byte[i14];
        this.privateKeyOTS = new byte[i14];
        this.concHashs = new byte[i14 * this.keysize];
    }

    public GMSSLeaf(Digest digest, int i11, int i12, byte[] bArr) {
        int digestSize;
        int ceil;
        int ceil2;
        int i13;
        this.f43769w = i11;
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        double d11 = i11;
        this.keysize = ((int) Math.ceil((digestSize << 3) / d11)) + ((int) Math.ceil(getLog((ceil << i11) + 1) / d11));
        this.two_power_w = 1 << i11;
        this.steps = (int) Math.ceil(((((i13 - 1) * ceil2) + 1) + ceil2) / i12);
        int i14 = this.mdsize;
        this.seed = new byte[i14];
        this.leaf = new byte[i14];
        this.privateKeyOTS = new byte[i14];
        this.concHashs = new byte[i14 * this.keysize];
        initLeafCalc(bArr);
    }

    private GMSSLeaf(GMSSLeaf gMSSLeaf) {
        this.messDigestOTS = gMSSLeaf.messDigestOTS;
        this.mdsize = gMSSLeaf.mdsize;
        this.keysize = gMSSLeaf.keysize;
        this.gmssRandom = gMSSLeaf.gmssRandom;
        this.leaf = Arrays.clone(gMSSLeaf.leaf);
        this.concHashs = Arrays.clone(gMSSLeaf.concHashs);
        this.f43767i = gMSSLeaf.f43767i;
        this.f43768j = gMSSLeaf.f43768j;
        this.two_power_w = gMSSLeaf.two_power_w;
        this.f43769w = gMSSLeaf.f43769w;
        this.steps = gMSSLeaf.steps;
        this.seed = Arrays.clone(gMSSLeaf.seed);
        this.privateKeyOTS = Arrays.clone(gMSSLeaf.privateKeyOTS);
    }
}