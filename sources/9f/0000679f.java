package e8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final HttpURLConnection f24962a;

    public a(HttpURLConnection httpURLConnection) {
        this.f24962a = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb2.append(readLine);
                    sb2.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb2.toString();
    }

    @Override // e8.d
    public String U() {
        return this.f24962a.getContentType();
    }

    @Override // e8.d
    public InputStream Y() {
        return this.f24962a.getInputStream();
    }

    @Override // e8.d
    public String Y0() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f24962a.getURL() + ". Failed with " + this.f24962a.getResponseCode() + "\n" + a(this.f24962a);
        } catch (IOException e11) {
            h8.d.d("get error failed ", e11);
            return e11.getMessage();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24962a.disconnect();
    }

    @Override // e8.d
    public boolean isSuccessful() {
        try {
            return this.f24962a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}