package fr.bamlab.rnimageresizer;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f26803a = {"ApertureValue", "MaxApertureValue", "MeteringMode", "Artist", "BitsPerSample", "Compression", "BodySerialNumber", "BrightnessValue", "Contrast", "CameraOwnerName", "ColorSpace", "Copyright", "DateTime", "DateTimeDigitized", "DateTimeOriginal", "DeviceSettingDescription", "DigitalZoomRatio", "ExifVersion", "ExposureBiasValue", "ExposureIndex", "ExposureMode", "ExposureTime", "ExposureProgram", "Flash", "FlashEnergy", "FocalLength", "FocalLengthIn35mmFilm", "FocalPlaneResolutionUnit", "FocalPlaneXResolution", "FocalPlaneYResolution", "PhotometricInterpretation", "PlanarConfiguration", "FNumber", "GainControl", "Gamma", "GPSAltitude", "GPSAltitudeRef", "GPSAreaInformation", "GPSDateStamp", "GPSDOP", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSStatus", "GPSDestBearing", "GPSDestBearingRef", "GPSDestDistance", "GPSDestDistanceRef", "GPSDestLatitude", "GPSDestLatitudeRef", "GPSDestLongitude", "GPSDestLongitudeRef", "GPSDifferential", "GPSImgDirection", "GPSImgDirectionRef", "GPSMapDatum", "GPSMeasureMode", "GPSProcessingMethod", "GPSSatellites", "GPSSpeed", "GPSSpeedRef", "GPSStatus", "GPSTimeStamp", "GPSTrack", "GPSTrackRef", "GPSVersionID", "ImageDescription", "ImageUniqueID", "ISOSpeed", "PhotographicSensitivity", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "LensMake", "LensModel", "LensSerialNumber", "LensSpecification", "LightSource", "Make", "MakerNote", "Model", "Saturation", "Sharpness", "ShutterSpeedValue", "Software", "SubjectDistance", "SubjectDistanceRange", "SubjectLocation", "UserComment", "WhiteBalance"};

    private static int a(BitmapFactory.Options options, int i11, int i12) {
        int i13 = options.outHeight;
        int i14 = options.outWidth;
        int i15 = 1;
        if (i13 > i12 || i14 > i11) {
            int i16 = i13 / 2;
            int i17 = i14 / 2;
            while (i16 / i15 >= i12 && i17 / i15 >= i11) {
                i15 *= 2;
            }
        }
        return i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033 A[Catch: Exception -> 0x0046, TryCatch #1 {Exception -> 0x0046, blocks: (B:17:0x002d, B:19:0x0033, B:21:0x003b, B:22:0x003e, B:23:0x0041), top: B:31:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(android.content.Context r6, android.net.Uri r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "ImageResizer::copyExif"
            r1 = 0
            r2 = 0
            java.io.File r6 = d(r6, r7)     // Catch: java.lang.Exception -> L21
            boolean r7 = r6.exists()     // Catch: java.lang.Exception -> L21
            if (r7 != 0) goto Lf
            return r2
        Lf:
            androidx.exifinterface.media.a r7 = new androidx.exifinterface.media.a     // Catch: java.lang.Exception -> L21
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Exception -> L21
            r7.<init>(r6)     // Catch: java.lang.Exception -> L21
            androidx.exifinterface.media.a r6 = new androidx.exifinterface.media.a     // Catch: java.lang.Exception -> L1f
            r6.<init>(r8)     // Catch: java.lang.Exception -> L1f
            r1 = r6
            goto L28
        L1f:
            r6 = move-exception
            goto L23
        L21:
            r6 = move-exception
            r7 = r1
        L23:
            java.lang.String r8 = "EXIF read failed"
            android.util.Log.e(r0, r8, r6)
        L28:
            if (r7 == 0) goto L4c
            if (r1 != 0) goto L2d
            goto L4c
        L2d:
            java.lang.String[] r6 = fr.bamlab.rnimageresizer.a.f26803a     // Catch: java.lang.Exception -> L46
            int r8 = r6.length     // Catch: java.lang.Exception -> L46
            r3 = r2
        L31:
            if (r3 >= r8) goto L41
            r4 = r6[r3]     // Catch: java.lang.Exception -> L46
            java.lang.String r5 = r7.g(r4)     // Catch: java.lang.Exception -> L46
            if (r5 == 0) goto L3e
            r1.d0(r4, r5)     // Catch: java.lang.Exception -> L46
        L3e:
            int r3 = r3 + 1
            goto L31
        L41:
            r1.Y()     // Catch: java.lang.Exception -> L46
            r6 = 1
            return r6
        L46:
            r6 = move-exception
            java.lang.String r7 = "EXIF copy failed"
            android.util.Log.e(r0, r7, r6)
        L4c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.bamlab.rnimageresizer.a.b(android.content.Context, android.net.Uri, java.lang.String):boolean");
    }

    public static Bitmap c(Context context, Uri uri, int i11, int i12, int i13, int i14, String str, boolean z11) {
        Bitmap i15;
        String scheme = uri.getScheme();
        if (scheme != null && !scheme.equalsIgnoreCase(Action.FILE_ATTRIBUTE) && !scheme.equalsIgnoreCase("content")) {
            if (!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https")) {
                i15 = scheme.equalsIgnoreCase(MessageExtension.FIELD_DATA) ? h(uri) : null;
            } else {
                i15 = j(uri, i11, i12);
            }
        } else {
            i15 = i(context, uri, i11, i12);
        }
        if (i15 != null) {
            Bitmap l11 = l(i15, e(context, uri) + i14);
            if (l11 != null) {
                Bitmap k11 = k(l11, i11, i12, str, z11);
                if (k11 != null) {
                    if (k11 != l11) {
                        l11.recycle();
                    }
                    return k11;
                }
                throw new IOException("Unable to resize image. Most likely due to not enough memory.");
            }
            throw new IOException("Unable to rotate image. Most likely due to not enough memory.");
        }
        throw new IOException("Unable to load source image from path");
    }

    private static File d(Context context, Uri uri) {
        File file = new File(uri.getPath());
        if (file.exists()) {
            return file;
        }
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            cursor.moveToFirst();
            File file2 = new File(cursor.getString(columnIndexOrThrow));
            cursor.close();
            return file2;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
                return file;
            }
            return file;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static int e(Context context, Uri uri) {
        try {
            File d11 = d(context, uri);
            if (d11.exists()) {
                return f(new androidx.exifinterface.media.a(d11.getAbsolutePath()));
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int f(androidx.exifinterface.media.a aVar) {
        int i11 = aVar.i("Orientation", 1);
        if (i11 != 3) {
            if (i11 != 6) {
                return i11 != 8 ? 0 : 270;
            }
            return 90;
        }
        return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
    }

    private static Bitmap g(Context context, Uri uri, BitmapFactory.Options options) {
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equalsIgnoreCase("content")) {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream != null) {
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream, null, options);
                openInputStream.close();
                return decodeStream;
            }
            return null;
        }
        try {
            return BitmapFactory.decodeFile(uri.getPath(), options);
        } catch (Exception e11) {
            e11.printStackTrace();
            throw new IOException("Error decoding image file");
        }
    }

    private static Bitmap h(Uri uri) {
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int indexOf = schemeSpecificPart.indexOf(44);
        if (indexOf != -1) {
            String lowerCase = schemeSpecificPart.substring(0, indexOf).replace(CoreConstants.ESCAPE_CHAR, '/').toLowerCase();
            boolean startsWith = lowerCase.startsWith("image/jpeg");
            boolean z11 = !startsWith && lowerCase.startsWith("image/png");
            if (startsWith || z11) {
                byte[] decode = Base64.decode(schemeSpecificPart.substring(indexOf + 1), 0);
                return BitmapFactory.decodeByteArray(decode, 0, decode.length);
            }
        }
        return null;
    }

    private static Bitmap i(Context context, Uri uri, int i11, int i12) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        g(context, uri, options);
        options.inSampleSize = a(options, i11, i12);
        options.inJustDecodeBounds = false;
        return g(context, uri, options);
    }

    private static Bitmap j(Uri uri, int i11, int i12) {
        InputStream inputStream = null;
        Bitmap decodeByteArray = null;
        inputStream = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection()));
                httpURLConnection.connect();
                InputStream inputStream2 = httpURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            try {
                                int read = inputStream2.read(bArr, 0, 1024);
                                if (read == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            } catch (Throwable th2) {
                                byteArrayOutputStream.close();
                                throw th2;
                            }
                        }
                        byteArrayOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                        options.inSampleSize = a(options, i11, i12);
                        options.inJustDecodeBounds = false;
                        decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                    } catch (Exception e11) {
                        e = e11;
                        inputStream = inputStream2;
                        e.printStackTrace();
                        throw new IOException("Error fetching remote image file.");
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e12) {
                                e12.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException e13) {
                        e13.printStackTrace();
                    }
                }
                return decodeByteArray;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e14) {
            e = e14;
        }
    }

    private static Bitmap k(Bitmap bitmap, int i11, int i12, String str, boolean z11) {
        float min;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (i12 <= 0 || i11 <= 0) {
            return null;
        }
        if (!str.equals("stretch")) {
            float f11 = width;
            float f12 = i11 / f11;
            float f13 = height;
            float f14 = i12 / f13;
            if (str.equals("cover")) {
                min = Math.max(f12, f14);
            } else {
                min = Math.min(f12, f14);
            }
            if (z11) {
                min = Math.min(min, 1.0f);
            }
            int round = Math.round(f11 * min);
            i12 = Math.round(f13 * min);
            i11 = round;
        } else if (z11) {
            i11 = Math.min(width, i11);
            i12 = Math.min(height, i12);
        }
        try {
            return Bitmap.createScaledBitmap(bitmap, i11, i12, true);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static Bitmap l(Bitmap bitmap, float f11) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f11);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static File m(Bitmap bitmap, File file, String str, Bitmap.CompressFormat compressFormat, int i11) {
        if (bitmap != null) {
            File file2 = new File(file, str + "." + compressFormat.name());
            if (file2.createNewFile()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(compressFormat, i11, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                fileOutputStream.close();
                return file2;
            }
            throw new IOException("The file already exists");
        }
        throw new IOException("The bitmap couldn't be resized");
    }
}