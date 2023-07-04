package expo.modules.filesystem;

import kotlin.Metadata;

@FunctionalInterface
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lexpo/modules/filesystem/CountingRequestListener;", "", "", "bytesWritten", "contentLength", "Lvz/b0;", "onProgress", "expo-file-system_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public interface CountingRequestListener {
    void onProgress(long j11, long j12);
}