package org.bouncycastle.jcajce.provider.keystore.util;

import i60.c;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchProviderException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.crypto.p;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.util.a;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import r70.m;

/* loaded from: classes5.dex */
public class JKSKeyStoreSpi extends KeyStoreSpi {
    private static final String NOT_IMPLEMENTED_MESSAGE = "BC JKS store is read-only and only supports certificate entries";
    private final Hashtable<String, BCJKSTrustedCertEntry> certificateEntries = new Hashtable<>();
    private final c helper;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class BCJKSTrustedCertEntry {
        final Certificate cert;
        final Date date;

        public BCJKSTrustedCertEntry(Date date, Certificate certificate) {
            this.date = date;
            this.cert = certificate;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class ErasableByteStream extends ByteArrayInputStream {
        public ErasableByteStream(byte[] bArr, int i11, int i12) {
            super(bArr, i11, i12);
        }

        public void erase() {
            a.y(((ByteArrayInputStream) this).buf, (byte) 0);
        }
    }

    public JKSKeyStoreSpi(c cVar) {
        this.helper = cVar;
    }

    private void addPassword(p pVar, char[] cArr) {
        for (int i11 = 0; i11 < cArr.length; i11++) {
            pVar.update((byte) (cArr[i11] >> '\b'));
            pVar.update((byte) cArr[i11]);
        }
        pVar.update(m.f("Mighty Aphrodite"), 0, 16);
    }

    private CertificateFactory createCertFactory(String str) {
        c cVar = this.helper;
        if (cVar != null) {
            try {
                return cVar.createCertificateFactory(str);
            } catch (NoSuchProviderException e11) {
                throw new CertificateException(e11.toString());
            }
        }
        return CertificateFactory.getInstance(str);
    }

    private ErasableByteStream validateStream(InputStream inputStream, char[] cArr) {
        p digest = DigestFactory.getDigest(McElieceCCA2KeyGenParameterSpec.SHA1);
        byte[] c11 = t70.a.c(inputStream);
        if (cArr != null) {
            addPassword(digest, cArr);
            digest.update(c11, 0, c11.length - digest.getDigestSize());
            int digestSize = digest.getDigestSize();
            byte[] bArr = new byte[digestSize];
            digest.doFinal(bArr, 0);
            byte[] bArr2 = new byte[digestSize];
            System.arraycopy(c11, c11.length - digestSize, bArr2, 0, digestSize);
            if (a.u(bArr, bArr2)) {
                return new ErasableByteStream(c11, 0, c11.length - digestSize);
            }
            a.y(c11, (byte) 0);
            throw new IOException("password incorrect or store tampered with");
        }
        return new ErasableByteStream(c11, 0, c11.length - digest.getDigestSize());
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        Enumeration<String> keys;
        synchronized (this.certificateEntries) {
            keys = this.certificateEntries.keys();
        }
        return keys;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        boolean containsKey;
        Objects.requireNonNull(str, "alias value is null");
        synchronized (this.certificateEntries) {
            containsKey = this.certificateEntries.containsKey(str);
        }
        return containsKey;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        throw new KeyStoreException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        synchronized (this.certificateEntries) {
            BCJKSTrustedCertEntry bCJKSTrustedCertEntry = this.certificateEntries.get(str);
            if (bCJKSTrustedCertEntry != null) {
                return bCJKSTrustedCertEntry.cert;
            }
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        synchronized (this.certificateEntries) {
            for (Map.Entry<String, BCJKSTrustedCertEntry> entry : this.certificateEntries.entrySet()) {
                if (entry.getValue().cert.equals(certificate)) {
                    return entry.getKey();
                }
            }
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        synchronized (this.certificateEntries) {
            BCJKSTrustedCertEntry bCJKSTrustedCertEntry = this.certificateEntries.get(str);
            if (bCJKSTrustedCertEntry != null) {
                return bCJKSTrustedCertEntry.date;
            }
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        boolean containsKey;
        synchronized (this.certificateEntries) {
            containsKey = this.certificateEntries.containsKey(str);
        }
        return containsKey;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) {
        Hashtable hashtable;
        if (inputStream == null) {
            return;
        }
        ErasableByteStream validateStream = validateStream(inputStream, cArr);
        synchronized (this.certificateEntries) {
            DataInputStream dataInputStream = new DataInputStream(validateStream);
            int readInt = dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            if (readInt == -17957139) {
                CertificateFactory certificateFactory = null;
                int i11 = 2;
                if (readInt2 == 1) {
                    hashtable = null;
                    certificateFactory = createCertFactory("X.509");
                } else if (readInt2 != 2) {
                    throw new IllegalStateException("unable to discern store version");
                } else {
                    hashtable = new Hashtable();
                }
                int readInt3 = dataInputStream.readInt();
                int i12 = 0;
                while (i12 < readInt3) {
                    int readInt4 = dataInputStream.readInt();
                    if (readInt4 == 1) {
                        throw new IOException(NOT_IMPLEMENTED_MESSAGE);
                    }
                    if (readInt4 != i11) {
                        throw new IllegalStateException("unable to discern entry type");
                    }
                    String readUTF = dataInputStream.readUTF();
                    Date date = new Date(dataInputStream.readLong());
                    if (readInt2 == i11) {
                        String readUTF2 = dataInputStream.readUTF();
                        if (hashtable.containsKey(readUTF2)) {
                            certificateFactory = (CertificateFactory) hashtable.get(readUTF2);
                        } else {
                            CertificateFactory createCertFactory = createCertFactory(readUTF2);
                            hashtable.put(readUTF2, createCertFactory);
                            certificateFactory = createCertFactory;
                        }
                    }
                    int readInt5 = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt5];
                    dataInputStream.readFully(bArr);
                    ErasableByteStream erasableByteStream = new ErasableByteStream(bArr, 0, readInt5);
                    try {
                        Certificate generateCertificate = certificateFactory.generateCertificate(erasableByteStream);
                        if (erasableByteStream.available() != 0) {
                            throw new IOException("password incorrect or store tampered with");
                        }
                        erasableByteStream.erase();
                        this.certificateEntries.put(readUTF, new BCJKSTrustedCertEntry(date, generateCertificate));
                        i12++;
                        i11 = 2;
                    } catch (Throwable th2) {
                        erasableByteStream.erase();
                        throw th2;
                    }
                }
            }
            if (validateStream.available() != 0) {
                throw new IOException("password incorrect or store tampered with");
            }
            validateStream.erase();
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else if (loadStoreParameter instanceof e60.c) {
            engineLoad(((e60.c) loadStoreParameter).a(), ParameterUtil.extractPassword(loadStoreParameter));
        } else {
            throw new IllegalArgumentException("no support for 'param' of type " + loadStoreParameter.getClass().getName());
        }
    }

    public boolean engineProbe(InputStream inputStream) {
        DataInputStream dataInputStream = inputStream instanceof DataInputStream ? (DataInputStream) inputStream : new DataInputStream(inputStream);
        int readInt = dataInputStream.readInt();
        int readInt2 = dataInputStream.readInt();
        return readInt == -17957139 && (readInt2 == 1 || readInt2 == 2);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) {
        throw new KeyStoreException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        throw new KeyStoreException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        throw new KeyStoreException(NOT_IMPLEMENTED_MESSAGE);
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.certificateEntries.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) {
        throw new IOException(NOT_IMPLEMENTED_MESSAGE);
    }
}