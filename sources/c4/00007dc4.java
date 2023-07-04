package kb;

import bc.j;
import cc.e;
import com.drew.imaging.ImageProcessingException;
import java.io.BufferedInputStream;
import java.io.InputStream;
import tb.f;

/* loaded from: classes.dex */
public class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34551a;

        static {
            int[] iArr = new int[com.drew.imaging.a.values().length];
            f34551a = iArr;
            try {
                iArr[com.drew.imaging.a.Jpeg.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34551a[com.drew.imaging.a.Tiff.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34551a[com.drew.imaging.a.Arw.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34551a[com.drew.imaging.a.Cr2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34551a[com.drew.imaging.a.Nef.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34551a[com.drew.imaging.a.Orf.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34551a[com.drew.imaging.a.Rw2.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34551a[com.drew.imaging.a.Psd.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34551a[com.drew.imaging.a.Png.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34551a[com.drew.imaging.a.Bmp.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34551a[com.drew.imaging.a.Gif.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34551a[com.drew.imaging.a.Ico.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34551a[com.drew.imaging.a.Pcx.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34551a[com.drew.imaging.a.WebP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34551a[com.drew.imaging.a.Raf.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34551a[com.drew.imaging.a.Avi.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34551a[com.drew.imaging.a.Wav.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f34551a[com.drew.imaging.a.Mov.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f34551a[com.drew.imaging.a.Mp4.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f34551a[com.drew.imaging.a.Eps.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f34551a[com.drew.imaging.a.Unknown.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public static e a(InputStream inputStream, long j11) {
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
        com.drew.imaging.a a11 = kb.a.a(bufferedInputStream);
        e b11 = b(bufferedInputStream, j11, a11);
        b11.a(new jc.b(a11));
        return b11;
    }

    public static e b(InputStream inputStream, long j11, com.drew.imaging.a aVar) {
        switch (a.f34551a[aVar.ordinal()]) {
            case 1:
                return qb.a.c(inputStream);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return yb.c.a(new j(inputStream, 2048, j11));
            case 8:
                return ub.a.a(inputStream);
            case 9:
                return f.b(inputStream);
            case 10:
                return mb.a.a(inputStream);
            case 11:
                return ob.a.a(inputStream);
            case 12:
                return pb.a.a(inputStream);
            case 13:
                return sb.a.a(inputStream);
            case 14:
                return ac.a.a(inputStream);
            case 15:
                return wb.a.a(inputStream);
            case 16:
                return lb.a.a(inputStream);
            case 17:
                return zb.a.a(inputStream);
            case 18:
                return vb.b.a(inputStream);
            case 19:
                return rb.b.a(inputStream);
            case 20:
                return nb.a.a(inputStream);
            case 21:
                throw new ImageProcessingException("File format could not be determined");
            default:
                return new e();
        }
    }
}