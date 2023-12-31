package ch.qos.logback.core.rolling.helper;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class FileFinder {
    private static final String REGEX_MARKER_END = "(?:\uffff)?";
    private static final String REGEX_MARKER_START = "(?:\ufffe)?";
    private FileProvider fileProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileFinder(FileProvider fileProvider) {
        this.fileProvider = fileProvider;
    }

    private void findDirs(List<File> list, List<PathPart> list2, int i11, List<File> list3) {
        if (i11 >= list2.size() - 1) {
            return;
        }
        PathPart pathPart = list2.get(i11);
        for (File file : list) {
            if (this.fileProvider.isDirectory(file) && pathPart.matches(file)) {
                list3.add(file);
                findDirs(Arrays.asList(this.fileProvider.listFiles(file, null)), list2, i11 + 1, list3);
            }
        }
    }

    private List<File> findFiles(List<File> list, List<PathPart> list2, int i11) {
        ArrayList arrayList = new ArrayList();
        PathPart pathPart = list2.get(i11);
        int size = list2.size() - 1;
        Iterator<File> it2 = list.iterator();
        if (i11 >= size) {
            while (it2.hasNext()) {
                File next = it2.next();
                if (pathPart.matches(next)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        while (it2.hasNext()) {
            File next2 = it2.next();
            if (this.fileProvider.isDirectory(next2) && pathPart.matches(next2)) {
                arrayList.addAll(findFiles(Arrays.asList(this.fileProvider.listFiles(next2, null)), list2, i11 + 1));
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String regexEscapePath(String str) {
        String str2 = File.separator;
        if (!str.contains(str2)) {
            return REGEX_MARKER_START + str + REGEX_MARKER_END;
        }
        String[] split = str.split(str2);
        for (int i11 = 0; i11 < split.length; i11++) {
            if (split[i11].length() > 0) {
                split[i11] = REGEX_MARKER_START + split[i11] + REGEX_MARKER_END;
            }
        }
        return TextUtils.join(File.separator, split);
    }

    private List<String> toAbsolutePaths(List<File> list) {
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            arrayList.add(file.getAbsolutePath());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String unescapePath(String str) {
        return str.replace(REGEX_MARKER_START, "").replace(REGEX_MARKER_END, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> findDirs(String str) {
        List<PathPart> splitPath = splitPath(str);
        ArrayList arrayList = new ArrayList();
        findDirs(splitPath.get(0).listFiles(this.fileProvider), splitPath, 1, arrayList);
        return toAbsolutePaths(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<String> findFiles(String str) {
        List<PathPart> splitPath = splitPath(str);
        return toAbsolutePaths(findFiles(splitPath.get(0).listFiles(this.fileProvider), splitPath, 1));
    }

    List<PathPart> splitPath(String str) {
        String[] split;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split(File.separator)) {
            boolean z11 = str2.contains(REGEX_MARKER_START) && str2.contains(REGEX_MARKER_END);
            String replace = str2.replace(REGEX_MARKER_START, "").replace(REGEX_MARKER_END, "");
            if (z11) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new LiteralPathPart(TextUtils.join(File.separator, arrayList2)));
                    arrayList2.clear();
                }
                arrayList.add(new RegexPathPart(replace));
            } else {
                arrayList2.add(replace);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new LiteralPathPart(TextUtils.join(File.separator, arrayList2)));
        }
        return arrayList;
    }
}