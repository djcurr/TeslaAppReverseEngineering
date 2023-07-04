package h6;

import com.RNFetchBlob.g;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.e0;
import okio.f;
import okio.f0;
import okio.h;
import okio.r;

/* loaded from: classes.dex */
public class a extends ResponseBody {

    /* renamed from: a  reason: collision with root package name */
    String f28907a;

    /* renamed from: b  reason: collision with root package name */
    ReactApplicationContext f28908b;

    /* renamed from: c  reason: collision with root package name */
    ResponseBody f28909c;

    /* renamed from: d  reason: collision with root package name */
    boolean f28910d;

    /* renamed from: h6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private class C0560a implements e0 {

        /* renamed from: a  reason: collision with root package name */
        h f28911a;

        /* renamed from: b  reason: collision with root package name */
        long f28912b = 0;

        C0560a(h hVar) {
            this.f28911a = hVar;
        }

        @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // okio.e0
        public long read(f fVar, long j11) {
            long read = this.f28911a.read(fVar, j11);
            this.f28912b += read > 0 ? read : 0L;
            com.RNFetchBlob.f i11 = g.i(a.this.f28907a);
            long contentLength = a.this.contentLength();
            if (i11 != null && contentLength != 0 && i11.a((float) (this.f28912b / a.this.contentLength()))) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("taskId", a.this.f28907a);
                createMap.putString("written", String.valueOf(this.f28912b));
                createMap.putString("total", String.valueOf(a.this.contentLength()));
                if (a.this.f28910d) {
                    createMap.putString("chunk", fVar.c1(Charset.defaultCharset()));
                } else {
                    createMap.putString("chunk", "");
                }
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) a.this.f28908b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobProgress", createMap);
            }
            return read;
        }

        @Override // okio.e0
        public f0 timeout() {
            return null;
        }
    }

    public a(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, boolean z11) {
        this.f28910d = false;
        this.f28908b = reactApplicationContext;
        this.f28907a = str;
        this.f28909c = responseBody;
        this.f28910d = z11;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.f28909c.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        return this.f28909c.contentType();
    }

    @Override // okhttp3.ResponseBody
    public h source() {
        return r.d(new C0560a(this.f28909c.source()));
    }
}