package g80;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: h  reason: collision with root package name */
    public static int f27843h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static int f27844i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static int f27845j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static int f27846k = 0;

    /* renamed from: l  reason: collision with root package name */
    public static int f27847l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static int f27848m;

    /* renamed from: b  reason: collision with root package name */
    private f80.a f27850b;

    /* renamed from: c  reason: collision with root package name */
    private FaceDetector.Builder f27851c;

    /* renamed from: a  reason: collision with root package name */
    private FaceDetector f27849a = null;

    /* renamed from: d  reason: collision with root package name */
    private int f27852d = f27844i;

    /* renamed from: e  reason: collision with root package name */
    private int f27853e = f27846k;

    /* renamed from: f  reason: collision with root package name */
    private float f27854f = 0.15f;

    /* renamed from: g  reason: collision with root package name */
    private int f27855g = f27848m;

    public b(Context context) {
        this.f27851c = null;
        FaceDetector.Builder builder = new FaceDetector.Builder(context);
        this.f27851c = builder;
        builder.setMinFaceSize(this.f27854f);
        this.f27851c.setMode(this.f27855g);
        this.f27851c.setLandmarkType(this.f27853e);
        this.f27851c.setClassificationType(this.f27852d);
    }

    private void a() {
        this.f27849a = this.f27851c.build();
    }

    private void e() {
        FaceDetector faceDetector = this.f27849a;
        if (faceDetector != null) {
            faceDetector.release();
            this.f27849a = null;
        }
    }

    public SparseArray<Face> b(i80.a aVar) {
        if (!aVar.a().equals(this.f27850b)) {
            e();
        }
        if (this.f27849a == null) {
            a();
            this.f27850b = aVar.a();
        }
        return this.f27849a.detect(aVar.b());
    }

    public boolean c() {
        if (this.f27849a == null) {
            a();
        }
        return this.f27849a.isOperational();
    }

    public void d() {
        e();
        this.f27850b = null;
    }

    public void f(int i11) {
        if (i11 != this.f27852d) {
            d();
            this.f27851c.setClassificationType(i11);
            this.f27852d = i11;
        }
    }

    public void g(int i11) {
        if (i11 != this.f27853e) {
            d();
            this.f27851c.setLandmarkType(i11);
            this.f27853e = i11;
        }
    }

    public void h(int i11) {
        if (i11 != this.f27855g) {
            d();
            this.f27851c.setMode(i11);
            this.f27855g = i11;
        }
    }

    public void i(boolean z11) {
        d();
        this.f27851c.setTrackingEnabled(z11);
    }
}