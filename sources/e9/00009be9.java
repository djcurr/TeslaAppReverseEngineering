package org.spongycastle.crypto.engines;

import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Vector;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.NaccacheSternKeyParameters;
import org.spongycastle.crypto.params.NaccacheSternPrivateKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class NaccacheSternEngine implements AsymmetricBlockCipher {
    private boolean forEncryption;
    private NaccacheSternKeyParameters key;
    private static BigInteger ZERO = BigInteger.valueOf(0);
    private static BigInteger ONE = BigInteger.valueOf(1);
    private Vector[] lookup = null;
    private boolean debug = false;

    private static BigInteger chineseRemainder(Vector vector, Vector vector2) {
        BigInteger bigInteger = ZERO;
        BigInteger bigInteger2 = ONE;
        for (int i11 = 0; i11 < vector2.size(); i11++) {
            bigInteger2 = bigInteger2.multiply((BigInteger) vector2.elementAt(i11));
        }
        for (int i12 = 0; i12 < vector2.size(); i12++) {
            BigInteger bigInteger3 = (BigInteger) vector2.elementAt(i12);
            BigInteger divide = bigInteger2.divide(bigInteger3);
            bigInteger = bigInteger.add(divide.multiply(divide.modInverse(bigInteger3)).multiply((BigInteger) vector.elementAt(i12)));
        }
        return bigInteger.mod(bigInteger2);
    }

    public byte[] addCryptedBlocks(byte[] bArr, byte[] bArr2) {
        if (this.forEncryption) {
            if (bArr.length > getOutputBlockSize() || bArr2.length > getOutputBlockSize()) {
                throw new InvalidCipherTextException("BlockLength too large for simple addition.\n");
            }
        } else if (bArr.length > getInputBlockSize() || bArr2.length > getInputBlockSize()) {
            throw new InvalidCipherTextException("BlockLength too large for simple addition.\n");
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        BigInteger bigInteger2 = new BigInteger(1, bArr2);
        BigInteger mod = bigInteger.multiply(bigInteger2).mod(this.key.getModulus());
        if (this.debug) {
            PrintStream printStream = System.out;
            printStream.println("c(m1) as BigInteger:....... " + bigInteger);
            PrintStream printStream2 = System.out;
            printStream2.println("c(m2) as BigInteger:....... " + bigInteger2);
            PrintStream printStream3 = System.out;
            printStream3.println("c(m1)*c(m2)%n = c(m1+m2)%n: " + mod);
        }
        byte[] byteArray = this.key.getModulus().toByteArray();
        Arrays.fill(byteArray, (byte) 0);
        System.arraycopy(mod.toByteArray(), 0, byteArray, byteArray.length - mod.toByteArray().length, mod.toByteArray().length);
        return byteArray;
    }

    public byte[] encrypt(BigInteger bigInteger) {
        byte[] byteArray = this.key.getModulus().toByteArray();
        Arrays.fill(byteArray, (byte) 0);
        byte[] byteArray2 = this.key.getG().modPow(bigInteger, this.key.getModulus()).toByteArray();
        System.arraycopy(byteArray2, 0, byteArray, byteArray.length - byteArray2.length, byteArray2.length);
        if (this.debug) {
            PrintStream printStream = System.out;
            printStream.println("Encrypted value is:  " + new BigInteger(byteArray));
        }
        return byteArray;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        if (this.forEncryption) {
            return ((this.key.getLowerSigmaBound() + 7) / 8) - 1;
        }
        return this.key.getModulus().toByteArray().length;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        if (this.forEncryption) {
            return this.key.getModulus().toByteArray().length;
        }
        return ((this.key.getLowerSigmaBound() + 7) / 8) - 1;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        if (cipherParameters instanceof ParametersWithRandom) {
            cipherParameters = ((ParametersWithRandom) cipherParameters).getParameters();
        }
        this.key = (NaccacheSternKeyParameters) cipherParameters;
        if (this.forEncryption) {
            return;
        }
        if (this.debug) {
            System.out.println("Constructing lookup Array");
        }
        NaccacheSternPrivateKeyParameters naccacheSternPrivateKeyParameters = (NaccacheSternPrivateKeyParameters) this.key;
        Vector smallPrimes = naccacheSternPrivateKeyParameters.getSmallPrimes();
        this.lookup = new Vector[smallPrimes.size()];
        for (int i11 = 0; i11 < smallPrimes.size(); i11++) {
            BigInteger bigInteger = (BigInteger) smallPrimes.elementAt(i11);
            int intValue = bigInteger.intValue();
            this.lookup[i11] = new Vector();
            this.lookup[i11].addElement(ONE);
            if (this.debug) {
                PrintStream printStream = System.out;
                printStream.println("Constructing lookup ArrayList for " + intValue);
            }
            BigInteger bigInteger2 = ZERO;
            for (int i12 = 1; i12 < intValue; i12++) {
                bigInteger2 = bigInteger2.add(naccacheSternPrivateKeyParameters.getPhi_n());
                this.lookup[i11].addElement(naccacheSternPrivateKeyParameters.getG().modPow(bigInteger2.divide(bigInteger), naccacheSternPrivateKeyParameters.getModulus()));
            }
        }
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        if (this.key != null) {
            if (i12 <= getInputBlockSize() + 1) {
                if (!this.forEncryption && i12 < getInputBlockSize()) {
                    throw new InvalidCipherTextException("BlockLength does not match modulus for Naccache-Stern cipher.\n");
                }
                if (i11 != 0 || i12 != bArr.length) {
                    byte[] bArr2 = new byte[i12];
                    System.arraycopy(bArr, i11, bArr2, 0, i12);
                    bArr = bArr2;
                }
                BigInteger bigInteger = new BigInteger(1, bArr);
                if (this.debug) {
                    System.out.println("input as BigInteger: " + bigInteger);
                }
                if (this.forEncryption) {
                    return encrypt(bigInteger);
                }
                Vector vector = new Vector();
                NaccacheSternPrivateKeyParameters naccacheSternPrivateKeyParameters = (NaccacheSternPrivateKeyParameters) this.key;
                Vector smallPrimes = naccacheSternPrivateKeyParameters.getSmallPrimes();
                for (int i13 = 0; i13 < smallPrimes.size(); i13++) {
                    BigInteger modPow = bigInteger.modPow(naccacheSternPrivateKeyParameters.getPhi_n().divide((BigInteger) smallPrimes.elementAt(i13)), naccacheSternPrivateKeyParameters.getModulus());
                    Vector[] vectorArr = this.lookup;
                    Vector vector2 = vectorArr[i13];
                    if (vectorArr[i13].size() != ((BigInteger) smallPrimes.elementAt(i13)).intValue()) {
                        if (this.debug) {
                            System.out.println("Prime is " + smallPrimes.elementAt(i13) + ", lookup table has size " + vector2.size());
                        }
                        throw new InvalidCipherTextException("Error in lookup Array for " + ((BigInteger) smallPrimes.elementAt(i13)).intValue() + ": Size mismatch. Expected ArrayList with length " + ((BigInteger) smallPrimes.elementAt(i13)).intValue() + " but found ArrayList of length " + this.lookup[i13].size());
                    }
                    int indexOf = vector2.indexOf(modPow);
                    if (indexOf == -1) {
                        if (this.debug) {
                            System.out.println("Actual prime is " + smallPrimes.elementAt(i13));
                            System.out.println("Decrypted value is " + modPow);
                            System.out.println("LookupList for " + smallPrimes.elementAt(i13) + " with size " + this.lookup[i13].size() + " is: ");
                            for (int i14 = 0; i14 < this.lookup[i13].size(); i14++) {
                                System.out.println(this.lookup[i13].elementAt(i14));
                            }
                        }
                        throw new InvalidCipherTextException("Lookup failed");
                    }
                    vector.addElement(BigInteger.valueOf(indexOf));
                }
                return chineseRemainder(vector, smallPrimes).toByteArray();
            }
            throw new DataLengthException("input too large for Naccache-Stern cipher.\n");
        }
        throw new IllegalStateException("NaccacheStern engine not initialised");
    }

    public byte[] processData(byte[] bArr) {
        byte[] processBlock;
        if (this.debug) {
            System.out.println();
        }
        if (bArr.length > getInputBlockSize()) {
            int inputBlockSize = getInputBlockSize();
            int outputBlockSize = getOutputBlockSize();
            if (this.debug) {
                System.out.println("Input blocksize is:  " + inputBlockSize + " bytes");
                System.out.println("Output blocksize is: " + outputBlockSize + " bytes");
                System.out.println("Data has length:.... " + bArr.length + " bytes");
            }
            byte[] bArr2 = new byte[((bArr.length / inputBlockSize) + 1) * outputBlockSize];
            int i11 = 0;
            int i12 = 0;
            while (i11 < bArr.length) {
                int i13 = i11 + inputBlockSize;
                if (i13 < bArr.length) {
                    processBlock = processBlock(bArr, i11, inputBlockSize);
                    i11 = i13;
                } else {
                    processBlock = processBlock(bArr, i11, bArr.length - i11);
                    i11 += bArr.length - i11;
                }
                if (this.debug) {
                    System.out.println("new datapos is " + i11);
                }
                if (processBlock != null) {
                    System.arraycopy(processBlock, 0, bArr2, i12, processBlock.length);
                    i12 += processBlock.length;
                } else {
                    if (this.debug) {
                        System.out.println("cipher returned null");
                    }
                    throw new InvalidCipherTextException("cipher returned null");
                }
            }
            byte[] bArr3 = new byte[i12];
            System.arraycopy(bArr2, 0, bArr3, 0, i12);
            if (this.debug) {
                System.out.println("returning " + i12 + " bytes");
            }
            return bArr3;
        }
        if (this.debug) {
            System.out.println("data size is less then input block size, processing directly");
        }
        return processBlock(bArr, 0, bArr.length);
    }

    public void setDebug(boolean z11) {
        this.debug = z11;
    }
}