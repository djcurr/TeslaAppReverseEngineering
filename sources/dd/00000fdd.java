package c80;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    public static int f9011e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static int f9012f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static int f9013g = 2;

    /* renamed from: h  reason: collision with root package name */
    public static int f9014h;

    /* renamed from: b  reason: collision with root package name */
    private f80.a f9016b;

    /* renamed from: c  reason: collision with root package name */
    private BarcodeDetector.Builder f9017c;

    /* renamed from: a  reason: collision with root package name */
    private BarcodeDetector f9015a = null;

    /* renamed from: d  reason: collision with root package name */
    private int f9018d = 0;

    public b(Context context) {
        this.f9017c = new BarcodeDetector.Builder(context).setBarcodeFormats(this.f9018d);
    }

    private void a() {
        this.f9015a = this.f9017c.build();
    }

    private void e() {
        BarcodeDetector barcodeDetector = this.f9015a;
        if (barcodeDetector != null) {
            barcodeDetector.release();
            this.f9015a = null;
        }
    }

    public SparseArray<Barcode> b(i80.a aVar) {
        if (!aVar.a().equals(this.f9016b)) {
            e();
        }
        if (this.f9015a == null) {
            a();
            this.f9016b = aVar.a();
        }
        return this.f9015a.detect(aVar.b());
    }

    public boolean c() {
        if (this.f9015a == null) {
            a();
        }
        return this.f9015a.isOperational();
    }

    public void d() {
        e();
        this.f9016b = null;
    }

    public void f(int i11) {
        if (i11 != this.f9018d) {
            d();
            this.f9017c.setBarcodeFormats(i11);
            this.f9018d = i11;
        }
    }
}