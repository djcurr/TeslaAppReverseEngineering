package com.facebook.common.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import md.k;

/* loaded from: classes.dex */
public class FileUtils {

    /* loaded from: classes.dex */
    public static class CreateDirectoryException extends IOException {
        public CreateDirectoryException(String str) {
            super(str);
        }

        public CreateDirectoryException(String str, Throwable th2) {
            super(str);
            initCause(th2);
        }
    }

    /* loaded from: classes.dex */
    public static class FileDeleteException extends IOException {
        public FileDeleteException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static class ParentDirNotFoundException extends FileNotFoundException {
        public ParentDirNotFoundException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static class RenameException extends IOException {
        public RenameException(String str, Throwable th2) {
            super(str);
            initCause(th2);
        }
    }

    public static void a(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new CreateDirectoryException(file.getAbsolutePath(), new FileDeleteException(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new CreateDirectoryException(file.getAbsolutePath());
        }
    }

    public static void b(File file, File file2) {
        k.g(file);
        k.g(file2);
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        Throwable th2 = null;
        if (!file2.exists()) {
            if (file.getParentFile().exists()) {
                if (!file.exists()) {
                    th2 = new FileNotFoundException(file.getAbsolutePath());
                }
            } else {
                th2 = new ParentDirNotFoundException(file.getAbsolutePath());
            }
        } else {
            th2 = new FileDeleteException(file2.getAbsolutePath());
        }
        throw new RenameException("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath(), th2);
    }
}