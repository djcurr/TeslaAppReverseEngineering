package h6;

import com.RNFetchBlob.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.io.File;
import java.io.FileOutputStream;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.e0;
import okio.f;
import okio.f0;
import okio.h;
import okio.r;

/* loaded from: classes.dex */
public class b extends ResponseBody {

    /* renamed from: a  reason: collision with root package name */
    String f28914a;

    /* renamed from: b  reason: collision with root package name */
    ResponseBody f28915b;

    /* renamed from: d  reason: collision with root package name */
    ReactApplicationContext f28917d;

    /* renamed from: e  reason: collision with root package name */
    FileOutputStream f28918e;

    /* renamed from: c  reason: collision with root package name */
    long f28916c = 0;

    /* renamed from: f  reason: collision with root package name */
    boolean f28919f = false;

    /* renamed from: h6.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0561b implements e0 {
        private C0561b() {
        }

        private void a(String str, long j11, long j12) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("taskId", str);
            createMap.putString("written", String.valueOf(j11));
            createMap.putString("total", String.valueOf(j12));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) b.this.f28917d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobProgress", createMap);
        }

        @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            b.this.f28918e.close();
        }

        @Override // okio.e0
        public long read(f fVar, long j11) {
            float f11;
            int i11 = (int) j11;
            try {
                byte[] bArr = new byte[i11];
                long read = b.this.f28915b.byteStream().read(bArr, 0, i11);
                b bVar = b.this;
                int i12 = (read > 0L ? 1 : (read == 0L ? 0 : -1));
                bVar.f28916c += i12 > 0 ? read : 0L;
                if (i12 > 0) {
                    bVar.f28918e.write(bArr, 0, (int) read);
                } else if (bVar.contentLength() == -1 && read == -1) {
                    b.this.f28919f = true;
                }
                com.RNFetchBlob.f i13 = g.i(b.this.f28914a);
                if (b.this.contentLength() != 0) {
                    if (b.this.contentLength() != -1) {
                        b bVar2 = b.this;
                        f11 = (float) (bVar2.f28916c / bVar2.contentLength());
                    } else {
                        f11 = b.this.f28919f ? 1.0f : 0.0f;
                    }
                    if (i13 != null && i13.a(f11)) {
                        if (b.this.contentLength() != -1) {
                            b bVar3 = b.this;
                            a(bVar3.f28914a, bVar3.f28916c, bVar3.contentLength());
                        } else {
                            b bVar4 = b.this;
                            if (!bVar4.f28919f) {
                                a(bVar4.f28914a, 0L, bVar4.contentLength());
                            } else {
                                String str = bVar4.f28914a;
                                long j12 = bVar4.f28916c;
                                a(str, j12, j12);
                            }
                        }
                    }
                }
                return read;
            } catch (Exception unused) {
                return -1L;
            }
        }

        @Override // okio.e0
        public f0 timeout() {
            return null;
        }
    }

    public b(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, String str2, boolean z11) {
        this.f28917d = reactApplicationContext;
        this.f28914a = str;
        this.f28915b = responseBody;
        if (str2 != null) {
            boolean z12 = !z11;
            String replace = str2.replace("?append=true", "");
            File file = new File(replace);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IllegalStateException("Couldn't create dir: " + parentFile);
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            this.f28918e = new FileOutputStream(new File(replace), z12);
        }
    }

    public boolean a() {
        return this.f28916c == contentLength() || (contentLength() == -1 && this.f28919f);
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f28915b.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.f28915b.contentType();
    }

    @Override // okhttp3.ResponseBody
    public h source() {
        return r.d(new C0561b());
    }
}