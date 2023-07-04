package expo.modules.imagepicker.tasks;

import a00.c;
import android.content.ContentResolver;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.bridge.BaseJavaModule;
import e00.b;
import expo.modules.core.Promise;
import expo.modules.imagepicker.fileproviders.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.s;
import v20.k;
import v20.o0;
import v20.p;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0013\u0010\u0006\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0006\u0010\u000b\u001a\u00020\tR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lexpo/modules/imagepicker/tasks/VideoResultTask;", "", "", Action.KEY_ATTRIBUTE, "extractMediaMetadata", "Ljava/io/File;", "getFile", "(Lzz/d;)Ljava/lang/Object;", "outputFile", "Lvz/b0;", "saveVideo", "execute", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/core/Promise;", "Landroid/net/Uri;", "uri", "Landroid/net/Uri;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/content/ContentResolver;", "Lexpo/modules/imagepicker/fileproviders/FileProvider;", "fileProvider", "Lexpo/modules/imagepicker/fileproviders/FileProvider;", "Landroid/media/MediaMetadataRetriever;", "mediaMetadataRetriever", "Landroid/media/MediaMetadataRetriever;", "Lv20/o0;", "coroutineScope", "<init>", "(Lexpo/modules/core/Promise;Landroid/net/Uri;Landroid/content/ContentResolver;Lexpo/modules/imagepicker/fileproviders/FileProvider;Landroid/media/MediaMetadataRetriever;Lv20/o0;)V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class VideoResultTask {
    private final ContentResolver contentResolver;
    private final o0 coroutineScope;
    private final FileProvider fileProvider;
    private final MediaMetadataRetriever mediaMetadataRetriever;
    private final Promise promise;
    private final Uri uri;

    public VideoResultTask(Promise promise, Uri uri, ContentResolver contentResolver, FileProvider fileProvider, MediaMetadataRetriever mediaMetadataRetriever, o0 coroutineScope) {
        s.g(promise, "promise");
        s.g(uri, "uri");
        s.g(contentResolver, "contentResolver");
        s.g(fileProvider, "fileProvider");
        s.g(mediaMetadataRetriever, "mediaMetadataRetriever");
        s.g(coroutineScope, "coroutineScope");
        this.promise = promise;
        this.uri = uri;
        this.contentResolver = contentResolver;
        this.fileProvider = fileProvider;
        this.mediaMetadataRetriever = mediaMetadataRetriever;
        this.coroutineScope = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int extractMediaMetadata(int i11) {
        String extractMetadata = this.mediaMetadataRetriever.extractMetadata(i11);
        s.e(extractMetadata);
        s.f(extractMetadata, "mediaMetadataRetriever.extractMetadata(key)!!");
        return Integer.parseInt(extractMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getFile(d<? super File> dVar) {
        d c11;
        Object d11;
        c11 = c.c(dVar);
        p pVar = new p(c11, 1);
        pVar.y();
        try {
            File generateFile = this.fileProvider.generateFile();
            saveVideo(generateFile);
            q.a aVar = q.f54772b;
            pVar.resumeWith(q.b(generateFile));
        } catch (Exception e11) {
            q.a aVar2 = q.f54772b;
            pVar.resumeWith(q.b(r.a(e11)));
        }
        Object s11 = pVar.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            h.c(dVar);
        }
        return s11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveVideo(File file) {
        InputStream openInputStream = this.contentResolver.openInputStream(this.uri);
        if (openInputStream == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    b0 b0Var = b0.f54756a;
                    b.a(fileOutputStream, null);
                    b.a(openInputStream, null);
                    return;
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b.a(openInputStream, th2);
                throw th3;
            }
        }
    }

    public final void execute() {
        k.d(this.coroutineScope, null, null, new VideoResultTask$execute$1(this, null), 3, null);
    }
}