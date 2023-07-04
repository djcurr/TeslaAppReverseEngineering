package org.spongycastle.crypto.tls;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Hashtable;
import java.util.Vector;
import okhttp3.internal.ws.WebSocketProtocol;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.x509.Extensions;
import org.spongycastle.asn1.x509.KeyUsage;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.digests.SHA224Digest;
import org.spongycastle.crypto.digests.SHA256Digest;
import org.spongycastle.crypto.digests.SHA384Digest;
import org.spongycastle.crypto.digests.SHA512Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.util.PublicKeyFactory;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;
import org.spongycastle.util.Strings;
import org.spongycastle.util.io.Streams;

/* loaded from: classes4.dex */
public class TlsUtils {
    public static final byte[] EMPTY_BYTES = new byte[0];
    public static final short[] EMPTY_SHORTS = new short[0];
    public static final int[] EMPTY_INTS = new int[0];
    public static final long[] EMPTY_LONGS = new long[0];
    public static final Integer EXT_signature_algorithms = Integers.valueOf(13);
    static final byte[] SSL_CLIENT = {67, 76, 78, 84};
    static final byte[] SSL_SERVER = {83, 82, 86, 82};
    static final byte[][] SSL3_CONST = genSSL3Const();

    public static byte[] PRF(TlsContext tlsContext, byte[] bArr, String str, byte[] bArr2, int i11) {
        if (!tlsContext.getServerVersion().isSSL()) {
            byte[] byteArray = Strings.toByteArray(str);
            byte[] concat = concat(byteArray, bArr2);
            int prfAlgorithm = tlsContext.getSecurityParameters().getPrfAlgorithm();
            if (prfAlgorithm == 0) {
                return PRF_legacy(bArr, byteArray, concat, i11);
            }
            byte[] bArr3 = new byte[i11];
            hmac_hash(createPRFHash(prfAlgorithm), bArr, concat, bArr3);
            return bArr3;
        }
        throw new IllegalStateException("No PRF available for SSLv3 session");
    }

    public static byte[] PRF_legacy(byte[] bArr, String str, byte[] bArr2, int i11) {
        byte[] byteArray = Strings.toByteArray(str);
        return PRF_legacy(bArr, byteArray, concat(byteArray, bArr2), i11);
    }

    public static void addSignatureAlgorithmsExtension(Hashtable hashtable, Vector vector) {
        hashtable.put(EXT_signature_algorithms, createSignatureAlgorithmsExtension(vector));
    }

    public static byte[] calculateKeyBlock(TlsContext tlsContext, int i11) {
        SecurityParameters securityParameters = tlsContext.getSecurityParameters();
        byte[] masterSecret = securityParameters.getMasterSecret();
        byte[] concat = concat(securityParameters.getServerRandom(), securityParameters.getClientRandom());
        if (isSSL(tlsContext)) {
            return calculateKeyBlock_SSL(masterSecret, concat, i11);
        }
        return PRF(tlsContext, masterSecret, "key expansion", concat, i11);
    }

    static byte[] calculateKeyBlock_SSL(byte[] bArr, byte[] bArr2, int i11) {
        Digest createHash = createHash((short) 1);
        Digest createHash2 = createHash((short) 2);
        int digestSize = createHash.getDigestSize();
        int digestSize2 = createHash2.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        byte[] bArr4 = new byte[i11 + digestSize];
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            byte[] bArr5 = SSL3_CONST[i13];
            createHash2.update(bArr5, 0, bArr5.length);
            createHash2.update(bArr, 0, bArr.length);
            createHash2.update(bArr2, 0, bArr2.length);
            createHash2.doFinal(bArr3, 0);
            createHash.update(bArr, 0, bArr.length);
            createHash.update(bArr3, 0, digestSize2);
            createHash.doFinal(bArr4, i12);
            i12 += digestSize;
            i13++;
        }
        return Arrays.copyOfRange(bArr4, 0, i11);
    }

    public static byte[] calculateMasterSecret(TlsContext tlsContext, byte[] bArr) {
        byte[] concat;
        SecurityParameters securityParameters = tlsContext.getSecurityParameters();
        if (securityParameters.extendedMasterSecret) {
            concat = securityParameters.getSessionHash();
        } else {
            concat = concat(securityParameters.getClientRandom(), securityParameters.getServerRandom());
        }
        if (isSSL(tlsContext)) {
            return calculateMasterSecret_SSL(bArr, concat);
        }
        return PRF(tlsContext, bArr, securityParameters.extendedMasterSecret ? ExporterLabel.extended_master_secret : "master secret", concat, 48);
    }

    static byte[] calculateMasterSecret_SSL(byte[] bArr, byte[] bArr2) {
        Digest createHash = createHash((short) 1);
        Digest createHash2 = createHash((short) 2);
        int digestSize = createHash.getDigestSize();
        int digestSize2 = createHash2.getDigestSize();
        byte[] bArr3 = new byte[digestSize2];
        byte[] bArr4 = new byte[digestSize * 3];
        int i11 = 0;
        for (int i12 = 0; i12 < 3; i12++) {
            byte[] bArr5 = SSL3_CONST[i12];
            createHash2.update(bArr5, 0, bArr5.length);
            createHash2.update(bArr, 0, bArr.length);
            createHash2.update(bArr2, 0, bArr2.length);
            createHash2.doFinal(bArr3, 0);
            createHash.update(bArr, 0, bArr.length);
            createHash.update(bArr3, 0, digestSize2);
            createHash.doFinal(bArr4, i11);
            i11 += digestSize;
        }
        return bArr4;
    }

    public static byte[] calculateVerifyData(TlsContext tlsContext, String str, byte[] bArr) {
        if (isSSL(tlsContext)) {
            return bArr;
        }
        SecurityParameters securityParameters = tlsContext.getSecurityParameters();
        return PRF(tlsContext, securityParameters.getMasterSecret(), str, bArr, securityParameters.getVerifyDataLength());
    }

    public static void checkUint16(int i11) {
        if (!isValidUint16(i11)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint24(int i11) {
        if (!isValidUint24(i11)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint32(long j11) {
        if (!isValidUint32(j11)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint48(long j11) {
        if (!isValidUint48(j11)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint64(long j11) {
        if (!isValidUint64(j11)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint8(short s11) {
        if (!isValidUint8(s11)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static Digest cloneHash(short s11, Digest digest) {
        switch (s11) {
            case 1:
                return new MD5Digest((MD5Digest) digest);
            case 2:
                return new SHA1Digest((SHA1Digest) digest);
            case 3:
                return new SHA224Digest((SHA224Digest) digest);
            case 4:
                return new SHA256Digest((SHA256Digest) digest);
            case 5:
                return new SHA384Digest((SHA384Digest) digest);
            case 6:
                return new SHA512Digest((SHA512Digest) digest);
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static Digest clonePRFHash(int i11, Digest digest) {
        if (i11 != 0) {
            return cloneHash(getHashAlgorithmForPRFAlgorithm(i11), digest);
        }
        return new CombinedHash((CombinedHash) digest);
    }

    static byte[] concat(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static Digest createHash(short s11) {
        switch (s11) {
            case 1:
                return new MD5Digest();
            case 2:
                return new SHA1Digest();
            case 3:
                return new SHA224Digest();
            case 4:
                return new SHA256Digest();
            case 5:
                return new SHA384Digest();
            case 6:
                return new SHA512Digest();
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static Digest createPRFHash(int i11) {
        if (i11 != 0) {
            return createHash(getHashAlgorithmForPRFAlgorithm(i11));
        }
        return new CombinedHash();
    }

    public static byte[] createSignatureAlgorithmsExtension(Vector vector) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        encodeSupportedSignatureAlgorithms(vector, false, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static TlsSigner createTlsSigner(short s11) {
        if (s11 != 1) {
            if (s11 != 2) {
                if (s11 == 64) {
                    return new TlsECDSASigner();
                }
                throw new IllegalArgumentException("'clientCertificateType' is not a type with signing capability");
            }
            return new TlsDSSSigner();
        }
        return new TlsRSASigner();
    }

    public static byte[] encodeOpaque8(byte[] bArr) {
        checkUint8(bArr.length);
        return Arrays.prepend(bArr, (byte) bArr.length);
    }

    public static void encodeSupportedSignatureAlgorithms(Vector vector, boolean z11, OutputStream outputStream) {
        if (vector != null && vector.size() >= 1 && vector.size() < 32768) {
            int size = vector.size() * 2;
            checkUint16(size);
            writeUint16(size, outputStream);
            for (int i11 = 0; i11 < vector.size(); i11++) {
                SignatureAndHashAlgorithm signatureAndHashAlgorithm = (SignatureAndHashAlgorithm) vector.elementAt(i11);
                if (!z11 && signatureAndHashAlgorithm.getSignature() == 0) {
                    throw new IllegalArgumentException("SignatureAlgorithm.anonymous MUST NOT appear in the signature_algorithms extension");
                }
                signatureAndHashAlgorithm.encode(outputStream);
            }
            return;
        }
        throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
    }

    public static byte[] encodeUint16ArrayWithUint16Length(int[] iArr) {
        byte[] bArr = new byte[(iArr.length * 2) + 2];
        writeUint16ArrayWithUint16Length(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] encodeUint8ArrayWithUint8Length(short[] sArr) {
        byte[] bArr = new byte[sArr.length + 1];
        writeUint8ArrayWithUint8Length(sArr, bArr, 0);
        return bArr;
    }

    private static byte[][] genSSL3Const() {
        byte[][] bArr = new byte[10];
        int i11 = 0;
        while (i11 < 10) {
            int i12 = i11 + 1;
            byte[] bArr2 = new byte[i12];
            Arrays.fill(bArr2, (byte) (i11 + 65));
            bArr[i11] = bArr2;
            i11 = i12;
        }
        return bArr;
    }

    public static int getCipherType(int i11) {
        int encryptionAlgorithm = getEncryptionAlgorithm(i11);
        switch (encryptionAlgorithm) {
            case 0:
            case 1:
            case 2:
                return 0;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 14:
                return 1;
            case 10:
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                return 2;
            default:
                switch (encryptionAlgorithm) {
                    case 102:
                    case 103:
                    case 104:
                        return 2;
                    default:
                        throw new TlsFatalAlert((short) 80);
                }
        }
    }

    public static short getClientCertificateType(Certificate certificate, Certificate certificate2) {
        if (certificate.isEmpty()) {
            return (short) -1;
        }
        org.spongycastle.asn1.x509.Certificate certificateAt = certificate.getCertificateAt(0);
        try {
            AsymmetricKeyParameter createKey = PublicKeyFactory.createKey(certificateAt.getSubjectPublicKeyInfo());
            if (!createKey.isPrivate()) {
                if (createKey instanceof RSAKeyParameters) {
                    validateKeyUsage(certificateAt, 128);
                    return (short) 1;
                } else if (createKey instanceof DSAPublicKeyParameters) {
                    validateKeyUsage(certificateAt, 128);
                    return (short) 2;
                } else if (createKey instanceof ECPublicKeyParameters) {
                    validateKeyUsage(certificateAt, 128);
                    return (short) 64;
                } else {
                    throw new TlsFatalAlert((short) 43);
                }
            }
            throw new TlsFatalAlert((short) 80);
        } catch (Exception e11) {
            throw new TlsFatalAlert((short) 43, e11);
        }
    }

    public static Vector getDefaultDSSSignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm((short) 2, (short) 2));
    }

    public static Vector getDefaultECDSASignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm((short) 2, (short) 3));
    }

    public static Vector getDefaultRSASignatureAlgorithms() {
        return vectorOfOne(new SignatureAndHashAlgorithm((short) 2, (short) 1));
    }

    public static Vector getDefaultSupportedSignatureAlgorithms() {
        short[] sArr = {2, 3, 4, 5, 6};
        short[] sArr2 = {1, 2, 3};
        Vector vector = new Vector();
        for (int i11 = 0; i11 < 3; i11++) {
            for (int i12 = 0; i12 < 5; i12++) {
                vector.addElement(new SignatureAndHashAlgorithm(sArr[i12], sArr2[i11]));
            }
        }
        return vector;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static int getEncryptionAlgorithm(int r4) {
        /*
            r0 = 1
            r1 = 0
            if (r4 == r0) goto L63
            r0 = 2
            if (r4 == r0) goto L63
            r2 = 4
            if (r4 == r2) goto L62
            r2 = 5
            if (r4 == r2) goto L62
            r2 = 12
            r3 = 13
            switch(r4) {
                case 10: goto L60;
                case 13: goto L60;
                case 16: goto L60;
                case 19: goto L60;
                case 22: goto L60;
                case 24: goto L62;
                case 168: goto L5d;
                case 169: goto L5a;
                case 170: goto L5d;
                case 171: goto L5a;
                case 172: goto L5d;
                case 173: goto L5a;
                case 174: goto L57;
                case 175: goto L54;
                case 176: goto L53;
                case 177: goto L53;
                case 178: goto L57;
                case 179: goto L54;
                case 180: goto L53;
                case 181: goto L53;
                case 182: goto L57;
                case 183: goto L54;
                case 184: goto L53;
                case 185: goto L53;
                case 186: goto L52;
                case 187: goto L52;
                case 188: goto L52;
                case 189: goto L52;
                case 190: goto L52;
                case 192: goto L51;
                case 193: goto L51;
                case 194: goto L51;
                case 195: goto L51;
                case 196: goto L51;
                case 49153: goto L63;
                case 49154: goto L62;
                case 49155: goto L60;
                case 49156: goto L57;
                case 49157: goto L54;
                case 49158: goto L63;
                case 49159: goto L62;
                case 49160: goto L60;
                case 49161: goto L57;
                case 49162: goto L54;
                case 49163: goto L63;
                case 49164: goto L62;
                case 49165: goto L60;
                case 49166: goto L57;
                case 49167: goto L54;
                case 49168: goto L63;
                case 49169: goto L62;
                case 49170: goto L60;
                case 49171: goto L57;
                case 49172: goto L54;
                case 49173: goto L63;
                case 49174: goto L62;
                case 49175: goto L60;
                case 49176: goto L57;
                case 49177: goto L54;
                case 49178: goto L60;
                case 49179: goto L60;
                case 49180: goto L60;
                case 49181: goto L57;
                case 49182: goto L57;
                case 49183: goto L57;
                case 49184: goto L54;
                case 49185: goto L54;
                case 49186: goto L54;
                case 49187: goto L57;
                case 49188: goto L54;
                case 49189: goto L57;
                case 49190: goto L54;
                case 49191: goto L57;
                case 49192: goto L54;
                case 49193: goto L57;
                case 49194: goto L54;
                case 49195: goto L5d;
                case 49196: goto L5a;
                case 49197: goto L5d;
                case 49198: goto L5a;
                case 49199: goto L5d;
                case 49200: goto L5a;
                case 49201: goto L5d;
                case 49202: goto L5a;
                case 49203: goto L62;
                case 49204: goto L60;
                case 49205: goto L57;
                case 49206: goto L54;
                case 49207: goto L57;
                case 49208: goto L54;
                case 49209: goto L63;
                case 49210: goto L53;
                case 49211: goto L53;
                case 49266: goto L52;
                case 49267: goto L51;
                case 49268: goto L52;
                case 49269: goto L51;
                case 49270: goto L52;
                case 49271: goto L51;
                case 49272: goto L52;
                case 49273: goto L51;
                case 49274: goto L4e;
                case 49275: goto L4b;
                case 49276: goto L4e;
                case 49277: goto L4b;
                case 49278: goto L4e;
                case 49279: goto L4b;
                case 49280: goto L4e;
                case 49281: goto L4b;
                case 49282: goto L4e;
                case 49283: goto L4b;
                case 49286: goto L4e;
                case 49287: goto L4b;
                case 49288: goto L4e;
                case 49289: goto L4b;
                case 49290: goto L4e;
                case 49291: goto L4b;
                case 49292: goto L4e;
                case 49293: goto L4b;
                case 49294: goto L4e;
                case 49295: goto L4b;
                case 49296: goto L4e;
                case 49297: goto L4b;
                case 49298: goto L4e;
                case 49299: goto L4b;
                case 49300: goto L52;
                case 49301: goto L51;
                case 49302: goto L52;
                case 49303: goto L51;
                case 49304: goto L52;
                case 49305: goto L51;
                case 49306: goto L52;
                case 49307: goto L51;
                case 49308: goto L48;
                case 49309: goto L45;
                case 49310: goto L48;
                case 49311: goto L45;
                case 49312: goto L42;
                case 49313: goto L3f;
                case 49314: goto L42;
                case 49315: goto L3f;
                case 49316: goto L48;
                case 49317: goto L45;
                case 49318: goto L48;
                case 49319: goto L45;
                case 49320: goto L42;
                case 49321: goto L3f;
                case 49322: goto L42;
                case 49323: goto L3f;
                case 49324: goto L48;
                case 49325: goto L45;
                case 49326: goto L42;
                case 49327: goto L3f;
                case 52392: goto L3c;
                case 52393: goto L3c;
                case 52394: goto L3c;
                case 52395: goto L3c;
                case 52396: goto L3c;
                case 52397: goto L3c;
                case 52398: goto L3c;
                case 65280: goto L39;
                case 65281: goto L36;
                case 65282: goto L39;
                case 65283: goto L36;
                case 65284: goto L39;
                case 65285: goto L36;
                case 65296: goto L39;
                case 65297: goto L36;
                case 65298: goto L39;
                case 65299: goto L36;
                case 65300: goto L39;
                case 65301: goto L36;
                default: goto L14;
            }
        L14:
            switch(r4) {
                case 44: goto L63;
                case 45: goto L63;
                case 46: goto L63;
                case 47: goto L57;
                case 48: goto L57;
                case 49: goto L57;
                case 50: goto L57;
                case 51: goto L57;
                default: goto L17;
            }
        L17:
            switch(r4) {
                case 53: goto L54;
                case 54: goto L54;
                case 55: goto L54;
                case 56: goto L54;
                case 57: goto L54;
                default: goto L1a;
            }
        L1a:
            switch(r4) {
                case 59: goto L53;
                case 60: goto L57;
                case 61: goto L54;
                case 62: goto L57;
                case 63: goto L57;
                case 64: goto L57;
                case 65: goto L35;
                case 66: goto L35;
                case 67: goto L35;
                case 68: goto L35;
                case 69: goto L35;
                default: goto L1d;
            }
        L1d:
            switch(r4) {
                case 103: goto L57;
                case 104: goto L54;
                case 105: goto L54;
                case 106: goto L54;
                case 107: goto L54;
                default: goto L20;
            }
        L20:
            switch(r4) {
                case 132: goto L34;
                case 133: goto L34;
                case 134: goto L34;
                case 135: goto L34;
                case 136: goto L34;
                default: goto L23;
            }
        L23:
            switch(r4) {
                case 138: goto L62;
                case 139: goto L60;
                case 140: goto L57;
                case 141: goto L54;
                case 142: goto L62;
                case 143: goto L60;
                case 144: goto L57;
                case 145: goto L54;
                case 146: goto L62;
                case 147: goto L60;
                case 148: goto L57;
                case 149: goto L54;
                case 150: goto L31;
                case 151: goto L31;
                case 152: goto L31;
                case 153: goto L31;
                case 154: goto L31;
                default: goto L26;
            }
        L26:
            switch(r4) {
                case 156: goto L5d;
                case 157: goto L5a;
                case 158: goto L5d;
                case 159: goto L5a;
                case 160: goto L5d;
                case 161: goto L5a;
                case 162: goto L5d;
                case 163: goto L5a;
                case 164: goto L5d;
                case 165: goto L5a;
                default: goto L29;
            }
        L29:
            org.spongycastle.crypto.tls.TlsFatalAlert r4 = new org.spongycastle.crypto.tls.TlsFatalAlert
            r0 = 80
            r4.<init>(r0)
            throw r4
        L31:
            r4 = 14
            return r4
        L34:
            return r3
        L35:
            return r2
        L36:
            r4 = 104(0x68, float:1.46E-43)
            return r4
        L39:
            r4 = 103(0x67, float:1.44E-43)
            return r4
        L3c:
            r4 = 102(0x66, float:1.43E-43)
            return r4
        L3f:
            r4 = 18
            return r4
        L42:
            r4 = 16
            return r4
        L45:
            r4 = 17
            return r4
        L48:
            r4 = 15
            return r4
        L4b:
            r4 = 20
            return r4
        L4e:
            r4 = 19
            return r4
        L51:
            return r3
        L52:
            return r2
        L53:
            return r1
        L54:
            r4 = 9
            return r4
        L57:
            r4 = 8
            return r4
        L5a:
            r4 = 11
            return r4
        L5d:
            r4 = 10
            return r4
        L60:
            r4 = 7
            return r4
        L62:
            return r0
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.tls.TlsUtils.getEncryptionAlgorithm(int):int");
    }

    public static byte[] getExtensionData(Hashtable hashtable, Integer num) {
        if (hashtable == null) {
            return null;
        }
        return (byte[]) hashtable.get(num);
    }

    public static short getHashAlgorithmForPRFAlgorithm(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return (short) 5;
                }
                throw new IllegalArgumentException("unknown PRFAlgorithm");
            }
            return (short) 4;
        }
        throw new IllegalArgumentException("legacy PRF not a valid algorithm");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:817)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:856)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:160)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:730)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:155)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:94)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0050 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getKeyExchangeAlgorithm(int r2) {
        /*
            r0 = 1
            if (r2 == r0) goto L58
            r1 = 2
            if (r2 == r1) goto L58
            r1 = 4
            if (r2 == r1) goto L58
            r1 = 5
            if (r2 == r1) goto L58
            switch(r2) {
                case 10: goto L58;
                case 13: goto L56;
                case 16: goto L53;
                case 19: goto L51;
                case 22: goto L50;
                case 168: goto L4d;
                case 169: goto L4d;
                case 170: goto L4a;
                case 171: goto L4a;
                case 172: goto L47;
                case 173: goto L47;
                case 174: goto L4d;
                case 175: goto L4d;
                case 176: goto L4d;
                case 177: goto L4d;
                case 178: goto L4a;
                case 179: goto L4a;
                case 180: goto L4a;
                case 181: goto L4a;
                case 182: goto L47;
                case 183: goto L47;
                case 184: goto L47;
                case 185: goto L47;
                case 186: goto L58;
                case 187: goto L56;
                case 188: goto L53;
                case 189: goto L51;
                case 190: goto L50;
                case 192: goto L58;
                case 193: goto L56;
                case 194: goto L53;
                case 195: goto L51;
                case 196: goto L50;
                case 49153: goto L44;
                case 49154: goto L44;
                case 49155: goto L44;
                case 49156: goto L44;
                case 49157: goto L44;
                case 49158: goto L41;
                case 49159: goto L41;
                case 49160: goto L41;
                case 49161: goto L41;
                case 49162: goto L41;
                case 49163: goto L3e;
                case 49164: goto L3e;
                case 49165: goto L3e;
                case 49166: goto L3e;
                case 49167: goto L3e;
                case 49168: goto L3b;
                case 49169: goto L3b;
                case 49170: goto L3b;
                case 49171: goto L3b;
                case 49172: goto L3b;
                case 49173: goto L38;
                case 49174: goto L38;
                case 49175: goto L38;
                case 49176: goto L38;
                case 49177: goto L38;
                case 49178: goto L35;
                case 49179: goto L32;
                case 49180: goto L2f;
                case 49181: goto L35;
                case 49182: goto L32;
                case 49183: goto L2f;
                case 49184: goto L35;
                case 49185: goto L32;
                case 49186: goto L2f;
                case 49187: goto L41;
                case 49188: goto L41;
                case 49189: goto L44;
                case 49190: goto L44;
                case 49191: goto L3b;
                case 49192: goto L3b;
                case 49193: goto L3e;
                case 49194: goto L3e;
                case 49195: goto L41;
                case 49196: goto L41;
                case 49197: goto L44;
                case 49198: goto L44;
                case 49199: goto L3b;
                case 49200: goto L3b;
                case 49201: goto L3e;
                case 49202: goto L3e;
                case 49203: goto L2c;
                case 49204: goto L2c;
                case 49205: goto L2c;
                case 49206: goto L2c;
                case 49207: goto L2c;
                case 49208: goto L2c;
                case 49209: goto L2c;
                case 49210: goto L2c;
                case 49211: goto L2c;
                case 49266: goto L41;
                case 49267: goto L41;
                case 49268: goto L44;
                case 49269: goto L44;
                case 49270: goto L3b;
                case 49271: goto L3b;
                case 49272: goto L3e;
                case 49273: goto L3e;
                case 49274: goto L58;
                case 49275: goto L58;
                case 49276: goto L50;
                case 49277: goto L50;
                case 49278: goto L53;
                case 49279: goto L53;
                case 49280: goto L51;
                case 49281: goto L51;
                case 49282: goto L56;
                case 49283: goto L56;
                case 49286: goto L41;
                case 49287: goto L41;
                case 49288: goto L44;
                case 49289: goto L44;
                case 49290: goto L3b;
                case 49291: goto L3b;
                case 49292: goto L3e;
                case 49293: goto L3e;
                case 49294: goto L4d;
                case 49295: goto L4d;
                case 49296: goto L4a;
                case 49297: goto L4a;
                case 49298: goto L47;
                case 49299: goto L47;
                case 49300: goto L4d;
                case 49301: goto L4d;
                case 49302: goto L4a;
                case 49303: goto L4a;
                case 49304: goto L47;
                case 49305: goto L47;
                case 49306: goto L2c;
                case 49307: goto L2c;
                case 49308: goto L58;
                case 49309: goto L58;
                case 49310: goto L50;
                case 49311: goto L50;
                case 49312: goto L58;
                case 49313: goto L58;
                case 49314: goto L50;
                case 49315: goto L50;
                case 49316: goto L4d;
                case 49317: goto L4d;
                case 49318: goto L4a;
                case 49319: goto L4a;
                case 49320: goto L4d;
                case 49321: goto L4d;
                case 49322: goto L4a;
                case 49323: goto L4a;
                case 49324: goto L41;
                case 49325: goto L41;
                case 49326: goto L41;
                case 49327: goto L41;
                case 52392: goto L3b;
                case 52393: goto L41;
                case 52394: goto L50;
                case 52395: goto L4d;
                case 52396: goto L2c;
                case 52397: goto L4a;
                case 52398: goto L47;
                case 65280: goto L50;
                case 65281: goto L50;
                case 65282: goto L3b;
                case 65283: goto L3b;
                case 65284: goto L41;
                case 65285: goto L41;
                case 65296: goto L4d;
                case 65297: goto L4d;
                case 65298: goto L4a;
                case 65299: goto L4a;
                case 65300: goto L2c;
                case 65301: goto L2c;
                default: goto Lf;
            }
        Lf:
            switch(r2) {
                case 44: goto L4d;
                case 45: goto L4a;
                case 46: goto L47;
                case 47: goto L58;
                case 48: goto L56;
                case 49: goto L53;
                case 50: goto L51;
                case 51: goto L50;
                default: goto L12;
            }
        L12:
            switch(r2) {
                case 53: goto L58;
                case 54: goto L56;
                case 55: goto L53;
                case 56: goto L51;
                case 57: goto L50;
                default: goto L15;
            }
        L15:
            switch(r2) {
                case 59: goto L58;
                case 60: goto L58;
                case 61: goto L58;
                case 62: goto L56;
                case 63: goto L53;
                case 64: goto L51;
                case 65: goto L58;
                case 66: goto L56;
                case 67: goto L53;
                case 68: goto L51;
                case 69: goto L50;
                default: goto L18;
            }
        L18:
            switch(r2) {
                case 103: goto L50;
                case 104: goto L56;
                case 105: goto L53;
                case 106: goto L51;
                case 107: goto L50;
                default: goto L1b;
            }
        L1b:
            switch(r2) {
                case 132: goto L58;
                case 133: goto L56;
                case 134: goto L53;
                case 135: goto L51;
                case 136: goto L50;
                default: goto L1e;
            }
        L1e:
            switch(r2) {
                case 138: goto L4d;
                case 139: goto L4d;
                case 140: goto L4d;
                case 141: goto L4d;
                case 142: goto L4a;
                case 143: goto L4a;
                case 144: goto L4a;
                case 145: goto L4a;
                case 146: goto L47;
                case 147: goto L47;
                case 148: goto L47;
                case 149: goto L47;
                case 150: goto L58;
                case 151: goto L56;
                case 152: goto L53;
                case 153: goto L51;
                case 154: goto L50;
                default: goto L21;
            }
        L21:
            switch(r2) {
                case 156: goto L58;
                case 157: goto L58;
                case 158: goto L50;
                case 159: goto L50;
                case 160: goto L53;
                case 161: goto L53;
                case 162: goto L51;
                case 163: goto L51;
                case 164: goto L56;
                case 165: goto L56;
                default: goto L24;
            }
        L24:
            org.spongycastle.crypto.tls.TlsFatalAlert r2 = new org.spongycastle.crypto.tls.TlsFatalAlert
            r0 = 80
            r2.<init>(r0)
            throw r2
        L2c:
            r2 = 24
            return r2
        L2f:
            r2 = 22
            return r2
        L32:
            r2 = 23
            return r2
        L35:
            r2 = 21
            return r2
        L38:
            r2 = 20
            return r2
        L3b:
            r2 = 19
            return r2
        L3e:
            r2 = 18
            return r2
        L41:
            r2 = 17
            return r2
        L44:
            r2 = 16
            return r2
        L47:
            r2 = 15
            return r2
        L4a:
            r2 = 14
            return r2
        L4d:
            r2 = 13
            return r2
        L50:
            return r1
        L51:
            r2 = 3
            return r2
        L53:
            r2 = 9
            return r2
        L56:
            r2 = 7
            return r2
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.crypto.tls.TlsUtils.getKeyExchangeAlgorithm(int):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int getMACAlgorithm(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 4) {
                    if (i11 != 5) {
                        switch (i11) {
                            case 10:
                            case 13:
                            case 16:
                            case 19:
                            case 22:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA /* 49153 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_RC4_128_SHA /* 49154 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49155 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA /* 49156 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA /* 49157 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_NULL_SHA /* 49158 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA /* 49159 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA /* 49160 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA /* 49161 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA /* 49162 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_NULL_SHA /* 49163 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_RC4_128_SHA /* 49164 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA /* 49165 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA /* 49166 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA /* 49167 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_NULL_SHA /* 49168 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_RC4_128_SHA /* 49169 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA /* 49170 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA /* 49171 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA /* 49172 */:
                            case CipherSuite.TLS_ECDH_anon_WITH_NULL_SHA /* 49173 */:
                            case CipherSuite.TLS_ECDH_anon_WITH_RC4_128_SHA /* 49174 */:
                            case CipherSuite.TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA /* 49175 */:
                            case CipherSuite.TLS_ECDH_anon_WITH_AES_128_CBC_SHA /* 49176 */:
                            case CipherSuite.TLS_ECDH_anon_WITH_AES_256_CBC_SHA /* 49177 */:
                            case CipherSuite.TLS_SRP_SHA_WITH_3DES_EDE_CBC_SHA /* 49178 */:
                            case CipherSuite.TLS_SRP_SHA_RSA_WITH_3DES_EDE_CBC_SHA /* 49179 */:
                            case CipherSuite.TLS_SRP_SHA_DSS_WITH_3DES_EDE_CBC_SHA /* 49180 */:
                            case CipherSuite.TLS_SRP_SHA_WITH_AES_128_CBC_SHA /* 49181 */:
                            case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_128_CBC_SHA /* 49182 */:
                            case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_128_CBC_SHA /* 49183 */:
                            case CipherSuite.TLS_SRP_SHA_WITH_AES_256_CBC_SHA /* 49184 */:
                            case CipherSuite.TLS_SRP_SHA_RSA_WITH_AES_256_CBC_SHA /* 49185 */:
                            case CipherSuite.TLS_SRP_SHA_DSS_WITH_AES_256_CBC_SHA /* 49186 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_RC4_128_SHA /* 49203 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_3DES_EDE_CBC_SHA /* 49204 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA /* 49205 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA /* 49206 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA /* 49209 */:
                                break;
                            case 168:
                            case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 /* 49195 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 /* 49196 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 /* 49197 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 /* 49198 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 /* 49199 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 /* 49200 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 /* 49201 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 /* 49202 */:
                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49274 */:
                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49275 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49276 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49277 */:
                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49278 */:
                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49279 */:
                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49280 */:
                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49281 */:
                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49282 */:
                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49283 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49286 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49287 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49288 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49289 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49290 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49291 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49292 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49293 */:
                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49294 */:
                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49295 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49296 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49297 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49298 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49299 */:
                            case CipherSuite.TLS_RSA_WITH_AES_128_CCM /* 49308 */:
                            case CipherSuite.TLS_RSA_WITH_AES_256_CCM /* 49309 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM /* 49310 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM /* 49311 */:
                            case CipherSuite.TLS_RSA_WITH_AES_128_CCM_8 /* 49312 */:
                            case CipherSuite.TLS_RSA_WITH_AES_256_CCM_8 /* 49313 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM_8 /* 49314 */:
                            case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM_8 /* 49315 */:
                            case CipherSuite.TLS_PSK_WITH_AES_128_CCM /* 49316 */:
                            case CipherSuite.TLS_PSK_WITH_AES_256_CCM /* 49317 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CCM /* 49318 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CCM /* 49319 */:
                            case CipherSuite.TLS_PSK_WITH_AES_128_CCM_8 /* 49320 */:
                            case CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 /* 49321 */:
                            case CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8 /* 49322 */:
                            case CipherSuite.TLS_PSK_DHE_WITH_AES_256_CCM_8 /* 49323 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM /* 49324 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM /* 49325 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8 /* 49326 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8 /* 49327 */:
                            case CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52392 */:
                            case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52393 */:
                            case CipherSuite.DRAFT_TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52394 */:
                            case CipherSuite.DRAFT_TLS_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52395 */:
                            case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52396 */:
                            case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52397 */:
                            case CipherSuite.DRAFT_TLS_RSA_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52398 */:
                            case CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB /* 65280 */:
                            case 65281:
                            case 65282:
                            case CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_AES_256_OCB /* 65283 */:
                            case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_128_OCB /* 65284 */:
                            case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_256_OCB /* 65285 */:
                            case CipherSuite.DRAFT_TLS_PSK_WITH_AES_128_OCB /* 65296 */:
                            case CipherSuite.DRAFT_TLS_PSK_WITH_AES_256_OCB /* 65297 */:
                            case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_AES_128_OCB /* 65298 */:
                            case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_AES_256_OCB /* 65299 */:
                            case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_128_OCB /* 65300 */:
                            case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_256_OCB /* 65301 */:
                                return 0;
                            case CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256 /* 174 */:
                            case 176:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CBC_SHA256 /* 178 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 /* 180 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256 /* 182 */:
                            case 184:
                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
                            case 188:
                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                            case 190:
                            case 192:
                            case 193:
                            case 194:
                            case 195:
                            case 196:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 /* 49187 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 /* 49189 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 /* 49191 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 /* 49193 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA256 /* 49207 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA256 /* 49210 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49266 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49268 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49270 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49272 */:
                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49300 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49302 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49304 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_128_CBC_SHA256 /* 49306 */:
                                return 3;
                            case CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 /* 175 */:
                            case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /* 177 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA384 /* 179 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384 /* 181 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384 /* 183 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA384 /* 185 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 /* 49188 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 /* 49190 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 /* 49192 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 /* 49194 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA384 /* 49208 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_NULL_SHA384 /* 49211 */:
                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49267 */:
                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49269 */:
                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49271 */:
                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49273 */:
                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49301 */:
                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49303 */:
                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49305 */:
                            case CipherSuite.TLS_ECDHE_PSK_WITH_CAMELLIA_256_CBC_SHA384 /* 49307 */:
                                return 4;
                            default:
                                switch (i11) {
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                        break;
                                    default:
                                        switch (i11) {
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 59:
                                                    case 60:
                                                    case 61:
                                                    case 62:
                                                    case 63:
                                                    case 64:
                                                        return 3;
                                                    case 65:
                                                    case 66:
                                                    case 67:
                                                    case 68:
                                                    case 69:
                                                        break;
                                                    default:
                                                        switch (i11) {
                                                            case 103:
                                                            case 104:
                                                            case 105:
                                                            case 106:
                                                            case 107:
                                                                return 3;
                                                            default:
                                                                switch (i11) {
                                                                    case 132:
                                                                    case 133:
                                                                    case 134:
                                                                    case 135:
                                                                    case 136:
                                                                        break;
                                                                    default:
                                                                        switch (i11) {
                                                                            case 138:
                                                                            case 139:
                                                                            case 140:
                                                                            case 141:
                                                                            case 142:
                                                                            case 143:
                                                                            case 144:
                                                                            case 145:
                                                                            case 146:
                                                                            case 147:
                                                                            case 148:
                                                                            case 149:
                                                                            case 150:
                                                                            case 151:
                                                                            case 152:
                                                                            case 153:
                                                                            case 154:
                                                                                break;
                                                                            default:
                                                                                switch (i11) {
                                                                                    case 156:
                                                                                    case 157:
                                                                                    case 158:
                                                                                    case 159:
                                                                                    case 160:
                                                                                    case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
                                                                                    case CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 /* 162 */:
                                                                                    case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 /* 163 */:
                                                                                    case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                                                                                    case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 /* 165 */:
                                                                                        return 0;
                                                                                    default:
                                                                                        throw new TlsFatalAlert((short) 80);
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    public static ProtocolVersion getMinimumVersion(int i11) {
        switch (i11) {
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
                break;
            default:
                switch (i11) {
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                        break;
                    default:
                        switch (i11) {
                            case 156:
                            case 157:
                            case 158:
                            case 159:
                            case 160:
                            case CipherSuite.TLS_DH_RSA_WITH_AES_256_GCM_SHA384 /* 161 */:
                            case CipherSuite.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 /* 162 */:
                            case CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 /* 163 */:
                            case CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256 /* 164 */:
                            case CipherSuite.TLS_DH_DSS_WITH_AES_256_GCM_SHA384 /* 165 */:
                                break;
                            default:
                                switch (i11) {
                                    case 168:
                                    case CipherSuite.TLS_PSK_WITH_AES_256_GCM_SHA384 /* 169 */:
                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256 /* 170 */:
                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384 /* 171 */:
                                    case CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 /* 172 */:
                                    case CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384 /* 173 */:
                                        break;
                                    default:
                                        switch (i11) {
                                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 186 */:
                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 187 */:
                                            case 188:
                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256 /* 189 */:
                                            case 190:
                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256 /* 191 */:
                                            case 192:
                                            case 193:
                                            case 194:
                                            case 195:
                                            case 196:
                                            case 197:
                                                break;
                                            default:
                                                switch (i11) {
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 /* 49187 */:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 /* 49188 */:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 /* 49189 */:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 /* 49190 */:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 /* 49191 */:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 /* 49192 */:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 /* 49193 */:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 /* 49194 */:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 /* 49195 */:
                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 /* 49196 */:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 /* 49197 */:
                                                    case CipherSuite.TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 /* 49198 */:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 /* 49199 */:
                                                    case CipherSuite.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 /* 49200 */:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 /* 49201 */:
                                                    case CipherSuite.TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 /* 49202 */:
                                                        break;
                                                    default:
                                                        switch (i11) {
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49266 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49267 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49268 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49269 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49270 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49271 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_CBC_SHA256 /* 49272 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_CBC_SHA384 /* 49273 */:
                                                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49274 */:
                                                            case CipherSuite.TLS_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49275 */:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49276 */:
                                                            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49277 */:
                                                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49278 */:
                                                            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49279 */:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49280 */:
                                                            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49281 */:
                                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_128_GCM_SHA256 /* 49282 */:
                                                            case CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_GCM_SHA384 /* 49283 */:
                                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_GCM_SHA256 /* 49284 */:
                                                            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_GCM_SHA384 /* 49285 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49286 */:
                                                            case CipherSuite.TLS_ECDHE_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49287 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49288 */:
                                                            case CipherSuite.TLS_ECDH_ECDSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49289 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49290 */:
                                                            case CipherSuite.TLS_ECDHE_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49291 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_128_GCM_SHA256 /* 49292 */:
                                                            case CipherSuite.TLS_ECDH_RSA_WITH_CAMELLIA_256_GCM_SHA384 /* 49293 */:
                                                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49294 */:
                                                            case CipherSuite.TLS_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49295 */:
                                                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49296 */:
                                                            case CipherSuite.TLS_DHE_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49297 */:
                                                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_128_GCM_SHA256 /* 49298 */:
                                                            case CipherSuite.TLS_RSA_PSK_WITH_CAMELLIA_256_GCM_SHA384 /* 49299 */:
                                                            case CipherSuite.DRAFT_TLS_PSK_WITH_AES_128_OCB /* 65296 */:
                                                            case CipherSuite.DRAFT_TLS_PSK_WITH_AES_256_OCB /* 65297 */:
                                                            case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_AES_128_OCB /* 65298 */:
                                                            case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_AES_256_OCB /* 65299 */:
                                                            case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_128_OCB /* 65300 */:
                                                            case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_AES_256_OCB /* 65301 */:
                                                                break;
                                                            default:
                                                                switch (i11) {
                                                                    case CipherSuite.TLS_RSA_WITH_AES_128_CCM /* 49308 */:
                                                                    case CipherSuite.TLS_RSA_WITH_AES_256_CCM /* 49309 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM /* 49310 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM /* 49311 */:
                                                                    case CipherSuite.TLS_RSA_WITH_AES_128_CCM_8 /* 49312 */:
                                                                    case CipherSuite.TLS_RSA_WITH_AES_256_CCM_8 /* 49313 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_128_CCM_8 /* 49314 */:
                                                                    case CipherSuite.TLS_DHE_RSA_WITH_AES_256_CCM_8 /* 49315 */:
                                                                    case CipherSuite.TLS_PSK_WITH_AES_128_CCM /* 49316 */:
                                                                    case CipherSuite.TLS_PSK_WITH_AES_256_CCM /* 49317 */:
                                                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_128_CCM /* 49318 */:
                                                                    case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CCM /* 49319 */:
                                                                    case CipherSuite.TLS_PSK_WITH_AES_128_CCM_8 /* 49320 */:
                                                                    case CipherSuite.TLS_PSK_WITH_AES_256_CCM_8 /* 49321 */:
                                                                    case CipherSuite.TLS_PSK_DHE_WITH_AES_128_CCM_8 /* 49322 */:
                                                                    case CipherSuite.TLS_PSK_DHE_WITH_AES_256_CCM_8 /* 49323 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM /* 49324 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM /* 49325 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_128_CCM_8 /* 49326 */:
                                                                    case CipherSuite.TLS_ECDHE_ECDSA_WITH_AES_256_CCM_8 /* 49327 */:
                                                                        break;
                                                                    default:
                                                                        switch (i11) {
                                                                            case CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52392 */:
                                                                            case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 /* 52393 */:
                                                                            case CipherSuite.DRAFT_TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 /* 52394 */:
                                                                            case CipherSuite.DRAFT_TLS_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52395 */:
                                                                            case CipherSuite.DRAFT_TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52396 */:
                                                                            case CipherSuite.DRAFT_TLS_DHE_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52397 */:
                                                                            case CipherSuite.DRAFT_TLS_RSA_PSK_WITH_CHACHA20_POLY1305_SHA256 /* 52398 */:
                                                                                break;
                                                                            default:
                                                                                switch (i11) {
                                                                                    case CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB /* 65280 */:
                                                                                    case 65281:
                                                                                    case 65282:
                                                                                    case CipherSuite.DRAFT_TLS_ECDHE_RSA_WITH_AES_256_OCB /* 65283 */:
                                                                                    case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_128_OCB /* 65284 */:
                                                                                    case CipherSuite.DRAFT_TLS_ECDHE_ECDSA_WITH_AES_256_OCB /* 65285 */:
                                                                                        break;
                                                                                    default:
                                                                                        return ProtocolVersion.SSLv3;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
        return ProtocolVersion.TLSv12;
    }

    public static ASN1ObjectIdentifier getOIDForHashAlgorithm(short s11) {
        switch (s11) {
            case 1:
                return PKCSObjectIdentifiers.md5;
            case 2:
                return X509ObjectIdentifiers.id_SHA1;
            case 3:
                return NISTObjectIdentifiers.id_sha224;
            case 4:
                return NISTObjectIdentifiers.id_sha256;
            case 5:
                return NISTObjectIdentifiers.id_sha384;
            case 6:
                return NISTObjectIdentifiers.id_sha512;
            default:
                throw new IllegalArgumentException("unknown HashAlgorithm");
        }
    }

    public static Vector getSignatureAlgorithmsExtension(Hashtable hashtable) {
        byte[] extensionData = getExtensionData(hashtable, EXT_signature_algorithms);
        if (extensionData == null) {
            return null;
        }
        return readSignatureAlgorithmsExtension(extensionData);
    }

    public static SignatureAndHashAlgorithm getSignatureAndHashAlgorithm(TlsContext tlsContext, TlsSignerCredentials tlsSignerCredentials) {
        if (isTLSv12(tlsContext)) {
            SignatureAndHashAlgorithm signatureAndHashAlgorithm = tlsSignerCredentials.getSignatureAndHashAlgorithm();
            if (signatureAndHashAlgorithm != null) {
                return signatureAndHashAlgorithm;
            }
            throw new TlsFatalAlert((short) 80);
        }
        return null;
    }

    public static boolean hasExpectedEmptyExtensionData(Hashtable hashtable, Integer num, short s11) {
        byte[] extensionData = getExtensionData(hashtable, num);
        if (extensionData == null) {
            return false;
        }
        if (extensionData.length == 0) {
            return true;
        }
        throw new TlsFatalAlert(s11);
    }

    public static boolean hasSigningCapability(short s11) {
        return s11 == 1 || s11 == 2 || s11 == 64;
    }

    static void hmac_hash(Digest digest, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        HMac hMac = new HMac(digest);
        hMac.init(new KeyParameter(bArr));
        int digestSize = digest.getDigestSize();
        int length = ((bArr3.length + digestSize) - 1) / digestSize;
        int macSize = hMac.getMacSize();
        byte[] bArr4 = new byte[macSize];
        byte[] bArr5 = new byte[hMac.getMacSize()];
        byte[] bArr6 = bArr2;
        int i11 = 0;
        while (i11 < length) {
            hMac.update(bArr6, 0, bArr6.length);
            hMac.doFinal(bArr4, 0);
            hMac.update(bArr4, 0, macSize);
            hMac.update(bArr2, 0, bArr2.length);
            hMac.doFinal(bArr5, 0);
            int i12 = digestSize * i11;
            System.arraycopy(bArr5, 0, bArr3, i12, Math.min(digestSize, bArr3.length - i12));
            i11++;
            bArr6 = bArr4;
        }
    }

    public static TlsSession importSession(byte[] bArr, SessionParameters sessionParameters) {
        return new TlsSessionImpl(bArr, sessionParameters);
    }

    public static boolean isAEADCipherSuite(int i11) {
        return 2 == getCipherType(i11);
    }

    public static boolean isBlockCipherSuite(int i11) {
        return 1 == getCipherType(i11);
    }

    public static boolean isSSL(TlsContext tlsContext) {
        return tlsContext.getServerVersion().isSSL();
    }

    public static boolean isSignatureAlgorithmsExtensionAllowed(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isStreamCipherSuite(int i11) {
        return getCipherType(i11) == 0;
    }

    public static boolean isTLSv11(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv11.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isTLSv12(ProtocolVersion protocolVersion) {
        return ProtocolVersion.TLSv12.isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isValidCipherSuiteForVersion(int i11, ProtocolVersion protocolVersion) {
        return getMinimumVersion(i11).isEqualOrEarlierVersionOf(protocolVersion.getEquivalentTLSVersion());
    }

    public static boolean isValidUint16(int i11) {
        return (65535 & i11) == i11;
    }

    public static boolean isValidUint16(long j11) {
        return (WebSocketProtocol.PAYLOAD_SHORT_MAX & j11) == j11;
    }

    public static boolean isValidUint24(int i11) {
        return (16777215 & i11) == i11;
    }

    public static boolean isValidUint24(long j11) {
        return (16777215 & j11) == j11;
    }

    public static boolean isValidUint32(long j11) {
        return (4294967295L & j11) == j11;
    }

    public static boolean isValidUint48(long j11) {
        return (281474976710655L & j11) == j11;
    }

    public static boolean isValidUint64(long j11) {
        return true;
    }

    public static boolean isValidUint8(int i11) {
        return (i11 & 255) == i11;
    }

    public static boolean isValidUint8(long j11) {
        return (255 & j11) == j11;
    }

    public static boolean isValidUint8(short s11) {
        return (s11 & 255) == s11;
    }

    public static Vector parseSupportedSignatureAlgorithms(boolean z11, InputStream inputStream) {
        int readUint16 = readUint16(inputStream);
        if (readUint16 >= 2 && (readUint16 & 1) == 0) {
            int i11 = readUint16 / 2;
            Vector vector = new Vector(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                SignatureAndHashAlgorithm parse = SignatureAndHashAlgorithm.parse(inputStream);
                if (!z11 && parse.getSignature() == 0) {
                    throw new TlsFatalAlert((short) 47);
                }
                vector.addElement(parse);
            }
            return vector;
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static ASN1Primitive readASN1Object(byte[] bArr) {
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        ASN1Primitive readObject = aSN1InputStream.readObject();
        if (readObject != null) {
            if (aSN1InputStream.readObject() == null) {
                return readObject;
            }
            throw new TlsFatalAlert((short) 50);
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static byte[] readAllOrNothing(int i11, InputStream inputStream) {
        if (i11 < 1) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i11];
        int readFully = Streams.readFully(inputStream, bArr);
        if (readFully == 0) {
            return null;
        }
        if (readFully == i11) {
            return bArr;
        }
        throw new EOFException();
    }

    public static ASN1Primitive readDERObject(byte[] bArr) {
        ASN1Primitive readASN1Object = readASN1Object(bArr);
        if (Arrays.areEqual(readASN1Object.getEncoded(ASN1Encoding.DER), bArr)) {
            return readASN1Object;
        }
        throw new TlsFatalAlert((short) 50);
    }

    public static byte[] readFully(int i11, InputStream inputStream) {
        if (i11 < 1) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i11];
        if (i11 == Streams.readFully(inputStream, bArr)) {
            return bArr;
        }
        throw new EOFException();
    }

    public static byte[] readOpaque16(InputStream inputStream) {
        return readFully(readUint16(inputStream), inputStream);
    }

    public static byte[] readOpaque24(InputStream inputStream) {
        return readFully(readUint24(inputStream), inputStream);
    }

    public static byte[] readOpaque8(InputStream inputStream) {
        return readFully(readUint8(inputStream), inputStream);
    }

    public static Vector readSignatureAlgorithmsExtension(byte[] bArr) {
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Vector parseSupportedSignatureAlgorithms = parseSupportedSignatureAlgorithms(false, byteArrayInputStream);
            TlsProtocol.assertEmpty(byteArrayInputStream);
            return parseSupportedSignatureAlgorithms;
        }
        throw new IllegalArgumentException("'extensionData' cannot be null");
    }

    public static int readUint16(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 >= 0) {
            return read2 | (read << 8);
        }
        throw new EOFException();
    }

    public static int[] readUint16Array(int i11, InputStream inputStream) {
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = readUint16(inputStream);
        }
        return iArr;
    }

    public static int readUint24(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        if (read3 >= 0) {
            return read3 | (read << 16) | (read2 << 8);
        }
        throw new EOFException();
    }

    public static long readUint32(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        if (read4 >= 0) {
            return (read4 | (read << 24) | (read2 << 16) | (read3 << 8)) & 4294967295L;
        }
        throw new EOFException();
    }

    public static long readUint48(InputStream inputStream) {
        return ((readUint24(inputStream) & 4294967295L) << 24) | (4294967295L & readUint24(inputStream));
    }

    public static short readUint8(InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            return (short) read;
        }
        throw new EOFException();
    }

    public static short[] readUint8Array(int i11, InputStream inputStream) {
        short[] sArr = new short[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            sArr[i12] = readUint8(inputStream);
        }
        return sArr;
    }

    public static ProtocolVersion readVersion(byte[] bArr, int i11) {
        return ProtocolVersion.get(bArr[i11] & 255, bArr[i11 + 1] & 255);
    }

    public static int readVersionRaw(byte[] bArr, int i11) {
        return bArr[i11 + 1] | (bArr[i11] << 8);
    }

    public static void trackHashAlgorithms(TlsHandshakeHash tlsHandshakeHash, Vector vector) {
        if (vector != null) {
            for (int i11 = 0; i11 < vector.size(); i11++) {
                short hash = ((SignatureAndHashAlgorithm) vector.elementAt(i11)).getHash();
                if (!HashAlgorithm.isPrivate(hash)) {
                    tlsHandshakeHash.trackHashAlgorithm(hash);
                }
            }
        }
    }

    public static void validateKeyUsage(org.spongycastle.asn1.x509.Certificate certificate, int i11) {
        KeyUsage fromExtensions;
        Extensions extensions = certificate.getTBSCertificate().getExtensions();
        if (extensions != null && (fromExtensions = KeyUsage.fromExtensions(extensions)) != null && (fromExtensions.getBytes()[0] & 255 & i11) != i11) {
            throw new TlsFatalAlert((short) 46);
        }
    }

    private static Vector vectorOfOne(Object obj) {
        Vector vector = new Vector(1);
        vector.addElement(obj);
        return vector;
    }

    public static void verifySupportedSignatureAlgorithm(Vector vector, SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (vector == null || vector.size() < 1 || vector.size() >= 32768) {
            throw new IllegalArgumentException("'supportedSignatureAlgorithms' must have length from 1 to (2^15 - 1)");
        }
        if (signatureAndHashAlgorithm != null) {
            if (signatureAndHashAlgorithm.getSignature() != 0) {
                for (int i11 = 0; i11 < vector.size(); i11++) {
                    SignatureAndHashAlgorithm signatureAndHashAlgorithm2 = (SignatureAndHashAlgorithm) vector.elementAt(i11);
                    if (signatureAndHashAlgorithm2.getHash() == signatureAndHashAlgorithm.getHash() && signatureAndHashAlgorithm2.getSignature() == signatureAndHashAlgorithm.getSignature()) {
                        return;
                    }
                }
            }
            throw new TlsFatalAlert((short) 47);
        }
        throw new IllegalArgumentException("'signatureAlgorithm' cannot be null");
    }

    public static void writeGMTUnixTime(byte[] bArr, int i11) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        bArr[i11] = (byte) (currentTimeMillis >>> 24);
        bArr[i11 + 1] = (byte) (currentTimeMillis >>> 16);
        bArr[i11 + 2] = (byte) (currentTimeMillis >>> 8);
        bArr[i11 + 3] = (byte) currentTimeMillis;
    }

    public static void writeOpaque16(byte[] bArr, OutputStream outputStream) {
        checkUint16(bArr.length);
        writeUint16(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeOpaque24(byte[] bArr, OutputStream outputStream) {
        checkUint24(bArr.length);
        writeUint24(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeOpaque8(byte[] bArr, OutputStream outputStream) {
        checkUint8(bArr.length);
        writeUint8(bArr.length, outputStream);
        outputStream.write(bArr);
    }

    public static void writeUint16(int i11, OutputStream outputStream) {
        outputStream.write(i11 >>> 8);
        outputStream.write(i11);
    }

    public static void writeUint16Array(int[] iArr, OutputStream outputStream) {
        for (int i11 : iArr) {
            writeUint16(i11, outputStream);
        }
    }

    public static void writeUint16ArrayWithUint16Length(int[] iArr, OutputStream outputStream) {
        int length = iArr.length * 2;
        checkUint16(length);
        writeUint16(length, outputStream);
        writeUint16Array(iArr, outputStream);
    }

    public static void writeUint24(int i11, OutputStream outputStream) {
        outputStream.write((byte) (i11 >>> 16));
        outputStream.write((byte) (i11 >>> 8));
        outputStream.write((byte) i11);
    }

    public static void writeUint32(long j11, OutputStream outputStream) {
        outputStream.write((byte) (j11 >>> 24));
        outputStream.write((byte) (j11 >>> 16));
        outputStream.write((byte) (j11 >>> 8));
        outputStream.write((byte) j11);
    }

    public static void writeUint48(long j11, OutputStream outputStream) {
        outputStream.write((byte) (j11 >>> 40));
        outputStream.write((byte) (j11 >>> 32));
        outputStream.write((byte) (j11 >>> 24));
        outputStream.write((byte) (j11 >>> 16));
        outputStream.write((byte) (j11 >>> 8));
        outputStream.write((byte) j11);
    }

    public static void writeUint64(long j11, OutputStream outputStream) {
        outputStream.write((byte) (j11 >>> 56));
        outputStream.write((byte) (j11 >>> 48));
        outputStream.write((byte) (j11 >>> 40));
        outputStream.write((byte) (j11 >>> 32));
        outputStream.write((byte) (j11 >>> 24));
        outputStream.write((byte) (j11 >>> 16));
        outputStream.write((byte) (j11 >>> 8));
        outputStream.write((byte) j11);
    }

    public static void writeUint8(short s11, OutputStream outputStream) {
        outputStream.write(s11);
    }

    public static void writeUint8Array(short[] sArr, OutputStream outputStream) {
        for (short s11 : sArr) {
            writeUint8(s11, outputStream);
        }
    }

    public static void writeUint8ArrayWithUint8Length(short[] sArr, OutputStream outputStream) {
        checkUint8(sArr.length);
        writeUint8(sArr.length, outputStream);
        writeUint8Array(sArr, outputStream);
    }

    public static void writeVersion(ProtocolVersion protocolVersion, OutputStream outputStream) {
        outputStream.write(protocolVersion.getMajorVersion());
        outputStream.write(protocolVersion.getMinorVersion());
    }

    public static boolean isTLSv11(TlsContext tlsContext) {
        return isTLSv11(tlsContext.getServerVersion());
    }

    public static boolean isTLSv12(TlsContext tlsContext) {
        return isTLSv12(tlsContext.getServerVersion());
    }

    public static ProtocolVersion readVersion(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 >= 0) {
            return ProtocolVersion.get(read, read2);
        }
        throw new EOFException();
    }

    public static int readVersionRaw(InputStream inputStream) {
        int read = inputStream.read();
        int read2 = inputStream.read();
        if (read2 >= 0) {
            return read2 | (read << 8);
        }
        throw new EOFException();
    }

    public static void writeUint8(int i11, OutputStream outputStream) {
        outputStream.write(i11);
    }

    public static void checkUint16(long j11) {
        if (!isValidUint16(j11)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint24(long j11) {
        if (!isValidUint24(j11)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void checkUint8(int i11) {
        if (!isValidUint8(i11)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static long readUint48(byte[] bArr, int i11) {
        int readUint24 = readUint24(bArr, i11);
        return (readUint24(bArr, i11 + 3) & 4294967295L) | ((readUint24 & 4294967295L) << 24);
    }

    public static short readUint8(byte[] bArr, int i11) {
        return (short) (bArr[i11] & 255);
    }

    public static void writeUint16(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >>> 8);
        bArr[i12 + 1] = (byte) i11;
    }

    public static void writeUint16Array(int[] iArr, byte[] bArr, int i11) {
        for (int i12 : iArr) {
            writeUint16(i12, bArr, i11);
            i11 += 2;
        }
    }

    public static void writeUint8(short s11, byte[] bArr, int i11) {
        bArr[i11] = (byte) s11;
    }

    public static void writeUint8Array(short[] sArr, byte[] bArr, int i11) {
        for (short s11 : sArr) {
            writeUint8(s11, bArr, i11);
            i11++;
        }
    }

    public static void writeVersion(ProtocolVersion protocolVersion, byte[] bArr, int i11) {
        bArr[i11] = (byte) protocolVersion.getMajorVersion();
        bArr[i11 + 1] = (byte) protocolVersion.getMinorVersion();
    }

    static byte[] PRF_legacy(byte[] bArr, byte[] bArr2, byte[] bArr3, int i11) {
        int length = (bArr.length + 1) / 2;
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr, 0, bArr4, 0, length);
        System.arraycopy(bArr, bArr.length - length, bArr5, 0, length);
        byte[] bArr6 = new byte[i11];
        byte[] bArr7 = new byte[i11];
        hmac_hash(createHash((short) 1), bArr4, bArr3, bArr6);
        hmac_hash(createHash((short) 2), bArr5, bArr3, bArr7);
        for (int i12 = 0; i12 < i11; i12++) {
            bArr6[i12] = (byte) (bArr6[i12] ^ bArr7[i12]);
        }
        return bArr6;
    }

    public static int readUint16(byte[] bArr, int i11) {
        return (bArr[i11 + 1] & 255) | ((bArr[i11] & 255) << 8);
    }

    public static void writeUint24(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) (i11 >>> 16);
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) i11;
    }

    public static void writeUint8(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
    }

    public static void writeUint8ArrayWithUint8Length(short[] sArr, byte[] bArr, int i11) {
        checkUint8(sArr.length);
        writeUint8(sArr.length, bArr, i11);
        writeUint8Array(sArr, bArr, i11 + 1);
    }

    public static void checkUint8(long j11) {
        if (!isValidUint8(j11)) {
            throw new TlsFatalAlert((short) 80);
        }
    }

    public static void readFully(byte[] bArr, InputStream inputStream) {
        int length = bArr.length;
        if (length > 0 && length != Streams.readFully(inputStream, bArr)) {
            throw new EOFException();
        }
    }

    public static int readUint24(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        return (bArr[i12 + 1] & 255) | ((bArr[i11] & 255) << 16) | ((bArr[i12] & 255) << 8);
    }

    public static void writeUint16ArrayWithUint16Length(int[] iArr, byte[] bArr, int i11) {
        int length = iArr.length * 2;
        checkUint16(length);
        writeUint16(length, bArr, i11);
        writeUint16Array(iArr, bArr, i11 + 2);
    }

    public static void writeUint32(long j11, byte[] bArr, int i11) {
        bArr[i11] = (byte) (j11 >>> 24);
        bArr[i11 + 1] = (byte) (j11 >>> 16);
        bArr[i11 + 2] = (byte) (j11 >>> 8);
        bArr[i11 + 3] = (byte) j11;
    }

    public static long readUint32(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        return ((bArr[i13 + 1] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i12] & 255) << 16) | ((bArr[i13] & 255) << 8)) & 4294967295L;
    }

    public static void writeUint48(long j11, byte[] bArr, int i11) {
        bArr[i11] = (byte) (j11 >>> 40);
        bArr[i11 + 1] = (byte) (j11 >>> 32);
        bArr[i11 + 2] = (byte) (j11 >>> 24);
        bArr[i11 + 3] = (byte) (j11 >>> 16);
        bArr[i11 + 4] = (byte) (j11 >>> 8);
        bArr[i11 + 5] = (byte) j11;
    }

    public static Digest createHash(SignatureAndHashAlgorithm signatureAndHashAlgorithm) {
        if (signatureAndHashAlgorithm == null) {
            return new CombinedHash();
        }
        return createHash(signatureAndHashAlgorithm.getHash());
    }

    public static void writeUint64(long j11, byte[] bArr, int i11) {
        bArr[i11] = (byte) (j11 >>> 56);
        bArr[i11 + 1] = (byte) (j11 >>> 48);
        bArr[i11 + 2] = (byte) (j11 >>> 40);
        bArr[i11 + 3] = (byte) (j11 >>> 32);
        bArr[i11 + 4] = (byte) (j11 >>> 24);
        bArr[i11 + 5] = (byte) (j11 >>> 16);
        bArr[i11 + 6] = (byte) (j11 >>> 8);
        bArr[i11 + 7] = (byte) j11;
    }
}