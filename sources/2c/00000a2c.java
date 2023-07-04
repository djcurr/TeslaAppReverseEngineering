package atd.a;

import atd.a.j;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    static final int f6732b;

    /* renamed from: c  reason: collision with root package name */
    static final int f6733c;

    /* renamed from: a  reason: collision with root package name */
    private final b f6734a = new g();

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f6732b = (int) timeUnit.toMillis(60L);
        f6733c = (int) timeUnit.toMillis(60L);
    }

    private HttpURLConnection b(i iVar) {
        HttpURLConnection a11 = this.f6734a.a(iVar.d());
        a11.setRequestMethod(iVar.c().a());
        a11.setConnectTimeout(a());
        a11.setReadTimeout(b());
        a11.setUseCaches(false);
        a11.setDoInput(true);
        a11.setDoOutput(iVar.c().b());
        Map<String, List<String>> b11 = iVar.b();
        if (b11 != null) {
            for (Map.Entry<String, List<String>> entry : b11.entrySet()) {
                String key = entry.getKey();
                for (String str : entry.getValue()) {
                    a11.addRequestProperty(key, str);
                }
            }
        }
        return a11;
    }

    protected abstract int a();

    /* JADX INFO: Access modifiers changed from: protected */
    public j a(i iVar) {
        HttpURLConnection httpURLConnection;
        try {
            httpURLConnection = b(iVar);
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
        try {
            httpURLConnection.connect();
            if (iVar.c().b()) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(iVar.a());
                outputStream.flush();
                outputStream.close();
            }
            j a11 = a(httpURLConnection);
            httpURLConnection.disconnect();
            return a11;
        } catch (Throwable th3) {
            th = th3;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    protected abstract int b();

    private j a(HttpURLConnection httpURLConnection) {
        j.a a11 = new j.a().a(httpURLConnection.getResponseCode()).a(httpURLConnection.getHeaderFields()).a(httpURLConnection.getResponseMessage());
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            errorStream = httpURLConnection.getInputStream();
        }
        a11.a(a(errorStream));
        return a11.a();
    }

    private byte[] a(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr);
        while (read > 0) {
            byteArrayOutputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
        inputStream.close();
        return byteArrayOutputStream.toByteArray();
    }
}