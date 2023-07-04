package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    static final PorterDuff.Mode f4422k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f4423a;

    /* renamed from: b  reason: collision with root package name */
    Object f4424b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f4425c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f4426d;

    /* renamed from: e  reason: collision with root package name */
    public int f4427e;

    /* renamed from: f  reason: collision with root package name */
    public int f4428f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f4429g;

    /* renamed from: h  reason: collision with root package name */
    PorterDuff.Mode f4430h;

    /* renamed from: i  reason: collision with root package name */
    public String f4431i;

    /* renamed from: j  reason: collision with root package name */
    public String f4432j;

    public IconCompat() {
        this.f4423a = -1;
        this.f4425c = null;
        this.f4426d = null;
        this.f4427e = 0;
        this.f4428f = 0;
        this.f4429g = null;
        this.f4430h = f4422k;
        this.f4431i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z11) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f11 = min;
        float f12 = 0.5f * f11;
        float f13 = 0.9166667f * f12;
        if (z11) {
            float f14 = 0.010416667f * f11;
            paint.setColor(0);
            paint.setShadowLayer(f14, BitmapDescriptorFactory.HUE_RED, f11 * 0.020833334f, 1023410176);
            canvas.drawCircle(f12, f12, f13, paint);
            paint.setShadowLayer(f14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 503316480);
            canvas.drawCircle(f12, f12, f13, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f12, f12, f13, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f4424b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat c(Resources resources, String str, int i11) {
        if (str != null) {
            if (i11 != 0) {
                IconCompat iconCompat = new IconCompat(2);
                iconCompat.f4427e = i11;
                if (resources != null) {
                    try {
                        iconCompat.f4424b = resources.getResourceName(i11);
                    } catch (Resources.NotFoundException unused) {
                        throw new IllegalArgumentException("Icon resource cannot be found");
                    }
                } else {
                    iconCompat.f4424b = str;
                }
                iconCompat.f4432j = str;
                return iconCompat;
            }
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        throw new IllegalArgumentException("Package must not be null.");
    }

    private static int f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (NoSuchMethodException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        } catch (InvocationTargetException e13) {
            Log.e("IconCompat", "Unable to get icon resource", e13);
            return 0;
        }
    }

    private static String h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        } catch (NoSuchMethodException e12) {
            Log.e("IconCompat", "Unable to get icon package", e12);
            return null;
        } catch (InvocationTargetException e13) {
            Log.e("IconCompat", "Unable to get icon package", e13);
            return null;
        }
    }

    private static int j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e11) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e11);
            return -1;
        } catch (NoSuchMethodException e12) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e12);
            return -1;
        } catch (InvocationTargetException e13) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e13);
            return -1;
        }
    }

    private static Uri l(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (NoSuchMethodException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        } catch (InvocationTargetException e13) {
            Log.e("IconCompat", "Unable to get icon uri", e13);
            return null;
        }
    }

    private static String r(int i11) {
        switch (i11) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap d() {
        int i11 = this.f4423a;
        if (i11 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f4424b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i11 == 1) {
            return (Bitmap) this.f4424b;
        } else {
            if (i11 == 5) {
                return a((Bitmap) this.f4424b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int e() {
        int i11 = this.f4423a;
        if (i11 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i11 == 2) {
                return this.f4427e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        return f((Icon) this.f4424b);
    }

    public String g() {
        int i11 = this.f4423a;
        if (i11 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i11 == 2) {
                if (TextUtils.isEmpty(this.f4432j)) {
                    return ((String) this.f4424b).split(":", -1)[0];
                }
                return this.f4432j;
            }
            throw new IllegalStateException("called getResPackage() on " + this);
        }
        return h((Icon) this.f4424b);
    }

    public int i() {
        int i11 = this.f4423a;
        return (i11 != -1 || Build.VERSION.SDK_INT < 23) ? i11 : j((Icon) this.f4424b);
    }

    public Uri k() {
        int i11 = this.f4423a;
        if (i11 != -1 || Build.VERSION.SDK_INT < 23) {
            if (i11 != 4 && i11 != 6) {
                throw new IllegalStateException("called getUri() on " + this);
            }
            return Uri.parse((String) this.f4424b);
        }
        return l((Icon) this.f4424b);
    }

    public InputStream m(Context context) {
        Uri k11 = k();
        String scheme = k11.getScheme();
        if (!"content".equals(scheme) && !Action.FILE_ATTRIBUTE.equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f4424b));
            } catch (FileNotFoundException e11) {
                Log.w("IconCompat", "Unable to load image from path: " + k11, e11);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(k11);
        } catch (Exception e12) {
            Log.w("IconCompat", "Unable to load image from URI: " + k11, e12);
            return null;
        }
    }

    public void n() {
        this.f4430h = PorterDuff.Mode.valueOf(this.f4431i);
        switch (this.f4423a) {
            case -1:
                Parcelable parcelable = this.f4426d;
                if (parcelable != null) {
                    this.f4424b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f4426d;
                if (parcelable2 != null) {
                    this.f4424b = parcelable2;
                    return;
                }
                byte[] bArr = this.f4425c;
                this.f4424b = bArr;
                this.f4423a = 3;
                this.f4427e = 0;
                this.f4428f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f4425c, Charset.forName("UTF-16"));
                this.f4424b = str;
                if (this.f4423a == 2 && this.f4432j == null) {
                    this.f4432j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f4424b = this.f4425c;
                return;
        }
    }

    public void o(boolean z11) {
        this.f4431i = this.f4430h.name();
        switch (this.f4423a) {
            case -1:
                if (!z11) {
                    this.f4426d = (Parcelable) this.f4424b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z11) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f4424b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f4425c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f4426d = (Parcelable) this.f4424b;
                return;
            case 2:
                this.f4425c = ((String) this.f4424b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f4425c = (byte[]) this.f4424b;
                return;
            case 4:
            case 6:
                this.f4425c = this.f4424b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @Deprecated
    public Icon p() {
        return q(null);
    }

    public Icon q(Context context) {
        Icon createWithBitmap;
        switch (this.f4423a) {
            case -1:
                return (Icon) this.f4424b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f4424b);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(g(), this.f4427e);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f4424b, this.f4427e, this.f4428f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f4424b);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f4424b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f4424b, false));
                    break;
                }
            case 6:
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 30) {
                    createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(k());
                    break;
                } else if (context != null) {
                    InputStream m11 = m(context);
                    if (m11 == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + k());
                    } else if (i11 >= 26) {
                        createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(m11));
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(m11), false));
                        break;
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + k());
                }
        }
        ColorStateList colorStateList = this.f4429g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f4430h;
        if (mode != f4422k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public String toString() {
        if (this.f4423a == -1) {
            return String.valueOf(this.f4424b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(r(this.f4423a));
        switch (this.f4423a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f4424b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f4424b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f4432j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f4427e);
                if (this.f4428f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f4428f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f4424b);
                break;
        }
        if (this.f4429g != null) {
            sb2.append(" tint=");
            sb2.append(this.f4429g);
        }
        if (this.f4430h != f4422k) {
            sb2.append(" mode=");
            sb2.append(this.f4430h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    private IconCompat(int i11) {
        this.f4423a = -1;
        this.f4425c = null;
        this.f4426d = null;
        this.f4427e = 0;
        this.f4428f = 0;
        this.f4429g = null;
        this.f4430h = f4422k;
        this.f4431i = null;
        this.f4423a = i11;
    }
}