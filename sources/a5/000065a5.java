package df;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import bf.b;
import bf.e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final bf.a f23975a;

    /* renamed from: b  reason: collision with root package name */
    private final b f23976b;

    /* renamed from: c  reason: collision with root package name */
    private final Paint f23977c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f23978a;

        static {
            int[] iArr = new int[c.values().length];
            f23978a = iArr;
            try {
                iArr[c.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23978a[c.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23978a[c.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23978a[c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(int i11, Bitmap bitmap);

        qd.a<Bitmap> b(int i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public d(bf.a aVar, b bVar) {
        this.f23975a = aVar;
        this.f23976b = bVar;
        Paint paint = new Paint();
        this.f23977c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas, bf.b bVar) {
        int i11 = bVar.f7650a;
        int i12 = bVar.f7651b;
        canvas.drawRect(i11, i12, i11 + bVar.f7652c, i12 + bVar.f7653d, this.f23977c);
    }

    private c b(int i11) {
        bf.b c11 = this.f23975a.c(i11);
        b.EnumC0150b enumC0150b = c11.f7655f;
        if (enumC0150b == b.EnumC0150b.DISPOSE_DO_NOT) {
            return c.REQUIRED;
        }
        if (enumC0150b == b.EnumC0150b.DISPOSE_TO_BACKGROUND) {
            if (c(c11)) {
                return c.NOT_REQUIRED;
            }
            return c.REQUIRED;
        } else if (enumC0150b == b.EnumC0150b.DISPOSE_TO_PREVIOUS) {
            return c.SKIP;
        } else {
            return c.ABORT;
        }
    }

    private boolean c(bf.b bVar) {
        return bVar.f7650a == 0 && bVar.f7651b == 0 && bVar.f7652c == this.f23975a.h() && bVar.f7653d == this.f23975a.g();
    }

    private boolean d(int i11) {
        if (i11 == 0) {
            return true;
        }
        bf.b c11 = this.f23975a.c(i11);
        bf.b c12 = this.f23975a.c(i11 - 1);
        if (c11.f7654e == b.a.NO_BLEND && c(c11)) {
            return true;
        }
        return c12.f7655f == b.EnumC0150b.DISPOSE_TO_BACKGROUND && c(c12);
    }

    private void e(Bitmap bitmap) {
        vf.a c11;
        e i11 = this.f23975a.i();
        if (i11 == null || (c11 = i11.c()) == null) {
            return;
        }
        c11.a(bitmap);
    }

    private int f(int i11, Canvas canvas) {
        while (i11 >= 0) {
            int i12 = a.f23978a[b(i11).ordinal()];
            if (i12 == 1) {
                bf.b c11 = this.f23975a.c(i11);
                qd.a<Bitmap> b11 = this.f23976b.b(i11);
                if (b11 != null) {
                    try {
                        canvas.drawBitmap(b11.J(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (Paint) null);
                        if (c11.f7655f == b.EnumC0150b.DISPOSE_TO_BACKGROUND) {
                            a(canvas, c11);
                        }
                        return i11 + 1;
                    } finally {
                        b11.close();
                    }
                } else if (d(i11)) {
                    return i11;
                }
            } else if (i12 == 2) {
                return i11 + 1;
            } else {
                if (i12 == 3) {
                    return i11;
                }
            }
            i11--;
        }
        return 0;
    }

    public void g(int i11, Bitmap bitmap) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int f11 = !d(i11) ? f(i11 - 1, canvas) : i11; f11 < i11; f11++) {
            bf.b c11 = this.f23975a.c(f11);
            b.EnumC0150b enumC0150b = c11.f7655f;
            if (enumC0150b != b.EnumC0150b.DISPOSE_TO_PREVIOUS) {
                if (c11.f7654e == b.a.NO_BLEND) {
                    a(canvas, c11);
                }
                this.f23975a.d(f11, canvas);
                this.f23976b.a(f11, bitmap);
                if (enumC0150b == b.EnumC0150b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, c11);
                }
            }
        }
        bf.b c12 = this.f23975a.c(i11);
        if (c12.f7654e == b.a.NO_BLEND) {
            a(canvas, c12);
        }
        this.f23975a.d(i11, canvas);
        e(bitmap);
    }
}