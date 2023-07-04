package e80;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.File;
import java.io.IOException;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes5.dex */
public class h extends AsyncTask<Void, Void, WritableMap> {

    /* renamed from: a  reason: collision with root package name */
    private Promise f25001a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f25002b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f25003c;

    /* renamed from: d  reason: collision with root package name */
    private ReadableMap f25004d;

    /* renamed from: e  reason: collision with root package name */
    private File f25005e;

    /* renamed from: f  reason: collision with root package name */
    private int f25006f;

    /* renamed from: g  reason: collision with root package name */
    private g f25007g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f25008a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f25008a = iArr;
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25008a[ReadableType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(byte[] bArr, Promise promise, ReadableMap readableMap, File file, int i11, g gVar) {
        this.f25001a = promise;
        this.f25004d = readableMap;
        this.f25003c = bArr;
        this.f25005e = file;
        this.f25006f = i11;
        this.f25007g = gVar;
    }

    private Bitmap b(Bitmap bitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private String c() {
        if (this.f25004d.hasKey("path")) {
            return this.f25004d.getString("path");
        }
        return f80.c.b(this.f25005e, ".jpg");
    }

    private int d(int i11) {
        if (i11 != 3) {
            if (i11 != 6) {
                return i11 != 8 ? 0 : 270;
            }
            return 90;
        }
        return CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
    }

    private int e() {
        return (int) (this.f25004d.getDouble(ImagePickerConstants.OPTION_QUALITY) * 100.0d);
    }

    private void f() {
        if (this.f25002b == null) {
            byte[] bArr = this.f25003c;
            this.f25002b = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        if (this.f25002b == null) {
            throw new IOException("Failed to decode Image Bitmap");
        }
    }

    private Bitmap h(Bitmap bitmap, int i11) {
        return Bitmap.createScaledBitmap(bitmap, i11, (int) (bitmap.getHeight() * (i11 / bitmap.getWidth())), true);
    }

    private Bitmap i(Bitmap bitmap, int i11) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i11);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String j(java.io.ByteArrayOutputStream r4) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = r3.c()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L18 java.lang.Throwable -> L1b
            r2.<init>(r1)     // Catch: java.io.IOException -> L18 java.lang.Throwable -> L1b
            r4.writeTo(r2)     // Catch: java.io.IOException -> L16 java.lang.Throwable -> L2d
            r2.close()     // Catch: java.io.IOException -> L11
            goto L29
        L11:
            r4 = move-exception
            r4.printStackTrace()
            goto L29
        L16:
            r4 = move-exception
            goto L20
        L18:
            r4 = move-exception
            r2 = r0
            goto L20
        L1b:
            r4 = move-exception
            goto L2f
        L1d:
            r4 = move-exception
            r1 = r0
            r2 = r1
        L20:
            r0 = r4
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L29
            r2.close()     // Catch: java.io.IOException -> L11
        L29:
            if (r0 != 0) goto L2c
            return r1
        L2c:
            throw r0
        L2d:
            r4 = move-exception
            r0 = r2
        L2f:
            if (r0 == 0) goto L39
            r0.close()     // Catch: java.io.IOException -> L35
            goto L39
        L35:
            r0 = move-exception
            r0.printStackTrace()
        L39:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e80.h.j(java.io.ByteArrayOutputStream):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(31:6|7|8|9|10|(1:104)(2:14|(1:16)(1:103))|17|(1:19)|20|(1:24)|25|(1:102)(1:29)|30|(2:32|(1:(1:35)(9:36|37|(7:81|(4:86|87|(2:89|(1:91))|(1:93))|96|(1:98)|87|(0)|(0))(1:40)|41|42|(4:44|(3:60|(1:(1:66))(1:63)|64)|48|(1:52))(4:67|(3:76|(1:79)|80)|71|(1:75))|53|54|55))(17:99|100|37|(0)|81|(10:86|87|(0)|(0)|41|42|(0)(0)|53|54|55)|96|(0)|87|(0)|(0)|41|42|(0)(0)|53|54|55))|101|100|37|(0)|81|(0)|96|(0)|87|(0)|(0)|41|42|(0)(0)|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0235, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0236, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f7, code lost:
        r2 = new androidx.exifinterface.media.a(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0102 A[Catch: IOException -> 0x023b, NotFoundException -> 0x023d, all -> 0x026e, TryCatch #6 {all -> 0x026e, blocks: (B:8:0x0038, B:11:0x0044, B:13:0x004c, B:15:0x0057, B:18:0x006c, B:20:0x0074, B:21:0x0085, B:23:0x008d, B:25:0x0095, B:26:0x00a0, B:28:0x00a8, B:32:0x00b3, B:34:0x00bc, B:38:0x00cf, B:66:0x012a, B:69:0x0134, B:71:0x0153, B:80:0x01a7, B:82:0x01af, B:84:0x01b7, B:73:0x015b, B:76:0x017b, B:79:0x019c, B:78:0x018d, B:85:0x01c2, B:87:0x01ea, B:94:0x0215, B:96:0x021d, B:98:0x0225, B:89:0x01f2, B:92:0x01fa, B:93:0x0205, B:48:0x00ea, B:59:0x0105, B:61:0x0109, B:63:0x011b, B:65:0x0120, B:55:0x00f7, B:56:0x00fc, B:58:0x0102, B:39:0x00d8, B:112:0x0245, B:118:0x0257), top: B:141:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109 A[Catch: IOException -> 0x023b, NotFoundException -> 0x023d, all -> 0x026e, TryCatch #6 {all -> 0x026e, blocks: (B:8:0x0038, B:11:0x0044, B:13:0x004c, B:15:0x0057, B:18:0x006c, B:20:0x0074, B:21:0x0085, B:23:0x008d, B:25:0x0095, B:26:0x00a0, B:28:0x00a8, B:32:0x00b3, B:34:0x00bc, B:38:0x00cf, B:66:0x012a, B:69:0x0134, B:71:0x0153, B:80:0x01a7, B:82:0x01af, B:84:0x01b7, B:73:0x015b, B:76:0x017b, B:79:0x019c, B:78:0x018d, B:85:0x01c2, B:87:0x01ea, B:94:0x0215, B:96:0x021d, B:98:0x0225, B:89:0x01f2, B:92:0x01fa, B:93:0x0205, B:48:0x00ea, B:59:0x0105, B:61:0x0109, B:63:0x011b, B:65:0x0120, B:55:0x00f7, B:56:0x00fc, B:58:0x0102, B:39:0x00d8, B:112:0x0245, B:118:0x0257), top: B:141:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120 A[Catch: IOException -> 0x023b, NotFoundException -> 0x023d, all -> 0x026e, TryCatch #6 {all -> 0x026e, blocks: (B:8:0x0038, B:11:0x0044, B:13:0x004c, B:15:0x0057, B:18:0x006c, B:20:0x0074, B:21:0x0085, B:23:0x008d, B:25:0x0095, B:26:0x00a0, B:28:0x00a8, B:32:0x00b3, B:34:0x00bc, B:38:0x00cf, B:66:0x012a, B:69:0x0134, B:71:0x0153, B:80:0x01a7, B:82:0x01af, B:84:0x01b7, B:73:0x015b, B:76:0x017b, B:79:0x019c, B:78:0x018d, B:85:0x01c2, B:87:0x01ea, B:94:0x0215, B:96:0x021d, B:98:0x0225, B:89:0x01f2, B:92:0x01fa, B:93:0x0205, B:48:0x00ea, B:59:0x0105, B:61:0x0109, B:63:0x011b, B:65:0x0120, B:55:0x00f7, B:56:0x00fc, B:58:0x0102, B:39:0x00d8, B:112:0x0245, B:118:0x0257), top: B:141:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0134 A[Catch: IOException -> 0x023b, NotFoundException -> 0x023d, all -> 0x026e, TRY_ENTER, TryCatch #6 {all -> 0x026e, blocks: (B:8:0x0038, B:11:0x0044, B:13:0x004c, B:15:0x0057, B:18:0x006c, B:20:0x0074, B:21:0x0085, B:23:0x008d, B:25:0x0095, B:26:0x00a0, B:28:0x00a8, B:32:0x00b3, B:34:0x00bc, B:38:0x00cf, B:66:0x012a, B:69:0x0134, B:71:0x0153, B:80:0x01a7, B:82:0x01af, B:84:0x01b7, B:73:0x015b, B:76:0x017b, B:79:0x019c, B:78:0x018d, B:85:0x01c2, B:87:0x01ea, B:94:0x0215, B:96:0x021d, B:98:0x0225, B:89:0x01f2, B:92:0x01fa, B:93:0x0205, B:48:0x00ea, B:59:0x0105, B:61:0x0109, B:63:0x011b, B:65:0x0120, B:55:0x00f7, B:56:0x00fc, B:58:0x0102, B:39:0x00d8, B:112:0x0245, B:118:0x0257), top: B:141:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c2 A[Catch: IOException -> 0x023b, NotFoundException -> 0x023d, all -> 0x026e, TryCatch #6 {all -> 0x026e, blocks: (B:8:0x0038, B:11:0x0044, B:13:0x004c, B:15:0x0057, B:18:0x006c, B:20:0x0074, B:21:0x0085, B:23:0x008d, B:25:0x0095, B:26:0x00a0, B:28:0x00a8, B:32:0x00b3, B:34:0x00bc, B:38:0x00cf, B:66:0x012a, B:69:0x0134, B:71:0x0153, B:80:0x01a7, B:82:0x01af, B:84:0x01b7, B:73:0x015b, B:76:0x017b, B:79:0x019c, B:78:0x018d, B:85:0x01c2, B:87:0x01ea, B:94:0x0215, B:96:0x021d, B:98:0x0225, B:89:0x01f2, B:92:0x01fa, B:93:0x0205, B:48:0x00ea, B:59:0x0105, B:61:0x0109, B:63:0x011b, B:65:0x0120, B:55:0x00f7, B:56:0x00fc, B:58:0x0102, B:39:0x00d8, B:112:0x0245, B:118:0x0257), top: B:141:0x0031 }] */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.facebook.react.bridge.WritableMap doInBackground(java.lang.Void... r17) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e80.h.doInBackground(java.lang.Void[]):com.facebook.react.bridge.WritableMap");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: g */
    public void onPostExecute(WritableMap writableMap) {
        super.onPostExecute(writableMap);
        if (writableMap != null) {
            if (this.f25004d.hasKey("fastMode") && this.f25004d.getBoolean("fastMode")) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", this.f25004d.getInt("id"));
                createMap.putMap(MessageExtension.FIELD_DATA, writableMap);
                this.f25007g.e(createMap);
                return;
            }
            this.f25001a.resolve(writableMap);
        }
    }
}