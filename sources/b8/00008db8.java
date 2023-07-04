package o5;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final ReactApplicationContext f42281a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<Uri> f42282b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<String> f42283c;

    /* renamed from: d  reason: collision with root package name */
    private String f42284d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f42285e;

    public e(ReadableArray readableArray, ArrayList<String> arrayList, String str, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this(readableArray, arrayList, bool, reactApplicationContext);
        this.f42284d = str;
    }

    private String a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    private String b(Uri uri) {
        return b.d(this.f42281a, uri, this.f42285e);
    }

    private boolean e(Uri uri) {
        if (uri.getScheme() == null || !uri.getScheme().equals(MessageExtension.FIELD_DATA)) {
            return false;
        }
        String substring = uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";"));
        String str = this.f42284d;
        if (str == null) {
            this.f42284d = substring;
            return true;
        } else if (!str.equalsIgnoreCase(substring) && this.f42284d.split("/")[0].equalsIgnoreCase(substring.split("/")[0])) {
            this.f42284d = this.f42284d.split("/")[0].concat("/*");
            return true;
        } else if (this.f42284d.equalsIgnoreCase(substring)) {
            return true;
        } else {
            this.f42284d = "*/*";
            return true;
        }
    }

    private boolean g(Uri uri) {
        if ((uri.getScheme() == null || !uri.getScheme().equals("content")) && !Action.FILE_ATTRIBUTE.equals(uri.getScheme())) {
            return false;
        }
        String a11 = a(uri.toString());
        if (a11 == null) {
            a11 = a(b(uri));
        }
        if (a11 == null) {
            a11 = "*/*";
        }
        String str = this.f42284d;
        if (str == null) {
            this.f42284d = a11;
            return true;
        } else if (!str.equalsIgnoreCase(a11) && this.f42284d.split("/")[0].equalsIgnoreCase(a11.split("/")[0])) {
            this.f42284d = this.f42284d.split("/")[0].concat("/*");
            return true;
        } else if (this.f42284d.equalsIgnoreCase(a11)) {
            return true;
        } else {
            this.f42284d = "*/*";
            return true;
        }
    }

    public String c() {
        String str = this.f42284d;
        return str == null ? "*/*" : str;
    }

    public ArrayList<Uri> d() {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        ArrayList<Uri> arrayList = new ArrayList<>();
        for (int i11 = 0; i11 < this.f42282b.size(); i11++) {
            Uri uri = this.f42282b.get(i11);
            if (e(uri)) {
                String extensionFromMimeType = singleton.getExtensionFromMimeType(uri.getSchemeSpecificPart().substring(0, uri.getSchemeSpecificPart().indexOf(";")));
                String substring = uri.getSchemeSpecificPart().substring(uri.getSchemeSpecificPart().indexOf(";base64,") + 8);
                String str = this.f42283c.size() >= i11 + 1 ? this.f42283c.get(i11) : System.currentTimeMillis() + "." + extensionFromMimeType;
                try {
                    File file = new File(this.f42285e.booleanValue() ? this.f42281a.getCacheDir() : this.f42281a.getExternalCacheDir(), Environment.DIRECTORY_DOWNLOADS);
                    if (!file.exists() && !file.mkdirs()) {
                        throw new IOException("mkdirs failed on " + file.getAbsolutePath());
                        break;
                    }
                    File file2 = new File(file, str);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    fileOutputStream.write(Base64.decode(substring, 0));
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    arrayList.add(b.a(this.f42281a, file2));
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            } else if (g(uri) && uri.getPath() != null) {
                if (this.f42283c.size() >= i11 + 1) {
                    arrayList.add(b.a(this.f42281a, new File(uri.getPath(), this.f42283c.get(i11))));
                } else {
                    arrayList.add(b.a(this.f42281a, new File(uri.getPath())));
                }
            }
        }
        return arrayList;
    }

    public boolean f() {
        Iterator<Uri> it2 = this.f42282b.iterator();
        boolean z11 = true;
        while (it2.hasNext()) {
            Uri next = it2.next();
            if (e(next) || g(next)) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (!z11) {
                break;
            }
        }
        return z11;
    }

    public e(ReadableArray readableArray, ArrayList<String> arrayList, Boolean bool, ReactApplicationContext reactApplicationContext) {
        this.f42282b = new ArrayList<>();
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            String string = readableArray.getString(i11);
            if (string != null) {
                this.f42282b.add(Uri.parse(string));
            }
        }
        this.f42283c = arrayList;
        this.f42285e = bool;
        this.f42281a = reactApplicationContext;
    }
}