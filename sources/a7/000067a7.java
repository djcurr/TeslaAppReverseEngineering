package e80;

import android.os.AsyncTask;
import com.google.zxing.NotFoundException;

/* loaded from: classes5.dex */
public class a extends AsyncTask<Void, Void, com.google.zxing.j> {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f24966a;

    /* renamed from: b  reason: collision with root package name */
    private int f24967b;

    /* renamed from: c  reason: collision with root package name */
    private int f24968c;

    /* renamed from: d  reason: collision with root package name */
    private b f24969d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.zxing.g f24970e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f24971f;

    /* renamed from: g  reason: collision with root package name */
    private float f24972g;

    /* renamed from: h  reason: collision with root package name */
    private float f24973h;

    /* renamed from: i  reason: collision with root package name */
    private float f24974i;

    /* renamed from: j  reason: collision with root package name */
    private float f24975j;

    /* renamed from: k  reason: collision with root package name */
    private int f24976k;

    /* renamed from: l  reason: collision with root package name */
    private int f24977l;

    /* renamed from: m  reason: collision with root package name */
    private float f24978m;

    public a(b bVar, com.google.zxing.g gVar, byte[] bArr, int i11, int i12, boolean z11, float f11, float f12, float f13, float f14, int i13, int i14, float f15) {
        this.f24966a = bArr;
        this.f24967b = i11;
        this.f24968c = i12;
        this.f24969d = bVar;
        this.f24970e = gVar;
        this.f24971f = z11;
        this.f24972g = f11;
        this.f24973h = f12;
        this.f24974i = f13;
        this.f24975j = f14;
        this.f24976k = i13;
        this.f24977l = i14;
        this.f24978m = f15;
    }

    private com.google.zxing.c b(byte[] bArr, int i11, int i12, boolean z11, int i13, int i14, int i15, int i16) {
        com.google.zxing.h hVar;
        if (this.f24971f) {
            hVar = new com.google.zxing.h(bArr, i11, i12, i13, i14, i15, i16, false);
        } else {
            hVar = new com.google.zxing.h(bArr, i11, i12, 0, 0, i11, i12, false);
        }
        if (z11) {
            return new com.google.zxing.c(new uo.j(hVar.e()));
        }
        return new com.google.zxing.c(new uo.j(hVar));
    }

    private byte[] d(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i13 = 0; i13 < i12; i13++) {
            for (int i14 = 0; i14 < i11; i14++) {
                bArr2[(((i14 * i12) + i12) - i13) - 1] = bArr[(i13 * i11) + i14];
            }
        }
        return bArr2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public com.google.zxing.j doInBackground(Void... voidArr) {
        if (!isCancelled() && this.f24969d != null) {
            int i11 = (int) (this.f24977l / this.f24978m);
            int i12 = this.f24976k;
            float f11 = i11;
            float f12 = this.f24972g;
            int i13 = this.f24967b;
            int i14 = (int) (f12 * i13);
            int i15 = this.f24968c;
            int i16 = (int) (((((i11 - i12) / 2) + (this.f24973h * i12)) / f11) * i15);
            int i17 = (int) (this.f24974i * i13);
            int i18 = (int) (((this.f24975j * i12) / f11) * i15);
            try {
                try {
                    try {
                        try {
                            try {
                                return this.f24970e.c(b(this.f24966a, i13, i15, false, i14, i16, i17, i18));
                            } catch (NotFoundException unused) {
                            }
                        } catch (NotFoundException unused2) {
                            byte[] d11 = d(this.f24966a, this.f24967b, this.f24968c);
                            int i19 = this.f24968c;
                            return this.f24970e.c(b(d11, i19, this.f24967b, false, (i19 - i18) - i16, i14, i18, i17));
                        }
                    } catch (NotFoundException unused3) {
                        byte[] bArr = this.f24966a;
                        int i21 = this.f24967b;
                        int i22 = this.f24968c;
                        return this.f24970e.c(b(bArr, i21, i22, true, (i21 - i17) - i14, (i22 - i18) - i16, i17, i18));
                    }
                } catch (NotFoundException unused4) {
                    byte[] d12 = d(this.f24966a, this.f24967b, this.f24968c);
                    int i23 = this.f24968c;
                    int i24 = this.f24967b;
                    return this.f24970e.c(b(d12, i23, i24, true, i16, (i24 - i17) - i14, i18, i17));
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c */
    public void onPostExecute(com.google.zxing.j jVar) {
        super.onPostExecute(jVar);
        if (jVar != null) {
            this.f24969d.g(jVar, this.f24967b, this.f24968c, this.f24966a);
        }
        this.f24969d.c();
    }
}