package org.spongycastle.asn1.x500.style;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1Encoding;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.ASN1String;
import org.spongycastle.asn1.DERUniversalString;
import org.spongycastle.asn1.x500.AttributeTypeAndValue;
import org.spongycastle.asn1.x500.RDN;
import org.spongycastle.asn1.x500.X500NameBuilder;
import org.spongycastle.asn1.x500.X500NameStyle;
import org.spongycastle.util.Strings;
import org.spongycastle.util.encoders.Hex;

/* loaded from: classes5.dex */
public class IETFUtils {
    public static void appendRDN(StringBuffer stringBuffer, RDN rdn, Hashtable hashtable) {
        if (rdn.isMultiValued()) {
            AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
            boolean z11 = true;
            for (int i11 = 0; i11 != typesAndValues.length; i11++) {
                if (z11) {
                    z11 = false;
                } else {
                    stringBuffer.append('+');
                }
                appendTypeAndValue(stringBuffer, typesAndValues[i11], hashtable);
            }
        } else if (rdn.getFirst() != null) {
            appendTypeAndValue(stringBuffer, rdn.getFirst(), hashtable);
        }
    }

    public static void appendTypeAndValue(StringBuffer stringBuffer, AttributeTypeAndValue attributeTypeAndValue, Hashtable hashtable) {
        String str = (String) hashtable.get(attributeTypeAndValue.getType());
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(attributeTypeAndValue.getType().getId());
        }
        stringBuffer.append('=');
        stringBuffer.append(valueToString(attributeTypeAndValue.getValue()));
    }

    private static boolean atvAreEqual(AttributeTypeAndValue attributeTypeAndValue, AttributeTypeAndValue attributeTypeAndValue2) {
        if (attributeTypeAndValue == attributeTypeAndValue2) {
            return true;
        }
        return attributeTypeAndValue != null && attributeTypeAndValue2 != null && attributeTypeAndValue.getType().equals(attributeTypeAndValue2.getType()) && canonicalize(valueToString(attributeTypeAndValue.getValue())).equals(canonicalize(valueToString(attributeTypeAndValue2.getValue())));
    }

    private static String bytesToString(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i11 = 0; i11 != length; i11++) {
            cArr[i11] = (char) (bArr[i11] & 255);
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        if (r0 >= (r6.length() - 1)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String canonicalize(java.lang.String r6) {
        /*
            java.lang.String r6 = org.spongycastle.util.Strings.toLowerCase(r6)
            int r0 = r6.length()
            r1 = 0
            if (r0 <= 0) goto L25
            char r0 = r6.charAt(r1)
            r2 = 35
            if (r0 != r2) goto L25
            org.spongycastle.asn1.ASN1Primitive r0 = decodeObject(r6)
            boolean r2 = r0 instanceof org.spongycastle.asn1.ASN1String
            if (r2 == 0) goto L25
            org.spongycastle.asn1.ASN1String r0 = (org.spongycastle.asn1.ASN1String) r0
            java.lang.String r6 = r0.getString()
            java.lang.String r6 = org.spongycastle.util.Strings.toLowerCase(r6)
        L25:
            int r0 = r6.length()
            r2 = 1
            if (r0 <= r2) goto L6d
        L2c:
            int r0 = r1 + 1
            int r3 = r6.length()
            r4 = 32
            r5 = 92
            if (r0 >= r3) goto L47
            char r3 = r6.charAt(r1)
            if (r3 != r5) goto L47
            char r0 = r6.charAt(r0)
            if (r0 != r4) goto L47
            int r1 = r1 + 2
            goto L2c
        L47:
            int r0 = r6.length()
            int r0 = r0 - r2
        L4c:
            int r3 = r0 + (-1)
            if (r3 <= 0) goto L5f
            char r3 = r6.charAt(r3)
            if (r3 != r5) goto L5f
            char r3 = r6.charAt(r0)
            if (r3 != r4) goto L5f
            int r0 = r0 + (-2)
            goto L4c
        L5f:
            if (r1 > 0) goto L68
            int r3 = r6.length()
            int r3 = r3 - r2
            if (r0 >= r3) goto L6d
        L68:
            int r0 = r0 + r2
            java.lang.String r6 = r6.substring(r1, r0)
        L6d:
            java.lang.String r6 = stripInternalSpaces(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.asn1.x500.style.IETFUtils.canonicalize(java.lang.String):java.lang.String");
    }

    private static int convertHex(char c11) {
        if ('0' > c11 || c11 > '9') {
            return (('a' > c11 || c11 > 'f') ? c11 - 'A' : c11 - 'a') + 10;
        }
        return c11 - '0';
    }

    public static ASN1ObjectIdentifier decodeAttrName(String str, Hashtable hashtable) {
        if (Strings.toUpperCase(str).startsWith("OID.")) {
            return new ASN1ObjectIdentifier(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new ASN1ObjectIdentifier(str);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) hashtable.get(Strings.toLowerCase(str));
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException("Unknown object id - " + str + " - passed to distinguished name");
    }

    private static ASN1Primitive decodeObject(String str) {
        try {
            return ASN1Primitive.fromByteArray(Hex.decode(str.substring(1)));
        } catch (IOException e11) {
            throw new IllegalStateException("unknown encoding in name: " + e11);
        }
    }

    public static String[] findAttrNamesForOID(ASN1ObjectIdentifier aSN1ObjectIdentifier, Hashtable hashtable) {
        Enumeration elements = hashtable.elements();
        int i11 = 0;
        int i12 = 0;
        while (elements.hasMoreElements()) {
            if (aSN1ObjectIdentifier.equals(elements.nextElement())) {
                i12++;
            }
        }
        String[] strArr = new String[i12];
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            if (aSN1ObjectIdentifier.equals(hashtable.get(str))) {
                strArr[i11] = str;
                i11++;
            }
        }
        return strArr;
    }

    private static boolean isHexDigit(char c11) {
        return ('0' <= c11 && c11 <= '9') || ('a' <= c11 && c11 <= 'f') || ('A' <= c11 && c11 <= 'F');
    }

    public static boolean rDNAreEqual(RDN rdn, RDN rdn2) {
        if (rdn.isMultiValued()) {
            if (rdn2.isMultiValued()) {
                AttributeTypeAndValue[] typesAndValues = rdn.getTypesAndValues();
                AttributeTypeAndValue[] typesAndValues2 = rdn2.getTypesAndValues();
                if (typesAndValues.length != typesAndValues2.length) {
                    return false;
                }
                for (int i11 = 0; i11 != typesAndValues.length; i11++) {
                    if (!atvAreEqual(typesAndValues[i11], typesAndValues2[i11])) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } else if (rdn2.isMultiValued()) {
            return false;
        } else {
            return atvAreEqual(rdn.getFirst(), rdn2.getFirst());
        }
    }

    public static RDN[] rDNsFromString(String str, X500NameStyle x500NameStyle) {
        X500NameTokenizer x500NameTokenizer = new X500NameTokenizer(str);
        X500NameBuilder x500NameBuilder = new X500NameBuilder(x500NameStyle);
        while (x500NameTokenizer.hasMoreTokens()) {
            String nextToken = x500NameTokenizer.nextToken();
            if (nextToken.indexOf(43) > 0) {
                X500NameTokenizer x500NameTokenizer2 = new X500NameTokenizer(nextToken, '+');
                X500NameTokenizer x500NameTokenizer3 = new X500NameTokenizer(x500NameTokenizer2.nextToken(), '=');
                String nextToken2 = x500NameTokenizer3.nextToken();
                if (x500NameTokenizer3.hasMoreTokens()) {
                    String nextToken3 = x500NameTokenizer3.nextToken();
                    ASN1ObjectIdentifier attrNameToOID = x500NameStyle.attrNameToOID(nextToken2.trim());
                    if (x500NameTokenizer2.hasMoreTokens()) {
                        Vector vector = new Vector();
                        Vector vector2 = new Vector();
                        vector.addElement(attrNameToOID);
                        vector2.addElement(unescape(nextToken3));
                        while (x500NameTokenizer2.hasMoreTokens()) {
                            X500NameTokenizer x500NameTokenizer4 = new X500NameTokenizer(x500NameTokenizer2.nextToken(), '=');
                            String nextToken4 = x500NameTokenizer4.nextToken();
                            if (x500NameTokenizer4.hasMoreTokens()) {
                                String nextToken5 = x500NameTokenizer4.nextToken();
                                vector.addElement(x500NameStyle.attrNameToOID(nextToken4.trim()));
                                vector2.addElement(unescape(nextToken5));
                            } else {
                                throw new IllegalArgumentException("badly formatted directory string");
                            }
                        }
                        x500NameBuilder.addMultiValuedRDN(toOIDArray(vector), toValueArray(vector2));
                    } else {
                        x500NameBuilder.addRDN(attrNameToOID, unescape(nextToken3));
                    }
                } else {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
            } else {
                X500NameTokenizer x500NameTokenizer5 = new X500NameTokenizer(nextToken, '=');
                String nextToken6 = x500NameTokenizer5.nextToken();
                if (x500NameTokenizer5.hasMoreTokens()) {
                    x500NameBuilder.addRDN(x500NameStyle.attrNameToOID(nextToken6.trim()), unescape(x500NameTokenizer5.nextToken()));
                } else {
                    throw new IllegalArgumentException("badly formatted directory string");
                }
            }
        }
        return x500NameBuilder.build().getRDNs();
    }

    public static String stripInternalSpaces(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i11 = 1;
            while (i11 < str.length()) {
                char charAt2 = str.charAt(i11);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i11++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    private static ASN1ObjectIdentifier[] toOIDArray(Vector vector) {
        int size = vector.size();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        for (int i11 = 0; i11 != size; i11++) {
            aSN1ObjectIdentifierArr[i11] = (ASN1ObjectIdentifier) vector.elementAt(i11);
        }
        return aSN1ObjectIdentifierArr;
    }

    private static String[] toValueArray(Vector vector) {
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i11 = 0; i11 != size; i11++) {
            strArr[i11] = (String) vector.elementAt(i11);
        }
        return strArr;
    }

    private static String unescape(String str) {
        int i11;
        if (str.length() != 0 && (str.indexOf(92) >= 0 || str.indexOf(34) >= 0)) {
            char[] charArray = str.toCharArray();
            StringBuffer stringBuffer = new StringBuffer(str.length());
            if (charArray[0] == '\\' && charArray[1] == '#') {
                i11 = 2;
                stringBuffer.append("\\#");
            } else {
                i11 = 0;
            }
            boolean z11 = false;
            int i12 = 0;
            boolean z12 = false;
            boolean z13 = false;
            char c11 = 0;
            while (i11 != charArray.length) {
                char c12 = charArray[i11];
                if (c12 != ' ') {
                    z13 = true;
                }
                if (c12 != '\"') {
                    if (c12 == '\\' && !z11 && !z12) {
                        i12 = stringBuffer.length();
                        z11 = true;
                    } else if (c12 != ' ' || z11 || z13) {
                        if (!z11 || !isHexDigit(c12)) {
                            stringBuffer.append(c12);
                        } else if (c11 != 0) {
                            stringBuffer.append((char) ((convertHex(c11) * 16) + convertHex(c12)));
                            z11 = false;
                            c11 = 0;
                        } else {
                            c11 = c12;
                        }
                    }
                    i11++;
                } else if (z11) {
                    stringBuffer.append(c12);
                } else {
                    z12 = !z12;
                }
                z11 = false;
                i11++;
            }
            if (stringBuffer.length() > 0) {
                while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i12 != stringBuffer.length() - 1) {
                    stringBuffer.setLength(stringBuffer.length() - 1);
                }
            }
            return stringBuffer.toString();
        }
        return str.trim();
    }

    public static ASN1Encodable valueFromHexString(String str, int i11) {
        int length = (str.length() - i11) / 2;
        byte[] bArr = new byte[length];
        for (int i12 = 0; i12 != length; i12++) {
            int i13 = (i12 * 2) + i11;
            char charAt = str.charAt(i13);
            bArr[i12] = (byte) (convertHex(str.charAt(i13 + 1)) | (convertHex(charAt) << 4));
        }
        return ASN1Primitive.fromByteArray(bArr);
    }

    public static String valueToString(ASN1Encodable aSN1Encodable) {
        StringBuffer stringBuffer = new StringBuffer();
        if ((aSN1Encodable instanceof ASN1String) && !(aSN1Encodable instanceof DERUniversalString)) {
            String string = ((ASN1String) aSN1Encodable).getString();
            if (string.length() > 0 && string.charAt(0) == '#') {
                stringBuffer.append("\\" + string);
            } else {
                stringBuffer.append(string);
            }
        } else {
            try {
                stringBuffer.append("#" + bytesToString(Hex.encode(aSN1Encodable.toASN1Primitive().getEncoded(ASN1Encoding.DER))));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        }
        int length = stringBuffer.length();
        int i11 = 2;
        i11 = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 0 : 0;
        while (i11 != length) {
            if (stringBuffer.charAt(i11) == ',' || stringBuffer.charAt(i11) == '\"' || stringBuffer.charAt(i11) == '\\' || stringBuffer.charAt(i11) == '+' || stringBuffer.charAt(i11) == '=' || stringBuffer.charAt(i11) == '<' || stringBuffer.charAt(i11) == '>' || stringBuffer.charAt(i11) == ';') {
                stringBuffer.insert(i11, "\\");
                i11++;
                length++;
            }
            i11++;
        }
        if (stringBuffer.length() > 0) {
            for (int i12 = 0; stringBuffer.length() > i12 && stringBuffer.charAt(i12) == ' '; i12 += 2) {
                stringBuffer.insert(i12, "\\");
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, CoreConstants.ESCAPE_CHAR);
        }
        return stringBuffer.toString();
    }
}