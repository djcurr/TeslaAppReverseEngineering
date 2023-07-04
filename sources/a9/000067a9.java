package e80;

import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.vision.barcode.Barcode;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes5.dex */
public class c extends AsyncTask<Void, Void, SparseArray<Barcode>> {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f24979a;

    /* renamed from: b  reason: collision with root package name */
    private int f24980b;

    /* renamed from: c  reason: collision with root package name */
    private int f24981c;

    /* renamed from: d  reason: collision with root package name */
    private int f24982d;

    /* renamed from: e  reason: collision with root package name */
    private c80.b f24983e;

    /* renamed from: f  reason: collision with root package name */
    private d f24984f;

    /* renamed from: g  reason: collision with root package name */
    private double f24985g;

    /* renamed from: h  reason: collision with root package name */
    private double f24986h;

    /* renamed from: i  reason: collision with root package name */
    private f80.a f24987i;

    /* renamed from: j  reason: collision with root package name */
    private int f24988j;

    /* renamed from: k  reason: collision with root package name */
    private int f24989k;

    public c(d dVar, c80.b bVar, byte[] bArr, int i11, int i12, int i13, float f11, int i14, int i15, int i16, int i17, int i18) {
        this.f24979a = bArr;
        this.f24980b = i11;
        this.f24981c = i12;
        this.f24982d = i13;
        this.f24984f = dVar;
        this.f24983e = bVar;
        f80.a aVar = new f80.a(i11, i12, i13, i14);
        this.f24987i = aVar;
        this.f24985g = i15 / (aVar.d() * f11);
        this.f24986h = i16 / (this.f24987i.b() * f11);
        this.f24988j = i17;
        this.f24989k = i18;
    }

    private WritableMap c(Rect rect) {
        WritableMap createMap = Arguments.createMap();
        int i11 = rect.left;
        int i12 = rect.top;
        int i13 = this.f24980b;
        if (i11 < i13 / 2) {
            i11 += this.f24988j / 2;
        } else if (i11 > i13 / 2) {
            i11 -= this.f24988j / 2;
        }
        int i14 = this.f24981c;
        if (i12 < i14 / 2) {
            i12 += this.f24989k / 2;
        } else if (i12 > i14 / 2) {
            i12 -= this.f24989k / 2;
        }
        createMap.putDouble("x", i11 * this.f24985g);
        createMap.putDouble("y", i12 * this.f24986h);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble(Snapshot.WIDTH, rect.width() * this.f24985g);
        createMap2.putDouble(Snapshot.HEIGHT, rect.height() * this.f24986h);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putMap(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, createMap);
        createMap3.putMap("size", createMap2);
        return createMap3;
    }

    private WritableArray d(SparseArray<Barcode> sparseArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            Barcode valueAt = sparseArray.valueAt(i11);
            WritableMap createMap = Arguments.createMap();
            createMap.putString(MessageExtension.FIELD_DATA, valueAt.displayValue);
            createMap.putString("rawData", valueAt.rawValue);
            createMap.putString("type", c80.a.a(valueAt.format));
            createMap.putMap("bounds", c(valueAt.getBoundingBox()));
            createArray.pushMap(createMap);
        }
        return createArray;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public SparseArray<Barcode> doInBackground(Void... voidArr) {
        c80.b bVar;
        if (isCancelled() || this.f24984f == null || (bVar = this.f24983e) == null || !bVar.c()) {
            return null;
        }
        return this.f24983e.b(i80.b.b(this.f24979a, this.f24980b, this.f24981c, this.f24982d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(SparseArray<Barcode> sparseArray) {
        super.onPostExecute(sparseArray);
        if (sparseArray == null) {
            this.f24984f.d(this.f24983e);
            return;
        }
        if (sparseArray.size() > 0) {
            this.f24984f.f(d(sparseArray), this.f24980b, this.f24981c, this.f24979a);
        }
        this.f24984f.k();
    }
}