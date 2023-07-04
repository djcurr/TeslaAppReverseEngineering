package expo.modules.imagepicker.tasks;

import a00.c;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import androidx.exifinterface.media.a;
import com.facebook.react.bridge.BaseJavaModule;
import e00.b;
import expo.modules.core.Promise;
import expo.modules.imagepicker.ExifDataHandler;
import expo.modules.imagepicker.ImagePickerConstants;
import expo.modules.imagepicker.exporters.ImageExporter;
import expo.modules.imagepicker.fileproviders.FileProvider;
import java.io.File;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0013\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lexpo/modules/imagepicker/tasks/ImageResultTask;", "", "Ljava/io/File;", "getFile", "(Lzz/d;)Ljava/lang/Object;", "Landroid/os/Bundle;", "getExifData", "readExif", "Lvz/b0;", "execute", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lexpo/modules/core/Promise;", "Landroid/net/Uri;", "uri", "Landroid/net/Uri;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/content/ContentResolver;", "Lexpo/modules/imagepicker/fileproviders/FileProvider;", "fileProvider", "Lexpo/modules/imagepicker/fileproviders/FileProvider;", "", "isEdited", "Z", "withExifData", "Lexpo/modules/imagepicker/exporters/ImageExporter;", "imageExporter", "Lexpo/modules/imagepicker/exporters/ImageExporter;", "Lexpo/modules/imagepicker/ExifDataHandler;", "exifDataHandler", "Lexpo/modules/imagepicker/ExifDataHandler;", "Lv20/o0;", "coroutineScope", "<init>", "(Lexpo/modules/core/Promise;Landroid/net/Uri;Landroid/content/ContentResolver;Lexpo/modules/imagepicker/fileproviders/FileProvider;ZZLexpo/modules/imagepicker/exporters/ImageExporter;Lexpo/modules/imagepicker/ExifDataHandler;Lv20/o0;)V", "expo-image-picker_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public class ImageResultTask {
    private final ContentResolver contentResolver;
    private final o0 coroutineScope;
    private ExifDataHandler exifDataHandler;
    private final FileProvider fileProvider;
    private final ImageExporter imageExporter;
    private final boolean isEdited;
    private final Promise promise;
    private final Uri uri;
    private final boolean withExifData;

    public ImageResultTask(Promise promise, Uri uri, ContentResolver contentResolver, FileProvider fileProvider, boolean z11, boolean z12, ImageExporter imageExporter, ExifDataHandler exifDataHandler, o0 coroutineScope) {
        s.g(promise, "promise");
        s.g(uri, "uri");
        s.g(contentResolver, "contentResolver");
        s.g(fileProvider, "fileProvider");
        s.g(imageExporter, "imageExporter");
        s.g(coroutineScope, "coroutineScope");
        this.promise = promise;
        this.uri = uri;
        this.contentResolver = contentResolver;
        this.fileProvider = fileProvider;
        this.isEdited = z11;
        this.withExifData = z12;
        this.imageExporter = imageExporter;
        this.exifDataHandler = exifDataHandler;
        this.coroutineScope = coroutineScope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getExifData(d<? super Bundle> dVar) {
        d c11;
        Object d11;
        c11 = c.c(dVar);
        p pVar = new p(c11, 1);
        pVar.y();
        try {
            Bundle readExif = this.withExifData ? readExif() : null;
            q.a aVar = q.f54772b;
            pVar.resumeWith(q.b(readExif));
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
    public final Object getFile(d<? super File> dVar) {
        d c11;
        Object d11;
        c11 = c.c(dVar);
        p pVar = new p(c11, 1);
        pVar.y();
        try {
            File generateFile = this.fileProvider.generateFile();
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
    public final Bundle readExif() {
        Bundle bundle = new Bundle();
        InputStream openInputStream = this.contentResolver.openInputStream(this.uri);
        if (openInputStream != null) {
            try {
                a aVar = new a(openInputStream);
                String[][] exifTags = ImagePickerConstants.INSTANCE.getExifTags();
                int length = exifTags.length;
                int i11 = 0;
                while (i11 < length) {
                    String[] strArr = exifTags[i11];
                    i11++;
                    String str = strArr[0];
                    String str2 = strArr[1];
                    if (aVar.g(str2) != null) {
                        int hashCode = str.hashCode();
                        if (hashCode != -1325958191) {
                            if (hashCode != -891985903) {
                                if (hashCode == 104431 && str.equals("int")) {
                                    bundle.putInt(str2, aVar.i(str2, 0));
                                }
                            } else if (str.equals("string")) {
                                bundle.putString(str2, aVar.g(str2));
                            }
                        } else if (str.equals("double")) {
                            bundle.putDouble(str2, aVar.h(str2, 0.0d));
                        }
                    }
                }
                double[] m11 = aVar.m();
                if (m11 != null) {
                    bundle.putDouble("GPSLatitude", m11[0]);
                    bundle.putDouble("GPSLongitude", m11[1]);
                    bundle.putDouble("GPSAltitude", aVar.f(0.0d));
                }
                b0 b0Var = b0.f54756a;
                b.a(openInputStream, null);
            } finally {
            }
        }
        return bundle;
    }

    public final void execute() {
        k.d(this.coroutineScope, null, null, new ImageResultTask$execute$1(this, null), 3, null);
    }
}