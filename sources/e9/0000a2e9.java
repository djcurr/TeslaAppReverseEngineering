package org.spongycastle.openssl;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.cms.ContentInfo;
import org.spongycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.pkcs.RSAPrivateKey;
import org.spongycastle.asn1.pkcs.RSAPublicKey;
import org.spongycastle.asn1.sec.ECPrivateKey;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DSAParameter;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.asn1.x9.X9ObjectIdentifiers;
import org.spongycastle.cert.X509AttributeCertificateHolder;
import org.spongycastle.cert.X509CRLHolder;
import org.spongycastle.cert.X509CertificateHolder;
import org.spongycastle.pkcs.PKCS10CertificationRequest;
import org.spongycastle.pkcs.PKCS8EncryptedPrivateKeyInfo;
import org.spongycastle.util.encoders.Hex;
import org.spongycastle.util.io.pem.PemHeader;
import org.spongycastle.util.io.pem.PemObject;
import org.spongycastle.util.io.pem.PemObjectParser;
import org.spongycastle.util.io.pem.PemReader;

/* loaded from: classes4.dex */
public class PEMParser extends PemReader {
    private final Map parsers;

    /* loaded from: classes4.dex */
    private class DSAKeyPairParser implements PEMKeyPairParser {
        private DSAKeyPairParser() {
        }

        @Override // org.spongycastle.openssl.PEMKeyPairParser
        public PEMKeyPair parse(byte[] bArr) {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
                if (aSN1Sequence.size() == 6) {
                    ASN1Integer aSN1Integer = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
                    ASN1Integer aSN1Integer2 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(2));
                    ASN1Integer aSN1Integer3 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(3));
                    ASN1Integer aSN1Integer4 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(4));
                    ASN1Integer aSN1Integer5 = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(5));
                    ASN1ObjectIdentifier aSN1ObjectIdentifier = X9ObjectIdentifiers.id_dsa;
                    return new PEMKeyPair(new SubjectPublicKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, new DSAParameter(aSN1Integer.getValue(), aSN1Integer2.getValue(), aSN1Integer3.getValue())), aSN1Integer4), new PrivateKeyInfo(new AlgorithmIdentifier(aSN1ObjectIdentifier, new DSAParameter(aSN1Integer.getValue(), aSN1Integer2.getValue(), aSN1Integer3.getValue())), aSN1Integer5));
                }
                throw new PEMException("malformed sequence in DSA private key");
            } catch (IOException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new PEMException("problem creating DSA private key: " + e12.toString(), e12);
            }
        }
    }

    /* loaded from: classes4.dex */
    private class ECCurveParamsParser implements PemObjectParser {
        private ECCurveParamsParser() {
        }

        @Override // org.spongycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                ASN1Primitive fromByteArray = ASN1Primitive.fromByteArray(pemObject.getContent());
                if (fromByteArray instanceof ASN1ObjectIdentifier) {
                    return ASN1Primitive.fromByteArray(pemObject.getContent());
                }
                if (fromByteArray instanceof ASN1Sequence) {
                    return X9ECParameters.getInstance(fromByteArray);
                }
                return null;
            } catch (IOException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new PEMException("exception extracting EC named curve: " + e12.toString());
            }
        }
    }

    /* loaded from: classes4.dex */
    private class ECDSAKeyPairParser implements PEMKeyPairParser {
        private ECDSAKeyPairParser() {
        }

        @Override // org.spongycastle.openssl.PEMKeyPairParser
        public PEMKeyPair parse(byte[] bArr) {
            try {
                ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(ASN1Sequence.getInstance(bArr));
                AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, eCPrivateKey.getParameters());
                return new PEMKeyPair(new SubjectPublicKeyInfo(algorithmIdentifier, eCPrivateKey.getPublicKey().getBytes()), new PrivateKeyInfo(algorithmIdentifier, eCPrivateKey));
            } catch (IOException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new PEMException("problem creating EC private key: " + e12.toString(), e12);
            }
        }
    }

    /* loaded from: classes4.dex */
    private class EncryptedPrivateKeyParser implements PemObjectParser {
        public EncryptedPrivateKeyParser() {
        }

        @Override // org.spongycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return new PKCS8EncryptedPrivateKeyInfo(EncryptedPrivateKeyInfo.getInstance(pemObject.getContent()));
            } catch (Exception e11) {
                throw new PEMException("problem parsing ENCRYPTED PRIVATE KEY: " + e11.toString(), e11);
            }
        }
    }

    /* loaded from: classes4.dex */
    private class KeyPairParser implements PemObjectParser {
        private final PEMKeyPairParser pemKeyPairParser;

        public KeyPairParser(PEMKeyPairParser pEMKeyPairParser) {
            this.pemKeyPairParser = pEMKeyPairParser;
        }

        @Override // org.spongycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            boolean z11 = false;
            String str = null;
            for (PemHeader pemHeader : pemObject.getHeaders()) {
                if (pemHeader.getName().equals("Proc-Type") && pemHeader.getValue().equals("4,ENCRYPTED")) {
                    z11 = true;
                } else if (pemHeader.getName().equals("DEK-Info")) {
                    str = pemHeader.getValue();
                }
            }
            byte[] content = pemObject.getContent();
            try {
                if (z11) {
                    StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
                    return new PEMEncryptedKeyPair(stringTokenizer.nextToken(), Hex.decode(stringTokenizer.nextToken()), content, this.pemKeyPairParser);
                }
                return this.pemKeyPairParser.parse(content);
            } catch (IOException e11) {
                if (z11) {
                    throw new PEMException("exception decoding - please check password and data.", e11);
                }
                throw new PEMException(e11.getMessage(), e11);
            } catch (IllegalArgumentException e12) {
                if (z11) {
                    throw new PEMException("exception decoding - please check password and data.", e12);
                }
                throw new PEMException(e12.getMessage(), e12);
            }
        }
    }

    /* loaded from: classes4.dex */
    private class PKCS10CertificationRequestParser implements PemObjectParser {
        private PKCS10CertificationRequestParser() {
        }

        @Override // org.spongycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return new PKCS10CertificationRequest(pemObject.getContent());
            } catch (Exception e11) {
                throw new PEMException("problem parsing certrequest: " + e11.toString(), e11);
            }
        }
    }

    /* loaded from: classes4.dex */
    private class PKCS7Parser implements PemObjectParser {
        private PKCS7Parser() {
        }

        @Override // org.spongycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return ContentInfo.getInstance(new ASN1InputStream(pemObject.getContent()).readObject());
            } catch (Exception e11) {
                throw new PEMException("problem parsing PKCS7 object: " + e11.toString(), e11);
            }
        }
    }

    /* loaded from: classes4.dex */
    private class PrivateKeyParser implements PemObjectParser {
        public PrivateKeyParser() {
        }

        @Override // org.spongycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return PrivateKeyInfo.getInstance(pemObject.getContent());
            } catch (Exception e11) {
                throw new PEMException("problem parsing PRIVATE KEY: " + e11.toString(), e11);
            }
        }
    }

    /* loaded from: classes4.dex */
    private class PublicKeyParser implements PemObjectParser {
        public PublicKeyParser() {
        }

        @Override // org.spongycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            return SubjectPublicKeyInfo.getInstance(pemObject.getContent());
        }
    }

    /* loaded from: classes4.dex */
    private class RSAKeyPairParser implements PEMKeyPairParser {
        private RSAKeyPairParser() {
        }

        @Override // org.spongycastle.openssl.PEMKeyPairParser
        public PEMKeyPair parse(byte[] bArr) {
            try {
                ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(bArr);
                if (aSN1Sequence.size() == 9) {
                    RSAPrivateKey rSAPrivateKey = RSAPrivateKey.getInstance(aSN1Sequence);
                    RSAPublicKey rSAPublicKey = new RSAPublicKey(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent());
                    AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE);
                    return new PEMKeyPair(new SubjectPublicKeyInfo(algorithmIdentifier, rSAPublicKey), new PrivateKeyInfo(algorithmIdentifier, rSAPrivateKey));
                }
                throw new PEMException("malformed sequence in RSA private key");
            } catch (IOException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new PEMException("problem creating RSA private key: " + e12.toString(), e12);
            }
        }
    }

    /* loaded from: classes4.dex */
    private class RSAPublicKeyParser implements PemObjectParser {
        public RSAPublicKeyParser() {
        }

        @Override // org.spongycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), RSAPublicKey.getInstance(pemObject.getContent()));
            } catch (IOException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new PEMException("problem extracting key: " + e12.toString(), e12);
            }
        }
    }

    /* loaded from: classes4.dex */
    private class X509AttributeCertificateParser implements PemObjectParser {
        private X509AttributeCertificateParser() {
        }

        @Override // org.spongycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            return new X509AttributeCertificateHolder(pemObject.getContent());
        }
    }

    /* loaded from: classes4.dex */
    private class X509CRLParser implements PemObjectParser {
        private X509CRLParser() {
        }

        @Override // org.spongycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return new X509CRLHolder(pemObject.getContent());
            } catch (Exception e11) {
                throw new PEMException("problem parsing cert: " + e11.toString(), e11);
            }
        }
    }

    /* loaded from: classes4.dex */
    private class X509CertificateParser implements PemObjectParser {
        private X509CertificateParser() {
        }

        @Override // org.spongycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return new X509CertificateHolder(pemObject.getContent());
            } catch (Exception e11) {
                throw new PEMException("problem parsing cert: " + e11.toString(), e11);
            }
        }
    }

    /* loaded from: classes4.dex */
    private class X509TrustedCertificateParser implements PemObjectParser {
        private X509TrustedCertificateParser() {
        }

        @Override // org.spongycastle.util.io.pem.PemObjectParser
        public Object parseObject(PemObject pemObject) {
            try {
                return new X509TrustedCertificateBlock(pemObject.getContent());
            } catch (Exception e11) {
                throw new PEMException("problem parsing cert: " + e11.toString(), e11);
            }
        }
    }

    public PEMParser(Reader reader) {
        super(reader);
        HashMap hashMap = new HashMap();
        this.parsers = hashMap;
        hashMap.put("CERTIFICATE REQUEST", new PKCS10CertificationRequestParser());
        hashMap.put("NEW CERTIFICATE REQUEST", new PKCS10CertificationRequestParser());
        hashMap.put("CERTIFICATE", new X509CertificateParser());
        hashMap.put("TRUSTED CERTIFICATE", new X509TrustedCertificateParser());
        hashMap.put("X509 CERTIFICATE", new X509CertificateParser());
        hashMap.put("X509 CRL", new X509CRLParser());
        hashMap.put("PKCS7", new PKCS7Parser());
        hashMap.put("CMS", new PKCS7Parser());
        hashMap.put("ATTRIBUTE CERTIFICATE", new X509AttributeCertificateParser());
        hashMap.put("EC PARAMETERS", new ECCurveParamsParser());
        hashMap.put("PUBLIC KEY", new PublicKeyParser());
        hashMap.put("RSA PUBLIC KEY", new RSAPublicKeyParser());
        hashMap.put("RSA PRIVATE KEY", new KeyPairParser(new RSAKeyPairParser()));
        hashMap.put("DSA PRIVATE KEY", new KeyPairParser(new DSAKeyPairParser()));
        hashMap.put("EC PRIVATE KEY", new KeyPairParser(new ECDSAKeyPairParser()));
        hashMap.put("ENCRYPTED PRIVATE KEY", new EncryptedPrivateKeyParser());
        hashMap.put("PRIVATE KEY", new PrivateKeyParser());
    }

    public Object readObject() {
        PemObject readPemObject = readPemObject();
        if (readPemObject != null) {
            String type = readPemObject.getType();
            if (this.parsers.containsKey(type)) {
                return ((PemObjectParser) this.parsers.get(type)).parseObject(readPemObject);
            }
            throw new IOException("unrecognised object: " + type);
        }
        return null;
    }
}