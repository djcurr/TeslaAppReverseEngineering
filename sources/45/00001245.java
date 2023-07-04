package com.RNFetchBlob;

import android.net.Uri;
import android.util.Base64;
import com.RNFetchBlob.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.stripe.android.core.networking.FileUploadRequest;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    private InputStream f9358a;

    /* renamed from: c  reason: collision with root package name */
    private ReadableArray f9360c;

    /* renamed from: d  reason: collision with root package name */
    private String f9361d;

    /* renamed from: e  reason: collision with root package name */
    private String f9362e;

    /* renamed from: f  reason: collision with root package name */
    private g.e f9363f;

    /* renamed from: g  reason: collision with root package name */
    private MediaType f9364g;

    /* renamed from: h  reason: collision with root package name */
    private File f9365h;

    /* renamed from: b  reason: collision with root package name */
    private long f9359b = 0;

    /* renamed from: i  reason: collision with root package name */
    private Boolean f9366i = Boolean.FALSE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.RNFetchBlob.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0182a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9367a;

        static {
            int[] iArr = new int[g.e.values().length];
            f9367a = iArr;
            try {
                iArr[g.e.SingleFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9367a[g.e.AsIs.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9367a[g.e.Others.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a  reason: collision with root package name */
        public String f9368a;

        /* renamed from: b  reason: collision with root package name */
        String f9369b;

        /* renamed from: c  reason: collision with root package name */
        String f9370c;

        /* renamed from: d  reason: collision with root package name */
        public String f9371d;

        b(a aVar, ReadableMap readableMap) {
            if (readableMap.hasKey("name")) {
                this.f9368a = readableMap.getString("name");
            }
            if (readableMap.hasKey("filename")) {
                this.f9369b = readableMap.getString("filename");
            }
            if (readableMap.hasKey("type")) {
                this.f9370c = readableMap.getString("type");
            } else {
                this.f9370c = this.f9369b == null ? "text/plain" : "application/octet-stream";
            }
            if (readableMap.hasKey(MessageExtension.FIELD_DATA)) {
                this.f9371d = readableMap.getString(MessageExtension.FIELD_DATA);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str) {
        this.f9361d = str;
    }

    private ArrayList<b> c() {
        int length;
        long j11;
        ArrayList<b> arrayList = new ArrayList<>();
        ReactApplicationContext reactApplicationContext = RNFetchBlob.RCTContext;
        long j12 = 0;
        for (int i11 = 0; i11 < this.f9360c.size(); i11++) {
            b bVar = new b(this, this.f9360c.getMap(i11));
            arrayList.add(bVar);
            String str = bVar.f9371d;
            if (str == null) {
                h.a("RNFetchBlob multipart request builder has found a field without `data` property, the field `" + bVar.f9368a + "` will be removed implicitly.");
            } else {
                if (bVar.f9369b != null) {
                    if (str.startsWith("RNFetchBlob-file://")) {
                        String w11 = d.w(str.substring(19));
                        if (d.q(w11)) {
                            try {
                                length = reactApplicationContext.getAssets().open(w11.replace("bundle-assets://", "")).available();
                            } catch (IOException e11) {
                                h.a(e11.getLocalizedMessage());
                            }
                        } else {
                            j11 = new File(d.w(w11)).length();
                            j12 += j11;
                        }
                    } else if (str.startsWith("RNFetchBlob-content://")) {
                        String substring = str.substring(22);
                        InputStream inputStream = null;
                        try {
                            try {
                                inputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(substring));
                                j12 += inputStream.available();
                            } catch (Exception e12) {
                                h.a("Failed to estimate form data length from content URI:" + substring + ", " + e12.getLocalizedMessage());
                                if (inputStream == null) {
                                }
                            }
                            inputStream.close();
                        } catch (Throwable th2) {
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th2;
                        }
                    } else {
                        length = Base64.decode(str, 0).length;
                    }
                } else {
                    length = str.getBytes().length;
                }
                j11 = length;
                j12 += j11;
            }
        }
        this.f9359b = j12;
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x016f, code lost:
        if (r10 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File d() {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.a.d():java.io.File");
    }

    private void e(long j11) {
        f j12 = g.j(this.f9361d);
        if (j12 != null) {
            long j13 = this.f9359b;
            if (j13 == 0 || !j12.a(((float) j11) / ((float) j13))) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("taskId", this.f9361d);
            createMap.putString("written", String.valueOf(j11));
            createMap.putString("total", String.valueOf(this.f9359b));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobProgress-upload", createMap);
        }
    }

    private InputStream f() {
        if (this.f9362e.startsWith("RNFetchBlob-file://")) {
            String w11 = d.w(this.f9362e.substring(19));
            if (d.q(w11)) {
                try {
                    return RNFetchBlob.RCTContext.getAssets().open(w11.replace("bundle-assets://", ""));
                } catch (Exception e11) {
                    throw new Exception("error when getting request stream from asset : " + e11.getLocalizedMessage());
                }
            }
            File file = new File(d.w(w11));
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                return new FileInputStream(file);
            } catch (Exception e12) {
                throw new Exception("error when getting request stream: " + e12.getLocalizedMessage());
            }
        } else if (this.f9362e.startsWith("RNFetchBlob-content://")) {
            String substring = this.f9362e.substring(22);
            try {
                return RNFetchBlob.RCTContext.getContentResolver().openInputStream(Uri.parse(substring));
            } catch (Exception e13) {
                throw new Exception("error when getting request stream for content URI: " + substring, e13);
            }
        } else {
            try {
                return new ByteArrayInputStream(Base64.decode(this.f9362e, 0));
            } catch (Exception e14) {
                throw new Exception("error when getting request stream: " + e14.getLocalizedMessage());
            }
        }
    }

    private void g(InputStream inputStream, FileOutputStream fileOutputStream) {
        byte[] bArr = new byte[10240];
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                inputStream.close();
                return;
            }
        }
    }

    private void h(InputStream inputStream, okio.g gVar) {
        byte[] bArr = new byte[10240];
        long j11 = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 10240);
            if (read > 0) {
                gVar.o(bArr, 0, read);
                j11 += read;
                e(j11);
            } else {
                inputStream.close();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a(boolean z11) {
        this.f9366i = Boolean.valueOf(z11);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        try {
            File file = this.f9365h;
            if (file == null || !file.exists()) {
                return true;
            }
            this.f9365h.delete();
            return true;
        } catch (Exception e11) {
            h.a(e11.getLocalizedMessage());
            return false;
        }
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.f9366i.booleanValue()) {
            return -1L;
        }
        return this.f9359b;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f9364g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a i(ReadableArray readableArray) {
        this.f9360c = readableArray;
        try {
            this.f9365h = d();
            this.f9358a = new FileInputStream(this.f9365h);
            this.f9359b = this.f9365h.length();
        } catch (Exception e11) {
            e11.printStackTrace();
            h.a("RNFetchBlob failed to create request multipart body :" + e11.getLocalizedMessage());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a j(String str) {
        this.f9362e = str;
        if (str == null) {
            this.f9362e = "";
            this.f9363f = g.e.AsIs;
        }
        try {
            int i11 = C0182a.f9367a[this.f9363f.ordinal()];
            if (i11 == 1) {
                InputStream f11 = f();
                this.f9358a = f11;
                this.f9359b = f11.available();
            } else if (i11 == 2) {
                this.f9359b = this.f9362e.getBytes().length;
                this.f9358a = new ByteArrayInputStream(this.f9362e.getBytes());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            h.a("RNFetchBlob failed to create single content request body :" + e11.getLocalizedMessage() + FileUploadRequest.LINE_BREAK);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a k(MediaType mediaType) {
        this.f9364g = mediaType;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a l(g.e eVar) {
        this.f9363f = eVar;
        return this;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(okio.g gVar) {
        try {
            h(this.f9358a, gVar);
        } catch (Exception e11) {
            h.a(e11.getLocalizedMessage());
            e11.printStackTrace();
        }
    }
}