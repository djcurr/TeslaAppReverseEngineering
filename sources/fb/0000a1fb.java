package org.spongycastle.jce.provider;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.spongycastle.asn1.ASN1OctetString;
import org.spongycastle.asn1.ASN1Sequence;
import org.spongycastle.asn1.DERIA5String;
import org.spongycastle.asn1.x509.GeneralName;
import org.spongycastle.asn1.x509.GeneralSubtree;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Integers;
import org.spongycastle.util.Strings;

/* loaded from: classes4.dex */
public class PKIXNameConstraintValidator {
    private Set permittedSubtreesDN;
    private Set permittedSubtreesDNS;
    private Set permittedSubtreesEmail;
    private Set permittedSubtreesIP;
    private Set permittedSubtreesURI;
    private Set excludedSubtreesDN = new HashSet();
    private Set excludedSubtreesDNS = new HashSet();
    private Set excludedSubtreesEmail = new HashSet();
    private Set excludedSubtreesURI = new HashSet();
    private Set excludedSubtreesIP = new HashSet();

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkExcludedDNS(java.util.Set r3, java.lang.String r4) {
        /*
            r2 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = r2.withinDomain(r4, r0)
            if (r1 != 0) goto L24
            boolean r0 = r4.equalsIgnoreCase(r0)
            if (r0 != 0) goto L24
            goto Lb
        L24:
            org.spongycastle.jce.provider.PKIXNameConstraintValidatorException r3 = new org.spongycastle.jce.provider.PKIXNameConstraintValidatorException
            java.lang.String r4 = "DNS is from an excluded subtree."
            r3.<init>(r4)
            throw r3
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.PKIXNameConstraintValidator.checkExcludedDNS(java.util.Set, java.lang.String):void");
    }

    private void checkExcludedEmail(Set set, String str) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (emailIsConstrained(str, (String) it2.next())) {
                throw new PKIXNameConstraintValidatorException("Email address is from an excluded subtree.");
            }
        }
    }

    private void checkExcludedIP(Set set, byte[] bArr) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (isIPConstrained(bArr, (byte[]) it2.next())) {
                throw new PKIXNameConstraintValidatorException("IP is from an excluded subtree.");
            }
        }
    }

    private void checkExcludedURI(Set set, String str) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (isUriConstrained(str, (String) it2.next())) {
                throw new PKIXNameConstraintValidatorException("URI is from an excluded subtree.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void checkPermittedDNS(java.util.Set r4, java.lang.String r5) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.util.Iterator r0 = r4.iterator()
        L7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r3.withinDomain(r5, r1)
            if (r2 != 0) goto L1f
            boolean r1 = r5.equalsIgnoreCase(r1)
            if (r1 == 0) goto L7
        L1f:
            return
        L20:
            int r5 = r5.length()
            if (r5 != 0) goto L2d
            int r4 = r4.size()
            if (r4 != 0) goto L2d
            return
        L2d:
            org.spongycastle.jce.provider.PKIXNameConstraintValidatorException r4 = new org.spongycastle.jce.provider.PKIXNameConstraintValidatorException
            java.lang.String r5 = "DNS is not from a permitted subtree."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.spongycastle.jce.provider.PKIXNameConstraintValidator.checkPermittedDNS(java.util.Set, java.lang.String):void");
    }

    private void checkPermittedEmail(Set set, String str) {
        if (set == null) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (emailIsConstrained(str, (String) it2.next())) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new PKIXNameConstraintValidatorException("Subject email address is not from a permitted subtree.");
        }
    }

    private void checkPermittedIP(Set set, byte[] bArr) {
        if (set == null) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (isIPConstrained(bArr, (byte[]) it2.next())) {
                return;
            }
        }
        if (bArr.length != 0 || set.size() != 0) {
            throw new PKIXNameConstraintValidatorException("IP is not from a permitted subtree.");
        }
    }

    private void checkPermittedURI(Set set, String str) {
        if (set == null) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (isUriConstrained(str, (String) it2.next())) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new PKIXNameConstraintValidatorException("URI is not from a permitted subtree.");
        }
    }

    private boolean collectionsAreEqual(Collection collection, Collection collection2) {
        boolean z11;
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (Object obj : collection) {
            Iterator it2 = collection2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (equals(obj, it2.next())) {
                        z11 = true;
                        continue;
                        break;
                    }
                } else {
                    z11 = false;
                    continue;
                    break;
                }
            }
            if (!z11) {
                return false;
            }
        }
        return true;
    }

    private static int compareTo(byte[] bArr, byte[] bArr2) {
        if (Arrays.areEqual(bArr, bArr2)) {
            return 0;
        }
        return Arrays.areEqual(max(bArr, bArr2), bArr) ? 1 : -1;
    }

    private boolean emailIsConstrained(String str, String str2) {
        String substring = str.substring(str.indexOf(64) + 1);
        if (str2.indexOf(64) != -1) {
            if (str.equalsIgnoreCase(str2) || substring.equalsIgnoreCase(str2.substring(1))) {
                return true;
            }
        } else if (str2.charAt(0) != '.') {
            if (substring.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (withinDomain(substring, str2)) {
            return true;
        }
        return false;
    }

    private static String extractHostFromURL(String str) {
        String substring = str.substring(str.indexOf(58) + 1);
        if (substring.indexOf("//") != -1) {
            substring = substring.substring(substring.indexOf("//") + 2);
        }
        if (substring.lastIndexOf(58) != -1) {
            substring = substring.substring(0, substring.lastIndexOf(58));
        }
        String substring2 = substring.substring(substring.indexOf(58) + 1);
        String substring3 = substring2.substring(substring2.indexOf(64) + 1);
        return substring3.indexOf(47) != -1 ? substring3.substring(0, substring3.indexOf(47)) : substring3;
    }

    private byte[][] extractIPsAndSubnetMasks(byte[] bArr, byte[] bArr2) {
        int length = bArr.length / 2;
        byte[] bArr3 = new byte[length];
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr, length, bArr4, 0, length);
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, length);
        System.arraycopy(bArr2, length, bArr6, 0, length);
        return new byte[][]{bArr3, bArr4, bArr5, bArr6};
    }

    private String extractNameAsString(GeneralName generalName) {
        return DERIA5String.getInstance(generalName.getName()).getString();
    }

    private int hashCollection(Collection collection) {
        int hashCode;
        int i11 = 0;
        if (collection == null) {
            return 0;
        }
        for (Object obj : collection) {
            if (obj instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) obj);
            } else {
                hashCode = obj.hashCode();
            }
            i11 += hashCode;
        }
        return i11;
    }

    private Set intersectDN(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(((GeneralSubtree) it2.next()).getBase().getName().toASN1Primitive());
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) it3.next();
                    if (withinDNSubtree(aSN1Sequence, aSN1Sequence2)) {
                        hashSet.add(aSN1Sequence);
                    } else if (withinDNSubtree(aSN1Sequence2, aSN1Sequence)) {
                        hashSet.add(aSN1Sequence2);
                    }
                }
            } else if (aSN1Sequence != null) {
                hashSet.add(aSN1Sequence);
            }
        }
        return hashSet;
    }

    private Set intersectDNS(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String extractNameAsString = extractNameAsString(((GeneralSubtree) it2.next()).getBase());
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (withinDomain(str, extractNameAsString)) {
                        hashSet.add(str);
                    } else if (withinDomain(extractNameAsString, str)) {
                        hashSet.add(extractNameAsString);
                    }
                }
            } else if (extractNameAsString != null) {
                hashSet.add(extractNameAsString);
            }
        }
        return hashSet;
    }

    private Set intersectEmail(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String extractNameAsString = extractNameAsString(((GeneralSubtree) it2.next()).getBase());
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    intersectEmail(extractNameAsString, (String) it3.next(), hashSet);
                }
            } else if (extractNameAsString != null) {
                hashSet.add(extractNameAsString);
            }
        }
        return hashSet;
    }

    private Set intersectIP(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            byte[] octets = ASN1OctetString.getInstance(((GeneralSubtree) it2.next()).getBase().getName()).getOctets();
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    hashSet.addAll(intersectIPRange((byte[]) it3.next(), octets));
                }
            } else if (octets != null) {
                hashSet.add(octets);
            }
        }
        return hashSet;
    }

    private Set intersectIPRange(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return Collections.EMPTY_SET;
        }
        byte[][] extractIPsAndSubnetMasks = extractIPsAndSubnetMasks(bArr, bArr2);
        byte[] bArr3 = extractIPsAndSubnetMasks[0];
        byte[] bArr4 = extractIPsAndSubnetMasks[1];
        byte[] bArr5 = extractIPsAndSubnetMasks[2];
        byte[] bArr6 = extractIPsAndSubnetMasks[3];
        byte[][] minMaxIPs = minMaxIPs(bArr3, bArr4, bArr5, bArr6);
        if (compareTo(max(minMaxIPs[0], minMaxIPs[2]), min(minMaxIPs[1], minMaxIPs[3])) == 1) {
            return Collections.EMPTY_SET;
        }
        return Collections.singleton(ipWithSubnetMask(or(minMaxIPs[0], minMaxIPs[2]), or(bArr4, bArr6)));
    }

    private Set intersectURI(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String extractNameAsString = extractNameAsString(((GeneralSubtree) it2.next()).getBase());
            if (set != null) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    intersectURI((String) it3.next(), extractNameAsString, hashSet);
                }
            } else if (extractNameAsString != null) {
                hashSet.add(extractNameAsString);
            }
        }
        return hashSet;
    }

    private byte[] ipWithSubnetMask(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length * 2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length);
        return bArr3;
    }

    private boolean isIPConstrained(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr4[i11] = (byte) (bArr2[i11] & bArr3[i11]);
            bArr5[i11] = (byte) (bArr[i11] & bArr3[i11]);
        }
        return Arrays.areEqual(bArr4, bArr5);
    }

    private boolean isUriConstrained(String str, String str2) {
        String extractHostFromURL = extractHostFromURL(str);
        return !str2.startsWith(".") ? extractHostFromURL.equalsIgnoreCase(str2) : withinDomain(extractHostFromURL, str2);
    }

    private static byte[] max(byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if ((bArr[i11] & 65535) > (65535 & bArr2[i11])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private static byte[] min(byte[] bArr, byte[] bArr2) {
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if ((bArr[i11] & 65535) < (65535 & bArr2[i11])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private byte[][] minMaxIPs(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        byte[] bArr7 = new byte[length];
        byte[] bArr8 = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr5[i11] = (byte) (bArr[i11] & bArr2[i11]);
            bArr6[i11] = (byte) ((bArr[i11] & bArr2[i11]) | (~bArr2[i11]));
            bArr7[i11] = (byte) (bArr3[i11] & bArr4[i11]);
            bArr8[i11] = (byte) ((bArr3[i11] & bArr4[i11]) | (~bArr4[i11]));
        }
        return new byte[][]{bArr5, bArr6, bArr7, bArr8};
    }

    private static byte[] or(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            bArr3[i11] = (byte) (bArr[i11] | bArr2[i11]);
        }
        return bArr3;
    }

    private String stringifyIP(byte[] bArr) {
        String str = "";
        for (int i11 = 0; i11 < bArr.length / 2; i11++) {
            str = str + Integer.toString(bArr[i11] & 255) + ".";
        }
        String str2 = str.substring(0, str.length() - 1) + "/";
        for (int length = bArr.length / 2; length < bArr.length; length++) {
            str2 = str2 + Integer.toString(bArr[length] & 255) + ".";
        }
        return str2.substring(0, str2.length() - 1);
    }

    private String stringifyIPCollection(Set set) {
        Iterator it2;
        String str = "[";
        while (set.iterator().hasNext()) {
            str = str + stringifyIP((byte[]) it2.next()) + ",";
        }
        if (str.length() > 1) {
            str = str.substring(0, str.length() - 1);
        }
        return str + "]";
    }

    private Set unionDN(Set set, ASN1Sequence aSN1Sequence) {
        if (set.isEmpty()) {
            if (aSN1Sequence == null) {
                return set;
            }
            set.add(aSN1Sequence);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            ASN1Sequence aSN1Sequence2 = (ASN1Sequence) it2.next();
            if (withinDNSubtree(aSN1Sequence, aSN1Sequence2)) {
                hashSet.add(aSN1Sequence2);
            } else if (withinDNSubtree(aSN1Sequence2, aSN1Sequence)) {
                hashSet.add(aSN1Sequence);
            } else {
                hashSet.add(aSN1Sequence2);
                hashSet.add(aSN1Sequence);
            }
        }
        return hashSet;
    }

    private Set unionEmail(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            unionEmail((String) it2.next(), str, hashSet);
        }
        return hashSet;
    }

    private Set unionIP(Set set, byte[] bArr) {
        if (set.isEmpty()) {
            if (bArr == null) {
                return set;
            }
            set.add(bArr);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            hashSet.addAll(unionIPRange((byte[]) it2.next(), bArr));
        }
        return hashSet;
    }

    private Set unionIPRange(byte[] bArr, byte[] bArr2) {
        HashSet hashSet = new HashSet();
        if (Arrays.areEqual(bArr, bArr2)) {
            hashSet.add(bArr);
        } else {
            hashSet.add(bArr);
            hashSet.add(bArr2);
        }
        return hashSet;
    }

    private void unionURI(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                set.add(str);
                set.add(str2);
            } else if (str2.startsWith(".")) {
                if (withinDomain(substring, str2)) {
                    set.add(str2);
                    return;
                }
                set.add(str);
                set.add(str2);
            } else if (substring.equalsIgnoreCase(str2)) {
                set.add(str2);
            } else {
                set.add(str);
                set.add(str2);
            }
        } else if (str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (withinDomain(str2.substring(str.indexOf(64) + 1), str)) {
                    set.add(str);
                    return;
                }
                set.add(str);
                set.add(str2);
            } else if (str2.startsWith(".")) {
                if (!withinDomain(str, str2) && !str.equalsIgnoreCase(str2)) {
                    if (withinDomain(str2, str)) {
                        set.add(str);
                        return;
                    }
                    set.add(str);
                    set.add(str2);
                    return;
                }
                set.add(str2);
            } else if (withinDomain(str2, str)) {
                set.add(str);
            } else {
                set.add(str);
                set.add(str2);
            }
        } else if (str2.indexOf(64) != -1) {
            if (str2.substring(str.indexOf(64) + 1).equalsIgnoreCase(str)) {
                set.add(str);
                return;
            }
            set.add(str);
            set.add(str2);
        } else if (str2.startsWith(".")) {
            if (withinDomain(str, str2)) {
                set.add(str2);
                return;
            }
            set.add(str);
            set.add(str2);
        } else if (str.equalsIgnoreCase(str2)) {
            set.add(str);
        } else {
            set.add(str);
            set.add(str2);
        }
    }

    private static boolean withinDNSubtree(ASN1Sequence aSN1Sequence, ASN1Sequence aSN1Sequence2) {
        if (aSN1Sequence2.size() >= 1 && aSN1Sequence2.size() <= aSN1Sequence.size()) {
            for (int size = aSN1Sequence2.size() - 1; size >= 0; size--) {
                if (!aSN1Sequence2.getObjectAt(size).equals(aSN1Sequence.getObjectAt(size))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean withinDomain(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] split = Strings.split(str2, CoreConstants.DOT);
        String[] split2 = Strings.split(str, CoreConstants.DOT);
        if (split2.length <= split.length) {
            return false;
        }
        int length = split2.length - split.length;
        for (int i11 = -1; i11 < split.length; i11++) {
            if (i11 == -1) {
                if (split2[i11 + length].equals("")) {
                    return false;
                }
            } else if (!split[i11].equalsIgnoreCase(split2[i11 + length])) {
                return false;
            }
        }
        return true;
    }

    public void addExcludedSubtree(GeneralSubtree generalSubtree) {
        GeneralName base = generalSubtree.getBase();
        int tagNo = base.getTagNo();
        if (tagNo == 1) {
            this.excludedSubtreesEmail = unionEmail(this.excludedSubtreesEmail, extractNameAsString(base));
        } else if (tagNo == 2) {
            this.excludedSubtreesDNS = unionDNS(this.excludedSubtreesDNS, extractNameAsString(base));
        } else if (tagNo == 4) {
            this.excludedSubtreesDN = unionDN(this.excludedSubtreesDN, (ASN1Sequence) base.getName().toASN1Primitive());
        } else if (tagNo == 6) {
            this.excludedSubtreesURI = unionURI(this.excludedSubtreesURI, extractNameAsString(base));
        } else if (tagNo != 7) {
        } else {
            this.excludedSubtreesIP = unionIP(this.excludedSubtreesIP, ASN1OctetString.getInstance(base.getName()).getOctets());
        }
    }

    public void checkExcluded(GeneralName generalName) {
        int tagNo = generalName.getTagNo();
        if (tagNo == 1) {
            checkExcludedEmail(this.excludedSubtreesEmail, extractNameAsString(generalName));
        } else if (tagNo == 2) {
            checkExcludedDNS(this.excludedSubtreesDNS, DERIA5String.getInstance(generalName.getName()).getString());
        } else if (tagNo == 4) {
            checkExcludedDN(ASN1Sequence.getInstance(generalName.getName().toASN1Primitive()));
        } else if (tagNo == 6) {
            checkExcludedURI(this.excludedSubtreesURI, DERIA5String.getInstance(generalName.getName()).getString());
        } else if (tagNo != 7) {
        } else {
            checkExcludedIP(this.excludedSubtreesIP, ASN1OctetString.getInstance(generalName.getName()).getOctets());
        }
    }

    public void checkExcludedDN(ASN1Sequence aSN1Sequence) {
        checkExcludedDN(this.excludedSubtreesDN, aSN1Sequence);
    }

    public void checkPermitted(GeneralName generalName) {
        int tagNo = generalName.getTagNo();
        if (tagNo == 1) {
            checkPermittedEmail(this.permittedSubtreesEmail, extractNameAsString(generalName));
        } else if (tagNo == 2) {
            checkPermittedDNS(this.permittedSubtreesDNS, DERIA5String.getInstance(generalName.getName()).getString());
        } else if (tagNo == 4) {
            checkPermittedDN(ASN1Sequence.getInstance(generalName.getName().toASN1Primitive()));
        } else if (tagNo == 6) {
            checkPermittedURI(this.permittedSubtreesURI, DERIA5String.getInstance(generalName.getName()).getString());
        } else if (tagNo != 7) {
        } else {
            checkPermittedIP(this.permittedSubtreesIP, ASN1OctetString.getInstance(generalName.getName()).getOctets());
        }
    }

    public void checkPermittedDN(ASN1Sequence aSN1Sequence) {
        checkPermittedDN(this.permittedSubtreesDN, aSN1Sequence);
    }

    public boolean equals(Object obj) {
        if (obj instanceof PKIXNameConstraintValidator) {
            PKIXNameConstraintValidator pKIXNameConstraintValidator = (PKIXNameConstraintValidator) obj;
            return collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesDN, this.excludedSubtreesDN) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesDNS, this.excludedSubtreesDNS) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesEmail, this.excludedSubtreesEmail) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesIP, this.excludedSubtreesIP) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesURI, this.excludedSubtreesURI) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesDN, this.permittedSubtreesDN) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesDNS, this.permittedSubtreesDNS) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesEmail, this.permittedSubtreesEmail) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesIP, this.permittedSubtreesIP) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesURI, this.permittedSubtreesURI);
        }
        return false;
    }

    public int hashCode() {
        return hashCollection(this.excludedSubtreesDN) + hashCollection(this.excludedSubtreesDNS) + hashCollection(this.excludedSubtreesEmail) + hashCollection(this.excludedSubtreesIP) + hashCollection(this.excludedSubtreesURI) + hashCollection(this.permittedSubtreesDN) + hashCollection(this.permittedSubtreesDNS) + hashCollection(this.permittedSubtreesEmail) + hashCollection(this.permittedSubtreesIP) + hashCollection(this.permittedSubtreesURI);
    }

    public void intersectEmptyPermittedSubtree(int i11) {
        if (i11 == 1) {
            this.permittedSubtreesEmail = new HashSet();
        } else if (i11 == 2) {
            this.permittedSubtreesDNS = new HashSet();
        } else if (i11 == 4) {
            this.permittedSubtreesDN = new HashSet();
        } else if (i11 == 6) {
            this.permittedSubtreesURI = new HashSet();
        } else if (i11 != 7) {
        } else {
            this.permittedSubtreesIP = new HashSet();
        }
    }

    public void intersectPermittedSubtree(GeneralSubtree generalSubtree) {
        intersectPermittedSubtree(new GeneralSubtree[]{generalSubtree});
    }

    public String toString() {
        String str = "permitted:\n";
        if (this.permittedSubtreesDN != null) {
            str = (str + "DN:\n") + this.permittedSubtreesDN.toString() + "\n";
        }
        if (this.permittedSubtreesDNS != null) {
            str = (str + "DNS:\n") + this.permittedSubtreesDNS.toString() + "\n";
        }
        if (this.permittedSubtreesEmail != null) {
            str = (str + "Email:\n") + this.permittedSubtreesEmail.toString() + "\n";
        }
        if (this.permittedSubtreesURI != null) {
            str = (str + "URI:\n") + this.permittedSubtreesURI.toString() + "\n";
        }
        if (this.permittedSubtreesIP != null) {
            str = (str + "IP:\n") + stringifyIPCollection(this.permittedSubtreesIP) + "\n";
        }
        String str2 = str + "excluded:\n";
        if (!this.excludedSubtreesDN.isEmpty()) {
            str2 = (str2 + "DN:\n") + this.excludedSubtreesDN.toString() + "\n";
        }
        if (!this.excludedSubtreesDNS.isEmpty()) {
            str2 = (str2 + "DNS:\n") + this.excludedSubtreesDNS.toString() + "\n";
        }
        if (!this.excludedSubtreesEmail.isEmpty()) {
            str2 = (str2 + "Email:\n") + this.excludedSubtreesEmail.toString() + "\n";
        }
        if (!this.excludedSubtreesURI.isEmpty()) {
            str2 = (str2 + "URI:\n") + this.excludedSubtreesURI.toString() + "\n";
        }
        if (this.excludedSubtreesIP.isEmpty()) {
            return str2;
        }
        return (str2 + "IP:\n") + stringifyIPCollection(this.excludedSubtreesIP) + "\n";
    }

    protected Set unionDNS(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (withinDomain(str2, str)) {
                hashSet.add(str);
            } else if (withinDomain(str, str2)) {
                hashSet.add(str2);
            } else {
                hashSet.add(str2);
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private void checkExcludedDN(Set set, ASN1Sequence aSN1Sequence) {
        if (set.isEmpty()) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (withinDNSubtree(aSN1Sequence, (ASN1Sequence) it2.next())) {
                throw new PKIXNameConstraintValidatorException("Subject distinguished name is from an excluded subtree");
            }
        }
    }

    private void checkPermittedDN(Set set, ASN1Sequence aSN1Sequence) {
        if (set == null) {
            return;
        }
        if (set.isEmpty() && aSN1Sequence.size() == 0) {
            return;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (withinDNSubtree(aSN1Sequence, (ASN1Sequence) it2.next())) {
                return;
            }
        }
        throw new PKIXNameConstraintValidatorException("Subject distinguished name is not from a permitted subtree");
    }

    public void intersectPermittedSubtree(GeneralSubtree[] generalSubtreeArr) {
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 != generalSubtreeArr.length; i11++) {
            GeneralSubtree generalSubtree = generalSubtreeArr[i11];
            Integer valueOf = Integers.valueOf(generalSubtree.getBase().getTagNo());
            if (hashMap.get(valueOf) == null) {
                hashMap.put(valueOf, new HashSet());
            }
            ((Set) hashMap.get(valueOf)).add(generalSubtree);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 1) {
                this.permittedSubtreesEmail = intersectEmail(this.permittedSubtreesEmail, (Set) entry.getValue());
            } else if (intValue == 2) {
                this.permittedSubtreesDNS = intersectDNS(this.permittedSubtreesDNS, (Set) entry.getValue());
            } else if (intValue == 4) {
                this.permittedSubtreesDN = intersectDN(this.permittedSubtreesDN, (Set) entry.getValue());
            } else if (intValue == 6) {
                this.permittedSubtreesURI = intersectURI(this.permittedSubtreesURI, (Set) entry.getValue());
            } else if (intValue == 7) {
                this.permittedSubtreesIP = intersectIP(this.permittedSubtreesIP, (Set) entry.getValue());
            }
        }
    }

    private void unionEmail(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                set.add(str);
                set.add(str2);
            } else if (str2.startsWith(".")) {
                if (withinDomain(substring, str2)) {
                    set.add(str2);
                    return;
                }
                set.add(str);
                set.add(str2);
            } else if (substring.equalsIgnoreCase(str2)) {
                set.add(str2);
            } else {
                set.add(str);
                set.add(str2);
            }
        } else if (str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (withinDomain(str2.substring(str.indexOf(64) + 1), str)) {
                    set.add(str);
                    return;
                }
                set.add(str);
                set.add(str2);
            } else if (str2.startsWith(".")) {
                if (!withinDomain(str, str2) && !str.equalsIgnoreCase(str2)) {
                    if (withinDomain(str2, str)) {
                        set.add(str);
                        return;
                    }
                    set.add(str);
                    set.add(str2);
                    return;
                }
                set.add(str2);
            } else if (withinDomain(str2, str)) {
                set.add(str);
            } else {
                set.add(str);
                set.add(str2);
            }
        } else if (str2.indexOf(64) != -1) {
            if (str2.substring(str.indexOf(64) + 1).equalsIgnoreCase(str)) {
                set.add(str);
                return;
            }
            set.add(str);
            set.add(str2);
        } else if (str2.startsWith(".")) {
            if (withinDomain(str, str2)) {
                set.add(str2);
                return;
            }
            set.add(str);
            set.add(str2);
        } else if (str.equalsIgnoreCase(str2)) {
            set.add(str);
        } else {
            set.add(str);
            set.add(str2);
        }
    }

    private void intersectEmail(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                }
            } else if (str2.startsWith(".")) {
                if (withinDomain(substring, str2)) {
                    set.add(str);
                }
            } else if (substring.equalsIgnoreCase(str2)) {
                set.add(str);
            }
        } else if (str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (withinDomain(str2.substring(str.indexOf(64) + 1), str)) {
                    set.add(str2);
                }
            } else if (str2.startsWith(".")) {
                if (!withinDomain(str, str2) && !str.equalsIgnoreCase(str2)) {
                    if (withinDomain(str2, str)) {
                        set.add(str2);
                        return;
                    }
                    return;
                }
                set.add(str);
            } else if (withinDomain(str2, str)) {
                set.add(str2);
            }
        } else if (str2.indexOf(64) != -1) {
            if (str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                set.add(str2);
            }
        } else if (str2.startsWith(".")) {
            if (withinDomain(str, str2)) {
                set.add(str);
            }
        } else if (str.equalsIgnoreCase(str2)) {
            set.add(str);
        }
    }

    private void intersectURI(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                }
            } else if (str2.startsWith(".")) {
                if (withinDomain(substring, str2)) {
                    set.add(str);
                }
            } else if (substring.equalsIgnoreCase(str2)) {
                set.add(str);
            }
        } else if (str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (withinDomain(str2.substring(str.indexOf(64) + 1), str)) {
                    set.add(str2);
                }
            } else if (str2.startsWith(".")) {
                if (!withinDomain(str, str2) && !str.equalsIgnoreCase(str2)) {
                    if (withinDomain(str2, str)) {
                        set.add(str2);
                        return;
                    }
                    return;
                }
                set.add(str);
            } else if (withinDomain(str2, str)) {
                set.add(str2);
            }
        } else if (str2.indexOf(64) != -1) {
            if (str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                set.add(str2);
            }
        } else if (str2.startsWith(".")) {
            if (withinDomain(str, str2)) {
                set.add(str);
            }
        } else if (str.equalsIgnoreCase(str2)) {
            set.add(str);
        }
    }

    private boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.areEqual((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    private Set unionURI(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            unionURI((String) it2.next(), str, hashSet);
        }
        return hashSet;
    }
}