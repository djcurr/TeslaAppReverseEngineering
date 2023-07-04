package org.spongycastle.crypto.examples;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.security.SecureRandom;
import org.spongycastle.crypto.CryptoException;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.engines.DESedeEngine;
import org.spongycastle.crypto.generators.DESedeKeyGenerator;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.encoders.Hex;

/* loaded from: classes4.dex */
public class DESExample {
    private PaddedBufferedBlockCipher cipher;
    private boolean encrypt;

    /* renamed from: in  reason: collision with root package name */
    private BufferedInputStream f43520in;
    private byte[] key;
    private BufferedOutputStream out;

    public DESExample() {
        this.encrypt = true;
        this.cipher = null;
        this.f43520in = null;
        this.out = null;
        this.key = null;
    }

    public static void main(String[] strArr) {
        String str;
        boolean z11 = true;
        if (strArr.length < 2) {
            new DESExample();
            System.err.println("Usage: java " + DESExample.class.getName() + " infile outfile [keyfile]");
            System.exit(1);
        }
        String str2 = strArr[0];
        String str3 = strArr[1];
        if (strArr.length > 2) {
            str = strArr[2];
            z11 = false;
        } else {
            str = "deskey.dat";
        }
        new DESExample(str2, str3, str, z11).process();
    }

    private void performDecrypt(byte[] bArr) {
        this.cipher.init(false, new KeyParameter(bArr));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f43520in));
        byte[] bArr2 = null;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    try {
                        break;
                    } catch (CryptoException unused) {
                        return;
                    }
                }
                byte[] decode = Hex.decode(readLine);
                bArr2 = new byte[this.cipher.getOutputSize(decode.length)];
                int processBytes = this.cipher.processBytes(decode, 0, decode.length, bArr2, 0);
                if (processBytes > 0) {
                    this.out.write(bArr2, 0, processBytes);
                }
            } catch (IOException e11) {
                e11.printStackTrace();
                return;
            }
        }
        int doFinal = this.cipher.doFinal(bArr2, 0);
        if (doFinal > 0) {
            this.out.write(bArr2, 0, doFinal);
        }
    }

    private void performEncrypt(byte[] bArr) {
        this.cipher.init(true, new KeyParameter(bArr));
        byte[] bArr2 = new byte[47];
        byte[] bArr3 = new byte[this.cipher.getOutputSize(47)];
        while (true) {
            try {
                int read = this.f43520in.read(bArr2, 0, 47);
                if (read <= 0) {
                    try {
                        break;
                    } catch (CryptoException unused) {
                        return;
                    }
                }
                int processBytes = this.cipher.processBytes(bArr2, 0, read, bArr3, 0);
                if (processBytes > 0) {
                    byte[] encode = Hex.encode(bArr3, 0, processBytes);
                    this.out.write(encode, 0, encode.length);
                    this.out.write(10);
                }
            } catch (IOException e11) {
                e11.printStackTrace();
                return;
            }
        }
        int doFinal = this.cipher.doFinal(bArr3, 0);
        if (doFinal > 0) {
            byte[] encode2 = Hex.encode(bArr3, 0, doFinal);
            this.out.write(encode2, 0, encode2.length);
            this.out.write(10);
        }
    }

    private void process() {
        this.cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(new DESedeEngine()));
        if (this.encrypt) {
            performEncrypt(this.key);
        } else {
            performDecrypt(this.key);
        }
        try {
            this.f43520in.close();
            this.out.flush();
            this.out.close();
        } catch (IOException e11) {
            PrintStream printStream = System.err;
            printStream.println("exception closing resources: " + e11.getMessage());
        }
    }

    public DESExample(String str, String str2, String str3, boolean z11) {
        SecureRandom secureRandom;
        this.encrypt = true;
        SecureRandom secureRandom2 = null;
        this.cipher = null;
        this.f43520in = null;
        this.out = null;
        this.key = null;
        this.encrypt = z11;
        try {
            this.f43520in = new BufferedInputStream(new FileInputStream(str));
        } catch (FileNotFoundException unused) {
            PrintStream printStream = System.err;
            printStream.println("Input file not found [" + str + "]");
            System.exit(1);
        }
        try {
            this.out = new BufferedOutputStream(new FileOutputStream(str2));
        } catch (IOException unused2) {
            PrintStream printStream2 = System.err;
            printStream2.println("Output file not created [" + str2 + "]");
            System.exit(1);
        }
        if (z11) {
            try {
                secureRandom = new SecureRandom();
                try {
                    secureRandom.setSeed("www.bouncycastle.org".getBytes());
                } catch (Exception unused3) {
                    secureRandom2 = secureRandom;
                    try {
                        System.err.println("Hmmm, no SHA1PRNG, you need the Sun implementation");
                        System.exit(1);
                        secureRandom = secureRandom2;
                        KeyGenerationParameters keyGenerationParameters = new KeyGenerationParameters(secureRandom, 192);
                        DESedeKeyGenerator dESedeKeyGenerator = new DESedeKeyGenerator();
                        dESedeKeyGenerator.init(keyGenerationParameters);
                        this.key = dESedeKeyGenerator.generateKey();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str3));
                        byte[] encode = Hex.encode(this.key);
                        bufferedOutputStream.write(encode, 0, encode.length);
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                        return;
                    } catch (IOException unused4) {
                        PrintStream printStream3 = System.err;
                        printStream3.println("Could not decryption create key file [" + str3 + "]");
                        System.exit(1);
                        return;
                    }
                }
            } catch (Exception unused5) {
            }
            KeyGenerationParameters keyGenerationParameters2 = new KeyGenerationParameters(secureRandom, 192);
            DESedeKeyGenerator dESedeKeyGenerator2 = new DESedeKeyGenerator();
            dESedeKeyGenerator2.init(keyGenerationParameters2);
            this.key = dESedeKeyGenerator2.generateKey();
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(str3));
            byte[] encode2 = Hex.encode(this.key);
            bufferedOutputStream2.write(encode2, 0, encode2.length);
            bufferedOutputStream2.flush();
            bufferedOutputStream2.close();
            return;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str3));
            int available = bufferedInputStream.available();
            byte[] bArr = new byte[available];
            bufferedInputStream.read(bArr, 0, available);
            this.key = Hex.decode(bArr);
        } catch (IOException unused6) {
            PrintStream printStream4 = System.err;
            printStream4.println("Decryption key file not found, or not valid [" + str3 + "]");
            System.exit(1);
        }
    }
}