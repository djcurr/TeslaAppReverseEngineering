package zn;

import android.graphics.Color;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f60535a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f60536b;

    /* renamed from: c  reason: collision with root package name */
    public float[] f60537c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f60538a;

        /* renamed from: b  reason: collision with root package name */
        private final int f60539b;

        /* renamed from: c  reason: collision with root package name */
        private final float f60540c;

        private b(a aVar, int i11, int i12, float f11) {
            this.f60538a = i11;
            this.f60539b = i12;
            this.f60540c = f11;
        }
    }

    public a(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    private HashMap<Integer, b> a() {
        HashMap<Integer, b> hashMap = new HashMap<>();
        if (this.f60537c[0] != BitmapDescriptorFactory.HUE_RED) {
            hashMap.put(0, new b(Color.argb(0, Color.red(this.f60536b[0]), Color.green(this.f60536b[0]), Color.blue(this.f60536b[0])), this.f60536b[0], this.f60535a * this.f60537c[0]));
        }
        for (int i11 = 1; i11 < this.f60536b.length; i11++) {
            int i12 = i11 - 1;
            Integer valueOf = Integer.valueOf((int) (this.f60535a * this.f60537c[i12]));
            int[] iArr = this.f60536b;
            int i13 = iArr[i12];
            int i14 = iArr[i11];
            float[] fArr = this.f60537c;
            hashMap.put(valueOf, new b(i13, i14, (fArr[i11] - fArr[i12]) * this.f60535a));
        }
        float[] fArr2 = this.f60537c;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer valueOf2 = Integer.valueOf((int) (this.f60535a * fArr2[length]));
            int[] iArr2 = this.f60536b;
            hashMap.put(valueOf2, new b(iArr2[length], iArr2[length], this.f60535a * (1.0f - this.f60537c[length])));
        }
        return hashMap;
    }

    static int c(int i11, int i12, float f11) {
        int alpha = (int) (((Color.alpha(i12) - Color.alpha(i11)) * f11) + Color.alpha(i11));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i11), Color.green(i11), Color.blue(i11), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i12), Color.green(i12), Color.blue(i12), fArr2);
        if (fArr[0] - fArr2[0] > 180.0f) {
            fArr2[0] = fArr2[0] + 360.0f;
        } else if (fArr2[0] - fArr[0] > 180.0f) {
            fArr[0] = fArr[0] + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i13 = 0; i13 < 3; i13++) {
            fArr3[i13] = ((fArr2[i13] - fArr[i13]) * f11) + fArr[i13];
        }
        return Color.HSVToColor(alpha, fArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] b(double d11) {
        HashMap<Integer, b> a11 = a();
        int[] iArr = new int[this.f60535a];
        b bVar = a11.get(0);
        int i11 = 0;
        for (int i12 = 0; i12 < this.f60535a; i12++) {
            if (a11.containsKey(Integer.valueOf(i12))) {
                bVar = a11.get(Integer.valueOf(i12));
                i11 = i12;
            }
            iArr[i12] = c(bVar.f60538a, bVar.f60539b, (i12 - i11) / bVar.f60540c);
        }
        if (d11 != 1.0d) {
            for (int i13 = 0; i13 < this.f60535a; i13++) {
                int i14 = iArr[i13];
                iArr[i13] = Color.argb((int) (Color.alpha(i14) * d11), Color.red(i14), Color.green(i14), Color.blue(i14));
            }
        }
        return iArr;
    }

    public a(int[] iArr, float[] fArr, int i11) {
        if (iArr.length == fArr.length) {
            if (iArr.length != 0) {
                for (int i12 = 1; i12 < fArr.length; i12++) {
                    if (fArr[i12] <= fArr[i12 - 1]) {
                        throw new IllegalArgumentException("startPoints should be in increasing order");
                    }
                }
                this.f60535a = i11;
                int[] iArr2 = new int[iArr.length];
                this.f60536b = iArr2;
                this.f60537c = new float[fArr.length];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(fArr, 0, this.f60537c, 0, fArr.length);
                return;
            }
            throw new IllegalArgumentException("No colors have been defined");
        }
        throw new IllegalArgumentException("colors and startPoints should be same length");
    }
}