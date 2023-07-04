package ak;

import android.util.Pair;
import com.stripe.android.model.Stripe3ds2AuthResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f446a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f447b = {"", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE};

    public static String a(int i11, int i12, int i13) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static List<byte[]> b(boolean z11) {
        return Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
    }

    public static String c(w wVar) {
        wVar.l(24);
        int e11 = wVar.e(2);
        boolean d11 = wVar.d();
        int e12 = wVar.e(5);
        int i11 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            if (wVar.d()) {
                i11 |= 1 << i12;
            }
        }
        int i13 = 6;
        int[] iArr = new int[6];
        for (int i14 = 0; i14 < 6; i14++) {
            iArr[i14] = wVar.e(8);
        }
        int e13 = wVar.e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f447b[e11];
        objArr[1] = Integer.valueOf(e12);
        objArr[2] = Integer.valueOf(i11);
        objArr[3] = Character.valueOf(d11 ? 'H' : Matrix.MATRIX_TYPE_RANDOM_LT);
        objArr[4] = Integer.valueOf(e13);
        StringBuilder sb2 = new StringBuilder(k0.D("hvc1.%s%d.%X.%c%d", objArr));
        while (i13 > 0 && iArr[i13 - 1] == 0) {
            i13--;
        }
        for (int i15 = 0; i15 < i13; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static byte[] d(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = f446a;
        byte[] bArr3 = new byte[bArr2.length + i12];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i11, bArr3, bArr2.length, i12);
        return bArr3;
    }

    private static int e(byte[] bArr, int i11) {
        int length = bArr.length - f446a.length;
        while (i11 <= length) {
            if (f(bArr, i11)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    private static boolean f(byte[] bArr, int i11) {
        if (bArr.length - i11 <= f446a.length) {
            return false;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr2 = f446a;
            if (i12 >= bArr2.length) {
                return true;
            }
            if (bArr[i11 + i12] != bArr2[i12]) {
                return false;
            }
            i12++;
        }
    }

    public static Pair<Integer, Integer> g(byte[] bArr) {
        v vVar = new v(bArr);
        vVar.O(9);
        int C = vVar.C();
        vVar.O(20);
        return Pair.create(Integer.valueOf(vVar.G()), Integer.valueOf(C));
    }

    public static boolean h(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[][] i(byte[] bArr) {
        if (f(bArr, 0)) {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            do {
                arrayList.add(Integer.valueOf(i11));
                i11 = e(bArr, i11 + f446a.length);
            } while (i11 != -1);
            byte[][] bArr2 = new byte[arrayList.size()];
            int i12 = 0;
            while (i12 < arrayList.size()) {
                int intValue = ((Integer) arrayList.get(i12)).intValue();
                int intValue2 = (i12 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i12 + 1)).intValue() : bArr.length) - intValue;
                byte[] bArr3 = new byte[intValue2];
                System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
                bArr2[i12] = bArr3;
                i12++;
            }
            return bArr2;
        }
        return null;
    }
}