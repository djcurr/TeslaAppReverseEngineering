package eh;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.getkeepsafe.relinker.MissingLibraryException;
import eh.b;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes3.dex */
public class a implements b.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eh.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0485a {

        /* renamed from: a  reason: collision with root package name */
        public ZipFile f25093a;

        /* renamed from: b  reason: collision with root package name */
        public ZipEntry f25094b;

        public C0485a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f25093a = zipFile;
            this.f25094b = zipEntry;
        }
    }

    private void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private long c(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        long j11 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j11;
            }
            outputStream.write(bArr, 0, read);
            j11 += read;
        }
    }

    private C0485a d(Context context, String[] strArr, String str, c cVar) {
        String[] f11 = f(context);
        int length = f11.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i12 >= length) {
                return null;
            }
            String str2 = f11[i12];
            int i13 = i11;
            while (true) {
                int i14 = i13 + 1;
                if (i13 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i13 = i14;
                }
            }
            if (zipFile != null) {
                int i15 = i11;
                while (true) {
                    int i16 = i15 + 1;
                    if (i15 < 5) {
                        int length2 = strArr.length;
                        int i17 = i11;
                        while (i17 < length2) {
                            String str3 = "lib" + File.separatorChar + strArr[i17] + File.separatorChar + str;
                            Object[] objArr = new Object[2];
                            objArr[i11] = str3;
                            objArr[1] = str2;
                            cVar.i("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(str3);
                            if (entry != null) {
                                return new C0485a(zipFile, entry);
                            }
                            i17++;
                            i11 = 0;
                        }
                        i15 = i16;
                        i11 = 0;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i12++;
            i11 = 0;
        }
    }

    private String[] e(Context context, String str) {
        Pattern compile = Pattern.compile("lib" + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        for (String str2 : f(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private String[] f(Context context) {
        String[] strArr;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (Build.VERSION.SDK_INT < 21 || (strArr = applicationInfo.splitSourceDirs) == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // eh.b.a
    public void a(Context context, String[] strArr, String str, File file, c cVar) {
        String[] strArr2;
        Closeable closeable;
        InputStream inputStream;
        long c11;
        C0485a c0485a = null;
        Closeable closeable2 = null;
        try {
            C0485a d11 = d(context, strArr, str, cVar);
            try {
                if (d11 == null) {
                    try {
                        strArr2 = e(context, str);
                    } catch (Exception e11) {
                        strArr2 = new String[]{e11.toString()};
                    }
                    throw new MissingLibraryException(str, strArr, strArr2);
                }
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    if (i11 < 5) {
                        cVar.i("Found %s! Extracting...", str);
                        try {
                            if (file.exists() || file.createNewFile()) {
                                try {
                                    inputStream = d11.f25093a.getInputStream(d11.f25094b);
                                    try {
                                        closeable = new FileOutputStream(file);
                                    } catch (FileNotFoundException unused) {
                                        closeable = null;
                                    } catch (IOException unused2) {
                                        closeable = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        closeable = null;
                                    }
                                } catch (FileNotFoundException unused3) {
                                    inputStream = null;
                                    closeable = null;
                                } catch (IOException unused4) {
                                    inputStream = null;
                                    closeable = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    closeable = null;
                                }
                                try {
                                    c11 = c(inputStream, closeable);
                                    closeable.getFD().sync();
                                } catch (FileNotFoundException unused5) {
                                    b(inputStream);
                                    b(closeable);
                                    i11 = i12;
                                } catch (IOException unused6) {
                                    b(inputStream);
                                    b(closeable);
                                    i11 = i12;
                                } catch (Throwable th4) {
                                    th = th4;
                                    closeable2 = inputStream;
                                    b(closeable2);
                                    b(closeable);
                                    throw th;
                                }
                                if (c11 != file.length()) {
                                    b(inputStream);
                                    b(closeable);
                                } else {
                                    b(inputStream);
                                    b(closeable);
                                    file.setReadable(true, false);
                                    file.setExecutable(true, false);
                                    file.setWritable(true);
                                    try {
                                        ZipFile zipFile = d11.f25093a;
                                        if (zipFile != null) {
                                            zipFile.close();
                                            return;
                                        }
                                        return;
                                    } catch (IOException unused7) {
                                        return;
                                    }
                                }
                            }
                        } catch (IOException unused8) {
                        }
                        i11 = i12;
                    } else {
                        cVar.h("FATAL! Couldn't extract the library from the APK!");
                        try {
                            ZipFile zipFile2 = d11.f25093a;
                            if (zipFile2 != null) {
                                zipFile2.close();
                                return;
                            }
                            return;
                        } catch (IOException unused9) {
                            return;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                c0485a = d11;
                if (c0485a != null) {
                    try {
                        ZipFile zipFile3 = c0485a.f25093a;
                        if (zipFile3 != null) {
                            zipFile3.close();
                        }
                    } catch (IOException unused10) {
                    }
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}