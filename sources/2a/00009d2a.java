package org.spongycastle.crypto.tls;

/* loaded from: classes4.dex */
public class ECBasisType {
    public static final short ec_basis_pentanomial = 2;
    public static final short ec_basis_trinomial = 1;

    public static boolean isValid(short s11) {
        return s11 >= 1 && s11 <= 2;
    }
}