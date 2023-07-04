package org.spongycastle.pqc.math.ntru.polynomial;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.SecureRandom;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class ProductFormPolynomial implements Polynomial {

    /* renamed from: f1  reason: collision with root package name */
    private SparseTernaryPolynomial f43884f1;

    /* renamed from: f2  reason: collision with root package name */
    private SparseTernaryPolynomial f43885f2;

    /* renamed from: f3  reason: collision with root package name */
    private SparseTernaryPolynomial f43886f3;

    public ProductFormPolynomial(SparseTernaryPolynomial sparseTernaryPolynomial, SparseTernaryPolynomial sparseTernaryPolynomial2, SparseTernaryPolynomial sparseTernaryPolynomial3) {
        this.f43884f1 = sparseTernaryPolynomial;
        this.f43885f2 = sparseTernaryPolynomial2;
        this.f43886f3 = sparseTernaryPolynomial3;
    }

    public static ProductFormPolynomial fromBinary(byte[] bArr, int i11, int i12, int i13, int i14, int i15) {
        return fromBinary(new ByteArrayInputStream(bArr), i11, i12, i13, i14, i15);
    }

    public static ProductFormPolynomial generateRandom(int i11, int i12, int i13, int i14, int i15, SecureRandom secureRandom) {
        return new ProductFormPolynomial(SparseTernaryPolynomial.generateRandom(i11, i12, i12, secureRandom), SparseTernaryPolynomial.generateRandom(i11, i13, i13, secureRandom), SparseTernaryPolynomial.generateRandom(i11, i14, i15, secureRandom));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ProductFormPolynomial productFormPolynomial = (ProductFormPolynomial) obj;
            SparseTernaryPolynomial sparseTernaryPolynomial = this.f43884f1;
            if (sparseTernaryPolynomial == null) {
                if (productFormPolynomial.f43884f1 != null) {
                    return false;
                }
            } else if (!sparseTernaryPolynomial.equals(productFormPolynomial.f43884f1)) {
                return false;
            }
            SparseTernaryPolynomial sparseTernaryPolynomial2 = this.f43885f2;
            if (sparseTernaryPolynomial2 == null) {
                if (productFormPolynomial.f43885f2 != null) {
                    return false;
                }
            } else if (!sparseTernaryPolynomial2.equals(productFormPolynomial.f43885f2)) {
                return false;
            }
            SparseTernaryPolynomial sparseTernaryPolynomial3 = this.f43886f3;
            if (sparseTernaryPolynomial3 == null) {
                if (productFormPolynomial.f43886f3 != null) {
                    return false;
                }
            } else if (!sparseTernaryPolynomial3.equals(productFormPolynomial.f43886f3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        SparseTernaryPolynomial sparseTernaryPolynomial = this.f43884f1;
        int hashCode = ((sparseTernaryPolynomial == null ? 0 : sparseTernaryPolynomial.hashCode()) + 31) * 31;
        SparseTernaryPolynomial sparseTernaryPolynomial2 = this.f43885f2;
        int hashCode2 = (hashCode + (sparseTernaryPolynomial2 == null ? 0 : sparseTernaryPolynomial2.hashCode())) * 31;
        SparseTernaryPolynomial sparseTernaryPolynomial3 = this.f43886f3;
        return hashCode2 + (sparseTernaryPolynomial3 != null ? sparseTernaryPolynomial3.hashCode() : 0);
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial) {
        IntegerPolynomial mult = this.f43885f2.mult(this.f43884f1.mult(integerPolynomial));
        mult.add(this.f43886f3.mult(integerPolynomial));
        return mult;
    }

    public byte[] toBinary() {
        byte[] binary = this.f43884f1.toBinary();
        byte[] binary2 = this.f43885f2.toBinary();
        byte[] binary3 = this.f43886f3.toBinary();
        byte[] copyOf = Arrays.copyOf(binary, binary.length + binary2.length + binary3.length);
        System.arraycopy(binary2, 0, copyOf, binary.length, binary2.length);
        System.arraycopy(binary3, 0, copyOf, binary.length + binary2.length, binary3.length);
        return copyOf;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial toIntegerPolynomial() {
        IntegerPolynomial mult = this.f43884f1.mult(this.f43885f2.toIntegerPolynomial());
        mult.add(this.f43886f3.toIntegerPolynomial());
        return mult;
    }

    public static ProductFormPolynomial fromBinary(InputStream inputStream, int i11, int i12, int i13, int i14, int i15) {
        return new ProductFormPolynomial(SparseTernaryPolynomial.fromBinary(inputStream, i11, i12, i12), SparseTernaryPolynomial.fromBinary(inputStream, i11, i13, i13), SparseTernaryPolynomial.fromBinary(inputStream, i11, i14, i15));
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        BigIntPolynomial mult = this.f43885f2.mult(this.f43884f1.mult(bigIntPolynomial));
        mult.add(this.f43886f3.mult(bigIntPolynomial));
        return mult;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial, int i11) {
        IntegerPolynomial mult = mult(integerPolynomial);
        mult.mod(i11);
        return mult;
    }
}