package u30;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final BigInteger f53099a;

    /* renamed from: b  reason: collision with root package name */
    public static final BigInteger f53100b;

    /* renamed from: c  reason: collision with root package name */
    public static final BigInteger f53101c;

    /* renamed from: d  reason: collision with root package name */
    public static final BigInteger f53102d;

    /* renamed from: e  reason: collision with root package name */
    public static final BigInteger f53103e;

    /* renamed from: f  reason: collision with root package name */
    public static final BigInteger f53104f;

    static {
        BigInteger valueOf = BigInteger.valueOf(1024L);
        f53099a = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        f53100b = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        f53101c = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        f53102d = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        f53103e = multiply4;
        valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L));
        f53104f = multiply5;
        valueOf.multiply(multiply5);
    }

    private static void a(File file, File file2) {
        Objects.requireNonNull(file, "Source must not be null");
        Objects.requireNonNull(file2, "Destination must not be null");
        if (file.exists()) {
            return;
        }
        throw new FileNotFoundException("Source '" + file + "' does not exist");
    }

    public static void b(File file) {
        IOException e11 = null;
        for (File file2 : m(file)) {
            try {
                k(file2);
            } catch (IOException e12) {
                e11 = e12;
            }
        }
        if (e11 != null) {
            throw e11;
        }
    }

    public static void c(File file, File file2) {
        e(file, file2, true);
    }

    public static void d(File file, File file2, FileFilter fileFilter, boolean z11) {
        a(file, file2);
        if (file.isDirectory()) {
            if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                ArrayList arrayList = null;
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
                    if (listFiles != null && listFiles.length > 0) {
                        arrayList = new ArrayList(listFiles.length);
                        for (File file3 : listFiles) {
                            arrayList.add(new File(file2, file3.getName()).getCanonicalPath());
                        }
                    }
                }
                i(file, file2, fileFilter, z11, arrayList);
                return;
            }
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        throw new IOException("Source '" + file + "' exists but is not a directory");
    }

    public static void e(File file, File file2, boolean z11) {
        d(file, file2, null, z11);
    }

    public static void f(File file, File file2) {
        g(file, file2, true);
    }

    public static void g(File file, File file2, boolean z11) {
        a(file, file2);
        if (!file.isDirectory()) {
            if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                    throw new IOException("Destination '" + parentFile + "' directory cannot be created");
                } else if (file2.exists() && !file2.canWrite()) {
                    throw new IOException("Destination '" + file2 + "' exists but is read-only");
                } else {
                    j(file, file2, z11);
                    return;
                }
            }
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        throw new IOException("Source '" + file + "' exists but is a directory");
    }

    public static void h(File file) {
        if (file.exists()) {
            if (!l(file)) {
                b(file);
            }
            if (file.delete()) {
                return;
            }
            throw new IOException("Unable to delete directory " + file + ".");
        }
    }

    private static void i(File file, File file2, FileFilter fileFilter, boolean z11, List<String> list) {
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (listFiles != null) {
            if (file2.exists()) {
                if (!file2.isDirectory()) {
                    throw new IOException("Destination '" + file2 + "' exists but is not a directory");
                }
            } else if (!file2.mkdirs() && !file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' directory cannot be created");
            }
            if (file2.canWrite()) {
                for (File file3 : listFiles) {
                    File file4 = new File(file2, file3.getName());
                    if (list == null || !list.contains(file3.getCanonicalPath())) {
                        if (file3.isDirectory()) {
                            i(file3, file4, fileFilter, z11, list);
                        } else {
                            j(file3, file4, z11);
                        }
                    }
                }
                if (z11) {
                    file2.setLastModified(file.lastModified());
                    return;
                }
                return;
            }
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        throw new IOException("Failed to list contents of " + file);
    }

    private static void j(File file, File file2, boolean z11) {
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileChannel channel = fileInputStream.getChannel();
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            FileChannel channel2 = fileOutputStream.getChannel();
            try {
                long size = channel.size();
                long j11 = 0;
                while (j11 < size) {
                    long j12 = size - j11;
                    long transferFrom = channel2.transferFrom(channel, j11, j12 > 31457280 ? 31457280L : j12);
                    if (transferFrom == 0) {
                        break;
                    }
                    j11 += transferFrom;
                }
                if (channel2 != null) {
                    channel2.close();
                }
                fileOutputStream.close();
                channel.close();
                fileInputStream.close();
                long length = file.length();
                long length2 = file2.length();
                if (length == length2) {
                    if (z11) {
                        file2.setLastModified(file.lastModified());
                        return;
                    }
                    return;
                }
                throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    if (channel2 != null) {
                        try {
                            channel2.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                try {
                    fileInputStream.close();
                } catch (Throwable th7) {
                    th5.addSuppressed(th7);
                }
                throw th6;
            }
        }
    }

    public static void k(File file) {
        if (file.isDirectory()) {
            h(file);
            return;
        }
        boolean exists = file.exists();
        if (file.delete()) {
            return;
        }
        if (!exists) {
            throw new FileNotFoundException("File does not exist: " + file);
        }
        throw new IOException("Unable to delete file: " + file);
    }

    public static boolean l(File file) {
        Objects.requireNonNull(file, "File must not be null");
        return Files.isSymbolicLink(file.toPath());
    }

    private static File[] m(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    return listFiles;
                }
                throw new IOException("Failed to list contents of " + file);
            }
            throw new IllegalArgumentException(file + " is not a directory");
        }
        throw new IllegalArgumentException(file + " does not exist");
    }
}