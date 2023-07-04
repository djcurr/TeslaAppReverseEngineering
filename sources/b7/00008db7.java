package o5;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReactApplicationContext;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f42275a;

    /* renamed from: b  reason: collision with root package name */
    private String f42276b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f42277c;

    /* renamed from: d  reason: collision with root package name */
    private String f42278d;

    /* renamed from: e  reason: collision with root package name */
    private String f42279e;

    /* renamed from: f  reason: collision with root package name */
    private Boolean f42280f;

    public d(String str, String str2, String str3, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(str, str3, bool, reactApplicationContext);
        this.f42278d = str2;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return b.d(this.f42275a, uri, this.f42280f);
    }

    private boolean e() {
        char[] charArray;
        if (this.f42277c.getScheme() == null || !this.f42277c.getScheme().equals(MessageExtension.FIELD_DATA)) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        for (char c11 : this.f42277c.toString().substring(5).toCharArray()) {
            if (c11 == ';') {
                break;
            }
            sb2.append(c11);
        }
        this.f42278d = sb2.toString();
        return true;
    }

    private boolean g() {
        if (this.f42277c.getScheme() == null || !(this.f42277c.getScheme().equals("content") || this.f42277c.getScheme().equals(Action.FILE_ATTRIBUTE))) {
            return false;
        }
        if (this.f42278d != null) {
            return true;
        }
        String a11 = a(this.f42277c.toString());
        this.f42278d = a11;
        if (a11 == null) {
            String b11 = b(this.f42277c);
            if (b11 == null) {
                return false;
            }
            this.f42278d = a(b11);
        }
        if (this.f42278d == null) {
            this.f42278d = "*/*";
        }
        return true;
    }

    public String c() {
        String str = this.f42278d;
        return str == null ? "*/*" : str;
    }

    public Uri d() {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(c());
        if (e()) {
            String substring = this.f42277c.toString().substring(this.f42278d.length() + 5 + 8);
            String str = this.f42279e;
            if (str == null) {
                str = System.nanoTime() + "";
            }
            try {
                File file = new File(this.f42280f.booleanValue() ? this.f42275a.getCacheDir() : this.f42275a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                if (!file.exists() && !file.mkdirs()) {
                    throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                }
                File file2 = new File(file, str + "." + extensionFromMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(Base64.decode(substring, 0));
                fileOutputStream.flush();
                fileOutputStream.close();
                return b.a(this.f42275a, file2);
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        } else if (g()) {
            Uri parse = Uri.parse(this.f42276b);
            if (parse.getPath() == null) {
                return null;
            }
            return b.a(this.f42275a, new File(parse.getPath()));
        }
        return null;
    }

    public boolean f() {
        return e() || g();
    }

    public d(String str, String str2, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f42276b = str;
        this.f42277c = Uri.parse(str);
        this.f42279e = str2;
        this.f42280f = bool;
        this.f42275a = reactApplicationContext;
    }
}