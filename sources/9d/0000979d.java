package org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class ASN1StreamParser {
    private final InputStream _in;
    private final int _limit;
    private final byte[][] tmpBuffers;

    public ASN1StreamParser(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    private void set00Check(boolean z11) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1Encodable readImplicit(boolean z11, int i11) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            if (z11) {
                return readIndef(i11);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        if (z11) {
            if (i11 == 4) {
                return new BEROctetStringParser(this);
            }
            if (i11 == 16) {
                return new DERSequenceParser(this);
            }
            if (i11 == 17) {
                return new DERSetParser(this);
            }
        } else if (i11 == 4) {
            return new DEROctetStringParser((DefiniteLengthInputStream) inputStream);
        } else {
            if (i11 == 16) {
                throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (i11 == 17) {
                throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
        }
        throw new ASN1Exception("implicit tagging not implemented");
    }

    ASN1Encodable readIndef(int i11) {
        if (i11 != 4) {
            if (i11 != 8) {
                if (i11 != 16) {
                    if (i11 == 17) {
                        return new BERSetParser(this);
                    }
                    throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i11));
                }
                return new BERSequenceParser(this);
            }
            return new DERExternalParser(this);
        }
        return new BEROctetStringParser(this);
    }

    public ASN1Encodable readObject() {
        int read = this._in.read();
        if (read == -1) {
            return null;
        }
        set00Check(false);
        int readTagNumber = ASN1InputStream.readTagNumber(this._in, read);
        boolean z11 = (read & 32) != 0;
        int readLength = ASN1InputStream.readLength(this._in, this._limit);
        if (readLength < 0) {
            if (z11) {
                ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this._in, this._limit), this._limit);
                if ((read & 64) != 0) {
                    return new BERApplicationSpecificParser(readTagNumber, aSN1StreamParser);
                }
                if ((read & 128) != 0) {
                    return new BERTaggedObjectParser(true, readTagNumber, aSN1StreamParser);
                }
                return aSN1StreamParser.readIndef(readTagNumber);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this._in, readLength);
        if ((read & 64) != 0) {
            return new DERApplicationSpecific(z11, readTagNumber, definiteLengthInputStream.toByteArray());
        }
        if ((read & 128) != 0) {
            return new BERTaggedObjectParser(z11, readTagNumber, new ASN1StreamParser(definiteLengthInputStream));
        }
        if (!z11) {
            if (readTagNumber != 4) {
                try {
                    return ASN1InputStream.createPrimitiveDERObject(readTagNumber, definiteLengthInputStream, this.tmpBuffers);
                } catch (IllegalArgumentException e11) {
                    throw new ASN1Exception("corrupted stream detected", e11);
                }
            }
            return new DEROctetStringParser(definiteLengthInputStream);
        } else if (readTagNumber != 4) {
            if (readTagNumber != 8) {
                if (readTagNumber != 16) {
                    if (readTagNumber == 17) {
                        return new DERSetParser(new ASN1StreamParser(definiteLengthInputStream));
                    }
                    throw new IOException("unknown tag " + readTagNumber + " encountered");
                }
                return new DERSequenceParser(new ASN1StreamParser(definiteLengthInputStream));
            }
            return new DERExternalParser(new ASN1StreamParser(definiteLengthInputStream));
        } else {
            return new BEROctetStringParser(new ASN1StreamParser(definiteLengthInputStream));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1Primitive readTaggedObject(boolean z11, int i11) {
        if (!z11) {
            return new DERTaggedObject(false, i11, new DEROctetString(((DefiniteLengthInputStream) this._in).toByteArray()));
        }
        ASN1EncodableVector readVector = readVector();
        if (this._in instanceof IndefiniteLengthInputStream) {
            if (readVector.size() == 1) {
                return new BERTaggedObject(true, i11, readVector.get(0));
            }
            return new BERTaggedObject(false, i11, BERFactory.createSequence(readVector));
        } else if (readVector.size() == 1) {
            return new DERTaggedObject(true, i11, readVector.get(0));
        } else {
            return new DERTaggedObject(false, i11, DERFactory.createSequence(readVector));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ASN1EncodableVector readVector() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        while (true) {
            ASN1Encodable readObject = readObject();
            if (readObject == null) {
                return aSN1EncodableVector;
            }
            if (readObject instanceof InMemoryRepresentable) {
                aSN1EncodableVector.add(((InMemoryRepresentable) readObject).getLoadedObject());
            } else {
                aSN1EncodableVector.add(readObject.toASN1Primitive());
            }
        }
    }

    public ASN1StreamParser(InputStream inputStream, int i11) {
        this._in = inputStream;
        this._limit = i11;
        this.tmpBuffers = new byte[11];
    }

    public ASN1StreamParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }
}