package m3;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import l3.e;
import s3.f;

/* loaded from: classes.dex */
public class i extends j {
    @Override // m3.j
    public Typeface b(Context context, e.b bVar, Resources resources, int i11) {
        try {
            e.c[] a11 = bVar.a();
            int length = a11.length;
            FontFamily.Builder builder = null;
            int i12 = 0;
            while (true) {
                int i13 = 1;
                if (i12 >= length) {
                    break;
                }
                e.c cVar = a11[i12];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.b()).setWeight(cVar.e());
                    if (!cVar.f()) {
                        i13 = 0;
                    }
                    Font build = weight.setSlant(i13).setTtcIndex(cVar.c()).setFontVariationSettings(cVar.d()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i12++;
            }
            if (builder == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i11 & 1) != 0 ? 700 : 400, (i11 & 2) != 0 ? 1 : 0)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // m3.j
    public Typeface c(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i11) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = bVarArr.length;
            FontFamily.Builder builder = null;
            int i12 = 0;
            while (true) {
                int i13 = 1;
                if (i12 >= length) {
                    if (builder == null) {
                        return null;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle((i11 & 1) != 0 ? 700 : 400, (i11 & 2) != 0 ? 1 : 0)).build();
                }
                f.b bVar = bVarArr[i12];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(bVar.d(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(bVar.e());
                        if (!bVar.f()) {
                            i13 = 0;
                        }
                        Font build = weight.setSlant(i13).setTtcIndex(bVar.c()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th2) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                    i12++;
                }
                openFileDescriptor.close();
                i12++;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m3.j
    public Typeface d(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // m3.j
    public Typeface e(Context context, Resources resources, int i11, String str, int i12) {
        try {
            Font build = new Font.Builder(resources, i11).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m3.j
    public f.b h(f.b[] bVarArr, int i11) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}