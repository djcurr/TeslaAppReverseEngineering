package expo.modules.imagepicker.tasks;

import h00.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "expo.modules.imagepicker.tasks.ImageResultTask$execute$1", f = "ImageResultTask.kt", l = {66, 70}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lv20/o0;", "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ImageResultTask$execute$1 extends l implements p<o0, d<? super b0>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ImageResultTask this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageResultTask$execute$1(ImageResultTask imageResultTask, d<? super ImageResultTask$execute$1> dVar) {
        super(2, dVar);
        this.this$0 = imageResultTask;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new ImageResultTask$execute$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((ImageResultTask$execute$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
        r1 = r6.this$0.exifDataHandler;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = a00.b.d()
            int r1 = r6.label
            java.lang.String r2 = "ExponentImagePicker"
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r0 = r6.L$0
            java.io.File r0 = (java.io.File) r0
            vz.r.b(r7)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            goto L73
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            vz.r.b(r7)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            goto L3a
        L24:
            r7 = move-exception
            goto L8c
        L26:
            r7 = move-exception
            goto L9b
        L29:
            r7 = move-exception
            goto La9
        L2c:
            vz.r.b(r7)
            expo.modules.imagepicker.tasks.ImageResultTask r7 = r6.this$0     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            r6.label = r4     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            java.lang.Object r7 = expo.modules.imagepicker.tasks.ImageResultTask.access$getFile(r7, r6)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            if (r7 != r0) goto L3a
            return r0
        L3a:
            java.io.File r7 = (java.io.File) r7     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            expo.modules.imagepicker.tasks.ImageResultTask r1 = r6.this$0     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            boolean r1 = expo.modules.imagepicker.tasks.ImageResultTask.access$isEdited$p(r1)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            if (r1 == 0) goto L64
            expo.modules.imagepicker.tasks.ImageResultTask r1 = r6.this$0     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            boolean r1 = expo.modules.imagepicker.tasks.ImageResultTask.access$getWithExifData$p(r1)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            if (r1 == 0) goto L64
            expo.modules.imagepicker.tasks.ImageResultTask r1 = r6.this$0     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            expo.modules.imagepicker.ExifDataHandler r1 = expo.modules.imagepicker.tasks.ImageResultTask.access$getExifDataHandler$p(r1)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            if (r1 != 0) goto L55
            goto L64
        L55:
            expo.modules.imagepicker.tasks.ImageResultTask r4 = r6.this$0     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            android.net.Uri r4 = expo.modules.imagepicker.tasks.ImageResultTask.access$getUri$p(r4)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            expo.modules.imagepicker.tasks.ImageResultTask r5 = r6.this$0     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            android.content.ContentResolver r5 = expo.modules.imagepicker.tasks.ImageResultTask.access$getContentResolver$p(r5)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            r1.copyExifData(r4, r5)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
        L64:
            expo.modules.imagepicker.tasks.ImageResultTask r1 = r6.this$0     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            r6.L$0 = r7     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            r6.label = r3     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            java.lang.Object r1 = expo.modules.imagepicker.tasks.ImageResultTask.access$getExifData(r1, r6)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            if (r1 != r0) goto L71
            return r0
        L71:
            r0 = r7
            r7 = r1
        L73:
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            expo.modules.imagepicker.tasks.ImageResultTask$execute$1$imageExporterHandler$1 r1 = new expo.modules.imagepicker.tasks.ImageResultTask$execute$1$imageExporterHandler$1     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            expo.modules.imagepicker.tasks.ImageResultTask r3 = r6.this$0     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            r1.<init>()     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            expo.modules.imagepicker.tasks.ImageResultTask r7 = r6.this$0     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            expo.modules.imagepicker.exporters.ImageExporter r7 = expo.modules.imagepicker.tasks.ImageResultTask.access$getImageExporter$p(r7)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            expo.modules.imagepicker.tasks.ImageResultTask r3 = r6.this$0     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            android.net.Uri r3 = expo.modules.imagepicker.tasks.ImageResultTask.access$getUri$p(r3)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            r7.export(r3, r0, r1)     // Catch: java.lang.Exception -> L24 java.io.IOException -> L26 expo.modules.core.errors.ModuleDestroyedException -> L29
            goto Lb7
        L8c:
            java.lang.String r0 = "Unknown exception."
            android.util.Log.e(r2, r0, r7)
            expo.modules.imagepicker.tasks.ImageResultTask r1 = r6.this$0
            expo.modules.core.Promise r1 = expo.modules.imagepicker.tasks.ImageResultTask.access$getPromise$p(r1)
            r1.reject(r0, r7)
            goto Lb7
        L9b:
            expo.modules.imagepicker.tasks.ImageResultTask r0 = r6.this$0
            expo.modules.core.Promise r0 = expo.modules.imagepicker.tasks.ImageResultTask.access$getPromise$p(r0)
            java.lang.String r1 = "ERR_CAN_NOT_EXTRACT_METADATA"
            java.lang.String r2 = "Can not extract metadata."
            r0.reject(r1, r2, r7)
            goto Lb7
        La9:
            java.lang.String r0 = "Coroutine canceled by module destruction."
            android.util.Log.i(r2, r0, r7)
            expo.modules.imagepicker.tasks.ImageResultTask r1 = r6.this$0
            expo.modules.core.Promise r1 = expo.modules.imagepicker.tasks.ImageResultTask.access$getPromise$p(r1)
            r1.reject(r0, r7)
        Lb7:
            vz.b0 r7 = vz.b0.f54756a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.imagepicker.tasks.ImageResultTask$execute$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}