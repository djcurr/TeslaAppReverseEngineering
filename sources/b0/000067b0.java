package e80;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.vision.text.Line;
import com.google.android.gms.vision.text.Text;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes5.dex */
public class i extends AsyncTask<Void, Void, SparseArray<TextBlock>> {

    /* renamed from: a  reason: collision with root package name */
    private j f25009a;

    /* renamed from: b  reason: collision with root package name */
    private n0 f25010b;

    /* renamed from: c  reason: collision with root package name */
    private TextRecognizer f25011c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f25012d;

    /* renamed from: e  reason: collision with root package name */
    private int f25013e;

    /* renamed from: f  reason: collision with root package name */
    private int f25014f;

    /* renamed from: g  reason: collision with root package name */
    private int f25015g;

    /* renamed from: h  reason: collision with root package name */
    private f80.a f25016h;

    /* renamed from: i  reason: collision with root package name */
    private double f25017i;

    /* renamed from: j  reason: collision with root package name */
    private double f25018j;

    /* renamed from: k  reason: collision with root package name */
    private int f25019k;

    /* renamed from: l  reason: collision with root package name */
    private int f25020l;

    public i(j jVar, n0 n0Var, byte[] bArr, int i11, int i12, int i13, float f11, int i14, int i15, int i16, int i17, int i18) {
        this.f25009a = jVar;
        this.f25010b = n0Var;
        this.f25012d = bArr;
        this.f25013e = i11;
        this.f25014f = i12;
        this.f25015g = i13;
        f80.a aVar = new f80.a(i11, i12, i13, i14);
        this.f25016h = aVar;
        this.f25017i = i15 / (aVar.d() * f11);
        this.f25018j = i16 / (this.f25016h.b() * f11);
        this.f25019k = i17;
        this.f25020l = i18;
    }

    private WritableMap c(WritableMap writableMap) {
        ReadableMap map = writableMap.getMap("bounds");
        WritableMap d11 = g80.a.d(g80.a.c(map.getMap(AppMeasurementSdk.ConditionalUserProperty.ORIGIN), this.f25016h.d(), this.f25017i), -map.getMap("size").getDouble(Snapshot.WIDTH));
        WritableMap createMap = Arguments.createMap();
        createMap.merge(map);
        createMap.putMap(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, d11);
        writableMap.putMap("bounds", createMap);
        ReadableArray array = writableMap.getArray("components");
        WritableArray createArray = Arguments.createArray();
        for (int i11 = 0; i11 < array.size(); i11++) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.merge(array.getMap(i11));
            c(createMap2);
            createArray.pushMap(createMap2);
        }
        writableMap.putArray("components", createArray);
        return writableMap;
    }

    private WritableMap d(Text text) {
        String str;
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        for (Text text2 : text.getComponents()) {
            createArray.pushMap(d(text2));
        }
        createMap.putArray("components", createArray);
        createMap.putString("value", text.getValue());
        int i11 = text.getBoundingBox().left;
        int i12 = text.getBoundingBox().top;
        if (text.getBoundingBox().left < this.f25013e / 2) {
            i11 += this.f25019k / 2;
        } else if (text.getBoundingBox().left > this.f25013e / 2) {
            i11 -= this.f25019k / 2;
        }
        if (text.getBoundingBox().height() < this.f25014f / 2) {
            i12 += this.f25020l / 2;
        } else if (text.getBoundingBox().height() > this.f25014f / 2) {
            i12 -= this.f25020l / 2;
        }
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("x", i11 * this.f25017i);
        createMap2.putDouble("y", i12 * this.f25018j);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble(Snapshot.WIDTH, text.getBoundingBox().width() * this.f25017i);
        createMap3.putDouble(Snapshot.HEIGHT, text.getBoundingBox().height() * this.f25018j);
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putMap(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, createMap2);
        createMap4.putMap("size", createMap3);
        createMap.putMap("bounds", createMap4);
        if (text instanceof TextBlock) {
            str = "block";
        } else {
            str = text instanceof Line ? "line" : "element";
        }
        createMap.putString("type", str);
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public SparseArray<TextBlock> doInBackground(Void... voidArr) {
        if (isCancelled() || this.f25009a == null) {
            return null;
        }
        this.f25011c = new TextRecognizer.Builder(this.f25010b).build();
        return this.f25011c.detect(i80.b.b(this.f25012d, this.f25013e, this.f25014f, this.f25015g).b());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(SparseArray<TextBlock> sparseArray) {
        super.onPostExecute(sparseArray);
        TextRecognizer textRecognizer = this.f25011c;
        if (textRecognizer != null) {
            textRecognizer.release();
        }
        if (sparseArray != null) {
            WritableArray createArray = Arguments.createArray();
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                WritableMap d11 = d(sparseArray.valueAt(i11));
                if (this.f25016h.a() == 1) {
                    d11 = c(d11);
                }
                createArray.pushMap(d11);
            }
            this.f25009a.j(createArray);
        }
        this.f25009a.h();
    }
}