package org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.util.io.Streams;

/* loaded from: classes6.dex */
public class ASN1InputStream extends FilterInputStream implements BERTags {
    private final boolean lazyEvaluate;
    private final int limit;
    private final byte[][] tmpBuffers;

    public ASN1InputStream(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ASN1Primitive createPrimitiveDERObject(int i11, DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) {
        if (i11 != 10) {
            if (i11 != 12) {
                if (i11 != 30) {
                    switch (i11) {
                        case 1:
                            return ASN1Boolean.fromOctetString(getBuffer(definiteLengthInputStream, bArr));
                        case 2:
                            return new ASN1Integer(definiteLengthInputStream.toByteArray(), false);
                        case 3:
                            return ASN1BitString.fromInputStream(definiteLengthInputStream.getRemaining(), definiteLengthInputStream);
                        case 4:
                            return new DEROctetString(definiteLengthInputStream.toByteArray());
                        case 5:
                            return DERNull.INSTANCE;
                        case 6:
                            return ASN1ObjectIdentifier.fromOctetString(getBuffer(definiteLengthInputStream, bArr));
                        default:
                            switch (i11) {
                                case 18:
                                    return new DERNumericString(definiteLengthInputStream.toByteArray());
                                case 19:
                                    return new DERPrintableString(definiteLengthInputStream.toByteArray());
                                case 20:
                                    return new DERT61String(definiteLengthInputStream.toByteArray());
                                case 21:
                                    return new DERVideotexString(definiteLengthInputStream.toByteArray());
                                case 22:
                                    return new DERIA5String(definiteLengthInputStream.toByteArray());
                                case 23:
                                    return new ASN1UTCTime(definiteLengthInputStream.toByteArray());
                                case 24:
                                    return new ASN1GeneralizedTime(definiteLengthInputStream.toByteArray());
                                case 25:
                                    return new DERGraphicString(definiteLengthInputStream.toByteArray());
                                case 26:
                                    return new DERVisibleString(definiteLengthInputStream.toByteArray());
                                case 27:
                                    return new DERGeneralString(definiteLengthInputStream.toByteArray());
                                case 28:
                                    return new DERUniversalString(definiteLengthInputStream.toByteArray());
                                default:
                                    throw new IOException("unknown tag " + i11 + " encountered");
                            }
                    }
                }
                return new DERBMPString(getBMPCharBuffer(definiteLengthInputStream));
            }
            return new DERUTF8String(definiteLengthInputStream.toByteArray());
        }
        return ASN1Enumerated.fromOctetString(getBuffer(definiteLengthInputStream, bArr));
    }

    private static char[] getBMPCharBuffer(DefiniteLengthInputStream definiteLengthInputStream) {
        int read;
        int remaining = definiteLengthInputStream.getRemaining() / 2;
        char[] cArr = new char[remaining];
        for (int i11 = 0; i11 < remaining; i11++) {
            int read2 = definiteLengthInputStream.read();
            if (read2 < 0 || (read = definiteLengthInputStream.read()) < 0) {
                break;
            }
            cArr[i11] = (char) ((read2 << 8) | (read & 255));
        }
        return cArr;
    }

    private static byte[] getBuffer(DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) {
        int remaining = definiteLengthInputStream.getRemaining();
        if (definiteLengthInputStream.getRemaining() < bArr.length) {
            byte[] bArr2 = bArr[remaining];
            if (bArr2 == null) {
                bArr2 = new byte[remaining];
                bArr[remaining] = bArr2;
            }
            Streams.readFully(definiteLengthInputStream, bArr2);
            return bArr2;
        }
        return definiteLengthInputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int readTagNumber(InputStream inputStream, int i11) {
        int i12 = i11 & 31;
        if (i12 == 31) {
            int i13 = 0;
            int read = inputStream.read();
            if ((read & 127) != 0) {
                while (read >= 0 && (read & 128) != 0) {
                    i13 = (i13 | (read & 127)) << 7;
                    read = inputStream.read();
                }
                if (read >= 0) {
                    return i13 | (read & 127);
                }
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        return i12;
    }

    ASN1EncodableVector buildDEREncodableVector(DefiniteLengthInputStream definiteLengthInputStream) {
        return new ASN1InputStream(definiteLengthInputStream).buildEncodableVector();
    }

    ASN1EncodableVector buildEncodableVector() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        while (true) {
            ASN1Primitive readObject = readObject();
            if (readObject == null) {
                return aSN1EncodableVector;
            }
            aSN1EncodableVector.add(readObject);
        }
    }

    protected ASN1Primitive buildObject(int i11, int i12, int i13) {
        boolean z11 = (i11 & 32) != 0;
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this, i13);
        if ((i11 & 64) != 0) {
            return new DERApplicationSpecific(z11, i12, definiteLengthInputStream.toByteArray());
        }
        if ((i11 & 128) != 0) {
            return new ASN1StreamParser(definiteLengthInputStream).readTaggedObject(z11, i12);
        }
        if (z11) {
            if (i12 == 4) {
                ASN1EncodableVector buildDEREncodableVector = buildDEREncodableVector(definiteLengthInputStream);
                int size = buildDEREncodableVector.size();
                ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
                for (int i14 = 0; i14 != size; i14++) {
                    aSN1OctetStringArr[i14] = (ASN1OctetString) buildDEREncodableVector.get(i14);
                }
                return new BEROctetString(aSN1OctetStringArr);
            } else if (i12 != 8) {
                if (i12 == 16) {
                    if (this.lazyEvaluate) {
                        return new LazyEncodedSequence(definiteLengthInputStream.toByteArray());
                    }
                    return DERFactory.createSequence(buildDEREncodableVector(definiteLengthInputStream));
                } else if (i12 == 17) {
                    return DERFactory.createSet(buildDEREncodableVector(definiteLengthInputStream));
                } else {
                    throw new IOException("unknown tag " + i12 + " encountered");
                }
            } else {
                return new DERExternal(buildDEREncodableVector(definiteLengthInputStream));
            }
        }
        return createPrimitiveDERObject(i12, definiteLengthInputStream, this.tmpBuffers);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getLimit() {
        return this.limit;
    }

    protected void readFully(byte[] bArr) {
        if (Streams.readFully(this, bArr) != bArr.length) {
            throw new EOFException("EOF encountered in middle of object");
        }
    }

    protected int readLength() {
        return readLength(this, this.limit);
    }

    public ASN1Primitive readObject() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int readTagNumber = readTagNumber(this, read);
        boolean z11 = (read & 32) != 0;
        int readLength = readLength();
        if (readLength >= 0) {
            try {
                return buildObject(read, readTagNumber, readLength);
            } catch (IllegalArgumentException e11) {
                throw new ASN1Exception("corrupted stream detected", e11);
            }
        } else if (z11) {
            ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this, this.limit), this.limit);
            if ((read & 64) != 0) {
                return new BERApplicationSpecificParser(readTagNumber, aSN1StreamParser).getLoadedObject();
            }
            if ((read & 128) != 0) {
                return new BERTaggedObjectParser(true, readTagNumber, aSN1StreamParser).getLoadedObject();
            }
            if (readTagNumber != 4) {
                if (readTagNumber != 8) {
                    if (readTagNumber != 16) {
                        if (readTagNumber == 17) {
                            return new BERSetParser(aSN1StreamParser).getLoadedObject();
                        }
                        throw new IOException("unknown BER object encountered");
                    }
                    return new BERSequenceParser(aSN1StreamParser).getLoadedObject();
                }
                return new DERExternalParser(aSN1StreamParser).getLoadedObject();
            }
            return new BEROctetStringParser(aSN1StreamParser).getLoadedObject();
        } else {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
    }

    public ASN1InputStream(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int readLength(InputStream inputStream, int i11) {
        int read = inputStream.read();
        if (read >= 0) {
            if (read == 128) {
                return -1;
            }
            if (read > 127) {
                int i12 = read & 127;
                if (i12 > 4) {
                    throw new IOException("DER length more than 4 bytes: " + i12);
                }
                int i13 = 0;
                for (int i14 = 0; i14 < i12; i14++) {
                    int read2 = inputStream.read();
                    if (read2 < 0) {
                        throw new EOFException("EOF found reading length");
                    }
                    i13 = (i13 << 8) + read2;
                }
                if (i13 >= 0) {
                    if (i13 < i11) {
                        return i13;
                    }
                    throw new IOException("corrupted stream - out of bounds length found");
                }
                throw new IOException("corrupted stream - negative length found");
            }
            return read;
        }
        throw new EOFException("EOF found when length expected");
    }

    public ASN1InputStream(byte[] bArr, boolean z11) {
        this(new ByteArrayInputStream(bArr), bArr.length, z11);
    }

    public ASN1InputStream(InputStream inputStream, int i11) {
        this(inputStream, i11, false);
    }

    public ASN1InputStream(InputStream inputStream, boolean z11) {
        this(inputStream, StreamUtil.findLimit(inputStream), z11);
    }

    public ASN1InputStream(InputStream inputStream, int i11, boolean z11) {
        super(inputStream);
        this.limit = i11;
        this.lazyEvaluate = z11;
        this.tmpBuffers = new byte[11];
    }
}