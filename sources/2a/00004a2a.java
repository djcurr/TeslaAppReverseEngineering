package com.rnfs;

import android.content.res.AssetManager;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.rnfs.a;
import com.rnfs.f;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

@fg.a(name = RNFSManager.MODULE_NAME)
/* loaded from: classes2.dex */
public class RNFSManager extends ReactContextBaseJavaModule {
    static final String MODULE_NAME = "RNFSManager";
    private static final String RNFSCachesDirectoryPath = "RNFSCachesDirectoryPath";
    private static final String RNFSDocumentDirectory = "RNFSDocumentDirectory";
    private static final String RNFSDocumentDirectoryPath = "RNFSDocumentDirectoryPath";
    private static final String RNFSDownloadDirectoryPath = "RNFSDownloadDirectoryPath";
    private static final String RNFSExternalCachesDirectoryPath = "RNFSExternalCachesDirectoryPath";
    private static final String RNFSExternalDirectoryPath = "RNFSExternalDirectoryPath";
    private static final String RNFSExternalStorageDirectoryPath = "RNFSExternalStorageDirectoryPath";
    private static final String RNFSFileTypeDirectory = "RNFSFileTypeDirectory";
    private static final String RNFSFileTypeRegular = "RNFSFileTypeRegular";
    private static final String RNFSPicturesDirectoryPath = "RNFSPicturesDirectoryPath";
    private static final String RNFSTemporaryDirectoryPath = "RNFSTemporaryDirectoryPath";
    private SparseArray<com.rnfs.c> downloaders;
    private ReactApplicationContext reactContext;
    private SparseArray<com.rnfs.h> uploaders;

    /* loaded from: classes2.dex */
    class a extends j {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f20401b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f20402c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f20403d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(File file, Promise promise, String str) {
            super(RNFSManager.this, null);
            this.f20401b = file;
            this.f20402c = promise;
            this.f20403d = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Exception exc) {
            if (exc == null) {
                this.f20401b.delete();
                this.f20402c.resolve(Boolean.TRUE);
                return;
            }
            exc.printStackTrace();
            RNFSManager.this.reject(this.f20402c, this.f20403d, exc);
        }
    }

    /* loaded from: classes2.dex */
    class b extends j {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f20405b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f20406c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Promise promise, String str) {
            super(RNFSManager.this, null);
            this.f20405b = promise;
            this.f20406c = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Exception exc) {
            if (exc == null) {
                this.f20405b.resolve(null);
                return;
            }
            exc.printStackTrace();
            RNFSManager.this.reject(this.f20405b, this.f20406c, exc);
        }
    }

    /* loaded from: classes2.dex */
    class c implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f20408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f20409b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReadableMap f20410c;

        c(int i11, Promise promise, ReadableMap readableMap) {
            this.f20408a = i11;
            this.f20409b = promise;
            this.f20410c = readableMap;
        }

        @Override // com.rnfs.a.c
        public void a(com.rnfs.b bVar) {
            if (bVar.f20438c != null) {
                RNFSManager.this.reject(this.f20409b, this.f20410c.getString("toFile"), bVar.f20438c);
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("jobId", this.f20408a);
            createMap.putInt("statusCode", bVar.f20436a);
            createMap.putDouble("bytesWritten", bVar.f20437b);
            this.f20409b.resolve(createMap);
        }
    }

    /* loaded from: classes2.dex */
    class d implements a.InterfaceC0358a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f20412a;

        d(int i11) {
            this.f20412a = i11;
        }

        @Override // com.rnfs.a.InterfaceC0358a
        public void a(int i11, long j11, Map<String, String> map) {
            WritableMap createMap = Arguments.createMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                createMap.putString(entry.getKey(), entry.getValue());
            }
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("jobId", this.f20412a);
            createMap2.putInt("statusCode", i11);
            createMap2.putDouble("contentLength", j11);
            createMap2.putMap("headers", createMap);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadBegin", createMap2);
        }
    }

    /* loaded from: classes2.dex */
    class e implements a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f20414a;

        e(int i11) {
            this.f20414a = i11;
        }

        @Override // com.rnfs.a.b
        public void a(long j11, long j12) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("jobId", this.f20414a);
            createMap.putDouble("contentLength", j11);
            createMap.putDouble("bytesWritten", j12);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadProgress", createMap);
        }
    }

    /* loaded from: classes2.dex */
    class f implements f.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f20416a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f20417b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReadableMap f20418c;

        f(int i11, Promise promise, ReadableMap readableMap) {
            this.f20416a = i11;
            this.f20417b = promise;
            this.f20418c = readableMap;
        }

        @Override // com.rnfs.f.b
        public void a(com.rnfs.g gVar) {
            if (gVar.f20455c != null) {
                RNFSManager.this.reject(this.f20417b, this.f20418c.getString("toUrl"), gVar.f20455c);
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("jobId", this.f20416a);
            createMap.putInt("statusCode", gVar.f20453a);
            createMap.putMap("headers", gVar.f20454b);
            createMap.putString("body", gVar.f20456d);
            this.f20417b.resolve(createMap);
        }
    }

    /* loaded from: classes2.dex */
    class g implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f20420a;

        g(int i11) {
            this.f20420a = i11;
        }

        @Override // com.rnfs.f.a
        public void a() {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("jobId", this.f20420a);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadBegin", createMap);
        }
    }

    /* loaded from: classes2.dex */
    class h implements f.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f20422a;

        h(int i11) {
            this.f20422a = i11;
        }

        @Override // com.rnfs.f.c
        public void a(int i11, int i12) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("jobId", this.f20422a);
            createMap.putInt("totalBytesExpectedToSend", i11);
            createMap.putInt("totalBytesSent", i12);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadProgress", createMap);
        }
    }

    /* loaded from: classes2.dex */
    class i implements MediaScannerConnection.MediaScannerConnectionClient {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f20424a;

        i(RNFSManager rNFSManager, Promise promise) {
            this.f20424a = promise;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            this.f20424a.resolve(str);
        }
    }

    /* loaded from: classes2.dex */
    private class j extends AsyncTask<String, Void, Exception> {
        private j() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Exception doInBackground(String... strArr) {
            try {
                String str = strArr[0];
                String str2 = strArr[1];
                InputStream inputStream = RNFSManager.this.getInputStream(str);
                OutputStream outputStream = RNFSManager.this.getOutputStream(str2, false);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        outputStream.write(bArr, 0, read);
                        Thread.yield();
                    } else {
                        inputStream.close();
                        outputStream.close();
                        return null;
                    }
                }
            } catch (Exception e11) {
                return e11;
            }
        }

        /* synthetic */ j(RNFSManager rNFSManager, a aVar) {
            this();
        }
    }

    public RNFSManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.downloaders = new SparseArray<>();
        this.uploaders = new SparseArray<>();
        this.reactContext = reactApplicationContext;
    }

    private void DeleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                DeleteRecursive(file2);
            }
        }
        file.delete();
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0022: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:15:0x0022 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void copyInputStream(java.io.InputStream r8, java.lang.String r9, java.lang.String r10, com.facebook.react.bridge.Promise r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            java.io.OutputStream r2 = r7.getOutputStream(r10, r1)     // Catch: java.lang.Throwable -> L26 java.lang.Exception -> L28
            r3 = 10240(0x2800, float:1.4349E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
        La:
            int r4 = r8.read(r3)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r5 = -1
            if (r4 == r5) goto L15
            r2.write(r3, r1, r4)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            goto La
        L15:
            r11.resolve(r0)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L24
            r8.close()     // Catch: java.io.IOException -> L1b
        L1b:
            if (r2 == 0) goto L51
        L1d:
            r2.close()     // Catch: java.io.IOException -> L51
            goto L51
        L21:
            r9 = move-exception
            r0 = r2
            goto L52
        L24:
            r0 = move-exception
            goto L2c
        L26:
            r9 = move-exception
            goto L52
        L28:
            r2 = move-exception
            r6 = r2
            r2 = r0
            r0 = r6
        L2c:
            java.lang.Exception r3 = new java.lang.Exception     // Catch: java.lang.Throwable -> L21
            java.lang.String r4 = "Failed to copy '%s' to %s (%s)"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L21
            r5[r1] = r9     // Catch: java.lang.Throwable -> L21
            r1 = 1
            r5[r1] = r10     // Catch: java.lang.Throwable -> L21
            r10 = 2
            java.lang.String r0 = r0.getLocalizedMessage()     // Catch: java.lang.Throwable -> L21
            r5[r10] = r0     // Catch: java.lang.Throwable -> L21
            java.lang.String r10 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L21
            r3.<init>(r10)     // Catch: java.lang.Throwable -> L21
            r7.reject(r11, r9, r3)     // Catch: java.lang.Throwable -> L21
            if (r8 == 0) goto L4e
            r8.close()     // Catch: java.io.IOException -> L4e
        L4e:
            if (r2 == 0) goto L51
            goto L1d
        L51:
            return
        L52:
            if (r8 == 0) goto L57
            r8.close()     // Catch: java.io.IOException -> L57
        L57:
            if (r0 == 0) goto L5c
            r0.close()     // Catch: java.io.IOException -> L5c
        L5c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.RNFSManager.copyInputStream(java.io.InputStream, java.lang.String, java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    private Uri getFileUri(String str, boolean z11) {
        Uri parse = Uri.parse(str);
        if (parse.getScheme() == null) {
            File file = new File(str);
            if (!z11 && file.isDirectory()) {
                throw new com.rnfs.d("EISDIR", "EISDIR: illegal operation on a directory, read '" + str + "'");
            }
            return Uri.parse("file://" + str);
        }
        return parse;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream getInputStream(String str) {
        try {
            InputStream openInputStream = this.reactContext.getContentResolver().openInputStream(getFileUri(str, false));
            if (openInputStream != null) {
                return openInputStream;
            }
            throw new com.rnfs.d("ENOENT", "ENOENT: could not open an input stream for '" + str + "'");
        } catch (FileNotFoundException e11) {
            throw new com.rnfs.d("ENOENT", "ENOENT: " + e11.getMessage() + ", open '" + str + "'");
        }
    }

    private static byte[] getInputStreamBytes(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private String getOriginalFilepath(String str, boolean z11) {
        Uri fileUri = getFileUri(str, z11);
        if (fileUri.getScheme().equals("content")) {
            try {
                Cursor query = this.reactContext.getContentResolver().query(fileUri, null, null, null, null);
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
                query.close();
            } catch (IllegalArgumentException unused) {
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OutputStream getOutputStream(String str, boolean z11) {
        try {
            OutputStream openOutputStream = this.reactContext.getContentResolver().openOutputStream(getFileUri(str, false), z11 ? "wa" : getWriteAccessByAPILevel());
            if (openOutputStream != null) {
                return openOutputStream;
            }
            throw new com.rnfs.d("ENOENT", "ENOENT: could not open an output stream for '" + str + "'");
        } catch (FileNotFoundException e11) {
            throw new com.rnfs.d("ENOENT", "ENOENT: " + e11.getMessage() + ", open '" + str + "'");
        }
    }

    private int getResIdentifier(String str) {
        boolean z11 = true;
        String substring = str.substring(str.lastIndexOf(".") + 1);
        String substring2 = str.substring(0, str.lastIndexOf("."));
        if (!substring.equals("png") && !substring.equals("jpg") && !substring.equals("jpeg") && !substring.equals("bmp") && !substring.equals("gif") && !substring.equals("webp") && !substring.equals("psd") && !substring.equals("svg") && !substring.equals("tiff")) {
            z11 = false;
        }
        return getReactApplicationContext().getResources().getIdentifier(substring2, Boolean.valueOf(z11).booleanValue() ? "drawable" : "raw", getReactApplicationContext().getPackageName());
    }

    private String getWriteAccessByAPILevel() {
        return Build.VERSION.SDK_INT <= 28 ? "w" : "rwt";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reject(Promise promise, String str, Exception exc) {
        if (exc instanceof FileNotFoundException) {
            rejectFileNotFound(promise, str);
        } else if (exc instanceof com.rnfs.d) {
            com.rnfs.d dVar = (com.rnfs.d) exc;
            promise.reject(dVar.a(), dVar.getMessage());
        } else {
            promise.reject((String) null, exc.getMessage());
        }
    }

    private void rejectFileIsDirectory(Promise promise) {
        promise.reject("EISDIR", "EISDIR: illegal operation on a directory, read");
    }

    private void rejectFileNotFound(Promise promise, String str) {
        promise.reject("ENOENT", "ENOENT: no such file or directory, open '" + str + "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void appendFile(String str, String str2, Promise promise) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, true);
            outputStream.write(decode);
            outputStream.close();
            promise.resolve(null);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void copyFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        new b(promise, str).execute(str, str2);
    }

    @ReactMethod
    public void copyFileAssets(String str, String str2, Promise promise) {
        try {
            copyInputStream(getReactApplicationContext().getAssets().open(str), str, str2, promise);
        } catch (IOException unused) {
            reject(promise, str, new Exception(String.format("Asset '%s' could not be opened", str)));
        }
    }

    @ReactMethod
    public void copyFileRes(String str, String str2, Promise promise) {
        try {
            copyInputStream(getReactApplicationContext().getResources().openRawResource(getResIdentifier(str)), str, str2, promise);
        } catch (Exception unused) {
            reject(promise, str, new Exception(String.format("Res '%s' could not be opened", str)));
        }
    }

    @ReactMethod
    public void downloadFile(ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(readableMap.getString("toFile"));
            URL url = new URL(readableMap.getString("fromUrl"));
            int i11 = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            int i12 = readableMap.getInt("progressInterval");
            int i13 = readableMap.getInt("progressDivider");
            int i14 = readableMap.getInt("readTimeout");
            int i15 = readableMap.getInt("connectionTimeout");
            boolean z11 = readableMap.getBoolean("hasBeginCallback");
            boolean z12 = readableMap.getBoolean("hasProgressCallback");
            com.rnfs.a aVar = new com.rnfs.a();
            aVar.f20426a = url;
            aVar.f20427b = file;
            aVar.f20428c = map;
            aVar.f20429d = i12;
            aVar.f20430e = i13;
            aVar.f20431f = i14;
            aVar.f20432g = i15;
            aVar.f20433h = new c(i11, promise, readableMap);
            if (z11) {
                aVar.f20434i = new d(i11);
            }
            if (z12) {
                aVar.f20435j = new e(i11);
            }
            com.rnfs.c cVar = new com.rnfs.c();
            cVar.execute(aVar);
            this.downloaders.put(i11, cVar);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, readableMap.getString("toFile"), e11);
        }
    }

    @ReactMethod
    public void exists(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).exists()));
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void existsAssets(String str, Promise promise) {
        try {
            AssetManager assets = getReactApplicationContext().getAssets();
            try {
                String[] list = assets.list(str);
                if (list != null && list.length > 0) {
                    promise.resolve(Boolean.TRUE);
                    return;
                }
            } catch (Exception unused) {
            }
            InputStream inputStream = null;
            try {
                inputStream = assets.open(str);
                promise.resolve(Boolean.TRUE);
                if (inputStream == null) {
                    return;
                }
            } catch (Exception unused2) {
                promise.resolve(Boolean.FALSE);
                if (inputStream == null) {
                    return;
                }
            }
            try {
                inputStream.close();
            } catch (Exception unused3) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void existsRes(String str, Promise promise) {
        try {
            if (getResIdentifier(str) > 0) {
                promise.resolve(Boolean.TRUE);
            } else {
                promise.resolve(Boolean.FALSE);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void getAllExternalFilesDirs(Promise promise) {
        File[] externalFilesDirs = getReactApplicationContext().getExternalFilesDirs(null);
        WritableArray createArray = Arguments.createArray();
        for (File file : externalFilesDirs) {
            if (file != null) {
                createArray.pushString(file.getAbsolutePath());
            }
        }
        promise.resolve(createArray);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(RNFSDocumentDirectory, 0);
        hashMap.put(RNFSDocumentDirectoryPath, getReactApplicationContext().getFilesDir().getAbsolutePath());
        hashMap.put(RNFSTemporaryDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        hashMap.put(RNFSPicturesDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        hashMap.put(RNFSCachesDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        hashMap.put(RNFSDownloadDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        hashMap.put(RNFSFileTypeRegular, 0);
        hashMap.put(RNFSFileTypeDirectory, 1);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            hashMap.put(RNFSExternalStorageDirectoryPath, externalStorageDirectory.getAbsolutePath());
        } else {
            hashMap.put(RNFSExternalStorageDirectoryPath, null);
        }
        File externalFilesDir = getReactApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir != null) {
            hashMap.put(RNFSExternalDirectoryPath, externalFilesDir.getAbsolutePath());
        } else {
            hashMap.put(RNFSExternalDirectoryPath, null);
        }
        File externalCacheDir = getReactApplicationContext().getExternalCacheDir();
        if (externalCacheDir != null) {
            hashMap.put(RNFSExternalCachesDirectoryPath, externalCacheDir.getAbsolutePath());
        } else {
            hashMap.put(RNFSExternalCachesDirectoryPath, null);
        }
        return hashMap;
    }

    @ReactMethod
    public void getFSInfo(Promise promise) {
        long blockCount;
        long availableBlocks;
        long j11;
        long j12;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
        if (Build.VERSION.SDK_INT >= 18) {
            blockCount = statFs.getTotalBytes();
            availableBlocks = statFs.getFreeBytes();
            j12 = statFs2.getTotalBytes();
            j11 = statFs2.getFreeBytes();
        } else {
            long blockSize = statFs.getBlockSize();
            blockCount = statFs.getBlockCount() * blockSize;
            availableBlocks = statFs.getAvailableBlocks() * blockSize;
            j11 = 0;
            j12 = 0;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("totalSpace", blockCount);
        createMap.putDouble("freeSpace", availableBlocks);
        createMap.putDouble("totalSpaceEx", j12);
        createMap.putDouble("freeSpaceEx", j11);
        promise.resolve(createMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("md5", "MD5");
            hashMap.put("sha1", McElieceCCA2KeyGenParameterSpec.SHA1);
            hashMap.put("sha224", McElieceCCA2KeyGenParameterSpec.SHA224);
            hashMap.put("sha256", McElieceCCA2KeyGenParameterSpec.SHA256);
            hashMap.put("sha384", McElieceCCA2KeyGenParameterSpec.SHA384);
            hashMap.put("sha512", McElieceCCA2KeyGenParameterSpec.SHA512);
            if (hashMap.containsKey(str2)) {
                File file = new File(str);
                if (file.isDirectory()) {
                    rejectFileIsDirectory(promise);
                    return;
                } else if (!file.exists()) {
                    rejectFileNotFound(promise, str);
                    return;
                } else {
                    MessageDigest messageDigest = MessageDigest.getInstance((String) hashMap.get(str2));
                    FileInputStream fileInputStream = new FileInputStream(str);
                    byte[] bArr = new byte[10240];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        messageDigest.update(bArr, 0, read);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    byte[] digest = messageDigest.digest();
                    int length = digest.length;
                    for (int i11 = 0; i11 < length; i11++) {
                        sb2.append(String.format("%02x", Byte.valueOf(digest[i11])));
                    }
                    promise.resolve(sb2.toString());
                    return;
                }
            }
            throw new Exception("Invalid hash algorithm");
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void mkdir(String str, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            file.mkdirs();
            if (file.exists()) {
                promise.resolve(null);
                return;
            }
            throw new Exception("Directory could not be created");
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void moveFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            if (!file.renameTo(new File(str2))) {
                new a(file, promise, str).execute(str, str2);
            } else {
                promise.resolve(Boolean.TRUE);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void pathForBundle(String str, Promise promise) {
    }

    @ReactMethod
    public void pathForGroup(String str, Promise promise) {
    }

    @ReactMethod
    public void read(String str, int i11, int i12, Promise promise) {
        try {
            InputStream inputStream = getInputStream(str);
            byte[] bArr = new byte[i11];
            inputStream.skip(i12);
            promise.resolve(Base64.encodeToString(bArr, 0, inputStream.read(bArr, 0, i11), 2));
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void readDir(String str, Promise promise) {
        try {
            File file = new File(str);
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                WritableArray createArray = Arguments.createArray();
                for (File file2 : listFiles) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putDouble("mtime", file2.lastModified() / 1000.0d);
                    createMap.putString("name", file2.getName());
                    createMap.putString("path", file2.getAbsolutePath());
                    createMap.putDouble("size", file2.length());
                    createMap.putInt("type", file2.isDirectory() ? 1 : 0);
                    createArray.pushMap(createMap);
                }
                promise.resolve(createArray);
                return;
            }
            throw new Exception("Folder does not exist");
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void readDirAssets(java.lang.String r13, com.facebook.react.bridge.Promise r14) {
        /*
            r12 = this;
            com.facebook.react.bridge.ReactApplicationContext r0 = r12.getReactApplicationContext()     // Catch: java.io.IOException -> L74
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.io.IOException -> L74
            java.lang.String[] r1 = r0.list(r13)     // Catch: java.io.IOException -> L74
            com.facebook.react.bridge.WritableArray r2 = com.facebook.react.bridge.Arguments.createArray()     // Catch: java.io.IOException -> L74
            int r3 = r1.length     // Catch: java.io.IOException -> L74
            r4 = 0
            r5 = r4
        L13:
            if (r5 >= r3) goto L70
            r6 = r1[r5]     // Catch: java.io.IOException -> L74
            com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()     // Catch: java.io.IOException -> L74
            java.lang.String r8 = "name"
            r7.putString(r8, r6)     // Catch: java.io.IOException -> L74
            boolean r8 = r13.isEmpty()     // Catch: java.io.IOException -> L74
            r9 = 1
            if (r8 == 0) goto L28
            goto L35
        L28:
            java.lang.String r8 = "%s/%s"
            r10 = 2
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.io.IOException -> L74
            r10[r4] = r13     // Catch: java.io.IOException -> L74
            r10[r9] = r6     // Catch: java.io.IOException -> L74
            java.lang.String r6 = java.lang.String.format(r8, r10)     // Catch: java.io.IOException -> L74
        L35:
            java.lang.String r8 = "path"
            r7.putString(r8, r6)     // Catch: java.io.IOException -> L74
            android.content.res.AssetFileDescriptor r6 = r0.openFd(r6)     // Catch: java.io.IOException -> L4f
            if (r6 == 0) goto L4c
            long r10 = r6.getLength()     // Catch: java.io.IOException -> L4f
            int r8 = (int) r10
            r6.close()     // Catch: java.io.IOException -> L4a
            r6 = r4
            goto L5c
        L4a:
            r6 = move-exception
            goto L51
        L4c:
            r8 = r4
            r6 = r9
            goto L5c
        L4f:
            r6 = move-exception
            r8 = r4
        L51:
            java.lang.String r6 = r6.getMessage()     // Catch: java.io.IOException -> L74
            java.lang.String r10 = "compressed"
            boolean r6 = r6.contains(r10)     // Catch: java.io.IOException -> L74
            r6 = r6 ^ r9
        L5c:
            java.lang.String r10 = "size"
            r7.putInt(r10, r8)     // Catch: java.io.IOException -> L74
            java.lang.String r8 = "type"
            if (r6 == 0) goto L66
            goto L67
        L66:
            r9 = r4
        L67:
            r7.putInt(r8, r9)     // Catch: java.io.IOException -> L74
            r2.pushMap(r7)     // Catch: java.io.IOException -> L74
            int r5 = r5 + 1
            goto L13
        L70:
            r14.resolve(r2)     // Catch: java.io.IOException -> L74
            goto L78
        L74:
            r0 = move-exception
            r12.reject(r14, r13, r0)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.RNFSManager.readDirAssets(java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public void readFile(String str, Promise promise) {
        try {
            promise.resolve(Base64.encodeToString(getInputStreamBytes(getInputStream(str)), 2));
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void readFileAssets(String str, Promise promise) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = getReactApplicationContext().getAssets().open(str, 0);
            } catch (Exception e11) {
                e11.printStackTrace();
                reject(promise, str, e11);
                if (0 == 0) {
                    return;
                }
            }
            if (inputStream == null) {
                reject(promise, str, new Exception("Failed to open file"));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            }
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            promise.resolve(Base64.encodeToString(bArr, 2));
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th2;
        }
    }

    @ReactMethod
    public void readFileRes(String str, Promise promise) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = getReactApplicationContext().getResources().openRawResource(getResIdentifier(str));
            } catch (Exception e11) {
                e11.printStackTrace();
                reject(promise, str, e11);
                if (0 == 0) {
                    return;
                }
            }
            if (inputStream == null) {
                reject(promise, str, new Exception("Failed to open file"));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
                return;
            }
            byte[] bArr = new byte[inputStream.available()];
            inputStream.read(bArr);
            promise.resolve(Base64.encodeToString(bArr, 2));
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
            throw th2;
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void scanFile(String str, Promise promise) {
        MediaScannerConnection.scanFile(getReactApplicationContext(), new String[]{str}, null, new i(this, promise));
    }

    @ReactMethod
    public void setReadable(String str, Boolean bool, Boolean bool2, Promise promise) {
        try {
            File file = new File(str);
            if (file.exists()) {
                file.setReadable(bool.booleanValue(), bool2.booleanValue());
                promise.resolve(Boolean.TRUE);
                return;
            }
            throw new Exception("File does not exist");
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void stat(String str, Promise promise) {
        int i11 = 1;
        try {
            String originalFilepath = getOriginalFilepath(str, true);
            File file = new File(originalFilepath);
            if (file.exists()) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("ctime", (int) (file.lastModified() / 1000));
                createMap.putInt("mtime", (int) (file.lastModified() / 1000));
                createMap.putDouble("size", file.length());
                if (!file.isDirectory()) {
                    i11 = 0;
                }
                createMap.putInt("type", i11);
                createMap.putString("originalFilepath", originalFilepath);
                promise.resolve(createMap);
                return;
            }
            throw new Exception("File does not exist");
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void stopDownload(int i11) {
        com.rnfs.c cVar = this.downloaders.get(i11);
        if (cVar != null) {
            cVar.g();
        }
    }

    @ReactMethod
    public void stopUpload(int i11) {
        com.rnfs.h hVar = this.uploaders.get(i11);
        if (hVar != null) {
            hVar.f();
        }
    }

    @ReactMethod
    public void touch(String str, double d11, double d12, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).setLastModified((long) d11)));
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void unlink(String str, Promise promise) {
        try {
            File file = new File(str);
            if (file.exists()) {
                DeleteRecursive(file);
                promise.resolve(null);
                return;
            }
            throw new Exception("File does not exist");
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void uploadFiles(ReadableMap readableMap, Promise promise) {
        String str;
        try {
            ReadableArray array = readableMap.getArray("files");
            URL url = new URL(readableMap.getString("toUrl"));
            int i11 = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            ReadableMap map2 = readableMap.getMap("fields");
            String string = readableMap.getString("method");
            boolean z11 = readableMap.getBoolean("binaryStreamOnly");
            boolean z12 = readableMap.getBoolean("hasBeginCallback");
            boolean z13 = readableMap.getBoolean("hasProgressCallback");
            ArrayList<ReadableMap> arrayList = new ArrayList<>();
            com.rnfs.f fVar = new com.rnfs.f();
            str = "toUrl";
            for (int i12 = 0; i12 < array.size(); i12++) {
                try {
                    arrayList.add(array.getMap(i12));
                } catch (Exception e11) {
                    e = e11;
                    e.printStackTrace();
                    reject(promise, readableMap.getString(str), e);
                    return;
                }
            }
            fVar.f20444a = url;
            fVar.f20445b = arrayList;
            fVar.f20447d = map;
            fVar.f20449f = string;
            fVar.f20448e = map2;
            fVar.f20446c = z11;
            fVar.f20450g = new f(i11, promise, readableMap);
            if (z12) {
                fVar.f20452i = new g(i11);
            }
            if (z13) {
                fVar.f20451h = new h(i11);
            }
            com.rnfs.h hVar = new com.rnfs.h();
            hVar.execute(fVar);
            this.uploaders.put(i11, hVar);
        } catch (Exception e12) {
            e = e12;
            str = "toUrl";
        }
    }

    @ReactMethod
    public void write(String str, String str2, int i11, Promise promise) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            if (i11 < 0) {
                OutputStream outputStream = getOutputStream(str, true);
                outputStream.write(decode);
                outputStream.close();
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
                randomAccessFile.seek(i11);
                randomAccessFile.write(decode);
                randomAccessFile.close();
            }
            promise.resolve(null);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }

    @ReactMethod
    public void writeFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            byte[] decode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, false);
            outputStream.write(decode);
            outputStream.close();
            promise.resolve(null);
        } catch (Exception e11) {
            e11.printStackTrace();
            reject(promise, str, e11);
        }
    }
}