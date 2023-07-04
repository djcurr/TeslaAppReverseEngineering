package org.spongycastle.pqc.crypto.gmss;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.crypto.MessageSigner;
import org.spongycastle.pqc.crypto.gmss.util.GMSSRandom;
import org.spongycastle.pqc.crypto.gmss.util.GMSSUtil;
import org.spongycastle.pqc.crypto.gmss.util.WinternitzOTSVerify;
import org.spongycastle.pqc.crypto.gmss.util.WinternitzOTSignature;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class GMSSSigner implements MessageSigner {
    private byte[][][] currentAuthPaths;
    private GMSSDigestProvider digestProvider;
    private GMSSParameters gmssPS;
    private GMSSRandom gmssRandom;
    private GMSSUtil gmssUtil = new GMSSUtil();
    private int[] index;
    GMSSKeyParameters key;
    private int mdLength;
    private Digest messDigestOTS;
    private Digest messDigestTrees;
    private int numLayer;
    private WinternitzOTSignature ots;
    private byte[] pubKeyBytes;
    private SecureRandom random;
    private byte[][] subtreeRootSig;

    public GMSSSigner(GMSSDigestProvider gMSSDigestProvider) {
        this.digestProvider = gMSSDigestProvider;
        Digest digest = gMSSDigestProvider.get();
        this.messDigestTrees = digest;
        this.messDigestOTS = digest;
        this.mdLength = digest.getDigestSize();
        this.gmssRandom = new GMSSRandom(this.messDigestTrees);
    }

    private void initSign() {
        int i11;
        this.messDigestTrees.reset();
        GMSSPrivateKeyParameters gMSSPrivateKeyParameters = (GMSSPrivateKeyParameters) this.key;
        if (!gMSSPrivateKeyParameters.isUsed()) {
            if (gMSSPrivateKeyParameters.getIndex(0) < gMSSPrivateKeyParameters.getNumLeafs(0)) {
                GMSSParameters parameters = gMSSPrivateKeyParameters.getParameters();
                this.gmssPS = parameters;
                this.numLayer = parameters.getNumOfLayers();
                byte[] bArr = gMSSPrivateKeyParameters.getCurrentSeeds()[this.numLayer - 1];
                int i12 = this.mdLength;
                byte[] bArr2 = new byte[i12];
                byte[] bArr3 = new byte[i12];
                System.arraycopy(bArr, 0, bArr3, 0, i12);
                this.ots = new WinternitzOTSignature(this.gmssRandom.nextSeed(bArr3), this.digestProvider.get(), this.gmssPS.getWinternitzParameter()[this.numLayer - 1]);
                byte[][][] currentAuthPaths = gMSSPrivateKeyParameters.getCurrentAuthPaths();
                this.currentAuthPaths = new byte[this.numLayer][];
                int i13 = 0;
                while (true) {
                    i11 = this.numLayer;
                    if (i13 >= i11) {
                        break;
                    }
                    this.currentAuthPaths[i13] = (byte[][]) Array.newInstance(byte.class, currentAuthPaths[i13].length, this.mdLength);
                    for (int i14 = 0; i14 < currentAuthPaths[i13].length; i14++) {
                        System.arraycopy(currentAuthPaths[i13][i14], 0, this.currentAuthPaths[i13][i14], 0, this.mdLength);
                    }
                    i13++;
                }
                this.index = new int[i11];
                System.arraycopy(gMSSPrivateKeyParameters.getIndex(), 0, this.index, 0, this.numLayer);
                this.subtreeRootSig = new byte[this.numLayer - 1];
                for (int i15 = 0; i15 < this.numLayer - 1; i15++) {
                    byte[] subtreeRootSig = gMSSPrivateKeyParameters.getSubtreeRootSig(i15);
                    byte[][] bArr4 = this.subtreeRootSig;
                    bArr4[i15] = new byte[subtreeRootSig.length];
                    System.arraycopy(subtreeRootSig, 0, bArr4[i15], 0, subtreeRootSig.length);
                }
                gMSSPrivateKeyParameters.markUsed();
                return;
            }
            throw new IllegalStateException("No more signatures can be generated");
        }
        throw new IllegalStateException("Private key already used");
    }

    private void initVerify() {
        this.messDigestTrees.reset();
        GMSSPublicKeyParameters gMSSPublicKeyParameters = (GMSSPublicKeyParameters) this.key;
        this.pubKeyBytes = gMSSPublicKeyParameters.getPublicKey();
        GMSSParameters parameters = gMSSPublicKeyParameters.getParameters();
        this.gmssPS = parameters;
        this.numLayer = parameters.getNumOfLayers();
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArr2 = new byte[this.mdLength];
        byte[] signature = this.ots.getSignature(bArr);
        byte[] concatenateArray = this.gmssUtil.concatenateArray(this.currentAuthPaths[this.numLayer - 1]);
        byte[] intToBytesLittleEndian = this.gmssUtil.intToBytesLittleEndian(this.index[this.numLayer - 1]);
        int length = intToBytesLittleEndian.length + signature.length + concatenateArray.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(intToBytesLittleEndian, 0, bArr3, 0, intToBytesLittleEndian.length);
        System.arraycopy(signature, 0, bArr3, intToBytesLittleEndian.length, signature.length);
        System.arraycopy(concatenateArray, 0, bArr3, intToBytesLittleEndian.length + signature.length, concatenateArray.length);
        byte[] bArr4 = new byte[0];
        for (int i11 = (this.numLayer - 1) - 1; i11 >= 0; i11--) {
            byte[] concatenateArray2 = this.gmssUtil.concatenateArray(this.currentAuthPaths[i11]);
            byte[] intToBytesLittleEndian2 = this.gmssUtil.intToBytesLittleEndian(this.index[i11]);
            int length2 = bArr4.length;
            byte[] bArr5 = new byte[length2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            bArr4 = new byte[intToBytesLittleEndian2.length + length2 + this.subtreeRootSig[i11].length + concatenateArray2.length];
            System.arraycopy(bArr5, 0, bArr4, 0, length2);
            System.arraycopy(intToBytesLittleEndian2, 0, bArr4, length2, intToBytesLittleEndian2.length);
            byte[][] bArr6 = this.subtreeRootSig;
            System.arraycopy(bArr6[i11], 0, bArr4, intToBytesLittleEndian2.length + length2, bArr6[i11].length);
            System.arraycopy(concatenateArray2, 0, bArr4, length2 + intToBytesLittleEndian2.length + this.subtreeRootSig[i11].length, concatenateArray2.length);
        }
        byte[] bArr7 = new byte[bArr4.length + length];
        System.arraycopy(bArr3, 0, bArr7, 0, length);
        System.arraycopy(bArr4, 0, bArr7, length, bArr4.length);
        return bArr7;
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (z11) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                this.key = (GMSSPrivateKeyParameters) parametersWithRandom.getParameters();
                initSign();
                return;
            }
            this.random = new SecureRandom();
            this.key = (GMSSPrivateKeyParameters) cipherParameters;
            initSign();
            return;
        }
        this.key = (GMSSPublicKeyParameters) cipherParameters;
        initVerify();
    }

    @Override // org.spongycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        this.messDigestOTS.reset();
        int i11 = 0;
        for (int i12 = this.numLayer - 1; i12 >= 0; i12--) {
            WinternitzOTSVerify winternitzOTSVerify = new WinternitzOTSVerify(this.digestProvider.get(), this.gmssPS.getWinternitzParameter()[i12]);
            int signatureLength = winternitzOTSVerify.getSignatureLength();
            int bytesToIntLittleEndian = this.gmssUtil.bytesToIntLittleEndian(bArr2, i11);
            int i13 = i11 + 4;
            byte[] bArr3 = new byte[signatureLength];
            System.arraycopy(bArr2, i13, bArr3, 0, signatureLength);
            i11 = i13 + signatureLength;
            bArr = winternitzOTSVerify.Verify(bArr, bArr3);
            if (bArr == null) {
                System.err.println("OTS Public Key is null in GMSSSignature.verify");
                return false;
            }
            byte[][] bArr4 = (byte[][]) Array.newInstance(byte.class, this.gmssPS.getHeightOfTrees()[i12], this.mdLength);
            for (byte[] bArr5 : bArr4) {
                System.arraycopy(bArr2, i11, bArr5, 0, this.mdLength);
                i11 += this.mdLength;
            }
            byte[] bArr6 = new byte[this.mdLength];
            int length = (1 << bArr4.length) + bytesToIntLittleEndian;
            for (int i14 = 0; i14 < bArr4.length; i14++) {
                int i15 = this.mdLength;
                int i16 = i15 << 1;
                byte[] bArr7 = new byte[i16];
                if (length % 2 == 0) {
                    System.arraycopy(bArr, 0, bArr7, 0, i15);
                    byte[] bArr8 = bArr4[i14];
                    int i17 = this.mdLength;
                    System.arraycopy(bArr8, 0, bArr7, i17, i17);
                    length /= 2;
                } else {
                    System.arraycopy(bArr4[i14], 0, bArr7, 0, i15);
                    System.arraycopy(bArr, 0, bArr7, this.mdLength, bArr.length);
                    length = (length - 1) / 2;
                }
                this.messDigestTrees.update(bArr7, 0, i16);
                bArr = new byte[this.messDigestTrees.getDigestSize()];
                this.messDigestTrees.doFinal(bArr, 0);
            }
        }
        return Arrays.areEqual(this.pubKeyBytes, bArr);
    }
}