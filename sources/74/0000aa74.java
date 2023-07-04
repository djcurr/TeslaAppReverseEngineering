package p8;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static String f46398a = "";

    /* renamed from: b  reason: collision with root package name */
    public static String f46399b = "";

    /* renamed from: c  reason: collision with root package name */
    public static String f46400c = "";

    public static synchronized void a(String str) {
        synchronized (d.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            d(arrayList);
        }
    }

    public static synchronized void b(String str, String str2, String str3) {
        synchronized (d.class) {
            f46398a = str;
            f46399b = str2;
            f46400c = str3;
        }
    }

    public static synchronized void c(Throwable th2) {
        String str;
        synchronized (d.class) {
            ArrayList arrayList = new ArrayList();
            if (th2 != null) {
                StringWriter stringWriter = new StringWriter();
                th2.printStackTrace(new PrintWriter(stringWriter));
                str = stringWriter.toString();
            } else {
                str = "";
            }
            arrayList.add(str);
            d(arrayList);
        }
    }

    public static synchronized void d(List<String> list) {
        synchronized (d.class) {
            if (!x9.a.c(f46399b) && !x9.a.c(f46400c)) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(f46400c);
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    stringBuffer.append(", " + it2.next());
                }
                stringBuffer.append("\n");
                try {
                    File file = new File(f46398a);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    File file2 = new File(f46398a, f46399b);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    FileWriter fileWriter = ((long) stringBuffer.length()) + file2.length() <= 51200 ? new FileWriter(file2, true) : new FileWriter(file2);
                    fileWriter.write(stringBuffer.toString());
                    fileWriter.flush();
                    fileWriter.close();
                } catch (Exception unused) {
                }
            }
        }
    }
}