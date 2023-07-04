package e80;

import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.vision.face.Face;

/* loaded from: classes5.dex */
public class e extends AsyncTask<Void, Void, SparseArray<Face>> {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f24990a;

    /* renamed from: b  reason: collision with root package name */
    private int f24991b;

    /* renamed from: c  reason: collision with root package name */
    private int f24992c;

    /* renamed from: d  reason: collision with root package name */
    private int f24993d;

    /* renamed from: e  reason: collision with root package name */
    private g80.b f24994e;

    /* renamed from: f  reason: collision with root package name */
    private f f24995f;

    /* renamed from: g  reason: collision with root package name */
    private f80.a f24996g;

    /* renamed from: h  reason: collision with root package name */
    private double f24997h;

    /* renamed from: i  reason: collision with root package name */
    private double f24998i;

    /* renamed from: j  reason: collision with root package name */
    private int f24999j;

    /* renamed from: k  reason: collision with root package name */
    private int f25000k;

    public e(f fVar, g80.b bVar, byte[] bArr, int i11, int i12, int i13, float f11, int i14, int i15, int i16, int i17, int i18) {
        this.f24990a = bArr;
        this.f24991b = i11;
        this.f24992c = i12;
        this.f24993d = i13;
        this.f24995f = fVar;
        this.f24994e = bVar;
        f80.a aVar = new f80.a(i11, i12, i13, i14);
        this.f24996g = aVar;
        this.f24997h = i15 / (aVar.d() * f11);
        this.f24998i = i16 / (this.f24996g.b() * f11);
        this.f24999j = i17;
        this.f25000k = i18;
    }

    private WritableArray c(SparseArray<Face> sparseArray) {
        WritableMap a11;
        WritableArray createArray = Arguments.createArray();
        for (int i11 = 0; i11 < sparseArray.size(); i11++) {
            WritableMap g11 = g80.a.g(sparseArray.valueAt(i11), this.f24997h, this.f24998i, this.f24991b, this.f24992c, this.f24999j, this.f25000k);
            if (this.f24996g.a() == 1) {
                a11 = g80.a.e(g11, this.f24996g.d(), this.f24997h);
            } else {
                a11 = g80.a.a(g11);
            }
            createArray.pushMap(a11);
        }
        return createArray;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public SparseArray<Face> doInBackground(Void... voidArr) {
        g80.b bVar;
        if (isCancelled() || this.f24995f == null || (bVar = this.f24994e) == null || !bVar.c()) {
            return null;
        }
        return this.f24994e.b(i80.b.b(this.f24990a, this.f24991b, this.f24992c, this.f24993d));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: b */
    public void onPostExecute(SparseArray<Face> sparseArray) {
        super.onPostExecute(sparseArray);
        if (sparseArray == null) {
            this.f24995f.a(this.f24994e);
            return;
        }
        if (sparseArray.size() > 0) {
            this.f24995f.b(c(sparseArray));
        }
        this.f24995f.i();
    }
}