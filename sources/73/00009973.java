package org.spongycastle.asn1.x509;

import java.io.IOException;
import java.util.StringTokenizer;
import org.spongycastle.asn1.ASN1Choice;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Object;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.ASN1TaggedObject;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.DERTaggedObject;
import org.spongycastle.asn1.x500.X500Name;
import org.spongycastle.util.IPAddress;

/* loaded from: classes5.dex */
public class GeneralName extends ASN1Object implements ASN1Choice {
    public static final int dNSName = 2;
    public static final int directoryName = 4;
    public static final int ediPartyName = 5;
    public static final int iPAddress = 7;
    public static final int otherName = 0;
    public static final int registeredID = 8;
    public static final int rfc822Name = 1;
    public static final int uniformResourceIdentifier = 6;
    public static final int x400Address = 3;
    private ASN1Encodable obj;
    private int tag;

    public GeneralName(X509Name x509Name) {
        this.obj = X500Name.getInstance(x509Name);
        this.tag = 4;
    }

    private void copyInts(int[] iArr, byte[] bArr, int i11) {
        for (int i12 = 0; i12 != iArr.length; i12++) {
            int i13 = i12 * 2;
            bArr[i13 + i11] = (byte) (iArr[i12] >> 8);
            bArr[i13 + 1 + i11] = (byte) iArr[i12];
        }
    }

    public static GeneralName getInstance(Object obj) {
        if (obj != null && !(obj instanceof GeneralName)) {
            if (obj instanceof ASN1TaggedObject) {
                ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
                int tagNo = aSN1TaggedObject.getTagNo();
                switch (tagNo) {
                    case 0:
                        return new GeneralName(tagNo, ASN1Sequence.getInstance(aSN1TaggedObject, false));
                    case 1:
                        return new GeneralName(tagNo, DERIA5String.getInstance(aSN1TaggedObject, false));
                    case 2:
                        return new GeneralName(tagNo, DERIA5String.getInstance(aSN1TaggedObject, false));
                    case 3:
                        throw new IllegalArgumentException("unknown tag: " + tagNo);
                    case 4:
                        return new GeneralName(tagNo, X500Name.getInstance(aSN1TaggedObject, true));
                    case 5:
                        return new GeneralName(tagNo, ASN1Sequence.getInstance(aSN1TaggedObject, false));
                    case 6:
                        return new GeneralName(tagNo, DERIA5String.getInstance(aSN1TaggedObject, false));
                    case 7:
                        return new GeneralName(tagNo, ASN1OctetString.getInstance(aSN1TaggedObject, false));
                    case 8:
                        return new GeneralName(tagNo, ASN1ObjectIdentifier.getInstance(aSN1TaggedObject, false));
                }
            }
            if (obj instanceof byte[]) {
                try {
                    return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
                } catch (IOException unused) {
                    throw new IllegalArgumentException("unable to parse encoded general name");
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        return (GeneralName) obj;
    }

    private void parseIPv4(String str, byte[] bArr, int i11) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "./");
        int i12 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i12 + i11] = (byte) Integer.parseInt(stringTokenizer.nextToken());
            i12++;
        }
    }

    private void parseIPv4Mask(String str, byte[] bArr, int i11) {
        int parseInt = Integer.parseInt(str);
        for (int i12 = 0; i12 != parseInt; i12++) {
            int i13 = (i12 / 8) + i11;
            bArr[i13] = (byte) (bArr[i13] | (1 << (7 - (i12 % 8))));
        }
    }

    private int[] parseIPv6(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ":", true);
        int[] iArr = new int[8];
        if (str.charAt(0) == ':' && str.charAt(1) == ':') {
            stringTokenizer.nextToken();
        }
        int i11 = -1;
        int i12 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals(":")) {
                iArr[i12] = 0;
                int i13 = i12;
                i12++;
                i11 = i13;
            } else if (nextToken.indexOf(46) < 0) {
                int i14 = i12 + 1;
                iArr[i12] = Integer.parseInt(nextToken, 16);
                if (stringTokenizer.hasMoreTokens()) {
                    stringTokenizer.nextToken();
                }
                i12 = i14;
            } else {
                StringTokenizer stringTokenizer2 = new StringTokenizer(nextToken, ".");
                int i15 = i12 + 1;
                iArr[i12] = (Integer.parseInt(stringTokenizer2.nextToken()) << 8) | Integer.parseInt(stringTokenizer2.nextToken());
                i12 = i15 + 1;
                iArr[i15] = Integer.parseInt(stringTokenizer2.nextToken()) | (Integer.parseInt(stringTokenizer2.nextToken()) << 8);
            }
        }
        if (i12 != 8) {
            int i16 = i12 - i11;
            int i17 = 8 - i16;
            System.arraycopy(iArr, i11, iArr, i17, i16);
            while (i11 != i17) {
                iArr[i11] = 0;
                i11++;
            }
        }
        return iArr;
    }

    private int[] parseMask(String str) {
        int[] iArr = new int[8];
        int parseInt = Integer.parseInt(str);
        for (int i11 = 0; i11 != parseInt; i11++) {
            int i12 = i11 / 16;
            iArr[i12] = iArr[i12] | (1 << (15 - (i11 % 16)));
        }
        return iArr;
    }

    private byte[] toGeneralNameEncoding(String str) {
        int[] parseMask;
        if (!IPAddress.isValidIPv6WithNetmask(str) && !IPAddress.isValidIPv6(str)) {
            if (IPAddress.isValidIPv4WithNetmask(str) || IPAddress.isValidIPv4(str)) {
                int indexOf = str.indexOf(47);
                if (indexOf < 0) {
                    byte[] bArr = new byte[4];
                    parseIPv4(str, bArr, 0);
                    return bArr;
                }
                byte[] bArr2 = new byte[8];
                parseIPv4(str.substring(0, indexOf), bArr2, 0);
                String substring = str.substring(indexOf + 1);
                if (substring.indexOf(46) > 0) {
                    parseIPv4(substring, bArr2, 4);
                } else {
                    parseIPv4Mask(substring, bArr2, 4);
                }
                return bArr2;
            }
            return null;
        }
        int indexOf2 = str.indexOf(47);
        if (indexOf2 < 0) {
            byte[] bArr3 = new byte[16];
            copyInts(parseIPv6(str), bArr3, 0);
            return bArr3;
        }
        byte[] bArr4 = new byte[32];
        copyInts(parseIPv6(str.substring(0, indexOf2)), bArr4, 0);
        String substring2 = str.substring(indexOf2 + 1);
        if (substring2.indexOf(58) > 0) {
            parseMask = parseIPv6(substring2);
        } else {
            parseMask = parseMask(substring2);
        }
        copyInts(parseMask, bArr4, 16);
        return bArr4;
    }

    public ASN1Encodable getName() {
        return this.obj;
    }

    public int getTagNo() {
        return this.tag;
    }

    @Override // org.spongycastle.asn1.ASN1Object, org.spongycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        if (this.tag == 4) {
            return new DERTaggedObject(true, this.tag, this.obj);
        }
        return new DERTaggedObject(false, this.tag, this.obj);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.tag);
        stringBuffer.append(": ");
        int i11 = this.tag;
        if (i11 != 1 && i11 != 2) {
            if (i11 == 4) {
                stringBuffer.append(X500Name.getInstance(this.obj).toString());
            } else if (i11 != 6) {
                stringBuffer.append(this.obj.toString());
            }
            return stringBuffer.toString();
        }
        stringBuffer.append(DERIA5String.getInstance(this.obj).getString());
        return stringBuffer.toString();
    }

    public GeneralName(X500Name x500Name) {
        this.obj = x500Name;
        this.tag = 4;
    }

    public GeneralName(int i11, ASN1Encodable aSN1Encodable) {
        this.obj = aSN1Encodable;
        this.tag = i11;
    }

    public GeneralName(int i11, String str) {
        this.tag = i11;
        if (i11 == 1 || i11 == 2 || i11 == 6) {
            this.obj = new DERIA5String(str);
        } else if (i11 == 8) {
            this.obj = new ASN1ObjectIdentifier(str);
        } else if (i11 == 4) {
            this.obj = new X500Name(str);
        } else if (i11 == 7) {
            byte[] generalNameEncoding = toGeneralNameEncoding(str);
            if (generalNameEncoding != null) {
                this.obj = new DEROctetString(generalNameEncoding);
                return;
            }
            throw new IllegalArgumentException("IP Address is invalid");
        } else {
            throw new IllegalArgumentException("can't process String for tag: " + i11);
        }
    }

    public static GeneralName getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z11) {
        return getInstance(ASN1TaggedObject.getInstance(aSN1TaggedObject, true));
    }
}